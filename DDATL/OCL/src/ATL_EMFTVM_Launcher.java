/********************************************************************************
 * Copyright (c) 2017 Universidad de Sevilla.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * Javier Troya (Universidad de Sevilla, Spain) - implementation
 * Code adapted from:
 *
 * An off-the-shelf launcher for ATL/EMFTVM transformations
 * @author Victor Guana - guana@ualberta.ca
 * University of Alberta - SSRG Lab.
 * Edmonton, Alberta. Canada
 * Using code examples from: https://wiki.eclipse.org/ATL/EMFTVM
 *******************************************************************************/


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.BasicExtendedMetaData;
import org.eclipse.emf.ecore.util.ExtendedMetaData;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.m2m.atl.core.ATLCoreException;
import org.eclipse.m2m.atl.core.IExtractor;
import org.eclipse.m2m.atl.core.IInjector;
import org.eclipse.m2m.atl.core.IModel;
import org.eclipse.m2m.atl.core.IReferenceModel;
import org.eclipse.m2m.atl.core.ModelFactory;
import org.eclipse.m2m.atl.core.emf.EMFExtractor;
import org.eclipse.m2m.atl.core.emf.EMFInjector;
import org.eclipse.m2m.atl.core.emf.EMFModel;
import org.eclipse.m2m.atl.core.emf.EMFModelFactory;
import org.eclipse.m2m.atl.core.emf.EMFReferenceModel;
import org.eclipse.m2m.atl.core.launch.ILauncher;
import org.eclipse.m2m.atl.emftvm.EmftvmFactory;
import org.eclipse.m2m.atl.emftvm.ExecEnv;
import org.eclipse.m2m.atl.emftvm.Metamodel;
import org.eclipse.m2m.atl.emftvm.Model;
import org.eclipse.m2m.atl.emftvm.impl.resource.EMFTVMResourceFactoryImpl;
import org.eclipse.m2m.atl.emftvm.util.DefaultModuleResolver;
import org.eclipse.m2m.atl.emftvm.util.ModuleResolver;
import org.eclipse.m2m.atl.emftvm.util.TimingData;
import org.eclipse.m2m.atl.engine.emfvm.launch.EMFVMLauncher;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceFactoryImpl;

import ATL.ATLPackage;
import ATL.impl.ATLFactoryImpl;

/**
 * @author jtroya.
 * Code adapted from:
 *
 * An off-the-shelf launcher for ATL/EMFTVM transformations
 * @author Victor Guana - guana@ualberta.ca
 * University of Alberta - SSRG Lab.
 * Edmonton, Alberta. Canada
 * Using code examples from: https://wiki.eclipse.org/ATL/EMFTVM
 * 使用以下代码示例：https://wiki.eclipse.org/ATL/EMFTVM
 */

public class ATL_EMFTVM_Launcher {

	// The input and output metamodel nsURIs are resolved using lazy registration of metamodels, see below.
	//We use a List, instead of just a String, to consider the case with multiple inputs/outputs
	//输入和输出元模型nsURI使用元模型的惰性注册进行解析，请参见下文。
	//我们使用List而不是String来考虑具有多个输入/输出的情况
	private static List<String> inputMetamodelNsURIs = new ArrayList<String>();
	private static List<String> outputMetamodelNsURIs = new ArrayList<String>();

	private static List<String> inputMetamodelNsURIsGeneral = new ArrayList<String>();
	private static List<String> outputMetamodelNsURIsGeneral = new ArrayList<String>();

	//We have created the two global variables below because, otherwise, the different calls to this method combine variables


	//This is the general transformation that accepts several source/target models/metamodels
	//我们创建了下面的两个全局变量，因为否则，对该方法的不同调用会组合变量


	//这是接受多个源/目标模型/元模型的一般转换
	public static void executeATLTransformation(String executionsCanPath, List<String> IN_MM_PATHS, List<String> OUT_MM_PATHS, //The paths after the executionsCanPath
												List<String> IN_MM_NAMES_TRAFO, List<String> OUT_MM_NAMES_TRAFO, //Names in the trafo
												List<String> IN_MODEL_NAMES_TRAFO, List<String> OUT_MODEL_NAMES_TRAFO, //Names in the trafo
												List<String> IN_MODEL_PATHS, List<String> OUT_MODEL_PATHS, //Names in the file
												String transformationDir, //Directory where the transformation is
												String transformationModule //Module name of the transformation
	){

		//We register the source metamodels of the transformation
		for (String str : IN_MM_PATHS)
			registerInputMetamodelGeneral(executionsCanPath + "/" + str);
		//We register the target metamodels of the transformation
		for (String str : OUT_MM_PATHS)
			registerOutputMetamodelGeneral(executionsCanPath + "/" + str);


		launch(executionsCanPath,IN_MM_PATHS, OUT_MM_PATHS, IN_MM_NAMES_TRAFO,OUT_MM_NAMES_TRAFO,IN_MODEL_NAMES_TRAFO,OUT_MODEL_NAMES_TRAFO,IN_MODEL_PATHS,OUT_MODEL_PATHS,transformationDir,transformationModule);
	}

	//Main transformation launch method
	//主要转换启动方式
	public static void launch(String executionsCanPath,
							  List<String> IN_MM_PATHS, List<String> OUT_MM_PATHS, //Paths of sources/targets MMs  源/目标MMs的路径
							  List<String> IN_MM_NAMES_TRAFO, List<String> OUT_MM_NAMES_TRAFO, //Names in the trafo
							  List<String> IN_MODEL_NAMES_TRAFO, List<String> OUT_MODEL_NAMES_TRAFO, //Names in the trafo
							  List<String> IN_MODEL_PATHS, List<String> OUT_MODEL_PATHS, //Names in the file
							  String transformationDir, //Directory where the transformation is
							  String transformationModule //Module name of the transformation
	){

		/*
		 * From Victor Guana: Creates the execution environment where the transformation is going to be executed,
		 * you could use an execution pool if you want to run multiple transformations in parallel,
		 * but for the purpose of the example let's keep it simple.
		 * *来自Victor Guana：创建将要执行转换的执行环境，
		 * 如果要并行运行多个转换，可以使用执行池，
		 * 但为了示例的目的，让我们保持简单。
		 */
		ExecEnv env = EmftvmFactory.eINSTANCE.createExecEnv();
		ResourceSet rs = new ResourceSetImpl();

		/*
		 * From Victor Guana: Load meta-models in the resource set we just created, the idea here is to make the meta-models
		 * available in the context of the execution environment, the ResourceSet is later passed to the
		 * ModuleResolver that is the actual class that will run the transformation.
		 * Notice that we use the nsUris to locate the metamodels in the package registry, we initialize them
		 * from Ecore files that we registered lazily as shown below in e.g. registerInputMetamodel(...)
		 * Extension by jtroya: we are considering Lists instead of just names, to consider the case
		 * where we have several source/target models in the transformation
		 * *Victor Guana：在我们刚刚创建的资源集中加载元模型，这里的想法是创建元模型
		 *在执行环境的上下文中可用，ResourceSet随后被传递给
		 *ModuleResolver，它是将运行转换的实际类。
		 *请注意，我们使用nsUri在包注册表中定位元模型，然后对其进行初始化
		 *从我们延迟注册的Ecore文件，如下面的registerInputMetamodel（…）中所示
		 *jtroya扩展：为了考虑这个案例，我们正在考虑Lists而不仅仅是名字
		 *其中，我们在转换中有几个源/目标模型
		 */
		List<Metamodel> inMetamodels = new ArrayList<Metamodel>();
		int i = 0;
		System.out.println("METAMODENSURIS: " + inputMetamodelNsURIsGeneral);
		for (String metamodelURI : inputMetamodelNsURIsGeneral){
			Metamodel inMetamodel = EmftvmFactory.eINSTANCE.createMetamodel();
			inMetamodel.setResource(rs.getResource(URI.createURI(metamodelURI), true));
			env.registerMetaModel(IN_MM_NAMES_TRAFO.get(i), inMetamodel);
			i++;
		}
		i = 0;
		for (String metamodelURI : outputMetamodelNsURIsGeneral){
			Metamodel outMetamodel = EmftvmFactory.eINSTANCE.createMetamodel();
			outMetamodel.setResource(rs.getResource(URI.createURI(metamodelURI), true));
			env.registerMetaModel(OUT_MM_NAMES_TRAFO.get(i), outMetamodel);
			i++;
		}

		/*
		 * From Victor Guana: Create and register resource factories to read/parse .xmi and .emftvm files,
		 * we need an .xmi parser because our in/output models are .xmi and our transformations are
		 * compiled using the ATL-EMFTV compiler that generates .emftvm files
		 * *来自Victor Guana：创建并注册资源工厂以读取/解析.xmi和.emftvm文件，
		 *我们需要一个.xmi解析器，因为我们的输入/输出模型是.xmli，我们的转换是
		 *使用生成.emftvm文件的ATL-EMFTV编译器编译
		 */
		rs.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
		rs.getResourceFactoryRegistry().getExtensionToFactoryMap().put("emftvm", new EMFTVMResourceFactoryImpl());

		i = 0;
		for (String modelPath : IN_MODEL_PATHS){
			Model inModel = EmftvmFactory.eINSTANCE.createModel();
			inModel.setResource(rs.getResource(URI.createURI(executionsCanPath + "/" + modelPath, true), true));
			env.registerInputModel(IN_MODEL_NAMES_TRAFO.get(i), inModel);
			i++;
		}

		i = 0;
		//For the outModels, we keep them in a list in order to save them at the end
		/*The commented code below would be it if we got as input the path of the models.
		 * However, we are running a loop where we want to execute several transformations
		 * //对于outModels，我们将它们保存在列表中，以便在最后保存它们
		/*如果我们输入模型的路径，下面的注释代码就是它。
		*然而，我们正在运行一个循环，在这个循环中我们要执行几个转换
		 */
		List<Model> outModels = new ArrayList<Model>();
		for (String modelPath : OUT_MODEL_PATHS){
			Model outModel = EmftvmFactory.eINSTANCE.createModel();
			outModel.setResource(rs.createResource(URI.createURI(executionsCanPath + "/" + modelPath)));
			env.registerInputModel(OUT_MODEL_NAMES_TRAFO.get(i), outModel);
			outModels.add(outModel);
			i++;
		}


		/*
		 *  Load and run the transformation module
		 *  Point at the directory your transformations are stored, the ModuleResolver will
		 *  look for the .emftvm file corresponding to the module you want to load and run
		 *  *加载并运行转换模块
		 *指向存储转换的目录，ModuleResolver将
		 *查找与要加载和运行的模块对应的.emftvm文件
		 */
		ModuleResolver mr = new DefaultModuleResolver(transformationDir, rs);
		TimingData td = new TimingData();
		//env.loadModule(mr, TRANSFORMATION_MODULE);
		env.loadModule(mr, transformationModule);
		td.finishLoading();
		env.run(td);
		td.finish();

		// Save models
		//Like this would be with several output models
		for(Model outModel : outModels){
			try {
				outModel.getResource().save(Collections.emptyMap());
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}


	public static void executeATLTransformationSeveralTimes(String executionsCanPath, List<String> IN_MM_PATHS, List<String> OUT_MM_PATHS, //The paths after the executionsCanPath
															List<String> IN_MM_NAMES_TRAFO, List<String> OUT_MM_NAMES_TRAFO, //Names in the trafo
															List<String> IN_MODEL_NAMES_TRAFO, List<String> OUT_MODEL_NAMES_TRAFO, //Names in the trafo
															List<String> IN_MODEL_PATHS, List<String> OUT_MODEL_PATHS, //Names in the file
															String transformationDir, //Directory where the transformation is
															String transformationModule, //Module name of the transformation
															int numExecutions
	){

		//We register the source metamodels of the transformation
		for (String str : IN_MM_PATHS)
			registerInputMetamodel(executionsCanPath + "/" + str);
		//We register the target metamodels of the transformation
		for (String str : OUT_MM_PATHS)
			registerOutputMetamodel(executionsCanPath + "/" + str);


		launchSeveralTimes(executionsCanPath,IN_MM_PATHS, OUT_MM_PATHS, IN_MM_NAMES_TRAFO,OUT_MM_NAMES_TRAFO,IN_MODEL_NAMES_TRAFO,OUT_MODEL_NAMES_TRAFO,IN_MODEL_PATHS,OUT_MODEL_PATHS,transformationDir,transformationModule,numExecutions);
	}

	//Main transformation launch method
	public static void launchSeveralTimes(String executionsCanPath,
										  List<String> IN_MM_PATHS, List<String> OUT_MM_PATHS, //Paths of sources/targets MMs
										  List<String> IN_MM_NAMES_TRAFO, List<String> OUT_MM_NAMES_TRAFO, //Names in the trafo
										  List<String> IN_MODEL_NAMES_TRAFO, List<String> OUT_MODEL_NAMES_TRAFO, //Names in the trafo
										  List<String> IN_MODEL_PATHS, List<String> OUT_MODEL_PATHS, //Names in the file
										  String transformationDir, //Directory where the transformation is
										  String transformationModule, //Module name of the transformation
										  int numExecutions){

		/*
		 * From Victor Guana: Creates the execution environment where the transformation is going to be executed,
		 * you could use an execution pool if you want to run multiple transformations in parallel,
		 * but for the purpose of the example let's keep it simple.
		 * *来自Victor Guana：创建将要执行转换的执行环境，
		 *如果要并行运行多个转换，可以使用执行池，
		 *但为了示例的目的，让我们保持简单。
		 */
		ExecEnv env = EmftvmFactory.eINSTANCE.createExecEnv();
		ResourceSet rs = new ResourceSetImpl();

		/*
		 * From Victor Guana: Load meta-models in the resource set we just created, the idea here is to make the meta-models
		 * available in the context of the execution environment, the ResourceSet is later passed to the
		 * ModuleResolver that is the actual class that will run the transformation.
		 * Notice that we use the nsUris to locate the metamodels in the package registry, we initialize them
		 * from Ecore files that we registered lazily as shown below in e.g. registerInputMetamodel(...)
		 * Extension by jtroya: we are considering Lists instead of just names, to consider the case
		 * where we have several source/target models in the transformation
		 * *Victor Guana：在我们刚刚创建的资源集中加载元模型，这里的想法是创建元模型
		 *在执行环境的上下文中可用，ResourceSet随后被传递给
		 *ModuleResolver，它是将运行转换的实际类。
		 *请注意，我们使用nsUri在包注册表中定位元模型，然后对其进行初始化
		 *从我们延迟注册的Ecore文件，如下面的registerInputMetamodel（…）中所示
		 *jtroya扩展：为了考虑这个案例，我们正在考虑Lists而不仅仅是名字
		 *其中，我们在转换中有几个源/目标模型
		 */
		List<Metamodel> inMetamodels = new ArrayList<Metamodel>();
		int i = 0;
		for (String metamodelURI : inputMetamodelNsURIs){
			Metamodel inMetamodel = EmftvmFactory.eINSTANCE.createMetamodel();
			inMetamodel.setResource(rs.getResource(URI.createURI(metamodelURI), true));
			env.registerMetaModel(IN_MM_NAMES_TRAFO.get(i), inMetamodel);
			i++;
		}
		i = 0;
		for (String metamodelURI : outputMetamodelNsURIs){
			Metamodel outMetamodel = EmftvmFactory.eINSTANCE.createMetamodel();
			outMetamodel.setResource(rs.getResource(URI.createURI(metamodelURI), true));
			env.registerMetaModel(OUT_MM_NAMES_TRAFO.get(i), outMetamodel);
			i++;
		}

		/*
		 * From Victor Guana: Create and register resource factories to read/parse .xmi and .emftvm files,
		 * we need an .xmi parser because our in/output models are .xmi and our transformations are
		 * compiled using the ATL-EMFTV compiler that generates .emftvm files
		 * *来自Victor Guana：创建并注册资源工厂以读取/解析.xmi和.emftvm文件，
		 *我们需要一个.xmi解析器，因为我们的输入/输出模型是.xmli，我们的转换是
		 *使用生成.emftvm文件的ATL-EMFTV编译器编译
		 */
		rs.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
		rs.getResourceFactoryRegistry().getExtensionToFactoryMap().put("emftvm", new EMFTVMResourceFactoryImpl());


		for (int j=1; j<=numExecutions; j++){
			/* Load models
			 * Extension by jtroya: we are considering Lists instead of just names, to consider the case
			 * where we have several source/target models in the transformation
			 */
			/*The commented code below would be it if we got as input the path of the models.
			 * However, we are running a loop where we want to execute several transformations
			 * /*负载模型
			 *jtroya扩展：为了考虑这个案例，我们正在考虑Lists而不仅仅是名字
			 *其中，我们在转换中有几个源/目标模型
			 */
			/*如果我们输入模型的路径，下面的注释代码就是它。
			 *然而，我们正在运行一个循环，在这个循环中我们要执行几个转换
			 */
//			i = 0;
//			for (String modelPath : IN_MODEL_PATHS){
//				Model inModel = EmftvmFactory.eINSTANCE.createModel();
//				inModel.setResource(rs.getResource(URI.createURI(executionsCanPath + "/" + modelPath, true), true));
//				env.registerInputModel(IN_MODEL_NAMES_TRAFO.get(i), inModel);
//				i++;
//			}
			Model inModel1 = EmftvmFactory.eINSTANCE.createModel();
			inModel1.setResource(rs.getResource(URI.createURI(executionsCanPath + "/scenarios/scenario" + j + "/AutomaticModel_" + IN_MM_PATHS.get(0).substring(0, IN_MM_PATHS.get(0).length()-6) + j + ".xmi", true), true));
			env.registerInputModel(IN_MODEL_NAMES_TRAFO.get(0), inModel1);
			Model inModel2 = EmftvmFactory.eINSTANCE.createModel();
			inModel2.setResource(rs.getResource(URI.createURI(executionsCanPath + "/scenarios/scenario" + j + "/" + IN_MM_PATHS.get(1).substring(0, IN_MM_PATHS.get(1).length()-6) + "_out" + j + ".xmi", true), true));
			env.registerInputModel(IN_MODEL_NAMES_TRAFO.get(1), inModel2);

			i = 0;
			//For the outModels, we keep them in a list in order to save them at the end
			/*The commented code below would be it if we got as input the path of the models.
			 * However, we are running a loop where we want to execute several transformations
			 */
//			List<Model> outModels = new ArrayList<Model>();
//			for (String modelPath : OUT_MODEL_PATHS){
//				Model outModel = EmftvmFactory.eINSTANCE.createModel();
//				outModel.setResource(rs.createResource(URI.createURI(executionsCanPath + "/" + modelPath)));
//				env.registerInputModel(OUT_MODEL_NAMES_TRAFO.get(i), outModel);
//				outModels.add(outModel);
//				i++;
//			}
			Model outModel = EmftvmFactory.eINSTANCE.createModel();
			outModel.setResource(rs.createResource(URI.createURI(executionsCanPath + "/scenarios/scenario" + j + "/" + "JointModel" + j + ".xmi")));
			env.registerOutputModel(OUT_MODEL_NAMES_TRAFO.get(0), outModel);


			/*
			 *  Load and run the transformation module
			 *  Point at the directory your transformations are stored, the ModuleResolver will
			 *  look for the .emftvm file corresponding to the module you want to load and run
			 */
			ModuleResolver mr = new DefaultModuleResolver(transformationDir, rs);
			TimingData td = new TimingData();
			//env.loadModule(mr, TRANSFORMATION_MODULE);
			env.loadModule(mr, transformationModule);
			td.finishLoading();
			env.run(td);
			td.finish();

			// Save models
			//Like this would be with several output models
//			for(Model outModel : outModels){
//				try {
//					outModel.getResource().save(Collections.emptyMap());
//				} catch (IOException e) {
//					e.printStackTrace();
//				}
//			}
			try {
				outModel.getResource().save(Collections.emptyMap());
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	/*
	 * From Victor Guana: I seriously hate relying on the eclipse facilities, and if you're not building an eclipse plugin
	 * you can't rely on eclipse's registry (let's say you're building a stand-alone tool that needs to run ATL
	 * transformation, you need to 'manually' register your metamodels)
	 * This method does two things, it initializes an Ecore parser and then programmatically looks for
	 * the package definition on it, obtains the NsUri and registers it.
	 * *维克托·瓜纳（Victor Guana）：我非常讨厌依赖eclipse工具，如果你不构建eclipse-插件的话
	 *您不能依赖eclipse的注册表（假设您正在构建一个需要运行ATL的独立工具
	 *转换，您需要“手动”注册元模型）
	 *这个方法做两件事，它初始化Ecore解析器，然后以编程方式查找
	 *获取NsUri并注册它
	 */
	private static String lazyMetamodelRegistration(String metamodelPath){

		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("ecore", new EcoreResourceFactoryImpl());

		ResourceSet rs = new ResourceSetImpl();
		// Enables extended meta-data, weird we have to do this but well...
		final ExtendedMetaData extendedMetaData = new BasicExtendedMetaData(EPackage.Registry.INSTANCE);
		rs.getLoadOptions().put(XMLResource.OPTION_EXTENDED_META_DATA, extendedMetaData);

		Resource r = rs.getResource(URI.createFileURI(metamodelPath), true);
		EObject eObject = r.getContents().get(0);
		// A meta-model might have multiple packages we assume the main package is the first one listed
		if (eObject instanceof EPackage) {
			EPackage p = (EPackage)eObject;
			System.out.println(p.getNsURI());
			EPackage.Registry.INSTANCE.put(p.getNsURI(), p);
			return p.getNsURI();
		}
		return null;
	}

	/*
	 * From Victor Guana: As shown above we need the inputMetamodelNsURI and the outputMetamodelNsURI to create the context of
	 * the transformation, so we simply use the return value of lazyMetamodelRegistration to store them.
	 * -- Notice that the lazyMetamodelRegistration(..) implementation may return null in case it doesn't
	 * find a package in the given metamodel, so watch out for malformed metamodels.
	 * *来自Victor Guana：如上所示，我们需要inputMetamodelNsURI和outputMetamaodelNs URI来创建
	 *转换，所以我们只需使用lazyMetamodelRegistration的返回值来存储它们。
	 *--请注意，如果lazyMetamodelRegistration（..）实现没有返回null
	 *在给定的元模型中找到一个包，因此要注意格式错误的元模型。
	 */
	public static void registerInputMetamodel(String inputMetamodelPath){
		inputMetamodelNsURIs.add(lazyMetamodelRegistration(inputMetamodelPath));
	}

	public static void registerOutputMetamodel(String outputMetamodelPath){
		outputMetamodelNsURIs.add(lazyMetamodelRegistration(outputMetamodelPath));
	}

	public static void registerInputMetamodelGeneral(String inputMetamodelPath){
		inputMetamodelNsURIsGeneral.add(lazyMetamodelRegistration(inputMetamodelPath));
		//inputMetamodelNsURIsGeneral.add(lazyMetamodelRegistration("http://www.eclipse.org/gmt/2005/ATL"));
	}

	public static void registerOutputMetamodelGeneral(String outputMetamodelPath){
		outputMetamodelNsURIsGeneral.add(lazyMetamodelRegistration(outputMetamodelPath));
		//outputMetamodelNsURIsGeneral.add(lazyMetamodelRegistration("http://www.eclipse.org/gmt/2005/ATL"));
	}

}

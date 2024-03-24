import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import jointPackage_CPL2SPL.JointPackage_CPL2SPLPackage;
import jointPackage_Ecore2Maude.JointPackage_Ecore2MaudePackage;
import jointPackage_UML2ER.JointPackage_UML2ERPackage;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import org.eclipse.m2m.atl.core.ATLCoreException;
//import org.eclipse.m2m.atl.emftvm.util.VMException;
import org.eclipse.m2m.atl.engine.emfvm.VMException;
import org.eclipse.ocl.OCL;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.Query;
import org.eclipse.ocl.ecore.EcoreEnvironmentFactory;
import org.eclipse.ocl.ecore.impl.ConstraintImpl;
import org.eclipse.ocl.helper.OCLHelper;

import trace.TracePackage;
import ATL.ATLPackage;
import jointPackage_BibTeX2DocBook.JointPackage_BibTeX2DocBookPackage;

public class TestOcl{

    /**************************** PARAMETERS FOR THE BIBTEX2DOCBOOK EXAMPLE ********************************/
    //	final static String executionsCanPath = "models_BibTexML2DocBook";
    final static String executionsCanPath = "ModelTrans_Test";
    /**包含转换的文件夹的名称**/
    final static String folderTransformations = "transformations";
    /**这是连接转换的源模型和目标模型而产生的模型的名称**/
    final static String Joint_Model_Name = "JointModel";
    /**突变体1**/
    final static String Transformation_Name = "BibTeX2DocBook_Mutant3";
    /**具有OCL约束的文件的名称**/
    final static String OCL_File_Name = "OCL_Constraints.txt";
    /**将打印结果的文件的名称**/
    final static String Results_File_Name = "suspiciousnessResults.csv";
    /**输入MM的名称和扩展名**/
    public final static String IN_MM = "BibTeX.ecore";
    /**ATL转换中的名称**/
    public final static String IN_MM_NAME = "BibTeX";
    /**输出MM的名称和扩展名**/
    public final static String OUT_MM = "DocBook.ecore";
    /**ATL转换中的名称**/
    public final static String OUT_MM_NAME = "DocBook";
    /**跟踪元模型的名称及其在转换中的名称**/
    public final static String Trace_MM = "Trace.ecore";
    public final static String Trace_MM_NAME = "TM";
    /**转换执行产生的跟踪模型的名称**/
    public final static String Trace_OutModel_Name = "Trace_out";
    //为了执行连接模型的转换，我们还需要一些参数
    //接下来，我们指定合并两个元模型的联合元模型
    public final static String Joint_MM = "JointMM_BibTeX2DocBook.ecore";
    public final static String IN_MM_NAME_TRAFO1 = "BibTexModel";
    public final static String IN_MM_NAME_TRAFO2 = "DocBookModel";
    public final static String OUT_MM_NAME_TRAFO = "JointModel";
    public final static String IN_MODEL_NAME_TRAFO1 = "IN1";
    public final static String IN_MODEL_NAME_TRAFO2 = "IN2";
    public final static String OUT_MODEL_NAME_TRAFO = "OUT";
    public final static String TRANSFO_MODULE_MERGE = "MergeModels"; //Name of the transformation file
    final static int numExecutions = 1;

    /**************************** END OF PARAMETERS FOR THE BIBTEX2DOCBOOK EXAMPLE ********************************/

//    /**************************** PARAMETERS FOR THE UML2ER EXAMPLE ********************************/
//
//    /**We need the canonical path in order to navigate the subfolders**/
//    final static String executionsCanPath = "ModelTrans_Test";
//    /**Name of the folder that contains the transformations**/
//    final static String folderTransformations = "transformations";
//    /**This is the name given to the model resulting from joining the source and target models of a transformation**/
//    final static String Joint_Model_Name = "JointModel";
//    /**Name of the file with the transformation and the Buggy_rule. Note: the latter is used for the automatic computation of the EXAM metric**/
//    /**The following combinations (pairs of the two above variables) are correct for this case study**/
//
//    final static String Transformation_Name = "SimpleUml2ER_Mutant4";
//
//    /**Name of the file with the OCL constraints**/
//    final static String OCL_File_Name = "OCL_Constraints.txt";
//    /**Name of the file where the results will be printed**/
//    final static String Results_File_Name = "suspiciousnessResults.csv";
//    /**Name and extension of input MM**/
//    public final static String IN_MM = "SimpleUML.ecore";
//    /**Name as it is in the ATL transformation**/
//    public final static String IN_MM_NAME = "SimpleUML";
//    /**Name and extension of output MM**/
//    public final static String OUT_MM = "ER.ecore";
//    /**Name as it is in the ATL transformation**/
//    public final static String OUT_MM_NAME = "ER";
//    /**Name of the Trace metamodel and its name within the transformation**/
//    public final static String Trace_MM = "Trace.ecore";
//    public final static String Trace_MM_NAME = "TM";
//    /**Name to be given to the trace models resulting from transformation execution**/
//    public final static String Trace_OutModel_Name = "Trace_out";
//
//    //For executing the transformation that joins the models, we also need some parameters
//    //Next we specify the Joint Metamodel where both metamodels are merged
//    //public final static String Joint_MM = "JointMM.ecore";
//    public final static String Joint_MM = "JointMM_UML2ER.ecore";
//    /* Provided we have the following transformation to merge input/output models
//     * module MergeModels;
//     * create OUT : JointModel from IN1 : BibTexModel, IN2 : DocBookModel;
//     * Then we have the following parameters:
//     */
//    public final static String IN_MM_NAME_TRAFO1 = "SimpleUML";
//    public final static String IN_MM_NAME_TRAFO2 = "ER";
//    public final static String OUT_MM_NAME_TRAFO = "JointModel";
//    public final static String IN_MODEL_NAME_TRAFO1 = "IN1";
//    public final static String IN_MODEL_NAME_TRAFO2 = "IN2";
//    public final static String OUT_MODEL_NAME_TRAFO = "OUT";
//    public final static String TRANSFO_MODULE_MERGE = "MergeModels"; //Name of the transformation file
//
//	/**Take also into account the following to be touched within the code**/
//    /**We have also added the following in the main method**/
//    //JointPackage_UML2ERPackage.eINSTANCE.eClass();
//    final static int numExecutions = 1;
//    /**Finally, we also have to change the following line, which is in method getListResultVector
//     * We have to put the corresponding JointPackage**/
//    //helper.setContext(JointPackage_BibTeX2DocBookPackage.Literals.JOINT_MM);
//	/**************************** END OF PARAMETERS FOR THE UML2ER EXAMPLE ********************************/

//    /**************************** PARAMETERS FOR THE CPL2SPL EXAMPLE ********************************/
//
//    /**We need the canonical path in order to navigate the subfolders**/
//    final static String executionsCanPath = "ModelTrans_Test";
//    /**Name of the folder that contains the transformations**/
//    final static String folderTransformations = "transformations";
//    /**This is the name given to the model resulting from joining the source and target models of a transformation**/
//    final static String Joint_Model_Name = "JointModel";
//    /**Name of the file with the transformation and the Buggy_rule. Note: the latter is used for the automatic computation of the EXAM metric**/
//    /**The following combinations (pairs of the two above variables) are correct for this case study**/
//
//    final static String Transformation_Name = "CPL2SPL_Mutant2";
//
//    /**Name of the file with the OCL constraints**/
//    final static String OCL_File_Name = "OCL_Constraints.txt";
//    /**Name of the file where the results will be printed**/
//    final static String Results_File_Name = "suspiciousnessResults.csv";
//    /**Name and extension of input MM**/
//    public final static String IN_MM = "CPL.ecore";
//    /**Name as it is in the ATL transformation**/
//    public final static String IN_MM_NAME = "CPL";
//    /**Name and extension of output MM**/
//    public final static String OUT_MM = "SPL.ecore";
//    /**Name as it is in the ATL transformation**/
//    public final static String OUT_MM_NAME = "SPL";
//    /**Name of the Trace metamodel and its name within the transformation**/
//    public final static String Trace_MM = "Trace.ecore";
//    public final static String Trace_MM_NAME = "TM";
//    /**Name to be given to the trace models resulting from transformation execution**/
//    public final static String Trace_OutModel_Name = "Trace_out";
//
//    //For executing the transformation that joins the models, we also need some parameters
//    //Next we specify the Joint Metamodel where both metamodels are merged
//    //public final static String Joint_MM = "JointMM.ecore";
//    public final static String Joint_MM = "JointMM_CPL2SPL.ecore";
//    /* Provided we have the following transformation to merge input/output models
//     * module MergeModels;
//     * create OUT : JointModel from IN1 : BibTexModel, IN2 : DocBookModel;
//     * Then we have the following parameters:
//     */
//    public final static String IN_MM_NAME_TRAFO1 = "CPL";
//    public final static String IN_MM_NAME_TRAFO2 = "SPL";
//    public final static String OUT_MM_NAME_TRAFO = "JointModel";
//    public final static String IN_MODEL_NAME_TRAFO1 = "IN1";
//    public final static String IN_MODEL_NAME_TRAFO2 = "IN2";
//    public final static String OUT_MODEL_NAME_TRAFO = "OUT";
//    public final static String TRANSFO_MODULE_MERGE = "MergeModels"; //Name of the transformation file
//
//    final static int numExecutions = 1;
//
//    /**Take also into account the following to be touched within the code**/
////	In this case study, we have to execute ATL_EMF_Launcher.executeATLTransformation2 for joining tdhe source and target models
////
////	/**We have also added the following in the main method**/
////	//JointPackage_Ecore2MaudePackage.eINSTANCE.eClass();
////
////	/**Finally, we also have to change the following line, which is in method getListResultVector
////	 * We have to put the corresponding JointPackage**/
////	//helper.setContext(JointPackage_BibTeX2DocBookPackage.Literals.JOINT_MM);
//    /**************************** END OF PARAMETERS FOR THE CPL2SPL EXAMPLE ********************************/

//    /**************************** PARAMETERS FOR THE Ecore2Maude EXAMPLE ********************************/
//
//    /**We need the canonical path in order to navigate the subfolders**/
//    final static String executionsCanPath = "ModelTrans_Test";
//    /**Name of the folder that contains the transformations**/
//    final static String folderTransformations = "transformations";
//    /**This is the name given to the model resulting from joining the source and target models of a transformation**/
//    final static String Joint_Model_Name = "JointModel";
//    /**Name of the file with the transformation and the Buggy_rule. Note: the latter is used for the automatic computation of the EXAM metric**/
//    /**The following combinations (pairs of the two above variables) are correct for this case study**/
////	final static String Transformation_Name = "Ecore2Maude_Mutant1";
////	final static List<String> Buggy_rules = Arrays.asList("EmptyList");
////	final static String Transformation_Name = "Ecore2Maude_Mutant2";
////	final static List<String> Buggy_rules = Arrays.asList("EqName");
////	final static String Transformation_Name = "Ecore2Maude_Mutant3";
////	final static List<String> Buggy_rules = Arrays.asList("Initialize");
////	final static String Transformation_Name = "Ecore2Maude_Mutant4";
////	final static List<String> Buggy_rules = Arrays.asList("Class2Sort");
////	final static String Transformation_Name = "Ecore2Maude_Mutant5";
////	final static List<String> Buggy_rules = Arrays.asList("Class2Sort");
////	final static String Transformation_Name = "Ecore2Maude_Mutant6";
////	final static List<String> Buggy_rules = Arrays.asList("Initialize");
////	final static String Transformation_Name = "Ecore2Maude_Mutant7";
////	final static List<String> Buggy_rules = Arrays.asList("Initialize");
////	final static String Transformation_Name = "Ecore2Maude_Mutant8";
////	final static List<String> Buggy_rules = Arrays.asList("Class2Sort");
////	final static String Transformation_Name = "Ecore2Maude_Mutant9";
////	final static List<String> Buggy_rules = Arrays.asList("Class2Sort");
////	final static String Transformation_Name = "Ecore2Maude_Mutant10";
////	final static List<String> Buggy_rules = Arrays.asList("Reference2Operation");
////	final static String Transformation_Name = "Ecore2Maude_Mutant11";
////	final static List<String> Buggy_rules = Arrays.asList("Attribute2Operation");
////	final static String Transformation_Name = "Ecore2Maude_Mutant12";
////	final static List<String> Buggy_rules = Arrays.asList("Attribute2Operation");
////	final static String Transformation_Name = "Ecore2Maude_Mutant13";
////	final static List<String> Buggy_rules = Arrays.asList("Enum2Sort");
//	final static String Transformation_Name = "Ecore2Maude_Mutant14";
//	final static List<String> Buggy_rules = Arrays.asList("Enum2Sort");
////	final static String Transformation_Name = "Ecore2Maude_Mutant15";
////	final static List<String> Buggy_rules = Arrays.asList("EnumLiteral2Operation");
////	final static String Transformation_Name = "Ecore2Maude_Mutant16";
////	final static List<String> Buggy_rules = Arrays.asList("MetamodelEqName");
////	final static String Transformation_Name = "Ecore2Maude_Mutant17";
////	final static List<String> Buggy_rules = Arrays.asList("Reference2Operation");
////	final static String Transformation_Name = "Ecore2Maude_Mutant18";
////	final static List<String> Buggy_rules = Arrays.asList("Package2Operation");
////	final static String Transformation_Name = "Ecore2Maude_Mutant19";
////	final static List<String> Buggy_rules = Arrays.asList("Initialize");
////    final static String Transformation_Name = "Ecore2Maude_Mutant20";
////    final static List<String> Buggy_rules = Arrays.asList("Class2Sort");
////	final static String Transformation_Name = "Ecore2Maude_Mutant21";
////	final static List<String> Buggy_rules = Arrays.asList("EqType");
////	final static String Transformation_Name = "Ecore2Maude_Mutant22";
////	final static List<String> Buggy_rules = Arrays.asList("EqLowerBound");
////	final static String Transformation_Name = "Ecore2Maude_Mutant23";
////	final static List<String> Buggy_rules = Arrays.asList("EqUpperBound");
////	final static String Transformation_Name = "Ecore2Maude_Mutant24";
////	final static List<String> Buggy_rules = Arrays.asList("Reference2Operation");
////	final static String Transformation_Name = "Ecore2Maude_Mutant25";
////	final static List<String> Buggy_rules = Arrays.asList("EqContainingClass");
////	final static String Transformation_Name = "Ecore2Maude_Mutant26";
////	final static List<String> Buggy_rules = Arrays.asList("Attribute2Operation");
////	final static String Transformation_Name = "Ecore2Maude_Mutant27";
////	final static List<String> Buggy_rules = Arrays.asList("RefEqOpposite");
////	final static String Transformation_Name = "Ecore2Maude_Mutant28";
////	final static List<String> Buggy_rules = Arrays.asList("EqIsUnique");
////	final static String Transformation_Name = "Ecore2Maude_Mutant29";
////	final static List<String> Buggy_rules = Arrays.asList("Attribute2Operation");
////	final static String Transformation_Name = "Ecore2Maude_Mutant30";
////	final static List<String> Buggy_rules = Arrays.asList("EqPackage");
////	final static String Transformation_Name = "Ecore2Maude_Mutant31";
////	final static List<String> Buggy_rules = Arrays.asList("EnumEqMetaAux");
////	final static String Transformation_Name = "Ecore2Maude_Mutant32";
////	final static List<String> Buggy_rules = Arrays.asList("Class2Sort");
////	final static String Transformation_Name = "Ecore2Maude_Mutant33";
////	final static List<String> Buggy_rules = Arrays.asList("Attribute2Operation");
////	final static String Transformation_Name = "Ecore2Maude_Mutant34";
////	final static List<String> Buggy_rules = Arrays.asList("MetamodelEqName", "MetamodelEqPackages");
////	final static String Transformation_Name = "Ecore2Maude_Mutant35";
////	final static List<String> Buggy_rules = Arrays.asList("EnumEqMetaAux", "EnumEqDefaultValue");
////	final static String Transformation_Name = "Ecore2Maude_Mutant36";
////	final static List<String> Buggy_rules = Arrays.asList("EqLowerBound", "EqUpperBound");
////	final static String Transformation_Name = "Ecore2Maude_Mutant37";
////	final static List<String> Buggy_rules = Arrays.asList("Class2Sort", "Reference2Operation");
////	final static String Transformation_Name = "Ecore2Maude_Mutant38";
////	final static List<String> Buggy_rules = Arrays.asList("EqIsOrdered", "EqIsUnique");
////	final static String Transformation_Name = "Ecore2Maude_Mutant39";
////	final static List<String> Buggy_rules = Arrays.asList("EnumLiteral2Operation", "Attribute2Operation");
////	final static String Transformation_Name = "Ecore2Maude_Mutant40";
////	final static List<String> Buggy_rules = Arrays.asList("ClassEqAttributes", "EqType");
////	final static String Transformation_Name = "Ecore2Maude_Mutant41";
////	final static List<String> Buggy_rules = Arrays.asList("ClassEqIsAbstract", "EqPackage", "ClassEqSuperTypes");
////	final static String Transformation_Name = "Ecore2Maude_Mutant42";
////	final static List<String> Buggy_rules = Arrays.asList("Initialize", "Package2Operation", "PackEqMetamodel", "PackEqSupPackage", "PackEqSubPackages", "PackEqClasses", "EqPackage");
////	final static String Transformation_Name = "Ecore2Maude_Mutant43";
////	final static List<String> Buggy_rules = Arrays.asList("PackEqMetamodel", "PackEqSupPackage", "PackEqSubPackages");
////	final static String Transformation_Name = "Ecore2Maude_Mutant44";
////	final static List<String> Buggy_rules = Arrays.asList("Initialize", "Class2Sort");
////	final static String Transformation_Name = "Ecore2Maude_Mutant45";
////	final static List<String> Buggy_rules = Arrays.asList("Class2Sort", "Attribute2Operation");
////	final static String Transformation_Name = "Ecore2Maude_Mutant46";
////	final static List<String> Buggy_rules = Arrays.asList("Attribute2Operation", "Enum2Sort");
////	final static String Transformation_Name = "Ecore2Maude_Mutant47";
////	final static List<String> Buggy_rules = Arrays.asList("EqPackage", "EnumEqMetaAux");
////	final static String Transformation_Name = "Ecore2Maude_Mutant48";
////	final static List<String> Buggy_rules = Arrays.asList("Class2Sort", "EqType");
////	final static String Transformation_Name = "Ecore2Maude_Mutant49";
////	final static List<String> Buggy_rules = Arrays.asList("Initialize", "Reference2Operation");
////	final static String Transformation_Name = "Ecore2Maude_Mutant50";
////	final static List<String> Buggy_rules = Arrays.asList("EqUpperBound", "EqContainingClass");
//
//    /**Name of the file with the OCL constraints**/
//    final static String OCL_File_Name = "OCL_Constraints.txt";
//    /**Name of the file where the results will be printed**/
//    final static String Results_File_Name = "suspiciousnessResults.csv";
//    /**Name and extension of input MM**/
//    public final static String IN_MM = "ecore.ecore";
//    /**Name as it is in the ATL transformation**/
//    public final static String IN_MM_NAME = "Ecore";
//    /**Name and extension of output MM**/
//    public final static String OUT_MM = "Maude.ecore";
//    /**Name as it is in the ATL transformation**/
//    public final static String OUT_MM_NAME = "Maude";
//    /**Name of the Trace metamodel and its name within the transformation**/
//    public final static String Trace_MM = "Trace.ecore";
//    public final static String Trace_MM_NAME = "TM";
//    /**Name to be given to the trace models resulting from transformation execution**/
//    public final static String Trace_OutModel_Name = "Trace_out";
//
//    //For executing the transformation that joins the models, we also need some parameters
//    //Next we specify the Joint Metamodel where both metamodels are merged
//    //public final static String Joint_MM = "JointMM.ecore";
//    public final static String Joint_MM = "JointMM_Ecore2Maude.ecore";
//    /* Provided we have the following transformation to merge input/output models
//     * module MergeModels;
//     * create OUT : JointModel from IN1 : BibTexModel, IN2 : DocBookModel;
//     * Then we have the following parameters:
//     */
//    public final static String IN_MM_NAME_TRAFO1 = "Ecore";
//    public final static String IN_MM_NAME_TRAFO2 = "Maude";
//    public final static String OUT_MM_NAME_TRAFO = "JointModel";
//    public final static String IN_MODEL_NAME_TRAFO1 = "IN1";
//    public final static String IN_MODEL_NAME_TRAFO2 = "IN2";
//    public final static String OUT_MODEL_NAME_TRAFO = "OUT";
//    public final static String TRANSFO_MODULE_MERGE = "MergeModels"; //Name of the transformation file
//
//    final static int numExecutions = 1;
//
//    /**Take also into account the following to be touched within the code**/
////	In this case study, we have to execute ATL_EMF_Launcher.executeATLTransformation2 for joining the source and target models
//
//    /**We have also added the following in the main method**/
////	JointPackage_Ecore2MaudePackage.eINSTANCE.eClass();
//
//    /**Finally, we also have to change the following line, which is in method getListResultVector
//     * We have to put the corresponding JointPackage**/
////	helper.setContext(JointPackage_BibTeX2DocBookPackage.Literals.JOINT_MM);
//    /**************************** END OF PARAMETERS FOR THE Ecore2Maude EXAMPLE ********************************/

    public static void main(String[] args) throws ParserException, ATLCoreException, IOException {

        /**
         * 复制当前源模型到指定路径
         */

        String filePath = "C:\\Users\\JJP\\Desktop\\OCL\\ModelTrans_Test\\scenarios\\scenario1\\AutomaticModel_BibTex1.xmi";
        String targetPath = "C:\\Users\\JJP\\Desktop\\OCL\\ModelTrans_Test\\scenarios\\scenario1\\AutomaticModel_BibTex1.xmi";
        String trace_path = "C:\\Users\\JJP\\Desktop\\trace.txt";

        File file = new File(filePath);
        if(file.exists()) {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));
            //读取
            String line;
            String content = "";
            //readLine按行读取,当返回null时，表示文件读取完毕
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
                content = content + line;
            }
//            System.out.println(content);
            //关闭流，只需要关闭BufferedReader
            bufferedReader.close();
            addFile(content,targetPath);
            method2(trace_path,content);
        }
        /**
         * ATL转换
         */
        ATLPackage.eINSTANCE.eClass();
        TracePackage.eINSTANCE.eClass();

        Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());

        List<String> IN_MM_PATHS = new ArrayList<String>();
        List<String> OUT_MM_PATHS = new ArrayList<String>();
        List<String> IN_MM_NAMES_TRAFO = new ArrayList<String>();
        List<String> OUT_MM_NAMES_TRAFO = new ArrayList<String>();
        List<String> IN_MODEL_PATHS = new ArrayList<String>();
        List<String> OUT_MMODEL_PATHS = new ArrayList<String>();
        List<String> IN_MODEL_NAMES_TRAFO = new ArrayList<String>();
        List<String> OUT_MODEL_NAMES_TRAFO = new ArrayList<String>();
        System.out.println("之前代码正确执行");

        /**
         * 第一次转换，将源模型转换得到目标模型
         */
        try {
            ATL_EMF_Launcher.executeATLTransformation(executionsCanPath, folderTransformations, IN_MM, OUT_MM, Joint_MM,
                    IN_MM_NAME, OUT_MM_NAME, Trace_MM_NAME, Trace_OutModel_Name, Transformation_Name, numExecutions);
        }catch (VMException e){
            System.out.println("以上代码出错");
            addFile("TRUE","C:\\Users\\JJP\\Desktop\\result.txt");
            return;
        }

        if (ATL_EMF_Launcher.fault==1){
            System.out.println("以上代码出错");
            addFile("TRUE","C:\\Users\\JJP\\Desktop\\result.txt");
            return;
        }
        IN_MM_PATHS.add(IN_MM);
        IN_MM_PATHS.add(OUT_MM);
        OUT_MM_PATHS.add(Joint_MM);
        IN_MM_NAMES_TRAFO.add(IN_MM_NAME_TRAFO1);
        IN_MM_NAMES_TRAFO.add(IN_MM_NAME_TRAFO2);
        OUT_MM_NAMES_TRAFO.add(OUT_MM_NAME_TRAFO);
        IN_MODEL_NAMES_TRAFO.add(IN_MODEL_NAME_TRAFO1);
        IN_MODEL_NAMES_TRAFO.add(IN_MODEL_NAME_TRAFO2);
        OUT_MODEL_NAMES_TRAFO.add(OUT_MODEL_NAME_TRAFO);
        System.out.println("请忽略以下错误");
        if (ATL_EMF_Launcher.fault!=1) {
            /**
             * 第二次转换，将源模型和目标模型融合得到jointModel
             */
            try {
                ATL_EMFTVM_Launcher.executeATLTransformationSeveralTimes(executionsCanPath, IN_MM_PATHS, OUT_MM_PATHS, IN_MM_NAMES_TRAFO, OUT_MM_NAMES_TRAFO, IN_MODEL_NAMES_TRAFO, OUT_MODEL_NAMES_TRAFO,
                        null, null, executionsCanPath + "/", TRANSFO_MODULE_MERGE, numExecutions);
            }catch (VMException e){
                System.out.println("以上代码出错");
                addFile("TRUE","C:\\Users\\JJP\\Desktop\\result.txt");
                return;
            }

//            JointPackage_CPL2SPLPackage.eINSTANCE.eClass();
            JointPackage_BibTeX2DocBookPackage.eINSTANCE.eClass();
            JointPackage_UML2ERPackage.eINSTANCE.eClass();
            JointPackage_Ecore2MaudePackage.eINSTANCE.eClass();
            JointPackage_CPL2SPLPackage.eINSTANCE.eClass();

        }

        if (ATL_EMF_Launcher.fault!=1) {
            /**
             * OCL检查
             */
            String Oclline = "SrcAuthor.allInstances()->forAll(a | TrgPara.allInstances()->exists(p | p.content = a.author and p.section.title = 'Authors List'))";
            String filename = "ModelTrans_Test/scenarios/scenario1/JointModel1.xmi";

            int failure = checkOcl(Oclline, filename);
            String result = failure == 1 ? "FAIL" : "PASS";
            addFile(result, "C:\\Users\\JJP\\Desktop\\result.txt");
            System.out.println(result);
            System.out.println(failure);

            /*
             * 如果模型符合成功完成转换则将中间测试用例复制保存
             */
            int fail_count = 0 ;
//            int pass_count = 0 ;
            String source_file = "C:\\Users\\JJP\\Desktop\\OCL\\ModelTrans_Test\\scenarios\\scenario1\\AutomaticModel_BibTex1.xmi";
            String file_path = "C:\\Users\\JJP\\Desktop\\HDD_Gen\\models_BibTexML2DocBook_fail\\";
            String  pass_path = "C:\\Users\\JJP\\Desktop\\HDD_Gen\\models_BibTexML2DocBook_pass\\";
            File target_file_fail = null;
            String target_file_path_fail = null;
            String target_file_path_pass = null;
            File target_file_pass = null;
            if (failure == 1) { //测试用例失败

                while (target_file_fail == null || target_file_fail.exists() || target_file_pass.exists() ) {
                    fail_count++;
                    target_file_path_fail = file_path + String.valueOf(fail_count) + ".xmi";
                    target_file_fail = new File(target_file_path_fail);
                    target_file_path_pass = pass_path + String.valueOf(fail_count) + ".xmi";
                    target_file_pass = new File(target_file_path_pass);
                }

                File source = new File(source_file);
                if (source.exists()) {
                    BufferedReader bufferedReader = new BufferedReader(new FileReader(source_file));
                    //读取
                    String line;
                    String content = "";
                    //readLine按行读取,当返回null时，表示文件读取完毕
                    while ((line = bufferedReader.readLine()) != null) {
//                        System.out.println(line);
                        content = content + line;
                    }
//            System.out.println(content);
                    //关闭流，只需要关闭BufferedReader
                    bufferedReader.close();
                    addFile(content, target_file_path_fail);
                }
            }

            else if (failure == 0) { //测试用例通过

                while (target_file_pass == null || target_file_pass.exists() || target_file_fail.exists()) {
                    fail_count++;
                    target_file_path_fail = file_path + String.valueOf(fail_count) + ".xmi";
                    target_file_fail = new File(target_file_path_fail);
                    target_file_path_pass = pass_path + String.valueOf(fail_count) + ".xmi";
                    target_file_pass = new File(target_file_path_pass);

                }

                File source = new File(source_file);
                if (source.exists()) {
                    BufferedReader bufferedReader = new BufferedReader(new FileReader(source_file));
                    //读取
                    String line;
                    String content = "";
                    //readLine按行读取,当返回null时，表示文件读取完毕
                    while ((line = bufferedReader.readLine()) != null) {
//                        System.out.println(line);
                        content = content + line;
                    }
//            System.out.println(content);
                    //关闭流，只需要关闭BufferedReader
                    bufferedReader.close();
                    addFile(content, target_file_path_pass);
                }
            }
//            String filePath = "C:\\Users\\JJP\\Desktop\\OCL\\ModelTrans_Test\\scenarios\\scenario1\\AutomaticModel_BibTex1.xmi";
//            String targetPath = "C:\\Users\\JJP\\Desktop\\OCL\\ModelTrans_Test\\scenarios\\scenario1\\AutomaticModel_ecore1.xmi";
//            File file = new File(filePath);
//            if(file.exists()) {
//                BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));
//                //读取
//                String line;
//                String content = "";
//                //readLine按行读取,当返回null时，表示文件读取完毕
//                while ((line = bufferedReader.readLine()) != null) {
//                    System.out.println(line);
//                    content = content + line;
//                }
////            System.out.println(content);
//                //关闭流，只需要关闭BufferedReader
//                bufferedReader.close();
//                addFile(content,targetPath);
//
//            }
        }
        else {
            System.out.println("模型混合失败");
            addFile("TRUE","C:\\Users\\JJP\\Desktop\\result.txt");
        }
    }
    /**
     * OCL检查方法
     * @param oclline
     * @param filename
     * @return
     * @throws ParserException
     */
    public static int checkOcl(String oclline , String filename) throws ParserException, IOException{

        ResourceSet resourceSet = new ResourceSetImpl();
        resourceSet.getResource(URI.createFileURI(filename), true);
        Resource resource = resourceSet.getResources().get(0);
        EObject rootClass = EcoreUtil.getRootContainer(resource.getContents().get(0));
        OCL ocl = OCL.newInstance(EcoreEnvironmentFactory.INSTANCE);
        OCLHelper helper = ocl.createOCLHelper();
        helper.setContext(JointPackage_BibTeX2DocBookPackage.Literals.JOINT_MM);
//        helper.setContext(JointPackage_UML2ERPackage.Literals.JOINT_MM);
//        helper.setContext(JointPackage_CPL2SPLPackage.Literals.JOINT_MM);
//        helper.setContext(JointPackage_Ecore2MaudePackage.Literals.JOINT_MM);
        ConstraintImpl constraint = (ConstraintImpl) helper.createInvariant(oclline);
        Query constraintEval = (Query) ocl.createQuery(constraint);
        int failure = constraintEval.check(rootClass) ? 0 : 1;//1 if there is failure, 0 otherwise
        System.out.println(failure);

        return failure;
    }

    /**
     * 文件覆盖写入方法
     * @param string
     * @param path
     * @return
     */
    public static boolean addFile(String string,String path) {
        PrintStream stream=null;
        try {
            stream=new PrintStream(path);//写入的文件path
            stream.print(string);//写入的字符串
            return true;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return false;
    }

    /**
     * 文件追加写入方法
     * @param file
     * @param conent
     */
    public static void method2(String file, String conent) {
        BufferedWriter out = null;
        try {
            out = new BufferedWriter(new OutputStreamWriter(
                    new FileOutputStream(file, true)));
            out.write(conent + "\r\n");
            out.write("--------------");
            out.write("分割线");
            out.write("--------------\n");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
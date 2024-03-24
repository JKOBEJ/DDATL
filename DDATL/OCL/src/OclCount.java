import ATL.ATLPackage;
import jointPackage_BibTeX2DocBook.JointPackage_BibTeX2DocBookPackage;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.m2m.atl.core.ATLCoreException;
import org.eclipse.ocl.OCL;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.Query;
import org.eclipse.ocl.ecore.EcoreEnvironmentFactory;
import org.eclipse.ocl.ecore.impl.ConstraintImpl;
import org.eclipse.ocl.helper.OCLHelper;
import trace.TracePackage;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class OclCount {

    final static int numExecutions = 100;
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

    public static void main(String[] args) throws ParserException, ATLCoreException, IOException {

        /**
         * 复制当前源模型到指定路径
         */

//        String filePath = "C:\\Users\\JJP\\Desktop\\OCL\\ModelTrans_Test\\scenarios\\scenario1\\AutomaticModel_BibTex1.xmi";
//
//        BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));
//        //读取
//        String line;
//        String content = "";
//        //readLine按行读取,当返回null时，表示文件读取完毕
//        while ((line = bufferedReader.readLine()) != null){
//            System.out.println(line);
//            method2("c:\\test\\out02.txt",line);
//        }
//        //关闭流，只需要关闭BufferedReader
//        bufferedReader.close();
//        method2("c:\\test\\out02.txt","======分隔符======");

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

        ATL_EMF_Launcher.executeATLTransformation(executionsCanPath, folderTransformations, IN_MM, OUT_MM, Joint_MM,
                    IN_MM_NAME, OUT_MM_NAME, Trace_MM_NAME, Trace_OutModel_Name, Transformation_Name, numExecutions);
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
            ATL_EMFTVM_Launcher.executeATLTransformationSeveralTimes(executionsCanPath, IN_MM_PATHS, OUT_MM_PATHS, IN_MM_NAMES_TRAFO, OUT_MM_NAMES_TRAFO, IN_MODEL_NAMES_TRAFO, OUT_MODEL_NAMES_TRAFO,
                    null, null, executionsCanPath + "/", TRANSFO_MODULE_MERGE, numExecutions);
            JointPackage_BibTeX2DocBookPackage.eINSTANCE.eClass();
        }
        if (ATL_EMF_Launcher.fault!=1) {
            /**
             * OCL检查
             */
            String Oclline = "SrcAuthor.allInstances()->forAll(au|TrgArticle.allInstances()->exists(a|a.sections_1->at(2).paras->exists(p|p.content=au.author )))";
            String filename = "ModelTrans_Test/scenarios/scenario1/JointModel1.xmi";
            int failure = checkOcl(Oclline, filename);
            String result = failure == 1 ? "FAIL" : "PASS";
            addFile(result, "C:\\Users\\JJP\\Desktop\\result.txt");
            System.out.println(result);
        }
        else {
            System.out.println("模型混合失败");
            addFile("TRUE","C:\\Users\\JJP\\Desktop\\result.txt");
        }

        long numScenarios = Files.find(Paths.get(executionsCanPath),
                1, // how deep do we want to descend
                (path, attributes) -> attributes.isDirectory()
        ).count() - 1; // -1 because 'scenarios' is also counted
        System.out.println(numScenarios);
    }

    /**
     * OCL检查方法
     * @param oclline
     * @param filename
     * @return
     * @throws ParserException
     */
    public static int checkOcl(String oclline , String filename) throws ParserException{
        ResourceSet resourceSet = new ResourceSetImpl();
        resourceSet.getResource(URI.createFileURI(filename), true);
        Resource resource = resourceSet.getResources().get(0);
        EObject rootClass = EcoreUtil.getRootContainer(resource.getContents().get(0));
        OCL ocl = OCL.newInstance(EcoreEnvironmentFactory.INSTANCE);
        OCLHelper helper = ocl.createOCLHelper();
        helper.setContext(JointPackage_BibTeX2DocBookPackage.Literals.JOINT_MM);

        ConstraintImpl constraint = (ConstraintImpl) helper.createInvariant(oclline);
        Query constraintEval = (Query) ocl.createQuery(constraint);
        int failure = constraintEval.check(rootClass) ? 0 : 1;//1 if there is failure, 0 otherwise

        return failure;
    }

    /**
     * 批量进行OCL检查
     * @param numScenarios
     * @return
     * @throws IOException
     * @throws ParserException
     */
    public static List<int[]> getListResultVector(long numScenarios) throws IOException, ParserException{
        List<int[]> result = new ArrayList<int[]>();

        FileReader reader = new FileReader(executionsCanPath + "/" + OCL_File_Name);
        BufferedReader br = new BufferedReader(reader);

        int numOCL = 1;
        String line = br.readLine(); //For reading the file with the OCL expressions
        while (line != null){
            if (!line.equals("") && !line.substring(0,1).equals(" ") && !line.substring(0, 2).equals("--") ) { //If it is, then it is a comment or an empty line
                System.out.println("***OCL" + numOCL + " constraint processed***");
                System.out.println(line);
                int[] resultVector = new int[(int) numScenarios]; //Array for storing the result vector for this OCL Constraint
                /**Each OCL constraint has to be tested for each scenario**/
                for (int j=1; j<=numScenarios; j++){
                    //The following code is for loading the JointModel with the input and output models of the jth scenario
                    ResourceSet resourceSet = new ResourceSetImpl();
                    resourceSet.getResource(URI.createFileURI(executionsCanPath + "/scenarios/scenario" + j + "/" + Joint_Model_Name + j + ".xmi"), true);
                    Resource resource = resourceSet.getResources().get(0);
                    EObject rootClass = EcoreUtil.getRootContainer(resource.getContents().get(0));

                    //The following code is for checking the OCL constraint and storing the result in the resultVector
                    OCL ocl = OCL.newInstance(EcoreEnvironmentFactory.INSTANCE);
                    OCLHelper helper = ocl.createOCLHelper();
//					helper.setContext(JointPackagePackage.Literals.JOINT_MM);
                    helper.setContext(JointPackage_BibTeX2DocBookPackage.Literals.JOINT_MM);
//					helper.setContext(JointPackage_UML2ERPackage.Literals.JOINT_MM);
//					helper.setContext(JointPackage_Ecore2MaudePackage.Literals.JOINT_MM);
//					helper.setContext(JointPackage_CPL2SPLPackage.Literals.JOINT_MM);

                    ConstraintImpl constraint = (ConstraintImpl) helper.createInvariant(line);
                    Query constraintEval = (Query) ocl.createQuery(constraint);
                    int failure = constraintEval.check(rootClass) ? 0 : 1; //1 if there is failure, 0 otherwise
                    resultVector[j-1] = failure;
                }
                result.add(resultVector);

                numOCL++;
            }
            line = br.readLine();
        }
        return result;
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
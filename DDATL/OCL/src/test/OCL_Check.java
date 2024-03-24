package test;

import ATL.ATLPackage;
import jointPackage_BibTeX2DocBook.JointPackage_BibTeX2DocBookPackage;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.ocl.OCL;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.Query;
import org.eclipse.ocl.ecore.EcoreEnvironmentFactory;
import org.eclipse.ocl.ecore.impl.ConstraintImpl;
import org.eclipse.ocl.helper.OCLHelper;
import trace.TracePackage;

/**
 * @author: JJP
 * @date: 2022/10/27 10:24
 * @description:
 */
public class OCL_Check {

    public static void main(String[] args) throws ParserException {
        ATLPackage.eINSTANCE.eClass();
        TracePackage.eINSTANCE.eClass();

        Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());

        JointPackage_BibTeX2DocBookPackage.eINSTANCE.eClass();

        String Oclline = "TrgArticle.allInstances()->forAll(a | a.sections_1->size() >= 4 and a.sections_1->at(1).title = 'References List' and a.sections_1->at(2).title = 'Authors List' and a.sections_1->at(3).title = 'Titles List' and a.sections_1->at(4).title = 'Journals List')";
        String filename = "ModelTrans_Test01/scenarios/scenario2/JointModel1.xmi";
        int failure = checkOcl(Oclline, filename);
        String result = failure == 1 ? "FAIL" : "PASS";
        System.out.println(result);
    }

    public static int checkOcl(String oclline , String filename) throws ParserException {
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
}

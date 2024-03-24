/**
 *
 * $Id$
 */
package jointPackage_Ecore2Maude.validation;

import jointPackage_Ecore2Maude.SrcEClassifier;
import jointPackage_Ecore2Maude.SrcEPackage;

import org.eclipse.emf.common.util.EList;

/**
 * A sample validator interface for {@link jointPackage_Ecore2Maude.SrcEPackage}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface SrcEPackageValidator {
	boolean validate();

	boolean validateNsURI(String value);
	boolean validateNsPrefix(String value);
	boolean validateEClassifiers(EList<SrcEClassifier> value);
	boolean validateESubpackages(EList<SrcEPackage> value);
	boolean validateESuperPackage(SrcEPackage value);
}

/**
 *
 * $Id$
 */
package jointPackage_Ecore2Maude.validation;

import jointPackage_Ecore2Maude.TrgModExpression;

/**
 * A sample validator interface for {@link jointPackage_Ecore2Maude.TrgModImportation}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface TrgModImportationValidator {
	boolean validate();

	boolean validateImports(TrgModExpression value);
}

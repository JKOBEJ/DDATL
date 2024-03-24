/**
 *
 * $Id$
 */
package jointPackage_UML2ER.validation;

import jointPackage_UML2ER.TrgFeature;

import org.eclipse.emf.common.util.EList;

/**
 * A sample validator interface for {@link jointPackage_UML2ER.TrgEntityType}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface TrgEntityTypeValidator {
	boolean validate();

	boolean validateFeatures(EList<TrgFeature> value);
}
/**
 *
 * $Id$
 */
package jointPackage_CPL2SPL.validation;

import jointPackage_CPL2SPL.SIPMethod;

/**
 * A sample validator interface for {@link jointPackage_CPL2SPL.TrgSIPMethodName}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface TrgSIPMethodNameValidator {
	boolean validate();

	boolean validateName(SIPMethod value);
}

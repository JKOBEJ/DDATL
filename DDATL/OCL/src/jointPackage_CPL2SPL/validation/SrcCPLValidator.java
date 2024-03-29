/**
 *
 * $Id$
 */
package jointPackage_CPL2SPL.validation;

import jointPackage_CPL2SPL.SrcIncoming;
import jointPackage_CPL2SPL.SrcOutgoing;
import jointPackage_CPL2SPL.SrcSubAction;

import org.eclipse.emf.common.util.EList;

/**
 * A sample validator interface for {@link jointPackage_CPL2SPL.SrcCPL}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface SrcCPLValidator {
	boolean validate();

	boolean validateSubActions(EList<SrcSubAction> value);
	boolean validateOutgoing(SrcOutgoing value);
	boolean validateIncoming(SrcIncoming value);
}

/**
 *
 * $Id$
 */
package jointPackage_BibTeX2DocBook.validation;


/**
 * A sample validator interface for {@link jointPackage_BibTeX2DocBook.SrcBook}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface SrcBookValidator {
	boolean validate();

	boolean validatePublisher(String value);
}

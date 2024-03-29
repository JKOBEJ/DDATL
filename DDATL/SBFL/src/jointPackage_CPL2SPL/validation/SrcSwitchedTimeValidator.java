/**
 *
 * $Id$
 */
package jointPackage_CPL2SPL.validation;


/**
 * A sample validator interface for {@link jointPackage_CPL2SPL.SrcSwitchedTime}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface SrcSwitchedTimeValidator {
	boolean validate();

	boolean validateDtstart(String value);
	boolean validateDtend(String value);
	boolean validateDuration(String value);
	boolean validateFreq(String value);
	boolean validateUntil(String value);
	boolean validateCount(String value);
	boolean validateInterval(String value);
	boolean validateBySecond(String value);
	boolean validateByMinute(String value);
	boolean validateByHour(String value);
	boolean validateByDay(String value);
	boolean validateByMonthDay(String value);
	boolean validateByYearDay(String value);
	boolean validateByWeekNo(String value);
	boolean validateByMonth(String value);
	boolean validateWkst(String value);
	boolean validateBySetPos(String value);
}

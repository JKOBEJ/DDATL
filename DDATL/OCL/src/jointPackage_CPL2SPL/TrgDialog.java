/**
 */
package jointPackage_CPL2SPL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trg Dialog</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link TrgDialog#getDeclarations <em>Declarations</em>}</li>
 *   <li>{@link TrgDialog#getMethods <em>Methods</em>}</li>
 * </ul>
 *
 * @see JointPackage_CPL2SPLPackage#getTrgDialog()
 * @model
 * @generated
 */
public interface TrgDialog extends TrgSession {
	/**
	 * Returns the value of the '<em><b>Declarations</b></em>' containment reference list.
	 * The list contents are of type {@link TrgDeclaration}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Declarations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Declarations</em>' containment reference list.
	 * @see JointPackage_CPL2SPLPackage#getTrgDialog_Declarations()
	 * @model containment="true"
	 * @generated
	 */
	EList<TrgDeclaration> getDeclarations();

	/**
	 * Returns the value of the '<em><b>Methods</b></em>' containment reference list.
	 * The list contents are of type {@link TrgMethod}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Methods</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Methods</em>' containment reference list.
	 * @see JointPackage_CPL2SPLPackage#getTrgDialog_Methods()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<TrgMethod> getMethods();

} // TrgDialog

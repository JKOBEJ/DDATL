/**
 */
package jointPackage_CPL2SPL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trg With Exp</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link TrgWithExp#getExp <em>Exp</em>}</li>
 *   <li>{@link TrgWithExp#getMsgFields <em>Msg Fields</em>}</li>
 * </ul>
 *
 * @see JointPackage_CPL2SPLPackage#getTrgWithExp()
 * @model
 * @generated
 */
public interface TrgWithExp extends TrgExpression {
	/**
	 * Returns the value of the '<em><b>Exp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exp</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exp</em>' containment reference.
	 * @see #setExp(TrgExpression)
	 * @see JointPackage_CPL2SPLPackage#getTrgWithExp_Exp()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	TrgExpression getExp();

	/**
	 * Sets the value of the '{@link TrgWithExp#getExp <em>Exp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exp</em>' containment reference.
	 * @see #getExp()
	 * @generated
	 */
	void setExp(TrgExpression value);

	/**
	 * Returns the value of the '<em><b>Msg Fields</b></em>' containment reference list.
	 * The list contents are of type {@link TrgMessageField}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Msg Fields</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Msg Fields</em>' containment reference list.
	 * @see JointPackage_CPL2SPLPackage#getTrgWithExp_MsgFields()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<TrgMessageField> getMsgFields();

} // TrgWithExp

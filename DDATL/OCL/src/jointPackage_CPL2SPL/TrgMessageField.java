/**
 */
package jointPackage_CPL2SPL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trg Message Field</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link TrgMessageField#getExp <em>Exp</em>}</li>
 * </ul>
 *
 * @see JointPackage_CPL2SPLPackage#getTrgMessageField()
 * @model abstract="true"
 * @generated
 */
public interface TrgMessageField extends TrgLocatedElement {
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
	 * @see JointPackage_CPL2SPLPackage#getTrgMessageField_Exp()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	TrgExpression getExp();

	/**
	 * Sets the value of the '{@link TrgMessageField#getExp <em>Exp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exp</em>' containment reference.
	 * @see #getExp()
	 * @generated
	 */
	void setExp(TrgExpression value);

} // TrgMessageField

/**
 */
package jointPackage_CPL2SPL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trg Forward Exp</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link TrgForwardExp#isIsParallel <em>Is Parallel</em>}</li>
 *   <li>{@link TrgForwardExp#getExp <em>Exp</em>}</li>
 * </ul>
 *
 * @see JointPackage_CPL2SPLPackage#getTrgForwardExp()
 * @model
 * @generated
 */
public interface TrgForwardExp extends TrgExpression {
	/**
	 * Returns the value of the '<em><b>Is Parallel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Parallel</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Parallel</em>' attribute.
	 * @see #setIsParallel(boolean)
	 * @see JointPackage_CPL2SPLPackage#getTrgForwardExp_IsParallel()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	boolean isIsParallel();

	/**
	 * Sets the value of the '{@link TrgForwardExp#isIsParallel <em>Is Parallel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Parallel</em>' attribute.
	 * @see #isIsParallel()
	 * @generated
	 */
	void setIsParallel(boolean value);

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
	 * @see JointPackage_CPL2SPLPackage#getTrgForwardExp_Exp()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	TrgExpression getExp();

	/**
	 * Sets the value of the '{@link TrgForwardExp#getExp <em>Exp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exp</em>' containment reference.
	 * @see #getExp()
	 * @generated
	 */
	void setExp(TrgExpression value);

} // TrgForwardExp

/**
 */
package jointPackage_CPL2SPL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trg Method</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link TrgMethod#getType <em>Type</em>}</li>
 *   <li>{@link TrgMethod#getDirection <em>Direction</em>}</li>
 *   <li>{@link TrgMethod#getMethodName <em>Method Name</em>}</li>
 *   <li>{@link TrgMethod#getArguments <em>Arguments</em>}</li>
 *   <li>{@link TrgMethod#getStatements <em>Statements</em>}</li>
 *   <li>{@link TrgMethod#getBranches <em>Branches</em>}</li>
 * </ul>
 *
 * @see JointPackage_CPL2SPLPackage#getTrgMethod()
 * @model
 * @generated
 */
public interface TrgMethod extends TrgSession {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(TrgTypeExpression)
	 * @see JointPackage_CPL2SPLPackage#getTrgMethod_Type()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	TrgTypeExpression getType();

	/**
	 * Sets the value of the '{@link TrgMethod#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(TrgTypeExpression value);

	/**
	 * Returns the value of the '<em><b>Direction</b></em>' attribute.
	 * The literals are from the enumeration {@link Direction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Direction</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Direction</em>' attribute.
	 * @see Direction
	 * @see #setDirection(Direction)
	 * @see JointPackage_CPL2SPLPackage#getTrgMethod_Direction()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	Direction getDirection();

	/**
	 * Sets the value of the '{@link TrgMethod#getDirection <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Direction</em>' attribute.
	 * @see Direction
	 * @see #getDirection()
	 * @generated
	 */
	void setDirection(Direction value);

	/**
	 * Returns the value of the '<em><b>Method Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Method Name</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Method Name</em>' containment reference.
	 * @see #setMethodName(TrgMethodName)
	 * @see JointPackage_CPL2SPLPackage#getTrgMethod_MethodName()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	TrgMethodName getMethodName();

	/**
	 * Sets the value of the '{@link TrgMethod#getMethodName <em>Method Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Method Name</em>' containment reference.
	 * @see #getMethodName()
	 * @generated
	 */
	void setMethodName(TrgMethodName value);

	/**
	 * Returns the value of the '<em><b>Arguments</b></em>' containment reference list.
	 * The list contents are of type {@link TrgArgument}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arguments</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arguments</em>' containment reference list.
	 * @see JointPackage_CPL2SPLPackage#getTrgMethod_Arguments()
	 * @model containment="true"
	 * @generated
	 */
	EList<TrgArgument> getArguments();

	/**
	 * Returns the value of the '<em><b>Statements</b></em>' containment reference list.
	 * The list contents are of type {@link TrgStatement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Statements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Statements</em>' containment reference list.
	 * @see JointPackage_CPL2SPLPackage#getTrgMethod_Statements()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<TrgStatement> getStatements();

	/**
	 * Returns the value of the '<em><b>Branches</b></em>' containment reference list.
	 * The list contents are of type {@link TrgBranch}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Branches</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Branches</em>' containment reference list.
	 * @see JointPackage_CPL2SPLPackage#getTrgMethod_Branches()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<TrgBranch> getBranches();

} // TrgMethod

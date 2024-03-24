/**
 */
package jointPackage_CPL2SPL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trg Function Call Stat</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link TrgFunctionCallStat#getFunctionCall <em>Function Call</em>}</li>
 * </ul>
 *
 * @see JointPackage_CPL2SPLPackage#getTrgFunctionCallStat()
 * @model
 * @generated
 */
public interface TrgFunctionCallStat extends TrgStatement {
	/**
	 * Returns the value of the '<em><b>Function Call</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Function Call</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Function Call</em>' containment reference.
	 * @see #setFunctionCall(TrgFunctionCall)
	 * @see JointPackage_CPL2SPLPackage#getTrgFunctionCallStat_FunctionCall()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	TrgFunctionCall getFunctionCall();

	/**
	 * Sets the value of the '{@link TrgFunctionCallStat#getFunctionCall <em>Function Call</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Function Call</em>' containment reference.
	 * @see #getFunctionCall()
	 * @generated
	 */
	void setFunctionCall(TrgFunctionCall value);

} // TrgFunctionCallStat

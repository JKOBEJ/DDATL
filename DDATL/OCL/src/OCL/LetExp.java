/**
 */
package OCL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Let Exp</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link LetExp#getVariable <em>Variable</em>}</li>
 *   <li>{@link LetExp#getIn_ <em>In </em>}</li>
 * </ul>
 * </p>
 *
 * @see OCLPackage#getLetExp()
 * @model
 * @generated
 */
public interface LetExp extends OclExpression {
	/**
	 * Returns the value of the '<em><b>Variable</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link VariableDeclaration#getLetExp <em>Let Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variable</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable</em>' containment reference.
	 * @see #setVariable(VariableDeclaration)
	 * @see OCLPackage#getLetExp_Variable()
	 * @see VariableDeclaration#getLetExp
	 * @model opposite="letExp" containment="true" required="true" ordered="false"
	 * @generated
	 */
	VariableDeclaration getVariable();

	/**
	 * Sets the value of the '{@link LetExp#getVariable <em>Variable</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable</em>' containment reference.
	 * @see #getVariable()
	 * @generated
	 */
	void setVariable(VariableDeclaration value);

	/**
	 * Returns the value of the '<em><b>In </b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link OclExpression#getLetExp <em>Let Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In </em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In </em>' containment reference.
	 * @see #setIn_(OclExpression)
	 * @see OCLPackage#getLetExp_In_()
	 * @see OclExpression#getLetExp
	 * @model opposite="letExp" containment="true" required="true" ordered="false"
	 * @generated
	 */
	OclExpression getIn_();

	/**
	 * Sets the value of the '{@link LetExp#getIn_ <em>In </em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>In </em>' containment reference.
	 * @see #getIn_()
	 * @generated
	 */
	void setIn_(OclExpression value);

} // LetExp

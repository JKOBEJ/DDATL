/**
 */
package OCL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Loop Exp</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link LoopExp#getBody <em>Body</em>}</li>
 *   <li>{@link LoopExp#getIterators <em>Iterators</em>}</li>
 * </ul>
 * </p>
 *
 * @see OCLPackage#getLoopExp()
 * @model abstract="true"
 * @generated
 */
public interface LoopExp extends PropertyCallExp {
	/**
	 * Returns the value of the '<em><b>Body</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link OclExpression#getLoopExp <em>Loop Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Body</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body</em>' containment reference.
	 * @see #setBody(OclExpression)
	 * @see OCLPackage#getLoopExp_Body()
	 * @see OclExpression#getLoopExp
	 * @model opposite="loopExp" containment="true" required="true" ordered="false"
	 * @generated
	 */
	OclExpression getBody();

	/**
	 * Sets the value of the '{@link LoopExp#getBody <em>Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body</em>' containment reference.
	 * @see #getBody()
	 * @generated
	 */
	void setBody(OclExpression value);

	/**
	 * Returns the value of the '<em><b>Iterators</b></em>' containment reference list.
	 * The list contents are of type {@link Iterator}.
	 * It is bidirectional and its opposite is '{@link Iterator#getLoopExpr <em>Loop Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Iterators</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Iterators</em>' containment reference list.
	 * @see OCLPackage#getLoopExp_Iterators()
	 * @see Iterator#getLoopExpr
	 * @model type="OCL.Iterator" opposite="loopExpr" containment="true" required="true" ordered="false"
	 * @generated
	 */
	EList getIterators();

} // LoopExp

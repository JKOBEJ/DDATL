/**
 */
package OCL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tuple Exp</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link TupleExp#getTuplePart <em>Tuple Part</em>}</li>
 * </ul>
 * </p>
 *
 * @see OCLPackage#getTupleExp()
 * @model
 * @generated
 */
public interface TupleExp extends OclExpression {
	/**
	 * Returns the value of the '<em><b>Tuple Part</b></em>' containment reference list.
	 * The list contents are of type {@link TuplePart}.
	 * It is bidirectional and its opposite is '{@link TuplePart#getTuple <em>Tuple</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tuple Part</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tuple Part</em>' containment reference list.
	 * @see OCLPackage#getTupleExp_TuplePart()
	 * @see TuplePart#getTuple
	 * @model type="OCL.TuplePart" opposite="tuple" containment="true"
	 * @generated
	 */
	EList getTuplePart();

} // TupleExp

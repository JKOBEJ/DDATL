/**
 */
package OCL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tuple Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link TupleType#getAttributes <em>Attributes</em>}</li>
 * </ul>
 * </p>
 *
 * @see OCLPackage#getTupleType()
 * @model
 * @generated
 */
public interface TupleType extends OclType {
	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
	 * The list contents are of type {@link TupleTypeAttribute}.
	 * It is bidirectional and its opposite is '{@link TupleTypeAttribute#getTupleType <em>Tuple Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attributes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes</em>' containment reference list.
	 * @see OCLPackage#getTupleType_Attributes()
	 * @see TupleTypeAttribute#getTupleType
	 * @model type="OCL.TupleTypeAttribute" opposite="tupleType" containment="true"
	 * @generated
	 */
	EList getAttributes();

} // TupleType

/**
 */
package jointPackage_CPL2SPL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trg Sequence Constant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link TrgSequenceConstant#getValues <em>Values</em>}</li>
 * </ul>
 *
 * @see JointPackage_CPL2SPLPackage#getTrgSequenceConstant()
 * @model
 * @generated
 */
public interface TrgSequenceConstant extends TrgConstant {
	/**
	 * Returns the value of the '<em><b>Values</b></em>' containment reference list.
	 * The list contents are of type {@link TrgConstant}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Values</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Values</em>' containment reference list.
	 * @see JointPackage_CPL2SPLPackage#getTrgSequenceConstant_Values()
	 * @model containment="true"
	 * @generated
	 */
	EList<TrgConstant> getValues();

} // TrgSequenceConstant

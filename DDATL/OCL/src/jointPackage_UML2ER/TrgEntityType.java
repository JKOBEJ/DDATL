/**
 */
package jointPackage_UML2ER;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trg Entity Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link TrgEntityType#getFeatures <em>Features</em>}</li>
 * </ul>
 *
 * @see JointPackage_UML2ERPackage#getTrgEntityType()
 * @model
 * @generated
 */
public interface TrgEntityType extends TrgElement {
	/**
	 * Returns the value of the '<em><b>Features</b></em>' containment reference list.
	 * The list contents are of type {@link TrgFeature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Features</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Features</em>' containment reference list.
	 * @see JointPackage_UML2ERPackage#getTrgEntityType_Features()
	 * @model containment="true"
	 * @generated
	 */
	EList<TrgFeature> getFeatures();

} // TrgEntityType

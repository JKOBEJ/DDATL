/**
 */
package jointPackage_UML2ER;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Src Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link SrcPackage#getOwnedElements <em>Owned Elements</em>}</li>
 * </ul>
 *
 * @see JointPackage_UML2ERPackage#getSrcPackage()
 * @model
 * @generated
 */
public interface SrcPackage extends SrcNamedElement {
	/**
	 * Returns the value of the '<em><b>Owned Elements</b></em>' containment reference list.
	 * The list contents are of type {@link SrcClass}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Elements</em>' containment reference list.
	 * @see JointPackage_UML2ERPackage#getSrcPackage_OwnedElements()
	 * @model containment="true"
	 * @generated
	 */
	EList<SrcClass> getOwnedElements();

} // SrcPackage

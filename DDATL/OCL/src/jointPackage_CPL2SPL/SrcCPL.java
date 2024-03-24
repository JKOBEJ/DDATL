/**
 */
package jointPackage_CPL2SPL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Src CPL</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link SrcCPL#getSubActions <em>Sub Actions</em>}</li>
 *   <li>{@link SrcCPL#getOutgoing <em>Outgoing</em>}</li>
 *   <li>{@link SrcCPL#getIncoming <em>Incoming</em>}</li>
 * </ul>
 *
 * @see JointPackage_CPL2SPLPackage#getSrcCPL()
 * @model
 * @generated
 */
public interface SrcCPL extends SrcElement {
	/**
	 * Returns the value of the '<em><b>Sub Actions</b></em>' containment reference list.
	 * The list contents are of type {@link SrcSubAction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Actions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Actions</em>' containment reference list.
	 * @see JointPackage_CPL2SPLPackage#getSrcCPL_SubActions()
	 * @model containment="true"
	 * @generated
	 */
	EList<SrcSubAction> getSubActions();

	/**
	 * Returns the value of the '<em><b>Outgoing</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outgoing</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing</em>' containment reference.
	 * @see #setOutgoing(SrcOutgoing)
	 * @see JointPackage_CPL2SPLPackage#getSrcCPL_Outgoing()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	SrcOutgoing getOutgoing();

	/**
	 * Sets the value of the '{@link SrcCPL#getOutgoing <em>Outgoing</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Outgoing</em>' containment reference.
	 * @see #getOutgoing()
	 * @generated
	 */
	void setOutgoing(SrcOutgoing value);

	/**
	 * Returns the value of the '<em><b>Incoming</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incoming</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming</em>' containment reference.
	 * @see #setIncoming(SrcIncoming)
	 * @see JointPackage_CPL2SPLPackage#getSrcCPL_Incoming()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	SrcIncoming getIncoming();

	/**
	 * Sets the value of the '{@link SrcCPL#getIncoming <em>Incoming</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Incoming</em>' containment reference.
	 * @see #getIncoming()
	 * @generated
	 */
	void setIncoming(SrcIncoming value);

} // SrcCPL

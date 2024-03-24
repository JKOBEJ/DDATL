/**
 */
package jointPackage_CPL2SPL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trg SIP Header Place</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link TrgSIPHeaderPlace#getHeader <em>Header</em>}</li>
 * </ul>
 *
 * @see JointPackage_CPL2SPLPackage#getTrgSIPHeaderPlace()
 * @model
 * @generated
 */
public interface TrgSIPHeaderPlace extends TrgPlace {
	/**
	 * Returns the value of the '<em><b>Header</b></em>' attribute.
	 * The literals are from the enumeration {@link SIPHeader}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Header</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Header</em>' attribute.
	 * @see SIPHeader
	 * @see #setHeader(SIPHeader)
	 * @see JointPackage_CPL2SPLPackage#getTrgSIPHeaderPlace_Header()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	SIPHeader getHeader();

	/**
	 * Sets the value of the '{@link TrgSIPHeaderPlace#getHeader <em>Header</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Header</em>' attribute.
	 * @see SIPHeader
	 * @see #getHeader()
	 * @generated
	 */
	void setHeader(SIPHeader value);

} // TrgSIPHeaderPlace

/**
 */
package jointPackage_CPL2SPL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trg Client Error Response</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link TrgClientErrorResponse#getErrorKind <em>Error Kind</em>}</li>
 * </ul>
 *
 * @see JointPackage_CPL2SPLPackage#getTrgClientErrorResponse()
 * @model
 * @generated
 */
public interface TrgClientErrorResponse extends TrgErrorResponse {
	/**
	 * Returns the value of the '<em><b>Error Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link ClientErrorKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Error Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Error Kind</em>' attribute.
	 * @see ClientErrorKind
	 * @see #setErrorKind(ClientErrorKind)
	 * @see JointPackage_CPL2SPLPackage#getTrgClientErrorResponse_ErrorKind()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	ClientErrorKind getErrorKind();

	/**
	 * Sets the value of the '{@link TrgClientErrorResponse#getErrorKind <em>Error Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Error Kind</em>' attribute.
	 * @see ClientErrorKind
	 * @see #getErrorKind()
	 * @generated
	 */
	void setErrorKind(ClientErrorKind value);

} // TrgClientErrorResponse

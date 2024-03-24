/**
 */
package jointPackage_CPL2SPL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trg Redirection Error Response</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link TrgRedirectionErrorResponse#getErrorKind <em>Error Kind</em>}</li>
 * </ul>
 *
 * @see JointPackage_CPL2SPLPackage#getTrgRedirectionErrorResponse()
 * @model
 * @generated
 */
public interface TrgRedirectionErrorResponse extends TrgErrorResponse {
	/**
	 * Returns the value of the '<em><b>Error Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link RedirectionErrorKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Error Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Error Kind</em>' attribute.
	 * @see RedirectionErrorKind
	 * @see #setErrorKind(RedirectionErrorKind)
	 * @see JointPackage_CPL2SPLPackage#getTrgRedirectionErrorResponse_ErrorKind()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	RedirectionErrorKind getErrorKind();

	/**
	 * Sets the value of the '{@link TrgRedirectionErrorResponse#getErrorKind <em>Error Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Error Kind</em>' attribute.
	 * @see RedirectionErrorKind
	 * @see #getErrorKind()
	 * @generated
	 */
	void setErrorKind(RedirectionErrorKind value);

} // TrgRedirectionErrorResponse

/**
 */
package jointPackage_CPL2SPL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trg Global Error Response</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link TrgGlobalErrorResponse#getErrorKind <em>Error Kind</em>}</li>
 * </ul>
 *
 * @see JointPackage_CPL2SPLPackage#getTrgGlobalErrorResponse()
 * @model
 * @generated
 */
public interface TrgGlobalErrorResponse extends TrgErrorResponse {
	/**
	 * Returns the value of the '<em><b>Error Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link GlobalErrorKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Error Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Error Kind</em>' attribute.
	 * @see GlobalErrorKind
	 * @see #setErrorKind(GlobalErrorKind)
	 * @see JointPackage_CPL2SPLPackage#getTrgGlobalErrorResponse_ErrorKind()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	GlobalErrorKind getErrorKind();

	/**
	 * Sets the value of the '{@link TrgGlobalErrorResponse#getErrorKind <em>Error Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Error Kind</em>' attribute.
	 * @see GlobalErrorKind
	 * @see #getErrorKind()
	 * @generated
	 */
	void setErrorKind(GlobalErrorKind value);

} // TrgGlobalErrorResponse

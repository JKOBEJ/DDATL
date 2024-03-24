/**
 */
package jointPackage_CPL2SPL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trg Success Response</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link TrgSuccessResponse#getSuccessKind <em>Success Kind</em>}</li>
 * </ul>
 *
 * @see JointPackage_CPL2SPLPackage#getTrgSuccessResponse()
 * @model
 * @generated
 */
public interface TrgSuccessResponse extends TrgResponse {
	/**
	 * Returns the value of the '<em><b>Success Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link SuccessKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Success Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Success Kind</em>' attribute.
	 * @see SuccessKind
	 * @see #setSuccessKind(SuccessKind)
	 * @see JointPackage_CPL2SPLPackage#getTrgSuccessResponse_SuccessKind()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	SuccessKind getSuccessKind();

	/**
	 * Sets the value of the '{@link TrgSuccessResponse#getSuccessKind <em>Success Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Success Kind</em>' attribute.
	 * @see SuccessKind
	 * @see #getSuccessKind()
	 * @generated
	 */
	void setSuccessKind(SuccessKind value);

} // TrgSuccessResponse

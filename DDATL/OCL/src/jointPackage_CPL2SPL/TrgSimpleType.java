/**
 */
package jointPackage_CPL2SPL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trg Simple Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link TrgSimpleType#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see JointPackage_CPL2SPLPackage#getTrgSimpleType()
 * @model
 * @generated
 */
public interface TrgSimpleType extends TrgTypeExpression {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link PrimitiveType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see PrimitiveType
	 * @see #setType(PrimitiveType)
	 * @see JointPackage_CPL2SPLPackage#getTrgSimpleType_Type()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	PrimitiveType getType();

	/**
	 * Sets the value of the '{@link TrgSimpleType#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see PrimitiveType
	 * @see #getType()
	 * @generated
	 */
	void setType(PrimitiveType value);

} // TrgSimpleType

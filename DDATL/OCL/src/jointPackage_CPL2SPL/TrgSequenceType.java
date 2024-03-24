/**
 */
package jointPackage_CPL2SPL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trg Sequence Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link TrgSequenceType#getModifier <em>Modifier</em>}</li>
 *   <li>{@link TrgSequenceType#getType <em>Type</em>}</li>
 *   <li>{@link TrgSequenceType#getSize <em>Size</em>}</li>
 * </ul>
 *
 * @see JointPackage_CPL2SPLPackage#getTrgSequenceType()
 * @model
 * @generated
 */
public interface TrgSequenceType extends TrgTypeExpression {
	/**
	 * Returns the value of the '<em><b>Modifier</b></em>' attribute.
	 * The literals are from the enumeration {@link Modifier}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Modifier</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modifier</em>' attribute.
	 * @see Modifier
	 * @see #setModifier(Modifier)
	 * @see JointPackage_CPL2SPLPackage#getTrgSequenceType_Modifier()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	Modifier getModifier();

	/**
	 * Sets the value of the '{@link TrgSequenceType#getModifier <em>Modifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Modifier</em>' attribute.
	 * @see Modifier
	 * @see #getModifier()
	 * @generated
	 */
	void setModifier(Modifier value);

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
	 * @see JointPackage_CPL2SPLPackage#getTrgSequenceType_Type()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	PrimitiveType getType();

	/**
	 * Sets the value of the '{@link TrgSequenceType#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see PrimitiveType
	 * @see #getType()
	 * @generated
	 */
	void setType(PrimitiveType value);

	/**
	 * Returns the value of the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size</em>' attribute.
	 * @see #setSize(int)
	 * @see JointPackage_CPL2SPLPackage#getTrgSequenceType_Size()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	int getSize();

	/**
	 * Sets the value of the '{@link TrgSequenceType#getSize <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size</em>' attribute.
	 * @see #getSize()
	 * @generated
	 */
	void setSize(int value);

} // TrgSequenceType

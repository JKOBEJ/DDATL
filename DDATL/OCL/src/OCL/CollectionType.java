/**
 */
package OCL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Collection Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CollectionType#getElementType <em>Element Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see OCLPackage#getCollectionType()
 * @model
 * @generated
 */
public interface CollectionType extends OclType {
	/**
	 * Returns the value of the '<em><b>Element Type</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link OclType#getCollectionTypes <em>Collection Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Element Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element Type</em>' containment reference.
	 * @see #setElementType(OclType)
	 * @see OCLPackage#getCollectionType_ElementType()
	 * @see OclType#getCollectionTypes
	 * @model opposite="collectionTypes" containment="true" required="true" ordered="false"
	 * @generated
	 */
	OclType getElementType();

	/**
	 * Sets the value of the '{@link CollectionType#getElementType <em>Element Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element Type</em>' containment reference.
	 * @see #getElementType()
	 * @generated
	 */
	void setElementType(OclType value);

} // CollectionType

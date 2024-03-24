/**
 */
package jointPackage_CPL2SPL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trg Control Method Name</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link TrgControlMethodName#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see JointPackage_CPL2SPLPackage#getTrgControlMethodName()
 * @model
 * @generated
 */
public interface TrgControlMethodName extends TrgMethodName {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The literals are from the enumeration {@link ControlMethod}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see ControlMethod
	 * @see #setName(ControlMethod)
	 * @see JointPackage_CPL2SPLPackage#getTrgControlMethodName_Name()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	ControlMethod getName();

	/**
	 * Sets the value of the '{@link TrgControlMethodName#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see ControlMethod
	 * @see #getName()
	 * @generated
	 */
	void setName(ControlMethod value);

} // TrgControlMethodName

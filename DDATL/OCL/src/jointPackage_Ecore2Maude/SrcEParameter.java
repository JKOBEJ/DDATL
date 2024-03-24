/**
 */
package jointPackage_Ecore2Maude;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Src EParameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link SrcEParameter#getEOperation <em>EOperation</em>}</li>
 * </ul>
 *
 * @see JointPackage_Ecore2MaudePackage#getSrcEParameter()
 * @model
 * @generated
 */
public interface SrcEParameter extends SrcETypedElement {
	/**
	 * Returns the value of the '<em><b>EOperation</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link SrcEOperation#getEParameters <em>EParameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EOperation</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EOperation</em>' container reference.
	 * @see JointPackage_Ecore2MaudePackage#getSrcEParameter_EOperation()
	 * @see SrcEOperation#getEParameters
	 * @model opposite="eParameters" resolveProxies="false" changeable="false"
	 * @generated
	 */
	SrcEOperation getEOperation();

} // SrcEParameter

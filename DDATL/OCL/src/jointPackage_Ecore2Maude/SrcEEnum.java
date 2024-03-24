/**
 */
package jointPackage_Ecore2Maude;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Src EEnum</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link SrcEEnum#getELiterals <em>ELiterals</em>}</li>
 * </ul>
 *
 * @see JointPackage_Ecore2MaudePackage#getSrcEEnum()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='UniqueEnumeratorNames UniqueEnumeratorLiterals'"
 * @generated
 */
public interface SrcEEnum extends SrcEDataType {
	/**
	 * Returns the value of the '<em><b>ELiterals</b></em>' containment reference list.
	 * The list contents are of type {@link SrcEEnumLiteral}.
	 * It is bidirectional and its opposite is '{@link SrcEEnumLiteral#getEEnum <em>EEnum</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ELiterals</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ELiterals</em>' containment reference list.
	 * @see JointPackage_Ecore2MaudePackage#getSrcEEnum_ELiterals()
	 * @see SrcEEnumLiteral#getEEnum
	 * @model opposite="eEnum" containment="true"
	 * @generated
	 */
	EList<SrcEEnumLiteral> getELiterals();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	SrcEEnumLiteral getEEnumLiteral(String name);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	SrcEEnumLiteral getEEnumLiteral(int value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	SrcEEnumLiteral getEEnumLiteralByLiteral(String literal);

} // SrcEEnum

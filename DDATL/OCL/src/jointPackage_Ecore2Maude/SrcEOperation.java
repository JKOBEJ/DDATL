/**
 */
package jointPackage_Ecore2Maude;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Src EOperation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link SrcEOperation#getEContainingClass <em>EContaining Class</em>}</li>
 *   <li>{@link SrcEOperation#getEParameters <em>EParameters</em>}</li>
 *   <li>{@link SrcEOperation#getEExceptions <em>EExceptions</em>}</li>
 * </ul>
 *
 * @see JointPackage_Ecore2MaudePackage#getSrcEOperation()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='UniqueParameterNames UniqueTypeParameterNames NoRepeatingVoid'"
 * @generated
 */
public interface SrcEOperation extends SrcETypedElement {
	/**
	 * Returns the value of the '<em><b>EContaining Class</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link SrcEClass#getEOperations <em>EOperations</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EContaining Class</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EContaining Class</em>' container reference.
	 * @see JointPackage_Ecore2MaudePackage#getSrcEOperation_EContainingClass()
	 * @see SrcEClass#getEOperations
	 * @model opposite="eOperations" resolveProxies="false" changeable="false"
	 * @generated
	 */
	SrcEClass getEContainingClass();

	/**
	 * Returns the value of the '<em><b>EParameters</b></em>' containment reference list.
	 * The list contents are of type {@link SrcEParameter}.
	 * It is bidirectional and its opposite is '{@link SrcEParameter#getEOperation <em>EOperation</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EParameters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EParameters</em>' containment reference list.
	 * @see JointPackage_Ecore2MaudePackage#getSrcEOperation_EParameters()
	 * @see SrcEParameter#getEOperation
	 * @model opposite="eOperation" containment="true"
	 * @generated
	 */
	EList<SrcEParameter> getEParameters();

	/**
	 * Returns the value of the '<em><b>EExceptions</b></em>' reference list.
	 * The list contents are of type {@link SrcEClassifier}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EExceptions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EExceptions</em>' reference list.
	 * @see JointPackage_Ecore2MaudePackage#getSrcEOperation_EExceptions()
	 * @model unsettable="true" suppressedIsSetVisibility="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	EList<SrcEClassifier> getEExceptions();

} // SrcEOperation

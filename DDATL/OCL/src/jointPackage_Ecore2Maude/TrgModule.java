/**
 */
package jointPackage_Ecore2Maude;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trg Module</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link TrgModule#getEls <em>Els</em>}</li>
 *   <li>{@link TrgModule#getParams <em>Params</em>}</li>
 * </ul>
 *
 * @see JointPackage_Ecore2MaudePackage#getTrgModule()
 * @model abstract="true"
 * @generated
 */
public interface TrgModule extends TrgMaudeTopEl {
	/**
	 * Returns the value of the '<em><b>Els</b></em>' containment reference list.
	 * The list contents are of type {@link TrgModElement}.
	 * It is bidirectional and its opposite is '{@link TrgModElement#getModule <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Els</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Els</em>' containment reference list.
	 * @see JointPackage_Ecore2MaudePackage#getTrgModule_Els()
	 * @see TrgModElement#getModule
	 * @model opposite="module" containment="true" ordered="false"
	 * @generated
	 */
	EList<TrgModElement> getEls();

	/**
	 * Returns the value of the '<em><b>Params</b></em>' containment reference list.
	 * The list contents are of type {@link TrgParameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Params</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Params</em>' containment reference list.
	 * @see JointPackage_Ecore2MaudePackage#getTrgModule_Params()
	 * @model containment="true"
	 * @generated
	 */
	EList<TrgParameter> getParams();

} // TrgModule

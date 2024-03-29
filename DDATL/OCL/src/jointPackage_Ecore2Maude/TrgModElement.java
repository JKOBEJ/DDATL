/**
 */
package jointPackage_Ecore2Maude;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trg Mod Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link TrgModElement#getModule <em>Module</em>}</li>
 *   <li>{@link TrgModElement#getTheory <em>Theory</em>}</li>
 * </ul>
 *
 * @see JointPackage_Ecore2MaudePackage#getTrgModElement()
 * @model abstract="true"
 * @generated
 */
public interface TrgModElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Module</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link TrgModule#getEls <em>Els</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Module</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Module</em>' container reference.
	 * @see #setModule(TrgModule)
	 * @see JointPackage_Ecore2MaudePackage#getTrgModElement_Module()
	 * @see TrgModule#getEls
	 * @model opposite="els" transient="false" ordered="false"
	 * @generated
	 */
	TrgModule getModule();

	/**
	 * Sets the value of the '{@link TrgModElement#getModule <em>Module</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Module</em>' container reference.
	 * @see #getModule()
	 * @generated
	 */
	void setModule(TrgModule value);

	/**
	 * Returns the value of the '<em><b>Theory</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link TrgTheory#getEls <em>Els</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Theory</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Theory</em>' container reference.
	 * @see #setTheory(TrgTheory)
	 * @see JointPackage_Ecore2MaudePackage#getTrgModElement_Theory()
	 * @see TrgTheory#getEls
	 * @model opposite="els" transient="false" ordered="false"
	 * @generated
	 */
	TrgTheory getTheory();

	/**
	 * Sets the value of the '{@link TrgModElement#getTheory <em>Theory</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Theory</em>' container reference.
	 * @see #getTheory()
	 * @generated
	 */
	void setTheory(TrgTheory value);

} // TrgModElement

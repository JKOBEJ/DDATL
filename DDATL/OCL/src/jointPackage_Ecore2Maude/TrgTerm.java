/**
 */
package jointPackage_Ecore2Maude;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trg Term</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link TrgTerm#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see JointPackage_Ecore2MaudePackage#getTrgTerm()
 * @model abstract="true"
 * @generated
 */
public interface TrgTerm extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(TrgType)
	 * @see JointPackage_Ecore2MaudePackage#getTrgTerm_Type()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	TrgType getType();

	/**
	 * Sets the value of the '{@link TrgTerm#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(TrgType value);

} // TrgTerm

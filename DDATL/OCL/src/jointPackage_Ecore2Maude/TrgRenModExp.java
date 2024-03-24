/**
 */
package jointPackage_Ecore2Maude;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trg Ren Mod Exp</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link TrgRenModExp#getModExp <em>Mod Exp</em>}</li>
 *   <li>{@link TrgRenModExp#getRenamings <em>Renamings</em>}</li>
 * </ul>
 *
 * @see JointPackage_Ecore2MaudePackage#getTrgRenModExp()
 * @model
 * @generated
 */
public interface TrgRenModExp extends TrgModExpression {
	/**
	 * Returns the value of the '<em><b>Mod Exp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mod Exp</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mod Exp</em>' containment reference.
	 * @see #setModExp(TrgModExpression)
	 * @see JointPackage_Ecore2MaudePackage#getTrgRenModExp_ModExp()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	TrgModExpression getModExp();

	/**
	 * Sets the value of the '{@link TrgRenModExp#getModExp <em>Mod Exp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mod Exp</em>' containment reference.
	 * @see #getModExp()
	 * @generated
	 */
	void setModExp(TrgModExpression value);

	/**
	 * Returns the value of the '<em><b>Renamings</b></em>' containment reference list.
	 * The list contents are of type {@link TrgRenMapping}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Renamings</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Renamings</em>' containment reference list.
	 * @see JointPackage_Ecore2MaudePackage#getTrgRenModExp_Renamings()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	EList<TrgRenMapping> getRenamings();

} // TrgRenModExp

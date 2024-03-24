/**
 */
package jointPackage_Ecore2Maude;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trg Comp Mod Exp</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link TrgCompModExp#getModExps <em>Mod Exps</em>}</li>
 * </ul>
 *
 * @see JointPackage_Ecore2MaudePackage#getTrgCompModExp()
 * @model
 * @generated
 */
public interface TrgCompModExp extends TrgModExpression {
	/**
	 * Returns the value of the '<em><b>Mod Exps</b></em>' containment reference list.
	 * The list contents are of type {@link TrgModExpression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mod Exps</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mod Exps</em>' containment reference list.
	 * @see JointPackage_Ecore2MaudePackage#getTrgCompModExp_ModExps()
	 * @model containment="true" lower="2" ordered="false"
	 * @generated
	 */
	EList<TrgModExpression> getModExps();

} // TrgCompModExp

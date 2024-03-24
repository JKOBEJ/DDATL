/**
 */
package jointPackage_Ecore2Maude;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trg Sort</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link TrgSort#getSubsortRels <em>Subsort Rels</em>}</li>
 *   <li>{@link TrgSort#getSupersortRels <em>Supersort Rels</em>}</li>
 *   <li>{@link TrgSort#getKind <em>Kind</em>}</li>
 * </ul>
 *
 * @see JointPackage_Ecore2MaudePackage#getTrgSort()
 * @model
 * @generated
 */
public interface TrgSort extends TrgType, TrgModElement {
	/**
	 * Returns the value of the '<em><b>Subsort Rels</b></em>' reference list.
	 * The list contents are of type {@link TrgSubsortRel}.
	 * It is bidirectional and its opposite is '{@link TrgSubsortRel#getSupersorts <em>Supersorts</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subsort Rels</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subsort Rels</em>' reference list.
	 * @see JointPackage_Ecore2MaudePackage#getTrgSort_SubsortRels()
	 * @see TrgSubsortRel#getSupersorts
	 * @model opposite="supersorts" ordered="false"
	 * @generated
	 */
	EList<TrgSubsortRel> getSubsortRels();

	/**
	 * Returns the value of the '<em><b>Supersort Rels</b></em>' reference list.
	 * The list contents are of type {@link TrgSubsortRel}.
	 * It is bidirectional and its opposite is '{@link TrgSubsortRel#getSubsorts <em>Subsorts</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Supersort Rels</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supersort Rels</em>' reference list.
	 * @see JointPackage_Ecore2MaudePackage#getTrgSort_SupersortRels()
	 * @see TrgSubsortRel#getSubsorts
	 * @model opposite="subsorts" ordered="false"
	 * @generated
	 */
	EList<TrgSubsortRel> getSupersortRels();

	/**
	 * Returns the value of the '<em><b>Kind</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link TrgKind#getSorts <em>Sorts</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' reference.
	 * @see #setKind(TrgKind)
	 * @see JointPackage_Ecore2MaudePackage#getTrgSort_Kind()
	 * @see TrgKind#getSorts
	 * @model opposite="sorts" required="true" ordered="false"
	 * @generated
	 */
	TrgKind getKind();

	/**
	 * Sets the value of the '{@link TrgSort#getKind <em>Kind</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' reference.
	 * @see #getKind()
	 * @generated
	 */
	void setKind(TrgKind value);

} // TrgSort

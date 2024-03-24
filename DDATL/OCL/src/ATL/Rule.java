/**
 */
package ATL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Rule#getOutPattern <em>Out Pattern</em>}</li>
 *   <li>{@link Rule#getActionBlock <em>Action Block</em>}</li>
 *   <li>{@link Rule#getVariables <em>Variables</em>}</li>
 *   <li>{@link Rule#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see ATLPackage#getRule()
 * @model abstract="true"
 * @generated
 */
public interface Rule extends ModuleElement {
	/**
	 * Returns the value of the '<em><b>Out Pattern</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link OutPattern#getRule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Out Pattern</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Out Pattern</em>' containment reference.
	 * @see #setOutPattern(OutPattern)
	 * @see ATLPackage#getRule_OutPattern()
	 * @see OutPattern#getRule
	 * @model opposite="rule" containment="true" ordered="false"
	 * @generated
	 */
	OutPattern getOutPattern();

	/**
	 * Sets the value of the '{@link Rule#getOutPattern <em>Out Pattern</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Out Pattern</em>' containment reference.
	 * @see #getOutPattern()
	 * @generated
	 */
	void setOutPattern(OutPattern value);

	/**
	 * Returns the value of the '<em><b>Action Block</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link ActionBlock#getRule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Action Block</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action Block</em>' containment reference.
	 * @see #setActionBlock(ActionBlock)
	 * @see ATLPackage#getRule_ActionBlock()
	 * @see ActionBlock#getRule
	 * @model opposite="rule" containment="true" ordered="false"
	 * @generated
	 */
	ActionBlock getActionBlock();

	/**
	 * Sets the value of the '{@link Rule#getActionBlock <em>Action Block</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action Block</em>' containment reference.
	 * @see #getActionBlock()
	 * @generated
	 */
	void setActionBlock(ActionBlock value);

	/**
	 * Returns the value of the '<em><b>Variables</b></em>' containment reference list.
	 * The list contents are of type {@link RuleVariableDeclaration}.
	 * It is bidirectional and its opposite is '{@link RuleVariableDeclaration#getRule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variables</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variables</em>' containment reference list.
	 * @see ATLPackage#getRule_Variables()
	 * @see RuleVariableDeclaration#getRule
	 * @model type="ATL.RuleVariableDeclaration" opposite="rule" containment="true"
	 * @generated
	 */
	EList getVariables();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see ATLPackage#getRule_Name()
	 * @model unique="false" dataType="PrimitiveTypes.String" required="true" ordered="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link Rule#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Rule

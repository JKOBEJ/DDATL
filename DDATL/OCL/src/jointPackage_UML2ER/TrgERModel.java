/**
 */
package jointPackage_UML2ER;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trg ER Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link TrgERModel#getEntities <em>Entities</em>}</li>
 * </ul>
 *
 * @see JointPackage_UML2ERPackage#getTrgERModel()
 * @model
 * @generated
 */
public interface TrgERModel extends TrgElement {
	/**
	 * Returns the value of the '<em><b>Entities</b></em>' containment reference list.
	 * The list contents are of type {@link TrgEntityType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entities</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entities</em>' containment reference list.
	 * @see JointPackage_UML2ERPackage#getTrgERModel_Entities()
	 * @model containment="true"
	 * @generated
	 */
	EList<TrgEntityType> getEntities();

} // TrgERModel

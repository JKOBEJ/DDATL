/**
 */
package OCL;

import ATL.LocatedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ocl Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link OclFeature#getDefinition <em>Definition</em>}</li>
 * </ul>
 * </p>
 *
 * @see OCLPackage#getOclFeature()
 * @model abstract="true"
 * @generated
 */
public interface OclFeature extends LocatedElement {
	/**
	 * Returns the value of the '<em><b>Definition</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link OclFeatureDefinition#getFeature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Definition</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Definition</em>' container reference.
	 * @see #setDefinition(OclFeatureDefinition)
	 * @see OCLPackage#getOclFeature_Definition()
	 * @see OclFeatureDefinition#getFeature
	 * @model opposite="feature" transient="false" ordered="false"
	 * @generated
	 */
	OclFeatureDefinition getDefinition();

	/**
	 * Sets the value of the '{@link OclFeature#getDefinition <em>Definition</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Definition</em>' container reference.
	 * @see #getDefinition()
	 * @generated
	 */
	void setDefinition(OclFeatureDefinition value);

} // OclFeature

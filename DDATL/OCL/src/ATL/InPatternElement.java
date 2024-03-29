/**
 */
package ATL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>In Pattern Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link InPatternElement#getMapsTo <em>Maps To</em>}</li>
 *   <li>{@link InPatternElement#getInPattern <em>In Pattern</em>}</li>
 *   <li>{@link InPatternElement#getModels <em>Models</em>}</li>
 * </ul>
 * </p>
 *
 * @see ATLPackage#getInPatternElement()
 * @model abstract="true"
 * @generated
 */
public interface InPatternElement extends PatternElement {
	/**
	 * Returns the value of the '<em><b>Maps To</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link OutPatternElement#getSourceElement <em>Source Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Maps To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maps To</em>' reference.
	 * @see #setMapsTo(OutPatternElement)
	 * @see ATLPackage#getInPatternElement_MapsTo()
	 * @see OutPatternElement#getSourceElement
	 * @model opposite="sourceElement" required="true" ordered="false"
	 * @generated
	 */
	OutPatternElement getMapsTo();

	/**
	 * Sets the value of the '{@link InPatternElement#getMapsTo <em>Maps To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maps To</em>' reference.
	 * @see #getMapsTo()
	 * @generated
	 */
	void setMapsTo(OutPatternElement value);

	/**
	 * Returns the value of the '<em><b>In Pattern</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link InPattern#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In Pattern</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In Pattern</em>' container reference.
	 * @see #setInPattern(InPattern)
	 * @see ATLPackage#getInPatternElement_InPattern()
	 * @see InPattern#getElements
	 * @model opposite="elements" required="true" transient="false" ordered="false"
	 * @generated
	 */
	InPattern getInPattern();

	/**
	 * Sets the value of the '{@link InPatternElement#getInPattern <em>In Pattern</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>In Pattern</em>' container reference.
	 * @see #getInPattern()
	 * @generated
	 */
	void setInPattern(InPattern value);

	/**
	 * Returns the value of the '<em><b>Models</b></em>' reference list.
	 * The list contents are of type {@link OCL.OclModel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Models</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Models</em>' reference list.
	 * @see ATLPackage#getInPatternElement_Models()
	 * @model type="OCL.OclModel" ordered="false"
	 * @generated
	 */
	EList getModels();

} // InPatternElement

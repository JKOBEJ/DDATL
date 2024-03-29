/**
 */
package jointPackage_BibTeX2DocBook;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Src Article</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link SrcArticle#getJournal <em>Journal</em>}</li>
 * </ul>
 *
 * @see JointPackage_BibTeX2DocBookPackage#getSrcArticle()
 * @model
 * @generated
 */
public interface SrcArticle extends SrcAuthoredEntry, SrcDatedEntry, SrcTitledEntry {
	/**
	 * Returns the value of the '<em><b>Journal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Journal</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Journal</em>' attribute.
	 * @see #setJournal(String)
	 * @see JointPackage_BibTeX2DocBookPackage#getSrcArticle_Journal()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getJournal();

	/**
	 * Sets the value of the '{@link SrcArticle#getJournal <em>Journal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Journal</em>' attribute.
	 * @see #getJournal()
	 * @generated
	 */
	void setJournal(String value);

} // SrcArticle

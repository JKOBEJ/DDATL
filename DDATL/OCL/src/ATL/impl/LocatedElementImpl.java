/**
 */
package ATL.impl;

import ATL.ATLPackage;
import ATL.LocatedElement;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Located Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link LocatedElementImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link LocatedElementImpl#getCommentsBefore <em>Comments Before</em>}</li>
 *   <li>{@link LocatedElementImpl#getCommentsAfter <em>Comments After</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class LocatedElementImpl extends MinimalEObjectImpl.Container implements LocatedElement {
	/**
	 * The default value of the '{@link #getLocation() <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected static final String LOCATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLocation() <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected String location = LOCATION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCommentsBefore() <em>Comments Before</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommentsBefore()
	 * @generated
	 * @ordered
	 */
	protected EList commentsBefore;

	/**
	 * The cached value of the '{@link #getCommentsAfter() <em>Comments After</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommentsAfter()
	 * @generated
	 * @ordered
	 */
	protected EList commentsAfter;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LocatedElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return ATLPackage.Literals.LOCATED_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLocation() {
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocation(String newLocation) {
		String oldLocation = location;
		location = newLocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ATLPackage.LOCATED_ELEMENT__LOCATION, oldLocation, location));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getCommentsBefore() {
		if (commentsBefore == null) {
			commentsBefore = new EDataTypeEList(String.class, this, ATLPackage.LOCATED_ELEMENT__COMMENTS_BEFORE);
		}
		return commentsBefore;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getCommentsAfter() {
		if (commentsAfter == null) {
			commentsAfter = new EDataTypeEList(String.class, this, ATLPackage.LOCATED_ELEMENT__COMMENTS_AFTER);
		}
		return commentsAfter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ATLPackage.LOCATED_ELEMENT__LOCATION:
				return getLocation();
			case ATLPackage.LOCATED_ELEMENT__COMMENTS_BEFORE:
				return getCommentsBefore();
			case ATLPackage.LOCATED_ELEMENT__COMMENTS_AFTER:
				return getCommentsAfter();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ATLPackage.LOCATED_ELEMENT__LOCATION:
				setLocation((String)newValue);
				return;
			case ATLPackage.LOCATED_ELEMENT__COMMENTS_BEFORE:
				getCommentsBefore().clear();
				getCommentsBefore().addAll((Collection)newValue);
				return;
			case ATLPackage.LOCATED_ELEMENT__COMMENTS_AFTER:
				getCommentsAfter().clear();
				getCommentsAfter().addAll((Collection)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(int featureID) {
		switch (featureID) {
			case ATLPackage.LOCATED_ELEMENT__LOCATION:
				setLocation(LOCATION_EDEFAULT);
				return;
			case ATLPackage.LOCATED_ELEMENT__COMMENTS_BEFORE:
				getCommentsBefore().clear();
				return;
			case ATLPackage.LOCATED_ELEMENT__COMMENTS_AFTER:
				getCommentsAfter().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ATLPackage.LOCATED_ELEMENT__LOCATION:
				return LOCATION_EDEFAULT == null ? location != null : !LOCATION_EDEFAULT.equals(location);
			case ATLPackage.LOCATED_ELEMENT__COMMENTS_BEFORE:
				return commentsBefore != null && !commentsBefore.isEmpty();
			case ATLPackage.LOCATED_ELEMENT__COMMENTS_AFTER:
				return commentsAfter != null && !commentsAfter.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (location: ");
		result.append(location);
		result.append(", commentsBefore: ");
		result.append(commentsBefore);
		result.append(", commentsAfter: ");
		result.append(commentsAfter);
		result.append(')');
		return result.toString();
	}

} //LocatedElementImpl

/**
 */
package jointPackage_CPL2SPL.impl;

import jointPackage_CPL2SPL.ClientErrorKind;
import jointPackage_CPL2SPL.JointPackage_CPL2SPLPackage;
import jointPackage_CPL2SPL.TrgClientErrorResponse;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Trg Client Error Response</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link TrgClientErrorResponseImpl#getErrorKind <em>Error Kind</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TrgClientErrorResponseImpl extends TrgErrorResponseImpl implements TrgClientErrorResponse {
	/**
	 * The default value of the '{@link #getErrorKind() <em>Error Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrorKind()
	 * @generated
	 * @ordered
	 */
	protected static final ClientErrorKind ERROR_KIND_EDEFAULT = ClientErrorKind.ADDRESS_INCOMPLETE;

	/**
	 * The cached value of the '{@link #getErrorKind() <em>Error Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrorKind()
	 * @generated
	 * @ordered
	 */
	protected ClientErrorKind errorKind = ERROR_KIND_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TrgClientErrorResponseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JointPackage_CPL2SPLPackage.Literals.TRG_CLIENT_ERROR_RESPONSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClientErrorKind getErrorKind() {
		return errorKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setErrorKind(ClientErrorKind newErrorKind) {
		ClientErrorKind oldErrorKind = errorKind;
		errorKind = newErrorKind == null ? ERROR_KIND_EDEFAULT : newErrorKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JointPackage_CPL2SPLPackage.TRG_CLIENT_ERROR_RESPONSE__ERROR_KIND, oldErrorKind, errorKind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case JointPackage_CPL2SPLPackage.TRG_CLIENT_ERROR_RESPONSE__ERROR_KIND:
				return getErrorKind();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case JointPackage_CPL2SPLPackage.TRG_CLIENT_ERROR_RESPONSE__ERROR_KIND:
				setErrorKind((ClientErrorKind)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case JointPackage_CPL2SPLPackage.TRG_CLIENT_ERROR_RESPONSE__ERROR_KIND:
				setErrorKind(ERROR_KIND_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case JointPackage_CPL2SPLPackage.TRG_CLIENT_ERROR_RESPONSE__ERROR_KIND:
				return errorKind != ERROR_KIND_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (errorKind: ");
		result.append(errorKind);
		result.append(')');
		return result.toString();
	}

} //TrgClientErrorResponseImpl

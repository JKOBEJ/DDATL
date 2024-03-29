/**
 */
package jointPackage_Ecore2Maude.impl;

import jointPackage_Ecore2Maude.JointPackage_Ecore2MaudePackage;
import jointPackage_Ecore2Maude.SrcEDataType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Src EData Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link SrcEDataTypeImpl#isSerializable <em>Serializable</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SrcEDataTypeImpl extends SrcEClassifierImpl implements SrcEDataType {
	/**
	 * The default value of the '{@link #isSerializable() <em>Serializable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSerializable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SERIALIZABLE_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isSerializable() <em>Serializable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSerializable()
	 * @generated
	 * @ordered
	 */
	protected boolean serializable = SERIALIZABLE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SrcEDataTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JointPackage_Ecore2MaudePackage.Literals.SRC_EDATA_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSerializable() {
		return serializable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSerializable(boolean newSerializable) {
		boolean oldSerializable = serializable;
		serializable = newSerializable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JointPackage_Ecore2MaudePackage.SRC_EDATA_TYPE__SERIALIZABLE, oldSerializable, serializable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case JointPackage_Ecore2MaudePackage.SRC_EDATA_TYPE__SERIALIZABLE:
				return isSerializable();
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
			case JointPackage_Ecore2MaudePackage.SRC_EDATA_TYPE__SERIALIZABLE:
				setSerializable((Boolean)newValue);
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
			case JointPackage_Ecore2MaudePackage.SRC_EDATA_TYPE__SERIALIZABLE:
				setSerializable(SERIALIZABLE_EDEFAULT);
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
			case JointPackage_Ecore2MaudePackage.SRC_EDATA_TYPE__SERIALIZABLE:
				return serializable != SERIALIZABLE_EDEFAULT;
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
		result.append(" (serializable: ");
		result.append(serializable);
		result.append(')');
		return result.toString();
	}

} //SrcEDataTypeImpl

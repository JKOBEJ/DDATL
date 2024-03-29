/**
 */
package ATL.impl;

import ATL.ATLPackage;
import ATL.IfStat;
import ATL.Statement;

import OCL.OclExpression;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>If Stat</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IfStatImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link IfStatImpl#getThenStatements <em>Then Statements</em>}</li>
 *   <li>{@link IfStatImpl#getElseStatements <em>Else Statements</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfStatImpl extends StatementImpl implements IfStat {
	/**
	 * The cached value of the '{@link #getCondition() <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected OclExpression condition;

	/**
	 * The cached value of the '{@link #getThenStatements() <em>Then Statements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThenStatements()
	 * @generated
	 * @ordered
	 */
	protected EList thenStatements;

	/**
	 * The cached value of the '{@link #getElseStatements() <em>Else Statements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElseStatements()
	 * @generated
	 * @ordered
	 */
	protected EList elseStatements;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfStatImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return ATLPackage.Literals.IF_STAT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OclExpression getCondition() {
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCondition(OclExpression newCondition, NotificationChain msgs) {
		OclExpression oldCondition = condition;
		condition = newCondition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ATLPackage.IF_STAT__CONDITION, oldCondition, newCondition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCondition(OclExpression newCondition) {
		if (newCondition != condition) {
			NotificationChain msgs = null;
			if (condition != null)
				msgs = ((InternalEObject)condition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ATLPackage.IF_STAT__CONDITION, null, msgs);
			if (newCondition != null)
				msgs = ((InternalEObject)newCondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ATLPackage.IF_STAT__CONDITION, null, msgs);
			msgs = basicSetCondition(newCondition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ATLPackage.IF_STAT__CONDITION, newCondition, newCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getThenStatements() {
		if (thenStatements == null) {
			thenStatements = new EObjectContainmentEList(Statement.class, this, ATLPackage.IF_STAT__THEN_STATEMENTS);
		}
		return thenStatements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getElseStatements() {
		if (elseStatements == null) {
			elseStatements = new EObjectContainmentEList(Statement.class, this, ATLPackage.IF_STAT__ELSE_STATEMENTS);
		}
		return elseStatements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ATLPackage.IF_STAT__CONDITION:
				return basicSetCondition(null, msgs);
			case ATLPackage.IF_STAT__THEN_STATEMENTS:
				return ((InternalEList)getThenStatements()).basicRemove(otherEnd, msgs);
			case ATLPackage.IF_STAT__ELSE_STATEMENTS:
				return ((InternalEList)getElseStatements()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ATLPackage.IF_STAT__CONDITION:
				return getCondition();
			case ATLPackage.IF_STAT__THEN_STATEMENTS:
				return getThenStatements();
			case ATLPackage.IF_STAT__ELSE_STATEMENTS:
				return getElseStatements();
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
			case ATLPackage.IF_STAT__CONDITION:
				setCondition((OclExpression)newValue);
				return;
			case ATLPackage.IF_STAT__THEN_STATEMENTS:
				getThenStatements().clear();
				getThenStatements().addAll((Collection)newValue);
				return;
			case ATLPackage.IF_STAT__ELSE_STATEMENTS:
				getElseStatements().clear();
				getElseStatements().addAll((Collection)newValue);
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
			case ATLPackage.IF_STAT__CONDITION:
				setCondition((OclExpression)null);
				return;
			case ATLPackage.IF_STAT__THEN_STATEMENTS:
				getThenStatements().clear();
				return;
			case ATLPackage.IF_STAT__ELSE_STATEMENTS:
				getElseStatements().clear();
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
			case ATLPackage.IF_STAT__CONDITION:
				return condition != null;
			case ATLPackage.IF_STAT__THEN_STATEMENTS:
				return thenStatements != null && !thenStatements.isEmpty();
			case ATLPackage.IF_STAT__ELSE_STATEMENTS:
				return elseStatements != null && !elseStatements.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //IfStatImpl

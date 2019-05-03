/**
 */
package ru.capralow.dt.conversion.plugin.core.rm.model.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import ru.capralow.dt.conversion.plugin.core.rm.model.AutoRegistration;
import ru.capralow.dt.conversion.plugin.core.rm.model.ExchangePlanContent;
import ru.capralow.dt.conversion.plugin.core.rm.model.rmPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Exchange Plan Content</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.rm.model.impl.ExchangePlanContentImpl#getMdObject <em>Md Object</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.rm.model.impl.ExchangePlanContentImpl#getAutoRecord <em>Auto Record</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExchangePlanContentImpl extends MinimalEObjectImpl.Container implements ExchangePlanContent {
	/**
	 * The default value of the '{@link #getMdObject() <em>Md Object</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMdObject()
	 * @generated
	 * @ordered
	 */
	protected static final String MD_OBJECT_EDEFAULT = ""; //$NON-NLS-1$

	/**
	 * The cached value of the '{@link #getMdObject() <em>Md Object</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMdObject()
	 * @generated
	 * @ordered
	 */
	protected String mdObject = MD_OBJECT_EDEFAULT;

	/**
	 * The default value of the '{@link #getAutoRecord() <em>Auto Record</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutoRecord()
	 * @generated
	 * @ordered
	 */
	protected static final AutoRegistration AUTO_RECORD_EDEFAULT = AutoRegistration.ALLOW;

	/**
	 * The cached value of the '{@link #getAutoRecord() <em>Auto Record</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutoRecord()
	 * @generated
	 * @ordered
	 */
	protected AutoRegistration autoRecord = AUTO_RECORD_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExchangePlanContentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return rmPackage.Literals.EXCHANGE_PLAN_CONTENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMdObject() {
		return mdObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMdObject(String newMdObject) {
		String oldMdObject = mdObject;
		mdObject = newMdObject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, rmPackage.EXCHANGE_PLAN_CONTENT__MD_OBJECT, oldMdObject, mdObject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AutoRegistration getAutoRecord() {
		return autoRecord;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAutoRecord(AutoRegistration newAutoRecord) {
		AutoRegistration oldAutoRecord = autoRecord;
		autoRecord = newAutoRecord == null ? AUTO_RECORD_EDEFAULT : newAutoRecord;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, rmPackage.EXCHANGE_PLAN_CONTENT__AUTO_RECORD, oldAutoRecord, autoRecord));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case rmPackage.EXCHANGE_PLAN_CONTENT__MD_OBJECT:
				return getMdObject();
			case rmPackage.EXCHANGE_PLAN_CONTENT__AUTO_RECORD:
				return getAutoRecord();
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
			case rmPackage.EXCHANGE_PLAN_CONTENT__MD_OBJECT:
				setMdObject((String)newValue);
				return;
			case rmPackage.EXCHANGE_PLAN_CONTENT__AUTO_RECORD:
				setAutoRecord((AutoRegistration)newValue);
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
			case rmPackage.EXCHANGE_PLAN_CONTENT__MD_OBJECT:
				setMdObject(MD_OBJECT_EDEFAULT);
				return;
			case rmPackage.EXCHANGE_PLAN_CONTENT__AUTO_RECORD:
				setAutoRecord(AUTO_RECORD_EDEFAULT);
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
			case rmPackage.EXCHANGE_PLAN_CONTENT__MD_OBJECT:
				return MD_OBJECT_EDEFAULT == null ? mdObject != null : !MD_OBJECT_EDEFAULT.equals(mdObject);
			case rmPackage.EXCHANGE_PLAN_CONTENT__AUTO_RECORD:
				return autoRecord != AUTO_RECORD_EDEFAULT;
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
		result.append(" (mdObject: "); //$NON-NLS-1$
		result.append(mdObject);
		result.append(", AutoRecord: "); //$NON-NLS-1$
		result.append(autoRecord);
		result.append(')');
		return result.toString();
	}

} //ExchangePlanContentImpl

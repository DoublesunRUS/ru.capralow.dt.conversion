/**
 */
package ru.capralow.dt.conversion.plugin.core.ep.model.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

import ru.capralow.dt.conversion.plugin.core.ep.model.EpExchangePair;
import ru.capralow.dt.conversion.plugin.core.ep.model.EpExchangePairStatus;
import ru.capralow.dt.conversion.plugin.core.ep.model.epPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ep Exchange Pair</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.ep.model.impl.EpExchangePairImpl#getConfigurationName1 <em>Configuration Name1</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.ep.model.impl.EpExchangePairImpl#getConfigurationName2 <em>Configuration Name2</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.ep.model.impl.EpExchangePairImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.ep.model.impl.EpExchangePairImpl#getVersions <em>Versions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EpExchangePairImpl extends MinimalEObjectImpl.Container implements EpExchangePair {
	/**
	 * The default value of the '{@link #getConfigurationName1() <em>Configuration Name1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfigurationName1()
	 * @generated
	 * @ordered
	 */
	protected static final String CONFIGURATION_NAME1_EDEFAULT = ""; //$NON-NLS-1$

	/**
	 * The cached value of the '{@link #getConfigurationName1() <em>Configuration Name1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfigurationName1()
	 * @generated
	 * @ordered
	 */
	protected String configurationName1 = CONFIGURATION_NAME1_EDEFAULT;

	/**
	 * The default value of the '{@link #getConfigurationName2() <em>Configuration Name2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfigurationName2()
	 * @generated
	 * @ordered
	 */
	protected static final String CONFIGURATION_NAME2_EDEFAULT = ""; //$NON-NLS-1$

	/**
	 * The cached value of the '{@link #getConfigurationName2() <em>Configuration Name2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfigurationName2()
	 * @generated
	 * @ordered
	 */
	protected String configurationName2 = CONFIGURATION_NAME2_EDEFAULT;

	/**
	 * The default value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected static final EpExchangePairStatus STATUS_EDEFAULT = EpExchangePairStatus.NO_SHARED_FORMAT_VERSIONS;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected EpExchangePairStatus status = STATUS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getVersions() <em>Versions</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersions()
	 * @generated
	 * @ordered
	 */
	protected EList<String> versions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EpExchangePairImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return epPackage.Literals.EP_EXCHANGE_PAIR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getConfigurationName1() {
		return configurationName1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConfigurationName1(String newConfigurationName1) {
		String oldConfigurationName1 = configurationName1;
		configurationName1 = newConfigurationName1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, epPackage.EP_EXCHANGE_PAIR__CONFIGURATION_NAME1, oldConfigurationName1, configurationName1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getConfigurationName2() {
		return configurationName2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConfigurationName2(String newConfigurationName2) {
		String oldConfigurationName2 = configurationName2;
		configurationName2 = newConfigurationName2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, epPackage.EP_EXCHANGE_PAIR__CONFIGURATION_NAME2, oldConfigurationName2, configurationName2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EpExchangePairStatus getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStatus(EpExchangePairStatus newStatus) {
		EpExchangePairStatus oldStatus = status;
		status = newStatus == null ? STATUS_EDEFAULT : newStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, epPackage.EP_EXCHANGE_PAIR__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getVersions() {
		if (versions == null) {
			versions = new EDataTypeEList<String>(String.class, this, epPackage.EP_EXCHANGE_PAIR__VERSIONS);
		}
		return versions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case epPackage.EP_EXCHANGE_PAIR__CONFIGURATION_NAME1:
				return getConfigurationName1();
			case epPackage.EP_EXCHANGE_PAIR__CONFIGURATION_NAME2:
				return getConfigurationName2();
			case epPackage.EP_EXCHANGE_PAIR__STATUS:
				return getStatus();
			case epPackage.EP_EXCHANGE_PAIR__VERSIONS:
				return getVersions();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case epPackage.EP_EXCHANGE_PAIR__CONFIGURATION_NAME1:
				setConfigurationName1((String)newValue);
				return;
			case epPackage.EP_EXCHANGE_PAIR__CONFIGURATION_NAME2:
				setConfigurationName2((String)newValue);
				return;
			case epPackage.EP_EXCHANGE_PAIR__STATUS:
				setStatus((EpExchangePairStatus)newValue);
				return;
			case epPackage.EP_EXCHANGE_PAIR__VERSIONS:
				getVersions().clear();
				getVersions().addAll((Collection<? extends String>)newValue);
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
			case epPackage.EP_EXCHANGE_PAIR__CONFIGURATION_NAME1:
				setConfigurationName1(CONFIGURATION_NAME1_EDEFAULT);
				return;
			case epPackage.EP_EXCHANGE_PAIR__CONFIGURATION_NAME2:
				setConfigurationName2(CONFIGURATION_NAME2_EDEFAULT);
				return;
			case epPackage.EP_EXCHANGE_PAIR__STATUS:
				setStatus(STATUS_EDEFAULT);
				return;
			case epPackage.EP_EXCHANGE_PAIR__VERSIONS:
				getVersions().clear();
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
			case epPackage.EP_EXCHANGE_PAIR__CONFIGURATION_NAME1:
				return CONFIGURATION_NAME1_EDEFAULT == null ? configurationName1 != null : !CONFIGURATION_NAME1_EDEFAULT.equals(configurationName1);
			case epPackage.EP_EXCHANGE_PAIR__CONFIGURATION_NAME2:
				return CONFIGURATION_NAME2_EDEFAULT == null ? configurationName2 != null : !CONFIGURATION_NAME2_EDEFAULT.equals(configurationName2);
			case epPackage.EP_EXCHANGE_PAIR__STATUS:
				return status != STATUS_EDEFAULT;
			case epPackage.EP_EXCHANGE_PAIR__VERSIONS:
				return versions != null && !versions.isEmpty();
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

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (configurationName1: "); //$NON-NLS-1$
		result.append(configurationName1);
		result.append(", configurationName2: "); //$NON-NLS-1$
		result.append(configurationName2);
		result.append(", status: "); //$NON-NLS-1$
		result.append(status);
		result.append(", versions: "); //$NON-NLS-1$
		result.append(versions);
		result.append(')');
		return result.toString();
	}

} //EpExchangePairImpl

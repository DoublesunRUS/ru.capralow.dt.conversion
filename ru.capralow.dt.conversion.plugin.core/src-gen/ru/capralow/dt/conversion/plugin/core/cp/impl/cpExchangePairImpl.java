/**
 */
package ru.capralow.dt.conversion.plugin.core.cp.impl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import ru.capralow.dt.conversion.plugin.core.cp.CpPackage;
import ru.capralow.dt.conversion.plugin.core.cp.ExchangePairStatus;
import ru.capralow.dt.conversion.plugin.core.cp.cpExchangePair;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>cp Exchange Pair</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cp.impl.cpExchangePairImpl#getConfigurationName1 <em>Configuration Name1</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cp.impl.cpExchangePairImpl#getConfigurationName2 <em>Configuration Name2</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cp.impl.cpExchangePairImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cp.impl.cpExchangePairImpl#getVersions <em>Versions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class cpExchangePairImpl extends MinimalEObjectImpl.Container implements cpExchangePair {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public cpExchangePairImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpPackage.Literals.CP_EXCHANGE_PAIR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConfigurationName1() {
		return (String)eGet(CpPackage.Literals.CP_EXCHANGE_PAIR__CONFIGURATION_NAME1, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConfigurationName1(String newConfigurationName1) {
		eSet(CpPackage.Literals.CP_EXCHANGE_PAIR__CONFIGURATION_NAME1, newConfigurationName1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConfigurationName2() {
		return (String)eGet(CpPackage.Literals.CP_EXCHANGE_PAIR__CONFIGURATION_NAME2, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConfigurationName2(String newConfigurationName2) {
		eSet(CpPackage.Literals.CP_EXCHANGE_PAIR__CONFIGURATION_NAME2, newConfigurationName2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExchangePairStatus getStatus() {
		return (ExchangePairStatus)eGet(CpPackage.Literals.CP_EXCHANGE_PAIR__STATUS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(ExchangePairStatus newStatus) {
		eSet(CpPackage.Literals.CP_EXCHANGE_PAIR__STATUS, newStatus);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<String> getVersions() {
		return (EList<String>)eGet(CpPackage.Literals.CP_EXCHANGE_PAIR__VERSIONS, true);
	}

} //cpExchangePairImpl

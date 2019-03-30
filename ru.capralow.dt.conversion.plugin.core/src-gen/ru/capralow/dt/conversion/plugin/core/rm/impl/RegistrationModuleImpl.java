/**
 */
package ru.capralow.dt.conversion.plugin.core.rm.impl;

import com._1c.g5.v8.bm.core.BmObject;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import ru.capralow.dt.conversion.plugin.core.rm.ExchangePlanContent;
import ru.capralow.dt.conversion.plugin.core.rm.RegistrationModule;
import ru.capralow.dt.conversion.plugin.core.rm.RegistrationRule;
import ru.capralow.dt.conversion.plugin.core.rm.RmPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Registration Module</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.rm.impl.RegistrationModuleImpl#getModuleRef <em>Module Ref</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.rm.impl.RegistrationModuleImpl#getModuleName <em>Module Name</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.rm.impl.RegistrationModuleImpl#getModuleVersion <em>Module Version</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.rm.impl.RegistrationModuleImpl#getModuleCreationDate <em>Module Creation Date</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.rm.impl.RegistrationModuleImpl#getExchangePlanName <em>Exchange Plan Name</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.rm.impl.RegistrationModuleImpl#getExchangePlanMdObject <em>Exchange Plan Md Object</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.rm.impl.RegistrationModuleImpl#getRuntimeVersion <em>Runtime Version</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.rm.impl.RegistrationModuleImpl#getConfigurationName <em>Configuration Name</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.rm.impl.RegistrationModuleImpl#getConfigurationSynonym <em>Configuration Synonym</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.rm.impl.RegistrationModuleImpl#getConfigurationVersion <em>Configuration Version</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.rm.impl.RegistrationModuleImpl#getExchangePlanContent <em>Exchange Plan Content</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.rm.impl.RegistrationModuleImpl#getRegistrationRules <em>Registration Rules</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RegistrationModuleImpl extends BmObject implements RegistrationModule {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegistrationModuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RmPackage.Literals.REGISTRATION_MODULE;
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
	public String getModuleRef() {
		return (String)eGet(RmPackage.Literals.REGISTRATION_MODULE__MODULE_REF, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModuleRef(String newModuleRef) {
		eSet(RmPackage.Literals.REGISTRATION_MODULE__MODULE_REF, newModuleRef);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getModuleName() {
		return (String)eGet(RmPackage.Literals.REGISTRATION_MODULE__MODULE_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModuleName(String newModuleName) {
		eSet(RmPackage.Literals.REGISTRATION_MODULE__MODULE_NAME, newModuleName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getModuleVersion() {
		return (String)eGet(RmPackage.Literals.REGISTRATION_MODULE__MODULE_VERSION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModuleVersion(String newModuleVersion) {
		eSet(RmPackage.Literals.REGISTRATION_MODULE__MODULE_VERSION, newModuleVersion);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getModuleCreationDate() {
		return (Date)eGet(RmPackage.Literals.REGISTRATION_MODULE__MODULE_CREATION_DATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModuleCreationDate(Date newModuleCreationDate) {
		eSet(RmPackage.Literals.REGISTRATION_MODULE__MODULE_CREATION_DATE, newModuleCreationDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExchangePlanName() {
		return (String)eGet(RmPackage.Literals.REGISTRATION_MODULE__EXCHANGE_PLAN_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExchangePlanName(String newExchangePlanName) {
		eSet(RmPackage.Literals.REGISTRATION_MODULE__EXCHANGE_PLAN_NAME, newExchangePlanName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExchangePlanMdObject() {
		return (String)eGet(RmPackage.Literals.REGISTRATION_MODULE__EXCHANGE_PLAN_MD_OBJECT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExchangePlanMdObject(String newExchangePlanMdObject) {
		eSet(RmPackage.Literals.REGISTRATION_MODULE__EXCHANGE_PLAN_MD_OBJECT, newExchangePlanMdObject);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRuntimeVersion() {
		return (String)eGet(RmPackage.Literals.REGISTRATION_MODULE__RUNTIME_VERSION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRuntimeVersion(String newRuntimeVersion) {
		eSet(RmPackage.Literals.REGISTRATION_MODULE__RUNTIME_VERSION, newRuntimeVersion);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConfigurationName() {
		return (String)eGet(RmPackage.Literals.REGISTRATION_MODULE__CONFIGURATION_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConfigurationName(String newConfigurationName) {
		eSet(RmPackage.Literals.REGISTRATION_MODULE__CONFIGURATION_NAME, newConfigurationName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConfigurationSynonym() {
		return (String)eGet(RmPackage.Literals.REGISTRATION_MODULE__CONFIGURATION_SYNONYM, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConfigurationSynonym(String newConfigurationSynonym) {
		eSet(RmPackage.Literals.REGISTRATION_MODULE__CONFIGURATION_SYNONYM, newConfigurationSynonym);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConfigurationVersion() {
		return (String)eGet(RmPackage.Literals.REGISTRATION_MODULE__CONFIGURATION_VERSION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConfigurationVersion(String newConfigurationVersion) {
		eSet(RmPackage.Literals.REGISTRATION_MODULE__CONFIGURATION_VERSION, newConfigurationVersion);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<ExchangePlanContent> getExchangePlanContent() {
		return (EList<ExchangePlanContent>)eGet(RmPackage.Literals.REGISTRATION_MODULE__EXCHANGE_PLAN_CONTENT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<RegistrationRule> getRegistrationRules() {
		return (EList<RegistrationRule>)eGet(RmPackage.Literals.REGISTRATION_MODULE__REGISTRATION_RULES, true);
	}

} //RegistrationModuleImpl

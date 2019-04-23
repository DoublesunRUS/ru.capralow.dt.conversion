/**
 */
package ru.capralow.dt.conversion.plugin.core.rm.model.impl;

import java.util.Collection;
import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import ru.capralow.dt.conversion.plugin.core.rm.model.ExchangePlanContent;
import ru.capralow.dt.conversion.plugin.core.rm.model.RegistrationModule;
import ru.capralow.dt.conversion.plugin.core.rm.model.RegistrationRule;
import ru.capralow.dt.conversion.plugin.core.rm.model.rmPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Registration Module</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.rm.model.impl.RegistrationModuleImpl#getModuleRef <em>Module Ref</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.rm.model.impl.RegistrationModuleImpl#getModuleName <em>Module Name</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.rm.model.impl.RegistrationModuleImpl#getModuleVersion <em>Module Version</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.rm.model.impl.RegistrationModuleImpl#getModuleCreationDate <em>Module Creation Date</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.rm.model.impl.RegistrationModuleImpl#getExchangePlanName <em>Exchange Plan Name</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.rm.model.impl.RegistrationModuleImpl#getExchangePlanMdObject <em>Exchange Plan Md Object</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.rm.model.impl.RegistrationModuleImpl#getRuntimeVersion <em>Runtime Version</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.rm.model.impl.RegistrationModuleImpl#getConfigurationName <em>Configuration Name</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.rm.model.impl.RegistrationModuleImpl#getConfigurationSynonym <em>Configuration Synonym</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.rm.model.impl.RegistrationModuleImpl#getConfigurationVersion <em>Configuration Version</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.rm.model.impl.RegistrationModuleImpl#getExchangePlanContent <em>Exchange Plan Content</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.rm.model.impl.RegistrationModuleImpl#getRegistrationRules <em>Registration Rules</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RegistrationModuleImpl extends MinimalEObjectImpl.Container implements RegistrationModule {
	/**
	 * The default value of the '{@link #getModuleRef() <em>Module Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModuleRef()
	 * @generated
	 * @ordered
	 */
	protected static final String MODULE_REF_EDEFAULT = ""; //$NON-NLS-1$

	/**
	 * The cached value of the '{@link #getModuleRef() <em>Module Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModuleRef()
	 * @generated
	 * @ordered
	 */
	protected String moduleRef = MODULE_REF_EDEFAULT;

	/**
	 * The default value of the '{@link #getModuleName() <em>Module Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModuleName()
	 * @generated
	 * @ordered
	 */
	protected static final String MODULE_NAME_EDEFAULT = ""; //$NON-NLS-1$

	/**
	 * The cached value of the '{@link #getModuleName() <em>Module Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModuleName()
	 * @generated
	 * @ordered
	 */
	protected String moduleName = MODULE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getModuleVersion() <em>Module Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModuleVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String MODULE_VERSION_EDEFAULT = ""; //$NON-NLS-1$

	/**
	 * The cached value of the '{@link #getModuleVersion() <em>Module Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModuleVersion()
	 * @generated
	 * @ordered
	 */
	protected String moduleVersion = MODULE_VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getModuleCreationDate() <em>Module Creation Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModuleCreationDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date MODULE_CREATION_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getModuleCreationDate() <em>Module Creation Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModuleCreationDate()
	 * @generated
	 * @ordered
	 */
	protected Date moduleCreationDate = MODULE_CREATION_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getExchangePlanName() <em>Exchange Plan Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExchangePlanName()
	 * @generated
	 * @ordered
	 */
	protected static final String EXCHANGE_PLAN_NAME_EDEFAULT = ""; //$NON-NLS-1$

	/**
	 * The cached value of the '{@link #getExchangePlanName() <em>Exchange Plan Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExchangePlanName()
	 * @generated
	 * @ordered
	 */
	protected String exchangePlanName = EXCHANGE_PLAN_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getExchangePlanMdObject() <em>Exchange Plan Md Object</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExchangePlanMdObject()
	 * @generated
	 * @ordered
	 */
	protected static final String EXCHANGE_PLAN_MD_OBJECT_EDEFAULT = ""; //$NON-NLS-1$

	/**
	 * The cached value of the '{@link #getExchangePlanMdObject() <em>Exchange Plan Md Object</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExchangePlanMdObject()
	 * @generated
	 * @ordered
	 */
	protected String exchangePlanMdObject = EXCHANGE_PLAN_MD_OBJECT_EDEFAULT;

	/**
	 * The default value of the '{@link #getRuntimeVersion() <em>Runtime Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRuntimeVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String RUNTIME_VERSION_EDEFAULT = ""; //$NON-NLS-1$

	/**
	 * The cached value of the '{@link #getRuntimeVersion() <em>Runtime Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRuntimeVersion()
	 * @generated
	 * @ordered
	 */
	protected String runtimeVersion = RUNTIME_VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getConfigurationName() <em>Configuration Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfigurationName()
	 * @generated
	 * @ordered
	 */
	protected static final String CONFIGURATION_NAME_EDEFAULT = ""; //$NON-NLS-1$

	/**
	 * The cached value of the '{@link #getConfigurationName() <em>Configuration Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfigurationName()
	 * @generated
	 * @ordered
	 */
	protected String configurationName = CONFIGURATION_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getConfigurationSynonym() <em>Configuration Synonym</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfigurationSynonym()
	 * @generated
	 * @ordered
	 */
	protected static final String CONFIGURATION_SYNONYM_EDEFAULT = ""; //$NON-NLS-1$

	/**
	 * The cached value of the '{@link #getConfigurationSynonym() <em>Configuration Synonym</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfigurationSynonym()
	 * @generated
	 * @ordered
	 */
	protected String configurationSynonym = CONFIGURATION_SYNONYM_EDEFAULT;

	/**
	 * The default value of the '{@link #getConfigurationVersion() <em>Configuration Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfigurationVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String CONFIGURATION_VERSION_EDEFAULT = ""; //$NON-NLS-1$

	/**
	 * The cached value of the '{@link #getConfigurationVersion() <em>Configuration Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfigurationVersion()
	 * @generated
	 * @ordered
	 */
	protected String configurationVersion = CONFIGURATION_VERSION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getExchangePlanContent() <em>Exchange Plan Content</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExchangePlanContent()
	 * @generated
	 * @ordered
	 */
	protected EList<ExchangePlanContent> exchangePlanContent;

	/**
	 * The cached value of the '{@link #getRegistrationRules() <em>Registration Rules</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegistrationRules()
	 * @generated
	 * @ordered
	 */
	protected EList<RegistrationRule> registrationRules;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RegistrationModuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return rmPackage.Literals.REGISTRATION_MODULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getModuleRef() {
		return moduleRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModuleRef(String newModuleRef) {
		String oldModuleRef = moduleRef;
		moduleRef = newModuleRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, rmPackage.REGISTRATION_MODULE__MODULE_REF, oldModuleRef, moduleRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getModuleName() {
		return moduleName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModuleName(String newModuleName) {
		String oldModuleName = moduleName;
		moduleName = newModuleName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, rmPackage.REGISTRATION_MODULE__MODULE_NAME, oldModuleName, moduleName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getModuleVersion() {
		return moduleVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModuleVersion(String newModuleVersion) {
		String oldModuleVersion = moduleVersion;
		moduleVersion = newModuleVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, rmPackage.REGISTRATION_MODULE__MODULE_VERSION, oldModuleVersion, moduleVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getModuleCreationDate() {
		return moduleCreationDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModuleCreationDate(Date newModuleCreationDate) {
		Date oldModuleCreationDate = moduleCreationDate;
		moduleCreationDate = newModuleCreationDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, rmPackage.REGISTRATION_MODULE__MODULE_CREATION_DATE, oldModuleCreationDate, moduleCreationDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExchangePlanName() {
		return exchangePlanName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExchangePlanName(String newExchangePlanName) {
		String oldExchangePlanName = exchangePlanName;
		exchangePlanName = newExchangePlanName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, rmPackage.REGISTRATION_MODULE__EXCHANGE_PLAN_NAME, oldExchangePlanName, exchangePlanName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExchangePlanMdObject() {
		return exchangePlanMdObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExchangePlanMdObject(String newExchangePlanMdObject) {
		String oldExchangePlanMdObject = exchangePlanMdObject;
		exchangePlanMdObject = newExchangePlanMdObject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, rmPackage.REGISTRATION_MODULE__EXCHANGE_PLAN_MD_OBJECT, oldExchangePlanMdObject, exchangePlanMdObject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRuntimeVersion() {
		return runtimeVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRuntimeVersion(String newRuntimeVersion) {
		String oldRuntimeVersion = runtimeVersion;
		runtimeVersion = newRuntimeVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, rmPackage.REGISTRATION_MODULE__RUNTIME_VERSION, oldRuntimeVersion, runtimeVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConfigurationName() {
		return configurationName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConfigurationName(String newConfigurationName) {
		String oldConfigurationName = configurationName;
		configurationName = newConfigurationName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, rmPackage.REGISTRATION_MODULE__CONFIGURATION_NAME, oldConfigurationName, configurationName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConfigurationSynonym() {
		return configurationSynonym;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConfigurationSynonym(String newConfigurationSynonym) {
		String oldConfigurationSynonym = configurationSynonym;
		configurationSynonym = newConfigurationSynonym;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, rmPackage.REGISTRATION_MODULE__CONFIGURATION_SYNONYM, oldConfigurationSynonym, configurationSynonym));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConfigurationVersion() {
		return configurationVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConfigurationVersion(String newConfigurationVersion) {
		String oldConfigurationVersion = configurationVersion;
		configurationVersion = newConfigurationVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, rmPackage.REGISTRATION_MODULE__CONFIGURATION_VERSION, oldConfigurationVersion, configurationVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExchangePlanContent> getExchangePlanContent() {
		if (exchangePlanContent == null) {
			exchangePlanContent = new EObjectContainmentEList<ExchangePlanContent>(ExchangePlanContent.class, this, rmPackage.REGISTRATION_MODULE__EXCHANGE_PLAN_CONTENT);
		}
		return exchangePlanContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RegistrationRule> getRegistrationRules() {
		if (registrationRules == null) {
			registrationRules = new EObjectContainmentEList<RegistrationRule>(RegistrationRule.class, this, rmPackage.REGISTRATION_MODULE__REGISTRATION_RULES);
		}
		return registrationRules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case rmPackage.REGISTRATION_MODULE__EXCHANGE_PLAN_CONTENT:
				return ((InternalEList<?>)getExchangePlanContent()).basicRemove(otherEnd, msgs);
			case rmPackage.REGISTRATION_MODULE__REGISTRATION_RULES:
				return ((InternalEList<?>)getRegistrationRules()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case rmPackage.REGISTRATION_MODULE__MODULE_REF:
				return getModuleRef();
			case rmPackage.REGISTRATION_MODULE__MODULE_NAME:
				return getModuleName();
			case rmPackage.REGISTRATION_MODULE__MODULE_VERSION:
				return getModuleVersion();
			case rmPackage.REGISTRATION_MODULE__MODULE_CREATION_DATE:
				return getModuleCreationDate();
			case rmPackage.REGISTRATION_MODULE__EXCHANGE_PLAN_NAME:
				return getExchangePlanName();
			case rmPackage.REGISTRATION_MODULE__EXCHANGE_PLAN_MD_OBJECT:
				return getExchangePlanMdObject();
			case rmPackage.REGISTRATION_MODULE__RUNTIME_VERSION:
				return getRuntimeVersion();
			case rmPackage.REGISTRATION_MODULE__CONFIGURATION_NAME:
				return getConfigurationName();
			case rmPackage.REGISTRATION_MODULE__CONFIGURATION_SYNONYM:
				return getConfigurationSynonym();
			case rmPackage.REGISTRATION_MODULE__CONFIGURATION_VERSION:
				return getConfigurationVersion();
			case rmPackage.REGISTRATION_MODULE__EXCHANGE_PLAN_CONTENT:
				return getExchangePlanContent();
			case rmPackage.REGISTRATION_MODULE__REGISTRATION_RULES:
				return getRegistrationRules();
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
			case rmPackage.REGISTRATION_MODULE__MODULE_REF:
				setModuleRef((String)newValue);
				return;
			case rmPackage.REGISTRATION_MODULE__MODULE_NAME:
				setModuleName((String)newValue);
				return;
			case rmPackage.REGISTRATION_MODULE__MODULE_VERSION:
				setModuleVersion((String)newValue);
				return;
			case rmPackage.REGISTRATION_MODULE__MODULE_CREATION_DATE:
				setModuleCreationDate((Date)newValue);
				return;
			case rmPackage.REGISTRATION_MODULE__EXCHANGE_PLAN_NAME:
				setExchangePlanName((String)newValue);
				return;
			case rmPackage.REGISTRATION_MODULE__EXCHANGE_PLAN_MD_OBJECT:
				setExchangePlanMdObject((String)newValue);
				return;
			case rmPackage.REGISTRATION_MODULE__RUNTIME_VERSION:
				setRuntimeVersion((String)newValue);
				return;
			case rmPackage.REGISTRATION_MODULE__CONFIGURATION_NAME:
				setConfigurationName((String)newValue);
				return;
			case rmPackage.REGISTRATION_MODULE__CONFIGURATION_SYNONYM:
				setConfigurationSynonym((String)newValue);
				return;
			case rmPackage.REGISTRATION_MODULE__CONFIGURATION_VERSION:
				setConfigurationVersion((String)newValue);
				return;
			case rmPackage.REGISTRATION_MODULE__EXCHANGE_PLAN_CONTENT:
				getExchangePlanContent().clear();
				getExchangePlanContent().addAll((Collection<? extends ExchangePlanContent>)newValue);
				return;
			case rmPackage.REGISTRATION_MODULE__REGISTRATION_RULES:
				getRegistrationRules().clear();
				getRegistrationRules().addAll((Collection<? extends RegistrationRule>)newValue);
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
			case rmPackage.REGISTRATION_MODULE__MODULE_REF:
				setModuleRef(MODULE_REF_EDEFAULT);
				return;
			case rmPackage.REGISTRATION_MODULE__MODULE_NAME:
				setModuleName(MODULE_NAME_EDEFAULT);
				return;
			case rmPackage.REGISTRATION_MODULE__MODULE_VERSION:
				setModuleVersion(MODULE_VERSION_EDEFAULT);
				return;
			case rmPackage.REGISTRATION_MODULE__MODULE_CREATION_DATE:
				setModuleCreationDate(MODULE_CREATION_DATE_EDEFAULT);
				return;
			case rmPackage.REGISTRATION_MODULE__EXCHANGE_PLAN_NAME:
				setExchangePlanName(EXCHANGE_PLAN_NAME_EDEFAULT);
				return;
			case rmPackage.REGISTRATION_MODULE__EXCHANGE_PLAN_MD_OBJECT:
				setExchangePlanMdObject(EXCHANGE_PLAN_MD_OBJECT_EDEFAULT);
				return;
			case rmPackage.REGISTRATION_MODULE__RUNTIME_VERSION:
				setRuntimeVersion(RUNTIME_VERSION_EDEFAULT);
				return;
			case rmPackage.REGISTRATION_MODULE__CONFIGURATION_NAME:
				setConfigurationName(CONFIGURATION_NAME_EDEFAULT);
				return;
			case rmPackage.REGISTRATION_MODULE__CONFIGURATION_SYNONYM:
				setConfigurationSynonym(CONFIGURATION_SYNONYM_EDEFAULT);
				return;
			case rmPackage.REGISTRATION_MODULE__CONFIGURATION_VERSION:
				setConfigurationVersion(CONFIGURATION_VERSION_EDEFAULT);
				return;
			case rmPackage.REGISTRATION_MODULE__EXCHANGE_PLAN_CONTENT:
				getExchangePlanContent().clear();
				return;
			case rmPackage.REGISTRATION_MODULE__REGISTRATION_RULES:
				getRegistrationRules().clear();
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
			case rmPackage.REGISTRATION_MODULE__MODULE_REF:
				return MODULE_REF_EDEFAULT == null ? moduleRef != null : !MODULE_REF_EDEFAULT.equals(moduleRef);
			case rmPackage.REGISTRATION_MODULE__MODULE_NAME:
				return MODULE_NAME_EDEFAULT == null ? moduleName != null : !MODULE_NAME_EDEFAULT.equals(moduleName);
			case rmPackage.REGISTRATION_MODULE__MODULE_VERSION:
				return MODULE_VERSION_EDEFAULT == null ? moduleVersion != null : !MODULE_VERSION_EDEFAULT.equals(moduleVersion);
			case rmPackage.REGISTRATION_MODULE__MODULE_CREATION_DATE:
				return MODULE_CREATION_DATE_EDEFAULT == null ? moduleCreationDate != null : !MODULE_CREATION_DATE_EDEFAULT.equals(moduleCreationDate);
			case rmPackage.REGISTRATION_MODULE__EXCHANGE_PLAN_NAME:
				return EXCHANGE_PLAN_NAME_EDEFAULT == null ? exchangePlanName != null : !EXCHANGE_PLAN_NAME_EDEFAULT.equals(exchangePlanName);
			case rmPackage.REGISTRATION_MODULE__EXCHANGE_PLAN_MD_OBJECT:
				return EXCHANGE_PLAN_MD_OBJECT_EDEFAULT == null ? exchangePlanMdObject != null : !EXCHANGE_PLAN_MD_OBJECT_EDEFAULT.equals(exchangePlanMdObject);
			case rmPackage.REGISTRATION_MODULE__RUNTIME_VERSION:
				return RUNTIME_VERSION_EDEFAULT == null ? runtimeVersion != null : !RUNTIME_VERSION_EDEFAULT.equals(runtimeVersion);
			case rmPackage.REGISTRATION_MODULE__CONFIGURATION_NAME:
				return CONFIGURATION_NAME_EDEFAULT == null ? configurationName != null : !CONFIGURATION_NAME_EDEFAULT.equals(configurationName);
			case rmPackage.REGISTRATION_MODULE__CONFIGURATION_SYNONYM:
				return CONFIGURATION_SYNONYM_EDEFAULT == null ? configurationSynonym != null : !CONFIGURATION_SYNONYM_EDEFAULT.equals(configurationSynonym);
			case rmPackage.REGISTRATION_MODULE__CONFIGURATION_VERSION:
				return CONFIGURATION_VERSION_EDEFAULT == null ? configurationVersion != null : !CONFIGURATION_VERSION_EDEFAULT.equals(configurationVersion);
			case rmPackage.REGISTRATION_MODULE__EXCHANGE_PLAN_CONTENT:
				return exchangePlanContent != null && !exchangePlanContent.isEmpty();
			case rmPackage.REGISTRATION_MODULE__REGISTRATION_RULES:
				return registrationRules != null && !registrationRules.isEmpty();
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
		result.append(" (moduleRef: "); //$NON-NLS-1$
		result.append(moduleRef);
		result.append(", moduleName: "); //$NON-NLS-1$
		result.append(moduleName);
		result.append(", moduleVersion: "); //$NON-NLS-1$
		result.append(moduleVersion);
		result.append(", moduleCreationDate: "); //$NON-NLS-1$
		result.append(moduleCreationDate);
		result.append(", exchangePlanName: "); //$NON-NLS-1$
		result.append(exchangePlanName);
		result.append(", exchangePlanMdObject: "); //$NON-NLS-1$
		result.append(exchangePlanMdObject);
		result.append(", runtimeVersion: "); //$NON-NLS-1$
		result.append(runtimeVersion);
		result.append(", configurationName: "); //$NON-NLS-1$
		result.append(configurationName);
		result.append(", configurationSynonym: "); //$NON-NLS-1$
		result.append(configurationSynonym);
		result.append(", configurationVersion: "); //$NON-NLS-1$
		result.append(configurationVersion);
		result.append(')');
		return result.toString();
	}

} //RegistrationModuleImpl

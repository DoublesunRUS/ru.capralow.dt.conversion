/**
 */
package ru.capralow.dt.conversion.plugin.core.rm.model;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see ru.capralow.dt.conversion.plugin.core.rm.model.rmFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel loadInitialization='false' literalsInterface='true' nonNLSMarkers='true' prefix='rm' updateClasspath='false' basePackage='ru.capralow.dt.conversion.plugin.core.rm'"
 * @generated
 */
public interface rmPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "model"; //$NON-NLS-1$

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://ru.capralow.dt.conversion.plugin.core.rm.model"; //$NON-NLS-1$

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "rm"; //$NON-NLS-1$

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	rmPackage eINSTANCE = ru.capralow.dt.conversion.plugin.core.rm.model.impl.rmPackageImpl.init();

	/**
	 * The meta object id for the '{@link ru.capralow.dt.conversion.plugin.core.rm.model.impl.RegistrationModuleImpl <em>Registration Module</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.capralow.dt.conversion.plugin.core.rm.model.impl.RegistrationModuleImpl
	 * @see ru.capralow.dt.conversion.plugin.core.rm.model.impl.rmPackageImpl#getRegistrationModule()
	 * @generated
	 */
	int REGISTRATION_MODULE = 0;

	/**
	 * The feature id for the '<em><b>Module Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRATION_MODULE__MODULE_REF = 0;

	/**
	 * The feature id for the '<em><b>Module Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRATION_MODULE__MODULE_NAME = 1;

	/**
	 * The feature id for the '<em><b>Module Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRATION_MODULE__MODULE_VERSION = 2;

	/**
	 * The feature id for the '<em><b>Module Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRATION_MODULE__MODULE_CREATION_DATE = 3;

	/**
	 * The feature id for the '<em><b>Exchange Plan Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRATION_MODULE__EXCHANGE_PLAN_NAME = 4;

	/**
	 * The feature id for the '<em><b>Exchange Plan Md Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRATION_MODULE__EXCHANGE_PLAN_MD_OBJECT = 5;

	/**
	 * The feature id for the '<em><b>Runtime Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRATION_MODULE__RUNTIME_VERSION = 6;

	/**
	 * The feature id for the '<em><b>Configuration Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRATION_MODULE__CONFIGURATION_NAME = 7;

	/**
	 * The feature id for the '<em><b>Configuration Synonym</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRATION_MODULE__CONFIGURATION_SYNONYM = 8;

	/**
	 * The feature id for the '<em><b>Configuration Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRATION_MODULE__CONFIGURATION_VERSION = 9;

	/**
	 * The feature id for the '<em><b>Exchange Plan Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRATION_MODULE__EXCHANGE_PLAN_CONTENT = 10;

	/**
	 * The feature id for the '<em><b>Registration Rules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRATION_MODULE__REGISTRATION_RULES = 11;

	/**
	 * The number of structural features of the '<em>Registration Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRATION_MODULE_FEATURE_COUNT = 12;

	/**
	 * The number of operations of the '<em>Registration Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRATION_MODULE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ru.capralow.dt.conversion.plugin.core.rm.model.impl.ExchangePlanContentImpl <em>Exchange Plan Content</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.capralow.dt.conversion.plugin.core.rm.model.impl.ExchangePlanContentImpl
	 * @see ru.capralow.dt.conversion.plugin.core.rm.model.impl.rmPackageImpl#getExchangePlanContent()
	 * @generated
	 */
	int EXCHANGE_PLAN_CONTENT = 1;

	/**
	 * The feature id for the '<em><b>Md Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCHANGE_PLAN_CONTENT__MD_OBJECT = 0;

	/**
	 * The feature id for the '<em><b>Auto Record</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCHANGE_PLAN_CONTENT__AUTO_RECORD = 1;

	/**
	 * The number of structural features of the '<em>Exchange Plan Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCHANGE_PLAN_CONTENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Exchange Plan Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCHANGE_PLAN_CONTENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ru.capralow.dt.conversion.plugin.core.rm.model.impl.RegistrationRuleImpl <em>Registration Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.capralow.dt.conversion.plugin.core.rm.model.impl.RegistrationRuleImpl
	 * @see ru.capralow.dt.conversion.plugin.core.rm.model.impl.rmPackageImpl#getRegistrationRule()
	 * @generated
	 */
	int REGISTRATION_RULE = 2;

	/**
	 * The feature id for the '<em><b>Is Folder</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRATION_RULE__IS_FOLDER = 0;

	/**
	 * The feature id for the '<em><b>Disabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRATION_RULE__DISABLED = 1;

	/**
	 * The feature id for the '<em><b>Valid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRATION_RULE__VALID = 2;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRATION_RULE__CODE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRATION_RULE__NAME = 4;

	/**
	 * The feature id for the '<em><b>Md Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRATION_RULE__MD_OBJECT = 5;

	/**
	 * The feature id for the '<em><b>Object Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRATION_RULE__OBJECT_NAME = 6;

	/**
	 * The feature id for the '<em><b>Md Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRATION_RULE__MD_CLASS = 7;

	/**
	 * The feature id for the '<em><b>Attribute Send Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRATION_RULE__ATTRIBUTE_SEND_MODE = 8;

	/**
	 * The feature id for the '<em><b>Object Selection Rules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRATION_RULE__OBJECT_SELECTION_RULES = 9;

	/**
	 * The feature id for the '<em><b>Exchange Plan Selection Rules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRATION_RULE__EXCHANGE_PLAN_SELECTION_RULES = 10;

	/**
	 * The number of structural features of the '<em>Registration Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRATION_RULE_FEATURE_COUNT = 11;

	/**
	 * The number of operations of the '<em>Registration Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRATION_RULE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ru.capralow.dt.conversion.plugin.core.rm.model.impl.ObjectSelectionRuleImpl <em>Object Selection Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.capralow.dt.conversion.plugin.core.rm.model.impl.ObjectSelectionRuleImpl
	 * @see ru.capralow.dt.conversion.plugin.core.rm.model.impl.rmPackageImpl#getObjectSelectionRule()
	 * @generated
	 */
	int OBJECT_SELECTION_RULE = 3;

	/**
	 * The feature id for the '<em><b>Is Folder</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_SELECTION_RULE__IS_FOLDER = 0;

	/**
	 * The number of structural features of the '<em>Object Selection Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_SELECTION_RULE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Object Selection Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_SELECTION_RULE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ru.capralow.dt.conversion.plugin.core.rm.model.impl.ExchangePlanSelectionRuleImpl <em>Exchange Plan Selection Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.capralow.dt.conversion.plugin.core.rm.model.impl.ExchangePlanSelectionRuleImpl
	 * @see ru.capralow.dt.conversion.plugin.core.rm.model.impl.rmPackageImpl#getExchangePlanSelectionRule()
	 * @generated
	 */
	int EXCHANGE_PLAN_SELECTION_RULE = 4;

	/**
	 * The feature id for the '<em><b>Is Folder</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCHANGE_PLAN_SELECTION_RULE__IS_FOLDER = 0;

	/**
	 * The number of structural features of the '<em>Exchange Plan Selection Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCHANGE_PLAN_SELECTION_RULE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Exchange Plan Selection Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCHANGE_PLAN_SELECTION_RULE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ru.capralow.dt.conversion.plugin.core.rm.model.AutoRegistration <em>Auto Registration</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.capralow.dt.conversion.plugin.core.rm.model.AutoRegistration
	 * @see ru.capralow.dt.conversion.plugin.core.rm.model.impl.rmPackageImpl#getAutoRegistration()
	 * @generated
	 */
	int AUTO_REGISTRATION = 5;

	/**
	 * The meta object id for the '<em>Date</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.Date
	 * @see ru.capralow.dt.conversion.plugin.core.rm.model.impl.rmPackageImpl#getDate()
	 * @generated
	 */
	int DATE = 6;


	/**
	 * Returns the meta object for class '{@link ru.capralow.dt.conversion.plugin.core.rm.model.RegistrationModule <em>Registration Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Registration Module</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.rm.model.RegistrationModule
	 * @generated
	 */
	EClass getRegistrationModule();

	/**
	 * Returns the meta object for the attribute '{@link ru.capralow.dt.conversion.plugin.core.rm.model.RegistrationModule#getModuleRef <em>Module Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Module Ref</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.rm.model.RegistrationModule#getModuleRef()
	 * @see #getRegistrationModule()
	 * @generated
	 */
	EAttribute getRegistrationModule_ModuleRef();

	/**
	 * Returns the meta object for the attribute '{@link ru.capralow.dt.conversion.plugin.core.rm.model.RegistrationModule#getModuleName <em>Module Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Module Name</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.rm.model.RegistrationModule#getModuleName()
	 * @see #getRegistrationModule()
	 * @generated
	 */
	EAttribute getRegistrationModule_ModuleName();

	/**
	 * Returns the meta object for the attribute '{@link ru.capralow.dt.conversion.plugin.core.rm.model.RegistrationModule#getModuleVersion <em>Module Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Module Version</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.rm.model.RegistrationModule#getModuleVersion()
	 * @see #getRegistrationModule()
	 * @generated
	 */
	EAttribute getRegistrationModule_ModuleVersion();

	/**
	 * Returns the meta object for the attribute '{@link ru.capralow.dt.conversion.plugin.core.rm.model.RegistrationModule#getModuleCreationDate <em>Module Creation Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Module Creation Date</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.rm.model.RegistrationModule#getModuleCreationDate()
	 * @see #getRegistrationModule()
	 * @generated
	 */
	EAttribute getRegistrationModule_ModuleCreationDate();

	/**
	 * Returns the meta object for the attribute '{@link ru.capralow.dt.conversion.plugin.core.rm.model.RegistrationModule#getExchangePlanName <em>Exchange Plan Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Exchange Plan Name</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.rm.model.RegistrationModule#getExchangePlanName()
	 * @see #getRegistrationModule()
	 * @generated
	 */
	EAttribute getRegistrationModule_ExchangePlanName();

	/**
	 * Returns the meta object for the attribute '{@link ru.capralow.dt.conversion.plugin.core.rm.model.RegistrationModule#getExchangePlanMdObject <em>Exchange Plan Md Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Exchange Plan Md Object</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.rm.model.RegistrationModule#getExchangePlanMdObject()
	 * @see #getRegistrationModule()
	 * @generated
	 */
	EAttribute getRegistrationModule_ExchangePlanMdObject();

	/**
	 * Returns the meta object for the attribute '{@link ru.capralow.dt.conversion.plugin.core.rm.model.RegistrationModule#getRuntimeVersion <em>Runtime Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Runtime Version</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.rm.model.RegistrationModule#getRuntimeVersion()
	 * @see #getRegistrationModule()
	 * @generated
	 */
	EAttribute getRegistrationModule_RuntimeVersion();

	/**
	 * Returns the meta object for the attribute '{@link ru.capralow.dt.conversion.plugin.core.rm.model.RegistrationModule#getConfigurationName <em>Configuration Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Configuration Name</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.rm.model.RegistrationModule#getConfigurationName()
	 * @see #getRegistrationModule()
	 * @generated
	 */
	EAttribute getRegistrationModule_ConfigurationName();

	/**
	 * Returns the meta object for the attribute '{@link ru.capralow.dt.conversion.plugin.core.rm.model.RegistrationModule#getConfigurationSynonym <em>Configuration Synonym</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Configuration Synonym</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.rm.model.RegistrationModule#getConfigurationSynonym()
	 * @see #getRegistrationModule()
	 * @generated
	 */
	EAttribute getRegistrationModule_ConfigurationSynonym();

	/**
	 * Returns the meta object for the attribute '{@link ru.capralow.dt.conversion.plugin.core.rm.model.RegistrationModule#getConfigurationVersion <em>Configuration Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Configuration Version</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.rm.model.RegistrationModule#getConfigurationVersion()
	 * @see #getRegistrationModule()
	 * @generated
	 */
	EAttribute getRegistrationModule_ConfigurationVersion();

	/**
	 * Returns the meta object for the containment reference list '{@link ru.capralow.dt.conversion.plugin.core.rm.model.RegistrationModule#getExchangePlanContent <em>Exchange Plan Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Exchange Plan Content</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.rm.model.RegistrationModule#getExchangePlanContent()
	 * @see #getRegistrationModule()
	 * @generated
	 */
	EReference getRegistrationModule_ExchangePlanContent();

	/**
	 * Returns the meta object for the containment reference list '{@link ru.capralow.dt.conversion.plugin.core.rm.model.RegistrationModule#getRegistrationRules <em>Registration Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Registration Rules</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.rm.model.RegistrationModule#getRegistrationRules()
	 * @see #getRegistrationModule()
	 * @generated
	 */
	EReference getRegistrationModule_RegistrationRules();

	/**
	 * Returns the meta object for class '{@link ru.capralow.dt.conversion.plugin.core.rm.model.ExchangePlanContent <em>Exchange Plan Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exchange Plan Content</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.rm.model.ExchangePlanContent
	 * @generated
	 */
	EClass getExchangePlanContent();

	/**
	 * Returns the meta object for the attribute '{@link ru.capralow.dt.conversion.plugin.core.rm.model.ExchangePlanContent#getMdObject <em>Md Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Md Object</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.rm.model.ExchangePlanContent#getMdObject()
	 * @see #getExchangePlanContent()
	 * @generated
	 */
	EAttribute getExchangePlanContent_MdObject();

	/**
	 * Returns the meta object for the attribute '{@link ru.capralow.dt.conversion.plugin.core.rm.model.ExchangePlanContent#getAutoRecord <em>Auto Record</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Auto Record</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.rm.model.ExchangePlanContent#getAutoRecord()
	 * @see #getExchangePlanContent()
	 * @generated
	 */
	EAttribute getExchangePlanContent_AutoRecord();

	/**
	 * Returns the meta object for class '{@link ru.capralow.dt.conversion.plugin.core.rm.model.RegistrationRule <em>Registration Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Registration Rule</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.rm.model.RegistrationRule
	 * @generated
	 */
	EClass getRegistrationRule();

	/**
	 * Returns the meta object for the attribute '{@link ru.capralow.dt.conversion.plugin.core.rm.model.RegistrationRule#getIsFolder <em>Is Folder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Folder</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.rm.model.RegistrationRule#getIsFolder()
	 * @see #getRegistrationRule()
	 * @generated
	 */
	EAttribute getRegistrationRule_IsFolder();

	/**
	 * Returns the meta object for the attribute '{@link ru.capralow.dt.conversion.plugin.core.rm.model.RegistrationRule#getDisabled <em>Disabled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Disabled</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.rm.model.RegistrationRule#getDisabled()
	 * @see #getRegistrationRule()
	 * @generated
	 */
	EAttribute getRegistrationRule_Disabled();

	/**
	 * Returns the meta object for the attribute '{@link ru.capralow.dt.conversion.plugin.core.rm.model.RegistrationRule#getValid <em>Valid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Valid</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.rm.model.RegistrationRule#getValid()
	 * @see #getRegistrationRule()
	 * @generated
	 */
	EAttribute getRegistrationRule_Valid();

	/**
	 * Returns the meta object for the attribute '{@link ru.capralow.dt.conversion.plugin.core.rm.model.RegistrationRule#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.rm.model.RegistrationRule#getCode()
	 * @see #getRegistrationRule()
	 * @generated
	 */
	EAttribute getRegistrationRule_Code();

	/**
	 * Returns the meta object for the attribute '{@link ru.capralow.dt.conversion.plugin.core.rm.model.RegistrationRule#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.rm.model.RegistrationRule#getName()
	 * @see #getRegistrationRule()
	 * @generated
	 */
	EAttribute getRegistrationRule_Name();

	/**
	 * Returns the meta object for the attribute '{@link ru.capralow.dt.conversion.plugin.core.rm.model.RegistrationRule#getMdObject <em>Md Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Md Object</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.rm.model.RegistrationRule#getMdObject()
	 * @see #getRegistrationRule()
	 * @generated
	 */
	EAttribute getRegistrationRule_MdObject();

	/**
	 * Returns the meta object for the attribute '{@link ru.capralow.dt.conversion.plugin.core.rm.model.RegistrationRule#getObjectName <em>Object Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Object Name</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.rm.model.RegistrationRule#getObjectName()
	 * @see #getRegistrationRule()
	 * @generated
	 */
	EAttribute getRegistrationRule_ObjectName();

	/**
	 * Returns the meta object for the attribute '{@link ru.capralow.dt.conversion.plugin.core.rm.model.RegistrationRule#getMdClass <em>Md Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Md Class</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.rm.model.RegistrationRule#getMdClass()
	 * @see #getRegistrationRule()
	 * @generated
	 */
	EAttribute getRegistrationRule_MdClass();

	/**
	 * Returns the meta object for the attribute '{@link ru.capralow.dt.conversion.plugin.core.rm.model.RegistrationRule#getAttributeSendMode <em>Attribute Send Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attribute Send Mode</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.rm.model.RegistrationRule#getAttributeSendMode()
	 * @see #getRegistrationRule()
	 * @generated
	 */
	EAttribute getRegistrationRule_AttributeSendMode();

	/**
	 * Returns the meta object for the containment reference list '{@link ru.capralow.dt.conversion.plugin.core.rm.model.RegistrationRule#getObjectSelectionRules <em>Object Selection Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Object Selection Rules</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.rm.model.RegistrationRule#getObjectSelectionRules()
	 * @see #getRegistrationRule()
	 * @generated
	 */
	EReference getRegistrationRule_ObjectSelectionRules();

	/**
	 * Returns the meta object for the containment reference list '{@link ru.capralow.dt.conversion.plugin.core.rm.model.RegistrationRule#getExchangePlanSelectionRules <em>Exchange Plan Selection Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Exchange Plan Selection Rules</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.rm.model.RegistrationRule#getExchangePlanSelectionRules()
	 * @see #getRegistrationRule()
	 * @generated
	 */
	EReference getRegistrationRule_ExchangePlanSelectionRules();

	/**
	 * Returns the meta object for class '{@link ru.capralow.dt.conversion.plugin.core.rm.model.ObjectSelectionRule <em>Object Selection Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object Selection Rule</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.rm.model.ObjectSelectionRule
	 * @generated
	 */
	EClass getObjectSelectionRule();

	/**
	 * Returns the meta object for the attribute '{@link ru.capralow.dt.conversion.plugin.core.rm.model.ObjectSelectionRule#getIsFolder <em>Is Folder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Folder</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.rm.model.ObjectSelectionRule#getIsFolder()
	 * @see #getObjectSelectionRule()
	 * @generated
	 */
	EAttribute getObjectSelectionRule_IsFolder();

	/**
	 * Returns the meta object for class '{@link ru.capralow.dt.conversion.plugin.core.rm.model.ExchangePlanSelectionRule <em>Exchange Plan Selection Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exchange Plan Selection Rule</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.rm.model.ExchangePlanSelectionRule
	 * @generated
	 */
	EClass getExchangePlanSelectionRule();

	/**
	 * Returns the meta object for the attribute '{@link ru.capralow.dt.conversion.plugin.core.rm.model.ExchangePlanSelectionRule#getIsFolder <em>Is Folder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Folder</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.rm.model.ExchangePlanSelectionRule#getIsFolder()
	 * @see #getExchangePlanSelectionRule()
	 * @generated
	 */
	EAttribute getExchangePlanSelectionRule_IsFolder();

	/**
	 * Returns the meta object for enum '{@link ru.capralow.dt.conversion.plugin.core.rm.model.AutoRegistration <em>Auto Registration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Auto Registration</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.rm.model.AutoRegistration
	 * @generated
	 */
	EEnum getAutoRegistration();

	/**
	 * Returns the meta object for data type '{@link java.util.Date <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Date</em>'.
	 * @see java.util.Date
	 * @model instanceClass="java.util.Date"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel create='&lt;%java.util.Date%&gt; _xtrycatchfinallyexpression = null;\ntry\n{\n\t&lt;%java.util.Date%&gt; _xifexpression = null;\n\tif ((it != null))\n\t{\n\t\t_xifexpression = new &lt;%java.text.SimpleDateFormat%&gt;(\"yyyy-MM-ddTHH:mm:ss\").parse(it);\n\t}\n\t_xtrycatchfinallyexpression = _xifexpression;\n}\ncatch (final Throwable _t) {\n\tif (_t instanceof &lt;%java.text.ParseException%&gt;) {\n\t\tfinal &lt;%java.text.ParseException%&gt; exception = (&lt;%java.text.ParseException%&gt;)_t;\n\t\tthrow new &lt;%java.lang.RuntimeException%&gt;(exception);\n\t}\n\telse\n\t{\n\t\tthrow &lt;%org.eclipse.xtext.xbase.lib.Exceptions%&gt;.sneakyThrow(_t);\n\t}\n}\nreturn _xtrycatchfinallyexpression;' convert='&lt;%java.lang.String%&gt; _xifexpression = null;\nif ((it != null))\n{\n\t_xifexpression = new &lt;%java.text.SimpleDateFormat%&gt;(\"yyyy-MM-ddTHH:mm:ss\").format(it);\n}\nreturn _xifexpression;'"
	 * @generated
	 */
	EDataType getDate();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	rmFactory getrmFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link ru.capralow.dt.conversion.plugin.core.rm.model.impl.RegistrationModuleImpl <em>Registration Module</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ru.capralow.dt.conversion.plugin.core.rm.model.impl.RegistrationModuleImpl
		 * @see ru.capralow.dt.conversion.plugin.core.rm.model.impl.rmPackageImpl#getRegistrationModule()
		 * @generated
		 */
		EClass REGISTRATION_MODULE = eINSTANCE.getRegistrationModule();

		/**
		 * The meta object literal for the '<em><b>Module Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REGISTRATION_MODULE__MODULE_REF = eINSTANCE.getRegistrationModule_ModuleRef();

		/**
		 * The meta object literal for the '<em><b>Module Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REGISTRATION_MODULE__MODULE_NAME = eINSTANCE.getRegistrationModule_ModuleName();

		/**
		 * The meta object literal for the '<em><b>Module Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REGISTRATION_MODULE__MODULE_VERSION = eINSTANCE.getRegistrationModule_ModuleVersion();

		/**
		 * The meta object literal for the '<em><b>Module Creation Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REGISTRATION_MODULE__MODULE_CREATION_DATE = eINSTANCE.getRegistrationModule_ModuleCreationDate();

		/**
		 * The meta object literal for the '<em><b>Exchange Plan Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REGISTRATION_MODULE__EXCHANGE_PLAN_NAME = eINSTANCE.getRegistrationModule_ExchangePlanName();

		/**
		 * The meta object literal for the '<em><b>Exchange Plan Md Object</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REGISTRATION_MODULE__EXCHANGE_PLAN_MD_OBJECT = eINSTANCE.getRegistrationModule_ExchangePlanMdObject();

		/**
		 * The meta object literal for the '<em><b>Runtime Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REGISTRATION_MODULE__RUNTIME_VERSION = eINSTANCE.getRegistrationModule_RuntimeVersion();

		/**
		 * The meta object literal for the '<em><b>Configuration Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REGISTRATION_MODULE__CONFIGURATION_NAME = eINSTANCE.getRegistrationModule_ConfigurationName();

		/**
		 * The meta object literal for the '<em><b>Configuration Synonym</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REGISTRATION_MODULE__CONFIGURATION_SYNONYM = eINSTANCE.getRegistrationModule_ConfigurationSynonym();

		/**
		 * The meta object literal for the '<em><b>Configuration Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REGISTRATION_MODULE__CONFIGURATION_VERSION = eINSTANCE.getRegistrationModule_ConfigurationVersion();

		/**
		 * The meta object literal for the '<em><b>Exchange Plan Content</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGISTRATION_MODULE__EXCHANGE_PLAN_CONTENT = eINSTANCE.getRegistrationModule_ExchangePlanContent();

		/**
		 * The meta object literal for the '<em><b>Registration Rules</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGISTRATION_MODULE__REGISTRATION_RULES = eINSTANCE.getRegistrationModule_RegistrationRules();

		/**
		 * The meta object literal for the '{@link ru.capralow.dt.conversion.plugin.core.rm.model.impl.ExchangePlanContentImpl <em>Exchange Plan Content</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ru.capralow.dt.conversion.plugin.core.rm.model.impl.ExchangePlanContentImpl
		 * @see ru.capralow.dt.conversion.plugin.core.rm.model.impl.rmPackageImpl#getExchangePlanContent()
		 * @generated
		 */
		EClass EXCHANGE_PLAN_CONTENT = eINSTANCE.getExchangePlanContent();

		/**
		 * The meta object literal for the '<em><b>Md Object</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXCHANGE_PLAN_CONTENT__MD_OBJECT = eINSTANCE.getExchangePlanContent_MdObject();

		/**
		 * The meta object literal for the '<em><b>Auto Record</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXCHANGE_PLAN_CONTENT__AUTO_RECORD = eINSTANCE.getExchangePlanContent_AutoRecord();

		/**
		 * The meta object literal for the '{@link ru.capralow.dt.conversion.plugin.core.rm.model.impl.RegistrationRuleImpl <em>Registration Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ru.capralow.dt.conversion.plugin.core.rm.model.impl.RegistrationRuleImpl
		 * @see ru.capralow.dt.conversion.plugin.core.rm.model.impl.rmPackageImpl#getRegistrationRule()
		 * @generated
		 */
		EClass REGISTRATION_RULE = eINSTANCE.getRegistrationRule();

		/**
		 * The meta object literal for the '<em><b>Is Folder</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REGISTRATION_RULE__IS_FOLDER = eINSTANCE.getRegistrationRule_IsFolder();

		/**
		 * The meta object literal for the '<em><b>Disabled</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REGISTRATION_RULE__DISABLED = eINSTANCE.getRegistrationRule_Disabled();

		/**
		 * The meta object literal for the '<em><b>Valid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REGISTRATION_RULE__VALID = eINSTANCE.getRegistrationRule_Valid();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REGISTRATION_RULE__CODE = eINSTANCE.getRegistrationRule_Code();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REGISTRATION_RULE__NAME = eINSTANCE.getRegistrationRule_Name();

		/**
		 * The meta object literal for the '<em><b>Md Object</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REGISTRATION_RULE__MD_OBJECT = eINSTANCE.getRegistrationRule_MdObject();

		/**
		 * The meta object literal for the '<em><b>Object Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REGISTRATION_RULE__OBJECT_NAME = eINSTANCE.getRegistrationRule_ObjectName();

		/**
		 * The meta object literal for the '<em><b>Md Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REGISTRATION_RULE__MD_CLASS = eINSTANCE.getRegistrationRule_MdClass();

		/**
		 * The meta object literal for the '<em><b>Attribute Send Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REGISTRATION_RULE__ATTRIBUTE_SEND_MODE = eINSTANCE.getRegistrationRule_AttributeSendMode();

		/**
		 * The meta object literal for the '<em><b>Object Selection Rules</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGISTRATION_RULE__OBJECT_SELECTION_RULES = eINSTANCE.getRegistrationRule_ObjectSelectionRules();

		/**
		 * The meta object literal for the '<em><b>Exchange Plan Selection Rules</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGISTRATION_RULE__EXCHANGE_PLAN_SELECTION_RULES = eINSTANCE.getRegistrationRule_ExchangePlanSelectionRules();

		/**
		 * The meta object literal for the '{@link ru.capralow.dt.conversion.plugin.core.rm.model.impl.ObjectSelectionRuleImpl <em>Object Selection Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ru.capralow.dt.conversion.plugin.core.rm.model.impl.ObjectSelectionRuleImpl
		 * @see ru.capralow.dt.conversion.plugin.core.rm.model.impl.rmPackageImpl#getObjectSelectionRule()
		 * @generated
		 */
		EClass OBJECT_SELECTION_RULE = eINSTANCE.getObjectSelectionRule();

		/**
		 * The meta object literal for the '<em><b>Is Folder</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBJECT_SELECTION_RULE__IS_FOLDER = eINSTANCE.getObjectSelectionRule_IsFolder();

		/**
		 * The meta object literal for the '{@link ru.capralow.dt.conversion.plugin.core.rm.model.impl.ExchangePlanSelectionRuleImpl <em>Exchange Plan Selection Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ru.capralow.dt.conversion.plugin.core.rm.model.impl.ExchangePlanSelectionRuleImpl
		 * @see ru.capralow.dt.conversion.plugin.core.rm.model.impl.rmPackageImpl#getExchangePlanSelectionRule()
		 * @generated
		 */
		EClass EXCHANGE_PLAN_SELECTION_RULE = eINSTANCE.getExchangePlanSelectionRule();

		/**
		 * The meta object literal for the '<em><b>Is Folder</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXCHANGE_PLAN_SELECTION_RULE__IS_FOLDER = eINSTANCE.getExchangePlanSelectionRule_IsFolder();

		/**
		 * The meta object literal for the '{@link ru.capralow.dt.conversion.plugin.core.rm.model.AutoRegistration <em>Auto Registration</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ru.capralow.dt.conversion.plugin.core.rm.model.AutoRegistration
		 * @see ru.capralow.dt.conversion.plugin.core.rm.model.impl.rmPackageImpl#getAutoRegistration()
		 * @generated
		 */
		EEnum AUTO_REGISTRATION = eINSTANCE.getAutoRegistration();

		/**
		 * The meta object literal for the '<em>Date</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.Date
		 * @see ru.capralow.dt.conversion.plugin.core.rm.model.impl.rmPackageImpl#getDate()
		 * @generated
		 */
		EDataType DATE = eINSTANCE.getDate();

	}

} //rmPackage

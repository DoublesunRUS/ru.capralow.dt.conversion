/**
 */
package ru.capralow.dt.conversion.plugin.core.rm;

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
 * @see ru.capralow.dt.conversion.plugin.core.rm.RmFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel publicConstructors='true' loadInitialization='false' literalsInterface='true' nonNLSMarkers='true' updateClasspath='false' featureDelegation='Reflective' rootExtendsClass='com._1c.g5.v8.bm.core.BmObject' rootExtendsInterface='com._1c.g5.v8.bm.core.IBmObject' basePackage='ru.capralow.dt.conversion.plugin.core'"
 * @generated
 */
public interface RmPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "rm"; //$NON-NLS-1$

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "ru.capralow.dt.conversion.plugin.core.rm"; //$NON-NLS-1$

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
	RmPackage eINSTANCE = ru.capralow.dt.conversion.plugin.core.rm.impl.RmPackageImpl.init();

	/**
	 * The meta object id for the '{@link ru.capralow.dt.conversion.plugin.core.rm.impl.RegistrationModuleImpl <em>Registration Module</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.capralow.dt.conversion.plugin.core.rm.impl.RegistrationModuleImpl
	 * @see ru.capralow.dt.conversion.plugin.core.rm.impl.RmPackageImpl#getRegistrationModule()
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
	 * The meta object id for the '{@link ru.capralow.dt.conversion.plugin.core.rm.impl.ExchangePlanContentImpl <em>Exchange Plan Content</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.capralow.dt.conversion.plugin.core.rm.impl.ExchangePlanContentImpl
	 * @see ru.capralow.dt.conversion.plugin.core.rm.impl.RmPackageImpl#getExchangePlanContent()
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
	 * The meta object id for the '{@link ru.capralow.dt.conversion.plugin.core.rm.impl.RegistrationRuleImpl <em>Registration Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.capralow.dt.conversion.plugin.core.rm.impl.RegistrationRuleImpl
	 * @see ru.capralow.dt.conversion.plugin.core.rm.impl.RmPackageImpl#getRegistrationRule()
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
	 * The meta object id for the '{@link ru.capralow.dt.conversion.plugin.core.rm.impl.ObjectSelectionRuleImpl <em>Object Selection Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.capralow.dt.conversion.plugin.core.rm.impl.ObjectSelectionRuleImpl
	 * @see ru.capralow.dt.conversion.plugin.core.rm.impl.RmPackageImpl#getObjectSelectionRule()
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
	 * The meta object id for the '{@link ru.capralow.dt.conversion.plugin.core.rm.impl.ExchangePlanSelectionRuleImpl <em>Exchange Plan Selection Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.capralow.dt.conversion.plugin.core.rm.impl.ExchangePlanSelectionRuleImpl
	 * @see ru.capralow.dt.conversion.plugin.core.rm.impl.RmPackageImpl#getExchangePlanSelectionRule()
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
	 * The meta object id for the '{@link ru.capralow.dt.conversion.plugin.core.rm.AutoRegistration <em>Auto Registration</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.capralow.dt.conversion.plugin.core.rm.AutoRegistration
	 * @see ru.capralow.dt.conversion.plugin.core.rm.impl.RmPackageImpl#getAutoRegistration()
	 * @generated
	 */
	int AUTO_REGISTRATION = 5;

	/**
	 * The meta object id for the '<em>Date</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.Date
	 * @see ru.capralow.dt.conversion.plugin.core.rm.impl.RmPackageImpl#getDate()
	 * @generated
	 */
	int DATE = 6;


	/**
	 * Returns the meta object for class '{@link ru.capralow.dt.conversion.plugin.core.rm.RegistrationModule <em>Registration Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Registration Module</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.rm.RegistrationModule
	 * @generated
	 */
	EClass getRegistrationModule();

	/**
	 * Returns the meta object for the attribute '{@link ru.capralow.dt.conversion.plugin.core.rm.RegistrationModule#getModuleRef <em>Module Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Module Ref</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.rm.RegistrationModule#getModuleRef()
	 * @see #getRegistrationModule()
	 * @generated
	 */
	EAttribute getRegistrationModule_ModuleRef();

	/**
	 * Returns the meta object for the attribute '{@link ru.capralow.dt.conversion.plugin.core.rm.RegistrationModule#getModuleName <em>Module Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Module Name</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.rm.RegistrationModule#getModuleName()
	 * @see #getRegistrationModule()
	 * @generated
	 */
	EAttribute getRegistrationModule_ModuleName();

	/**
	 * Returns the meta object for the attribute '{@link ru.capralow.dt.conversion.plugin.core.rm.RegistrationModule#getModuleVersion <em>Module Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Module Version</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.rm.RegistrationModule#getModuleVersion()
	 * @see #getRegistrationModule()
	 * @generated
	 */
	EAttribute getRegistrationModule_ModuleVersion();

	/**
	 * Returns the meta object for the attribute '{@link ru.capralow.dt.conversion.plugin.core.rm.RegistrationModule#getModuleCreationDate <em>Module Creation Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Module Creation Date</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.rm.RegistrationModule#getModuleCreationDate()
	 * @see #getRegistrationModule()
	 * @generated
	 */
	EAttribute getRegistrationModule_ModuleCreationDate();

	/**
	 * Returns the meta object for the attribute '{@link ru.capralow.dt.conversion.plugin.core.rm.RegistrationModule#getExchangePlanName <em>Exchange Plan Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Exchange Plan Name</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.rm.RegistrationModule#getExchangePlanName()
	 * @see #getRegistrationModule()
	 * @generated
	 */
	EAttribute getRegistrationModule_ExchangePlanName();

	/**
	 * Returns the meta object for the attribute '{@link ru.capralow.dt.conversion.plugin.core.rm.RegistrationModule#getExchangePlanMdObject <em>Exchange Plan Md Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Exchange Plan Md Object</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.rm.RegistrationModule#getExchangePlanMdObject()
	 * @see #getRegistrationModule()
	 * @generated
	 */
	EAttribute getRegistrationModule_ExchangePlanMdObject();

	/**
	 * Returns the meta object for the attribute '{@link ru.capralow.dt.conversion.plugin.core.rm.RegistrationModule#getRuntimeVersion <em>Runtime Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Runtime Version</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.rm.RegistrationModule#getRuntimeVersion()
	 * @see #getRegistrationModule()
	 * @generated
	 */
	EAttribute getRegistrationModule_RuntimeVersion();

	/**
	 * Returns the meta object for the attribute '{@link ru.capralow.dt.conversion.plugin.core.rm.RegistrationModule#getConfigurationName <em>Configuration Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Configuration Name</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.rm.RegistrationModule#getConfigurationName()
	 * @see #getRegistrationModule()
	 * @generated
	 */
	EAttribute getRegistrationModule_ConfigurationName();

	/**
	 * Returns the meta object for the attribute '{@link ru.capralow.dt.conversion.plugin.core.rm.RegistrationModule#getConfigurationSynonym <em>Configuration Synonym</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Configuration Synonym</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.rm.RegistrationModule#getConfigurationSynonym()
	 * @see #getRegistrationModule()
	 * @generated
	 */
	EAttribute getRegistrationModule_ConfigurationSynonym();

	/**
	 * Returns the meta object for the attribute '{@link ru.capralow.dt.conversion.plugin.core.rm.RegistrationModule#getConfigurationVersion <em>Configuration Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Configuration Version</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.rm.RegistrationModule#getConfigurationVersion()
	 * @see #getRegistrationModule()
	 * @generated
	 */
	EAttribute getRegistrationModule_ConfigurationVersion();

	/**
	 * Returns the meta object for the containment reference list '{@link ru.capralow.dt.conversion.plugin.core.rm.RegistrationModule#getExchangePlanContent <em>Exchange Plan Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Exchange Plan Content</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.rm.RegistrationModule#getExchangePlanContent()
	 * @see #getRegistrationModule()
	 * @generated
	 */
	EReference getRegistrationModule_ExchangePlanContent();

	/**
	 * Returns the meta object for the containment reference list '{@link ru.capralow.dt.conversion.plugin.core.rm.RegistrationModule#getRegistrationRules <em>Registration Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Registration Rules</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.rm.RegistrationModule#getRegistrationRules()
	 * @see #getRegistrationModule()
	 * @generated
	 */
	EReference getRegistrationModule_RegistrationRules();

	/**
	 * Returns the meta object for class '{@link ru.capralow.dt.conversion.plugin.core.rm.ExchangePlanContent <em>Exchange Plan Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exchange Plan Content</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.rm.ExchangePlanContent
	 * @generated
	 */
	EClass getExchangePlanContent();

	/**
	 * Returns the meta object for the attribute '{@link ru.capralow.dt.conversion.plugin.core.rm.ExchangePlanContent#getMdObject <em>Md Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Md Object</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.rm.ExchangePlanContent#getMdObject()
	 * @see #getExchangePlanContent()
	 * @generated
	 */
	EAttribute getExchangePlanContent_MdObject();

	/**
	 * Returns the meta object for the attribute '{@link ru.capralow.dt.conversion.plugin.core.rm.ExchangePlanContent#getAutoRecord <em>Auto Record</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Auto Record</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.rm.ExchangePlanContent#getAutoRecord()
	 * @see #getExchangePlanContent()
	 * @generated
	 */
	EAttribute getExchangePlanContent_AutoRecord();

	/**
	 * Returns the meta object for class '{@link ru.capralow.dt.conversion.plugin.core.rm.RegistrationRule <em>Registration Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Registration Rule</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.rm.RegistrationRule
	 * @generated
	 */
	EClass getRegistrationRule();

	/**
	 * Returns the meta object for the attribute '{@link ru.capralow.dt.conversion.plugin.core.rm.RegistrationRule#getIsFolder <em>Is Folder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Folder</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.rm.RegistrationRule#getIsFolder()
	 * @see #getRegistrationRule()
	 * @generated
	 */
	EAttribute getRegistrationRule_IsFolder();

	/**
	 * Returns the meta object for the attribute '{@link ru.capralow.dt.conversion.plugin.core.rm.RegistrationRule#getDisabled <em>Disabled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Disabled</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.rm.RegistrationRule#getDisabled()
	 * @see #getRegistrationRule()
	 * @generated
	 */
	EAttribute getRegistrationRule_Disabled();

	/**
	 * Returns the meta object for the attribute '{@link ru.capralow.dt.conversion.plugin.core.rm.RegistrationRule#getValid <em>Valid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Valid</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.rm.RegistrationRule#getValid()
	 * @see #getRegistrationRule()
	 * @generated
	 */
	EAttribute getRegistrationRule_Valid();

	/**
	 * Returns the meta object for the attribute '{@link ru.capralow.dt.conversion.plugin.core.rm.RegistrationRule#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.rm.RegistrationRule#getCode()
	 * @see #getRegistrationRule()
	 * @generated
	 */
	EAttribute getRegistrationRule_Code();

	/**
	 * Returns the meta object for the attribute '{@link ru.capralow.dt.conversion.plugin.core.rm.RegistrationRule#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.rm.RegistrationRule#getName()
	 * @see #getRegistrationRule()
	 * @generated
	 */
	EAttribute getRegistrationRule_Name();

	/**
	 * Returns the meta object for the attribute '{@link ru.capralow.dt.conversion.plugin.core.rm.RegistrationRule#getMdObject <em>Md Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Md Object</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.rm.RegistrationRule#getMdObject()
	 * @see #getRegistrationRule()
	 * @generated
	 */
	EAttribute getRegistrationRule_MdObject();

	/**
	 * Returns the meta object for the attribute '{@link ru.capralow.dt.conversion.plugin.core.rm.RegistrationRule#getObjectName <em>Object Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Object Name</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.rm.RegistrationRule#getObjectName()
	 * @see #getRegistrationRule()
	 * @generated
	 */
	EAttribute getRegistrationRule_ObjectName();

	/**
	 * Returns the meta object for the attribute '{@link ru.capralow.dt.conversion.plugin.core.rm.RegistrationRule#getMdClass <em>Md Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Md Class</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.rm.RegistrationRule#getMdClass()
	 * @see #getRegistrationRule()
	 * @generated
	 */
	EAttribute getRegistrationRule_MdClass();

	/**
	 * Returns the meta object for the attribute '{@link ru.capralow.dt.conversion.plugin.core.rm.RegistrationRule#getAttributeSendMode <em>Attribute Send Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attribute Send Mode</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.rm.RegistrationRule#getAttributeSendMode()
	 * @see #getRegistrationRule()
	 * @generated
	 */
	EAttribute getRegistrationRule_AttributeSendMode();

	/**
	 * Returns the meta object for the containment reference list '{@link ru.capralow.dt.conversion.plugin.core.rm.RegistrationRule#getObjectSelectionRules <em>Object Selection Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Object Selection Rules</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.rm.RegistrationRule#getObjectSelectionRules()
	 * @see #getRegistrationRule()
	 * @generated
	 */
	EReference getRegistrationRule_ObjectSelectionRules();

	/**
	 * Returns the meta object for the containment reference list '{@link ru.capralow.dt.conversion.plugin.core.rm.RegistrationRule#getExchangePlanSelectionRules <em>Exchange Plan Selection Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Exchange Plan Selection Rules</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.rm.RegistrationRule#getExchangePlanSelectionRules()
	 * @see #getRegistrationRule()
	 * @generated
	 */
	EReference getRegistrationRule_ExchangePlanSelectionRules();

	/**
	 * Returns the meta object for class '{@link ru.capralow.dt.conversion.plugin.core.rm.ObjectSelectionRule <em>Object Selection Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object Selection Rule</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.rm.ObjectSelectionRule
	 * @generated
	 */
	EClass getObjectSelectionRule();

	/**
	 * Returns the meta object for the attribute '{@link ru.capralow.dt.conversion.plugin.core.rm.ObjectSelectionRule#getIsFolder <em>Is Folder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Folder</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.rm.ObjectSelectionRule#getIsFolder()
	 * @see #getObjectSelectionRule()
	 * @generated
	 */
	EAttribute getObjectSelectionRule_IsFolder();

	/**
	 * Returns the meta object for class '{@link ru.capralow.dt.conversion.plugin.core.rm.ExchangePlanSelectionRule <em>Exchange Plan Selection Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exchange Plan Selection Rule</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.rm.ExchangePlanSelectionRule
	 * @generated
	 */
	EClass getExchangePlanSelectionRule();

	/**
	 * Returns the meta object for the attribute '{@link ru.capralow.dt.conversion.plugin.core.rm.ExchangePlanSelectionRule#getIsFolder <em>Is Folder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Folder</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.rm.ExchangePlanSelectionRule#getIsFolder()
	 * @see #getExchangePlanSelectionRule()
	 * @generated
	 */
	EAttribute getExchangePlanSelectionRule_IsFolder();

	/**
	 * Returns the meta object for enum '{@link ru.capralow.dt.conversion.plugin.core.rm.AutoRegistration <em>Auto Registration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Auto Registration</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.rm.AutoRegistration
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
	RmFactory getRmFactory();

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
		 * The meta object literal for the '{@link ru.capralow.dt.conversion.plugin.core.rm.impl.RegistrationModuleImpl <em>Registration Module</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ru.capralow.dt.conversion.plugin.core.rm.impl.RegistrationModuleImpl
		 * @see ru.capralow.dt.conversion.plugin.core.rm.impl.RmPackageImpl#getRegistrationModule()
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
		 * The meta object literal for the '{@link ru.capralow.dt.conversion.plugin.core.rm.impl.ExchangePlanContentImpl <em>Exchange Plan Content</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ru.capralow.dt.conversion.plugin.core.rm.impl.ExchangePlanContentImpl
		 * @see ru.capralow.dt.conversion.plugin.core.rm.impl.RmPackageImpl#getExchangePlanContent()
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
		 * The meta object literal for the '{@link ru.capralow.dt.conversion.plugin.core.rm.impl.RegistrationRuleImpl <em>Registration Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ru.capralow.dt.conversion.plugin.core.rm.impl.RegistrationRuleImpl
		 * @see ru.capralow.dt.conversion.plugin.core.rm.impl.RmPackageImpl#getRegistrationRule()
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
		 * The meta object literal for the '{@link ru.capralow.dt.conversion.plugin.core.rm.impl.ObjectSelectionRuleImpl <em>Object Selection Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ru.capralow.dt.conversion.plugin.core.rm.impl.ObjectSelectionRuleImpl
		 * @see ru.capralow.dt.conversion.plugin.core.rm.impl.RmPackageImpl#getObjectSelectionRule()
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
		 * The meta object literal for the '{@link ru.capralow.dt.conversion.plugin.core.rm.impl.ExchangePlanSelectionRuleImpl <em>Exchange Plan Selection Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ru.capralow.dt.conversion.plugin.core.rm.impl.ExchangePlanSelectionRuleImpl
		 * @see ru.capralow.dt.conversion.plugin.core.rm.impl.RmPackageImpl#getExchangePlanSelectionRule()
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
		 * The meta object literal for the '{@link ru.capralow.dt.conversion.plugin.core.rm.AutoRegistration <em>Auto Registration</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ru.capralow.dt.conversion.plugin.core.rm.AutoRegistration
		 * @see ru.capralow.dt.conversion.plugin.core.rm.impl.RmPackageImpl#getAutoRegistration()
		 * @generated
		 */
		EEnum AUTO_REGISTRATION = eINSTANCE.getAutoRegistration();

		/**
		 * The meta object literal for the '<em>Date</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.Date
		 * @see ru.capralow.dt.conversion.plugin.core.rm.impl.RmPackageImpl#getDate()
		 * @generated
		 */
		EDataType DATE = eINSTANCE.getDate();

	}

} //RmPackage

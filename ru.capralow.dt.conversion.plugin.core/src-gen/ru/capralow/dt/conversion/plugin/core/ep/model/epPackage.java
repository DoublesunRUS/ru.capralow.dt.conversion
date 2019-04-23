/**
 */
package ru.capralow.dt.conversion.plugin.core.ep.model;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
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
 * @see ru.capralow.dt.conversion.plugin.core.ep.model.epFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel loadInitialization='false' literalsInterface='true' nonNLSMarkers='true' prefix='ep' updateClasspath='false' basePackage='ru.capralow.dt.conversion.plugin.core.ep'"
 * @generated
 */
public interface epPackage extends EPackage {
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
	String eNS_URI = "http://ru.capralow.dt.conversion.plugin.core.ep.model"; //$NON-NLS-1$

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ep"; //$NON-NLS-1$

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	epPackage eINSTANCE = ru.capralow.dt.conversion.plugin.core.ep.model.impl.epPackageImpl.init();

	/**
	 * The meta object id for the '{@link ru.capralow.dt.conversion.plugin.core.ep.model.impl.ExchangeProjectImpl <em>Exchange Project</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.capralow.dt.conversion.plugin.core.ep.model.impl.ExchangeProjectImpl
	 * @see ru.capralow.dt.conversion.plugin.core.ep.model.impl.epPackageImpl#getExchangeProject()
	 * @generated
	 */
	int EXCHANGE_PROJECT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCHANGE_PROJECT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Store Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCHANGE_PROJECT__STORE_VERSION = 1;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCHANGE_PROJECT__EXTENSIONS = 2;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCHANGE_PROJECT__STATUS = 3;

	/**
	 * The feature id for the '<em><b>Format Versions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCHANGE_PROJECT__FORMAT_VERSIONS = 4;

	/**
	 * The feature id for the '<em><b>Settings Modules</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCHANGE_PROJECT__SETTINGS_MODULES = 5;

	/**
	 * The number of structural features of the '<em>Exchange Project</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCHANGE_PROJECT_FEATURE_COUNT = 6;

	/**
	 * The operation id for the '<em>Get Versions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCHANGE_PROJECT___GET_VERSIONS = 0;

	/**
	 * The operation id for the '<em>Get Module Format Versions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCHANGE_PROJECT___GET_MODULE_FORMAT_VERSIONS__COMMONMODULE = 1;

	/**
	 * The operation id for the '<em>Get Format Modules</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCHANGE_PROJECT___GET_FORMAT_MODULES = 2;

	/**
	 * The number of operations of the '<em>Exchange Project</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCHANGE_PROJECT_OPERATION_COUNT = 3;

	/**
	 * The meta object id for the '{@link ru.capralow.dt.conversion.plugin.core.ep.model.impl.ExchangeProjectsImpl <em>Exchange Projects</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.capralow.dt.conversion.plugin.core.ep.model.impl.ExchangeProjectsImpl
	 * @see ru.capralow.dt.conversion.plugin.core.ep.model.impl.epPackageImpl#getExchangeProjects()
	 * @generated
	 */
	int EXCHANGE_PROJECTS = 1;

	/**
	 * The feature id for the '<em><b>Projects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCHANGE_PROJECTS__PROJECTS = 0;

	/**
	 * The number of structural features of the '<em>Exchange Projects</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCHANGE_PROJECTS_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Get Project</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCHANGE_PROJECTS___GET_PROJECT__STRING = 0;

	/**
	 * The number of operations of the '<em>Exchange Projects</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCHANGE_PROJECTS_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link ru.capralow.dt.conversion.plugin.core.ep.model.impl.EpExtensionImpl <em>Ep Extension</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.capralow.dt.conversion.plugin.core.ep.model.impl.EpExtensionImpl
	 * @see ru.capralow.dt.conversion.plugin.core.ep.model.impl.epPackageImpl#getEpExtension()
	 * @generated
	 */
	int EP_EXTENSION = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EP_EXTENSION__NAME = 0;

	/**
	 * The number of structural features of the '<em>Ep Extension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EP_EXTENSION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Ep Extension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EP_EXTENSION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ru.capralow.dt.conversion.plugin.core.ep.model.impl.EpFormatVersionImpl <em>Ep Format Version</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.capralow.dt.conversion.plugin.core.ep.model.impl.EpFormatVersionImpl
	 * @see ru.capralow.dt.conversion.plugin.core.ep.model.impl.epPackageImpl#getEpFormatVersion()
	 * @generated
	 */
	int EP_FORMAT_VERSION = 3;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EP_FORMAT_VERSION__VERSION = 0;

	/**
	 * The feature id for the '<em><b>Extension Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EP_FORMAT_VERSION__EXTENSION_NAME = 1;

	/**
	 * The feature id for the '<em><b>Module Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EP_FORMAT_VERSION__MODULE_NAME = 2;

	/**
	 * The feature id for the '<em><b>Module</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EP_FORMAT_VERSION__MODULE = 3;

	/**
	 * The feature id for the '<em><b>Xdto Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EP_FORMAT_VERSION__XDTO_PACKAGE = 4;

	/**
	 * The number of structural features of the '<em>Ep Format Version</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EP_FORMAT_VERSION_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Ep Format Version</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EP_FORMAT_VERSION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ru.capralow.dt.conversion.plugin.core.ep.model.impl.ExchangeDataImpl <em>Exchange Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.capralow.dt.conversion.plugin.core.ep.model.impl.ExchangeDataImpl
	 * @see ru.capralow.dt.conversion.plugin.core.ep.model.impl.epPackageImpl#getExchangeData()
	 * @generated
	 */
	int EXCHANGE_DATA = 4;

	/**
	 * The feature id for the '<em><b>Projects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCHANGE_DATA__PROJECTS = 0;

	/**
	 * The feature id for the '<em><b>Pairs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCHANGE_DATA__PAIRS = 1;

	/**
	 * The number of structural features of the '<em>Exchange Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCHANGE_DATA_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Exchange Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCHANGE_DATA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ru.capralow.dt.conversion.plugin.core.ep.model.impl.EpExchangePairImpl <em>Ep Exchange Pair</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.capralow.dt.conversion.plugin.core.ep.model.impl.EpExchangePairImpl
	 * @see ru.capralow.dt.conversion.plugin.core.ep.model.impl.epPackageImpl#getEpExchangePair()
	 * @generated
	 */
	int EP_EXCHANGE_PAIR = 5;

	/**
	 * The feature id for the '<em><b>Configuration Name1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EP_EXCHANGE_PAIR__CONFIGURATION_NAME1 = 0;

	/**
	 * The feature id for the '<em><b>Configuration Name2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EP_EXCHANGE_PAIR__CONFIGURATION_NAME2 = 1;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EP_EXCHANGE_PAIR__STATUS = 2;

	/**
	 * The feature id for the '<em><b>Versions</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EP_EXCHANGE_PAIR__VERSIONS = 3;

	/**
	 * The number of structural features of the '<em>Ep Exchange Pair</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EP_EXCHANGE_PAIR_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Ep Exchange Pair</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EP_EXCHANGE_PAIR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ru.capralow.dt.conversion.plugin.core.ep.model.EpProjectStatus <em>Ep Project Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.capralow.dt.conversion.plugin.core.ep.model.EpProjectStatus
	 * @see ru.capralow.dt.conversion.plugin.core.ep.model.impl.epPackageImpl#getEpProjectStatus()
	 * @generated
	 */
	int EP_PROJECT_STATUS = 6;

	/**
	 * The meta object id for the '{@link ru.capralow.dt.conversion.plugin.core.ep.model.EpExchangePairStatus <em>Ep Exchange Pair Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.capralow.dt.conversion.plugin.core.ep.model.EpExchangePairStatus
	 * @see ru.capralow.dt.conversion.plugin.core.ep.model.impl.epPackageImpl#getEpExchangePairStatus()
	 * @generated
	 */
	int EP_EXCHANGE_PAIR_STATUS = 7;


	/**
	 * Returns the meta object for class '{@link ru.capralow.dt.conversion.plugin.core.ep.model.ExchangeProject <em>Exchange Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exchange Project</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.ep.model.ExchangeProject
	 * @generated
	 */
	EClass getExchangeProject();

	/**
	 * Returns the meta object for the attribute '{@link ru.capralow.dt.conversion.plugin.core.ep.model.ExchangeProject#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.ep.model.ExchangeProject#getName()
	 * @see #getExchangeProject()
	 * @generated
	 */
	EAttribute getExchangeProject_Name();

	/**
	 * Returns the meta object for the attribute '{@link ru.capralow.dt.conversion.plugin.core.ep.model.ExchangeProject#getStoreVersion <em>Store Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Store Version</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.ep.model.ExchangeProject#getStoreVersion()
	 * @see #getExchangeProject()
	 * @generated
	 */
	EAttribute getExchangeProject_StoreVersion();

	/**
	 * Returns the meta object for the containment reference list '{@link ru.capralow.dt.conversion.plugin.core.ep.model.ExchangeProject#getExtensions <em>Extensions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Extensions</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.ep.model.ExchangeProject#getExtensions()
	 * @see #getExchangeProject()
	 * @generated
	 */
	EReference getExchangeProject_Extensions();

	/**
	 * Returns the meta object for the attribute '{@link ru.capralow.dt.conversion.plugin.core.ep.model.ExchangeProject#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.ep.model.ExchangeProject#getStatus()
	 * @see #getExchangeProject()
	 * @generated
	 */
	EAttribute getExchangeProject_Status();

	/**
	 * Returns the meta object for the containment reference list '{@link ru.capralow.dt.conversion.plugin.core.ep.model.ExchangeProject#getFormatVersions <em>Format Versions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Format Versions</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.ep.model.ExchangeProject#getFormatVersions()
	 * @see #getExchangeProject()
	 * @generated
	 */
	EReference getExchangeProject_FormatVersions();

	/**
	 * Returns the meta object for the reference list '{@link ru.capralow.dt.conversion.plugin.core.ep.model.ExchangeProject#getSettingsModules <em>Settings Modules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Settings Modules</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.ep.model.ExchangeProject#getSettingsModules()
	 * @see #getExchangeProject()
	 * @generated
	 */
	EReference getExchangeProject_SettingsModules();

	/**
	 * Returns the meta object for the '{@link ru.capralow.dt.conversion.plugin.core.ep.model.ExchangeProject#getVersions() <em>Get Versions</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Versions</em>' operation.
	 * @see ru.capralow.dt.conversion.plugin.core.ep.model.ExchangeProject#getVersions()
	 * @generated
	 */
	EOperation getExchangeProject__GetVersions();

	/**
	 * Returns the meta object for the '{@link ru.capralow.dt.conversion.plugin.core.ep.model.ExchangeProject#getModuleFormatVersions(com._1c.g5.v8.dt.metadata.mdclass.CommonModule) <em>Get Module Format Versions</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Module Format Versions</em>' operation.
	 * @see ru.capralow.dt.conversion.plugin.core.ep.model.ExchangeProject#getModuleFormatVersions(com._1c.g5.v8.dt.metadata.mdclass.CommonModule)
	 * @generated
	 */
	EOperation getExchangeProject__GetModuleFormatVersions__CommonModule();

	/**
	 * Returns the meta object for the '{@link ru.capralow.dt.conversion.plugin.core.ep.model.ExchangeProject#getFormatModules() <em>Get Format Modules</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Format Modules</em>' operation.
	 * @see ru.capralow.dt.conversion.plugin.core.ep.model.ExchangeProject#getFormatModules()
	 * @generated
	 */
	EOperation getExchangeProject__GetFormatModules();

	/**
	 * Returns the meta object for class '{@link ru.capralow.dt.conversion.plugin.core.ep.model.ExchangeProjects <em>Exchange Projects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exchange Projects</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.ep.model.ExchangeProjects
	 * @generated
	 */
	EClass getExchangeProjects();

	/**
	 * Returns the meta object for the reference list '{@link ru.capralow.dt.conversion.plugin.core.ep.model.ExchangeProjects#getProjects <em>Projects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Projects</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.ep.model.ExchangeProjects#getProjects()
	 * @see #getExchangeProjects()
	 * @generated
	 */
	EReference getExchangeProjects_Projects();

	/**
	 * Returns the meta object for the '{@link ru.capralow.dt.conversion.plugin.core.ep.model.ExchangeProjects#getProject(java.lang.String) <em>Get Project</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Project</em>' operation.
	 * @see ru.capralow.dt.conversion.plugin.core.ep.model.ExchangeProjects#getProject(java.lang.String)
	 * @generated
	 */
	EOperation getExchangeProjects__GetProject__String();

	/**
	 * Returns the meta object for class '{@link ru.capralow.dt.conversion.plugin.core.ep.model.EpExtension <em>Ep Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ep Extension</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.ep.model.EpExtension
	 * @generated
	 */
	EClass getEpExtension();

	/**
	 * Returns the meta object for the attribute '{@link ru.capralow.dt.conversion.plugin.core.ep.model.EpExtension#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.ep.model.EpExtension#getName()
	 * @see #getEpExtension()
	 * @generated
	 */
	EAttribute getEpExtension_Name();

	/**
	 * Returns the meta object for class '{@link ru.capralow.dt.conversion.plugin.core.ep.model.EpFormatVersion <em>Ep Format Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ep Format Version</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.ep.model.EpFormatVersion
	 * @generated
	 */
	EClass getEpFormatVersion();

	/**
	 * Returns the meta object for the attribute '{@link ru.capralow.dt.conversion.plugin.core.ep.model.EpFormatVersion#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.ep.model.EpFormatVersion#getVersion()
	 * @see #getEpFormatVersion()
	 * @generated
	 */
	EAttribute getEpFormatVersion_Version();

	/**
	 * Returns the meta object for the attribute '{@link ru.capralow.dt.conversion.plugin.core.ep.model.EpFormatVersion#getExtensionName <em>Extension Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Extension Name</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.ep.model.EpFormatVersion#getExtensionName()
	 * @see #getEpFormatVersion()
	 * @generated
	 */
	EAttribute getEpFormatVersion_ExtensionName();

	/**
	 * Returns the meta object for the attribute '{@link ru.capralow.dt.conversion.plugin.core.ep.model.EpFormatVersion#getModuleName <em>Module Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Module Name</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.ep.model.EpFormatVersion#getModuleName()
	 * @see #getEpFormatVersion()
	 * @generated
	 */
	EAttribute getEpFormatVersion_ModuleName();

	/**
	 * Returns the meta object for the reference '{@link ru.capralow.dt.conversion.plugin.core.ep.model.EpFormatVersion#getModule <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Module</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.ep.model.EpFormatVersion#getModule()
	 * @see #getEpFormatVersion()
	 * @generated
	 */
	EReference getEpFormatVersion_Module();

	/**
	 * Returns the meta object for the reference '{@link ru.capralow.dt.conversion.plugin.core.ep.model.EpFormatVersion#getXdtoPackage <em>Xdto Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Xdto Package</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.ep.model.EpFormatVersion#getXdtoPackage()
	 * @see #getEpFormatVersion()
	 * @generated
	 */
	EReference getEpFormatVersion_XdtoPackage();

	/**
	 * Returns the meta object for class '{@link ru.capralow.dt.conversion.plugin.core.ep.model.ExchangeData <em>Exchange Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exchange Data</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.ep.model.ExchangeData
	 * @generated
	 */
	EClass getExchangeData();

	/**
	 * Returns the meta object for the reference list '{@link ru.capralow.dt.conversion.plugin.core.ep.model.ExchangeData#getProjects <em>Projects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Projects</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.ep.model.ExchangeData#getProjects()
	 * @see #getExchangeData()
	 * @generated
	 */
	EReference getExchangeData_Projects();

	/**
	 * Returns the meta object for the containment reference list '{@link ru.capralow.dt.conversion.plugin.core.ep.model.ExchangeData#getPairs <em>Pairs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pairs</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.ep.model.ExchangeData#getPairs()
	 * @see #getExchangeData()
	 * @generated
	 */
	EReference getExchangeData_Pairs();

	/**
	 * Returns the meta object for class '{@link ru.capralow.dt.conversion.plugin.core.ep.model.EpExchangePair <em>Ep Exchange Pair</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ep Exchange Pair</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.ep.model.EpExchangePair
	 * @generated
	 */
	EClass getEpExchangePair();

	/**
	 * Returns the meta object for the attribute '{@link ru.capralow.dt.conversion.plugin.core.ep.model.EpExchangePair#getConfigurationName1 <em>Configuration Name1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Configuration Name1</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.ep.model.EpExchangePair#getConfigurationName1()
	 * @see #getEpExchangePair()
	 * @generated
	 */
	EAttribute getEpExchangePair_ConfigurationName1();

	/**
	 * Returns the meta object for the attribute '{@link ru.capralow.dt.conversion.plugin.core.ep.model.EpExchangePair#getConfigurationName2 <em>Configuration Name2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Configuration Name2</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.ep.model.EpExchangePair#getConfigurationName2()
	 * @see #getEpExchangePair()
	 * @generated
	 */
	EAttribute getEpExchangePair_ConfigurationName2();

	/**
	 * Returns the meta object for the attribute '{@link ru.capralow.dt.conversion.plugin.core.ep.model.EpExchangePair#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.ep.model.EpExchangePair#getStatus()
	 * @see #getEpExchangePair()
	 * @generated
	 */
	EAttribute getEpExchangePair_Status();

	/**
	 * Returns the meta object for the attribute list '{@link ru.capralow.dt.conversion.plugin.core.ep.model.EpExchangePair#getVersions <em>Versions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Versions</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.ep.model.EpExchangePair#getVersions()
	 * @see #getEpExchangePair()
	 * @generated
	 */
	EAttribute getEpExchangePair_Versions();

	/**
	 * Returns the meta object for enum '{@link ru.capralow.dt.conversion.plugin.core.ep.model.EpProjectStatus <em>Ep Project Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Ep Project Status</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.ep.model.EpProjectStatus
	 * @generated
	 */
	EEnum getEpProjectStatus();

	/**
	 * Returns the meta object for enum '{@link ru.capralow.dt.conversion.plugin.core.ep.model.EpExchangePairStatus <em>Ep Exchange Pair Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Ep Exchange Pair Status</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.ep.model.EpExchangePairStatus
	 * @generated
	 */
	EEnum getEpExchangePairStatus();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	epFactory getepFactory();

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
		 * The meta object literal for the '{@link ru.capralow.dt.conversion.plugin.core.ep.model.impl.ExchangeProjectImpl <em>Exchange Project</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ru.capralow.dt.conversion.plugin.core.ep.model.impl.ExchangeProjectImpl
		 * @see ru.capralow.dt.conversion.plugin.core.ep.model.impl.epPackageImpl#getExchangeProject()
		 * @generated
		 */
		EClass EXCHANGE_PROJECT = eINSTANCE.getExchangeProject();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXCHANGE_PROJECT__NAME = eINSTANCE.getExchangeProject_Name();

		/**
		 * The meta object literal for the '<em><b>Store Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXCHANGE_PROJECT__STORE_VERSION = eINSTANCE.getExchangeProject_StoreVersion();

		/**
		 * The meta object literal for the '<em><b>Extensions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXCHANGE_PROJECT__EXTENSIONS = eINSTANCE.getExchangeProject_Extensions();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXCHANGE_PROJECT__STATUS = eINSTANCE.getExchangeProject_Status();

		/**
		 * The meta object literal for the '<em><b>Format Versions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXCHANGE_PROJECT__FORMAT_VERSIONS = eINSTANCE.getExchangeProject_FormatVersions();

		/**
		 * The meta object literal for the '<em><b>Settings Modules</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXCHANGE_PROJECT__SETTINGS_MODULES = eINSTANCE.getExchangeProject_SettingsModules();

		/**
		 * The meta object literal for the '<em><b>Get Versions</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EXCHANGE_PROJECT___GET_VERSIONS = eINSTANCE.getExchangeProject__GetVersions();

		/**
		 * The meta object literal for the '<em><b>Get Module Format Versions</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EXCHANGE_PROJECT___GET_MODULE_FORMAT_VERSIONS__COMMONMODULE = eINSTANCE.getExchangeProject__GetModuleFormatVersions__CommonModule();

		/**
		 * The meta object literal for the '<em><b>Get Format Modules</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EXCHANGE_PROJECT___GET_FORMAT_MODULES = eINSTANCE.getExchangeProject__GetFormatModules();

		/**
		 * The meta object literal for the '{@link ru.capralow.dt.conversion.plugin.core.ep.model.impl.ExchangeProjectsImpl <em>Exchange Projects</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ru.capralow.dt.conversion.plugin.core.ep.model.impl.ExchangeProjectsImpl
		 * @see ru.capralow.dt.conversion.plugin.core.ep.model.impl.epPackageImpl#getExchangeProjects()
		 * @generated
		 */
		EClass EXCHANGE_PROJECTS = eINSTANCE.getExchangeProjects();

		/**
		 * The meta object literal for the '<em><b>Projects</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXCHANGE_PROJECTS__PROJECTS = eINSTANCE.getExchangeProjects_Projects();

		/**
		 * The meta object literal for the '<em><b>Get Project</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EXCHANGE_PROJECTS___GET_PROJECT__STRING = eINSTANCE.getExchangeProjects__GetProject__String();

		/**
		 * The meta object literal for the '{@link ru.capralow.dt.conversion.plugin.core.ep.model.impl.EpExtensionImpl <em>Ep Extension</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ru.capralow.dt.conversion.plugin.core.ep.model.impl.EpExtensionImpl
		 * @see ru.capralow.dt.conversion.plugin.core.ep.model.impl.epPackageImpl#getEpExtension()
		 * @generated
		 */
		EClass EP_EXTENSION = eINSTANCE.getEpExtension();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EP_EXTENSION__NAME = eINSTANCE.getEpExtension_Name();

		/**
		 * The meta object literal for the '{@link ru.capralow.dt.conversion.plugin.core.ep.model.impl.EpFormatVersionImpl <em>Ep Format Version</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ru.capralow.dt.conversion.plugin.core.ep.model.impl.EpFormatVersionImpl
		 * @see ru.capralow.dt.conversion.plugin.core.ep.model.impl.epPackageImpl#getEpFormatVersion()
		 * @generated
		 */
		EClass EP_FORMAT_VERSION = eINSTANCE.getEpFormatVersion();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EP_FORMAT_VERSION__VERSION = eINSTANCE.getEpFormatVersion_Version();

		/**
		 * The meta object literal for the '<em><b>Extension Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EP_FORMAT_VERSION__EXTENSION_NAME = eINSTANCE.getEpFormatVersion_ExtensionName();

		/**
		 * The meta object literal for the '<em><b>Module Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EP_FORMAT_VERSION__MODULE_NAME = eINSTANCE.getEpFormatVersion_ModuleName();

		/**
		 * The meta object literal for the '<em><b>Module</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EP_FORMAT_VERSION__MODULE = eINSTANCE.getEpFormatVersion_Module();

		/**
		 * The meta object literal for the '<em><b>Xdto Package</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EP_FORMAT_VERSION__XDTO_PACKAGE = eINSTANCE.getEpFormatVersion_XdtoPackage();

		/**
		 * The meta object literal for the '{@link ru.capralow.dt.conversion.plugin.core.ep.model.impl.ExchangeDataImpl <em>Exchange Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ru.capralow.dt.conversion.plugin.core.ep.model.impl.ExchangeDataImpl
		 * @see ru.capralow.dt.conversion.plugin.core.ep.model.impl.epPackageImpl#getExchangeData()
		 * @generated
		 */
		EClass EXCHANGE_DATA = eINSTANCE.getExchangeData();

		/**
		 * The meta object literal for the '<em><b>Projects</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXCHANGE_DATA__PROJECTS = eINSTANCE.getExchangeData_Projects();

		/**
		 * The meta object literal for the '<em><b>Pairs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXCHANGE_DATA__PAIRS = eINSTANCE.getExchangeData_Pairs();

		/**
		 * The meta object literal for the '{@link ru.capralow.dt.conversion.plugin.core.ep.model.impl.EpExchangePairImpl <em>Ep Exchange Pair</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ru.capralow.dt.conversion.plugin.core.ep.model.impl.EpExchangePairImpl
		 * @see ru.capralow.dt.conversion.plugin.core.ep.model.impl.epPackageImpl#getEpExchangePair()
		 * @generated
		 */
		EClass EP_EXCHANGE_PAIR = eINSTANCE.getEpExchangePair();

		/**
		 * The meta object literal for the '<em><b>Configuration Name1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EP_EXCHANGE_PAIR__CONFIGURATION_NAME1 = eINSTANCE.getEpExchangePair_ConfigurationName1();

		/**
		 * The meta object literal for the '<em><b>Configuration Name2</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EP_EXCHANGE_PAIR__CONFIGURATION_NAME2 = eINSTANCE.getEpExchangePair_ConfigurationName2();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EP_EXCHANGE_PAIR__STATUS = eINSTANCE.getEpExchangePair_Status();

		/**
		 * The meta object literal for the '<em><b>Versions</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EP_EXCHANGE_PAIR__VERSIONS = eINSTANCE.getEpExchangePair_Versions();

		/**
		 * The meta object literal for the '{@link ru.capralow.dt.conversion.plugin.core.ep.model.EpProjectStatus <em>Ep Project Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ru.capralow.dt.conversion.plugin.core.ep.model.EpProjectStatus
		 * @see ru.capralow.dt.conversion.plugin.core.ep.model.impl.epPackageImpl#getEpProjectStatus()
		 * @generated
		 */
		EEnum EP_PROJECT_STATUS = eINSTANCE.getEpProjectStatus();

		/**
		 * The meta object literal for the '{@link ru.capralow.dt.conversion.plugin.core.ep.model.EpExchangePairStatus <em>Ep Exchange Pair Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ru.capralow.dt.conversion.plugin.core.ep.model.EpExchangePairStatus
		 * @see ru.capralow.dt.conversion.plugin.core.ep.model.impl.epPackageImpl#getEpExchangePairStatus()
		 * @generated
		 */
		EEnum EP_EXCHANGE_PAIR_STATUS = eINSTANCE.getEpExchangePairStatus();

	}

} //epPackage

/**
 */
package ru.capralow.dt.conversion.plugin.core.cp;

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
 * @see ru.capralow.dt.conversion.plugin.core.cp.CpFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel publicConstructors='true' loadInitialization='false' literalsInterface='true' nonNLSMarkers='true' updateClasspath='false' featureDelegation='Reflective' basePackage='ru.capralow.dt.conversion.plugin.core'"
 * @generated
 */
public interface CpPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "cp"; //$NON-NLS-1$

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "ru.capralow.dt.conversion.plugin.core.cp"; //$NON-NLS-1$

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "cp"; //$NON-NLS-1$

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CpPackage eINSTANCE = ru.capralow.dt.conversion.plugin.core.cp.impl.CpPackageImpl.init();

	/**
	 * The meta object id for the '{@link ru.capralow.dt.conversion.plugin.core.cp.impl.ConversionPanelImpl <em>Conversion Panel</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.capralow.dt.conversion.plugin.core.cp.impl.ConversionPanelImpl
	 * @see ru.capralow.dt.conversion.plugin.core.cp.impl.CpPackageImpl#getConversionPanel()
	 * @generated
	 */
	int CONVERSION_PANEL = 0;

	/**
	 * The feature id for the '<em><b>Exchange Pairs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSION_PANEL__EXCHANGE_PAIRS = 0;

	/**
	 * The feature id for the '<em><b>Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSION_PANEL__CONFIGURATIONS = 1;

	/**
	 * The number of structural features of the '<em>Conversion Panel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSION_PANEL_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Get Configuration</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSION_PANEL___GET_CONFIGURATION__STRING = 0;

	/**
	 * The operation id for the '<em>Get Objects</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSION_PANEL___GET_OBJECTS = 1;

	/**
	 * The number of operations of the '<em>Conversion Panel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSION_PANEL_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link ru.capralow.dt.conversion.plugin.core.cp.impl.cpConfigurationImpl <em>cp Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.capralow.dt.conversion.plugin.core.cp.impl.cpConfigurationImpl
	 * @see ru.capralow.dt.conversion.plugin.core.cp.impl.CpPackageImpl#getcpConfiguration()
	 * @generated
	 */
	int CP_CONFIGURATION = 1;

	/**
	 * The feature id for the '<em><b>Configuration Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CP_CONFIGURATION__CONFIGURATION_OBJECT = 0;

	/**
	 * The feature id for the '<em><b>Configuration Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CP_CONFIGURATION__CONFIGURATION_NAME = 1;

	/**
	 * The feature id for the '<em><b>Store Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CP_CONFIGURATION__STORE_VERSION = 2;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CP_CONFIGURATION__EXTENSIONS = 3;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CP_CONFIGURATION__STATUS = 4;

	/**
	 * The feature id for the '<em><b>Available Format Versions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CP_CONFIGURATION__AVAILABLE_FORMAT_VERSIONS = 5;

	/**
	 * The feature id for the '<em><b>Core Objects</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CP_CONFIGURATION__CORE_OBJECTS = 6;

	/**
	 * The number of structural features of the '<em>cp Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CP_CONFIGURATION_FEATURE_COUNT = 7;

	/**
	 * The operation id for the '<em>Get Versions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CP_CONFIGURATION___GET_VERSIONS = 0;

	/**
	 * The number of operations of the '<em>cp Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CP_CONFIGURATION_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link ru.capralow.dt.conversion.plugin.core.cp.impl.cpExtensionImpl <em>cp Extension</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.capralow.dt.conversion.plugin.core.cp.impl.cpExtensionImpl
	 * @see ru.capralow.dt.conversion.plugin.core.cp.impl.CpPackageImpl#getcpExtension()
	 * @generated
	 */
	int CP_EXTENSION = 2;

	/**
	 * The feature id for the '<em><b>Configuration Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CP_EXTENSION__CONFIGURATION_OBJECT = 0;

	/**
	 * The feature id for the '<em><b>Configuration Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CP_EXTENSION__CONFIGURATION_NAME = 1;

	/**
	 * The number of structural features of the '<em>cp Extension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CP_EXTENSION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>cp Extension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CP_EXTENSION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ru.capralow.dt.conversion.plugin.core.cp.impl.cpFormatVersionImpl <em>cp Format Version</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.capralow.dt.conversion.plugin.core.cp.impl.cpFormatVersionImpl
	 * @see ru.capralow.dt.conversion.plugin.core.cp.impl.CpPackageImpl#getcpFormatVersion()
	 * @generated
	 */
	int CP_FORMAT_VERSION = 3;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CP_FORMAT_VERSION__VERSION = 0;

	/**
	 * The feature id for the '<em><b>Configuration Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CP_FORMAT_VERSION__CONFIGURATION_NAME = 1;

	/**
	 * The feature id for the '<em><b>Module</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CP_FORMAT_VERSION__MODULE = 2;

	/**
	 * The number of structural features of the '<em>cp Format Version</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CP_FORMAT_VERSION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>cp Format Version</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CP_FORMAT_VERSION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ru.capralow.dt.conversion.plugin.core.cp.impl.cpExchangePairImpl <em>cp Exchange Pair</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.capralow.dt.conversion.plugin.core.cp.impl.cpExchangePairImpl
	 * @see ru.capralow.dt.conversion.plugin.core.cp.impl.CpPackageImpl#getcpExchangePair()
	 * @generated
	 */
	int CP_EXCHANGE_PAIR = 4;

	/**
	 * The feature id for the '<em><b>Configuration Name1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CP_EXCHANGE_PAIR__CONFIGURATION_NAME1 = 0;

	/**
	 * The feature id for the '<em><b>Configuration Name2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CP_EXCHANGE_PAIR__CONFIGURATION_NAME2 = 1;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CP_EXCHANGE_PAIR__STATUS = 2;

	/**
	 * The feature id for the '<em><b>Versions</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CP_EXCHANGE_PAIR__VERSIONS = 3;

	/**
	 * The number of structural features of the '<em>cp Exchange Pair</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CP_EXCHANGE_PAIR_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>cp Exchange Pair</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CP_EXCHANGE_PAIR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ru.capralow.dt.conversion.plugin.core.cp.ExchangePairStatus <em>Exchange Pair Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.capralow.dt.conversion.plugin.core.cp.ExchangePairStatus
	 * @see ru.capralow.dt.conversion.plugin.core.cp.impl.CpPackageImpl#getExchangePairStatus()
	 * @generated
	 */
	int EXCHANGE_PAIR_STATUS = 5;

	/**
	 * The meta object id for the '{@link ru.capralow.dt.conversion.plugin.core.cp.ConfigurationStatus <em>Configuration Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.capralow.dt.conversion.plugin.core.cp.ConfigurationStatus
	 * @see ru.capralow.dt.conversion.plugin.core.cp.impl.CpPackageImpl#getConfigurationStatus()
	 * @generated
	 */
	int CONFIGURATION_STATUS = 6;


	/**
	 * Returns the meta object for class '{@link ru.capralow.dt.conversion.plugin.core.cp.ConversionPanel <em>Conversion Panel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conversion Panel</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.cp.ConversionPanel
	 * @generated
	 */
	EClass getConversionPanel();

	/**
	 * Returns the meta object for the containment reference list '{@link ru.capralow.dt.conversion.plugin.core.cp.ConversionPanel#getExchangePairs <em>Exchange Pairs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Exchange Pairs</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.cp.ConversionPanel#getExchangePairs()
	 * @see #getConversionPanel()
	 * @generated
	 */
	EReference getConversionPanel_ExchangePairs();

	/**
	 * Returns the meta object for the containment reference list '{@link ru.capralow.dt.conversion.plugin.core.cp.ConversionPanel#getConfigurations <em>Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Configurations</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.cp.ConversionPanel#getConfigurations()
	 * @see #getConversionPanel()
	 * @generated
	 */
	EReference getConversionPanel_Configurations();

	/**
	 * Returns the meta object for the '{@link ru.capralow.dt.conversion.plugin.core.cp.ConversionPanel#getConfiguration(java.lang.String) <em>Get Configuration</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Configuration</em>' operation.
	 * @see ru.capralow.dt.conversion.plugin.core.cp.ConversionPanel#getConfiguration(java.lang.String)
	 * @generated
	 */
	EOperation getConversionPanel__GetConfiguration__String();

	/**
	 * Returns the meta object for the '{@link ru.capralow.dt.conversion.plugin.core.cp.ConversionPanel#getObjects() <em>Get Objects</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Objects</em>' operation.
	 * @see ru.capralow.dt.conversion.plugin.core.cp.ConversionPanel#getObjects()
	 * @generated
	 */
	EOperation getConversionPanel__GetObjects();

	/**
	 * Returns the meta object for class '{@link ru.capralow.dt.conversion.plugin.core.cp.cpConfiguration <em>cp Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>cp Configuration</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.cp.cpConfiguration
	 * @generated
	 */
	EClass getcpConfiguration();

	/**
	 * Returns the meta object for the attribute '{@link ru.capralow.dt.conversion.plugin.core.cp.cpConfiguration#getConfigurationObject <em>Configuration Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Configuration Object</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.cp.cpConfiguration#getConfigurationObject()
	 * @see #getcpConfiguration()
	 * @generated
	 */
	EAttribute getcpConfiguration_ConfigurationObject();

	/**
	 * Returns the meta object for the attribute '{@link ru.capralow.dt.conversion.plugin.core.cp.cpConfiguration#getConfigurationName <em>Configuration Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Configuration Name</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.cp.cpConfiguration#getConfigurationName()
	 * @see #getcpConfiguration()
	 * @generated
	 */
	EAttribute getcpConfiguration_ConfigurationName();

	/**
	 * Returns the meta object for the attribute '{@link ru.capralow.dt.conversion.plugin.core.cp.cpConfiguration#getStoreVersion <em>Store Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Store Version</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.cp.cpConfiguration#getStoreVersion()
	 * @see #getcpConfiguration()
	 * @generated
	 */
	EAttribute getcpConfiguration_StoreVersion();

	/**
	 * Returns the meta object for the containment reference list '{@link ru.capralow.dt.conversion.plugin.core.cp.cpConfiguration#getExtensions <em>Extensions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Extensions</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.cp.cpConfiguration#getExtensions()
	 * @see #getcpConfiguration()
	 * @generated
	 */
	EReference getcpConfiguration_Extensions();

	/**
	 * Returns the meta object for the attribute '{@link ru.capralow.dt.conversion.plugin.core.cp.cpConfiguration#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.cp.cpConfiguration#getStatus()
	 * @see #getcpConfiguration()
	 * @generated
	 */
	EAttribute getcpConfiguration_Status();

	/**
	 * Returns the meta object for the containment reference list '{@link ru.capralow.dt.conversion.plugin.core.cp.cpConfiguration#getAvailableFormatVersions <em>Available Format Versions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Available Format Versions</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.cp.cpConfiguration#getAvailableFormatVersions()
	 * @see #getcpConfiguration()
	 * @generated
	 */
	EReference getcpConfiguration_AvailableFormatVersions();

	/**
	 * Returns the meta object for the attribute list '{@link ru.capralow.dt.conversion.plugin.core.cp.cpConfiguration#getCoreObjects <em>Core Objects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Core Objects</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.cp.cpConfiguration#getCoreObjects()
	 * @see #getcpConfiguration()
	 * @generated
	 */
	EAttribute getcpConfiguration_CoreObjects();

	/**
	 * Returns the meta object for the '{@link ru.capralow.dt.conversion.plugin.core.cp.cpConfiguration#getVersions() <em>Get Versions</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Versions</em>' operation.
	 * @see ru.capralow.dt.conversion.plugin.core.cp.cpConfiguration#getVersions()
	 * @generated
	 */
	EOperation getcpConfiguration__GetVersions();

	/**
	 * Returns the meta object for class '{@link ru.capralow.dt.conversion.plugin.core.cp.cpExtension <em>cp Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>cp Extension</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.cp.cpExtension
	 * @generated
	 */
	EClass getcpExtension();

	/**
	 * Returns the meta object for the attribute '{@link ru.capralow.dt.conversion.plugin.core.cp.cpExtension#getConfigurationObject <em>Configuration Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Configuration Object</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.cp.cpExtension#getConfigurationObject()
	 * @see #getcpExtension()
	 * @generated
	 */
	EAttribute getcpExtension_ConfigurationObject();

	/**
	 * Returns the meta object for the attribute '{@link ru.capralow.dt.conversion.plugin.core.cp.cpExtension#getConfigurationName <em>Configuration Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Configuration Name</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.cp.cpExtension#getConfigurationName()
	 * @see #getcpExtension()
	 * @generated
	 */
	EAttribute getcpExtension_ConfigurationName();

	/**
	 * Returns the meta object for class '{@link ru.capralow.dt.conversion.plugin.core.cp.cpFormatVersion <em>cp Format Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>cp Format Version</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.cp.cpFormatVersion
	 * @generated
	 */
	EClass getcpFormatVersion();

	/**
	 * Returns the meta object for the attribute '{@link ru.capralow.dt.conversion.plugin.core.cp.cpFormatVersion#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.cp.cpFormatVersion#getVersion()
	 * @see #getcpFormatVersion()
	 * @generated
	 */
	EAttribute getcpFormatVersion_Version();

	/**
	 * Returns the meta object for the attribute '{@link ru.capralow.dt.conversion.plugin.core.cp.cpFormatVersion#getConfigurationName <em>Configuration Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Configuration Name</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.cp.cpFormatVersion#getConfigurationName()
	 * @see #getcpFormatVersion()
	 * @generated
	 */
	EAttribute getcpFormatVersion_ConfigurationName();

	/**
	 * Returns the meta object for the containment reference '{@link ru.capralow.dt.conversion.plugin.core.cp.cpFormatVersion#getModule <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Module</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.cp.cpFormatVersion#getModule()
	 * @see #getcpFormatVersion()
	 * @generated
	 */
	EReference getcpFormatVersion_Module();

	/**
	 * Returns the meta object for class '{@link ru.capralow.dt.conversion.plugin.core.cp.cpExchangePair <em>cp Exchange Pair</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>cp Exchange Pair</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.cp.cpExchangePair
	 * @generated
	 */
	EClass getcpExchangePair();

	/**
	 * Returns the meta object for the attribute '{@link ru.capralow.dt.conversion.plugin.core.cp.cpExchangePair#getConfigurationName1 <em>Configuration Name1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Configuration Name1</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.cp.cpExchangePair#getConfigurationName1()
	 * @see #getcpExchangePair()
	 * @generated
	 */
	EAttribute getcpExchangePair_ConfigurationName1();

	/**
	 * Returns the meta object for the attribute '{@link ru.capralow.dt.conversion.plugin.core.cp.cpExchangePair#getConfigurationName2 <em>Configuration Name2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Configuration Name2</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.cp.cpExchangePair#getConfigurationName2()
	 * @see #getcpExchangePair()
	 * @generated
	 */
	EAttribute getcpExchangePair_ConfigurationName2();

	/**
	 * Returns the meta object for the attribute '{@link ru.capralow.dt.conversion.plugin.core.cp.cpExchangePair#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.cp.cpExchangePair#getStatus()
	 * @see #getcpExchangePair()
	 * @generated
	 */
	EAttribute getcpExchangePair_Status();

	/**
	 * Returns the meta object for the attribute list '{@link ru.capralow.dt.conversion.plugin.core.cp.cpExchangePair#getVersions <em>Versions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Versions</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.cp.cpExchangePair#getVersions()
	 * @see #getcpExchangePair()
	 * @generated
	 */
	EAttribute getcpExchangePair_Versions();

	/**
	 * Returns the meta object for enum '{@link ru.capralow.dt.conversion.plugin.core.cp.ExchangePairStatus <em>Exchange Pair Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Exchange Pair Status</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.cp.ExchangePairStatus
	 * @generated
	 */
	EEnum getExchangePairStatus();

	/**
	 * Returns the meta object for enum '{@link ru.capralow.dt.conversion.plugin.core.cp.ConfigurationStatus <em>Configuration Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Configuration Status</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.cp.ConfigurationStatus
	 * @generated
	 */
	EEnum getConfigurationStatus();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CpFactory getCpFactory();

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
		 * The meta object literal for the '{@link ru.capralow.dt.conversion.plugin.core.cp.impl.ConversionPanelImpl <em>Conversion Panel</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ru.capralow.dt.conversion.plugin.core.cp.impl.ConversionPanelImpl
		 * @see ru.capralow.dt.conversion.plugin.core.cp.impl.CpPackageImpl#getConversionPanel()
		 * @generated
		 */
		EClass CONVERSION_PANEL = eINSTANCE.getConversionPanel();

		/**
		 * The meta object literal for the '<em><b>Exchange Pairs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONVERSION_PANEL__EXCHANGE_PAIRS = eINSTANCE.getConversionPanel_ExchangePairs();

		/**
		 * The meta object literal for the '<em><b>Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONVERSION_PANEL__CONFIGURATIONS = eINSTANCE.getConversionPanel_Configurations();

		/**
		 * The meta object literal for the '<em><b>Get Configuration</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONVERSION_PANEL___GET_CONFIGURATION__STRING = eINSTANCE.getConversionPanel__GetConfiguration__String();

		/**
		 * The meta object literal for the '<em><b>Get Objects</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONVERSION_PANEL___GET_OBJECTS = eINSTANCE.getConversionPanel__GetObjects();

		/**
		 * The meta object literal for the '{@link ru.capralow.dt.conversion.plugin.core.cp.impl.cpConfigurationImpl <em>cp Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ru.capralow.dt.conversion.plugin.core.cp.impl.cpConfigurationImpl
		 * @see ru.capralow.dt.conversion.plugin.core.cp.impl.CpPackageImpl#getcpConfiguration()
		 * @generated
		 */
		EClass CP_CONFIGURATION = eINSTANCE.getcpConfiguration();

		/**
		 * The meta object literal for the '<em><b>Configuration Object</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CP_CONFIGURATION__CONFIGURATION_OBJECT = eINSTANCE.getcpConfiguration_ConfigurationObject();

		/**
		 * The meta object literal for the '<em><b>Configuration Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CP_CONFIGURATION__CONFIGURATION_NAME = eINSTANCE.getcpConfiguration_ConfigurationName();

		/**
		 * The meta object literal for the '<em><b>Store Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CP_CONFIGURATION__STORE_VERSION = eINSTANCE.getcpConfiguration_StoreVersion();

		/**
		 * The meta object literal for the '<em><b>Extensions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CP_CONFIGURATION__EXTENSIONS = eINSTANCE.getcpConfiguration_Extensions();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CP_CONFIGURATION__STATUS = eINSTANCE.getcpConfiguration_Status();

		/**
		 * The meta object literal for the '<em><b>Available Format Versions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CP_CONFIGURATION__AVAILABLE_FORMAT_VERSIONS = eINSTANCE.getcpConfiguration_AvailableFormatVersions();

		/**
		 * The meta object literal for the '<em><b>Core Objects</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CP_CONFIGURATION__CORE_OBJECTS = eINSTANCE.getcpConfiguration_CoreObjects();

		/**
		 * The meta object literal for the '<em><b>Get Versions</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CP_CONFIGURATION___GET_VERSIONS = eINSTANCE.getcpConfiguration__GetVersions();

		/**
		 * The meta object literal for the '{@link ru.capralow.dt.conversion.plugin.core.cp.impl.cpExtensionImpl <em>cp Extension</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ru.capralow.dt.conversion.plugin.core.cp.impl.cpExtensionImpl
		 * @see ru.capralow.dt.conversion.plugin.core.cp.impl.CpPackageImpl#getcpExtension()
		 * @generated
		 */
		EClass CP_EXTENSION = eINSTANCE.getcpExtension();

		/**
		 * The meta object literal for the '<em><b>Configuration Object</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CP_EXTENSION__CONFIGURATION_OBJECT = eINSTANCE.getcpExtension_ConfigurationObject();

		/**
		 * The meta object literal for the '<em><b>Configuration Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CP_EXTENSION__CONFIGURATION_NAME = eINSTANCE.getcpExtension_ConfigurationName();

		/**
		 * The meta object literal for the '{@link ru.capralow.dt.conversion.plugin.core.cp.impl.cpFormatVersionImpl <em>cp Format Version</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ru.capralow.dt.conversion.plugin.core.cp.impl.cpFormatVersionImpl
		 * @see ru.capralow.dt.conversion.plugin.core.cp.impl.CpPackageImpl#getcpFormatVersion()
		 * @generated
		 */
		EClass CP_FORMAT_VERSION = eINSTANCE.getcpFormatVersion();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CP_FORMAT_VERSION__VERSION = eINSTANCE.getcpFormatVersion_Version();

		/**
		 * The meta object literal for the '<em><b>Configuration Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CP_FORMAT_VERSION__CONFIGURATION_NAME = eINSTANCE.getcpFormatVersion_ConfigurationName();

		/**
		 * The meta object literal for the '<em><b>Module</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CP_FORMAT_VERSION__MODULE = eINSTANCE.getcpFormatVersion_Module();

		/**
		 * The meta object literal for the '{@link ru.capralow.dt.conversion.plugin.core.cp.impl.cpExchangePairImpl <em>cp Exchange Pair</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ru.capralow.dt.conversion.plugin.core.cp.impl.cpExchangePairImpl
		 * @see ru.capralow.dt.conversion.plugin.core.cp.impl.CpPackageImpl#getcpExchangePair()
		 * @generated
		 */
		EClass CP_EXCHANGE_PAIR = eINSTANCE.getcpExchangePair();

		/**
		 * The meta object literal for the '<em><b>Configuration Name1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CP_EXCHANGE_PAIR__CONFIGURATION_NAME1 = eINSTANCE.getcpExchangePair_ConfigurationName1();

		/**
		 * The meta object literal for the '<em><b>Configuration Name2</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CP_EXCHANGE_PAIR__CONFIGURATION_NAME2 = eINSTANCE.getcpExchangePair_ConfigurationName2();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CP_EXCHANGE_PAIR__STATUS = eINSTANCE.getcpExchangePair_Status();

		/**
		 * The meta object literal for the '<em><b>Versions</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CP_EXCHANGE_PAIR__VERSIONS = eINSTANCE.getcpExchangePair_Versions();

		/**
		 * The meta object literal for the '{@link ru.capralow.dt.conversion.plugin.core.cp.ExchangePairStatus <em>Exchange Pair Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ru.capralow.dt.conversion.plugin.core.cp.ExchangePairStatus
		 * @see ru.capralow.dt.conversion.plugin.core.cp.impl.CpPackageImpl#getExchangePairStatus()
		 * @generated
		 */
		EEnum EXCHANGE_PAIR_STATUS = eINSTANCE.getExchangePairStatus();

		/**
		 * The meta object literal for the '{@link ru.capralow.dt.conversion.plugin.core.cp.ConfigurationStatus <em>Configuration Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ru.capralow.dt.conversion.plugin.core.cp.ConfigurationStatus
		 * @see ru.capralow.dt.conversion.plugin.core.cp.impl.CpPackageImpl#getConfigurationStatus()
		 * @generated
		 */
		EEnum CONFIGURATION_STATUS = eINSTANCE.getConfigurationStatus();

	}

} //CpPackage

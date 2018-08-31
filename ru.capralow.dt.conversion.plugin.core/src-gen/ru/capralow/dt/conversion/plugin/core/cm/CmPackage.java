/**
 */
package ru.capralow.dt.conversion.plugin.core.cm;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see ru.capralow.dt.conversion.plugin.core.cm.CmFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel publicConstructors='true' loadInitialization='false' literalsInterface='true' nonNLSMarkers='true' updateClasspath='false' featureDelegation='Reflective' rootExtendsClass='com._1c.g5.v8.bm.core.BmObject' rootExtendsInterface='com._1c.g5.v8.bm.core.IBmObject' basePackage='ru.capralow.dt.conversion.plugin.core'"
 * @generated
 */
public interface CmPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "cm"; //$NON-NLS-1$

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "ru.capralow.dt.conversion.plugin.core.cm"; //$NON-NLS-1$

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "cm"; //$NON-NLS-1$

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CmPackage eINSTANCE = ru.capralow.dt.conversion.plugin.core.cm.impl.CmPackageImpl.init();

	/**
	 * The meta object id for the '{@link ru.capralow.dt.conversion.plugin.core.cm.impl.ConversionModuleImpl <em>Conversion Module</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.capralow.dt.conversion.plugin.core.cm.impl.ConversionModuleImpl
	 * @see ru.capralow.dt.conversion.plugin.core.cm.impl.CmPackageImpl#getConversionModule()
	 * @generated
	 */
	int CONVERSION_MODULE = 0;

	/**
	 * The feature id for the '<em><b>Store Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSION_MODULE__STORE_VERSION = 0;

	/**
	 * The feature id for the '<em><b>PO Ds</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSION_MODULE__PO_DS = 1;

	/**
	 * The feature id for the '<em><b>PK Os</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSION_MODULE__PK_OS = 2;

	/**
	 * The feature id for the '<em><b>PKP Ds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSION_MODULE__PKP_DS = 3;

	/**
	 * The feature id for the '<em><b>Params</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSION_MODULE__PARAMS = 4;

	/**
	 * The feature id for the '<em><b>Before Convertation Event</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSION_MODULE__BEFORE_CONVERTATION_EVENT = 5;

	/**
	 * The feature id for the '<em><b>After Convertation Event</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSION_MODULE__AFTER_CONVERTATION_EVENT = 6;

	/**
	 * The feature id for the '<em><b>Before Filling Event</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSION_MODULE__BEFORE_FILLING_EVENT = 7;

	/**
	 * The feature id for the '<em><b>Algorithms</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSION_MODULE__ALGORITHMS = 8;

	/**
	 * The number of structural features of the '<em>Conversion Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSION_MODULE_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Conversion Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSION_MODULE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ru.capralow.dt.conversion.plugin.core.cm.impl.cpPODImpl <em>cp POD</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.capralow.dt.conversion.plugin.core.cm.impl.cpPODImpl
	 * @see ru.capralow.dt.conversion.plugin.core.cm.impl.CmPackageImpl#getcpPOD()
	 * @generated
	 */
	int CP_POD = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CP_POD__NAME = 0;

	/**
	 * The feature id for the '<em><b>Data Selection Event</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CP_POD__DATA_SELECTION_EVENT = 1;

	/**
	 * The feature id for the '<em><b>Before Processing Event</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CP_POD__BEFORE_PROCESSING_EVENT = 2;

	/**
	 * The feature id for the '<em><b>On Processing Event</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CP_POD__ON_PROCESSING_EVENT = 3;

	/**
	 * The feature id for the '<em><b>For Sending</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CP_POD__FOR_SENDING = 4;

	/**
	 * The feature id for the '<em><b>For Receiving</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CP_POD__FOR_RECEIVING = 5;

	/**
	 * The feature id for the '<em><b>Configuration Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CP_POD__CONFIGURATION_OBJECT = 6;

	/**
	 * The feature id for the '<em><b>Format Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CP_POD__FORMAT_OBJECT = 7;

	/**
	 * The feature id for the '<em><b>Is Disabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CP_POD__IS_DISABLED = 8;

	/**
	 * The feature id for the '<em><b>Is Data Cleaning</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CP_POD__IS_DATA_CLEANING = 9;

	/**
	 * The feature id for the '<em><b>Selection Variant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CP_POD__SELECTION_VARIANT = 10;

	/**
	 * The feature id for the '<em><b>PK Os</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CP_POD__PK_OS = 11;

	/**
	 * The number of structural features of the '<em>cp POD</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CP_POD_FEATURE_COUNT = 12;

	/**
	 * The number of operations of the '<em>cp POD</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CP_POD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ru.capralow.dt.conversion.plugin.core.cm.impl.cpPKOImpl <em>cp PKO</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.capralow.dt.conversion.plugin.core.cm.impl.cpPKOImpl
	 * @see ru.capralow.dt.conversion.plugin.core.cm.impl.CmPackageImpl#getcpPKO()
	 * @generated
	 */
	int CP_PKO = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CP_PKO__NAME = 0;

	/**
	 * The number of structural features of the '<em>cp PKO</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CP_PKO_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>cp PKO</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CP_PKO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ru.capralow.dt.conversion.plugin.core.cm.SelectionVariant <em>Selection Variant</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.capralow.dt.conversion.plugin.core.cm.SelectionVariant
	 * @see ru.capralow.dt.conversion.plugin.core.cm.impl.CmPackageImpl#getSelectionVariant()
	 * @generated
	 */
	int SELECTION_VARIANT = 3;


	/**
	 * Returns the meta object for class '{@link ru.capralow.dt.conversion.plugin.core.cm.ConversionModule <em>Conversion Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conversion Module</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.ConversionModule
	 * @generated
	 */
	EClass getConversionModule();

	/**
	 * Returns the meta object for the attribute '{@link ru.capralow.dt.conversion.plugin.core.cm.ConversionModule#getStoreVersion <em>Store Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Store Version</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.ConversionModule#getStoreVersion()
	 * @see #getConversionModule()
	 * @generated
	 */
	EAttribute getConversionModule_StoreVersion();

	/**
	 * Returns the meta object for the containment reference list '{@link ru.capralow.dt.conversion.plugin.core.cm.ConversionModule#getPODs <em>PO Ds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>PO Ds</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.ConversionModule#getPODs()
	 * @see #getConversionModule()
	 * @generated
	 */
	EReference getConversionModule_PODs();

	/**
	 * Returns the meta object for the containment reference list '{@link ru.capralow.dt.conversion.plugin.core.cm.ConversionModule#getPKOs <em>PK Os</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>PK Os</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.ConversionModule#getPKOs()
	 * @see #getConversionModule()
	 * @generated
	 */
	EReference getConversionModule_PKOs();

	/**
	 * Returns the meta object for the attribute '{@link ru.capralow.dt.conversion.plugin.core.cm.ConversionModule#getPKPDs <em>PKP Ds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>PKP Ds</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.ConversionModule#getPKPDs()
	 * @see #getConversionModule()
	 * @generated
	 */
	EAttribute getConversionModule_PKPDs();

	/**
	 * Returns the meta object for the attribute '{@link ru.capralow.dt.conversion.plugin.core.cm.ConversionModule#getParams <em>Params</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Params</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.ConversionModule#getParams()
	 * @see #getConversionModule()
	 * @generated
	 */
	EAttribute getConversionModule_Params();

	/**
	 * Returns the meta object for the attribute '{@link ru.capralow.dt.conversion.plugin.core.cm.ConversionModule#getBeforeConvertationEvent <em>Before Convertation Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Before Convertation Event</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.ConversionModule#getBeforeConvertationEvent()
	 * @see #getConversionModule()
	 * @generated
	 */
	EAttribute getConversionModule_BeforeConvertationEvent();

	/**
	 * Returns the meta object for the attribute '{@link ru.capralow.dt.conversion.plugin.core.cm.ConversionModule#getAfterConvertationEvent <em>After Convertation Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>After Convertation Event</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.ConversionModule#getAfterConvertationEvent()
	 * @see #getConversionModule()
	 * @generated
	 */
	EAttribute getConversionModule_AfterConvertationEvent();

	/**
	 * Returns the meta object for the attribute '{@link ru.capralow.dt.conversion.plugin.core.cm.ConversionModule#getBeforeFillingEvent <em>Before Filling Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Before Filling Event</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.ConversionModule#getBeforeFillingEvent()
	 * @see #getConversionModule()
	 * @generated
	 */
	EAttribute getConversionModule_BeforeFillingEvent();

	/**
	 * Returns the meta object for the attribute '{@link ru.capralow.dt.conversion.plugin.core.cm.ConversionModule#getAlgorithms <em>Algorithms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Algorithms</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.ConversionModule#getAlgorithms()
	 * @see #getConversionModule()
	 * @generated
	 */
	EAttribute getConversionModule_Algorithms();

	/**
	 * Returns the meta object for class '{@link ru.capralow.dt.conversion.plugin.core.cm.cpPOD <em>cp POD</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>cp POD</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.cpPOD
	 * @generated
	 */
	EClass getcpPOD();

	/**
	 * Returns the meta object for the attribute '{@link ru.capralow.dt.conversion.plugin.core.cm.cpPOD#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.cpPOD#getName()
	 * @see #getcpPOD()
	 * @generated
	 */
	EAttribute getcpPOD_Name();

	/**
	 * Returns the meta object for the attribute '{@link ru.capralow.dt.conversion.plugin.core.cm.cpPOD#getDataSelectionEvent <em>Data Selection Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Selection Event</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.cpPOD#getDataSelectionEvent()
	 * @see #getcpPOD()
	 * @generated
	 */
	EAttribute getcpPOD_DataSelectionEvent();

	/**
	 * Returns the meta object for the attribute '{@link ru.capralow.dt.conversion.plugin.core.cm.cpPOD#getBeforeProcessingEvent <em>Before Processing Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Before Processing Event</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.cpPOD#getBeforeProcessingEvent()
	 * @see #getcpPOD()
	 * @generated
	 */
	EAttribute getcpPOD_BeforeProcessingEvent();

	/**
	 * Returns the meta object for the attribute '{@link ru.capralow.dt.conversion.plugin.core.cm.cpPOD#getOnProcessingEvent <em>On Processing Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>On Processing Event</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.cpPOD#getOnProcessingEvent()
	 * @see #getcpPOD()
	 * @generated
	 */
	EAttribute getcpPOD_OnProcessingEvent();

	/**
	 * Returns the meta object for the attribute '{@link ru.capralow.dt.conversion.plugin.core.cm.cpPOD#getForSending <em>For Sending</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>For Sending</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.cpPOD#getForSending()
	 * @see #getcpPOD()
	 * @generated
	 */
	EAttribute getcpPOD_ForSending();

	/**
	 * Returns the meta object for the attribute '{@link ru.capralow.dt.conversion.plugin.core.cm.cpPOD#getForReceiving <em>For Receiving</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>For Receiving</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.cpPOD#getForReceiving()
	 * @see #getcpPOD()
	 * @generated
	 */
	EAttribute getcpPOD_ForReceiving();

	/**
	 * Returns the meta object for the attribute '{@link ru.capralow.dt.conversion.plugin.core.cm.cpPOD#getConfigurationObject <em>Configuration Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Configuration Object</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.cpPOD#getConfigurationObject()
	 * @see #getcpPOD()
	 * @generated
	 */
	EAttribute getcpPOD_ConfigurationObject();

	/**
	 * Returns the meta object for the attribute '{@link ru.capralow.dt.conversion.plugin.core.cm.cpPOD#getFormatObject <em>Format Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Format Object</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.cpPOD#getFormatObject()
	 * @see #getcpPOD()
	 * @generated
	 */
	EAttribute getcpPOD_FormatObject();

	/**
	 * Returns the meta object for the attribute '{@link ru.capralow.dt.conversion.plugin.core.cm.cpPOD#getIsDisabled <em>Is Disabled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Disabled</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.cpPOD#getIsDisabled()
	 * @see #getcpPOD()
	 * @generated
	 */
	EAttribute getcpPOD_IsDisabled();

	/**
	 * Returns the meta object for the attribute '{@link ru.capralow.dt.conversion.plugin.core.cm.cpPOD#getIsDataCleaning <em>Is Data Cleaning</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Data Cleaning</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.cpPOD#getIsDataCleaning()
	 * @see #getcpPOD()
	 * @generated
	 */
	EAttribute getcpPOD_IsDataCleaning();

	/**
	 * Returns the meta object for the attribute '{@link ru.capralow.dt.conversion.plugin.core.cm.cpPOD#getSelectionVariant <em>Selection Variant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Selection Variant</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.cpPOD#getSelectionVariant()
	 * @see #getcpPOD()
	 * @generated
	 */
	EAttribute getcpPOD_SelectionVariant();

	/**
	 * Returns the meta object for the containment reference list '{@link ru.capralow.dt.conversion.plugin.core.cm.cpPOD#getPKOs <em>PK Os</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>PK Os</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.cpPOD#getPKOs()
	 * @see #getcpPOD()
	 * @generated
	 */
	EReference getcpPOD_PKOs();

	/**
	 * Returns the meta object for class '{@link ru.capralow.dt.conversion.plugin.core.cm.cpPKO <em>cp PKO</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>cp PKO</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.cpPKO
	 * @generated
	 */
	EClass getcpPKO();

	/**
	 * Returns the meta object for the attribute '{@link ru.capralow.dt.conversion.plugin.core.cm.cpPKO#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.cpPKO#getName()
	 * @see #getcpPKO()
	 * @generated
	 */
	EAttribute getcpPKO_Name();

	/**
	 * Returns the meta object for enum '{@link ru.capralow.dt.conversion.plugin.core.cm.SelectionVariant <em>Selection Variant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Selection Variant</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.SelectionVariant
	 * @generated
	 */
	EEnum getSelectionVariant();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CmFactory getCmFactory();

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
		 * The meta object literal for the '{@link ru.capralow.dt.conversion.plugin.core.cm.impl.ConversionModuleImpl <em>Conversion Module</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ru.capralow.dt.conversion.plugin.core.cm.impl.ConversionModuleImpl
		 * @see ru.capralow.dt.conversion.plugin.core.cm.impl.CmPackageImpl#getConversionModule()
		 * @generated
		 */
		EClass CONVERSION_MODULE = eINSTANCE.getConversionModule();

		/**
		 * The meta object literal for the '<em><b>Store Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONVERSION_MODULE__STORE_VERSION = eINSTANCE.getConversionModule_StoreVersion();

		/**
		 * The meta object literal for the '<em><b>PO Ds</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONVERSION_MODULE__PO_DS = eINSTANCE.getConversionModule_PODs();

		/**
		 * The meta object literal for the '<em><b>PK Os</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONVERSION_MODULE__PK_OS = eINSTANCE.getConversionModule_PKOs();

		/**
		 * The meta object literal for the '<em><b>PKP Ds</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONVERSION_MODULE__PKP_DS = eINSTANCE.getConversionModule_PKPDs();

		/**
		 * The meta object literal for the '<em><b>Params</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONVERSION_MODULE__PARAMS = eINSTANCE.getConversionModule_Params();

		/**
		 * The meta object literal for the '<em><b>Before Convertation Event</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONVERSION_MODULE__BEFORE_CONVERTATION_EVENT = eINSTANCE.getConversionModule_BeforeConvertationEvent();

		/**
		 * The meta object literal for the '<em><b>After Convertation Event</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONVERSION_MODULE__AFTER_CONVERTATION_EVENT = eINSTANCE.getConversionModule_AfterConvertationEvent();

		/**
		 * The meta object literal for the '<em><b>Before Filling Event</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONVERSION_MODULE__BEFORE_FILLING_EVENT = eINSTANCE.getConversionModule_BeforeFillingEvent();

		/**
		 * The meta object literal for the '<em><b>Algorithms</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONVERSION_MODULE__ALGORITHMS = eINSTANCE.getConversionModule_Algorithms();

		/**
		 * The meta object literal for the '{@link ru.capralow.dt.conversion.plugin.core.cm.impl.cpPODImpl <em>cp POD</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ru.capralow.dt.conversion.plugin.core.cm.impl.cpPODImpl
		 * @see ru.capralow.dt.conversion.plugin.core.cm.impl.CmPackageImpl#getcpPOD()
		 * @generated
		 */
		EClass CP_POD = eINSTANCE.getcpPOD();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CP_POD__NAME = eINSTANCE.getcpPOD_Name();

		/**
		 * The meta object literal for the '<em><b>Data Selection Event</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CP_POD__DATA_SELECTION_EVENT = eINSTANCE.getcpPOD_DataSelectionEvent();

		/**
		 * The meta object literal for the '<em><b>Before Processing Event</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CP_POD__BEFORE_PROCESSING_EVENT = eINSTANCE.getcpPOD_BeforeProcessingEvent();

		/**
		 * The meta object literal for the '<em><b>On Processing Event</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CP_POD__ON_PROCESSING_EVENT = eINSTANCE.getcpPOD_OnProcessingEvent();

		/**
		 * The meta object literal for the '<em><b>For Sending</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CP_POD__FOR_SENDING = eINSTANCE.getcpPOD_ForSending();

		/**
		 * The meta object literal for the '<em><b>For Receiving</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CP_POD__FOR_RECEIVING = eINSTANCE.getcpPOD_ForReceiving();

		/**
		 * The meta object literal for the '<em><b>Configuration Object</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CP_POD__CONFIGURATION_OBJECT = eINSTANCE.getcpPOD_ConfigurationObject();

		/**
		 * The meta object literal for the '<em><b>Format Object</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CP_POD__FORMAT_OBJECT = eINSTANCE.getcpPOD_FormatObject();

		/**
		 * The meta object literal for the '<em><b>Is Disabled</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CP_POD__IS_DISABLED = eINSTANCE.getcpPOD_IsDisabled();

		/**
		 * The meta object literal for the '<em><b>Is Data Cleaning</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CP_POD__IS_DATA_CLEANING = eINSTANCE.getcpPOD_IsDataCleaning();

		/**
		 * The meta object literal for the '<em><b>Selection Variant</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CP_POD__SELECTION_VARIANT = eINSTANCE.getcpPOD_SelectionVariant();

		/**
		 * The meta object literal for the '<em><b>PK Os</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CP_POD__PK_OS = eINSTANCE.getcpPOD_PKOs();

		/**
		 * The meta object literal for the '{@link ru.capralow.dt.conversion.plugin.core.cm.impl.cpPKOImpl <em>cp PKO</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ru.capralow.dt.conversion.plugin.core.cm.impl.cpPKOImpl
		 * @see ru.capralow.dt.conversion.plugin.core.cm.impl.CmPackageImpl#getcpPKO()
		 * @generated
		 */
		EClass CP_PKO = eINSTANCE.getcpPKO();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CP_PKO__NAME = eINSTANCE.getcpPKO_Name();

		/**
		 * The meta object literal for the '{@link ru.capralow.dt.conversion.plugin.core.cm.SelectionVariant <em>Selection Variant</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ru.capralow.dt.conversion.plugin.core.cm.SelectionVariant
		 * @see ru.capralow.dt.conversion.plugin.core.cm.impl.CmPackageImpl#getSelectionVariant()
		 * @generated
		 */
		EEnum SELECTION_VARIANT = eINSTANCE.getSelectionVariant();

	}

} //CmPackage

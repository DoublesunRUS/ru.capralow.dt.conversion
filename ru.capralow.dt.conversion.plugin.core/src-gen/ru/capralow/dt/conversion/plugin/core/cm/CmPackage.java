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
	 * The feature id for the '<em><b>Module URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSION_MODULE__MODULE_URI = 1;

	/**
	 * The feature id for the '<em><b>Data Rules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSION_MODULE__DATA_RULES = 2;

	/**
	 * The feature id for the '<em><b>Object Rules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSION_MODULE__OBJECT_RULES = 3;

	/**
	 * The feature id for the '<em><b>Predefineds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSION_MODULE__PREDEFINEDS = 4;

	/**
	 * The feature id for the '<em><b>Params</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSION_MODULE__PARAMS = 5;

	/**
	 * The feature id for the '<em><b>Before Convertation Event</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSION_MODULE__BEFORE_CONVERTATION_EVENT = 6;

	/**
	 * The feature id for the '<em><b>After Convertation Event</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSION_MODULE__AFTER_CONVERTATION_EVENT = 7;

	/**
	 * The feature id for the '<em><b>Before Filling Event</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSION_MODULE__BEFORE_FILLING_EVENT = 8;

	/**
	 * The feature id for the '<em><b>Before Convertation Event Node</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSION_MODULE__BEFORE_CONVERTATION_EVENT_NODE = 9;

	/**
	 * The feature id for the '<em><b>Sending Rules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSION_MODULE__SENDING_RULES = 10;

	/**
	 * The feature id for the '<em><b>Algorithms</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSION_MODULE__ALGORITHMS = 11;

	/**
	 * The number of structural features of the '<em>Conversion Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSION_MODULE_FEATURE_COUNT = 12;

	/**
	 * The number of operations of the '<em>Conversion Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSION_MODULE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ru.capralow.dt.conversion.plugin.core.cm.impl.CmSendingRuleImpl <em>Sending Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.capralow.dt.conversion.plugin.core.cm.impl.CmSendingRuleImpl
	 * @see ru.capralow.dt.conversion.plugin.core.cm.impl.CmPackageImpl#getCmSendingRule()
	 * @generated
	 */
	int CM_SENDING_RULE = 1;

	/**
	 * The feature id for the '<em><b>Data Rule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CM_SENDING_RULE__DATA_RULE = 0;

	/**
	 * The feature id for the '<em><b>Object Rules</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CM_SENDING_RULE__OBJECT_RULES = 1;

	/**
	 * The number of structural features of the '<em>Sending Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CM_SENDING_RULE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Sending Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CM_SENDING_RULE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ru.capralow.dt.conversion.plugin.core.cm.impl.CmDataRuleImpl <em>Data Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.capralow.dt.conversion.plugin.core.cm.impl.CmDataRuleImpl
	 * @see ru.capralow.dt.conversion.plugin.core.cm.impl.CmPackageImpl#getCmDataRule()
	 * @generated
	 */
	int CM_DATA_RULE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CM_DATA_RULE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Data Selection Event</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CM_DATA_RULE__DATA_SELECTION_EVENT = 1;

	/**
	 * The feature id for the '<em><b>Before Processing Event</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CM_DATA_RULE__BEFORE_PROCESSING_EVENT = 2;

	/**
	 * The feature id for the '<em><b>On Processing Event</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CM_DATA_RULE__ON_PROCESSING_EVENT = 3;

	/**
	 * The feature id for the '<em><b>For Sending</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CM_DATA_RULE__FOR_SENDING = 4;

	/**
	 * The feature id for the '<em><b>For Receiving</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CM_DATA_RULE__FOR_RECEIVING = 5;

	/**
	 * The feature id for the '<em><b>Configuration Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CM_DATA_RULE__CONFIGURATION_OBJECT = 6;

	/**
	 * The feature id for the '<em><b>Format Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CM_DATA_RULE__FORMAT_OBJECT = 7;

	/**
	 * The feature id for the '<em><b>Is Disabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CM_DATA_RULE__IS_DISABLED = 8;

	/**
	 * The feature id for the '<em><b>Is Data Cleaning</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CM_DATA_RULE__IS_DATA_CLEANING = 9;

	/**
	 * The feature id for the '<em><b>Selection Variant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CM_DATA_RULE__SELECTION_VARIANT = 10;

	/**
	 * The feature id for the '<em><b>Object Rules</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CM_DATA_RULE__OBJECT_RULES = 11;

	/**
	 * The number of structural features of the '<em>Data Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CM_DATA_RULE_FEATURE_COUNT = 12;

	/**
	 * The number of operations of the '<em>Data Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CM_DATA_RULE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ru.capralow.dt.conversion.plugin.core.cm.impl.CmObjectRuleImpl <em>Object Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.capralow.dt.conversion.plugin.core.cm.impl.CmObjectRuleImpl
	 * @see ru.capralow.dt.conversion.plugin.core.cm.impl.CmPackageImpl#getCmObjectRule()
	 * @generated
	 */
	int CM_OBJECT_RULE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CM_OBJECT_RULE__NAME = 0;

	/**
	 * The number of structural features of the '<em>Object Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CM_OBJECT_RULE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Object Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CM_OBJECT_RULE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ru.capralow.dt.conversion.plugin.core.cm.CmSelectionVariant <em>Selection Variant</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.capralow.dt.conversion.plugin.core.cm.CmSelectionVariant
	 * @see ru.capralow.dt.conversion.plugin.core.cm.impl.CmPackageImpl#getCmSelectionVariant()
	 * @generated
	 */
	int CM_SELECTION_VARIANT = 4;


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
	 * Returns the meta object for the attribute '{@link ru.capralow.dt.conversion.plugin.core.cm.ConversionModule#getModuleURI <em>Module URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Module URI</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.ConversionModule#getModuleURI()
	 * @see #getConversionModule()
	 * @generated
	 */
	EAttribute getConversionModule_ModuleURI();

	/**
	 * Returns the meta object for the containment reference list '{@link ru.capralow.dt.conversion.plugin.core.cm.ConversionModule#getDataRules <em>Data Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Data Rules</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.ConversionModule#getDataRules()
	 * @see #getConversionModule()
	 * @generated
	 */
	EReference getConversionModule_DataRules();

	/**
	 * Returns the meta object for the containment reference list '{@link ru.capralow.dt.conversion.plugin.core.cm.ConversionModule#getObjectRules <em>Object Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Object Rules</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.ConversionModule#getObjectRules()
	 * @see #getConversionModule()
	 * @generated
	 */
	EReference getConversionModule_ObjectRules();

	/**
	 * Returns the meta object for the attribute '{@link ru.capralow.dt.conversion.plugin.core.cm.ConversionModule#getPredefineds <em>Predefineds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Predefineds</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.ConversionModule#getPredefineds()
	 * @see #getConversionModule()
	 * @generated
	 */
	EAttribute getConversionModule_Predefineds();

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
	 * Returns the meta object for the attribute '{@link ru.capralow.dt.conversion.plugin.core.cm.ConversionModule#getBeforeConvertationEventNode <em>Before Convertation Event Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Before Convertation Event Node</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.ConversionModule#getBeforeConvertationEventNode()
	 * @see #getConversionModule()
	 * @generated
	 */
	EAttribute getConversionModule_BeforeConvertationEventNode();

	/**
	 * Returns the meta object for the containment reference list '{@link ru.capralow.dt.conversion.plugin.core.cm.ConversionModule#getSendingRules <em>Sending Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sending Rules</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.ConversionModule#getSendingRules()
	 * @see #getConversionModule()
	 * @generated
	 */
	EReference getConversionModule_SendingRules();

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
	 * Returns the meta object for class '{@link ru.capralow.dt.conversion.plugin.core.cm.CmSendingRule <em>Sending Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sending Rule</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.CmSendingRule
	 * @generated
	 */
	EClass getCmSendingRule();

	/**
	 * Returns the meta object for the reference '{@link ru.capralow.dt.conversion.plugin.core.cm.CmSendingRule#getDataRule <em>Data Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Data Rule</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.CmSendingRule#getDataRule()
	 * @see #getCmSendingRule()
	 * @generated
	 */
	EReference getCmSendingRule_DataRule();

	/**
	 * Returns the meta object for the reference list '{@link ru.capralow.dt.conversion.plugin.core.cm.CmSendingRule#getObjectRules <em>Object Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Object Rules</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.CmSendingRule#getObjectRules()
	 * @see #getCmSendingRule()
	 * @generated
	 */
	EReference getCmSendingRule_ObjectRules();

	/**
	 * Returns the meta object for class '{@link ru.capralow.dt.conversion.plugin.core.cm.CmDataRule <em>Data Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Rule</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.CmDataRule
	 * @generated
	 */
	EClass getCmDataRule();

	/**
	 * Returns the meta object for the attribute '{@link ru.capralow.dt.conversion.plugin.core.cm.CmDataRule#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.CmDataRule#getName()
	 * @see #getCmDataRule()
	 * @generated
	 */
	EAttribute getCmDataRule_Name();

	/**
	 * Returns the meta object for the attribute '{@link ru.capralow.dt.conversion.plugin.core.cm.CmDataRule#getDataSelectionEvent <em>Data Selection Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Selection Event</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.CmDataRule#getDataSelectionEvent()
	 * @see #getCmDataRule()
	 * @generated
	 */
	EAttribute getCmDataRule_DataSelectionEvent();

	/**
	 * Returns the meta object for the attribute '{@link ru.capralow.dt.conversion.plugin.core.cm.CmDataRule#getBeforeProcessingEvent <em>Before Processing Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Before Processing Event</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.CmDataRule#getBeforeProcessingEvent()
	 * @see #getCmDataRule()
	 * @generated
	 */
	EAttribute getCmDataRule_BeforeProcessingEvent();

	/**
	 * Returns the meta object for the attribute '{@link ru.capralow.dt.conversion.plugin.core.cm.CmDataRule#getOnProcessingEvent <em>On Processing Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>On Processing Event</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.CmDataRule#getOnProcessingEvent()
	 * @see #getCmDataRule()
	 * @generated
	 */
	EAttribute getCmDataRule_OnProcessingEvent();

	/**
	 * Returns the meta object for the attribute '{@link ru.capralow.dt.conversion.plugin.core.cm.CmDataRule#getForSending <em>For Sending</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>For Sending</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.CmDataRule#getForSending()
	 * @see #getCmDataRule()
	 * @generated
	 */
	EAttribute getCmDataRule_ForSending();

	/**
	 * Returns the meta object for the attribute '{@link ru.capralow.dt.conversion.plugin.core.cm.CmDataRule#getForReceiving <em>For Receiving</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>For Receiving</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.CmDataRule#getForReceiving()
	 * @see #getCmDataRule()
	 * @generated
	 */
	EAttribute getCmDataRule_ForReceiving();

	/**
	 * Returns the meta object for the attribute '{@link ru.capralow.dt.conversion.plugin.core.cm.CmDataRule#getConfigurationObject <em>Configuration Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Configuration Object</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.CmDataRule#getConfigurationObject()
	 * @see #getCmDataRule()
	 * @generated
	 */
	EAttribute getCmDataRule_ConfigurationObject();

	/**
	 * Returns the meta object for the attribute '{@link ru.capralow.dt.conversion.plugin.core.cm.CmDataRule#getFormatObject <em>Format Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Format Object</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.CmDataRule#getFormatObject()
	 * @see #getCmDataRule()
	 * @generated
	 */
	EAttribute getCmDataRule_FormatObject();

	/**
	 * Returns the meta object for the attribute '{@link ru.capralow.dt.conversion.plugin.core.cm.CmDataRule#getIsDisabled <em>Is Disabled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Disabled</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.CmDataRule#getIsDisabled()
	 * @see #getCmDataRule()
	 * @generated
	 */
	EAttribute getCmDataRule_IsDisabled();

	/**
	 * Returns the meta object for the attribute '{@link ru.capralow.dt.conversion.plugin.core.cm.CmDataRule#getIsDataCleaning <em>Is Data Cleaning</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Data Cleaning</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.CmDataRule#getIsDataCleaning()
	 * @see #getCmDataRule()
	 * @generated
	 */
	EAttribute getCmDataRule_IsDataCleaning();

	/**
	 * Returns the meta object for the attribute '{@link ru.capralow.dt.conversion.plugin.core.cm.CmDataRule#getSelectionVariant <em>Selection Variant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Selection Variant</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.CmDataRule#getSelectionVariant()
	 * @see #getCmDataRule()
	 * @generated
	 */
	EAttribute getCmDataRule_SelectionVariant();

	/**
	 * Returns the meta object for the reference list '{@link ru.capralow.dt.conversion.plugin.core.cm.CmDataRule#getObjectRules <em>Object Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Object Rules</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.CmDataRule#getObjectRules()
	 * @see #getCmDataRule()
	 * @generated
	 */
	EReference getCmDataRule_ObjectRules();

	/**
	 * Returns the meta object for class '{@link ru.capralow.dt.conversion.plugin.core.cm.CmObjectRule <em>Object Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object Rule</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.CmObjectRule
	 * @generated
	 */
	EClass getCmObjectRule();

	/**
	 * Returns the meta object for the attribute '{@link ru.capralow.dt.conversion.plugin.core.cm.CmObjectRule#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.CmObjectRule#getName()
	 * @see #getCmObjectRule()
	 * @generated
	 */
	EAttribute getCmObjectRule_Name();

	/**
	 * Returns the meta object for enum '{@link ru.capralow.dt.conversion.plugin.core.cm.CmSelectionVariant <em>Selection Variant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Selection Variant</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.CmSelectionVariant
	 * @generated
	 */
	EEnum getCmSelectionVariant();

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
		 * The meta object literal for the '<em><b>Module URI</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONVERSION_MODULE__MODULE_URI = eINSTANCE.getConversionModule_ModuleURI();

		/**
		 * The meta object literal for the '<em><b>Data Rules</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONVERSION_MODULE__DATA_RULES = eINSTANCE.getConversionModule_DataRules();

		/**
		 * The meta object literal for the '<em><b>Object Rules</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONVERSION_MODULE__OBJECT_RULES = eINSTANCE.getConversionModule_ObjectRules();

		/**
		 * The meta object literal for the '<em><b>Predefineds</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONVERSION_MODULE__PREDEFINEDS = eINSTANCE.getConversionModule_Predefineds();

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
		 * The meta object literal for the '<em><b>Before Convertation Event Node</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONVERSION_MODULE__BEFORE_CONVERTATION_EVENT_NODE = eINSTANCE.getConversionModule_BeforeConvertationEventNode();

		/**
		 * The meta object literal for the '<em><b>Sending Rules</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONVERSION_MODULE__SENDING_RULES = eINSTANCE.getConversionModule_SendingRules();

		/**
		 * The meta object literal for the '<em><b>Algorithms</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONVERSION_MODULE__ALGORITHMS = eINSTANCE.getConversionModule_Algorithms();

		/**
		 * The meta object literal for the '{@link ru.capralow.dt.conversion.plugin.core.cm.impl.CmSendingRuleImpl <em>Sending Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ru.capralow.dt.conversion.plugin.core.cm.impl.CmSendingRuleImpl
		 * @see ru.capralow.dt.conversion.plugin.core.cm.impl.CmPackageImpl#getCmSendingRule()
		 * @generated
		 */
		EClass CM_SENDING_RULE = eINSTANCE.getCmSendingRule();

		/**
		 * The meta object literal for the '<em><b>Data Rule</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CM_SENDING_RULE__DATA_RULE = eINSTANCE.getCmSendingRule_DataRule();

		/**
		 * The meta object literal for the '<em><b>Object Rules</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CM_SENDING_RULE__OBJECT_RULES = eINSTANCE.getCmSendingRule_ObjectRules();

		/**
		 * The meta object literal for the '{@link ru.capralow.dt.conversion.plugin.core.cm.impl.CmDataRuleImpl <em>Data Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ru.capralow.dt.conversion.plugin.core.cm.impl.CmDataRuleImpl
		 * @see ru.capralow.dt.conversion.plugin.core.cm.impl.CmPackageImpl#getCmDataRule()
		 * @generated
		 */
		EClass CM_DATA_RULE = eINSTANCE.getCmDataRule();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CM_DATA_RULE__NAME = eINSTANCE.getCmDataRule_Name();

		/**
		 * The meta object literal for the '<em><b>Data Selection Event</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CM_DATA_RULE__DATA_SELECTION_EVENT = eINSTANCE.getCmDataRule_DataSelectionEvent();

		/**
		 * The meta object literal for the '<em><b>Before Processing Event</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CM_DATA_RULE__BEFORE_PROCESSING_EVENT = eINSTANCE.getCmDataRule_BeforeProcessingEvent();

		/**
		 * The meta object literal for the '<em><b>On Processing Event</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CM_DATA_RULE__ON_PROCESSING_EVENT = eINSTANCE.getCmDataRule_OnProcessingEvent();

		/**
		 * The meta object literal for the '<em><b>For Sending</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CM_DATA_RULE__FOR_SENDING = eINSTANCE.getCmDataRule_ForSending();

		/**
		 * The meta object literal for the '<em><b>For Receiving</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CM_DATA_RULE__FOR_RECEIVING = eINSTANCE.getCmDataRule_ForReceiving();

		/**
		 * The meta object literal for the '<em><b>Configuration Object</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CM_DATA_RULE__CONFIGURATION_OBJECT = eINSTANCE.getCmDataRule_ConfigurationObject();

		/**
		 * The meta object literal for the '<em><b>Format Object</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CM_DATA_RULE__FORMAT_OBJECT = eINSTANCE.getCmDataRule_FormatObject();

		/**
		 * The meta object literal for the '<em><b>Is Disabled</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CM_DATA_RULE__IS_DISABLED = eINSTANCE.getCmDataRule_IsDisabled();

		/**
		 * The meta object literal for the '<em><b>Is Data Cleaning</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CM_DATA_RULE__IS_DATA_CLEANING = eINSTANCE.getCmDataRule_IsDataCleaning();

		/**
		 * The meta object literal for the '<em><b>Selection Variant</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CM_DATA_RULE__SELECTION_VARIANT = eINSTANCE.getCmDataRule_SelectionVariant();

		/**
		 * The meta object literal for the '<em><b>Object Rules</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CM_DATA_RULE__OBJECT_RULES = eINSTANCE.getCmDataRule_ObjectRules();

		/**
		 * The meta object literal for the '{@link ru.capralow.dt.conversion.plugin.core.cm.impl.CmObjectRuleImpl <em>Object Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ru.capralow.dt.conversion.plugin.core.cm.impl.CmObjectRuleImpl
		 * @see ru.capralow.dt.conversion.plugin.core.cm.impl.CmPackageImpl#getCmObjectRule()
		 * @generated
		 */
		EClass CM_OBJECT_RULE = eINSTANCE.getCmObjectRule();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CM_OBJECT_RULE__NAME = eINSTANCE.getCmObjectRule_Name();

		/**
		 * The meta object literal for the '{@link ru.capralow.dt.conversion.plugin.core.cm.CmSelectionVariant <em>Selection Variant</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ru.capralow.dt.conversion.plugin.core.cm.CmSelectionVariant
		 * @see ru.capralow.dt.conversion.plugin.core.cm.impl.CmPackageImpl#getCmSelectionVariant()
		 * @generated
		 */
		EEnum CM_SELECTION_VARIANT = eINSTANCE.getCmSelectionVariant();

	}

} //CmPackage

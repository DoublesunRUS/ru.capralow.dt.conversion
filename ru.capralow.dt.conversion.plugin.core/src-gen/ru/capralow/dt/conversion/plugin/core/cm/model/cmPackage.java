/**
 */
package ru.capralow.dt.conversion.plugin.core.cm.model;

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
 * @see ru.capralow.dt.conversion.plugin.core.cm.model.cmFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel loadInitialization='false' literalsInterface='true' nonNLSMarkers='true' prefix='cm' updateClasspath='false' basePackage='ru.capralow.dt.conversion.plugin.core.cm'"
 * @generated
 */
public interface cmPackage extends EPackage {
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
	String eNS_URI = "http://ru.capralow.dt.conversion.plugin.core.cm.model"; //$NON-NLS-1$

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
	cmPackage eINSTANCE = ru.capralow.dt.conversion.plugin.core.cm.model.impl.cmPackageImpl.init();

	/**
	 * The meta object id for the '{@link ru.capralow.dt.conversion.plugin.core.cm.model.impl.ConversionModuleImpl <em>Conversion Module</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.impl.ConversionModuleImpl
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.impl.cmPackageImpl#getConversionModule()
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
	 * The feature id for the '<em><b>Subsystems</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSION_MODULE__SUBSYSTEMS = 1;

	/**
	 * The feature id for the '<em><b>Params</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSION_MODULE__PARAMS = 2;

	/**
	 * The feature id for the '<em><b>Before Convertation Event</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSION_MODULE__BEFORE_CONVERTATION_EVENT = 3;

	/**
	 * The feature id for the '<em><b>Before Convertation Event Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSION_MODULE__BEFORE_CONVERTATION_EVENT_PREFIX = 4;

	/**
	 * The feature id for the '<em><b>Before Convertation Event Suffix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSION_MODULE__BEFORE_CONVERTATION_EVENT_SUFFIX = 5;

	/**
	 * The feature id for the '<em><b>After Convertation Event</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSION_MODULE__AFTER_CONVERTATION_EVENT = 6;

	/**
	 * The feature id for the '<em><b>After Convertation Event Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSION_MODULE__AFTER_CONVERTATION_EVENT_PREFIX = 7;

	/**
	 * The feature id for the '<em><b>After Convertation Event Suffix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSION_MODULE__AFTER_CONVERTATION_EVENT_SUFFIX = 8;

	/**
	 * The feature id for the '<em><b>Before Filling Event</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSION_MODULE__BEFORE_FILLING_EVENT = 9;

	/**
	 * The feature id for the '<em><b>Before Filling Event Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSION_MODULE__BEFORE_FILLING_EVENT_PREFIX = 10;

	/**
	 * The feature id for the '<em><b>Before Filling Event Suffix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSION_MODULE__BEFORE_FILLING_EVENT_SUFFIX = 11;

	/**
	 * The feature id for the '<em><b>Data Rules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSION_MODULE__DATA_RULES = 12;

	/**
	 * The feature id for the '<em><b>Object Rules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSION_MODULE__OBJECT_RULES = 13;

	/**
	 * The feature id for the '<em><b>Predefineds</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSION_MODULE__PREDEFINEDS = 14;

	/**
	 * The feature id for the '<em><b>Algorithms</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSION_MODULE__ALGORITHMS = 15;

	/**
	 * The number of structural features of the '<em>Conversion Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSION_MODULE_FEATURE_COUNT = 16;

	/**
	 * The operation id for the '<em>Get Subsystem</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSION_MODULE___GET_SUBSYSTEM__SUBSYSTEM = 0;

	/**
	 * The operation id for the '<em>Get Before Convertation Event Text</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSION_MODULE___GET_BEFORE_CONVERTATION_EVENT_TEXT = 1;

	/**
	 * The operation id for the '<em>Get After Convertation Event Text</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSION_MODULE___GET_AFTER_CONVERTATION_EVENT_TEXT = 2;

	/**
	 * The operation id for the '<em>Get Before Filling Event Text</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSION_MODULE___GET_BEFORE_FILLING_EVENT_TEXT = 3;

	/**
	 * The operation id for the '<em>Get Data Rule</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSION_MODULE___GET_DATA_RULE__STRING = 4;

	/**
	 * The operation id for the '<em>Get Sending Data Rules</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSION_MODULE___GET_SENDING_DATA_RULES = 5;

	/**
	 * The operation id for the '<em>Get Sending Data Rules</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSION_MODULE___GET_SENDING_DATA_RULES__CMSUBSYSTEM = 6;

	/**
	 * The operation id for the '<em>Get Receiving Data Rules</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSION_MODULE___GET_RECEIVING_DATA_RULES = 7;

	/**
	 * The operation id for the '<em>Get Receiving Data Rules</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSION_MODULE___GET_RECEIVING_DATA_RULES__CMSUBSYSTEM = 8;

	/**
	 * The operation id for the '<em>Get Object Rule</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSION_MODULE___GET_OBJECT_RULE__STRING = 9;

	/**
	 * The operation id for the '<em>Get Sending Object Rules</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSION_MODULE___GET_SENDING_OBJECT_RULES = 10;

	/**
	 * The operation id for the '<em>Get Sending Object Rules</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSION_MODULE___GET_SENDING_OBJECT_RULES__CMSUBSYSTEM = 11;

	/**
	 * The operation id for the '<em>Get Receiving Object Rules</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSION_MODULE___GET_RECEIVING_OBJECT_RULES = 12;

	/**
	 * The operation id for the '<em>Get Receiving Object Rules</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSION_MODULE___GET_RECEIVING_OBJECT_RULES__CMSUBSYSTEM = 13;

	/**
	 * The operation id for the '<em>Get Algorithm</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSION_MODULE___GET_ALGORITHM__STRING = 14;

	/**
	 * The operation id for the '<em>Get All Algorithms Text</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSION_MODULE___GET_ALL_ALGORITHMS_TEXT__STRING = 15;

	/**
	 * The number of operations of the '<em>Conversion Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSION_MODULE_OPERATION_COUNT = 16;

	/**
	 * The meta object id for the '{@link ru.capralow.dt.conversion.plugin.core.cm.model.impl.CmObjectImpl <em>Cm Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.impl.CmObjectImpl
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.impl.cmPackageImpl#getCmObject()
	 * @generated
	 */
	int CM_OBJECT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CM_OBJECT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Configuration Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CM_OBJECT__CONFIGURATION_OBJECT = 1;

	/**
	 * The feature id for the '<em><b>Configuration Object Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CM_OBJECT__CONFIGURATION_OBJECT_NAME = 2;

	/**
	 * The feature id for the '<em><b>Configuration Object Formatted Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CM_OBJECT__CONFIGURATION_OBJECT_FORMATTED_NAME = 3;

	/**
	 * The feature id for the '<em><b>Format Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CM_OBJECT__FORMAT_OBJECT = 4;

	/**
	 * The feature id for the '<em><b>For Sending</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CM_OBJECT__FOR_SENDING = 5;

	/**
	 * The feature id for the '<em><b>For Receiving</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CM_OBJECT__FOR_RECEIVING = 6;

	/**
	 * The number of structural features of the '<em>Cm Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CM_OBJECT_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Cm Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CM_OBJECT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ru.capralow.dt.conversion.plugin.core.cm.model.impl.CmDataRuleImpl <em>Cm Data Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.impl.CmDataRuleImpl
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.impl.cmPackageImpl#getCmDataRule()
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
	int CM_DATA_RULE__NAME = CM_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Configuration Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CM_DATA_RULE__CONFIGURATION_OBJECT = CM_OBJECT__CONFIGURATION_OBJECT;

	/**
	 * The feature id for the '<em><b>Configuration Object Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CM_DATA_RULE__CONFIGURATION_OBJECT_NAME = CM_OBJECT__CONFIGURATION_OBJECT_NAME;

	/**
	 * The feature id for the '<em><b>Configuration Object Formatted Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CM_DATA_RULE__CONFIGURATION_OBJECT_FORMATTED_NAME = CM_OBJECT__CONFIGURATION_OBJECT_FORMATTED_NAME;

	/**
	 * The feature id for the '<em><b>Format Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CM_DATA_RULE__FORMAT_OBJECT = CM_OBJECT__FORMAT_OBJECT;

	/**
	 * The feature id for the '<em><b>For Sending</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CM_DATA_RULE__FOR_SENDING = CM_OBJECT__FOR_SENDING;

	/**
	 * The feature id for the '<em><b>For Receiving</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CM_DATA_RULE__FOR_RECEIVING = CM_OBJECT__FOR_RECEIVING;

	/**
	 * The feature id for the '<em><b>Is Disabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CM_DATA_RULE__IS_DISABLED = CM_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Selection Variant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CM_DATA_RULE__SELECTION_VARIANT = CM_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>On Processing Event</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CM_DATA_RULE__ON_PROCESSING_EVENT = CM_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>On Processing Event Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CM_DATA_RULE__ON_PROCESSING_EVENT_PREFIX = CM_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>On Processing Event Suffix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CM_DATA_RULE__ON_PROCESSING_EVENT_SUFFIX = CM_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Data Selection Event</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CM_DATA_RULE__DATA_SELECTION_EVENT = CM_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Data Selection Event Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CM_DATA_RULE__DATA_SELECTION_EVENT_PREFIX = CM_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Data Selection Event Suffix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CM_DATA_RULE__DATA_SELECTION_EVENT_SUFFIX = CM_OBJECT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Is Data Cleaning</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CM_DATA_RULE__IS_DATA_CLEANING = CM_OBJECT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Object Rules</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CM_DATA_RULE__OBJECT_RULES = CM_OBJECT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Subsystems</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CM_DATA_RULE__SUBSYSTEMS = CM_OBJECT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Group</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CM_DATA_RULE__GROUP = CM_OBJECT_FEATURE_COUNT + 11;

	/**
	 * The number of structural features of the '<em>Cm Data Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CM_DATA_RULE_FEATURE_COUNT = CM_OBJECT_FEATURE_COUNT + 12;

	/**
	 * The operation id for the '<em>Get On Processing Event Text</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CM_DATA_RULE___GET_ON_PROCESSING_EVENT_TEXT = CM_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get On Processing Event Declaration</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CM_DATA_RULE___GET_ON_PROCESSING_EVENT_DECLARATION = CM_OBJECT_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Data Selection Event Text</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CM_DATA_RULE___GET_DATA_SELECTION_EVENT_TEXT = CM_OBJECT_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Data Selection Event Declaration</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CM_DATA_RULE___GET_DATA_SELECTION_EVENT_DECLARATION = CM_OBJECT_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Data Cleaning Declaration</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CM_DATA_RULE___GET_DATA_CLEANING_DECLARATION = CM_OBJECT_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Included In Subsystem</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CM_DATA_RULE___INCLUDED_IN_SUBSYSTEM__CMSUBSYSTEM = CM_OBJECT_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CM_DATA_RULE___TO_STRING = CM_OBJECT_OPERATION_COUNT + 6;

	/**
	 * The number of operations of the '<em>Cm Data Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CM_DATA_RULE_OPERATION_COUNT = CM_OBJECT_OPERATION_COUNT + 7;

	/**
	 * The meta object id for the '{@link ru.capralow.dt.conversion.plugin.core.cm.model.impl.CmObjectRuleImpl <em>Cm Object Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.impl.CmObjectRuleImpl
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.impl.cmPackageImpl#getCmObjectRule()
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
	int CM_OBJECT_RULE__NAME = CM_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Configuration Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CM_OBJECT_RULE__CONFIGURATION_OBJECT = CM_OBJECT__CONFIGURATION_OBJECT;

	/**
	 * The feature id for the '<em><b>Configuration Object Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CM_OBJECT_RULE__CONFIGURATION_OBJECT_NAME = CM_OBJECT__CONFIGURATION_OBJECT_NAME;

	/**
	 * The feature id for the '<em><b>Configuration Object Formatted Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CM_OBJECT_RULE__CONFIGURATION_OBJECT_FORMATTED_NAME = CM_OBJECT__CONFIGURATION_OBJECT_FORMATTED_NAME;

	/**
	 * The feature id for the '<em><b>Format Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CM_OBJECT_RULE__FORMAT_OBJECT = CM_OBJECT__FORMAT_OBJECT;

	/**
	 * The feature id for the '<em><b>For Sending</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CM_OBJECT_RULE__FOR_SENDING = CM_OBJECT__FOR_SENDING;

	/**
	 * The feature id for the '<em><b>For Receiving</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CM_OBJECT_RULE__FOR_RECEIVING = CM_OBJECT__FOR_RECEIVING;

	/**
	 * The feature id for the '<em><b>Is Disabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CM_OBJECT_RULE__IS_DISABLED = CM_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>For Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CM_OBJECT_RULE__FOR_GROUP = CM_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Attribute Rules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CM_OBJECT_RULE__ATTRIBUTE_RULES = CM_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>On Sending Event</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CM_OBJECT_RULE__ON_SENDING_EVENT = CM_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>On Sending Event Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CM_OBJECT_RULE__ON_SENDING_EVENT_PREFIX = CM_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>On Sending Event Suffix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CM_OBJECT_RULE__ON_SENDING_EVENT_SUFFIX = CM_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Before Receiving Event</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CM_OBJECT_RULE__BEFORE_RECEIVING_EVENT = CM_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Before Receiving Event Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CM_OBJECT_RULE__BEFORE_RECEIVING_EVENT_PREFIX = CM_OBJECT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Before Receiving Event Suffix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CM_OBJECT_RULE__BEFORE_RECEIVING_EVENT_SUFFIX = CM_OBJECT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>On Receiving Event</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CM_OBJECT_RULE__ON_RECEIVING_EVENT = CM_OBJECT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>On Receiving Event Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CM_OBJECT_RULE__ON_RECEIVING_EVENT_PREFIX = CM_OBJECT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>On Receiving Event Suffix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CM_OBJECT_RULE__ON_RECEIVING_EVENT_SUFFIX = CM_OBJECT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>After Receiving Algorithm</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CM_OBJECT_RULE__AFTER_RECEIVING_ALGORITHM = CM_OBJECT_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Identification Variant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CM_OBJECT_RULE__IDENTIFICATION_VARIANT = CM_OBJECT_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Identification Fields</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CM_OBJECT_RULE__IDENTIFICATION_FIELDS = CM_OBJECT_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Subsystems</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CM_OBJECT_RULE__SUBSYSTEMS = CM_OBJECT_FEATURE_COUNT + 15;

	/**
	 * The number of structural features of the '<em>Cm Object Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CM_OBJECT_RULE_FEATURE_COUNT = CM_OBJECT_FEATURE_COUNT + 16;

	/**
	 * The operation id for the '<em>Get For Group Declaration</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CM_OBJECT_RULE___GET_FOR_GROUP_DECLARATION = CM_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get On Sending Event Text</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CM_OBJECT_RULE___GET_ON_SENDING_EVENT_TEXT = CM_OBJECT_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get On Sending Event Declaration</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CM_OBJECT_RULE___GET_ON_SENDING_EVENT_DECLARATION = CM_OBJECT_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Before Receiving Event Text</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CM_OBJECT_RULE___GET_BEFORE_RECEIVING_EVENT_TEXT = CM_OBJECT_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Before Receiving Event Declaration</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CM_OBJECT_RULE___GET_BEFORE_RECEIVING_EVENT_DECLARATION = CM_OBJECT_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Get On Receiving Event Text</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CM_OBJECT_RULE___GET_ON_RECEIVING_EVENT_TEXT = CM_OBJECT_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Get On Receiving Event Declaration</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CM_OBJECT_RULE___GET_ON_RECEIVING_EVENT_DECLARATION = CM_OBJECT_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Get After Receiving Algorithm Declaration</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CM_OBJECT_RULE___GET_AFTER_RECEIVING_ALGORITHM_DECLARATION = CM_OBJECT_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Included In Subsystem</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CM_OBJECT_RULE___INCLUDED_IN_SUBSYSTEM__CMSUBSYSTEM = CM_OBJECT_OPERATION_COUNT + 8;

	/**
	 * The operation id for the '<em>To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CM_OBJECT_RULE___TO_STRING = CM_OBJECT_OPERATION_COUNT + 9;

	/**
	 * The number of operations of the '<em>Cm Object Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CM_OBJECT_RULE_OPERATION_COUNT = CM_OBJECT_OPERATION_COUNT + 10;

	/**
	 * The meta object id for the '{@link ru.capralow.dt.conversion.plugin.core.cm.model.impl.CmAttributeRuleImpl <em>Cm Attribute Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.impl.CmAttributeRuleImpl
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.impl.cmPackageImpl#getCmAttributeRule()
	 * @generated
	 */
	int CM_ATTRIBUTE_RULE = 4;

	/**
	 * The feature id for the '<em><b>Configuration Tabular Section</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CM_ATTRIBUTE_RULE__CONFIGURATION_TABULAR_SECTION = 0;

	/**
	 * The feature id for the '<em><b>Configuration Attribute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CM_ATTRIBUTE_RULE__CONFIGURATION_ATTRIBUTE = 1;

	/**
	 * The feature id for the '<em><b>Format Tabular Section</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CM_ATTRIBUTE_RULE__FORMAT_TABULAR_SECTION = 2;

	/**
	 * The feature id for the '<em><b>Format Attribute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CM_ATTRIBUTE_RULE__FORMAT_ATTRIBUTE = 3;

	/**
	 * The feature id for the '<em><b>Object Rule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CM_ATTRIBUTE_RULE__OBJECT_RULE = 4;

	/**
	 * The feature id for the '<em><b>Is Custom Rule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CM_ATTRIBUTE_RULE__IS_CUSTOM_RULE = 5;

	/**
	 * The number of structural features of the '<em>Cm Attribute Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CM_ATTRIBUTE_RULE_FEATURE_COUNT = 6;

	/**
	 * The operation id for the '<em>Get Configuration Attribute Full Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CM_ATTRIBUTE_RULE___GET_CONFIGURATION_ATTRIBUTE_FULL_NAME = 0;

	/**
	 * The operation id for the '<em>Get Format Attribute Full Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CM_ATTRIBUTE_RULE___GET_FORMAT_ATTRIBUTE_FULL_NAME = 1;

	/**
	 * The operation id for the '<em>To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CM_ATTRIBUTE_RULE___TO_STRING = 2;

	/**
	 * The number of operations of the '<em>Cm Attribute Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CM_ATTRIBUTE_RULE_OPERATION_COUNT = 3;

	/**
	 * The meta object id for the '{@link ru.capralow.dt.conversion.plugin.core.cm.model.impl.CmPredefinedImpl <em>Cm Predefined</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.impl.CmPredefinedImpl
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.impl.cmPackageImpl#getCmPredefined()
	 * @generated
	 */
	int CM_PREDEFINED = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CM_PREDEFINED__NAME = CM_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Configuration Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CM_PREDEFINED__CONFIGURATION_OBJECT = CM_OBJECT__CONFIGURATION_OBJECT;

	/**
	 * The feature id for the '<em><b>Configuration Object Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CM_PREDEFINED__CONFIGURATION_OBJECT_NAME = CM_OBJECT__CONFIGURATION_OBJECT_NAME;

	/**
	 * The feature id for the '<em><b>Configuration Object Formatted Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CM_PREDEFINED__CONFIGURATION_OBJECT_FORMATTED_NAME = CM_OBJECT__CONFIGURATION_OBJECT_FORMATTED_NAME;

	/**
	 * The feature id for the '<em><b>Format Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CM_PREDEFINED__FORMAT_OBJECT = CM_OBJECT__FORMAT_OBJECT;

	/**
	 * The feature id for the '<em><b>For Sending</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CM_PREDEFINED__FOR_SENDING = CM_OBJECT__FOR_SENDING;

	/**
	 * The feature id for the '<em><b>For Receiving</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CM_PREDEFINED__FOR_RECEIVING = CM_OBJECT__FOR_RECEIVING;

	/**
	 * The feature id for the '<em><b>Predefined Maps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CM_PREDEFINED__PREDEFINED_MAPS = CM_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Cm Predefined</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CM_PREDEFINED_FEATURE_COUNT = CM_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Predefined Map Exists</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CM_PREDEFINED___PREDEFINED_MAP_EXISTS__STRING_STRING = CM_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CM_PREDEFINED___TO_STRING = CM_OBJECT_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Cm Predefined</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CM_PREDEFINED_OPERATION_COUNT = CM_OBJECT_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link ru.capralow.dt.conversion.plugin.core.cm.model.impl.CmPredefinedMapImpl <em>Cm Predefined Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.impl.CmPredefinedMapImpl
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.impl.cmPackageImpl#getCmPredefinedMap()
	 * @generated
	 */
	int CM_PREDEFINED_MAP = 6;

	/**
	 * The feature id for the '<em><b>Configuration Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CM_PREDEFINED_MAP__CONFIGURATION_VALUE = 0;

	/**
	 * The feature id for the '<em><b>Format Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CM_PREDEFINED_MAP__FORMAT_VALUE = 1;

	/**
	 * The number of structural features of the '<em>Cm Predefined Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CM_PREDEFINED_MAP_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Get Configuration Value Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CM_PREDEFINED_MAP___GET_CONFIGURATION_VALUE_NAME = 0;

	/**
	 * The operation id for the '<em>Get Format Value Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CM_PREDEFINED_MAP___GET_FORMAT_VALUE_NAME = 1;

	/**
	 * The number of operations of the '<em>Cm Predefined Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CM_PREDEFINED_MAP_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link ru.capralow.dt.conversion.plugin.core.cm.model.impl.CmAlgorithmImpl <em>Cm Algorithm</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.impl.CmAlgorithmImpl
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.impl.cmPackageImpl#getCmAlgorithm()
	 * @generated
	 */
	int CM_ALGORITHM = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CM_ALGORITHM__NAME = 0;

	/**
	 * The feature id for the '<em><b>Method Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CM_ALGORITHM__METHOD_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Params</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CM_ALGORITHM__PARAMS = 2;

	/**
	 * The feature id for the '<em><b>Is Export</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CM_ALGORITHM__IS_EXPORT = 3;

	/**
	 * The feature id for the '<em><b>Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CM_ALGORITHM__BODY = 4;

	/**
	 * The feature id for the '<em><b>Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CM_ALGORITHM__PREFIX = 5;

	/**
	 * The feature id for the '<em><b>Suffix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CM_ALGORITHM__SUFFIX = 6;

	/**
	 * The number of structural features of the '<em>Cm Algorithm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CM_ALGORITHM_FEATURE_COUNT = 7;

	/**
	 * The operation id for the '<em>Get Algorithm Text</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CM_ALGORITHM___GET_ALGORITHM_TEXT = 0;

	/**
	 * The operation id for the '<em>To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CM_ALGORITHM___TO_STRING = 1;

	/**
	 * The number of operations of the '<em>Cm Algorithm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CM_ALGORITHM_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link ru.capralow.dt.conversion.plugin.core.cm.model.impl.CmSubsystemImpl <em>Cm Subsystem</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.impl.CmSubsystemImpl
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.impl.cmPackageImpl#getCmSubsystem()
	 * @generated
	 */
	int CM_SUBSYSTEM = 8;

	/**
	 * The feature id for the '<em><b>Subsystem</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CM_SUBSYSTEM__SUBSYSTEM = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CM_SUBSYSTEM__NAME = 1;

	/**
	 * The feature id for the '<em><b>Special Subsystem Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CM_SUBSYSTEM__SPECIAL_SUBSYSTEM_TYPE = 2;

	/**
	 * The number of structural features of the '<em>Cm Subsystem</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CM_SUBSYSTEM_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Cm Subsystem</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CM_SUBSYSTEM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ru.capralow.dt.conversion.plugin.core.cm.model.impl.CmGroupImpl <em>Cm Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.impl.CmGroupImpl
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.impl.cmPackageImpl#getCmGroup()
	 * @generated
	 */
	int CM_GROUP = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CM_GROUP__NAME = 0;

	/**
	 * The number of structural features of the '<em>Cm Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CM_GROUP_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Cm Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CM_GROUP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ru.capralow.dt.conversion.plugin.core.cm.model.CmSelectionVariant <em>Cm Selection Variant</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.CmSelectionVariant
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.impl.cmPackageImpl#getCmSelectionVariant()
	 * @generated
	 */
	int CM_SELECTION_VARIANT = 10;

	/**
	 * The meta object id for the '{@link ru.capralow.dt.conversion.plugin.core.cm.model.CmIdentificationVariant <em>Cm Identification Variant</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.CmIdentificationVariant
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.impl.cmPackageImpl#getCmIdentificationVariant()
	 * @generated
	 */
	int CM_IDENTIFICATION_VARIANT = 11;

	/**
	 * The meta object id for the '{@link ru.capralow.dt.conversion.plugin.core.cm.model.CmMethodType <em>Cm Method Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.CmMethodType
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.impl.cmPackageImpl#getCmMethodType()
	 * @generated
	 */
	int CM_METHOD_TYPE = 12;

	/**
	 * The meta object id for the '{@link ru.capralow.dt.conversion.plugin.core.cm.model.CmSpecialSubsystemType <em>Cm Special Subsystem Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.CmSpecialSubsystemType
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.impl.cmPackageImpl#getCmSpecialSubsystemType()
	 * @generated
	 */
	int CM_SPECIAL_SUBSYSTEM_TYPE = 13;


	/**
	 * Returns the meta object for class '{@link ru.capralow.dt.conversion.plugin.core.cm.model.ConversionModule <em>Conversion Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conversion Module</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.ConversionModule
	 * @generated
	 */
	EClass getConversionModule();

	/**
	 * Returns the meta object for the attribute '{@link ru.capralow.dt.conversion.plugin.core.cm.model.ConversionModule#getStoreVersion <em>Store Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Store Version</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.ConversionModule#getStoreVersion()
	 * @see #getConversionModule()
	 * @generated
	 */
	EAttribute getConversionModule_StoreVersion();

	/**
	 * Returns the meta object for the containment reference list '{@link ru.capralow.dt.conversion.plugin.core.cm.model.ConversionModule#getSubsystems <em>Subsystems</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Subsystems</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.ConversionModule#getSubsystems()
	 * @see #getConversionModule()
	 * @generated
	 */
	EReference getConversionModule_Subsystems();

	/**
	 * Returns the meta object for the attribute '{@link ru.capralow.dt.conversion.plugin.core.cm.model.ConversionModule#getParams <em>Params</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Params</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.ConversionModule#getParams()
	 * @see #getConversionModule()
	 * @generated
	 */
	EAttribute getConversionModule_Params();

	/**
	 * Returns the meta object for the attribute '{@link ru.capralow.dt.conversion.plugin.core.cm.model.ConversionModule#getBeforeConvertationEvent <em>Before Convertation Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Before Convertation Event</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.ConversionModule#getBeforeConvertationEvent()
	 * @see #getConversionModule()
	 * @generated
	 */
	EAttribute getConversionModule_BeforeConvertationEvent();

	/**
	 * Returns the meta object for the attribute '{@link ru.capralow.dt.conversion.plugin.core.cm.model.ConversionModule#getBeforeConvertationEventPrefix <em>Before Convertation Event Prefix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Before Convertation Event Prefix</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.ConversionModule#getBeforeConvertationEventPrefix()
	 * @see #getConversionModule()
	 * @generated
	 */
	EAttribute getConversionModule_BeforeConvertationEventPrefix();

	/**
	 * Returns the meta object for the attribute '{@link ru.capralow.dt.conversion.plugin.core.cm.model.ConversionModule#getBeforeConvertationEventSuffix <em>Before Convertation Event Suffix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Before Convertation Event Suffix</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.ConversionModule#getBeforeConvertationEventSuffix()
	 * @see #getConversionModule()
	 * @generated
	 */
	EAttribute getConversionModule_BeforeConvertationEventSuffix();

	/**
	 * Returns the meta object for the attribute '{@link ru.capralow.dt.conversion.plugin.core.cm.model.ConversionModule#getAfterConvertationEvent <em>After Convertation Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>After Convertation Event</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.ConversionModule#getAfterConvertationEvent()
	 * @see #getConversionModule()
	 * @generated
	 */
	EAttribute getConversionModule_AfterConvertationEvent();

	/**
	 * Returns the meta object for the attribute '{@link ru.capralow.dt.conversion.plugin.core.cm.model.ConversionModule#getAfterConvertationEventPrefix <em>After Convertation Event Prefix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>After Convertation Event Prefix</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.ConversionModule#getAfterConvertationEventPrefix()
	 * @see #getConversionModule()
	 * @generated
	 */
	EAttribute getConversionModule_AfterConvertationEventPrefix();

	/**
	 * Returns the meta object for the attribute '{@link ru.capralow.dt.conversion.plugin.core.cm.model.ConversionModule#getAfterConvertationEventSuffix <em>After Convertation Event Suffix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>After Convertation Event Suffix</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.ConversionModule#getAfterConvertationEventSuffix()
	 * @see #getConversionModule()
	 * @generated
	 */
	EAttribute getConversionModule_AfterConvertationEventSuffix();

	/**
	 * Returns the meta object for the attribute '{@link ru.capralow.dt.conversion.plugin.core.cm.model.ConversionModule#getBeforeFillingEvent <em>Before Filling Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Before Filling Event</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.ConversionModule#getBeforeFillingEvent()
	 * @see #getConversionModule()
	 * @generated
	 */
	EAttribute getConversionModule_BeforeFillingEvent();

	/**
	 * Returns the meta object for the attribute '{@link ru.capralow.dt.conversion.plugin.core.cm.model.ConversionModule#getBeforeFillingEventPrefix <em>Before Filling Event Prefix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Before Filling Event Prefix</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.ConversionModule#getBeforeFillingEventPrefix()
	 * @see #getConversionModule()
	 * @generated
	 */
	EAttribute getConversionModule_BeforeFillingEventPrefix();

	/**
	 * Returns the meta object for the attribute '{@link ru.capralow.dt.conversion.plugin.core.cm.model.ConversionModule#getBeforeFillingEventSuffix <em>Before Filling Event Suffix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Before Filling Event Suffix</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.ConversionModule#getBeforeFillingEventSuffix()
	 * @see #getConversionModule()
	 * @generated
	 */
	EAttribute getConversionModule_BeforeFillingEventSuffix();

	/**
	 * Returns the meta object for the containment reference list '{@link ru.capralow.dt.conversion.plugin.core.cm.model.ConversionModule#getDataRules <em>Data Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Data Rules</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.ConversionModule#getDataRules()
	 * @see #getConversionModule()
	 * @generated
	 */
	EReference getConversionModule_DataRules();

	/**
	 * Returns the meta object for the containment reference list '{@link ru.capralow.dt.conversion.plugin.core.cm.model.ConversionModule#getObjectRules <em>Object Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Object Rules</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.ConversionModule#getObjectRules()
	 * @see #getConversionModule()
	 * @generated
	 */
	EReference getConversionModule_ObjectRules();

	/**
	 * Returns the meta object for the containment reference list '{@link ru.capralow.dt.conversion.plugin.core.cm.model.ConversionModule#getPredefineds <em>Predefineds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Predefineds</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.ConversionModule#getPredefineds()
	 * @see #getConversionModule()
	 * @generated
	 */
	EReference getConversionModule_Predefineds();

	/**
	 * Returns the meta object for the containment reference list '{@link ru.capralow.dt.conversion.plugin.core.cm.model.ConversionModule#getAlgorithms <em>Algorithms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Algorithms</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.ConversionModule#getAlgorithms()
	 * @see #getConversionModule()
	 * @generated
	 */
	EReference getConversionModule_Algorithms();

	/**
	 * Returns the meta object for the '{@link ru.capralow.dt.conversion.plugin.core.cm.model.ConversionModule#getSubsystem(com._1c.g5.v8.dt.metadata.mdclass.Subsystem) <em>Get Subsystem</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Subsystem</em>' operation.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.ConversionModule#getSubsystem(com._1c.g5.v8.dt.metadata.mdclass.Subsystem)
	 * @generated
	 */
	EOperation getConversionModule__GetSubsystem__Subsystem();

	/**
	 * Returns the meta object for the '{@link ru.capralow.dt.conversion.plugin.core.cm.model.ConversionModule#getBeforeConvertationEventText() <em>Get Before Convertation Event Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Before Convertation Event Text</em>' operation.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.ConversionModule#getBeforeConvertationEventText()
	 * @generated
	 */
	EOperation getConversionModule__GetBeforeConvertationEventText();

	/**
	 * Returns the meta object for the '{@link ru.capralow.dt.conversion.plugin.core.cm.model.ConversionModule#getAfterConvertationEventText() <em>Get After Convertation Event Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get After Convertation Event Text</em>' operation.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.ConversionModule#getAfterConvertationEventText()
	 * @generated
	 */
	EOperation getConversionModule__GetAfterConvertationEventText();

	/**
	 * Returns the meta object for the '{@link ru.capralow.dt.conversion.plugin.core.cm.model.ConversionModule#getBeforeFillingEventText() <em>Get Before Filling Event Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Before Filling Event Text</em>' operation.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.ConversionModule#getBeforeFillingEventText()
	 * @generated
	 */
	EOperation getConversionModule__GetBeforeFillingEventText();

	/**
	 * Returns the meta object for the '{@link ru.capralow.dt.conversion.plugin.core.cm.model.ConversionModule#getDataRule(java.lang.String) <em>Get Data Rule</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Data Rule</em>' operation.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.ConversionModule#getDataRule(java.lang.String)
	 * @generated
	 */
	EOperation getConversionModule__GetDataRule__String();

	/**
	 * Returns the meta object for the '{@link ru.capralow.dt.conversion.plugin.core.cm.model.ConversionModule#getSendingDataRules() <em>Get Sending Data Rules</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Sending Data Rules</em>' operation.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.ConversionModule#getSendingDataRules()
	 * @generated
	 */
	EOperation getConversionModule__GetSendingDataRules();

	/**
	 * Returns the meta object for the '{@link ru.capralow.dt.conversion.plugin.core.cm.model.ConversionModule#getSendingDataRules(ru.capralow.dt.conversion.plugin.core.cm.model.CmSubsystem) <em>Get Sending Data Rules</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Sending Data Rules</em>' operation.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.ConversionModule#getSendingDataRules(ru.capralow.dt.conversion.plugin.core.cm.model.CmSubsystem)
	 * @generated
	 */
	EOperation getConversionModule__GetSendingDataRules__CmSubsystem();

	/**
	 * Returns the meta object for the '{@link ru.capralow.dt.conversion.plugin.core.cm.model.ConversionModule#getReceivingDataRules() <em>Get Receiving Data Rules</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Receiving Data Rules</em>' operation.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.ConversionModule#getReceivingDataRules()
	 * @generated
	 */
	EOperation getConversionModule__GetReceivingDataRules();

	/**
	 * Returns the meta object for the '{@link ru.capralow.dt.conversion.plugin.core.cm.model.ConversionModule#getReceivingDataRules(ru.capralow.dt.conversion.plugin.core.cm.model.CmSubsystem) <em>Get Receiving Data Rules</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Receiving Data Rules</em>' operation.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.ConversionModule#getReceivingDataRules(ru.capralow.dt.conversion.plugin.core.cm.model.CmSubsystem)
	 * @generated
	 */
	EOperation getConversionModule__GetReceivingDataRules__CmSubsystem();

	/**
	 * Returns the meta object for the '{@link ru.capralow.dt.conversion.plugin.core.cm.model.ConversionModule#getObjectRule(java.lang.String) <em>Get Object Rule</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Object Rule</em>' operation.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.ConversionModule#getObjectRule(java.lang.String)
	 * @generated
	 */
	EOperation getConversionModule__GetObjectRule__String();

	/**
	 * Returns the meta object for the '{@link ru.capralow.dt.conversion.plugin.core.cm.model.ConversionModule#getSendingObjectRules() <em>Get Sending Object Rules</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Sending Object Rules</em>' operation.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.ConversionModule#getSendingObjectRules()
	 * @generated
	 */
	EOperation getConversionModule__GetSendingObjectRules();

	/**
	 * Returns the meta object for the '{@link ru.capralow.dt.conversion.plugin.core.cm.model.ConversionModule#getSendingObjectRules(ru.capralow.dt.conversion.plugin.core.cm.model.CmSubsystem) <em>Get Sending Object Rules</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Sending Object Rules</em>' operation.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.ConversionModule#getSendingObjectRules(ru.capralow.dt.conversion.plugin.core.cm.model.CmSubsystem)
	 * @generated
	 */
	EOperation getConversionModule__GetSendingObjectRules__CmSubsystem();

	/**
	 * Returns the meta object for the '{@link ru.capralow.dt.conversion.plugin.core.cm.model.ConversionModule#getReceivingObjectRules() <em>Get Receiving Object Rules</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Receiving Object Rules</em>' operation.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.ConversionModule#getReceivingObjectRules()
	 * @generated
	 */
	EOperation getConversionModule__GetReceivingObjectRules();

	/**
	 * Returns the meta object for the '{@link ru.capralow.dt.conversion.plugin.core.cm.model.ConversionModule#getReceivingObjectRules(ru.capralow.dt.conversion.plugin.core.cm.model.CmSubsystem) <em>Get Receiving Object Rules</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Receiving Object Rules</em>' operation.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.ConversionModule#getReceivingObjectRules(ru.capralow.dt.conversion.plugin.core.cm.model.CmSubsystem)
	 * @generated
	 */
	EOperation getConversionModule__GetReceivingObjectRules__CmSubsystem();

	/**
	 * Returns the meta object for the '{@link ru.capralow.dt.conversion.plugin.core.cm.model.ConversionModule#getAlgorithm(java.lang.String) <em>Get Algorithm</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Algorithm</em>' operation.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.ConversionModule#getAlgorithm(java.lang.String)
	 * @generated
	 */
	EOperation getConversionModule__GetAlgorithm__String();

	/**
	 * Returns the meta object for the '{@link ru.capralow.dt.conversion.plugin.core.cm.model.ConversionModule#getAllAlgorithmsText(java.lang.String) <em>Get All Algorithms Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Algorithms Text</em>' operation.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.ConversionModule#getAllAlgorithmsText(java.lang.String)
	 * @generated
	 */
	EOperation getConversionModule__GetAllAlgorithmsText__String();

	/**
	 * Returns the meta object for class '{@link ru.capralow.dt.conversion.plugin.core.cm.model.CmObject <em>Cm Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cm Object</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.CmObject
	 * @generated
	 */
	EClass getCmObject();

	/**
	 * Returns the meta object for the attribute '{@link ru.capralow.dt.conversion.plugin.core.cm.model.CmObject#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.CmObject#getName()
	 * @see #getCmObject()
	 * @generated
	 */
	EAttribute getCmObject_Name();

	/**
	 * Returns the meta object for the reference '{@link ru.capralow.dt.conversion.plugin.core.cm.model.CmObject#getConfigurationObject <em>Configuration Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Configuration Object</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.CmObject#getConfigurationObject()
	 * @see #getCmObject()
	 * @generated
	 */
	EReference getCmObject_ConfigurationObject();

	/**
	 * Returns the meta object for the attribute '{@link ru.capralow.dt.conversion.plugin.core.cm.model.CmObject#getConfigurationObjectName <em>Configuration Object Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Configuration Object Name</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.CmObject#getConfigurationObjectName()
	 * @see #getCmObject()
	 * @generated
	 */
	EAttribute getCmObject_ConfigurationObjectName();

	/**
	 * Returns the meta object for the attribute '{@link ru.capralow.dt.conversion.plugin.core.cm.model.CmObject#getConfigurationObjectFormattedName <em>Configuration Object Formatted Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Configuration Object Formatted Name</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.CmObject#getConfigurationObjectFormattedName()
	 * @see #getCmObject()
	 * @generated
	 */
	EAttribute getCmObject_ConfigurationObjectFormattedName();

	/**
	 * Returns the meta object for the attribute '{@link ru.capralow.dt.conversion.plugin.core.cm.model.CmObject#getFormatObject <em>Format Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Format Object</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.CmObject#getFormatObject()
	 * @see #getCmObject()
	 * @generated
	 */
	EAttribute getCmObject_FormatObject();

	/**
	 * Returns the meta object for the attribute '{@link ru.capralow.dt.conversion.plugin.core.cm.model.CmObject#getForSending <em>For Sending</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>For Sending</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.CmObject#getForSending()
	 * @see #getCmObject()
	 * @generated
	 */
	EAttribute getCmObject_ForSending();

	/**
	 * Returns the meta object for the attribute '{@link ru.capralow.dt.conversion.plugin.core.cm.model.CmObject#getForReceiving <em>For Receiving</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>For Receiving</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.CmObject#getForReceiving()
	 * @see #getCmObject()
	 * @generated
	 */
	EAttribute getCmObject_ForReceiving();

	/**
	 * Returns the meta object for class '{@link ru.capralow.dt.conversion.plugin.core.cm.model.CmDataRule <em>Cm Data Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cm Data Rule</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.CmDataRule
	 * @generated
	 */
	EClass getCmDataRule();

	/**
	 * Returns the meta object for the attribute '{@link ru.capralow.dt.conversion.plugin.core.cm.model.CmDataRule#getIsDisabled <em>Is Disabled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Disabled</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.CmDataRule#getIsDisabled()
	 * @see #getCmDataRule()
	 * @generated
	 */
	EAttribute getCmDataRule_IsDisabled();

	/**
	 * Returns the meta object for the attribute '{@link ru.capralow.dt.conversion.plugin.core.cm.model.CmDataRule#getSelectionVariant <em>Selection Variant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Selection Variant</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.CmDataRule#getSelectionVariant()
	 * @see #getCmDataRule()
	 * @generated
	 */
	EAttribute getCmDataRule_SelectionVariant();

	/**
	 * Returns the meta object for the attribute '{@link ru.capralow.dt.conversion.plugin.core.cm.model.CmDataRule#getOnProcessingEvent <em>On Processing Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>On Processing Event</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.CmDataRule#getOnProcessingEvent()
	 * @see #getCmDataRule()
	 * @generated
	 */
	EAttribute getCmDataRule_OnProcessingEvent();

	/**
	 * Returns the meta object for the attribute '{@link ru.capralow.dt.conversion.plugin.core.cm.model.CmDataRule#getOnProcessingEventPrefix <em>On Processing Event Prefix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>On Processing Event Prefix</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.CmDataRule#getOnProcessingEventPrefix()
	 * @see #getCmDataRule()
	 * @generated
	 */
	EAttribute getCmDataRule_OnProcessingEventPrefix();

	/**
	 * Returns the meta object for the attribute '{@link ru.capralow.dt.conversion.plugin.core.cm.model.CmDataRule#getOnProcessingEventSuffix <em>On Processing Event Suffix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>On Processing Event Suffix</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.CmDataRule#getOnProcessingEventSuffix()
	 * @see #getCmDataRule()
	 * @generated
	 */
	EAttribute getCmDataRule_OnProcessingEventSuffix();

	/**
	 * Returns the meta object for the attribute '{@link ru.capralow.dt.conversion.plugin.core.cm.model.CmDataRule#getDataSelectionEvent <em>Data Selection Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Selection Event</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.CmDataRule#getDataSelectionEvent()
	 * @see #getCmDataRule()
	 * @generated
	 */
	EAttribute getCmDataRule_DataSelectionEvent();

	/**
	 * Returns the meta object for the attribute '{@link ru.capralow.dt.conversion.plugin.core.cm.model.CmDataRule#getDataSelectionEventPrefix <em>Data Selection Event Prefix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Selection Event Prefix</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.CmDataRule#getDataSelectionEventPrefix()
	 * @see #getCmDataRule()
	 * @generated
	 */
	EAttribute getCmDataRule_DataSelectionEventPrefix();

	/**
	 * Returns the meta object for the attribute '{@link ru.capralow.dt.conversion.plugin.core.cm.model.CmDataRule#getDataSelectionEventSuffix <em>Data Selection Event Suffix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Selection Event Suffix</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.CmDataRule#getDataSelectionEventSuffix()
	 * @see #getCmDataRule()
	 * @generated
	 */
	EAttribute getCmDataRule_DataSelectionEventSuffix();

	/**
	 * Returns the meta object for the attribute '{@link ru.capralow.dt.conversion.plugin.core.cm.model.CmDataRule#getIsDataCleaning <em>Is Data Cleaning</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Data Cleaning</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.CmDataRule#getIsDataCleaning()
	 * @see #getCmDataRule()
	 * @generated
	 */
	EAttribute getCmDataRule_IsDataCleaning();

	/**
	 * Returns the meta object for the reference list '{@link ru.capralow.dt.conversion.plugin.core.cm.model.CmDataRule#getObjectRules <em>Object Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Object Rules</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.CmDataRule#getObjectRules()
	 * @see #getCmDataRule()
	 * @generated
	 */
	EReference getCmDataRule_ObjectRules();

	/**
	 * Returns the meta object for the reference list '{@link ru.capralow.dt.conversion.plugin.core.cm.model.CmDataRule#getSubsystems <em>Subsystems</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Subsystems</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.CmDataRule#getSubsystems()
	 * @see #getCmDataRule()
	 * @generated
	 */
	EReference getCmDataRule_Subsystems();

	/**
	 * Returns the meta object for the reference '{@link ru.capralow.dt.conversion.plugin.core.cm.model.CmDataRule#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Group</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.CmDataRule#getGroup()
	 * @see #getCmDataRule()
	 * @generated
	 */
	EReference getCmDataRule_Group();

	/**
	 * Returns the meta object for the '{@link ru.capralow.dt.conversion.plugin.core.cm.model.CmDataRule#getOnProcessingEventText() <em>Get On Processing Event Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get On Processing Event Text</em>' operation.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.CmDataRule#getOnProcessingEventText()
	 * @generated
	 */
	EOperation getCmDataRule__GetOnProcessingEventText();

	/**
	 * Returns the meta object for the '{@link ru.capralow.dt.conversion.plugin.core.cm.model.CmDataRule#getOnProcessingEventDeclaration() <em>Get On Processing Event Declaration</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get On Processing Event Declaration</em>' operation.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.CmDataRule#getOnProcessingEventDeclaration()
	 * @generated
	 */
	EOperation getCmDataRule__GetOnProcessingEventDeclaration();

	/**
	 * Returns the meta object for the '{@link ru.capralow.dt.conversion.plugin.core.cm.model.CmDataRule#getDataSelectionEventText() <em>Get Data Selection Event Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Data Selection Event Text</em>' operation.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.CmDataRule#getDataSelectionEventText()
	 * @generated
	 */
	EOperation getCmDataRule__GetDataSelectionEventText();

	/**
	 * Returns the meta object for the '{@link ru.capralow.dt.conversion.plugin.core.cm.model.CmDataRule#getDataSelectionEventDeclaration() <em>Get Data Selection Event Declaration</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Data Selection Event Declaration</em>' operation.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.CmDataRule#getDataSelectionEventDeclaration()
	 * @generated
	 */
	EOperation getCmDataRule__GetDataSelectionEventDeclaration();

	/**
	 * Returns the meta object for the '{@link ru.capralow.dt.conversion.plugin.core.cm.model.CmDataRule#getDataCleaningDeclaration() <em>Get Data Cleaning Declaration</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Data Cleaning Declaration</em>' operation.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.CmDataRule#getDataCleaningDeclaration()
	 * @generated
	 */
	EOperation getCmDataRule__GetDataCleaningDeclaration();

	/**
	 * Returns the meta object for the '{@link ru.capralow.dt.conversion.plugin.core.cm.model.CmDataRule#includedInSubsystem(ru.capralow.dt.conversion.plugin.core.cm.model.CmSubsystem) <em>Included In Subsystem</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Included In Subsystem</em>' operation.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.CmDataRule#includedInSubsystem(ru.capralow.dt.conversion.plugin.core.cm.model.CmSubsystem)
	 * @generated
	 */
	EOperation getCmDataRule__IncludedInSubsystem__CmSubsystem();

	/**
	 * Returns the meta object for the '{@link ru.capralow.dt.conversion.plugin.core.cm.model.CmDataRule#toString() <em>To String</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>To String</em>' operation.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.CmDataRule#toString()
	 * @generated
	 */
	EOperation getCmDataRule__ToString();

	/**
	 * Returns the meta object for class '{@link ru.capralow.dt.conversion.plugin.core.cm.model.CmObjectRule <em>Cm Object Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cm Object Rule</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.CmObjectRule
	 * @generated
	 */
	EClass getCmObjectRule();

	/**
	 * Returns the meta object for the attribute '{@link ru.capralow.dt.conversion.plugin.core.cm.model.CmObjectRule#getIsDisabled <em>Is Disabled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Disabled</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.CmObjectRule#getIsDisabled()
	 * @see #getCmObjectRule()
	 * @generated
	 */
	EAttribute getCmObjectRule_IsDisabled();

	/**
	 * Returns the meta object for the attribute '{@link ru.capralow.dt.conversion.plugin.core.cm.model.CmObjectRule#getForGroup <em>For Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>For Group</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.CmObjectRule#getForGroup()
	 * @see #getCmObjectRule()
	 * @generated
	 */
	EAttribute getCmObjectRule_ForGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link ru.capralow.dt.conversion.plugin.core.cm.model.CmObjectRule#getAttributeRules <em>Attribute Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attribute Rules</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.CmObjectRule#getAttributeRules()
	 * @see #getCmObjectRule()
	 * @generated
	 */
	EReference getCmObjectRule_AttributeRules();

	/**
	 * Returns the meta object for the attribute '{@link ru.capralow.dt.conversion.plugin.core.cm.model.CmObjectRule#getOnSendingEvent <em>On Sending Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>On Sending Event</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.CmObjectRule#getOnSendingEvent()
	 * @see #getCmObjectRule()
	 * @generated
	 */
	EAttribute getCmObjectRule_OnSendingEvent();

	/**
	 * Returns the meta object for the attribute '{@link ru.capralow.dt.conversion.plugin.core.cm.model.CmObjectRule#getOnSendingEventPrefix <em>On Sending Event Prefix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>On Sending Event Prefix</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.CmObjectRule#getOnSendingEventPrefix()
	 * @see #getCmObjectRule()
	 * @generated
	 */
	EAttribute getCmObjectRule_OnSendingEventPrefix();

	/**
	 * Returns the meta object for the attribute '{@link ru.capralow.dt.conversion.plugin.core.cm.model.CmObjectRule#getOnSendingEventSuffix <em>On Sending Event Suffix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>On Sending Event Suffix</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.CmObjectRule#getOnSendingEventSuffix()
	 * @see #getCmObjectRule()
	 * @generated
	 */
	EAttribute getCmObjectRule_OnSendingEventSuffix();

	/**
	 * Returns the meta object for the attribute '{@link ru.capralow.dt.conversion.plugin.core.cm.model.CmObjectRule#getBeforeReceivingEvent <em>Before Receiving Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Before Receiving Event</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.CmObjectRule#getBeforeReceivingEvent()
	 * @see #getCmObjectRule()
	 * @generated
	 */
	EAttribute getCmObjectRule_BeforeReceivingEvent();

	/**
	 * Returns the meta object for the attribute '{@link ru.capralow.dt.conversion.plugin.core.cm.model.CmObjectRule#getBeforeReceivingEventPrefix <em>Before Receiving Event Prefix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Before Receiving Event Prefix</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.CmObjectRule#getBeforeReceivingEventPrefix()
	 * @see #getCmObjectRule()
	 * @generated
	 */
	EAttribute getCmObjectRule_BeforeReceivingEventPrefix();

	/**
	 * Returns the meta object for the attribute '{@link ru.capralow.dt.conversion.plugin.core.cm.model.CmObjectRule#getBeforeReceivingEventSuffix <em>Before Receiving Event Suffix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Before Receiving Event Suffix</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.CmObjectRule#getBeforeReceivingEventSuffix()
	 * @see #getCmObjectRule()
	 * @generated
	 */
	EAttribute getCmObjectRule_BeforeReceivingEventSuffix();

	/**
	 * Returns the meta object for the attribute '{@link ru.capralow.dt.conversion.plugin.core.cm.model.CmObjectRule#getOnReceivingEvent <em>On Receiving Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>On Receiving Event</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.CmObjectRule#getOnReceivingEvent()
	 * @see #getCmObjectRule()
	 * @generated
	 */
	EAttribute getCmObjectRule_OnReceivingEvent();

	/**
	 * Returns the meta object for the attribute '{@link ru.capralow.dt.conversion.plugin.core.cm.model.CmObjectRule#getOnReceivingEventPrefix <em>On Receiving Event Prefix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>On Receiving Event Prefix</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.CmObjectRule#getOnReceivingEventPrefix()
	 * @see #getCmObjectRule()
	 * @generated
	 */
	EAttribute getCmObjectRule_OnReceivingEventPrefix();

	/**
	 * Returns the meta object for the attribute '{@link ru.capralow.dt.conversion.plugin.core.cm.model.CmObjectRule#getOnReceivingEventSuffix <em>On Receiving Event Suffix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>On Receiving Event Suffix</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.CmObjectRule#getOnReceivingEventSuffix()
	 * @see #getCmObjectRule()
	 * @generated
	 */
	EAttribute getCmObjectRule_OnReceivingEventSuffix();

	/**
	 * Returns the meta object for the reference '{@link ru.capralow.dt.conversion.plugin.core.cm.model.CmObjectRule#getAfterReceivingAlgorithm <em>After Receiving Algorithm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>After Receiving Algorithm</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.CmObjectRule#getAfterReceivingAlgorithm()
	 * @see #getCmObjectRule()
	 * @generated
	 */
	EReference getCmObjectRule_AfterReceivingAlgorithm();

	/**
	 * Returns the meta object for the attribute '{@link ru.capralow.dt.conversion.plugin.core.cm.model.CmObjectRule#getIdentificationVariant <em>Identification Variant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identification Variant</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.CmObjectRule#getIdentificationVariant()
	 * @see #getCmObjectRule()
	 * @generated
	 */
	EAttribute getCmObjectRule_IdentificationVariant();

	/**
	 * Returns the meta object for the attribute list '{@link ru.capralow.dt.conversion.plugin.core.cm.model.CmObjectRule#getIdentificationFields <em>Identification Fields</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Identification Fields</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.CmObjectRule#getIdentificationFields()
	 * @see #getCmObjectRule()
	 * @generated
	 */
	EAttribute getCmObjectRule_IdentificationFields();

	/**
	 * Returns the meta object for the reference list '{@link ru.capralow.dt.conversion.plugin.core.cm.model.CmObjectRule#getSubsystems <em>Subsystems</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Subsystems</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.CmObjectRule#getSubsystems()
	 * @see #getCmObjectRule()
	 * @generated
	 */
	EReference getCmObjectRule_Subsystems();

	/**
	 * Returns the meta object for the '{@link ru.capralow.dt.conversion.plugin.core.cm.model.CmObjectRule#getForGroupDeclaration() <em>Get For Group Declaration</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get For Group Declaration</em>' operation.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.CmObjectRule#getForGroupDeclaration()
	 * @generated
	 */
	EOperation getCmObjectRule__GetForGroupDeclaration();

	/**
	 * Returns the meta object for the '{@link ru.capralow.dt.conversion.plugin.core.cm.model.CmObjectRule#getOnSendingEventText() <em>Get On Sending Event Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get On Sending Event Text</em>' operation.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.CmObjectRule#getOnSendingEventText()
	 * @generated
	 */
	EOperation getCmObjectRule__GetOnSendingEventText();

	/**
	 * Returns the meta object for the '{@link ru.capralow.dt.conversion.plugin.core.cm.model.CmObjectRule#getOnSendingEventDeclaration() <em>Get On Sending Event Declaration</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get On Sending Event Declaration</em>' operation.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.CmObjectRule#getOnSendingEventDeclaration()
	 * @generated
	 */
	EOperation getCmObjectRule__GetOnSendingEventDeclaration();

	/**
	 * Returns the meta object for the '{@link ru.capralow.dt.conversion.plugin.core.cm.model.CmObjectRule#getBeforeReceivingEventText() <em>Get Before Receiving Event Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Before Receiving Event Text</em>' operation.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.CmObjectRule#getBeforeReceivingEventText()
	 * @generated
	 */
	EOperation getCmObjectRule__GetBeforeReceivingEventText();

	/**
	 * Returns the meta object for the '{@link ru.capralow.dt.conversion.plugin.core.cm.model.CmObjectRule#getBeforeReceivingEventDeclaration() <em>Get Before Receiving Event Declaration</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Before Receiving Event Declaration</em>' operation.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.CmObjectRule#getBeforeReceivingEventDeclaration()
	 * @generated
	 */
	EOperation getCmObjectRule__GetBeforeReceivingEventDeclaration();

	/**
	 * Returns the meta object for the '{@link ru.capralow.dt.conversion.plugin.core.cm.model.CmObjectRule#getOnReceivingEventText() <em>Get On Receiving Event Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get On Receiving Event Text</em>' operation.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.CmObjectRule#getOnReceivingEventText()
	 * @generated
	 */
	EOperation getCmObjectRule__GetOnReceivingEventText();

	/**
	 * Returns the meta object for the '{@link ru.capralow.dt.conversion.plugin.core.cm.model.CmObjectRule#getOnReceivingEventDeclaration() <em>Get On Receiving Event Declaration</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get On Receiving Event Declaration</em>' operation.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.CmObjectRule#getOnReceivingEventDeclaration()
	 * @generated
	 */
	EOperation getCmObjectRule__GetOnReceivingEventDeclaration();

	/**
	 * Returns the meta object for the '{@link ru.capralow.dt.conversion.plugin.core.cm.model.CmObjectRule#getAfterReceivingAlgorithmDeclaration() <em>Get After Receiving Algorithm Declaration</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get After Receiving Algorithm Declaration</em>' operation.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.CmObjectRule#getAfterReceivingAlgorithmDeclaration()
	 * @generated
	 */
	EOperation getCmObjectRule__GetAfterReceivingAlgorithmDeclaration();

	/**
	 * Returns the meta object for the '{@link ru.capralow.dt.conversion.plugin.core.cm.model.CmObjectRule#includedInSubsystem(ru.capralow.dt.conversion.plugin.core.cm.model.CmSubsystem) <em>Included In Subsystem</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Included In Subsystem</em>' operation.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.CmObjectRule#includedInSubsystem(ru.capralow.dt.conversion.plugin.core.cm.model.CmSubsystem)
	 * @generated
	 */
	EOperation getCmObjectRule__IncludedInSubsystem__CmSubsystem();

	/**
	 * Returns the meta object for the '{@link ru.capralow.dt.conversion.plugin.core.cm.model.CmObjectRule#toString() <em>To String</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>To String</em>' operation.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.CmObjectRule#toString()
	 * @generated
	 */
	EOperation getCmObjectRule__ToString();

	/**
	 * Returns the meta object for class '{@link ru.capralow.dt.conversion.plugin.core.cm.model.CmAttributeRule <em>Cm Attribute Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cm Attribute Rule</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.CmAttributeRule
	 * @generated
	 */
	EClass getCmAttributeRule();

	/**
	 * Returns the meta object for the attribute '{@link ru.capralow.dt.conversion.plugin.core.cm.model.CmAttributeRule#getConfigurationTabularSection <em>Configuration Tabular Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Configuration Tabular Section</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.CmAttributeRule#getConfigurationTabularSection()
	 * @see #getCmAttributeRule()
	 * @generated
	 */
	EAttribute getCmAttributeRule_ConfigurationTabularSection();

	/**
	 * Returns the meta object for the attribute '{@link ru.capralow.dt.conversion.plugin.core.cm.model.CmAttributeRule#getConfigurationAttribute <em>Configuration Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Configuration Attribute</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.CmAttributeRule#getConfigurationAttribute()
	 * @see #getCmAttributeRule()
	 * @generated
	 */
	EAttribute getCmAttributeRule_ConfigurationAttribute();

	/**
	 * Returns the meta object for the attribute '{@link ru.capralow.dt.conversion.plugin.core.cm.model.CmAttributeRule#getFormatTabularSection <em>Format Tabular Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Format Tabular Section</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.CmAttributeRule#getFormatTabularSection()
	 * @see #getCmAttributeRule()
	 * @generated
	 */
	EAttribute getCmAttributeRule_FormatTabularSection();

	/**
	 * Returns the meta object for the attribute '{@link ru.capralow.dt.conversion.plugin.core.cm.model.CmAttributeRule#getFormatAttribute <em>Format Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Format Attribute</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.CmAttributeRule#getFormatAttribute()
	 * @see #getCmAttributeRule()
	 * @generated
	 */
	EAttribute getCmAttributeRule_FormatAttribute();

	/**
	 * Returns the meta object for the reference '{@link ru.capralow.dt.conversion.plugin.core.cm.model.CmAttributeRule#getObjectRule <em>Object Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Object Rule</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.CmAttributeRule#getObjectRule()
	 * @see #getCmAttributeRule()
	 * @generated
	 */
	EReference getCmAttributeRule_ObjectRule();

	/**
	 * Returns the meta object for the attribute '{@link ru.capralow.dt.conversion.plugin.core.cm.model.CmAttributeRule#getIsCustomRule <em>Is Custom Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Custom Rule</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.CmAttributeRule#getIsCustomRule()
	 * @see #getCmAttributeRule()
	 * @generated
	 */
	EAttribute getCmAttributeRule_IsCustomRule();

	/**
	 * Returns the meta object for the '{@link ru.capralow.dt.conversion.plugin.core.cm.model.CmAttributeRule#getConfigurationAttributeFullName() <em>Get Configuration Attribute Full Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Configuration Attribute Full Name</em>' operation.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.CmAttributeRule#getConfigurationAttributeFullName()
	 * @generated
	 */
	EOperation getCmAttributeRule__GetConfigurationAttributeFullName();

	/**
	 * Returns the meta object for the '{@link ru.capralow.dt.conversion.plugin.core.cm.model.CmAttributeRule#getFormatAttributeFullName() <em>Get Format Attribute Full Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Format Attribute Full Name</em>' operation.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.CmAttributeRule#getFormatAttributeFullName()
	 * @generated
	 */
	EOperation getCmAttributeRule__GetFormatAttributeFullName();

	/**
	 * Returns the meta object for the '{@link ru.capralow.dt.conversion.plugin.core.cm.model.CmAttributeRule#toString() <em>To String</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>To String</em>' operation.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.CmAttributeRule#toString()
	 * @generated
	 */
	EOperation getCmAttributeRule__ToString();

	/**
	 * Returns the meta object for class '{@link ru.capralow.dt.conversion.plugin.core.cm.model.CmPredefined <em>Cm Predefined</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cm Predefined</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.CmPredefined
	 * @generated
	 */
	EClass getCmPredefined();

	/**
	 * Returns the meta object for the containment reference list '{@link ru.capralow.dt.conversion.plugin.core.cm.model.CmPredefined#getPredefinedMaps <em>Predefined Maps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Predefined Maps</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.CmPredefined#getPredefinedMaps()
	 * @see #getCmPredefined()
	 * @generated
	 */
	EReference getCmPredefined_PredefinedMaps();

	/**
	 * Returns the meta object for the '{@link ru.capralow.dt.conversion.plugin.core.cm.model.CmPredefined#predefinedMapExists(java.lang.String, java.lang.String) <em>Predefined Map Exists</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Predefined Map Exists</em>' operation.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.CmPredefined#predefinedMapExists(java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getCmPredefined__PredefinedMapExists__String_String();

	/**
	 * Returns the meta object for the '{@link ru.capralow.dt.conversion.plugin.core.cm.model.CmPredefined#toString() <em>To String</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>To String</em>' operation.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.CmPredefined#toString()
	 * @generated
	 */
	EOperation getCmPredefined__ToString();

	/**
	 * Returns the meta object for class '{@link ru.capralow.dt.conversion.plugin.core.cm.model.CmPredefinedMap <em>Cm Predefined Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cm Predefined Map</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.CmPredefinedMap
	 * @generated
	 */
	EClass getCmPredefinedMap();

	/**
	 * Returns the meta object for the attribute '{@link ru.capralow.dt.conversion.plugin.core.cm.model.CmPredefinedMap#getConfigurationValue <em>Configuration Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Configuration Value</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.CmPredefinedMap#getConfigurationValue()
	 * @see #getCmPredefinedMap()
	 * @generated
	 */
	EAttribute getCmPredefinedMap_ConfigurationValue();

	/**
	 * Returns the meta object for the attribute '{@link ru.capralow.dt.conversion.plugin.core.cm.model.CmPredefinedMap#getFormatValue <em>Format Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Format Value</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.CmPredefinedMap#getFormatValue()
	 * @see #getCmPredefinedMap()
	 * @generated
	 */
	EAttribute getCmPredefinedMap_FormatValue();

	/**
	 * Returns the meta object for the '{@link ru.capralow.dt.conversion.plugin.core.cm.model.CmPredefinedMap#getConfigurationValueName() <em>Get Configuration Value Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Configuration Value Name</em>' operation.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.CmPredefinedMap#getConfigurationValueName()
	 * @generated
	 */
	EOperation getCmPredefinedMap__GetConfigurationValueName();

	/**
	 * Returns the meta object for the '{@link ru.capralow.dt.conversion.plugin.core.cm.model.CmPredefinedMap#getFormatValueName() <em>Get Format Value Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Format Value Name</em>' operation.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.CmPredefinedMap#getFormatValueName()
	 * @generated
	 */
	EOperation getCmPredefinedMap__GetFormatValueName();

	/**
	 * Returns the meta object for class '{@link ru.capralow.dt.conversion.plugin.core.cm.model.CmAlgorithm <em>Cm Algorithm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cm Algorithm</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.CmAlgorithm
	 * @generated
	 */
	EClass getCmAlgorithm();

	/**
	 * Returns the meta object for the attribute '{@link ru.capralow.dt.conversion.plugin.core.cm.model.CmAlgorithm#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.CmAlgorithm#getName()
	 * @see #getCmAlgorithm()
	 * @generated
	 */
	EAttribute getCmAlgorithm_Name();

	/**
	 * Returns the meta object for the attribute '{@link ru.capralow.dt.conversion.plugin.core.cm.model.CmAlgorithm#getMethodType <em>Method Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Method Type</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.CmAlgorithm#getMethodType()
	 * @see #getCmAlgorithm()
	 * @generated
	 */
	EAttribute getCmAlgorithm_MethodType();

	/**
	 * Returns the meta object for the attribute '{@link ru.capralow.dt.conversion.plugin.core.cm.model.CmAlgorithm#getParams <em>Params</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Params</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.CmAlgorithm#getParams()
	 * @see #getCmAlgorithm()
	 * @generated
	 */
	EAttribute getCmAlgorithm_Params();

	/**
	 * Returns the meta object for the attribute '{@link ru.capralow.dt.conversion.plugin.core.cm.model.CmAlgorithm#getIsExport <em>Is Export</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Export</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.CmAlgorithm#getIsExport()
	 * @see #getCmAlgorithm()
	 * @generated
	 */
	EAttribute getCmAlgorithm_IsExport();

	/**
	 * Returns the meta object for the attribute '{@link ru.capralow.dt.conversion.plugin.core.cm.model.CmAlgorithm#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Body</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.CmAlgorithm#getBody()
	 * @see #getCmAlgorithm()
	 * @generated
	 */
	EAttribute getCmAlgorithm_Body();

	/**
	 * Returns the meta object for the attribute '{@link ru.capralow.dt.conversion.plugin.core.cm.model.CmAlgorithm#getPrefix <em>Prefix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Prefix</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.CmAlgorithm#getPrefix()
	 * @see #getCmAlgorithm()
	 * @generated
	 */
	EAttribute getCmAlgorithm_Prefix();

	/**
	 * Returns the meta object for the attribute '{@link ru.capralow.dt.conversion.plugin.core.cm.model.CmAlgorithm#getSuffix <em>Suffix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Suffix</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.CmAlgorithm#getSuffix()
	 * @see #getCmAlgorithm()
	 * @generated
	 */
	EAttribute getCmAlgorithm_Suffix();

	/**
	 * Returns the meta object for the '{@link ru.capralow.dt.conversion.plugin.core.cm.model.CmAlgorithm#getAlgorithmText() <em>Get Algorithm Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Algorithm Text</em>' operation.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.CmAlgorithm#getAlgorithmText()
	 * @generated
	 */
	EOperation getCmAlgorithm__GetAlgorithmText();

	/**
	 * Returns the meta object for the '{@link ru.capralow.dt.conversion.plugin.core.cm.model.CmAlgorithm#toString() <em>To String</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>To String</em>' operation.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.CmAlgorithm#toString()
	 * @generated
	 */
	EOperation getCmAlgorithm__ToString();

	/**
	 * Returns the meta object for class '{@link ru.capralow.dt.conversion.plugin.core.cm.model.CmSubsystem <em>Cm Subsystem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cm Subsystem</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.CmSubsystem
	 * @generated
	 */
	EClass getCmSubsystem();

	/**
	 * Returns the meta object for the reference '{@link ru.capralow.dt.conversion.plugin.core.cm.model.CmSubsystem#getSubsystem <em>Subsystem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Subsystem</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.CmSubsystem#getSubsystem()
	 * @see #getCmSubsystem()
	 * @generated
	 */
	EReference getCmSubsystem_Subsystem();

	/**
	 * Returns the meta object for the attribute '{@link ru.capralow.dt.conversion.plugin.core.cm.model.CmSubsystem#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.CmSubsystem#getName()
	 * @see #getCmSubsystem()
	 * @generated
	 */
	EAttribute getCmSubsystem_Name();

	/**
	 * Returns the meta object for the attribute '{@link ru.capralow.dt.conversion.plugin.core.cm.model.CmSubsystem#getSpecialSubsystemType <em>Special Subsystem Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Special Subsystem Type</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.CmSubsystem#getSpecialSubsystemType()
	 * @see #getCmSubsystem()
	 * @generated
	 */
	EAttribute getCmSubsystem_SpecialSubsystemType();

	/**
	 * Returns the meta object for class '{@link ru.capralow.dt.conversion.plugin.core.cm.model.CmGroup <em>Cm Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cm Group</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.CmGroup
	 * @generated
	 */
	EClass getCmGroup();

	/**
	 * Returns the meta object for the attribute '{@link ru.capralow.dt.conversion.plugin.core.cm.model.CmGroup#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.CmGroup#getName()
	 * @see #getCmGroup()
	 * @generated
	 */
	EAttribute getCmGroup_Name();

	/**
	 * Returns the meta object for enum '{@link ru.capralow.dt.conversion.plugin.core.cm.model.CmSelectionVariant <em>Cm Selection Variant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Cm Selection Variant</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.CmSelectionVariant
	 * @generated
	 */
	EEnum getCmSelectionVariant();

	/**
	 * Returns the meta object for enum '{@link ru.capralow.dt.conversion.plugin.core.cm.model.CmIdentificationVariant <em>Cm Identification Variant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Cm Identification Variant</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.CmIdentificationVariant
	 * @generated
	 */
	EEnum getCmIdentificationVariant();

	/**
	 * Returns the meta object for enum '{@link ru.capralow.dt.conversion.plugin.core.cm.model.CmMethodType <em>Cm Method Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Cm Method Type</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.CmMethodType
	 * @generated
	 */
	EEnum getCmMethodType();

	/**
	 * Returns the meta object for enum '{@link ru.capralow.dt.conversion.plugin.core.cm.model.CmSpecialSubsystemType <em>Cm Special Subsystem Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Cm Special Subsystem Type</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.CmSpecialSubsystemType
	 * @generated
	 */
	EEnum getCmSpecialSubsystemType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	cmFactory getcmFactory();

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
		 * The meta object literal for the '{@link ru.capralow.dt.conversion.plugin.core.cm.model.impl.ConversionModuleImpl <em>Conversion Module</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ru.capralow.dt.conversion.plugin.core.cm.model.impl.ConversionModuleImpl
		 * @see ru.capralow.dt.conversion.plugin.core.cm.model.impl.cmPackageImpl#getConversionModule()
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
		 * The meta object literal for the '<em><b>Subsystems</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONVERSION_MODULE__SUBSYSTEMS = eINSTANCE.getConversionModule_Subsystems();

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
		 * The meta object literal for the '<em><b>Before Convertation Event Prefix</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONVERSION_MODULE__BEFORE_CONVERTATION_EVENT_PREFIX = eINSTANCE.getConversionModule_BeforeConvertationEventPrefix();

		/**
		 * The meta object literal for the '<em><b>Before Convertation Event Suffix</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONVERSION_MODULE__BEFORE_CONVERTATION_EVENT_SUFFIX = eINSTANCE.getConversionModule_BeforeConvertationEventSuffix();

		/**
		 * The meta object literal for the '<em><b>After Convertation Event</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONVERSION_MODULE__AFTER_CONVERTATION_EVENT = eINSTANCE.getConversionModule_AfterConvertationEvent();

		/**
		 * The meta object literal for the '<em><b>After Convertation Event Prefix</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONVERSION_MODULE__AFTER_CONVERTATION_EVENT_PREFIX = eINSTANCE.getConversionModule_AfterConvertationEventPrefix();

		/**
		 * The meta object literal for the '<em><b>After Convertation Event Suffix</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONVERSION_MODULE__AFTER_CONVERTATION_EVENT_SUFFIX = eINSTANCE.getConversionModule_AfterConvertationEventSuffix();

		/**
		 * The meta object literal for the '<em><b>Before Filling Event</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONVERSION_MODULE__BEFORE_FILLING_EVENT = eINSTANCE.getConversionModule_BeforeFillingEvent();

		/**
		 * The meta object literal for the '<em><b>Before Filling Event Prefix</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONVERSION_MODULE__BEFORE_FILLING_EVENT_PREFIX = eINSTANCE.getConversionModule_BeforeFillingEventPrefix();

		/**
		 * The meta object literal for the '<em><b>Before Filling Event Suffix</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONVERSION_MODULE__BEFORE_FILLING_EVENT_SUFFIX = eINSTANCE.getConversionModule_BeforeFillingEventSuffix();

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
		 * The meta object literal for the '<em><b>Predefineds</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONVERSION_MODULE__PREDEFINEDS = eINSTANCE.getConversionModule_Predefineds();

		/**
		 * The meta object literal for the '<em><b>Algorithms</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONVERSION_MODULE__ALGORITHMS = eINSTANCE.getConversionModule_Algorithms();

		/**
		 * The meta object literal for the '<em><b>Get Subsystem</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONVERSION_MODULE___GET_SUBSYSTEM__SUBSYSTEM = eINSTANCE.getConversionModule__GetSubsystem__Subsystem();

		/**
		 * The meta object literal for the '<em><b>Get Before Convertation Event Text</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONVERSION_MODULE___GET_BEFORE_CONVERTATION_EVENT_TEXT = eINSTANCE.getConversionModule__GetBeforeConvertationEventText();

		/**
		 * The meta object literal for the '<em><b>Get After Convertation Event Text</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONVERSION_MODULE___GET_AFTER_CONVERTATION_EVENT_TEXT = eINSTANCE.getConversionModule__GetAfterConvertationEventText();

		/**
		 * The meta object literal for the '<em><b>Get Before Filling Event Text</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONVERSION_MODULE___GET_BEFORE_FILLING_EVENT_TEXT = eINSTANCE.getConversionModule__GetBeforeFillingEventText();

		/**
		 * The meta object literal for the '<em><b>Get Data Rule</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONVERSION_MODULE___GET_DATA_RULE__STRING = eINSTANCE.getConversionModule__GetDataRule__String();

		/**
		 * The meta object literal for the '<em><b>Get Sending Data Rules</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONVERSION_MODULE___GET_SENDING_DATA_RULES = eINSTANCE.getConversionModule__GetSendingDataRules();

		/**
		 * The meta object literal for the '<em><b>Get Sending Data Rules</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONVERSION_MODULE___GET_SENDING_DATA_RULES__CMSUBSYSTEM = eINSTANCE.getConversionModule__GetSendingDataRules__CmSubsystem();

		/**
		 * The meta object literal for the '<em><b>Get Receiving Data Rules</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONVERSION_MODULE___GET_RECEIVING_DATA_RULES = eINSTANCE.getConversionModule__GetReceivingDataRules();

		/**
		 * The meta object literal for the '<em><b>Get Receiving Data Rules</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONVERSION_MODULE___GET_RECEIVING_DATA_RULES__CMSUBSYSTEM = eINSTANCE.getConversionModule__GetReceivingDataRules__CmSubsystem();

		/**
		 * The meta object literal for the '<em><b>Get Object Rule</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONVERSION_MODULE___GET_OBJECT_RULE__STRING = eINSTANCE.getConversionModule__GetObjectRule__String();

		/**
		 * The meta object literal for the '<em><b>Get Sending Object Rules</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONVERSION_MODULE___GET_SENDING_OBJECT_RULES = eINSTANCE.getConversionModule__GetSendingObjectRules();

		/**
		 * The meta object literal for the '<em><b>Get Sending Object Rules</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONVERSION_MODULE___GET_SENDING_OBJECT_RULES__CMSUBSYSTEM = eINSTANCE.getConversionModule__GetSendingObjectRules__CmSubsystem();

		/**
		 * The meta object literal for the '<em><b>Get Receiving Object Rules</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONVERSION_MODULE___GET_RECEIVING_OBJECT_RULES = eINSTANCE.getConversionModule__GetReceivingObjectRules();

		/**
		 * The meta object literal for the '<em><b>Get Receiving Object Rules</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONVERSION_MODULE___GET_RECEIVING_OBJECT_RULES__CMSUBSYSTEM = eINSTANCE.getConversionModule__GetReceivingObjectRules__CmSubsystem();

		/**
		 * The meta object literal for the '<em><b>Get Algorithm</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONVERSION_MODULE___GET_ALGORITHM__STRING = eINSTANCE.getConversionModule__GetAlgorithm__String();

		/**
		 * The meta object literal for the '<em><b>Get All Algorithms Text</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONVERSION_MODULE___GET_ALL_ALGORITHMS_TEXT__STRING = eINSTANCE.getConversionModule__GetAllAlgorithmsText__String();

		/**
		 * The meta object literal for the '{@link ru.capralow.dt.conversion.plugin.core.cm.model.impl.CmObjectImpl <em>Cm Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ru.capralow.dt.conversion.plugin.core.cm.model.impl.CmObjectImpl
		 * @see ru.capralow.dt.conversion.plugin.core.cm.model.impl.cmPackageImpl#getCmObject()
		 * @generated
		 */
		EClass CM_OBJECT = eINSTANCE.getCmObject();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CM_OBJECT__NAME = eINSTANCE.getCmObject_Name();

		/**
		 * The meta object literal for the '<em><b>Configuration Object</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CM_OBJECT__CONFIGURATION_OBJECT = eINSTANCE.getCmObject_ConfigurationObject();

		/**
		 * The meta object literal for the '<em><b>Configuration Object Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CM_OBJECT__CONFIGURATION_OBJECT_NAME = eINSTANCE.getCmObject_ConfigurationObjectName();

		/**
		 * The meta object literal for the '<em><b>Configuration Object Formatted Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CM_OBJECT__CONFIGURATION_OBJECT_FORMATTED_NAME = eINSTANCE.getCmObject_ConfigurationObjectFormattedName();

		/**
		 * The meta object literal for the '<em><b>Format Object</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CM_OBJECT__FORMAT_OBJECT = eINSTANCE.getCmObject_FormatObject();

		/**
		 * The meta object literal for the '<em><b>For Sending</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CM_OBJECT__FOR_SENDING = eINSTANCE.getCmObject_ForSending();

		/**
		 * The meta object literal for the '<em><b>For Receiving</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CM_OBJECT__FOR_RECEIVING = eINSTANCE.getCmObject_ForReceiving();

		/**
		 * The meta object literal for the '{@link ru.capralow.dt.conversion.plugin.core.cm.model.impl.CmDataRuleImpl <em>Cm Data Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ru.capralow.dt.conversion.plugin.core.cm.model.impl.CmDataRuleImpl
		 * @see ru.capralow.dt.conversion.plugin.core.cm.model.impl.cmPackageImpl#getCmDataRule()
		 * @generated
		 */
		EClass CM_DATA_RULE = eINSTANCE.getCmDataRule();

		/**
		 * The meta object literal for the '<em><b>Is Disabled</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CM_DATA_RULE__IS_DISABLED = eINSTANCE.getCmDataRule_IsDisabled();

		/**
		 * The meta object literal for the '<em><b>Selection Variant</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CM_DATA_RULE__SELECTION_VARIANT = eINSTANCE.getCmDataRule_SelectionVariant();

		/**
		 * The meta object literal for the '<em><b>On Processing Event</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CM_DATA_RULE__ON_PROCESSING_EVENT = eINSTANCE.getCmDataRule_OnProcessingEvent();

		/**
		 * The meta object literal for the '<em><b>On Processing Event Prefix</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CM_DATA_RULE__ON_PROCESSING_EVENT_PREFIX = eINSTANCE.getCmDataRule_OnProcessingEventPrefix();

		/**
		 * The meta object literal for the '<em><b>On Processing Event Suffix</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CM_DATA_RULE__ON_PROCESSING_EVENT_SUFFIX = eINSTANCE.getCmDataRule_OnProcessingEventSuffix();

		/**
		 * The meta object literal for the '<em><b>Data Selection Event</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CM_DATA_RULE__DATA_SELECTION_EVENT = eINSTANCE.getCmDataRule_DataSelectionEvent();

		/**
		 * The meta object literal for the '<em><b>Data Selection Event Prefix</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CM_DATA_RULE__DATA_SELECTION_EVENT_PREFIX = eINSTANCE.getCmDataRule_DataSelectionEventPrefix();

		/**
		 * The meta object literal for the '<em><b>Data Selection Event Suffix</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CM_DATA_RULE__DATA_SELECTION_EVENT_SUFFIX = eINSTANCE.getCmDataRule_DataSelectionEventSuffix();

		/**
		 * The meta object literal for the '<em><b>Is Data Cleaning</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CM_DATA_RULE__IS_DATA_CLEANING = eINSTANCE.getCmDataRule_IsDataCleaning();

		/**
		 * The meta object literal for the '<em><b>Object Rules</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CM_DATA_RULE__OBJECT_RULES = eINSTANCE.getCmDataRule_ObjectRules();

		/**
		 * The meta object literal for the '<em><b>Subsystems</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CM_DATA_RULE__SUBSYSTEMS = eINSTANCE.getCmDataRule_Subsystems();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CM_DATA_RULE__GROUP = eINSTANCE.getCmDataRule_Group();

		/**
		 * The meta object literal for the '<em><b>Get On Processing Event Text</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CM_DATA_RULE___GET_ON_PROCESSING_EVENT_TEXT = eINSTANCE.getCmDataRule__GetOnProcessingEventText();

		/**
		 * The meta object literal for the '<em><b>Get On Processing Event Declaration</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CM_DATA_RULE___GET_ON_PROCESSING_EVENT_DECLARATION = eINSTANCE.getCmDataRule__GetOnProcessingEventDeclaration();

		/**
		 * The meta object literal for the '<em><b>Get Data Selection Event Text</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CM_DATA_RULE___GET_DATA_SELECTION_EVENT_TEXT = eINSTANCE.getCmDataRule__GetDataSelectionEventText();

		/**
		 * The meta object literal for the '<em><b>Get Data Selection Event Declaration</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CM_DATA_RULE___GET_DATA_SELECTION_EVENT_DECLARATION = eINSTANCE.getCmDataRule__GetDataSelectionEventDeclaration();

		/**
		 * The meta object literal for the '<em><b>Get Data Cleaning Declaration</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CM_DATA_RULE___GET_DATA_CLEANING_DECLARATION = eINSTANCE.getCmDataRule__GetDataCleaningDeclaration();

		/**
		 * The meta object literal for the '<em><b>Included In Subsystem</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CM_DATA_RULE___INCLUDED_IN_SUBSYSTEM__CMSUBSYSTEM = eINSTANCE.getCmDataRule__IncludedInSubsystem__CmSubsystem();

		/**
		 * The meta object literal for the '<em><b>To String</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CM_DATA_RULE___TO_STRING = eINSTANCE.getCmDataRule__ToString();

		/**
		 * The meta object literal for the '{@link ru.capralow.dt.conversion.plugin.core.cm.model.impl.CmObjectRuleImpl <em>Cm Object Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ru.capralow.dt.conversion.plugin.core.cm.model.impl.CmObjectRuleImpl
		 * @see ru.capralow.dt.conversion.plugin.core.cm.model.impl.cmPackageImpl#getCmObjectRule()
		 * @generated
		 */
		EClass CM_OBJECT_RULE = eINSTANCE.getCmObjectRule();

		/**
		 * The meta object literal for the '<em><b>Is Disabled</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CM_OBJECT_RULE__IS_DISABLED = eINSTANCE.getCmObjectRule_IsDisabled();

		/**
		 * The meta object literal for the '<em><b>For Group</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CM_OBJECT_RULE__FOR_GROUP = eINSTANCE.getCmObjectRule_ForGroup();

		/**
		 * The meta object literal for the '<em><b>Attribute Rules</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CM_OBJECT_RULE__ATTRIBUTE_RULES = eINSTANCE.getCmObjectRule_AttributeRules();

		/**
		 * The meta object literal for the '<em><b>On Sending Event</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CM_OBJECT_RULE__ON_SENDING_EVENT = eINSTANCE.getCmObjectRule_OnSendingEvent();

		/**
		 * The meta object literal for the '<em><b>On Sending Event Prefix</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CM_OBJECT_RULE__ON_SENDING_EVENT_PREFIX = eINSTANCE.getCmObjectRule_OnSendingEventPrefix();

		/**
		 * The meta object literal for the '<em><b>On Sending Event Suffix</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CM_OBJECT_RULE__ON_SENDING_EVENT_SUFFIX = eINSTANCE.getCmObjectRule_OnSendingEventSuffix();

		/**
		 * The meta object literal for the '<em><b>Before Receiving Event</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CM_OBJECT_RULE__BEFORE_RECEIVING_EVENT = eINSTANCE.getCmObjectRule_BeforeReceivingEvent();

		/**
		 * The meta object literal for the '<em><b>Before Receiving Event Prefix</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CM_OBJECT_RULE__BEFORE_RECEIVING_EVENT_PREFIX = eINSTANCE.getCmObjectRule_BeforeReceivingEventPrefix();

		/**
		 * The meta object literal for the '<em><b>Before Receiving Event Suffix</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CM_OBJECT_RULE__BEFORE_RECEIVING_EVENT_SUFFIX = eINSTANCE.getCmObjectRule_BeforeReceivingEventSuffix();

		/**
		 * The meta object literal for the '<em><b>On Receiving Event</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CM_OBJECT_RULE__ON_RECEIVING_EVENT = eINSTANCE.getCmObjectRule_OnReceivingEvent();

		/**
		 * The meta object literal for the '<em><b>On Receiving Event Prefix</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CM_OBJECT_RULE__ON_RECEIVING_EVENT_PREFIX = eINSTANCE.getCmObjectRule_OnReceivingEventPrefix();

		/**
		 * The meta object literal for the '<em><b>On Receiving Event Suffix</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CM_OBJECT_RULE__ON_RECEIVING_EVENT_SUFFIX = eINSTANCE.getCmObjectRule_OnReceivingEventSuffix();

		/**
		 * The meta object literal for the '<em><b>After Receiving Algorithm</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CM_OBJECT_RULE__AFTER_RECEIVING_ALGORITHM = eINSTANCE.getCmObjectRule_AfterReceivingAlgorithm();

		/**
		 * The meta object literal for the '<em><b>Identification Variant</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CM_OBJECT_RULE__IDENTIFICATION_VARIANT = eINSTANCE.getCmObjectRule_IdentificationVariant();

		/**
		 * The meta object literal for the '<em><b>Identification Fields</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CM_OBJECT_RULE__IDENTIFICATION_FIELDS = eINSTANCE.getCmObjectRule_IdentificationFields();

		/**
		 * The meta object literal for the '<em><b>Subsystems</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CM_OBJECT_RULE__SUBSYSTEMS = eINSTANCE.getCmObjectRule_Subsystems();

		/**
		 * The meta object literal for the '<em><b>Get For Group Declaration</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CM_OBJECT_RULE___GET_FOR_GROUP_DECLARATION = eINSTANCE.getCmObjectRule__GetForGroupDeclaration();

		/**
		 * The meta object literal for the '<em><b>Get On Sending Event Text</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CM_OBJECT_RULE___GET_ON_SENDING_EVENT_TEXT = eINSTANCE.getCmObjectRule__GetOnSendingEventText();

		/**
		 * The meta object literal for the '<em><b>Get On Sending Event Declaration</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CM_OBJECT_RULE___GET_ON_SENDING_EVENT_DECLARATION = eINSTANCE.getCmObjectRule__GetOnSendingEventDeclaration();

		/**
		 * The meta object literal for the '<em><b>Get Before Receiving Event Text</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CM_OBJECT_RULE___GET_BEFORE_RECEIVING_EVENT_TEXT = eINSTANCE.getCmObjectRule__GetBeforeReceivingEventText();

		/**
		 * The meta object literal for the '<em><b>Get Before Receiving Event Declaration</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CM_OBJECT_RULE___GET_BEFORE_RECEIVING_EVENT_DECLARATION = eINSTANCE.getCmObjectRule__GetBeforeReceivingEventDeclaration();

		/**
		 * The meta object literal for the '<em><b>Get On Receiving Event Text</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CM_OBJECT_RULE___GET_ON_RECEIVING_EVENT_TEXT = eINSTANCE.getCmObjectRule__GetOnReceivingEventText();

		/**
		 * The meta object literal for the '<em><b>Get On Receiving Event Declaration</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CM_OBJECT_RULE___GET_ON_RECEIVING_EVENT_DECLARATION = eINSTANCE.getCmObjectRule__GetOnReceivingEventDeclaration();

		/**
		 * The meta object literal for the '<em><b>Get After Receiving Algorithm Declaration</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CM_OBJECT_RULE___GET_AFTER_RECEIVING_ALGORITHM_DECLARATION = eINSTANCE.getCmObjectRule__GetAfterReceivingAlgorithmDeclaration();

		/**
		 * The meta object literal for the '<em><b>Included In Subsystem</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CM_OBJECT_RULE___INCLUDED_IN_SUBSYSTEM__CMSUBSYSTEM = eINSTANCE.getCmObjectRule__IncludedInSubsystem__CmSubsystem();

		/**
		 * The meta object literal for the '<em><b>To String</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CM_OBJECT_RULE___TO_STRING = eINSTANCE.getCmObjectRule__ToString();

		/**
		 * The meta object literal for the '{@link ru.capralow.dt.conversion.plugin.core.cm.model.impl.CmAttributeRuleImpl <em>Cm Attribute Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ru.capralow.dt.conversion.plugin.core.cm.model.impl.CmAttributeRuleImpl
		 * @see ru.capralow.dt.conversion.plugin.core.cm.model.impl.cmPackageImpl#getCmAttributeRule()
		 * @generated
		 */
		EClass CM_ATTRIBUTE_RULE = eINSTANCE.getCmAttributeRule();

		/**
		 * The meta object literal for the '<em><b>Configuration Tabular Section</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CM_ATTRIBUTE_RULE__CONFIGURATION_TABULAR_SECTION = eINSTANCE.getCmAttributeRule_ConfigurationTabularSection();

		/**
		 * The meta object literal for the '<em><b>Configuration Attribute</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CM_ATTRIBUTE_RULE__CONFIGURATION_ATTRIBUTE = eINSTANCE.getCmAttributeRule_ConfigurationAttribute();

		/**
		 * The meta object literal for the '<em><b>Format Tabular Section</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CM_ATTRIBUTE_RULE__FORMAT_TABULAR_SECTION = eINSTANCE.getCmAttributeRule_FormatTabularSection();

		/**
		 * The meta object literal for the '<em><b>Format Attribute</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CM_ATTRIBUTE_RULE__FORMAT_ATTRIBUTE = eINSTANCE.getCmAttributeRule_FormatAttribute();

		/**
		 * The meta object literal for the '<em><b>Object Rule</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CM_ATTRIBUTE_RULE__OBJECT_RULE = eINSTANCE.getCmAttributeRule_ObjectRule();

		/**
		 * The meta object literal for the '<em><b>Is Custom Rule</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CM_ATTRIBUTE_RULE__IS_CUSTOM_RULE = eINSTANCE.getCmAttributeRule_IsCustomRule();

		/**
		 * The meta object literal for the '<em><b>Get Configuration Attribute Full Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CM_ATTRIBUTE_RULE___GET_CONFIGURATION_ATTRIBUTE_FULL_NAME = eINSTANCE.getCmAttributeRule__GetConfigurationAttributeFullName();

		/**
		 * The meta object literal for the '<em><b>Get Format Attribute Full Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CM_ATTRIBUTE_RULE___GET_FORMAT_ATTRIBUTE_FULL_NAME = eINSTANCE.getCmAttributeRule__GetFormatAttributeFullName();

		/**
		 * The meta object literal for the '<em><b>To String</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CM_ATTRIBUTE_RULE___TO_STRING = eINSTANCE.getCmAttributeRule__ToString();

		/**
		 * The meta object literal for the '{@link ru.capralow.dt.conversion.plugin.core.cm.model.impl.CmPredefinedImpl <em>Cm Predefined</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ru.capralow.dt.conversion.plugin.core.cm.model.impl.CmPredefinedImpl
		 * @see ru.capralow.dt.conversion.plugin.core.cm.model.impl.cmPackageImpl#getCmPredefined()
		 * @generated
		 */
		EClass CM_PREDEFINED = eINSTANCE.getCmPredefined();

		/**
		 * The meta object literal for the '<em><b>Predefined Maps</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CM_PREDEFINED__PREDEFINED_MAPS = eINSTANCE.getCmPredefined_PredefinedMaps();

		/**
		 * The meta object literal for the '<em><b>Predefined Map Exists</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CM_PREDEFINED___PREDEFINED_MAP_EXISTS__STRING_STRING = eINSTANCE.getCmPredefined__PredefinedMapExists__String_String();

		/**
		 * The meta object literal for the '<em><b>To String</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CM_PREDEFINED___TO_STRING = eINSTANCE.getCmPredefined__ToString();

		/**
		 * The meta object literal for the '{@link ru.capralow.dt.conversion.plugin.core.cm.model.impl.CmPredefinedMapImpl <em>Cm Predefined Map</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ru.capralow.dt.conversion.plugin.core.cm.model.impl.CmPredefinedMapImpl
		 * @see ru.capralow.dt.conversion.plugin.core.cm.model.impl.cmPackageImpl#getCmPredefinedMap()
		 * @generated
		 */
		EClass CM_PREDEFINED_MAP = eINSTANCE.getCmPredefinedMap();

		/**
		 * The meta object literal for the '<em><b>Configuration Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CM_PREDEFINED_MAP__CONFIGURATION_VALUE = eINSTANCE.getCmPredefinedMap_ConfigurationValue();

		/**
		 * The meta object literal for the '<em><b>Format Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CM_PREDEFINED_MAP__FORMAT_VALUE = eINSTANCE.getCmPredefinedMap_FormatValue();

		/**
		 * The meta object literal for the '<em><b>Get Configuration Value Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CM_PREDEFINED_MAP___GET_CONFIGURATION_VALUE_NAME = eINSTANCE.getCmPredefinedMap__GetConfigurationValueName();

		/**
		 * The meta object literal for the '<em><b>Get Format Value Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CM_PREDEFINED_MAP___GET_FORMAT_VALUE_NAME = eINSTANCE.getCmPredefinedMap__GetFormatValueName();

		/**
		 * The meta object literal for the '{@link ru.capralow.dt.conversion.plugin.core.cm.model.impl.CmAlgorithmImpl <em>Cm Algorithm</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ru.capralow.dt.conversion.plugin.core.cm.model.impl.CmAlgorithmImpl
		 * @see ru.capralow.dt.conversion.plugin.core.cm.model.impl.cmPackageImpl#getCmAlgorithm()
		 * @generated
		 */
		EClass CM_ALGORITHM = eINSTANCE.getCmAlgorithm();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CM_ALGORITHM__NAME = eINSTANCE.getCmAlgorithm_Name();

		/**
		 * The meta object literal for the '<em><b>Method Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CM_ALGORITHM__METHOD_TYPE = eINSTANCE.getCmAlgorithm_MethodType();

		/**
		 * The meta object literal for the '<em><b>Params</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CM_ALGORITHM__PARAMS = eINSTANCE.getCmAlgorithm_Params();

		/**
		 * The meta object literal for the '<em><b>Is Export</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CM_ALGORITHM__IS_EXPORT = eINSTANCE.getCmAlgorithm_IsExport();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CM_ALGORITHM__BODY = eINSTANCE.getCmAlgorithm_Body();

		/**
		 * The meta object literal for the '<em><b>Prefix</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CM_ALGORITHM__PREFIX = eINSTANCE.getCmAlgorithm_Prefix();

		/**
		 * The meta object literal for the '<em><b>Suffix</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CM_ALGORITHM__SUFFIX = eINSTANCE.getCmAlgorithm_Suffix();

		/**
		 * The meta object literal for the '<em><b>Get Algorithm Text</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CM_ALGORITHM___GET_ALGORITHM_TEXT = eINSTANCE.getCmAlgorithm__GetAlgorithmText();

		/**
		 * The meta object literal for the '<em><b>To String</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CM_ALGORITHM___TO_STRING = eINSTANCE.getCmAlgorithm__ToString();

		/**
		 * The meta object literal for the '{@link ru.capralow.dt.conversion.plugin.core.cm.model.impl.CmSubsystemImpl <em>Cm Subsystem</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ru.capralow.dt.conversion.plugin.core.cm.model.impl.CmSubsystemImpl
		 * @see ru.capralow.dt.conversion.plugin.core.cm.model.impl.cmPackageImpl#getCmSubsystem()
		 * @generated
		 */
		EClass CM_SUBSYSTEM = eINSTANCE.getCmSubsystem();

		/**
		 * The meta object literal for the '<em><b>Subsystem</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CM_SUBSYSTEM__SUBSYSTEM = eINSTANCE.getCmSubsystem_Subsystem();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CM_SUBSYSTEM__NAME = eINSTANCE.getCmSubsystem_Name();

		/**
		 * The meta object literal for the '<em><b>Special Subsystem Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CM_SUBSYSTEM__SPECIAL_SUBSYSTEM_TYPE = eINSTANCE.getCmSubsystem_SpecialSubsystemType();

		/**
		 * The meta object literal for the '{@link ru.capralow.dt.conversion.plugin.core.cm.model.impl.CmGroupImpl <em>Cm Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ru.capralow.dt.conversion.plugin.core.cm.model.impl.CmGroupImpl
		 * @see ru.capralow.dt.conversion.plugin.core.cm.model.impl.cmPackageImpl#getCmGroup()
		 * @generated
		 */
		EClass CM_GROUP = eINSTANCE.getCmGroup();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CM_GROUP__NAME = eINSTANCE.getCmGroup_Name();

		/**
		 * The meta object literal for the '{@link ru.capralow.dt.conversion.plugin.core.cm.model.CmSelectionVariant <em>Cm Selection Variant</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ru.capralow.dt.conversion.plugin.core.cm.model.CmSelectionVariant
		 * @see ru.capralow.dt.conversion.plugin.core.cm.model.impl.cmPackageImpl#getCmSelectionVariant()
		 * @generated
		 */
		EEnum CM_SELECTION_VARIANT = eINSTANCE.getCmSelectionVariant();

		/**
		 * The meta object literal for the '{@link ru.capralow.dt.conversion.plugin.core.cm.model.CmIdentificationVariant <em>Cm Identification Variant</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ru.capralow.dt.conversion.plugin.core.cm.model.CmIdentificationVariant
		 * @see ru.capralow.dt.conversion.plugin.core.cm.model.impl.cmPackageImpl#getCmIdentificationVariant()
		 * @generated
		 */
		EEnum CM_IDENTIFICATION_VARIANT = eINSTANCE.getCmIdentificationVariant();

		/**
		 * The meta object literal for the '{@link ru.capralow.dt.conversion.plugin.core.cm.model.CmMethodType <em>Cm Method Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ru.capralow.dt.conversion.plugin.core.cm.model.CmMethodType
		 * @see ru.capralow.dt.conversion.plugin.core.cm.model.impl.cmPackageImpl#getCmMethodType()
		 * @generated
		 */
		EEnum CM_METHOD_TYPE = eINSTANCE.getCmMethodType();

		/**
		 * The meta object literal for the '{@link ru.capralow.dt.conversion.plugin.core.cm.model.CmSpecialSubsystemType <em>Cm Special Subsystem Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ru.capralow.dt.conversion.plugin.core.cm.model.CmSpecialSubsystemType
		 * @see ru.capralow.dt.conversion.plugin.core.cm.model.impl.cmPackageImpl#getCmSpecialSubsystemType()
		 * @generated
		 */
		EEnum CM_SPECIAL_SUBSYSTEM_TYPE = eINSTANCE.getCmSpecialSubsystemType();

	}

} //cmPackage

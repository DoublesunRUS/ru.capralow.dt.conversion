/**
 */
package ru.capralow.dt.conversion.plugin.core.cm;

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
 * @see ru.capralow.dt.conversion.plugin.core.cm.CmFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel publicConstructors='true' loadInitialization='false' literalsInterface='true' nonNLSMarkers='true' updateClasspath='false' featureDelegation='Reflective' basePackage='ru.capralow.dt.conversion.plugin.core'"
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
	 * The feature id for the '<em><b>Before Convertation Event Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSION_MODULE__BEFORE_CONVERTATION_EVENT_METHOD = 4;

	/**
	 * The feature id for the '<em><b>Before Filling Event</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSION_MODULE__BEFORE_FILLING_EVENT = 5;

	/**
	 * The feature id for the '<em><b>Before Filling Event Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSION_MODULE__BEFORE_FILLING_EVENT_METHOD = 6;

	/**
	 * The feature id for the '<em><b>After Convertation Event</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSION_MODULE__AFTER_CONVERTATION_EVENT = 7;

	/**
	 * The feature id for the '<em><b>After Convertation Event Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSION_MODULE__AFTER_CONVERTATION_EVENT_METHOD = 8;

	/**
	 * The feature id for the '<em><b>Data Rules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSION_MODULE__DATA_RULES = 9;

	/**
	 * The feature id for the '<em><b>Object Rules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSION_MODULE__OBJECT_RULES = 10;

	/**
	 * The feature id for the '<em><b>Predefineds</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSION_MODULE__PREDEFINEDS = 11;

	/**
	 * The feature id for the '<em><b>Algorithms</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSION_MODULE__ALGORITHMS = 12;

	/**
	 * The number of structural features of the '<em>Conversion Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSION_MODULE_FEATURE_COUNT = 13;

	/**
	 * The operation id for the '<em>Get Data Rule</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSION_MODULE___GET_DATA_RULE__STRING = 0;

	/**
	 * The operation id for the '<em>Get Sending Data Rules</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSION_MODULE___GET_SENDING_DATA_RULES = 1;

	/**
	 * The operation id for the '<em>Get Receiving Data Rules</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSION_MODULE___GET_RECEIVING_DATA_RULES = 2;

	/**
	 * The operation id for the '<em>Get Object Rule</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSION_MODULE___GET_OBJECT_RULE__STRING = 3;

	/**
	 * The operation id for the '<em>Get Algorithm</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSION_MODULE___GET_ALGORITHM__STRING = 4;

	/**
	 * The operation id for the '<em>Get Algorithms Text</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSION_MODULE___GET_ALGORITHMS_TEXT__STRING = 5;

	/**
	 * The number of operations of the '<em>Conversion Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSION_MODULE_OPERATION_COUNT = 6;

	/**
	 * The meta object id for the '{@link ru.capralow.dt.conversion.plugin.core.cm.impl.CmDataRuleImpl <em>Data Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.capralow.dt.conversion.plugin.core.cm.impl.CmDataRuleImpl
	 * @see ru.capralow.dt.conversion.plugin.core.cm.impl.CmPackageImpl#getCmDataRule()
	 * @generated
	 */
	int CM_DATA_RULE = 1;

	/**
	 * The feature id for the '<em><b>Conversion Module</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CM_DATA_RULE__CONVERSION_MODULE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CM_DATA_RULE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Is Disabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CM_DATA_RULE__IS_DISABLED = 2;

	/**
	 * The feature id for the '<em><b>Configuration Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CM_DATA_RULE__CONFIGURATION_OBJECT = 3;

	/**
	 * The feature id for the '<em><b>Format Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CM_DATA_RULE__FORMAT_OBJECT = 4;

	/**
	 * The feature id for the '<em><b>For Sending</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CM_DATA_RULE__FOR_SENDING = 5;

	/**
	 * The feature id for the '<em><b>For Receiving</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CM_DATA_RULE__FOR_RECEIVING = 6;

	/**
	 * The feature id for the '<em><b>Is Data Cleaning</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CM_DATA_RULE__IS_DATA_CLEANING = 7;

	/**
	 * The feature id for the '<em><b>Selection Variant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CM_DATA_RULE__SELECTION_VARIANT = 8;

	/**
	 * The feature id for the '<em><b>On Processing Event</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CM_DATA_RULE__ON_PROCESSING_EVENT = 9;

	/**
	 * The feature id for the '<em><b>On Processing Event Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CM_DATA_RULE__ON_PROCESSING_EVENT_METHOD = 10;

	/**
	 * The feature id for the '<em><b>Data Selection Event</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CM_DATA_RULE__DATA_SELECTION_EVENT = 11;

	/**
	 * The feature id for the '<em><b>Data Selection Event Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CM_DATA_RULE__DATA_SELECTION_EVENT_METHOD = 12;

	/**
	 * The feature id for the '<em><b>Object Rules</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CM_DATA_RULE__OBJECT_RULES = 13;

	/**
	 * The number of structural features of the '<em>Data Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CM_DATA_RULE_FEATURE_COUNT = 14;

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
	int CM_OBJECT_RULE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CM_OBJECT_RULE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Is Disabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CM_OBJECT_RULE__IS_DISABLED = 1;

	/**
	 * The feature id for the '<em><b>Configuration Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CM_OBJECT_RULE__CONFIGURATION_OBJECT = 2;

	/**
	 * The feature id for the '<em><b>Format Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CM_OBJECT_RULE__FORMAT_OBJECT = 3;

	/**
	 * The feature id for the '<em><b>For Sending</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CM_OBJECT_RULE__FOR_SENDING = 4;

	/**
	 * The feature id for the '<em><b>For Receiving</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CM_OBJECT_RULE__FOR_RECEIVING = 5;

	/**
	 * The feature id for the '<em><b>Is For Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CM_OBJECT_RULE__IS_FOR_GROUP = 6;

	/**
	 * The feature id for the '<em><b>Identification Variant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CM_OBJECT_RULE__IDENTIFICATION_VARIANT = 7;

	/**
	 * The feature id for the '<em><b>Before Sending Event</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CM_OBJECT_RULE__BEFORE_SENDING_EVENT = 8;

	/**
	 * The feature id for the '<em><b>Before Sending Event Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CM_OBJECT_RULE__BEFORE_SENDING_EVENT_METHOD = 9;

	/**
	 * The feature id for the '<em><b>On Sending Event</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CM_OBJECT_RULE__ON_SENDING_EVENT = 10;

	/**
	 * The feature id for the '<em><b>On Sending Event Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CM_OBJECT_RULE__ON_SENDING_EVENT_METHOD = 11;

	/**
	 * The feature id for the '<em><b>Before Receiving Event</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CM_OBJECT_RULE__BEFORE_RECEIVING_EVENT = 12;

	/**
	 * The feature id for the '<em><b>Before Receiving Event Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CM_OBJECT_RULE__BEFORE_RECEIVING_EVENT_METHOD = 13;

	/**
	 * The feature id for the '<em><b>On Receiving Event</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CM_OBJECT_RULE__ON_RECEIVING_EVENT = 14;

	/**
	 * The feature id for the '<em><b>On Receiving Event Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CM_OBJECT_RULE__ON_RECEIVING_EVENT_METHOD = 15;

	/**
	 * The feature id for the '<em><b>After Receiving Algorithm</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CM_OBJECT_RULE__AFTER_RECEIVING_ALGORITHM = 16;

	/**
	 * The feature id for the '<em><b>Attribute Rules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CM_OBJECT_RULE__ATTRIBUTE_RULES = 17;

	/**
	 * The number of structural features of the '<em>Object Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CM_OBJECT_RULE_FEATURE_COUNT = 18;

	/**
	 * The number of operations of the '<em>Object Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CM_OBJECT_RULE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ru.capralow.dt.conversion.plugin.core.cm.impl.CmAttributeRuleImpl <em>Attribute Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.capralow.dt.conversion.plugin.core.cm.impl.CmAttributeRuleImpl
	 * @see ru.capralow.dt.conversion.plugin.core.cm.impl.CmPackageImpl#getCmAttributeRule()
	 * @generated
	 */
	int CM_ATTRIBUTE_RULE = 3;

	/**
	 * The feature id for the '<em><b>Configuration Tabular Section Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CM_ATTRIBUTE_RULE__CONFIGURATION_TABULAR_SECTION_NAME = 0;

	/**
	 * The feature id for the '<em><b>Configuration Attribute Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CM_ATTRIBUTE_RULE__CONFIGURATION_ATTRIBUTE_NAME = 1;

	/**
	 * The feature id for the '<em><b>Format Tabular Section Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CM_ATTRIBUTE_RULE__FORMAT_TABULAR_SECTION_NAME = 2;

	/**
	 * The feature id for the '<em><b>Format Attribute Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CM_ATTRIBUTE_RULE__FORMAT_ATTRIBUTE_NAME = 3;

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
	 * The number of structural features of the '<em>Attribute Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CM_ATTRIBUTE_RULE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Attribute Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CM_ATTRIBUTE_RULE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ru.capralow.dt.conversion.plugin.core.cm.impl.CmPredefinedImpl <em>Predefined</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.capralow.dt.conversion.plugin.core.cm.impl.CmPredefinedImpl
	 * @see ru.capralow.dt.conversion.plugin.core.cm.impl.CmPackageImpl#getCmPredefined()
	 * @generated
	 */
	int CM_PREDEFINED = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CM_PREDEFINED__NAME = 0;

	/**
	 * The feature id for the '<em><b>Configuration Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CM_PREDEFINED__CONFIGURATION_OBJECT = 1;

	/**
	 * The feature id for the '<em><b>Format Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CM_PREDEFINED__FORMAT_OBJECT = 2;

	/**
	 * The feature id for the '<em><b>For Sending</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CM_PREDEFINED__FOR_SENDING = 3;

	/**
	 * The feature id for the '<em><b>For Receiving</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CM_PREDEFINED__FOR_RECEIVING = 4;

	/**
	 * The number of structural features of the '<em>Predefined</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CM_PREDEFINED_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Predefined</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CM_PREDEFINED_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ru.capralow.dt.conversion.plugin.core.cm.impl.CmAlgorithmImpl <em>Algorithm</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.capralow.dt.conversion.plugin.core.cm.impl.CmAlgorithmImpl
	 * @see ru.capralow.dt.conversion.plugin.core.cm.impl.CmPackageImpl#getCmAlgorithm()
	 * @generated
	 */
	int CM_ALGORITHM = 5;

	/**
	 * The feature id for the '<em><b>Conversion Module</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CM_ALGORITHM__CONVERSION_MODULE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CM_ALGORITHM__NAME = 1;

	/**
	 * The feature id for the '<em><b>Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CM_ALGORITHM__METHOD = 2;

	/**
	 * The feature id for the '<em><b>Method Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CM_ALGORITHM__METHOD_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Params</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CM_ALGORITHM__PARAMS = 4;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CM_ALGORITHM__TEXT = 5;

	/**
	 * The feature id for the '<em><b>Is Export</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CM_ALGORITHM__IS_EXPORT = 6;

	/**
	 * The number of structural features of the '<em>Algorithm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CM_ALGORITHM_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Algorithm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CM_ALGORITHM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ru.capralow.dt.conversion.plugin.core.cm.CmSelectionVariant <em>Selection Variant</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.capralow.dt.conversion.plugin.core.cm.CmSelectionVariant
	 * @see ru.capralow.dt.conversion.plugin.core.cm.impl.CmPackageImpl#getCmSelectionVariant()
	 * @generated
	 */
	int CM_SELECTION_VARIANT = 6;

	/**
	 * The meta object id for the '{@link ru.capralow.dt.conversion.plugin.core.cm.CmIdentificationVariant <em>Identification Variant</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.capralow.dt.conversion.plugin.core.cm.CmIdentificationVariant
	 * @see ru.capralow.dt.conversion.plugin.core.cm.impl.CmPackageImpl#getCmIdentificationVariant()
	 * @generated
	 */
	int CM_IDENTIFICATION_VARIANT = 7;

	/**
	 * The meta object id for the '{@link ru.capralow.dt.conversion.plugin.core.cm.CmMethodType <em>Method Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.capralow.dt.conversion.plugin.core.cm.CmMethodType
	 * @see ru.capralow.dt.conversion.plugin.core.cm.impl.CmPackageImpl#getCmMethodType()
	 * @generated
	 */
	int CM_METHOD_TYPE = 8;


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
	 * Returns the meta object for the attribute '{@link ru.capralow.dt.conversion.plugin.core.cm.ConversionModule#getBeforeConvertationEventMethod <em>Before Convertation Event Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Before Convertation Event Method</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.ConversionModule#getBeforeConvertationEventMethod()
	 * @see #getConversionModule()
	 * @generated
	 */
	EAttribute getConversionModule_BeforeConvertationEventMethod();

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
	 * Returns the meta object for the attribute '{@link ru.capralow.dt.conversion.plugin.core.cm.ConversionModule#getBeforeFillingEventMethod <em>Before Filling Event Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Before Filling Event Method</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.ConversionModule#getBeforeFillingEventMethod()
	 * @see #getConversionModule()
	 * @generated
	 */
	EAttribute getConversionModule_BeforeFillingEventMethod();

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
	 * Returns the meta object for the attribute '{@link ru.capralow.dt.conversion.plugin.core.cm.ConversionModule#getAfterConvertationEventMethod <em>After Convertation Event Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>After Convertation Event Method</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.ConversionModule#getAfterConvertationEventMethod()
	 * @see #getConversionModule()
	 * @generated
	 */
	EAttribute getConversionModule_AfterConvertationEventMethod();

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
	 * Returns the meta object for the containment reference list '{@link ru.capralow.dt.conversion.plugin.core.cm.ConversionModule#getPredefineds <em>Predefineds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Predefineds</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.ConversionModule#getPredefineds()
	 * @see #getConversionModule()
	 * @generated
	 */
	EReference getConversionModule_Predefineds();

	/**
	 * Returns the meta object for the containment reference list '{@link ru.capralow.dt.conversion.plugin.core.cm.ConversionModule#getAlgorithms <em>Algorithms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Algorithms</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.ConversionModule#getAlgorithms()
	 * @see #getConversionModule()
	 * @generated
	 */
	EReference getConversionModule_Algorithms();

	/**
	 * Returns the meta object for the '{@link ru.capralow.dt.conversion.plugin.core.cm.ConversionModule#getDataRule(java.lang.String) <em>Get Data Rule</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Data Rule</em>' operation.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.ConversionModule#getDataRule(java.lang.String)
	 * @generated
	 */
	EOperation getConversionModule__GetDataRule__String();

	/**
	 * Returns the meta object for the '{@link ru.capralow.dt.conversion.plugin.core.cm.ConversionModule#getSendingDataRules() <em>Get Sending Data Rules</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Sending Data Rules</em>' operation.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.ConversionModule#getSendingDataRules()
	 * @generated
	 */
	EOperation getConversionModule__GetSendingDataRules();

	/**
	 * Returns the meta object for the '{@link ru.capralow.dt.conversion.plugin.core.cm.ConversionModule#getReceivingDataRules() <em>Get Receiving Data Rules</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Receiving Data Rules</em>' operation.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.ConversionModule#getReceivingDataRules()
	 * @generated
	 */
	EOperation getConversionModule__GetReceivingDataRules();

	/**
	 * Returns the meta object for the '{@link ru.capralow.dt.conversion.plugin.core.cm.ConversionModule#getObjectRule(java.lang.String) <em>Get Object Rule</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Object Rule</em>' operation.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.ConversionModule#getObjectRule(java.lang.String)
	 * @generated
	 */
	EOperation getConversionModule__GetObjectRule__String();

	/**
	 * Returns the meta object for the '{@link ru.capralow.dt.conversion.plugin.core.cm.ConversionModule#getAlgorithm(java.lang.String) <em>Get Algorithm</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Algorithm</em>' operation.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.ConversionModule#getAlgorithm(java.lang.String)
	 * @generated
	 */
	EOperation getConversionModule__GetAlgorithm__String();

	/**
	 * Returns the meta object for the '{@link ru.capralow.dt.conversion.plugin.core.cm.ConversionModule#getAlgorithmsText(java.lang.String) <em>Get Algorithms Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Algorithms Text</em>' operation.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.ConversionModule#getAlgorithmsText(java.lang.String)
	 * @generated
	 */
	EOperation getConversionModule__GetAlgorithmsText__String();

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
	 * Returns the meta object for the container reference '{@link ru.capralow.dt.conversion.plugin.core.cm.CmDataRule#getConversionModule <em>Conversion Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Conversion Module</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.CmDataRule#getConversionModule()
	 * @see #getCmDataRule()
	 * @generated
	 */
	EReference getCmDataRule_ConversionModule();

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
	 * Returns the meta object for the attribute '{@link ru.capralow.dt.conversion.plugin.core.cm.CmDataRule#getOnProcessingEventMethod <em>On Processing Event Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>On Processing Event Method</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.CmDataRule#getOnProcessingEventMethod()
	 * @see #getCmDataRule()
	 * @generated
	 */
	EAttribute getCmDataRule_OnProcessingEventMethod();

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
	 * Returns the meta object for the attribute '{@link ru.capralow.dt.conversion.plugin.core.cm.CmDataRule#getDataSelectionEventMethod <em>Data Selection Event Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Selection Event Method</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.CmDataRule#getDataSelectionEventMethod()
	 * @see #getCmDataRule()
	 * @generated
	 */
	EAttribute getCmDataRule_DataSelectionEventMethod();

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
	 * Returns the meta object for the attribute '{@link ru.capralow.dt.conversion.plugin.core.cm.CmObjectRule#getIsDisabled <em>Is Disabled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Disabled</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.CmObjectRule#getIsDisabled()
	 * @see #getCmObjectRule()
	 * @generated
	 */
	EAttribute getCmObjectRule_IsDisabled();

	/**
	 * Returns the meta object for the attribute '{@link ru.capralow.dt.conversion.plugin.core.cm.CmObjectRule#getConfigurationObject <em>Configuration Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Configuration Object</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.CmObjectRule#getConfigurationObject()
	 * @see #getCmObjectRule()
	 * @generated
	 */
	EAttribute getCmObjectRule_ConfigurationObject();

	/**
	 * Returns the meta object for the attribute '{@link ru.capralow.dt.conversion.plugin.core.cm.CmObjectRule#getFormatObject <em>Format Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Format Object</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.CmObjectRule#getFormatObject()
	 * @see #getCmObjectRule()
	 * @generated
	 */
	EAttribute getCmObjectRule_FormatObject();

	/**
	 * Returns the meta object for the attribute '{@link ru.capralow.dt.conversion.plugin.core.cm.CmObjectRule#getForSending <em>For Sending</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>For Sending</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.CmObjectRule#getForSending()
	 * @see #getCmObjectRule()
	 * @generated
	 */
	EAttribute getCmObjectRule_ForSending();

	/**
	 * Returns the meta object for the attribute '{@link ru.capralow.dt.conversion.plugin.core.cm.CmObjectRule#getForReceiving <em>For Receiving</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>For Receiving</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.CmObjectRule#getForReceiving()
	 * @see #getCmObjectRule()
	 * @generated
	 */
	EAttribute getCmObjectRule_ForReceiving();

	/**
	 * Returns the meta object for the attribute '{@link ru.capralow.dt.conversion.plugin.core.cm.CmObjectRule#getIsForGroup <em>Is For Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is For Group</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.CmObjectRule#getIsForGroup()
	 * @see #getCmObjectRule()
	 * @generated
	 */
	EAttribute getCmObjectRule_IsForGroup();

	/**
	 * Returns the meta object for the attribute '{@link ru.capralow.dt.conversion.plugin.core.cm.CmObjectRule#getIdentificationVariant <em>Identification Variant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identification Variant</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.CmObjectRule#getIdentificationVariant()
	 * @see #getCmObjectRule()
	 * @generated
	 */
	EAttribute getCmObjectRule_IdentificationVariant();

	/**
	 * Returns the meta object for the attribute '{@link ru.capralow.dt.conversion.plugin.core.cm.CmObjectRule#getBeforeSendingEvent <em>Before Sending Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Before Sending Event</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.CmObjectRule#getBeforeSendingEvent()
	 * @see #getCmObjectRule()
	 * @generated
	 */
	EAttribute getCmObjectRule_BeforeSendingEvent();

	/**
	 * Returns the meta object for the attribute '{@link ru.capralow.dt.conversion.plugin.core.cm.CmObjectRule#getBeforeSendingEventMethod <em>Before Sending Event Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Before Sending Event Method</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.CmObjectRule#getBeforeSendingEventMethod()
	 * @see #getCmObjectRule()
	 * @generated
	 */
	EAttribute getCmObjectRule_BeforeSendingEventMethod();

	/**
	 * Returns the meta object for the attribute '{@link ru.capralow.dt.conversion.plugin.core.cm.CmObjectRule#getOnSendingEvent <em>On Sending Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>On Sending Event</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.CmObjectRule#getOnSendingEvent()
	 * @see #getCmObjectRule()
	 * @generated
	 */
	EAttribute getCmObjectRule_OnSendingEvent();

	/**
	 * Returns the meta object for the attribute '{@link ru.capralow.dt.conversion.plugin.core.cm.CmObjectRule#getOnSendingEventMethod <em>On Sending Event Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>On Sending Event Method</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.CmObjectRule#getOnSendingEventMethod()
	 * @see #getCmObjectRule()
	 * @generated
	 */
	EAttribute getCmObjectRule_OnSendingEventMethod();

	/**
	 * Returns the meta object for the attribute '{@link ru.capralow.dt.conversion.plugin.core.cm.CmObjectRule#getBeforeReceivingEvent <em>Before Receiving Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Before Receiving Event</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.CmObjectRule#getBeforeReceivingEvent()
	 * @see #getCmObjectRule()
	 * @generated
	 */
	EAttribute getCmObjectRule_BeforeReceivingEvent();

	/**
	 * Returns the meta object for the attribute '{@link ru.capralow.dt.conversion.plugin.core.cm.CmObjectRule#getBeforeReceivingEventMethod <em>Before Receiving Event Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Before Receiving Event Method</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.CmObjectRule#getBeforeReceivingEventMethod()
	 * @see #getCmObjectRule()
	 * @generated
	 */
	EAttribute getCmObjectRule_BeforeReceivingEventMethod();

	/**
	 * Returns the meta object for the attribute '{@link ru.capralow.dt.conversion.plugin.core.cm.CmObjectRule#getOnReceivingEvent <em>On Receiving Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>On Receiving Event</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.CmObjectRule#getOnReceivingEvent()
	 * @see #getCmObjectRule()
	 * @generated
	 */
	EAttribute getCmObjectRule_OnReceivingEvent();

	/**
	 * Returns the meta object for the attribute '{@link ru.capralow.dt.conversion.plugin.core.cm.CmObjectRule#getOnReceivingEventMethod <em>On Receiving Event Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>On Receiving Event Method</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.CmObjectRule#getOnReceivingEventMethod()
	 * @see #getCmObjectRule()
	 * @generated
	 */
	EAttribute getCmObjectRule_OnReceivingEventMethod();

	/**
	 * Returns the meta object for the reference '{@link ru.capralow.dt.conversion.plugin.core.cm.CmObjectRule#getAfterReceivingAlgorithm <em>After Receiving Algorithm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>After Receiving Algorithm</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.CmObjectRule#getAfterReceivingAlgorithm()
	 * @see #getCmObjectRule()
	 * @generated
	 */
	EReference getCmObjectRule_AfterReceivingAlgorithm();

	/**
	 * Returns the meta object for the containment reference list '{@link ru.capralow.dt.conversion.plugin.core.cm.CmObjectRule#getAttributeRules <em>Attribute Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attribute Rules</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.CmObjectRule#getAttributeRules()
	 * @see #getCmObjectRule()
	 * @generated
	 */
	EReference getCmObjectRule_AttributeRules();

	/**
	 * Returns the meta object for class '{@link ru.capralow.dt.conversion.plugin.core.cm.CmAttributeRule <em>Attribute Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute Rule</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.CmAttributeRule
	 * @generated
	 */
	EClass getCmAttributeRule();

	/**
	 * Returns the meta object for the attribute '{@link ru.capralow.dt.conversion.plugin.core.cm.CmAttributeRule#getConfigurationTabularSectionName <em>Configuration Tabular Section Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Configuration Tabular Section Name</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.CmAttributeRule#getConfigurationTabularSectionName()
	 * @see #getCmAttributeRule()
	 * @generated
	 */
	EAttribute getCmAttributeRule_ConfigurationTabularSectionName();

	/**
	 * Returns the meta object for the attribute '{@link ru.capralow.dt.conversion.plugin.core.cm.CmAttributeRule#getConfigurationAttributeName <em>Configuration Attribute Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Configuration Attribute Name</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.CmAttributeRule#getConfigurationAttributeName()
	 * @see #getCmAttributeRule()
	 * @generated
	 */
	EAttribute getCmAttributeRule_ConfigurationAttributeName();

	/**
	 * Returns the meta object for the attribute '{@link ru.capralow.dt.conversion.plugin.core.cm.CmAttributeRule#getFormatTabularSectionName <em>Format Tabular Section Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Format Tabular Section Name</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.CmAttributeRule#getFormatTabularSectionName()
	 * @see #getCmAttributeRule()
	 * @generated
	 */
	EAttribute getCmAttributeRule_FormatTabularSectionName();

	/**
	 * Returns the meta object for the attribute '{@link ru.capralow.dt.conversion.plugin.core.cm.CmAttributeRule#getFormatAttributeName <em>Format Attribute Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Format Attribute Name</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.CmAttributeRule#getFormatAttributeName()
	 * @see #getCmAttributeRule()
	 * @generated
	 */
	EAttribute getCmAttributeRule_FormatAttributeName();

	/**
	 * Returns the meta object for the reference '{@link ru.capralow.dt.conversion.plugin.core.cm.CmAttributeRule#getObjectRule <em>Object Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Object Rule</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.CmAttributeRule#getObjectRule()
	 * @see #getCmAttributeRule()
	 * @generated
	 */
	EReference getCmAttributeRule_ObjectRule();

	/**
	 * Returns the meta object for the attribute '{@link ru.capralow.dt.conversion.plugin.core.cm.CmAttributeRule#getIsCustomRule <em>Is Custom Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Custom Rule</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.CmAttributeRule#getIsCustomRule()
	 * @see #getCmAttributeRule()
	 * @generated
	 */
	EAttribute getCmAttributeRule_IsCustomRule();

	/**
	 * Returns the meta object for class '{@link ru.capralow.dt.conversion.plugin.core.cm.CmPredefined <em>Predefined</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Predefined</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.CmPredefined
	 * @generated
	 */
	EClass getCmPredefined();

	/**
	 * Returns the meta object for the attribute '{@link ru.capralow.dt.conversion.plugin.core.cm.CmPredefined#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.CmPredefined#getName()
	 * @see #getCmPredefined()
	 * @generated
	 */
	EAttribute getCmPredefined_Name();

	/**
	 * Returns the meta object for the attribute '{@link ru.capralow.dt.conversion.plugin.core.cm.CmPredefined#getConfigurationObject <em>Configuration Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Configuration Object</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.CmPredefined#getConfigurationObject()
	 * @see #getCmPredefined()
	 * @generated
	 */
	EAttribute getCmPredefined_ConfigurationObject();

	/**
	 * Returns the meta object for the attribute '{@link ru.capralow.dt.conversion.plugin.core.cm.CmPredefined#getFormatObject <em>Format Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Format Object</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.CmPredefined#getFormatObject()
	 * @see #getCmPredefined()
	 * @generated
	 */
	EAttribute getCmPredefined_FormatObject();

	/**
	 * Returns the meta object for the attribute '{@link ru.capralow.dt.conversion.plugin.core.cm.CmPredefined#getForSending <em>For Sending</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>For Sending</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.CmPredefined#getForSending()
	 * @see #getCmPredefined()
	 * @generated
	 */
	EAttribute getCmPredefined_ForSending();

	/**
	 * Returns the meta object for the attribute '{@link ru.capralow.dt.conversion.plugin.core.cm.CmPredefined#getForReceiving <em>For Receiving</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>For Receiving</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.CmPredefined#getForReceiving()
	 * @see #getCmPredefined()
	 * @generated
	 */
	EAttribute getCmPredefined_ForReceiving();

	/**
	 * Returns the meta object for class '{@link ru.capralow.dt.conversion.plugin.core.cm.CmAlgorithm <em>Algorithm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Algorithm</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.CmAlgorithm
	 * @generated
	 */
	EClass getCmAlgorithm();

	/**
	 * Returns the meta object for the container reference '{@link ru.capralow.dt.conversion.plugin.core.cm.CmAlgorithm#getConversionModule <em>Conversion Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Conversion Module</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.CmAlgorithm#getConversionModule()
	 * @see #getCmAlgorithm()
	 * @generated
	 */
	EReference getCmAlgorithm_ConversionModule();

	/**
	 * Returns the meta object for the attribute '{@link ru.capralow.dt.conversion.plugin.core.cm.CmAlgorithm#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.CmAlgorithm#getName()
	 * @see #getCmAlgorithm()
	 * @generated
	 */
	EAttribute getCmAlgorithm_Name();

	/**
	 * Returns the meta object for the attribute '{@link ru.capralow.dt.conversion.plugin.core.cm.CmAlgorithm#getMethod <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Method</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.CmAlgorithm#getMethod()
	 * @see #getCmAlgorithm()
	 * @generated
	 */
	EAttribute getCmAlgorithm_Method();

	/**
	 * Returns the meta object for the attribute '{@link ru.capralow.dt.conversion.plugin.core.cm.CmAlgorithm#getMethodType <em>Method Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Method Type</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.CmAlgorithm#getMethodType()
	 * @see #getCmAlgorithm()
	 * @generated
	 */
	EAttribute getCmAlgorithm_MethodType();

	/**
	 * Returns the meta object for the attribute '{@link ru.capralow.dt.conversion.plugin.core.cm.CmAlgorithm#getParams <em>Params</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Params</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.CmAlgorithm#getParams()
	 * @see #getCmAlgorithm()
	 * @generated
	 */
	EAttribute getCmAlgorithm_Params();

	/**
	 * Returns the meta object for the attribute '{@link ru.capralow.dt.conversion.plugin.core.cm.CmAlgorithm#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.CmAlgorithm#getText()
	 * @see #getCmAlgorithm()
	 * @generated
	 */
	EAttribute getCmAlgorithm_Text();

	/**
	 * Returns the meta object for the attribute '{@link ru.capralow.dt.conversion.plugin.core.cm.CmAlgorithm#getIsExport <em>Is Export</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Export</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.CmAlgorithm#getIsExport()
	 * @see #getCmAlgorithm()
	 * @generated
	 */
	EAttribute getCmAlgorithm_IsExport();

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
	 * Returns the meta object for enum '{@link ru.capralow.dt.conversion.plugin.core.cm.CmIdentificationVariant <em>Identification Variant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Identification Variant</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.CmIdentificationVariant
	 * @generated
	 */
	EEnum getCmIdentificationVariant();

	/**
	 * Returns the meta object for enum '{@link ru.capralow.dt.conversion.plugin.core.cm.CmMethodType <em>Method Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Method Type</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.CmMethodType
	 * @generated
	 */
	EEnum getCmMethodType();

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
		 * The meta object literal for the '<em><b>Before Convertation Event Method</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONVERSION_MODULE__BEFORE_CONVERTATION_EVENT_METHOD = eINSTANCE.getConversionModule_BeforeConvertationEventMethod();

		/**
		 * The meta object literal for the '<em><b>Before Filling Event</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONVERSION_MODULE__BEFORE_FILLING_EVENT = eINSTANCE.getConversionModule_BeforeFillingEvent();

		/**
		 * The meta object literal for the '<em><b>Before Filling Event Method</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONVERSION_MODULE__BEFORE_FILLING_EVENT_METHOD = eINSTANCE.getConversionModule_BeforeFillingEventMethod();

		/**
		 * The meta object literal for the '<em><b>After Convertation Event</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONVERSION_MODULE__AFTER_CONVERTATION_EVENT = eINSTANCE.getConversionModule_AfterConvertationEvent();

		/**
		 * The meta object literal for the '<em><b>After Convertation Event Method</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONVERSION_MODULE__AFTER_CONVERTATION_EVENT_METHOD = eINSTANCE.getConversionModule_AfterConvertationEventMethod();

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
		 * The meta object literal for the '<em><b>Get Receiving Data Rules</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONVERSION_MODULE___GET_RECEIVING_DATA_RULES = eINSTANCE.getConversionModule__GetReceivingDataRules();

		/**
		 * The meta object literal for the '<em><b>Get Object Rule</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONVERSION_MODULE___GET_OBJECT_RULE__STRING = eINSTANCE.getConversionModule__GetObjectRule__String();

		/**
		 * The meta object literal for the '<em><b>Get Algorithm</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONVERSION_MODULE___GET_ALGORITHM__STRING = eINSTANCE.getConversionModule__GetAlgorithm__String();

		/**
		 * The meta object literal for the '<em><b>Get Algorithms Text</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONVERSION_MODULE___GET_ALGORITHMS_TEXT__STRING = eINSTANCE.getConversionModule__GetAlgorithmsText__String();

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
		 * The meta object literal for the '<em><b>Conversion Module</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CM_DATA_RULE__CONVERSION_MODULE = eINSTANCE.getCmDataRule_ConversionModule();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CM_DATA_RULE__NAME = eINSTANCE.getCmDataRule_Name();

		/**
		 * The meta object literal for the '<em><b>Is Disabled</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CM_DATA_RULE__IS_DISABLED = eINSTANCE.getCmDataRule_IsDisabled();

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
		 * The meta object literal for the '<em><b>On Processing Event</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CM_DATA_RULE__ON_PROCESSING_EVENT = eINSTANCE.getCmDataRule_OnProcessingEvent();

		/**
		 * The meta object literal for the '<em><b>On Processing Event Method</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CM_DATA_RULE__ON_PROCESSING_EVENT_METHOD = eINSTANCE.getCmDataRule_OnProcessingEventMethod();

		/**
		 * The meta object literal for the '<em><b>Data Selection Event</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CM_DATA_RULE__DATA_SELECTION_EVENT = eINSTANCE.getCmDataRule_DataSelectionEvent();

		/**
		 * The meta object literal for the '<em><b>Data Selection Event Method</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CM_DATA_RULE__DATA_SELECTION_EVENT_METHOD = eINSTANCE.getCmDataRule_DataSelectionEventMethod();

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
		 * The meta object literal for the '<em><b>Is Disabled</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CM_OBJECT_RULE__IS_DISABLED = eINSTANCE.getCmObjectRule_IsDisabled();

		/**
		 * The meta object literal for the '<em><b>Configuration Object</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CM_OBJECT_RULE__CONFIGURATION_OBJECT = eINSTANCE.getCmObjectRule_ConfigurationObject();

		/**
		 * The meta object literal for the '<em><b>Format Object</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CM_OBJECT_RULE__FORMAT_OBJECT = eINSTANCE.getCmObjectRule_FormatObject();

		/**
		 * The meta object literal for the '<em><b>For Sending</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CM_OBJECT_RULE__FOR_SENDING = eINSTANCE.getCmObjectRule_ForSending();

		/**
		 * The meta object literal for the '<em><b>For Receiving</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CM_OBJECT_RULE__FOR_RECEIVING = eINSTANCE.getCmObjectRule_ForReceiving();

		/**
		 * The meta object literal for the '<em><b>Is For Group</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CM_OBJECT_RULE__IS_FOR_GROUP = eINSTANCE.getCmObjectRule_IsForGroup();

		/**
		 * The meta object literal for the '<em><b>Identification Variant</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CM_OBJECT_RULE__IDENTIFICATION_VARIANT = eINSTANCE.getCmObjectRule_IdentificationVariant();

		/**
		 * The meta object literal for the '<em><b>Before Sending Event</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CM_OBJECT_RULE__BEFORE_SENDING_EVENT = eINSTANCE.getCmObjectRule_BeforeSendingEvent();

		/**
		 * The meta object literal for the '<em><b>Before Sending Event Method</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CM_OBJECT_RULE__BEFORE_SENDING_EVENT_METHOD = eINSTANCE.getCmObjectRule_BeforeSendingEventMethod();

		/**
		 * The meta object literal for the '<em><b>On Sending Event</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CM_OBJECT_RULE__ON_SENDING_EVENT = eINSTANCE.getCmObjectRule_OnSendingEvent();

		/**
		 * The meta object literal for the '<em><b>On Sending Event Method</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CM_OBJECT_RULE__ON_SENDING_EVENT_METHOD = eINSTANCE.getCmObjectRule_OnSendingEventMethod();

		/**
		 * The meta object literal for the '<em><b>Before Receiving Event</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CM_OBJECT_RULE__BEFORE_RECEIVING_EVENT = eINSTANCE.getCmObjectRule_BeforeReceivingEvent();

		/**
		 * The meta object literal for the '<em><b>Before Receiving Event Method</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CM_OBJECT_RULE__BEFORE_RECEIVING_EVENT_METHOD = eINSTANCE.getCmObjectRule_BeforeReceivingEventMethod();

		/**
		 * The meta object literal for the '<em><b>On Receiving Event</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CM_OBJECT_RULE__ON_RECEIVING_EVENT = eINSTANCE.getCmObjectRule_OnReceivingEvent();

		/**
		 * The meta object literal for the '<em><b>On Receiving Event Method</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CM_OBJECT_RULE__ON_RECEIVING_EVENT_METHOD = eINSTANCE.getCmObjectRule_OnReceivingEventMethod();

		/**
		 * The meta object literal for the '<em><b>After Receiving Algorithm</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CM_OBJECT_RULE__AFTER_RECEIVING_ALGORITHM = eINSTANCE.getCmObjectRule_AfterReceivingAlgorithm();

		/**
		 * The meta object literal for the '<em><b>Attribute Rules</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CM_OBJECT_RULE__ATTRIBUTE_RULES = eINSTANCE.getCmObjectRule_AttributeRules();

		/**
		 * The meta object literal for the '{@link ru.capralow.dt.conversion.plugin.core.cm.impl.CmAttributeRuleImpl <em>Attribute Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ru.capralow.dt.conversion.plugin.core.cm.impl.CmAttributeRuleImpl
		 * @see ru.capralow.dt.conversion.plugin.core.cm.impl.CmPackageImpl#getCmAttributeRule()
		 * @generated
		 */
		EClass CM_ATTRIBUTE_RULE = eINSTANCE.getCmAttributeRule();

		/**
		 * The meta object literal for the '<em><b>Configuration Tabular Section Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CM_ATTRIBUTE_RULE__CONFIGURATION_TABULAR_SECTION_NAME = eINSTANCE.getCmAttributeRule_ConfigurationTabularSectionName();

		/**
		 * The meta object literal for the '<em><b>Configuration Attribute Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CM_ATTRIBUTE_RULE__CONFIGURATION_ATTRIBUTE_NAME = eINSTANCE.getCmAttributeRule_ConfigurationAttributeName();

		/**
		 * The meta object literal for the '<em><b>Format Tabular Section Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CM_ATTRIBUTE_RULE__FORMAT_TABULAR_SECTION_NAME = eINSTANCE.getCmAttributeRule_FormatTabularSectionName();

		/**
		 * The meta object literal for the '<em><b>Format Attribute Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CM_ATTRIBUTE_RULE__FORMAT_ATTRIBUTE_NAME = eINSTANCE.getCmAttributeRule_FormatAttributeName();

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
		 * The meta object literal for the '{@link ru.capralow.dt.conversion.plugin.core.cm.impl.CmPredefinedImpl <em>Predefined</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ru.capralow.dt.conversion.plugin.core.cm.impl.CmPredefinedImpl
		 * @see ru.capralow.dt.conversion.plugin.core.cm.impl.CmPackageImpl#getCmPredefined()
		 * @generated
		 */
		EClass CM_PREDEFINED = eINSTANCE.getCmPredefined();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CM_PREDEFINED__NAME = eINSTANCE.getCmPredefined_Name();

		/**
		 * The meta object literal for the '<em><b>Configuration Object</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CM_PREDEFINED__CONFIGURATION_OBJECT = eINSTANCE.getCmPredefined_ConfigurationObject();

		/**
		 * The meta object literal for the '<em><b>Format Object</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CM_PREDEFINED__FORMAT_OBJECT = eINSTANCE.getCmPredefined_FormatObject();

		/**
		 * The meta object literal for the '<em><b>For Sending</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CM_PREDEFINED__FOR_SENDING = eINSTANCE.getCmPredefined_ForSending();

		/**
		 * The meta object literal for the '<em><b>For Receiving</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CM_PREDEFINED__FOR_RECEIVING = eINSTANCE.getCmPredefined_ForReceiving();

		/**
		 * The meta object literal for the '{@link ru.capralow.dt.conversion.plugin.core.cm.impl.CmAlgorithmImpl <em>Algorithm</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ru.capralow.dt.conversion.plugin.core.cm.impl.CmAlgorithmImpl
		 * @see ru.capralow.dt.conversion.plugin.core.cm.impl.CmPackageImpl#getCmAlgorithm()
		 * @generated
		 */
		EClass CM_ALGORITHM = eINSTANCE.getCmAlgorithm();

		/**
		 * The meta object literal for the '<em><b>Conversion Module</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CM_ALGORITHM__CONVERSION_MODULE = eINSTANCE.getCmAlgorithm_ConversionModule();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CM_ALGORITHM__NAME = eINSTANCE.getCmAlgorithm_Name();

		/**
		 * The meta object literal for the '<em><b>Method</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CM_ALGORITHM__METHOD = eINSTANCE.getCmAlgorithm_Method();

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
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CM_ALGORITHM__TEXT = eINSTANCE.getCmAlgorithm_Text();

		/**
		 * The meta object literal for the '<em><b>Is Export</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CM_ALGORITHM__IS_EXPORT = eINSTANCE.getCmAlgorithm_IsExport();

		/**
		 * The meta object literal for the '{@link ru.capralow.dt.conversion.plugin.core.cm.CmSelectionVariant <em>Selection Variant</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ru.capralow.dt.conversion.plugin.core.cm.CmSelectionVariant
		 * @see ru.capralow.dt.conversion.plugin.core.cm.impl.CmPackageImpl#getCmSelectionVariant()
		 * @generated
		 */
		EEnum CM_SELECTION_VARIANT = eINSTANCE.getCmSelectionVariant();

		/**
		 * The meta object literal for the '{@link ru.capralow.dt.conversion.plugin.core.cm.CmIdentificationVariant <em>Identification Variant</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ru.capralow.dt.conversion.plugin.core.cm.CmIdentificationVariant
		 * @see ru.capralow.dt.conversion.plugin.core.cm.impl.CmPackageImpl#getCmIdentificationVariant()
		 * @generated
		 */
		EEnum CM_IDENTIFICATION_VARIANT = eINSTANCE.getCmIdentificationVariant();

		/**
		 * The meta object literal for the '{@link ru.capralow.dt.conversion.plugin.core.cm.CmMethodType <em>Method Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ru.capralow.dt.conversion.plugin.core.cm.CmMethodType
		 * @see ru.capralow.dt.conversion.plugin.core.cm.impl.CmPackageImpl#getCmMethodType()
		 * @generated
		 */
		EEnum CM_METHOD_TYPE = eINSTANCE.getCmMethodType();

	}

} //CmPackage

/**
 */
package ru.capralow.dt.conversion.plugin.core.rg.model;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see ru.capralow.dt.conversion.plugin.core.rg.model.rgFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel loadInitialization='false' literalsInterface='true' nonNLSMarkers='true' prefix='rg' updateClasspath='false' basePackage='ru.capralow.dt.conversion.plugin.core.rg'"
 * @generated
 */
public interface rgPackage extends EPackage {
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
	String eNS_URI = "http://ru.capralow.dt.conversion.plugin.core.rg.model"; //$NON-NLS-1$

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "rg"; //$NON-NLS-1$

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	rgPackage eINSTANCE = ru.capralow.dt.conversion.plugin.core.rg.model.impl.rgPackageImpl.init();

	/**
	 * The meta object id for the '{@link ru.capralow.dt.conversion.plugin.core.rg.model.impl.ReportGroupsImpl <em>Report Groups</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.capralow.dt.conversion.plugin.core.rg.model.impl.ReportGroupsImpl
	 * @see ru.capralow.dt.conversion.plugin.core.rg.model.impl.rgPackageImpl#getReportGroups()
	 * @generated
	 */
	int REPORT_GROUPS = 0;

	/**
	 * The feature id for the '<em><b>Variants</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT_GROUPS__VARIANTS = 0;

	/**
	 * The feature id for the '<em><b>Add Objects List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT_GROUPS__ADD_OBJECTS_LIST = 1;

	/**
	 * The number of structural features of the '<em>Report Groups</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT_GROUPS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Report Groups</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT_GROUPS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ru.capralow.dt.conversion.plugin.core.rg.model.impl.RgVariantImpl <em>Rg Variant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.capralow.dt.conversion.plugin.core.rg.model.impl.RgVariantImpl
	 * @see ru.capralow.dt.conversion.plugin.core.rg.model.impl.rgPackageImpl#getRgVariant()
	 * @generated
	 */
	int RG_VARIANT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RG_VARIANT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RG_VARIANT__GROUPS = 1;

	/**
	 * The number of structural features of the '<em>Rg Variant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RG_VARIANT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Rg Variant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RG_VARIANT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ru.capralow.dt.conversion.plugin.core.rg.model.impl.RgGroupImpl <em>Rg Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.capralow.dt.conversion.plugin.core.rg.model.impl.RgGroupImpl
	 * @see ru.capralow.dt.conversion.plugin.core.rg.model.impl.rgPackageImpl#getRgGroup()
	 * @generated
	 */
	int RG_GROUP = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RG_GROUP__NAME = 0;

	/**
	 * The feature id for the '<em><b>Rules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RG_GROUP__RULES = 1;

	/**
	 * The number of structural features of the '<em>Rg Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RG_GROUP_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Rg Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RG_GROUP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ru.capralow.dt.conversion.plugin.core.rg.model.impl.RgRuleImpl <em>Rg Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.capralow.dt.conversion.plugin.core.rg.model.impl.RgRuleImpl
	 * @see ru.capralow.dt.conversion.plugin.core.rg.model.impl.rgPackageImpl#getRgRule()
	 * @generated
	 */
	int RG_RULE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RG_RULE__NAME = 0;

	/**
	 * The number of structural features of the '<em>Rg Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RG_RULE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Rg Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RG_RULE_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link ru.capralow.dt.conversion.plugin.core.rg.model.ReportGroups <em>Report Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Report Groups</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.rg.model.ReportGroups
	 * @generated
	 */
	EClass getReportGroups();

	/**
	 * Returns the meta object for the containment reference list '{@link ru.capralow.dt.conversion.plugin.core.rg.model.ReportGroups#getVariants <em>Variants</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Variants</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.rg.model.ReportGroups#getVariants()
	 * @see #getReportGroups()
	 * @generated
	 */
	EReference getReportGroups_Variants();

	/**
	 * Returns the meta object for the attribute '{@link ru.capralow.dt.conversion.plugin.core.rg.model.ReportGroups#getAddObjectsList <em>Add Objects List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Add Objects List</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.rg.model.ReportGroups#getAddObjectsList()
	 * @see #getReportGroups()
	 * @generated
	 */
	EAttribute getReportGroups_AddObjectsList();

	/**
	 * Returns the meta object for class '{@link ru.capralow.dt.conversion.plugin.core.rg.model.RgVariant <em>Rg Variant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rg Variant</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.rg.model.RgVariant
	 * @generated
	 */
	EClass getRgVariant();

	/**
	 * Returns the meta object for the attribute '{@link ru.capralow.dt.conversion.plugin.core.rg.model.RgVariant#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.rg.model.RgVariant#getName()
	 * @see #getRgVariant()
	 * @generated
	 */
	EAttribute getRgVariant_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link ru.capralow.dt.conversion.plugin.core.rg.model.RgVariant#getGroups <em>Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Groups</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.rg.model.RgVariant#getGroups()
	 * @see #getRgVariant()
	 * @generated
	 */
	EReference getRgVariant_Groups();

	/**
	 * Returns the meta object for class '{@link ru.capralow.dt.conversion.plugin.core.rg.model.RgGroup <em>Rg Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rg Group</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.rg.model.RgGroup
	 * @generated
	 */
	EClass getRgGroup();

	/**
	 * Returns the meta object for the attribute '{@link ru.capralow.dt.conversion.plugin.core.rg.model.RgGroup#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.rg.model.RgGroup#getName()
	 * @see #getRgGroup()
	 * @generated
	 */
	EAttribute getRgGroup_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link ru.capralow.dt.conversion.plugin.core.rg.model.RgGroup#getRules <em>Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rules</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.rg.model.RgGroup#getRules()
	 * @see #getRgGroup()
	 * @generated
	 */
	EReference getRgGroup_Rules();

	/**
	 * Returns the meta object for class '{@link ru.capralow.dt.conversion.plugin.core.rg.model.RgRule <em>Rg Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rg Rule</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.rg.model.RgRule
	 * @generated
	 */
	EClass getRgRule();

	/**
	 * Returns the meta object for the attribute '{@link ru.capralow.dt.conversion.plugin.core.rg.model.RgRule#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.rg.model.RgRule#getName()
	 * @see #getRgRule()
	 * @generated
	 */
	EAttribute getRgRule_Name();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	rgFactory getrgFactory();

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
		 * The meta object literal for the '{@link ru.capralow.dt.conversion.plugin.core.rg.model.impl.ReportGroupsImpl <em>Report Groups</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ru.capralow.dt.conversion.plugin.core.rg.model.impl.ReportGroupsImpl
		 * @see ru.capralow.dt.conversion.plugin.core.rg.model.impl.rgPackageImpl#getReportGroups()
		 * @generated
		 */
		EClass REPORT_GROUPS = eINSTANCE.getReportGroups();

		/**
		 * The meta object literal for the '<em><b>Variants</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPORT_GROUPS__VARIANTS = eINSTANCE.getReportGroups_Variants();

		/**
		 * The meta object literal for the '<em><b>Add Objects List</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPORT_GROUPS__ADD_OBJECTS_LIST = eINSTANCE.getReportGroups_AddObjectsList();

		/**
		 * The meta object literal for the '{@link ru.capralow.dt.conversion.plugin.core.rg.model.impl.RgVariantImpl <em>Rg Variant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ru.capralow.dt.conversion.plugin.core.rg.model.impl.RgVariantImpl
		 * @see ru.capralow.dt.conversion.plugin.core.rg.model.impl.rgPackageImpl#getRgVariant()
		 * @generated
		 */
		EClass RG_VARIANT = eINSTANCE.getRgVariant();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RG_VARIANT__NAME = eINSTANCE.getRgVariant_Name();

		/**
		 * The meta object literal for the '<em><b>Groups</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RG_VARIANT__GROUPS = eINSTANCE.getRgVariant_Groups();

		/**
		 * The meta object literal for the '{@link ru.capralow.dt.conversion.plugin.core.rg.model.impl.RgGroupImpl <em>Rg Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ru.capralow.dt.conversion.plugin.core.rg.model.impl.RgGroupImpl
		 * @see ru.capralow.dt.conversion.plugin.core.rg.model.impl.rgPackageImpl#getRgGroup()
		 * @generated
		 */
		EClass RG_GROUP = eINSTANCE.getRgGroup();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RG_GROUP__NAME = eINSTANCE.getRgGroup_Name();

		/**
		 * The meta object literal for the '<em><b>Rules</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RG_GROUP__RULES = eINSTANCE.getRgGroup_Rules();

		/**
		 * The meta object literal for the '{@link ru.capralow.dt.conversion.plugin.core.rg.model.impl.RgRuleImpl <em>Rg Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ru.capralow.dt.conversion.plugin.core.rg.model.impl.RgRuleImpl
		 * @see ru.capralow.dt.conversion.plugin.core.rg.model.impl.rgPackageImpl#getRgRule()
		 * @generated
		 */
		EClass RG_RULE = eINSTANCE.getRgRule();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RG_RULE__NAME = eINSTANCE.getRgRule_Name();

	}

} //rgPackage

/**
 */
package ru.capralow.dt.conversion.plugin.core.cm;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

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
	 * The feature id for the '<em><b>POD</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSION_MODULE__POD = 1;

	/**
	 * The feature id for the '<em><b>PKO</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSION_MODULE__PKO = 2;

	/**
	 * The feature id for the '<em><b>PKPD</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSION_MODULE__PKPD = 3;

	/**
	 * The feature id for the '<em><b>Params</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSION_MODULE__PARAMS = 4;

	/**
	 * The feature id for the '<em><b>Before Convertation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSION_MODULE__BEFORE_CONVERTATION = 5;

	/**
	 * The feature id for the '<em><b>After Convertation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSION_MODULE__AFTER_CONVERTATION = 6;

	/**
	 * The feature id for the '<em><b>Before Filling</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSION_MODULE__BEFORE_FILLING = 7;

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
	 * Returns the meta object for the attribute '{@link ru.capralow.dt.conversion.plugin.core.cm.ConversionModule#getPOD <em>POD</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>POD</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.ConversionModule#getPOD()
	 * @see #getConversionModule()
	 * @generated
	 */
	EAttribute getConversionModule_POD();

	/**
	 * Returns the meta object for the attribute '{@link ru.capralow.dt.conversion.plugin.core.cm.ConversionModule#getPKO <em>PKO</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>PKO</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.ConversionModule#getPKO()
	 * @see #getConversionModule()
	 * @generated
	 */
	EAttribute getConversionModule_PKO();

	/**
	 * Returns the meta object for the attribute '{@link ru.capralow.dt.conversion.plugin.core.cm.ConversionModule#getPKPD <em>PKPD</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>PKPD</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.ConversionModule#getPKPD()
	 * @see #getConversionModule()
	 * @generated
	 */
	EAttribute getConversionModule_PKPD();

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
	 * Returns the meta object for the attribute '{@link ru.capralow.dt.conversion.plugin.core.cm.ConversionModule#getBeforeConvertation <em>Before Convertation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Before Convertation</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.ConversionModule#getBeforeConvertation()
	 * @see #getConversionModule()
	 * @generated
	 */
	EAttribute getConversionModule_BeforeConvertation();

	/**
	 * Returns the meta object for the attribute '{@link ru.capralow.dt.conversion.plugin.core.cm.ConversionModule#getAfterConvertation <em>After Convertation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>After Convertation</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.ConversionModule#getAfterConvertation()
	 * @see #getConversionModule()
	 * @generated
	 */
	EAttribute getConversionModule_AfterConvertation();

	/**
	 * Returns the meta object for the attribute '{@link ru.capralow.dt.conversion.plugin.core.cm.ConversionModule#getBeforeFilling <em>Before Filling</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Before Filling</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.ConversionModule#getBeforeFilling()
	 * @see #getConversionModule()
	 * @generated
	 */
	EAttribute getConversionModule_BeforeFilling();

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
		 * The meta object literal for the '<em><b>POD</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONVERSION_MODULE__POD = eINSTANCE.getConversionModule_POD();

		/**
		 * The meta object literal for the '<em><b>PKO</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONVERSION_MODULE__PKO = eINSTANCE.getConversionModule_PKO();

		/**
		 * The meta object literal for the '<em><b>PKPD</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONVERSION_MODULE__PKPD = eINSTANCE.getConversionModule_PKPD();

		/**
		 * The meta object literal for the '<em><b>Params</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONVERSION_MODULE__PARAMS = eINSTANCE.getConversionModule_Params();

		/**
		 * The meta object literal for the '<em><b>Before Convertation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONVERSION_MODULE__BEFORE_CONVERTATION = eINSTANCE.getConversionModule_BeforeConvertation();

		/**
		 * The meta object literal for the '<em><b>After Convertation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONVERSION_MODULE__AFTER_CONVERTATION = eINSTANCE.getConversionModule_AfterConvertation();

		/**
		 * The meta object literal for the '<em><b>Before Filling</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONVERSION_MODULE__BEFORE_FILLING = eINSTANCE.getConversionModule_BeforeFilling();

		/**
		 * The meta object literal for the '<em><b>Algorithms</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONVERSION_MODULE__ALGORITHMS = eINSTANCE.getConversionModule_Algorithms();

	}

} //CmPackage

/**
 */
package ru.capralow.dt.conversion.plugin.core.cm.model.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import ru.capralow.dt.conversion.plugin.core.cm.model.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see ru.capralow.dt.conversion.plugin.core.cm.model.cmPackage
 * @generated
 */
public class cmAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static cmPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public cmAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = cmPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected cmSwitch<Adapter> modelSwitch =
		new cmSwitch<Adapter>() {
			@Override
			public Adapter caseConversionModule(ConversionModule object) {
				return createConversionModuleAdapter();
			}
			@Override
			public Adapter caseCmObject(CmObject object) {
				return createCmObjectAdapter();
			}
			@Override
			public Adapter caseCmDataRule(CmDataRule object) {
				return createCmDataRuleAdapter();
			}
			@Override
			public Adapter caseCmObjectRule(CmObjectRule object) {
				return createCmObjectRuleAdapter();
			}
			@Override
			public Adapter caseCmAttributeRule(CmAttributeRule object) {
				return createCmAttributeRuleAdapter();
			}
			@Override
			public Adapter caseCmPredefined(CmPredefined object) {
				return createCmPredefinedAdapter();
			}
			@Override
			public Adapter caseCmPredefinedValue(CmPredefinedValue object) {
				return createCmPredefinedValueAdapter();
			}
			@Override
			public Adapter caseCmPredefinedCatalogValue(CmPredefinedCatalogValue object) {
				return createCmPredefinedCatalogValueAdapter();
			}
			@Override
			public Adapter caseCmPredefinedEnumValue(CmPredefinedEnumValue object) {
				return createCmPredefinedEnumValueAdapter();
			}
			@Override
			public Adapter caseCmAlgorithm(CmAlgorithm object) {
				return createCmAlgorithmAdapter();
			}
			@Override
			public Adapter caseCmParam(CmParam object) {
				return createCmParamAdapter();
			}
			@Override
			public Adapter caseCmSubsystem(CmSubsystem object) {
				return createCmSubsystemAdapter();
			}
			@Override
			public Adapter caseCmGroup(CmGroup object) {
				return createCmGroupAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link ru.capralow.dt.conversion.plugin.core.cm.model.ConversionModule <em>Conversion Module</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.ConversionModule
	 * @generated
	 */
	public Adapter createConversionModuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ru.capralow.dt.conversion.plugin.core.cm.model.CmObject <em>Cm Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.CmObject
	 * @generated
	 */
	public Adapter createCmObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ru.capralow.dt.conversion.plugin.core.cm.model.CmDataRule <em>Cm Data Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.CmDataRule
	 * @generated
	 */
	public Adapter createCmDataRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ru.capralow.dt.conversion.plugin.core.cm.model.CmObjectRule <em>Cm Object Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.CmObjectRule
	 * @generated
	 */
	public Adapter createCmObjectRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ru.capralow.dt.conversion.plugin.core.cm.model.CmAttributeRule <em>Cm Attribute Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.CmAttributeRule
	 * @generated
	 */
	public Adapter createCmAttributeRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ru.capralow.dt.conversion.plugin.core.cm.model.CmPredefined <em>Cm Predefined</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.CmPredefined
	 * @generated
	 */
	public Adapter createCmPredefinedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ru.capralow.dt.conversion.plugin.core.cm.model.CmPredefinedValue <em>Cm Predefined Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.CmPredefinedValue
	 * @generated
	 */
	public Adapter createCmPredefinedValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ru.capralow.dt.conversion.plugin.core.cm.model.CmPredefinedCatalogValue <em>Cm Predefined Catalog Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.CmPredefinedCatalogValue
	 * @generated
	 */
	public Adapter createCmPredefinedCatalogValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ru.capralow.dt.conversion.plugin.core.cm.model.CmPredefinedEnumValue <em>Cm Predefined Enum Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.CmPredefinedEnumValue
	 * @generated
	 */
	public Adapter createCmPredefinedEnumValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ru.capralow.dt.conversion.plugin.core.cm.model.CmAlgorithm <em>Cm Algorithm</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.CmAlgorithm
	 * @generated
	 */
	public Adapter createCmAlgorithmAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ru.capralow.dt.conversion.plugin.core.cm.model.CmParam <em>Cm Param</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.CmParam
	 * @generated
	 */
	public Adapter createCmParamAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ru.capralow.dt.conversion.plugin.core.cm.model.CmSubsystem <em>Cm Subsystem</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.CmSubsystem
	 * @generated
	 */
	public Adapter createCmSubsystemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ru.capralow.dt.conversion.plugin.core.cm.model.CmGroup <em>Cm Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.CmGroup
	 * @generated
	 */
	public Adapter createCmGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //cmAdapterFactory

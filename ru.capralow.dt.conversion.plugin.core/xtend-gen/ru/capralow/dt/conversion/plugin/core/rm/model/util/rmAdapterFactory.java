/**
 */
package ru.capralow.dt.conversion.plugin.core.rm.model.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import ru.capralow.dt.conversion.plugin.core.rm.model.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see ru.capralow.dt.conversion.plugin.core.rm.model.rmPackage
 * @generated
 */
public class rmAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static rmPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public rmAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = rmPackage.eINSTANCE;
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
	protected rmSwitch<Adapter> modelSwitch =
		new rmSwitch<Adapter>() {
			@Override
			public Adapter caseRegistrationModule(RegistrationModule object) {
				return createRegistrationModuleAdapter();
			}
			@Override
			public Adapter caseExchangePlanContent(ExchangePlanContent object) {
				return createExchangePlanContentAdapter();
			}
			@Override
			public Adapter caseRegistrationRule(RegistrationRule object) {
				return createRegistrationRuleAdapter();
			}
			@Override
			public Adapter caseObjectSelectionRule(ObjectSelectionRule object) {
				return createObjectSelectionRuleAdapter();
			}
			@Override
			public Adapter caseExchangePlanSelectionRule(ExchangePlanSelectionRule object) {
				return createExchangePlanSelectionRuleAdapter();
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
	 * Creates a new adapter for an object of class '{@link ru.capralow.dt.conversion.plugin.core.rm.model.RegistrationModule <em>Registration Module</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ru.capralow.dt.conversion.plugin.core.rm.model.RegistrationModule
	 * @generated
	 */
	public Adapter createRegistrationModuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ru.capralow.dt.conversion.plugin.core.rm.model.ExchangePlanContent <em>Exchange Plan Content</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ru.capralow.dt.conversion.plugin.core.rm.model.ExchangePlanContent
	 * @generated
	 */
	public Adapter createExchangePlanContentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ru.capralow.dt.conversion.plugin.core.rm.model.RegistrationRule <em>Registration Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ru.capralow.dt.conversion.plugin.core.rm.model.RegistrationRule
	 * @generated
	 */
	public Adapter createRegistrationRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ru.capralow.dt.conversion.plugin.core.rm.model.ObjectSelectionRule <em>Object Selection Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ru.capralow.dt.conversion.plugin.core.rm.model.ObjectSelectionRule
	 * @generated
	 */
	public Adapter createObjectSelectionRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ru.capralow.dt.conversion.plugin.core.rm.model.ExchangePlanSelectionRule <em>Exchange Plan Selection Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ru.capralow.dt.conversion.plugin.core.rm.model.ExchangePlanSelectionRule
	 * @generated
	 */
	public Adapter createExchangePlanSelectionRuleAdapter() {
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

} //rmAdapterFactory

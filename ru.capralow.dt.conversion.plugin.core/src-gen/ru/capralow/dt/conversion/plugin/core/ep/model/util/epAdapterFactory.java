/**
 */
package ru.capralow.dt.conversion.plugin.core.ep.model.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import ru.capralow.dt.conversion.plugin.core.ep.model.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see ru.capralow.dt.conversion.plugin.core.ep.model.epPackage
 * @generated
 */
public class epAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static epPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public epAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = epPackage.eINSTANCE;
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
	protected epSwitch<Adapter> modelSwitch =
		new epSwitch<Adapter>() {
			@Override
			public Adapter caseExchangeProject(ExchangeProject object) {
				return createExchangeProjectAdapter();
			}
			@Override
			public Adapter caseExchangeProjects(ExchangeProjects object) {
				return createExchangeProjectsAdapter();
			}
			@Override
			public Adapter caseEpExtension(EpExtension object) {
				return createEpExtensionAdapter();
			}
			@Override
			public Adapter caseEpFormatVersion(EpFormatVersion object) {
				return createEpFormatVersionAdapter();
			}
			@Override
			public Adapter caseExchangeData(ExchangeData object) {
				return createExchangeDataAdapter();
			}
			@Override
			public Adapter caseEpExchangePair(EpExchangePair object) {
				return createEpExchangePairAdapter();
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
	 * Creates a new adapter for an object of class '{@link ru.capralow.dt.conversion.plugin.core.ep.model.ExchangeProject <em>Exchange Project</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ru.capralow.dt.conversion.plugin.core.ep.model.ExchangeProject
	 * @generated
	 */
	public Adapter createExchangeProjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ru.capralow.dt.conversion.plugin.core.ep.model.ExchangeProjects <em>Exchange Projects</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ru.capralow.dt.conversion.plugin.core.ep.model.ExchangeProjects
	 * @generated
	 */
	public Adapter createExchangeProjectsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ru.capralow.dt.conversion.plugin.core.ep.model.EpExtension <em>Ep Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ru.capralow.dt.conversion.plugin.core.ep.model.EpExtension
	 * @generated
	 */
	public Adapter createEpExtensionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ru.capralow.dt.conversion.plugin.core.ep.model.EpFormatVersion <em>Ep Format Version</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ru.capralow.dt.conversion.plugin.core.ep.model.EpFormatVersion
	 * @generated
	 */
	public Adapter createEpFormatVersionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ru.capralow.dt.conversion.plugin.core.ep.model.ExchangeData <em>Exchange Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ru.capralow.dt.conversion.plugin.core.ep.model.ExchangeData
	 * @generated
	 */
	public Adapter createExchangeDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ru.capralow.dt.conversion.plugin.core.ep.model.EpExchangePair <em>Ep Exchange Pair</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ru.capralow.dt.conversion.plugin.core.ep.model.EpExchangePair
	 * @generated
	 */
	public Adapter createEpExchangePairAdapter() {
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

} //epAdapterFactory

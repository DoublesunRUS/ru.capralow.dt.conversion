/**
 */
package ru.capralow.dt.conversion.plugin.core.cp.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import ru.capralow.dt.conversion.plugin.core.cp.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see ru.capralow.dt.conversion.plugin.core.cp.CpPackage
 * @generated
 */
public class CpAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CpPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CpAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = CpPackage.eINSTANCE;
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
	protected CpSwitch<Adapter> modelSwitch =
		new CpSwitch<Adapter>() {
			@Override
			public Adapter caseConversionPanel(ConversionPanel object) {
				return createConversionPanelAdapter();
			}
			@Override
			public Adapter casecpConfiguration(cpConfiguration object) {
				return createcpConfigurationAdapter();
			}
			@Override
			public Adapter casecpExtension(cpExtension object) {
				return createcpExtensionAdapter();
			}
			@Override
			public Adapter casecpFormatVersion(cpFormatVersion object) {
				return createcpFormatVersionAdapter();
			}
			@Override
			public Adapter casecpExchangePair(cpExchangePair object) {
				return createcpExchangePairAdapter();
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
	 * Creates a new adapter for an object of class '{@link ru.capralow.dt.conversion.plugin.core.cp.ConversionPanel <em>Conversion Panel</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ru.capralow.dt.conversion.plugin.core.cp.ConversionPanel
	 * @generated
	 */
	public Adapter createConversionPanelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ru.capralow.dt.conversion.plugin.core.cp.cpConfiguration <em>cp Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ru.capralow.dt.conversion.plugin.core.cp.cpConfiguration
	 * @generated
	 */
	public Adapter createcpConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ru.capralow.dt.conversion.plugin.core.cp.cpExtension <em>cp Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ru.capralow.dt.conversion.plugin.core.cp.cpExtension
	 * @generated
	 */
	public Adapter createcpExtensionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ru.capralow.dt.conversion.plugin.core.cp.cpFormatVersion <em>cp Format Version</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ru.capralow.dt.conversion.plugin.core.cp.cpFormatVersion
	 * @generated
	 */
	public Adapter createcpFormatVersionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ru.capralow.dt.conversion.plugin.core.cp.cpExchangePair <em>cp Exchange Pair</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ru.capralow.dt.conversion.plugin.core.cp.cpExchangePair
	 * @generated
	 */
	public Adapter createcpExchangePairAdapter() {
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

} //CpAdapterFactory

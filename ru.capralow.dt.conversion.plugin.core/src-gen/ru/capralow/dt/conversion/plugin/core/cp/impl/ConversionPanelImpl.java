/**
 */
package ru.capralow.dt.conversion.plugin.core.cp.impl;

import com.google.common.base.Objects;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.xcore.lib.XcoreCollectionLiterals;

import ru.capralow.dt.conversion.plugin.core.cp.ConversionPanel;
import ru.capralow.dt.conversion.plugin.core.cp.CpPackage;
import ru.capralow.dt.conversion.plugin.core.cp.cpConfiguration;
import ru.capralow.dt.conversion.plugin.core.cp.cpExchangePair;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Conversion Panel</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cp.impl.ConversionPanelImpl#getExchangePairs <em>Exchange Pairs</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cp.impl.ConversionPanelImpl#getConfigurations <em>Configurations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConversionPanelImpl extends MinimalEObjectImpl.Container implements ConversionPanel {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConversionPanelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpPackage.Literals.CONVERSION_PANEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<cpExchangePair> getExchangePairs() {
		return (EList<cpExchangePair>)eGet(CpPackage.Literals.CONVERSION_PANEL__EXCHANGE_PAIRS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<cpConfiguration> getConfigurations() {
		return (EList<cpConfiguration>)eGet(CpPackage.Literals.CONVERSION_PANEL__CONFIGURATIONS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public cpConfiguration getConfiguration(final String configurationName) {
		EList<cpConfiguration> _configurations = this.getConfigurations();
		for (final cpConfiguration configuration : _configurations) {
			String _configurationName = configuration.getConfigurationName();
			boolean _equals = Objects.equal(configurationName, _configurationName);
			if (_equals) {
				return configuration;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Object> getObjects() {
		final BasicEList<Object> result = XcoreCollectionLiterals.<Object>newBasicEList();
		EList<cpConfiguration> _configurations = this.getConfigurations();
		for (final cpConfiguration configuration : _configurations) {
			EList<Object> _coreObjects = configuration.getCoreObjects();
			for (final Object coreObject : _coreObjects) {
				result.add(coreObject);
			}
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case CpPackage.CONVERSION_PANEL___GET_CONFIGURATION__STRING:
				return getConfiguration((String)arguments.get(0));
			case CpPackage.CONVERSION_PANEL___GET_OBJECTS:
				return getObjects();
		}
		return super.eInvoke(operationID, arguments);
	}

} //ConversionPanelImpl

/**
 */
package ru.capralow.dt.conversion.plugin.core.cm.impl;

import com.google.common.base.Objects;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.xcore.lib.XcoreCollectionLiterals;

import ru.capralow.dt.conversion.plugin.core.cm.CmAlgorithm;
import ru.capralow.dt.conversion.plugin.core.cm.CmDataRule;
import ru.capralow.dt.conversion.plugin.core.cm.CmObjectRule;
import ru.capralow.dt.conversion.plugin.core.cm.CmPackage;
import ru.capralow.dt.conversion.plugin.core.cm.CmPredefined;
import ru.capralow.dt.conversion.plugin.core.cm.ConversionModule;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Conversion Module</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.impl.ConversionModuleImpl#getStoreVersion <em>Store Version</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.impl.ConversionModuleImpl#getModuleURI <em>Module URI</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.impl.ConversionModuleImpl#getParams <em>Params</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.impl.ConversionModuleImpl#getBeforeConvertationEvent <em>Before Convertation Event</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.impl.ConversionModuleImpl#getBeforeConvertationEventMethod <em>Before Convertation Event Method</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.impl.ConversionModuleImpl#getBeforeFillingEvent <em>Before Filling Event</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.impl.ConversionModuleImpl#getBeforeFillingEventMethod <em>Before Filling Event Method</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.impl.ConversionModuleImpl#getAfterConvertationEvent <em>After Convertation Event</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.impl.ConversionModuleImpl#getAfterConvertationEventMethod <em>After Convertation Event Method</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.impl.ConversionModuleImpl#getDataRules <em>Data Rules</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.impl.ConversionModuleImpl#getObjectRules <em>Object Rules</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.impl.ConversionModuleImpl#getPredefineds <em>Predefineds</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.impl.ConversionModuleImpl#getAlgorithms <em>Algorithms</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConversionModuleImpl extends MinimalEObjectImpl.Container implements ConversionModule {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConversionModuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CmPackage.Literals.CONVERSION_MODULE;
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
	public String getStoreVersion() {
		return (String)eGet(CmPackage.Literals.CONVERSION_MODULE__STORE_VERSION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStoreVersion(String newStoreVersion) {
		eSet(CmPackage.Literals.CONVERSION_MODULE__STORE_VERSION, newStoreVersion);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getModuleURI() {
		return (Object)eGet(CmPackage.Literals.CONVERSION_MODULE__MODULE_URI, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModuleURI(Object newModuleURI) {
		eSet(CmPackage.Literals.CONVERSION_MODULE__MODULE_URI, newModuleURI);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getParams() {
		return (String)eGet(CmPackage.Literals.CONVERSION_MODULE__PARAMS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParams(String newParams) {
		eSet(CmPackage.Literals.CONVERSION_MODULE__PARAMS, newParams);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBeforeConvertationEvent() {
		return (String)eGet(CmPackage.Literals.CONVERSION_MODULE__BEFORE_CONVERTATION_EVENT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBeforeConvertationEvent(String newBeforeConvertationEvent) {
		eSet(CmPackage.Literals.CONVERSION_MODULE__BEFORE_CONVERTATION_EVENT, newBeforeConvertationEvent);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getBeforeConvertationEventMethod() {
		return (Object)eGet(CmPackage.Literals.CONVERSION_MODULE__BEFORE_CONVERTATION_EVENT_METHOD, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBeforeConvertationEventMethod(Object newBeforeConvertationEventMethod) {
		eSet(CmPackage.Literals.CONVERSION_MODULE__BEFORE_CONVERTATION_EVENT_METHOD, newBeforeConvertationEventMethod);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBeforeFillingEvent() {
		return (String)eGet(CmPackage.Literals.CONVERSION_MODULE__BEFORE_FILLING_EVENT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBeforeFillingEvent(String newBeforeFillingEvent) {
		eSet(CmPackage.Literals.CONVERSION_MODULE__BEFORE_FILLING_EVENT, newBeforeFillingEvent);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getBeforeFillingEventMethod() {
		return (Object)eGet(CmPackage.Literals.CONVERSION_MODULE__BEFORE_FILLING_EVENT_METHOD, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBeforeFillingEventMethod(Object newBeforeFillingEventMethod) {
		eSet(CmPackage.Literals.CONVERSION_MODULE__BEFORE_FILLING_EVENT_METHOD, newBeforeFillingEventMethod);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAfterConvertationEvent() {
		return (String)eGet(CmPackage.Literals.CONVERSION_MODULE__AFTER_CONVERTATION_EVENT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAfterConvertationEvent(String newAfterConvertationEvent) {
		eSet(CmPackage.Literals.CONVERSION_MODULE__AFTER_CONVERTATION_EVENT, newAfterConvertationEvent);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getAfterConvertationEventMethod() {
		return (Object)eGet(CmPackage.Literals.CONVERSION_MODULE__AFTER_CONVERTATION_EVENT_METHOD, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAfterConvertationEventMethod(Object newAfterConvertationEventMethod) {
		eSet(CmPackage.Literals.CONVERSION_MODULE__AFTER_CONVERTATION_EVENT_METHOD, newAfterConvertationEventMethod);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<CmDataRule> getDataRules() {
		return (EList<CmDataRule>)eGet(CmPackage.Literals.CONVERSION_MODULE__DATA_RULES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<CmObjectRule> getObjectRules() {
		return (EList<CmObjectRule>)eGet(CmPackage.Literals.CONVERSION_MODULE__OBJECT_RULES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<CmPredefined> getPredefineds() {
		return (EList<CmPredefined>)eGet(CmPackage.Literals.CONVERSION_MODULE__PREDEFINEDS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<CmAlgorithm> getAlgorithms() {
		return (EList<CmAlgorithm>)eGet(CmPackage.Literals.CONVERSION_MODULE__ALGORITHMS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CmDataRule getDataRule(final String ruleName) {
		EList<CmDataRule> _dataRules = this.getDataRules();
		for (final CmDataRule dataRule : _dataRules) {
			String _name = dataRule.getName();
			boolean _equals = Objects.equal(ruleName, _name);
			if (_equals) {
				return dataRule;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Object> getSendingDataRules() {
		final BasicEList<Object> result = XcoreCollectionLiterals.<Object>newBasicEList();
		EList<CmDataRule> _dataRules = this.getDataRules();
		for (final CmDataRule dataRule : _dataRules) {
			Boolean _forSending = dataRule.getForSending();
			if ((_forSending).booleanValue()) {
				result.add(dataRule);
			}
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Object> getReceivingDataRules() {
		final BasicEList<Object> result = XcoreCollectionLiterals.<Object>newBasicEList();
		EList<CmDataRule> _dataRules = this.getDataRules();
		for (final CmDataRule dataRule : _dataRules) {
			Boolean _forReceiving = dataRule.getForReceiving();
			if ((_forReceiving).booleanValue()) {
				result.add(dataRule);
			}
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CmObjectRule getObjectRule(final String ruleName) {
		EList<CmObjectRule> _objectRules = this.getObjectRules();
		for (final CmObjectRule objectRule : _objectRules) {
			String _name = objectRule.getName();
			boolean _equals = Objects.equal(ruleName, _name);
			if (_equals) {
				return objectRule;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CmAlgorithm getAlgorithm(final String algorithmName) {
		EList<CmAlgorithm> _algorithms = this.getAlgorithms();
		for (final CmAlgorithm algorithm : _algorithms) {
			String _name = algorithm.getName();
			boolean _equals = Objects.equal(algorithmName, _name);
			if (_equals) {
				return algorithm;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAlgorithmsText(final String algorithmName) {
		String result = "";
		EList<CmAlgorithm> _algorithms = this.getAlgorithms();
		for (final CmAlgorithm algorithm : _algorithms) {
			String _name = algorithm.getName();
			boolean _notEquals = (!Objects.equal(algorithmName, _name));
			if (_notEquals) {
				String _result = result;
				String _text = algorithm.getText();
				String _lineSeparator = System.lineSeparator();
				String _plus = (_text + _lineSeparator);
				result = (_result + _plus);
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
			case CmPackage.CONVERSION_MODULE___GET_DATA_RULE__STRING:
				return getDataRule((String)arguments.get(0));
			case CmPackage.CONVERSION_MODULE___GET_SENDING_DATA_RULES:
				return getSendingDataRules();
			case CmPackage.CONVERSION_MODULE___GET_RECEIVING_DATA_RULES:
				return getReceivingDataRules();
			case CmPackage.CONVERSION_MODULE___GET_OBJECT_RULE__STRING:
				return getObjectRule((String)arguments.get(0));
			case CmPackage.CONVERSION_MODULE___GET_ALGORITHM__STRING:
				return getAlgorithm((String)arguments.get(0));
			case CmPackage.CONVERSION_MODULE___GET_ALGORITHMS_TEXT__STRING:
				return getAlgorithmsText((String)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //ConversionModuleImpl

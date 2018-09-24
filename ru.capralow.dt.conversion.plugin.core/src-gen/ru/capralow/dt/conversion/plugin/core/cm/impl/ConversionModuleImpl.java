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
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.impl.ConversionModuleImpl#getBeforeConvertationEventPrefix <em>Before Convertation Event Prefix</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.impl.ConversionModuleImpl#getBeforeConvertationEventSuffix <em>Before Convertation Event Suffix</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.impl.ConversionModuleImpl#getAfterConvertationEvent <em>After Convertation Event</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.impl.ConversionModuleImpl#getAfterConvertationEventPrefix <em>After Convertation Event Prefix</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.impl.ConversionModuleImpl#getAfterConvertationEventSuffix <em>After Convertation Event Suffix</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.impl.ConversionModuleImpl#getBeforeFillingEvent <em>Before Filling Event</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.impl.ConversionModuleImpl#getBeforeFillingEventPrefix <em>Before Filling Event Prefix</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.impl.ConversionModuleImpl#getBeforeFillingEventSuffix <em>Before Filling Event Suffix</em>}</li>
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
	public String getBeforeConvertationEventPrefix() {
		return (String)eGet(CmPackage.Literals.CONVERSION_MODULE__BEFORE_CONVERTATION_EVENT_PREFIX, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBeforeConvertationEventPrefix(String newBeforeConvertationEventPrefix) {
		eSet(CmPackage.Literals.CONVERSION_MODULE__BEFORE_CONVERTATION_EVENT_PREFIX, newBeforeConvertationEventPrefix);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBeforeConvertationEventSuffix() {
		return (String)eGet(CmPackage.Literals.CONVERSION_MODULE__BEFORE_CONVERTATION_EVENT_SUFFIX, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBeforeConvertationEventSuffix(String newBeforeConvertationEventSuffix) {
		eSet(CmPackage.Literals.CONVERSION_MODULE__BEFORE_CONVERTATION_EVENT_SUFFIX, newBeforeConvertationEventSuffix);
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
	public String getAfterConvertationEventPrefix() {
		return (String)eGet(CmPackage.Literals.CONVERSION_MODULE__AFTER_CONVERTATION_EVENT_PREFIX, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAfterConvertationEventPrefix(String newAfterConvertationEventPrefix) {
		eSet(CmPackage.Literals.CONVERSION_MODULE__AFTER_CONVERTATION_EVENT_PREFIX, newAfterConvertationEventPrefix);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAfterConvertationEventSuffix() {
		return (String)eGet(CmPackage.Literals.CONVERSION_MODULE__AFTER_CONVERTATION_EVENT_SUFFIX, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAfterConvertationEventSuffix(String newAfterConvertationEventSuffix) {
		eSet(CmPackage.Literals.CONVERSION_MODULE__AFTER_CONVERTATION_EVENT_SUFFIX, newAfterConvertationEventSuffix);
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
	public String getBeforeFillingEventPrefix() {
		return (String)eGet(CmPackage.Literals.CONVERSION_MODULE__BEFORE_FILLING_EVENT_PREFIX, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBeforeFillingEventPrefix(String newBeforeFillingEventPrefix) {
		eSet(CmPackage.Literals.CONVERSION_MODULE__BEFORE_FILLING_EVENT_PREFIX, newBeforeFillingEventPrefix);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBeforeFillingEventSuffix() {
		return (String)eGet(CmPackage.Literals.CONVERSION_MODULE__BEFORE_FILLING_EVENT_SUFFIX, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBeforeFillingEventSuffix(String newBeforeFillingEventSuffix) {
		eSet(CmPackage.Literals.CONVERSION_MODULE__BEFORE_FILLING_EVENT_SUFFIX, newBeforeFillingEventSuffix);
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
	public String getBeforeConvertationEventText() {
		String _beforeConvertationEventPrefix = this.getBeforeConvertationEventPrefix();
		String _lineSeparator = System.lineSeparator();
		String _plus = (_beforeConvertationEventPrefix + _lineSeparator);
		String _beforeConvertationEvent = this.getBeforeConvertationEvent();
		String _plus_1 = (_plus + _beforeConvertationEvent);
		String _lineSeparator_1 = System.lineSeparator();
		String _plus_2 = (_plus_1 + _lineSeparator_1);
		String _beforeConvertationEventSuffix = this.getBeforeConvertationEventSuffix();
		String result = (_plus_2 + _beforeConvertationEventSuffix);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAfterConvertationEventText() {
		String _afterConvertationEventPrefix = this.getAfterConvertationEventPrefix();
		String _lineSeparator = System.lineSeparator();
		String _plus = (_afterConvertationEventPrefix + _lineSeparator);
		String _afterConvertationEvent = this.getAfterConvertationEvent();
		String _plus_1 = (_plus + _afterConvertationEvent);
		String _lineSeparator_1 = System.lineSeparator();
		String _plus_2 = (_plus_1 + _lineSeparator_1);
		String _afterConvertationEventSuffix = this.getAfterConvertationEventSuffix();
		String result = (_plus_2 + _afterConvertationEventSuffix);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBeforeFillingEventText() {
		String _beforeFillingEventPrefix = this.getBeforeFillingEventPrefix();
		String _lineSeparator = System.lineSeparator();
		String _plus = (_beforeFillingEventPrefix + _lineSeparator);
		String _beforeFillingEvent = this.getBeforeFillingEvent();
		String _plus_1 = (_plus + _beforeFillingEvent);
		String _lineSeparator_1 = System.lineSeparator();
		String _plus_2 = (_plus_1 + _lineSeparator_1);
		String _beforeFillingEventSuffix = this.getBeforeFillingEventSuffix();
		String result = (_plus_2 + _beforeFillingEventSuffix);
		return result;
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
	public String getAllAlgorithmsText(final String algorithmName) {
		String result = "";
		EList<CmAlgorithm> _algorithms = this.getAlgorithms();
		for (final CmAlgorithm algorithm : _algorithms) {
			String _name = algorithm.getName();
			boolean _notEquals = (!Objects.equal(algorithmName, _name));
			if (_notEquals) {
				String _result = result;
				String _algorithmText = algorithm.getAlgorithmText();
				String _lineSeparator = System.lineSeparator();
				String _plus = (_algorithmText + _lineSeparator);
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
			case CmPackage.CONVERSION_MODULE___GET_BEFORE_CONVERTATION_EVENT_TEXT:
				return getBeforeConvertationEventText();
			case CmPackage.CONVERSION_MODULE___GET_AFTER_CONVERTATION_EVENT_TEXT:
				return getAfterConvertationEventText();
			case CmPackage.CONVERSION_MODULE___GET_BEFORE_FILLING_EVENT_TEXT:
				return getBeforeFillingEventText();
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
			case CmPackage.CONVERSION_MODULE___GET_ALL_ALGORITHMS_TEXT__STRING:
				return getAllAlgorithmsText((String)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //ConversionModuleImpl

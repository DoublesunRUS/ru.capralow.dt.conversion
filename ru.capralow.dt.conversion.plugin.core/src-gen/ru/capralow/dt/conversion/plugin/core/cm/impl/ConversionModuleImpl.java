/**
 */
package ru.capralow.dt.conversion.plugin.core.cm.impl;

import com._1c.g5.v8.bm.core.BmObject;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import ru.capralow.dt.conversion.plugin.core.cm.CmDataRule;
import ru.capralow.dt.conversion.plugin.core.cm.CmObjectRule;
import ru.capralow.dt.conversion.plugin.core.cm.CmPackage;
import ru.capralow.dt.conversion.plugin.core.cm.CmSendingRule;
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
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.impl.ConversionModuleImpl#getDataRules <em>Data Rules</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.impl.ConversionModuleImpl#getObjectRules <em>Object Rules</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.impl.ConversionModuleImpl#getPredefineds <em>Predefineds</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.impl.ConversionModuleImpl#getParams <em>Params</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.impl.ConversionModuleImpl#getBeforeConvertationEvent <em>Before Convertation Event</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.impl.ConversionModuleImpl#getAfterConvertationEvent <em>After Convertation Event</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.impl.ConversionModuleImpl#getBeforeFillingEvent <em>Before Filling Event</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.impl.ConversionModuleImpl#getSendingRules <em>Sending Rules</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.impl.ConversionModuleImpl#getAlgorithms <em>Algorithms</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConversionModuleImpl extends BmObject implements ConversionModule {
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
	public String getPredefineds() {
		return (String)eGet(CmPackage.Literals.CONVERSION_MODULE__PREDEFINEDS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPredefineds(String newPredefineds) {
		eSet(CmPackage.Literals.CONVERSION_MODULE__PREDEFINEDS, newPredefineds);
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
	@SuppressWarnings("unchecked")
	public EList<CmSendingRule> getSendingRules() {
		return (EList<CmSendingRule>)eGet(CmPackage.Literals.CONVERSION_MODULE__SENDING_RULES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAlgorithms() {
		return (String)eGet(CmPackage.Literals.CONVERSION_MODULE__ALGORITHMS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlgorithms(String newAlgorithms) {
		eSet(CmPackage.Literals.CONVERSION_MODULE__ALGORITHMS, newAlgorithms);
	}

} //ConversionModuleImpl

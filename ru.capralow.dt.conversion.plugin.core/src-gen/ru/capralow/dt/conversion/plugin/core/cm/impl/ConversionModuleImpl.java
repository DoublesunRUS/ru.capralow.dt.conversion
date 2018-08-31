/**
 */
package ru.capralow.dt.conversion.plugin.core.cm.impl;

import com._1c.g5.v8.bm.core.BmObject;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import ru.capralow.dt.conversion.plugin.core.cm.CmPackage;
import ru.capralow.dt.conversion.plugin.core.cm.ConversionModule;
import ru.capralow.dt.conversion.plugin.core.cm.cpPKO;
import ru.capralow.dt.conversion.plugin.core.cm.cpPOD;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Conversion Module</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.impl.ConversionModuleImpl#getStoreVersion <em>Store Version</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.impl.ConversionModuleImpl#getPODs <em>PO Ds</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.impl.ConversionModuleImpl#getPKOs <em>PK Os</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.impl.ConversionModuleImpl#getPKPDs <em>PKP Ds</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.impl.ConversionModuleImpl#getParams <em>Params</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.impl.ConversionModuleImpl#getBeforeConvertationEvent <em>Before Convertation Event</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.impl.ConversionModuleImpl#getAfterConvertationEvent <em>After Convertation Event</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.impl.ConversionModuleImpl#getBeforeFillingEvent <em>Before Filling Event</em>}</li>
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
	public EList<cpPOD> getPODs() {
		return (EList<cpPOD>)eGet(CmPackage.Literals.CONVERSION_MODULE__PO_DS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<cpPKO> getPKOs() {
		return (EList<cpPKO>)eGet(CmPackage.Literals.CONVERSION_MODULE__PK_OS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPKPDs() {
		return (String)eGet(CmPackage.Literals.CONVERSION_MODULE__PKP_DS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPKPDs(String newPKPDs) {
		eSet(CmPackage.Literals.CONVERSION_MODULE__PKP_DS, newPKPDs);
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

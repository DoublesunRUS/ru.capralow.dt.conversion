/**
 */
package ru.capralow.dt.conversion.plugin.core.cm.impl;

import com._1c.g5.v8.bm.core.BmObject;

import org.eclipse.emf.ecore.EClass;

import ru.capralow.dt.conversion.plugin.core.cm.CmPackage;
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
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.impl.ConversionModuleImpl#getPOD <em>POD</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.impl.ConversionModuleImpl#getPKO <em>PKO</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.impl.ConversionModuleImpl#getPKPD <em>PKPD</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.impl.ConversionModuleImpl#getParams <em>Params</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.impl.ConversionModuleImpl#getBeforeConvertation <em>Before Convertation</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.impl.ConversionModuleImpl#getAfterConvertation <em>After Convertation</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.impl.ConversionModuleImpl#getBeforeFilling <em>Before Filling</em>}</li>
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
	public String getPOD() {
		return (String)eGet(CmPackage.Literals.CONVERSION_MODULE__POD, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPOD(String newPOD) {
		eSet(CmPackage.Literals.CONVERSION_MODULE__POD, newPOD);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPKO() {
		return (String)eGet(CmPackage.Literals.CONVERSION_MODULE__PKO, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPKO(String newPKO) {
		eSet(CmPackage.Literals.CONVERSION_MODULE__PKO, newPKO);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPKPD() {
		return (String)eGet(CmPackage.Literals.CONVERSION_MODULE__PKPD, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPKPD(String newPKPD) {
		eSet(CmPackage.Literals.CONVERSION_MODULE__PKPD, newPKPD);
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
	public String getBeforeConvertation() {
		return (String)eGet(CmPackage.Literals.CONVERSION_MODULE__BEFORE_CONVERTATION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBeforeConvertation(String newBeforeConvertation) {
		eSet(CmPackage.Literals.CONVERSION_MODULE__BEFORE_CONVERTATION, newBeforeConvertation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAfterConvertation() {
		return (String)eGet(CmPackage.Literals.CONVERSION_MODULE__AFTER_CONVERTATION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAfterConvertation(String newAfterConvertation) {
		eSet(CmPackage.Literals.CONVERSION_MODULE__AFTER_CONVERTATION, newAfterConvertation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBeforeFilling() {
		return (String)eGet(CmPackage.Literals.CONVERSION_MODULE__BEFORE_FILLING, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBeforeFilling(String newBeforeFilling) {
		eSet(CmPackage.Literals.CONVERSION_MODULE__BEFORE_FILLING, newBeforeFilling);
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

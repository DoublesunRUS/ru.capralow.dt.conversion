/**
 */
package ru.capralow.dt.conversion.plugin.core.cm.impl;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import ru.capralow.dt.conversion.plugin.core.cm.CmAlgorithm;
import ru.capralow.dt.conversion.plugin.core.cm.CmMethodType;
import ru.capralow.dt.conversion.plugin.core.cm.CmPackage;
import ru.capralow.dt.conversion.plugin.core.cm.ConversionModule;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Algorithm</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.impl.CmAlgorithmImpl#getConversionModule <em>Conversion Module</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.impl.CmAlgorithmImpl#getName <em>Name</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.impl.CmAlgorithmImpl#getMethod <em>Method</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.impl.CmAlgorithmImpl#getMethodType <em>Method Type</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.impl.CmAlgorithmImpl#getParams <em>Params</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.impl.CmAlgorithmImpl#getText <em>Text</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.impl.CmAlgorithmImpl#getIsExport <em>Is Export</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CmAlgorithmImpl extends MinimalEObjectImpl.Container implements CmAlgorithm {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CmAlgorithmImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CmPackage.Literals.CM_ALGORITHM;
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
	public ConversionModule getConversionModule() {
		return (ConversionModule)eGet(CmPackage.Literals.CM_ALGORITHM__CONVERSION_MODULE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConversionModule(ConversionModule newConversionModule) {
		eSet(CmPackage.Literals.CM_ALGORITHM__CONVERSION_MODULE, newConversionModule);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return (String)eGet(CmPackage.Literals.CM_ALGORITHM__NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eSet(CmPackage.Literals.CM_ALGORITHM__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getMethod() {
		return (Object)eGet(CmPackage.Literals.CM_ALGORITHM__METHOD, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMethod(Object newMethod) {
		eSet(CmPackage.Literals.CM_ALGORITHM__METHOD, newMethod);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CmMethodType getMethodType() {
		return (CmMethodType)eGet(CmPackage.Literals.CM_ALGORITHM__METHOD_TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMethodType(CmMethodType newMethodType) {
		eSet(CmPackage.Literals.CM_ALGORITHM__METHOD_TYPE, newMethodType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getParams() {
		return (String)eGet(CmPackage.Literals.CM_ALGORITHM__PARAMS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParams(String newParams) {
		eSet(CmPackage.Literals.CM_ALGORITHM__PARAMS, newParams);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText() {
		return (String)eGet(CmPackage.Literals.CM_ALGORITHM__TEXT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setText(String newText) {
		eSet(CmPackage.Literals.CM_ALGORITHM__TEXT, newText);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsExport() {
		return (Boolean)eGet(CmPackage.Literals.CM_ALGORITHM__IS_EXPORT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsExport(Boolean newIsExport) {
		eSet(CmPackage.Literals.CM_ALGORITHM__IS_EXPORT, newIsExport);
	}

} //CmAlgorithmImpl

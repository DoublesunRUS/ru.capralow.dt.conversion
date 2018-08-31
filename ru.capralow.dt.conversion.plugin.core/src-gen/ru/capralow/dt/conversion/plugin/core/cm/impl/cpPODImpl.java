/**
 */
package ru.capralow.dt.conversion.plugin.core.cm.impl;

import com._1c.g5.v8.bm.core.BmObject;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import ru.capralow.dt.conversion.plugin.core.cm.CmPackage;
import ru.capralow.dt.conversion.plugin.core.cm.SelectionVariant;
import ru.capralow.dt.conversion.plugin.core.cm.cpPKO;
import ru.capralow.dt.conversion.plugin.core.cm.cpPOD;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>cp POD</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.impl.cpPODImpl#getName <em>Name</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.impl.cpPODImpl#getDataSelectionEvent <em>Data Selection Event</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.impl.cpPODImpl#getBeforeProcessingEvent <em>Before Processing Event</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.impl.cpPODImpl#getOnProcessingEvent <em>On Processing Event</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.impl.cpPODImpl#getForSending <em>For Sending</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.impl.cpPODImpl#getForReceiving <em>For Receiving</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.impl.cpPODImpl#getConfigurationObject <em>Configuration Object</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.impl.cpPODImpl#getFormatObject <em>Format Object</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.impl.cpPODImpl#getIsDisabled <em>Is Disabled</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.impl.cpPODImpl#getIsDataCleaning <em>Is Data Cleaning</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.impl.cpPODImpl#getSelectionVariant <em>Selection Variant</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.impl.cpPODImpl#getPKOs <em>PK Os</em>}</li>
 * </ul>
 *
 * @generated
 */
public class cpPODImpl extends BmObject implements cpPOD {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public cpPODImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CmPackage.Literals.CP_POD;
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
	public String getName() {
		return (String)eGet(CmPackage.Literals.CP_POD__NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eSet(CmPackage.Literals.CP_POD__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDataSelectionEvent() {
		return (String)eGet(CmPackage.Literals.CP_POD__DATA_SELECTION_EVENT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataSelectionEvent(String newDataSelectionEvent) {
		eSet(CmPackage.Literals.CP_POD__DATA_SELECTION_EVENT, newDataSelectionEvent);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBeforeProcessingEvent() {
		return (String)eGet(CmPackage.Literals.CP_POD__BEFORE_PROCESSING_EVENT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBeforeProcessingEvent(String newBeforeProcessingEvent) {
		eSet(CmPackage.Literals.CP_POD__BEFORE_PROCESSING_EVENT, newBeforeProcessingEvent);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOnProcessingEvent() {
		return (String)eGet(CmPackage.Literals.CP_POD__ON_PROCESSING_EVENT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOnProcessingEvent(String newOnProcessingEvent) {
		eSet(CmPackage.Literals.CP_POD__ON_PROCESSING_EVENT, newOnProcessingEvent);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getForSending() {
		return (Boolean)eGet(CmPackage.Literals.CP_POD__FOR_SENDING, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setForSending(Boolean newForSending) {
		eSet(CmPackage.Literals.CP_POD__FOR_SENDING, newForSending);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getForReceiving() {
		return (Boolean)eGet(CmPackage.Literals.CP_POD__FOR_RECEIVING, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setForReceiving(Boolean newForReceiving) {
		eSet(CmPackage.Literals.CP_POD__FOR_RECEIVING, newForReceiving);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getConfigurationObject() {
		return (Object)eGet(CmPackage.Literals.CP_POD__CONFIGURATION_OBJECT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConfigurationObject(Object newConfigurationObject) {
		eSet(CmPackage.Literals.CP_POD__CONFIGURATION_OBJECT, newConfigurationObject);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFormatObject() {
		return (String)eGet(CmPackage.Literals.CP_POD__FORMAT_OBJECT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFormatObject(String newFormatObject) {
		eSet(CmPackage.Literals.CP_POD__FORMAT_OBJECT, newFormatObject);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsDisabled() {
		return (Boolean)eGet(CmPackage.Literals.CP_POD__IS_DISABLED, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsDisabled(Boolean newIsDisabled) {
		eSet(CmPackage.Literals.CP_POD__IS_DISABLED, newIsDisabled);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsDataCleaning() {
		return (Boolean)eGet(CmPackage.Literals.CP_POD__IS_DATA_CLEANING, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsDataCleaning(Boolean newIsDataCleaning) {
		eSet(CmPackage.Literals.CP_POD__IS_DATA_CLEANING, newIsDataCleaning);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SelectionVariant getSelectionVariant() {
		return (SelectionVariant)eGet(CmPackage.Literals.CP_POD__SELECTION_VARIANT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSelectionVariant(SelectionVariant newSelectionVariant) {
		eSet(CmPackage.Literals.CP_POD__SELECTION_VARIANT, newSelectionVariant);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<cpPKO> getPKOs() {
		return (EList<cpPKO>)eGet(CmPackage.Literals.CP_POD__PK_OS, true);
	}

} //cpPODImpl

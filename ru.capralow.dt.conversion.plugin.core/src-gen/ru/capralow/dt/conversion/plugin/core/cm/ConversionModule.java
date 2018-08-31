/**
 */
package ru.capralow.dt.conversion.plugin.core.cm;

import com._1c.g5.v8.bm.core.IBmObject;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conversion Module</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.ConversionModule#getStoreVersion <em>Store Version</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.ConversionModule#getPODs <em>PO Ds</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.ConversionModule#getPKOs <em>PK Os</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.ConversionModule#getPKPDs <em>PKP Ds</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.ConversionModule#getParams <em>Params</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.ConversionModule#getBeforeConvertationEvent <em>Before Convertation Event</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.ConversionModule#getAfterConvertationEvent <em>After Convertation Event</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.ConversionModule#getBeforeFillingEvent <em>Before Filling Event</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.ConversionModule#getAlgorithms <em>Algorithms</em>}</li>
 * </ul>
 *
 * @see ru.capralow.dt.conversion.plugin.core.cm.CmPackage#getConversionModule()
 * @model
 * @extends IBmObject
 * @generated
 */
public interface ConversionModule extends IBmObject {
	/**
	 * Returns the value of the '<em><b>Store Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Store Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Store Version</em>' attribute.
	 * @see #setStoreVersion(String)
	 * @see ru.capralow.dt.conversion.plugin.core.cm.CmPackage#getConversionModule_StoreVersion()
	 * @model unique="false"
	 * @generated
	 */
	String getStoreVersion();

	/**
	 * Sets the value of the '{@link ru.capralow.dt.conversion.plugin.core.cm.ConversionModule#getStoreVersion <em>Store Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Store Version</em>' attribute.
	 * @see #getStoreVersion()
	 * @generated
	 */
	void setStoreVersion(String value);

	/**
	 * Returns the value of the '<em><b>PO Ds</b></em>' containment reference list.
	 * The list contents are of type {@link ru.capralow.dt.conversion.plugin.core.cm.cpPOD}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PO Ds</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PO Ds</em>' containment reference list.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.CmPackage#getConversionModule_PODs()
	 * @model containment="true"
	 * @generated
	 */
	EList<cpPOD> getPODs();

	/**
	 * Returns the value of the '<em><b>PK Os</b></em>' containment reference list.
	 * The list contents are of type {@link ru.capralow.dt.conversion.plugin.core.cm.cpPKO}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PK Os</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PK Os</em>' containment reference list.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.CmPackage#getConversionModule_PKOs()
	 * @model containment="true"
	 * @generated
	 */
	EList<cpPKO> getPKOs();

	/**
	 * Returns the value of the '<em><b>PKP Ds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PKP Ds</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PKP Ds</em>' attribute.
	 * @see #setPKPDs(String)
	 * @see ru.capralow.dt.conversion.plugin.core.cm.CmPackage#getConversionModule_PKPDs()
	 * @model unique="false"
	 * @generated
	 */
	String getPKPDs();

	/**
	 * Sets the value of the '{@link ru.capralow.dt.conversion.plugin.core.cm.ConversionModule#getPKPDs <em>PKP Ds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PKP Ds</em>' attribute.
	 * @see #getPKPDs()
	 * @generated
	 */
	void setPKPDs(String value);

	/**
	 * Returns the value of the '<em><b>Params</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Params</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Params</em>' attribute.
	 * @see #setParams(String)
	 * @see ru.capralow.dt.conversion.plugin.core.cm.CmPackage#getConversionModule_Params()
	 * @model unique="false"
	 * @generated
	 */
	String getParams();

	/**
	 * Sets the value of the '{@link ru.capralow.dt.conversion.plugin.core.cm.ConversionModule#getParams <em>Params</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Params</em>' attribute.
	 * @see #getParams()
	 * @generated
	 */
	void setParams(String value);

	/**
	 * Returns the value of the '<em><b>Before Convertation Event</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Before Convertation Event</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Before Convertation Event</em>' attribute.
	 * @see #setBeforeConvertationEvent(String)
	 * @see ru.capralow.dt.conversion.plugin.core.cm.CmPackage#getConversionModule_BeforeConvertationEvent()
	 * @model unique="false"
	 * @generated
	 */
	String getBeforeConvertationEvent();

	/**
	 * Sets the value of the '{@link ru.capralow.dt.conversion.plugin.core.cm.ConversionModule#getBeforeConvertationEvent <em>Before Convertation Event</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Before Convertation Event</em>' attribute.
	 * @see #getBeforeConvertationEvent()
	 * @generated
	 */
	void setBeforeConvertationEvent(String value);

	/**
	 * Returns the value of the '<em><b>After Convertation Event</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>After Convertation Event</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>After Convertation Event</em>' attribute.
	 * @see #setAfterConvertationEvent(String)
	 * @see ru.capralow.dt.conversion.plugin.core.cm.CmPackage#getConversionModule_AfterConvertationEvent()
	 * @model unique="false"
	 * @generated
	 */
	String getAfterConvertationEvent();

	/**
	 * Sets the value of the '{@link ru.capralow.dt.conversion.plugin.core.cm.ConversionModule#getAfterConvertationEvent <em>After Convertation Event</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>After Convertation Event</em>' attribute.
	 * @see #getAfterConvertationEvent()
	 * @generated
	 */
	void setAfterConvertationEvent(String value);

	/**
	 * Returns the value of the '<em><b>Before Filling Event</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Before Filling Event</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Before Filling Event</em>' attribute.
	 * @see #setBeforeFillingEvent(String)
	 * @see ru.capralow.dt.conversion.plugin.core.cm.CmPackage#getConversionModule_BeforeFillingEvent()
	 * @model unique="false"
	 * @generated
	 */
	String getBeforeFillingEvent();

	/**
	 * Sets the value of the '{@link ru.capralow.dt.conversion.plugin.core.cm.ConversionModule#getBeforeFillingEvent <em>Before Filling Event</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Before Filling Event</em>' attribute.
	 * @see #getBeforeFillingEvent()
	 * @generated
	 */
	void setBeforeFillingEvent(String value);

	/**
	 * Returns the value of the '<em><b>Algorithms</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Algorithms</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Algorithms</em>' attribute.
	 * @see #setAlgorithms(String)
	 * @see ru.capralow.dt.conversion.plugin.core.cm.CmPackage#getConversionModule_Algorithms()
	 * @model unique="false"
	 * @generated
	 */
	String getAlgorithms();

	/**
	 * Sets the value of the '{@link ru.capralow.dt.conversion.plugin.core.cm.ConversionModule#getAlgorithms <em>Algorithms</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Algorithms</em>' attribute.
	 * @see #getAlgorithms()
	 * @generated
	 */
	void setAlgorithms(String value);

} // ConversionModule

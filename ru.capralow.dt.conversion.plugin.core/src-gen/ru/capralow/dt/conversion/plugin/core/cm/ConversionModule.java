/**
 */
package ru.capralow.dt.conversion.plugin.core.cm;

import com._1c.g5.v8.bm.core.IBmObject;

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
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.ConversionModule#getPOD <em>POD</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.ConversionModule#getPKO <em>PKO</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.ConversionModule#getPKPD <em>PKPD</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.ConversionModule#getParams <em>Params</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.ConversionModule#getBeforeConvertation <em>Before Convertation</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.ConversionModule#getAfterConvertation <em>After Convertation</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.ConversionModule#getBeforeFilling <em>Before Filling</em>}</li>
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
	 * Returns the value of the '<em><b>POD</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>POD</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>POD</em>' attribute.
	 * @see #setPOD(String)
	 * @see ru.capralow.dt.conversion.plugin.core.cm.CmPackage#getConversionModule_POD()
	 * @model unique="false"
	 * @generated
	 */
	String getPOD();

	/**
	 * Sets the value of the '{@link ru.capralow.dt.conversion.plugin.core.cm.ConversionModule#getPOD <em>POD</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>POD</em>' attribute.
	 * @see #getPOD()
	 * @generated
	 */
	void setPOD(String value);

	/**
	 * Returns the value of the '<em><b>PKO</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PKO</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PKO</em>' attribute.
	 * @see #setPKO(String)
	 * @see ru.capralow.dt.conversion.plugin.core.cm.CmPackage#getConversionModule_PKO()
	 * @model unique="false"
	 * @generated
	 */
	String getPKO();

	/**
	 * Sets the value of the '{@link ru.capralow.dt.conversion.plugin.core.cm.ConversionModule#getPKO <em>PKO</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PKO</em>' attribute.
	 * @see #getPKO()
	 * @generated
	 */
	void setPKO(String value);

	/**
	 * Returns the value of the '<em><b>PKPD</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PKPD</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PKPD</em>' attribute.
	 * @see #setPKPD(String)
	 * @see ru.capralow.dt.conversion.plugin.core.cm.CmPackage#getConversionModule_PKPD()
	 * @model unique="false"
	 * @generated
	 */
	String getPKPD();

	/**
	 * Sets the value of the '{@link ru.capralow.dt.conversion.plugin.core.cm.ConversionModule#getPKPD <em>PKPD</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PKPD</em>' attribute.
	 * @see #getPKPD()
	 * @generated
	 */
	void setPKPD(String value);

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
	 * Returns the value of the '<em><b>Before Convertation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Before Convertation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Before Convertation</em>' attribute.
	 * @see #setBeforeConvertation(String)
	 * @see ru.capralow.dt.conversion.plugin.core.cm.CmPackage#getConversionModule_BeforeConvertation()
	 * @model unique="false"
	 * @generated
	 */
	String getBeforeConvertation();

	/**
	 * Sets the value of the '{@link ru.capralow.dt.conversion.plugin.core.cm.ConversionModule#getBeforeConvertation <em>Before Convertation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Before Convertation</em>' attribute.
	 * @see #getBeforeConvertation()
	 * @generated
	 */
	void setBeforeConvertation(String value);

	/**
	 * Returns the value of the '<em><b>After Convertation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>After Convertation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>After Convertation</em>' attribute.
	 * @see #setAfterConvertation(String)
	 * @see ru.capralow.dt.conversion.plugin.core.cm.CmPackage#getConversionModule_AfterConvertation()
	 * @model unique="false"
	 * @generated
	 */
	String getAfterConvertation();

	/**
	 * Sets the value of the '{@link ru.capralow.dt.conversion.plugin.core.cm.ConversionModule#getAfterConvertation <em>After Convertation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>After Convertation</em>' attribute.
	 * @see #getAfterConvertation()
	 * @generated
	 */
	void setAfterConvertation(String value);

	/**
	 * Returns the value of the '<em><b>Before Filling</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Before Filling</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Before Filling</em>' attribute.
	 * @see #setBeforeFilling(String)
	 * @see ru.capralow.dt.conversion.plugin.core.cm.CmPackage#getConversionModule_BeforeFilling()
	 * @model unique="false"
	 * @generated
	 */
	String getBeforeFilling();

	/**
	 * Sets the value of the '{@link ru.capralow.dt.conversion.plugin.core.cm.ConversionModule#getBeforeFilling <em>Before Filling</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Before Filling</em>' attribute.
	 * @see #getBeforeFilling()
	 * @generated
	 */
	void setBeforeFilling(String value);

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

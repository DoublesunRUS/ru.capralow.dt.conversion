/**
 */
package ru.capralow.dt.conversion.plugin.core.rm;

import com._1c.g5.v8.bm.core.IBmObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Exchange Plan Content</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.rm.ExchangePlanContent#getMdObject <em>Md Object</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.rm.ExchangePlanContent#getAutoRecord <em>Auto Record</em>}</li>
 * </ul>
 *
 * @see ru.capralow.dt.conversion.plugin.core.rm.RmPackage#getExchangePlanContent()
 * @model
 * @extends IBmObject
 * @generated
 */
public interface ExchangePlanContent extends IBmObject {
	/**
	 * Returns the value of the '<em><b>Md Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Md Object</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Md Object</em>' attribute.
	 * @see #setMdObject(String)
	 * @see ru.capralow.dt.conversion.plugin.core.rm.RmPackage#getExchangePlanContent_MdObject()
	 * @model unique="false"
	 * @generated
	 */
	String getMdObject();

	/**
	 * Sets the value of the '{@link ru.capralow.dt.conversion.plugin.core.rm.ExchangePlanContent#getMdObject <em>Md Object</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Md Object</em>' attribute.
	 * @see #getMdObject()
	 * @generated
	 */
	void setMdObject(String value);

	/**
	 * Returns the value of the '<em><b>Auto Record</b></em>' attribute.
	 * The literals are from the enumeration {@link ru.capralow.dt.conversion.plugin.core.rm.AutoRegistration}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Auto Record</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Auto Record</em>' attribute.
	 * @see ru.capralow.dt.conversion.plugin.core.rm.AutoRegistration
	 * @see #setAutoRecord(AutoRegistration)
	 * @see ru.capralow.dt.conversion.plugin.core.rm.RmPackage#getExchangePlanContent_AutoRecord()
	 * @model unique="false"
	 * @generated
	 */
	AutoRegistration getAutoRecord();

	/**
	 * Sets the value of the '{@link ru.capralow.dt.conversion.plugin.core.rm.ExchangePlanContent#getAutoRecord <em>Auto Record</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Auto Record</em>' attribute.
	 * @see ru.capralow.dt.conversion.plugin.core.rm.AutoRegistration
	 * @see #getAutoRecord()
	 * @generated
	 */
	void setAutoRecord(AutoRegistration value);

} // ExchangePlanContent

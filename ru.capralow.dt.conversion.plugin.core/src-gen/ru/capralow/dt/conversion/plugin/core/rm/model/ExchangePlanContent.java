/**
 */
package ru.capralow.dt.conversion.plugin.core.rm.model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Exchange Plan Content</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.rm.model.ExchangePlanContent#getMdObject <em>Md Object</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.rm.model.ExchangePlanContent#getAutoRecord <em>Auto Record</em>}</li>
 * </ul>
 *
 * @see ru.capralow.dt.conversion.plugin.core.rm.model.rmPackage#getExchangePlanContent()
 * @model
 * @generated
 */
public interface ExchangePlanContent extends EObject {
	/**
	 * Returns the value of the '<em><b>Md Object</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Md Object</em>' attribute.
	 * @see #setMdObject(String)
	 * @see ru.capralow.dt.conversion.plugin.core.rm.model.rmPackage#getExchangePlanContent_MdObject()
	 * @model default="" unique="false"
	 * @generated
	 */
	String getMdObject();

	/**
	 * Sets the value of the '{@link ru.capralow.dt.conversion.plugin.core.rm.model.ExchangePlanContent#getMdObject <em>Md Object</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Md Object</em>' attribute.
	 * @see #getMdObject()
	 * @generated
	 */
	void setMdObject(String value);

	/**
	 * Returns the value of the '<em><b>Auto Record</b></em>' attribute.
	 * The literals are from the enumeration {@link ru.capralow.dt.conversion.plugin.core.rm.model.AutoRegistration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Auto Record</em>' attribute.
	 * @see ru.capralow.dt.conversion.plugin.core.rm.model.AutoRegistration
	 * @see #setAutoRecord(AutoRegistration)
	 * @see ru.capralow.dt.conversion.plugin.core.rm.model.rmPackage#getExchangePlanContent_AutoRecord()
	 * @model unique="false"
	 * @generated
	 */
	AutoRegistration getAutoRecord();

	/**
	 * Sets the value of the '{@link ru.capralow.dt.conversion.plugin.core.rm.model.ExchangePlanContent#getAutoRecord <em>Auto Record</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Auto Record</em>' attribute.
	 * @see ru.capralow.dt.conversion.plugin.core.rm.model.AutoRegistration
	 * @see #getAutoRecord()
	 * @generated
	 */
	void setAutoRecord(AutoRegistration value);

} // ExchangePlanContent

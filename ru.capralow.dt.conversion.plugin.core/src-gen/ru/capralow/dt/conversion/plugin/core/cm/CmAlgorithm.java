/**
 */
package ru.capralow.dt.conversion.plugin.core.cm;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Algorithm</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.CmAlgorithm#getConversionModule <em>Conversion Module</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.CmAlgorithm#getName <em>Name</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.CmAlgorithm#getMethod <em>Method</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.CmAlgorithm#getMethodType <em>Method Type</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.CmAlgorithm#getParams <em>Params</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.CmAlgorithm#getText <em>Text</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.CmAlgorithm#getIsExport <em>Is Export</em>}</li>
 * </ul>
 *
 * @see ru.capralow.dt.conversion.plugin.core.cm.CmPackage#getCmAlgorithm()
 * @model
 * @generated
 */
public interface CmAlgorithm extends EObject {
	/**
	 * Returns the value of the '<em><b>Conversion Module</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link ru.capralow.dt.conversion.plugin.core.cm.ConversionModule#getAlgorithms <em>Algorithms</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conversion Module</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conversion Module</em>' container reference.
	 * @see #setConversionModule(ConversionModule)
	 * @see ru.capralow.dt.conversion.plugin.core.cm.CmPackage#getCmAlgorithm_ConversionModule()
	 * @see ru.capralow.dt.conversion.plugin.core.cm.ConversionModule#getAlgorithms
	 * @model opposite="algorithms" transient="false"
	 * @generated
	 */
	ConversionModule getConversionModule();

	/**
	 * Sets the value of the '{@link ru.capralow.dt.conversion.plugin.core.cm.CmAlgorithm#getConversionModule <em>Conversion Module</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conversion Module</em>' container reference.
	 * @see #getConversionModule()
	 * @generated
	 */
	void setConversionModule(ConversionModule value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see ru.capralow.dt.conversion.plugin.core.cm.CmPackage#getCmAlgorithm_Name()
	 * @model default="" unique="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ru.capralow.dt.conversion.plugin.core.cm.CmAlgorithm#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Method</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Method</em>' attribute.
	 * @see #setMethod(Object)
	 * @see ru.capralow.dt.conversion.plugin.core.cm.CmPackage#getCmAlgorithm_Method()
	 * @model unique="false"
	 * @generated
	 */
	Object getMethod();

	/**
	 * Sets the value of the '{@link ru.capralow.dt.conversion.plugin.core.cm.CmAlgorithm#getMethod <em>Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Method</em>' attribute.
	 * @see #getMethod()
	 * @generated
	 */
	void setMethod(Object value);

	/**
	 * Returns the value of the '<em><b>Method Type</b></em>' attribute.
	 * The literals are from the enumeration {@link ru.capralow.dt.conversion.plugin.core.cm.CmMethodType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Method Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Method Type</em>' attribute.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.CmMethodType
	 * @see #setMethodType(CmMethodType)
	 * @see ru.capralow.dt.conversion.plugin.core.cm.CmPackage#getCmAlgorithm_MethodType()
	 * @model unique="false"
	 * @generated
	 */
	CmMethodType getMethodType();

	/**
	 * Sets the value of the '{@link ru.capralow.dt.conversion.plugin.core.cm.CmAlgorithm#getMethodType <em>Method Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Method Type</em>' attribute.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.CmMethodType
	 * @see #getMethodType()
	 * @generated
	 */
	void setMethodType(CmMethodType value);

	/**
	 * Returns the value of the '<em><b>Params</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Params</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Params</em>' attribute.
	 * @see #setParams(String)
	 * @see ru.capralow.dt.conversion.plugin.core.cm.CmPackage#getCmAlgorithm_Params()
	 * @model default="" unique="false"
	 * @generated
	 */
	String getParams();

	/**
	 * Sets the value of the '{@link ru.capralow.dt.conversion.plugin.core.cm.CmAlgorithm#getParams <em>Params</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Params</em>' attribute.
	 * @see #getParams()
	 * @generated
	 */
	void setParams(String value);

	/**
	 * Returns the value of the '<em><b>Text</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' attribute.
	 * @see #setText(String)
	 * @see ru.capralow.dt.conversion.plugin.core.cm.CmPackage#getCmAlgorithm_Text()
	 * @model default="" unique="false"
	 * @generated
	 */
	String getText();

	/**
	 * Sets the value of the '{@link ru.capralow.dt.conversion.plugin.core.cm.CmAlgorithm#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' attribute.
	 * @see #getText()
	 * @generated
	 */
	void setText(String value);

	/**
	 * Returns the value of the '<em><b>Is Export</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Export</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Export</em>' attribute.
	 * @see #setIsExport(Boolean)
	 * @see ru.capralow.dt.conversion.plugin.core.cm.CmPackage#getCmAlgorithm_IsExport()
	 * @model default="false" unique="false"
	 * @generated
	 */
	Boolean getIsExport();

	/**
	 * Sets the value of the '{@link ru.capralow.dt.conversion.plugin.core.cm.CmAlgorithm#getIsExport <em>Is Export</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Export</em>' attribute.
	 * @see #getIsExport()
	 * @generated
	 */
	void setIsExport(Boolean value);

} // CmAlgorithm

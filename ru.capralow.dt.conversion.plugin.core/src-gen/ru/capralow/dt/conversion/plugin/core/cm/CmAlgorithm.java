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
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.CmAlgorithm#getMethodType <em>Method Type</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.CmAlgorithm#getParams <em>Params</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.CmAlgorithm#getIsExport <em>Is Export</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.CmAlgorithm#getBody <em>Body</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.CmAlgorithm#getPrefix <em>Prefix</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.CmAlgorithm#getSuffix <em>Suffix</em>}</li>
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

	/**
	 * Returns the value of the '<em><b>Body</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Body</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body</em>' attribute.
	 * @see #setBody(String)
	 * @see ru.capralow.dt.conversion.plugin.core.cm.CmPackage#getCmAlgorithm_Body()
	 * @model default="" unique="false"
	 * @generated
	 */
	String getBody();

	/**
	 * Sets the value of the '{@link ru.capralow.dt.conversion.plugin.core.cm.CmAlgorithm#getBody <em>Body</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body</em>' attribute.
	 * @see #getBody()
	 * @generated
	 */
	void setBody(String value);

	/**
	 * Returns the value of the '<em><b>Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prefix</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prefix</em>' attribute.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.CmPackage#getCmAlgorithm_Prefix()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='&lt;%java.lang.String%&gt; prefix = \"\";\n&lt;%ru.capralow.dt.conversion.plugin.core.cm.CmMethodType%&gt; _methodType = this.getMethodType();\nboolean _equals = &lt;%com.google.common.base.Objects%&gt;.equal(_methodType, &lt;%ru.capralow.dt.conversion.plugin.core.cm.CmMethodType%&gt;.PROCEDURE);\nif (_equals)\n{\n\tprefix = \"\\u041F\\u0440\\u043E\\u0446\\u0435\\u0434\\u0443\\u0440\\u0430\";\n}\nelse\n{\n\tprefix = \"\\u0424\\u0443\\u043D\\u043A\\u0446\\u0438\\u044F\";\n}\n&lt;%java.lang.String%&gt; export = \"\";\n&lt;%java.lang.Boolean%&gt; _isExport = this.getIsExport();\nif ((_isExport).booleanValue())\n{\n\texport = \" \\u042D\\u043A\\u0441\\u043F\\u043E\\u0440\\u0442\";\n}\n&lt;%java.lang.String%&gt; _name = this.getName();\n&lt;%java.lang.String%&gt; _plus = ((prefix + \" \") + _name);\n&lt;%java.lang.String%&gt; _plus_1 = (_plus + \"(\");\n&lt;%java.lang.String%&gt; _params = this.getParams();\n&lt;%java.lang.String%&gt; _plus_2 = (_plus_1 + _params);\n&lt;%java.lang.String%&gt; _plus_3 = (_plus_2 + \")\");\nreturn (_plus_3 + export);'"
	 * @generated
	 */
	String getPrefix();

	/**
	 * Returns the value of the '<em><b>Suffix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Suffix</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Suffix</em>' attribute.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.CmPackage#getCmAlgorithm_Suffix()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='&lt;%java.lang.String%&gt; result = \"\";\n&lt;%ru.capralow.dt.conversion.plugin.core.cm.CmMethodType%&gt; _methodType = this.getMethodType();\nboolean _equals = &lt;%com.google.common.base.Objects%&gt;.equal(_methodType, &lt;%ru.capralow.dt.conversion.plugin.core.cm.CmMethodType%&gt;.PROCEDURE);\nif (_equals)\n{\n\tresult = \"\\u041A\\u043E\\u043D\\u0435\\u0446\\u041F\\u0440\\u043E\\u0446\\u0435\\u0434\\u0443\\u0440\\u044B\";\n}\nelse\n{\n\tresult = \"\\u041A\\u043E\\u043D\\u0435\\u0446\\u0424\\u0443\\u043D\\u043A\\u0446\\u0438\\u0438\";\n}\nreturn result;'"
	 * @generated
	 */
	String getSuffix();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='&lt;%java.lang.String%&gt; _prefix = this.getPrefix();\n&lt;%java.lang.String%&gt; _lineSeparator = &lt;%java.lang.System%&gt;.lineSeparator();\n&lt;%java.lang.String%&gt; _plus = (_prefix + _lineSeparator);\n&lt;%java.lang.String%&gt; _body = this.getBody();\n&lt;%java.lang.String%&gt; _plus_1 = (_plus + _body);\n&lt;%java.lang.String%&gt; _lineSeparator_1 = &lt;%java.lang.System%&gt;.lineSeparator();\n&lt;%java.lang.String%&gt; _plus_2 = (_plus_1 + _lineSeparator_1);\n&lt;%java.lang.String%&gt; _suffix = this.getSuffix();\n&lt;%java.lang.String%&gt; result = (_plus_2 + _suffix);\nreturn result;'"
	 * @generated
	 */
	String getAlgorithmText();

} // CmAlgorithm

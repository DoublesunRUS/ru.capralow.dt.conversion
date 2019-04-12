/**
 */
package ru.capralow.dt.conversion.plugin.core.cm.model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cm Algorithm</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.model.CmAlgorithm#getName <em>Name</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.model.CmAlgorithm#getExists <em>Exists</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.model.CmAlgorithm#getMethodType <em>Method Type</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.model.CmAlgorithm#getParams <em>Params</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.model.CmAlgorithm#getIsExport <em>Is Export</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.model.CmAlgorithm#getBody <em>Body</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.model.CmAlgorithm#getMethodParams <em>Method Params</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.model.CmAlgorithm#getPrefix <em>Prefix</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.model.CmAlgorithm#getSuffix <em>Suffix</em>}</li>
 * </ul>
 *
 * @see ru.capralow.dt.conversion.plugin.core.cm.model.cmPackage#getCmAlgorithm()
 * @model
 * @generated
 */
public interface CmAlgorithm extends EObject {
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
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.cmPackage#getCmAlgorithm_Name()
	 * @model default="" unique="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ru.capralow.dt.conversion.plugin.core.cm.model.CmAlgorithm#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Exists</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exists</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exists</em>' attribute.
	 * @see #setExists(Boolean)
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.cmPackage#getCmAlgorithm_Exists()
	 * @model default="false" unique="false"
	 * @generated
	 */
	Boolean getExists();

	/**
	 * Sets the value of the '{@link ru.capralow.dt.conversion.plugin.core.cm.model.CmAlgorithm#getExists <em>Exists</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exists</em>' attribute.
	 * @see #getExists()
	 * @generated
	 */
	void setExists(Boolean value);

	/**
	 * Returns the value of the '<em><b>Method Type</b></em>' attribute.
	 * The literals are from the enumeration {@link ru.capralow.dt.conversion.plugin.core.cm.model.CmMethodType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Method Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Method Type</em>' attribute.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.CmMethodType
	 * @see #setMethodType(CmMethodType)
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.cmPackage#getCmAlgorithm_MethodType()
	 * @model unique="false"
	 * @generated
	 */
	CmMethodType getMethodType();

	/**
	 * Sets the value of the '{@link ru.capralow.dt.conversion.plugin.core.cm.model.CmAlgorithm#getMethodType <em>Method Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Method Type</em>' attribute.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.CmMethodType
	 * @see #getMethodType()
	 * @generated
	 */
	void setMethodType(CmMethodType value);

	/**
	 * Returns the value of the '<em><b>Params</b></em>' containment reference list.
	 * The list contents are of type {@link ru.capralow.dt.conversion.plugin.core.cm.model.CmParam}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Params</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Params</em>' containment reference list.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.cmPackage#getCmAlgorithm_Params()
	 * @model containment="true"
	 * @generated
	 */
	EList<CmParam> getParams();

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
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.cmPackage#getCmAlgorithm_IsExport()
	 * @model default="false" unique="false"
	 * @generated
	 */
	Boolean getIsExport();

	/**
	 * Sets the value of the '{@link ru.capralow.dt.conversion.plugin.core.cm.model.CmAlgorithm#getIsExport <em>Is Export</em>}' attribute.
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
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.cmPackage#getCmAlgorithm_Body()
	 * @model default="" unique="false"
	 * @generated
	 */
	String getBody();

	/**
	 * Sets the value of the '{@link ru.capralow.dt.conversion.plugin.core.cm.model.CmAlgorithm#getBody <em>Body</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body</em>' attribute.
	 * @see #getBody()
	 * @generated
	 */
	void setBody(String value);

	/**
	 * Returns the value of the '<em><b>Method Params</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Method Params</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Method Params</em>' attribute.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.cmPackage#getCmAlgorithm_MethodParams()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='&lt;%java.lang.String%&gt; methodParams = \"\";\n&lt;%org.eclipse.emf.common.util.EList%&gt;&lt;&lt;%ru.capralow.dt.conversion.plugin.core.cm.model.CmParam%&gt;&gt; _params = this.getParams();\nfor (final &lt;%ru.capralow.dt.conversion.plugin.core.cm.model.CmParam%&gt; param : _params)\n{\n\t{\n\t\tboolean _isEmpty = methodParams.isEmpty();\n\t\tboolean _not = (!_isEmpty);\n\t\tif (_not)\n\t\t{\n\t\t\t&lt;%java.lang.String%&gt; _methodParams = methodParams;\n\t\t\tmethodParams = (_methodParams + \", \");\n\t\t}\n\t\t&lt;%java.lang.String%&gt; _methodParams_1 = methodParams;\n\t\t&lt;%java.lang.String%&gt; _trim = param.getName().trim();\n\t\tmethodParams = (_methodParams_1 + _trim);\n\t\tboolean _isEmpty_1 = param.getDefaultValue().isEmpty();\n\t\tboolean _not_1 = (!_isEmpty_1);\n\t\tif (_not_1)\n\t\t{\n\t\t\t&lt;%java.lang.String%&gt; _methodParams_2 = methodParams;\n\t\t\t&lt;%java.lang.String%&gt; _defaultValue = param.getDefaultValue();\n\t\t\t&lt;%java.lang.String%&gt; _plus = (\" = \" + _defaultValue);\n\t\t\tmethodParams = (_methodParams_2 + _plus);\n\t\t}\n\t}\n}\nreturn methodParams;'"
	 * @generated
	 */
	String getMethodParams();

	/**
	 * Returns the value of the '<em><b>Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prefix</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prefix</em>' attribute.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.cmPackage#getCmAlgorithm_Prefix()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='&lt;%java.lang.String%&gt; prefix = \"\";\n&lt;%ru.capralow.dt.conversion.plugin.core.cm.model.CmMethodType%&gt; _methodType = this.getMethodType();\nboolean _equals = &lt;%com.google.common.base.Objects%&gt;.equal(_methodType, &lt;%ru.capralow.dt.conversion.plugin.core.cm.model.CmMethodType%&gt;.PROCEDURE);\nif (_equals)\n{\n\tprefix = \"\\u041F\\u0440\\u043E\\u0446\\u0435\\u0434\\u0443\\u0440\\u0430\";\n}\nelse\n{\n\tprefix = \"\\u0424\\u0443\\u043D\\u043A\\u0446\\u0438\\u044F\";\n}\n&lt;%java.lang.String%&gt; export = \"\";\n&lt;%java.lang.Boolean%&gt; _isExport = this.getIsExport();\nif ((_isExport).booleanValue())\n{\n\texport = \" \\u042D\\u043A\\u0441\\u043F\\u043E\\u0440\\u0442\";\n}\n&lt;%java.lang.String%&gt; _name = this.getName();\n&lt;%java.lang.String%&gt; _plus = ((prefix + \" \") + _name);\n&lt;%java.lang.String%&gt; _plus_1 = (_plus + \"(\");\n&lt;%java.lang.String%&gt; _methodParams = this.getMethodParams();\n&lt;%java.lang.String%&gt; _plus_2 = (_plus_1 + _methodParams);\n&lt;%java.lang.String%&gt; _plus_3 = (_plus_2 + \")\");\nreturn (_plus_3 + export);'"
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
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.cmPackage#getCmAlgorithm_Suffix()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='&lt;%java.lang.String%&gt; result = \"\";\n&lt;%ru.capralow.dt.conversion.plugin.core.cm.model.CmMethodType%&gt; _methodType = this.getMethodType();\nboolean _equals = &lt;%com.google.common.base.Objects%&gt;.equal(_methodType, &lt;%ru.capralow.dt.conversion.plugin.core.cm.model.CmMethodType%&gt;.PROCEDURE);\nif (_equals)\n{\n\tresult = \"\\u041A\\u043E\\u043D\\u0435\\u0446\\u041F\\u0440\\u043E\\u0446\\u0435\\u0434\\u0443\\u0440\\u044B\";\n}\nelse\n{\n\tresult = \"\\u041A\\u043E\\u043D\\u0435\\u0446\\u0424\\u0443\\u043D\\u043A\\u0446\\u0438\\u0438\";\n}\nreturn result;'"
	 * @generated
	 */
	String getSuffix();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='&lt;%java.lang.String%&gt; _prefix = this.getPrefix();\n&lt;%java.lang.String%&gt; _lineSeparator = &lt;%java.lang.System%&gt;.lineSeparator();\n&lt;%java.lang.String%&gt; _plus = (_prefix + _lineSeparator);\n&lt;%java.lang.String%&gt; _body = this.getBody();\n&lt;%java.lang.String%&gt; _plus_1 = (_plus + _body);\n&lt;%java.lang.String%&gt; _lineSeparator_1 = &lt;%java.lang.System%&gt;.lineSeparator();\n&lt;%java.lang.String%&gt; _plus_2 = (_plus_1 + _lineSeparator_1);\n&lt;%java.lang.String%&gt; _suffix = this.getSuffix();\n&lt;%java.lang.String%&gt; _plus_3 = (_plus_2 + _suffix);\n&lt;%java.lang.String%&gt; _lineSeparator_2 = &lt;%java.lang.System%&gt;.lineSeparator();\n&lt;%java.lang.String%&gt; result = (_plus_3 + _lineSeparator_2);\nreturn result;'"
	 * @generated
	 */
	String getAlgorithmText();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return this.getPrefix();'"
	 * @generated
	 */
	String toString();

} // CmAlgorithm

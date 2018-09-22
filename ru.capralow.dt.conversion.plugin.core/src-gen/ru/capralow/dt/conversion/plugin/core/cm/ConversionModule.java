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
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.ConversionModule#getModuleURI <em>Module URI</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.ConversionModule#getParams <em>Params</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.ConversionModule#getBeforeConvertationEvent <em>Before Convertation Event</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.ConversionModule#getBeforeConvertationEventMethod <em>Before Convertation Event Method</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.ConversionModule#getBeforeFillingEvent <em>Before Filling Event</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.ConversionModule#getBeforeFillingEventMethod <em>Before Filling Event Method</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.ConversionModule#getAfterConvertationEvent <em>After Convertation Event</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.ConversionModule#getAfterConvertationEventMethod <em>After Convertation Event Method</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.ConversionModule#getDataRules <em>Data Rules</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.ConversionModule#getObjectRules <em>Object Rules</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.ConversionModule#getPredefineds <em>Predefineds</em>}</li>
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
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Store Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Store Version</em>' attribute.
	 * @see #setStoreVersion(String)
	 * @see ru.capralow.dt.conversion.plugin.core.cm.CmPackage#getConversionModule_StoreVersion()
	 * @model default="1" unique="false"
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
	 * Returns the value of the '<em><b>Module URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Module URI</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Module URI</em>' attribute.
	 * @see #setModuleURI(Object)
	 * @see ru.capralow.dt.conversion.plugin.core.cm.CmPackage#getConversionModule_ModuleURI()
	 * @model unique="false"
	 * @generated
	 */
	Object getModuleURI();

	/**
	 * Sets the value of the '{@link ru.capralow.dt.conversion.plugin.core.cm.ConversionModule#getModuleURI <em>Module URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Module URI</em>' attribute.
	 * @see #getModuleURI()
	 * @generated
	 */
	void setModuleURI(Object value);

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
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Before Convertation Event</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Before Convertation Event</em>' attribute.
	 * @see #setBeforeConvertationEvent(String)
	 * @see ru.capralow.dt.conversion.plugin.core.cm.CmPackage#getConversionModule_BeforeConvertationEvent()
	 * @model default="" unique="false"
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
	 * Returns the value of the '<em><b>Before Convertation Event Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Before Convertation Event Method</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Before Convertation Event Method</em>' attribute.
	 * @see #setBeforeConvertationEventMethod(Object)
	 * @see ru.capralow.dt.conversion.plugin.core.cm.CmPackage#getConversionModule_BeforeConvertationEventMethod()
	 * @model unique="false"
	 * @generated
	 */
	Object getBeforeConvertationEventMethod();

	/**
	 * Sets the value of the '{@link ru.capralow.dt.conversion.plugin.core.cm.ConversionModule#getBeforeConvertationEventMethod <em>Before Convertation Event Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Before Convertation Event Method</em>' attribute.
	 * @see #getBeforeConvertationEventMethod()
	 * @generated
	 */
	void setBeforeConvertationEventMethod(Object value);

	/**
	 * Returns the value of the '<em><b>Before Filling Event</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Before Filling Event</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Before Filling Event</em>' attribute.
	 * @see #setBeforeFillingEvent(String)
	 * @see ru.capralow.dt.conversion.plugin.core.cm.CmPackage#getConversionModule_BeforeFillingEvent()
	 * @model default="" unique="false"
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
	 * Returns the value of the '<em><b>Before Filling Event Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Before Filling Event Method</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Before Filling Event Method</em>' attribute.
	 * @see #setBeforeFillingEventMethod(Object)
	 * @see ru.capralow.dt.conversion.plugin.core.cm.CmPackage#getConversionModule_BeforeFillingEventMethod()
	 * @model unique="false"
	 * @generated
	 */
	Object getBeforeFillingEventMethod();

	/**
	 * Sets the value of the '{@link ru.capralow.dt.conversion.plugin.core.cm.ConversionModule#getBeforeFillingEventMethod <em>Before Filling Event Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Before Filling Event Method</em>' attribute.
	 * @see #getBeforeFillingEventMethod()
	 * @generated
	 */
	void setBeforeFillingEventMethod(Object value);

	/**
	 * Returns the value of the '<em><b>After Convertation Event</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>After Convertation Event</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>After Convertation Event</em>' attribute.
	 * @see #setAfterConvertationEvent(String)
	 * @see ru.capralow.dt.conversion.plugin.core.cm.CmPackage#getConversionModule_AfterConvertationEvent()
	 * @model default="" unique="false"
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
	 * Returns the value of the '<em><b>After Convertation Event Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>After Convertation Event Method</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>After Convertation Event Method</em>' attribute.
	 * @see #setAfterConvertationEventMethod(Object)
	 * @see ru.capralow.dt.conversion.plugin.core.cm.CmPackage#getConversionModule_AfterConvertationEventMethod()
	 * @model unique="false"
	 * @generated
	 */
	Object getAfterConvertationEventMethod();

	/**
	 * Sets the value of the '{@link ru.capralow.dt.conversion.plugin.core.cm.ConversionModule#getAfterConvertationEventMethod <em>After Convertation Event Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>After Convertation Event Method</em>' attribute.
	 * @see #getAfterConvertationEventMethod()
	 * @generated
	 */
	void setAfterConvertationEventMethod(Object value);

	/**
	 * Returns the value of the '<em><b>Data Rules</b></em>' containment reference list.
	 * The list contents are of type {@link ru.capralow.dt.conversion.plugin.core.cm.CmDataRule}.
	 * It is bidirectional and its opposite is '{@link ru.capralow.dt.conversion.plugin.core.cm.CmDataRule#getConversionModule <em>Conversion Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Rules</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Rules</em>' containment reference list.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.CmPackage#getConversionModule_DataRules()
	 * @see ru.capralow.dt.conversion.plugin.core.cm.CmDataRule#getConversionModule
	 * @model opposite="conversionModule" containment="true"
	 * @generated
	 */
	EList<CmDataRule> getDataRules();

	/**
	 * Returns the value of the '<em><b>Object Rules</b></em>' containment reference list.
	 * The list contents are of type {@link ru.capralow.dt.conversion.plugin.core.cm.CmObjectRule}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Object Rules</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object Rules</em>' containment reference list.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.CmPackage#getConversionModule_ObjectRules()
	 * @model containment="true"
	 * @generated
	 */
	EList<CmObjectRule> getObjectRules();

	/**
	 * Returns the value of the '<em><b>Predefineds</b></em>' containment reference list.
	 * The list contents are of type {@link ru.capralow.dt.conversion.plugin.core.cm.CmPredefined}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Predefineds</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Predefineds</em>' containment reference list.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.CmPackage#getConversionModule_Predefineds()
	 * @model containment="true"
	 * @generated
	 */
	EList<CmPredefined> getPredefineds();

	/**
	 * Returns the value of the '<em><b>Algorithms</b></em>' containment reference list.
	 * The list contents are of type {@link ru.capralow.dt.conversion.plugin.core.cm.CmAlgorithm}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Algorithms</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Algorithms</em>' containment reference list.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.CmPackage#getConversionModule_Algorithms()
	 * @model containment="true"
	 * @generated
	 */
	EList<CmAlgorithm> getAlgorithms();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" ruleNameUnique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='&lt;%org.eclipse.emf.common.util.EList%&gt;&lt;&lt;%ru.capralow.dt.conversion.plugin.core.cm.CmDataRule%&gt;&gt; _dataRules = this.getDataRules();\nfor (final &lt;%ru.capralow.dt.conversion.plugin.core.cm.CmDataRule%&gt; dataRule : _dataRules)\n{\n\t&lt;%java.lang.String%&gt; _name = dataRule.getName();\n\tboolean _equals = &lt;%com.google.common.base.Objects%&gt;.equal(ruleName, _name);\n\tif (_equals)\n\t{\n\t\treturn dataRule;\n\t}\n}\nreturn null;'"
	 * @generated
	 */
	CmDataRule getDataRule(String ruleName);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='final &lt;%org.eclipse.emf.common.util.BasicEList%&gt;&lt;&lt;%java.lang.Object%&gt;&gt; result = &lt;%org.eclipse.emf.ecore.xcore.lib.XcoreCollectionLiterals%&gt;.&lt;&lt;%java.lang.Object%&gt;&gt;newBasicEList();\n&lt;%org.eclipse.emf.common.util.EList%&gt;&lt;&lt;%ru.capralow.dt.conversion.plugin.core.cm.CmDataRule%&gt;&gt; _dataRules = this.getDataRules();\nfor (final &lt;%ru.capralow.dt.conversion.plugin.core.cm.CmDataRule%&gt; dataRule : _dataRules)\n{\n\t&lt;%java.lang.Boolean%&gt; _forSending = dataRule.getForSending();\n\tif ((_forSending).booleanValue())\n\t{\n\t\tresult.add(dataRule);\n\t}\n}\nreturn result;'"
	 * @generated
	 */
	EList<Object> getSendingDataRules();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='final &lt;%org.eclipse.emf.common.util.BasicEList%&gt;&lt;&lt;%java.lang.Object%&gt;&gt; result = &lt;%org.eclipse.emf.ecore.xcore.lib.XcoreCollectionLiterals%&gt;.&lt;&lt;%java.lang.Object%&gt;&gt;newBasicEList();\n&lt;%org.eclipse.emf.common.util.EList%&gt;&lt;&lt;%ru.capralow.dt.conversion.plugin.core.cm.CmDataRule%&gt;&gt; _dataRules = this.getDataRules();\nfor (final &lt;%ru.capralow.dt.conversion.plugin.core.cm.CmDataRule%&gt; dataRule : _dataRules)\n{\n\t&lt;%java.lang.Boolean%&gt; _forReceiving = dataRule.getForReceiving();\n\tif ((_forReceiving).booleanValue())\n\t{\n\t\tresult.add(dataRule);\n\t}\n}\nreturn result;'"
	 * @generated
	 */
	EList<Object> getReceivingDataRules();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" ruleNameUnique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='&lt;%org.eclipse.emf.common.util.EList%&gt;&lt;&lt;%ru.capralow.dt.conversion.plugin.core.cm.CmObjectRule%&gt;&gt; _objectRules = this.getObjectRules();\nfor (final &lt;%ru.capralow.dt.conversion.plugin.core.cm.CmObjectRule%&gt; objectRule : _objectRules)\n{\n\t&lt;%java.lang.String%&gt; _name = objectRule.getName();\n\tboolean _equals = &lt;%com.google.common.base.Objects%&gt;.equal(ruleName, _name);\n\tif (_equals)\n\t{\n\t\treturn objectRule;\n\t}\n}\nreturn null;'"
	 * @generated
	 */
	CmObjectRule getObjectRule(String ruleName);

} // ConversionModule

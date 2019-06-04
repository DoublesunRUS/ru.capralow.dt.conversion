/**
 */
package ru.capralow.dt.conversion.plugin.core.ep.model;

import com._1c.g5.v8.dt.metadata.mdclass.CommonModule;
import com._1c.g5.v8.dt.metadata.mdclass.XDTOPackage;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ep Format Version</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.ep.model.EpFormatVersion#getVersion <em>Version</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.ep.model.EpFormatVersion#getExtensionName <em>Extension Name</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.ep.model.EpFormatVersion#getModuleName <em>Module Name</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.ep.model.EpFormatVersion#getModule <em>Module</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.ep.model.EpFormatVersion#getXdtoPackage <em>Xdto Package</em>}</li>
 * </ul>
 *
 * @see ru.capralow.dt.conversion.plugin.core.ep.model.epPackage#getEpFormatVersion()
 * @model
 * @generated
 */
public interface EpFormatVersion extends EObject {
	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see ru.capralow.dt.conversion.plugin.core.ep.model.epPackage#getEpFormatVersion_Version()
	 * @model default="" unique="false"
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link ru.capralow.dt.conversion.plugin.core.ep.model.EpFormatVersion#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

	/**
	 * Returns the value of the '<em><b>Extension Name</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extension Name</em>' attribute.
	 * @see #setExtensionName(String)
	 * @see ru.capralow.dt.conversion.plugin.core.ep.model.epPackage#getEpFormatVersion_ExtensionName()
	 * @model default="" unique="false"
	 * @generated
	 */
	String getExtensionName();

	/**
	 * Sets the value of the '{@link ru.capralow.dt.conversion.plugin.core.ep.model.EpFormatVersion#getExtensionName <em>Extension Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extension Name</em>' attribute.
	 * @see #getExtensionName()
	 * @generated
	 */
	void setExtensionName(String value);

	/**
	 * Returns the value of the '<em><b>Module Name</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Module Name</em>' attribute.
	 * @see #setModuleName(String)
	 * @see ru.capralow.dt.conversion.plugin.core.ep.model.epPackage#getEpFormatVersion_ModuleName()
	 * @model default="" unique="false"
	 * @generated
	 */
	String getModuleName();

	/**
	 * Sets the value of the '{@link ru.capralow.dt.conversion.plugin.core.ep.model.EpFormatVersion#getModuleName <em>Module Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Module Name</em>' attribute.
	 * @see #getModuleName()
	 * @generated
	 */
	void setModuleName(String value);

	/**
	 * Returns the value of the '<em><b>Module</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Module</em>' reference.
	 * @see #setModule(CommonModule)
	 * @see ru.capralow.dt.conversion.plugin.core.ep.model.epPackage#getEpFormatVersion_Module()
	 * @model
	 * @generated
	 */
	CommonModule getModule();

	/**
	 * Sets the value of the '{@link ru.capralow.dt.conversion.plugin.core.ep.model.EpFormatVersion#getModule <em>Module</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Module</em>' reference.
	 * @see #getModule()
	 * @generated
	 */
	void setModule(CommonModule value);

	/**
	 * Returns the value of the '<em><b>Xdto Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Xdto Package</em>' reference.
	 * @see #setXdtoPackage(XDTOPackage)
	 * @see ru.capralow.dt.conversion.plugin.core.ep.model.epPackage#getEpFormatVersion_XdtoPackage()
	 * @model
	 * @generated
	 */
	XDTOPackage getXdtoPackage();

	/**
	 * Sets the value of the '{@link ru.capralow.dt.conversion.plugin.core.ep.model.EpFormatVersion#getXdtoPackage <em>Xdto Package</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Xdto Package</em>' reference.
	 * @see #getXdtoPackage()
	 * @generated
	 */
	void setXdtoPackage(XDTOPackage value);

} // EpFormatVersion

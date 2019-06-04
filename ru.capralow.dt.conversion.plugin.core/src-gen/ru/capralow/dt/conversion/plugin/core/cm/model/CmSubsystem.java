/**
 */
package ru.capralow.dt.conversion.plugin.core.cm.model;

import com._1c.g5.v8.dt.metadata.mdclass.Subsystem;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cm Subsystem</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.model.CmSubsystem#getSubsystem <em>Subsystem</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.model.CmSubsystem#getName <em>Name</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.model.CmSubsystem#getSpecialSubsystemType <em>Special Subsystem Type</em>}</li>
 * </ul>
 *
 * @see ru.capralow.dt.conversion.plugin.core.cm.model.cmPackage#getCmSubsystem()
 * @model
 * @generated
 */
public interface CmSubsystem extends EObject {
	/**
	 * Returns the value of the '<em><b>Subsystem</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subsystem</em>' reference.
	 * @see #setSubsystem(Subsystem)
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.cmPackage#getCmSubsystem_Subsystem()
	 * @model
	 * @generated
	 */
	Subsystem getSubsystem();

	/**
	 * Sets the value of the '{@link ru.capralow.dt.conversion.plugin.core.cm.model.CmSubsystem#getSubsystem <em>Subsystem</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subsystem</em>' reference.
	 * @see #getSubsystem()
	 * @generated
	 */
	void setSubsystem(Subsystem value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.cmPackage#getCmSubsystem_Name()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	String getName();

	/**
	 * Returns the value of the '<em><b>Special Subsystem Type</b></em>' attribute.
	 * The literals are from the enumeration {@link ru.capralow.dt.conversion.plugin.core.cm.model.CmSpecialSubsystemType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Special Subsystem Type</em>' attribute.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.CmSpecialSubsystemType
	 * @see #setSpecialSubsystemType(CmSpecialSubsystemType)
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.cmPackage#getCmSubsystem_SpecialSubsystemType()
	 * @model unique="false"
	 * @generated
	 */
	CmSpecialSubsystemType getSpecialSubsystemType();

	/**
	 * Sets the value of the '{@link ru.capralow.dt.conversion.plugin.core.cm.model.CmSubsystem#getSpecialSubsystemType <em>Special Subsystem Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Special Subsystem Type</em>' attribute.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.CmSpecialSubsystemType
	 * @see #getSpecialSubsystemType()
	 * @generated
	 */
	void setSpecialSubsystemType(CmSpecialSubsystemType value);

} // CmSubsystem

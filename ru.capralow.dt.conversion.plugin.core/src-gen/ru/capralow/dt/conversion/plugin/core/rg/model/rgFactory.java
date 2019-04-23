/**
 */
package ru.capralow.dt.conversion.plugin.core.rg.model;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see ru.capralow.dt.conversion.plugin.core.rg.model.rgPackage
 * @generated
 */
public interface rgFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	rgFactory eINSTANCE = ru.capralow.dt.conversion.plugin.core.rg.model.impl.rgFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Report Groups</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Report Groups</em>'.
	 * @generated
	 */
	ReportGroups createReportGroups();

	/**
	 * Returns a new object of class '<em>Rg Variant</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rg Variant</em>'.
	 * @generated
	 */
	RgVariant createRgVariant();

	/**
	 * Returns a new object of class '<em>Rg Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rg Group</em>'.
	 * @generated
	 */
	RgGroup createRgGroup();

	/**
	 * Returns a new object of class '<em>Rg Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rg Rule</em>'.
	 * @generated
	 */
	RgRule createRgRule();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	rgPackage getrgPackage();

} //rgFactory

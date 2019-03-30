/**
 */
package ru.capralow.dt.conversion.plugin.core.ed.model;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see ru.capralow.dt.conversion.plugin.core.ed.model.edPackage
 * @generated
 */
public interface edFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	edFactory eINSTANCE = ru.capralow.dt.conversion.plugin.core.ed.model.impl.edFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Enterprise Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Enterprise Data</em>'.
	 * @generated
	 */
	EnterpriseData createEnterpriseData();

	/**
	 * Returns a new object of class '<em>Ed Defined Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ed Defined Type</em>'.
	 * @generated
	 */
	EdDefinedType createEdDefinedType();

	/**
	 * Returns a new object of class '<em>Ed Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ed Type</em>'.
	 * @generated
	 */
	EdType createEdType();

	/**
	 * Returns a new object of class '<em>Ed Object</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ed Object</em>'.
	 * @generated
	 */
	EdObject createEdObject();

	/**
	 * Returns a new object of class '<em>Ed Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ed Property</em>'.
	 * @generated
	 */
	EdProperty createEdProperty();

	/**
	 * Returns a new object of class '<em>Ed Enum</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ed Enum</em>'.
	 * @generated
	 */
	EdEnum createEdEnum();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	edPackage getedPackage();

} //edFactory

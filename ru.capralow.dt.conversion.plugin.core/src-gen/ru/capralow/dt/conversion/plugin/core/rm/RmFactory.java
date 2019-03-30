/**
 */
package ru.capralow.dt.conversion.plugin.core.rm;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see ru.capralow.dt.conversion.plugin.core.rm.RmPackage
 * @generated
 */
public interface RmFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RmFactory eINSTANCE = ru.capralow.dt.conversion.plugin.core.rm.impl.RmFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Registration Module</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Registration Module</em>'.
	 * @generated
	 */
	RegistrationModule createRegistrationModule();

	/**
	 * Returns a new object of class '<em>Exchange Plan Content</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Exchange Plan Content</em>'.
	 * @generated
	 */
	ExchangePlanContent createExchangePlanContent();

	/**
	 * Returns a new object of class '<em>Registration Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Registration Rule</em>'.
	 * @generated
	 */
	RegistrationRule createRegistrationRule();

	/**
	 * Returns a new object of class '<em>Object Selection Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Object Selection Rule</em>'.
	 * @generated
	 */
	ObjectSelectionRule createObjectSelectionRule();

	/**
	 * Returns a new object of class '<em>Exchange Plan Selection Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Exchange Plan Selection Rule</em>'.
	 * @generated
	 */
	ExchangePlanSelectionRule createExchangePlanSelectionRule();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	RmPackage getRmPackage();

} //RmFactory

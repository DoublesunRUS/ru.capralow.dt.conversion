/**
 */
package ru.capralow.dt.conversion.plugin.core.ep.model;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see ru.capralow.dt.conversion.plugin.core.ep.model.epPackage
 * @generated
 */
public interface epFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	epFactory eINSTANCE = ru.capralow.dt.conversion.plugin.core.ep.model.impl.epFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Exchange Project</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Exchange Project</em>'.
	 * @generated
	 */
	ExchangeProject createExchangeProject();

	/**
	 * Returns a new object of class '<em>Exchange Projects</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Exchange Projects</em>'.
	 * @generated
	 */
	ExchangeProjects createExchangeProjects();

	/**
	 * Returns a new object of class '<em>Ep Extension</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ep Extension</em>'.
	 * @generated
	 */
	EpExtension createEpExtension();

	/**
	 * Returns a new object of class '<em>Ep Format Version</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ep Format Version</em>'.
	 * @generated
	 */
	EpFormatVersion createEpFormatVersion();

	/**
	 * Returns a new object of class '<em>Exchange Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Exchange Data</em>'.
	 * @generated
	 */
	ExchangeData createExchangeData();

	/**
	 * Returns a new object of class '<em>Ep Exchange Pair</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ep Exchange Pair</em>'.
	 * @generated
	 */
	EpExchangePair createEpExchangePair();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	epPackage getepPackage();

} //epFactory

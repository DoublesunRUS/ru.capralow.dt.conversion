/**
 */
package ru.capralow.dt.conversion.plugin.core.cp;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see ru.capralow.dt.conversion.plugin.core.cp.CpPackage
 * @generated
 */
public interface CpFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CpFactory eINSTANCE = ru.capralow.dt.conversion.plugin.core.cp.impl.CpFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Conversion Panel</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Conversion Panel</em>'.
	 * @generated
	 */
	ConversionPanel createConversionPanel();

	/**
	 * Returns a new object of class '<em>cp Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>cp Configuration</em>'.
	 * @generated
	 */
	cpConfiguration createcpConfiguration();

	/**
	 * Returns a new object of class '<em>cp Extension</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>cp Extension</em>'.
	 * @generated
	 */
	cpExtension createcpExtension();

	/**
	 * Returns a new object of class '<em>cp Format Version</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>cp Format Version</em>'.
	 * @generated
	 */
	cpFormatVersion createcpFormatVersion();

	/**
	 * Returns a new object of class '<em>cp Exchange Pair</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>cp Exchange Pair</em>'.
	 * @generated
	 */
	cpExchangePair createcpExchangePair();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	CpPackage getCpPackage();

} //CpFactory

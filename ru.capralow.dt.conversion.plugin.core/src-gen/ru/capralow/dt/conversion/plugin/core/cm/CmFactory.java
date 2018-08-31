/**
 */
package ru.capralow.dt.conversion.plugin.core.cm;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see ru.capralow.dt.conversion.plugin.core.cm.CmPackage
 * @generated
 */
public interface CmFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CmFactory eINSTANCE = ru.capralow.dt.conversion.plugin.core.cm.impl.CmFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Conversion Module</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Conversion Module</em>'.
	 * @generated
	 */
	ConversionModule createConversionModule();

	/**
	 * Returns a new object of class '<em>cp POD</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>cp POD</em>'.
	 * @generated
	 */
	cpPOD createcpPOD();

	/**
	 * Returns a new object of class '<em>cp PKO</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>cp PKO</em>'.
	 * @generated
	 */
	cpPKO createcpPKO();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	CmPackage getCmPackage();

} //CmFactory

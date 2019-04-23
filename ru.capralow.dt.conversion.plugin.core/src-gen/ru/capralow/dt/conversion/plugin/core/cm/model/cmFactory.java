/**
 */
package ru.capralow.dt.conversion.plugin.core.cm.model;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see ru.capralow.dt.conversion.plugin.core.cm.model.cmPackage
 * @generated
 */
public interface cmFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	cmFactory eINSTANCE = ru.capralow.dt.conversion.plugin.core.cm.model.impl.cmFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Conversion Module</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Conversion Module</em>'.
	 * @generated
	 */
	ConversionModule createConversionModule();

	/**
	 * Returns a new object of class '<em>Cm Object</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cm Object</em>'.
	 * @generated
	 */
	CmObject createCmObject();

	/**
	 * Returns a new object of class '<em>Cm Data Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cm Data Rule</em>'.
	 * @generated
	 */
	CmDataRule createCmDataRule();

	/**
	 * Returns a new object of class '<em>Cm Object Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cm Object Rule</em>'.
	 * @generated
	 */
	CmObjectRule createCmObjectRule();

	/**
	 * Returns a new object of class '<em>Cm Attribute Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cm Attribute Rule</em>'.
	 * @generated
	 */
	CmAttributeRule createCmAttributeRule();

	/**
	 * Returns a new object of class '<em>Cm Predefined</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cm Predefined</em>'.
	 * @generated
	 */
	CmPredefined createCmPredefined();

	/**
	 * Returns a new object of class '<em>Cm Predefined Map</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cm Predefined Map</em>'.
	 * @generated
	 */
	CmPredefinedMap createCmPredefinedMap();

	/**
	 * Returns a new object of class '<em>Cm Algorithm</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cm Algorithm</em>'.
	 * @generated
	 */
	CmAlgorithm createCmAlgorithm();

	/**
	 * Returns a new object of class '<em>Cm Param</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cm Param</em>'.
	 * @generated
	 */
	CmParam createCmParam();

	/**
	 * Returns a new object of class '<em>Cm Subsystem</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cm Subsystem</em>'.
	 * @generated
	 */
	CmSubsystem createCmSubsystem();

	/**
	 * Returns a new object of class '<em>Cm Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cm Group</em>'.
	 * @generated
	 */
	CmGroup createCmGroup();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	cmPackage getcmPackage();

} //cmFactory

/**
 */
package ru.capralow.dt.conversion.plugin.core.rm.impl;

import com._1c.g5.v8.bm.core.BmObject;

import org.eclipse.emf.ecore.EClass;

import ru.capralow.dt.conversion.plugin.core.rm.ObjectSelectionRule;
import ru.capralow.dt.conversion.plugin.core.rm.RmPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Object Selection Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.rm.impl.ObjectSelectionRuleImpl#getIsFolder <em>Is Folder</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ObjectSelectionRuleImpl extends BmObject implements ObjectSelectionRule {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectSelectionRuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RmPackage.Literals.OBJECT_SELECTION_RULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsFolder() {
		return (Boolean)eGet(RmPackage.Literals.OBJECT_SELECTION_RULE__IS_FOLDER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsFolder(Boolean newIsFolder) {
		eSet(RmPackage.Literals.OBJECT_SELECTION_RULE__IS_FOLDER, newIsFolder);
	}

} //ObjectSelectionRuleImpl

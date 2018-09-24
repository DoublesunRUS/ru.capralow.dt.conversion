/**
 */
package ru.capralow.dt.conversion.plugin.core.cm.impl;

import com.google.common.base.Objects;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import ru.capralow.dt.conversion.plugin.core.cm.CmAlgorithm;
import ru.capralow.dt.conversion.plugin.core.cm.CmMethodType;
import ru.capralow.dt.conversion.plugin.core.cm.CmPackage;
import ru.capralow.dt.conversion.plugin.core.cm.ConversionModule;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Algorithm</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.impl.CmAlgorithmImpl#getConversionModule <em>Conversion Module</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.impl.CmAlgorithmImpl#getName <em>Name</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.impl.CmAlgorithmImpl#getMethodType <em>Method Type</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.impl.CmAlgorithmImpl#getParams <em>Params</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.impl.CmAlgorithmImpl#getIsExport <em>Is Export</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.impl.CmAlgorithmImpl#getBody <em>Body</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.impl.CmAlgorithmImpl#getPrefix <em>Prefix</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.impl.CmAlgorithmImpl#getSuffix <em>Suffix</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CmAlgorithmImpl extends MinimalEObjectImpl.Container implements CmAlgorithm {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CmAlgorithmImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CmPackage.Literals.CM_ALGORITHM;
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
	public ConversionModule getConversionModule() {
		return (ConversionModule)eGet(CmPackage.Literals.CM_ALGORITHM__CONVERSION_MODULE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConversionModule(ConversionModule newConversionModule) {
		eSet(CmPackage.Literals.CM_ALGORITHM__CONVERSION_MODULE, newConversionModule);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return (String)eGet(CmPackage.Literals.CM_ALGORITHM__NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eSet(CmPackage.Literals.CM_ALGORITHM__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CmMethodType getMethodType() {
		return (CmMethodType)eGet(CmPackage.Literals.CM_ALGORITHM__METHOD_TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMethodType(CmMethodType newMethodType) {
		eSet(CmPackage.Literals.CM_ALGORITHM__METHOD_TYPE, newMethodType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getParams() {
		return (String)eGet(CmPackage.Literals.CM_ALGORITHM__PARAMS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParams(String newParams) {
		eSet(CmPackage.Literals.CM_ALGORITHM__PARAMS, newParams);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsExport() {
		return (Boolean)eGet(CmPackage.Literals.CM_ALGORITHM__IS_EXPORT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsExport(Boolean newIsExport) {
		eSet(CmPackage.Literals.CM_ALGORITHM__IS_EXPORT, newIsExport);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBody() {
		return (String)eGet(CmPackage.Literals.CM_ALGORITHM__BODY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBody(String newBody) {
		eSet(CmPackage.Literals.CM_ALGORITHM__BODY, newBody);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPrefix() {
		String prefix = "";
		CmMethodType _methodType = this.getMethodType();
		boolean _equals = Objects.equal(_methodType, CmMethodType.PROCEDURE);
		if (_equals) {
			prefix = "\u041F\u0440\u043E\u0446\u0435\u0434\u0443\u0440\u0430";
		}
		else {
			prefix = "\u0424\u0443\u043D\u043A\u0446\u0438\u044F";
		}
		String export = "";
		Boolean _isExport = this.getIsExport();
		if ((_isExport).booleanValue()) {
			export = " \u042D\u043A\u0441\u043F\u043E\u0440\u0442";
		}
		String _name = this.getName();
		String _plus = ((prefix + " ") + _name);
		String _plus_1 = (_plus + "(");
		String _params = this.getParams();
		String _plus_2 = (_plus_1 + _params);
		String _plus_3 = (_plus_2 + ")");
		return (_plus_3 + export);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSuffix() {
		String result = "";
		CmMethodType _methodType = this.getMethodType();
		boolean _equals = Objects.equal(_methodType, CmMethodType.PROCEDURE);
		if (_equals) {
			result = "\u041A\u043E\u043D\u0435\u0446\u041F\u0440\u043E\u0446\u0435\u0434\u0443\u0440\u044B";
		}
		else {
			result = "\u041A\u043E\u043D\u0435\u0446\u0424\u0443\u043D\u043A\u0446\u0438\u0438";
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAlgorithmText() {
		String _prefix = this.getPrefix();
		String _lineSeparator = System.lineSeparator();
		String _plus = (_prefix + _lineSeparator);
		String _body = this.getBody();
		String _plus_1 = (_plus + _body);
		String _lineSeparator_1 = System.lineSeparator();
		String _plus_2 = (_plus_1 + _lineSeparator_1);
		String _suffix = this.getSuffix();
		String result = (_plus_2 + _suffix);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case CmPackage.CM_ALGORITHM___GET_ALGORITHM_TEXT:
				return getAlgorithmText();
		}
		return super.eInvoke(operationID, arguments);
	}

} //CmAlgorithmImpl

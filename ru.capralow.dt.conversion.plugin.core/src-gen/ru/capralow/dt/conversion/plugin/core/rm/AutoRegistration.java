/**
 */
package ru.capralow.dt.conversion.plugin.core.rm;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Auto Registration</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see ru.capralow.dt.conversion.plugin.core.rm.RmPackage#getAutoRegistration()
 * @model
 * @generated
 */
public enum AutoRegistration implements Enumerator {
	/**
	 * The '<em><b>Allow</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ALLOW_VALUE
	 * @generated
	 * @ordered
	 */
	ALLOW(1, "Allow", "\u0420\u0430\u0437\u0440\u0435\u0448\u0438\u0442\u044c"), //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>Deny</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DENY_VALUE
	 * @generated
	 * @ordered
	 */
	DENY(0, "Deny", "\u0417\u0430\u043f\u0440\u0435\u0442\u0438\u0442\u044c"); //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>Allow</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Allow</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ALLOW
	 * @model name="Allow" literal="\u0420\u0430\u0437\u0440\u0435\u0448\u0438\u0442\u044c"
	 * @generated
	 * @ordered
	 */
	public static final int ALLOW_VALUE = 1;

	/**
	 * The '<em><b>Deny</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Deny</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DENY
	 * @model name="Deny" literal="\u0417\u0430\u043f\u0440\u0435\u0442\u0438\u0442\u044c"
	 * @generated
	 * @ordered
	 */
	public static final int DENY_VALUE = 0;

	/**
	 * An array of all the '<em><b>Auto Registration</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final AutoRegistration[] VALUES_ARRAY =
		new AutoRegistration[] {
			ALLOW,
			DENY,
		};

	/**
	 * A public read-only list of all the '<em><b>Auto Registration</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<AutoRegistration> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Auto Registration</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AutoRegistration get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AutoRegistration result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Auto Registration</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AutoRegistration getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AutoRegistration result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Auto Registration</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AutoRegistration get(int value) {
		switch (value) {
			case ALLOW_VALUE: return ALLOW;
			case DENY_VALUE: return DENY;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private AutoRegistration(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //AutoRegistration

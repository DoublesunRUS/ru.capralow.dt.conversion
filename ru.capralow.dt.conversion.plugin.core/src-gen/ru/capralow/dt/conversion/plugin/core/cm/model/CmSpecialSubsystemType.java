/**
 */
package ru.capralow.dt.conversion.plugin.core.cm.model;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Cm Special Subsystem Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see ru.capralow.dt.conversion.plugin.core.cm.model.cmPackage#getCmSpecialSubsystemType()
 * @model
 * @generated
 */
public enum CmSpecialSubsystemType implements Enumerator {
	/**
	 * The '<em><b>Subsystem</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUBSYSTEM_VALUE
	 * @generated
	 * @ordered
	 */
	SUBSYSTEM(0, "Subsystem", "<\u041f\u043e\u0434\u0441\u0438\u0441\u0442\u0435\u043c\u0430>"), //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>All</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ALL_VALUE
	 * @generated
	 * @ordered
	 */
	ALL(1, "All", "<\u0412\u0441\u0435 \u043f\u043e\u0434\u0441\u0438\u0441\u0442\u0435\u043c\u044b>"), //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>Main</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MAIN_VALUE
	 * @generated
	 * @ordered
	 */
	MAIN(2, "Main", "\u0413\u043b\u0430\u0432\u043d\u043e\u0435"), //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>Empty</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EMPTY_VALUE
	 * @generated
	 * @ordered
	 */
	EMPTY(3, "Empty", "<\u041e\u0441\u0442\u0430\u043b\u044c\u043d\u043e\u0435>"); //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>Subsystem</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Subsystem</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SUBSYSTEM
	 * @model name="Subsystem" literal="&lt;\u041f\u043e\u0434\u0441\u0438\u0441\u0442\u0435\u043c\u0430&gt;"
	 * @generated
	 * @ordered
	 */
	public static final int SUBSYSTEM_VALUE = 0;

	/**
	 * The '<em><b>All</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>All</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ALL
	 * @model name="All" literal="&lt;\u0412\u0441\u0435 \u043f\u043e\u0434\u0441\u0438\u0441\u0442\u0435\u043c\u044b&gt;"
	 * @generated
	 * @ordered
	 */
	public static final int ALL_VALUE = 1;

	/**
	 * The '<em><b>Main</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Main</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MAIN
	 * @model name="Main" literal="\u0413\u043b\u0430\u0432\u043d\u043e\u0435"
	 * @generated
	 * @ordered
	 */
	public static final int MAIN_VALUE = 2;

	/**
	 * The '<em><b>Empty</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Empty</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EMPTY
	 * @model name="Empty" literal="&lt;\u041e\u0441\u0442\u0430\u043b\u044c\u043d\u043e\u0435&gt;"
	 * @generated
	 * @ordered
	 */
	public static final int EMPTY_VALUE = 3;

	/**
	 * An array of all the '<em><b>Cm Special Subsystem Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final CmSpecialSubsystemType[] VALUES_ARRAY =
		new CmSpecialSubsystemType[] {
			SUBSYSTEM,
			ALL,
			MAIN,
			EMPTY,
		};

	/**
	 * A public read-only list of all the '<em><b>Cm Special Subsystem Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<CmSpecialSubsystemType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Cm Special Subsystem Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CmSpecialSubsystemType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CmSpecialSubsystemType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Cm Special Subsystem Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CmSpecialSubsystemType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CmSpecialSubsystemType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Cm Special Subsystem Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CmSpecialSubsystemType get(int value) {
		switch (value) {
			case SUBSYSTEM_VALUE: return SUBSYSTEM;
			case ALL_VALUE: return ALL;
			case MAIN_VALUE: return MAIN;
			case EMPTY_VALUE: return EMPTY;
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
	private CmSpecialSubsystemType(int value, String name, String literal) {
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
	
} //CmSpecialSubsystemType

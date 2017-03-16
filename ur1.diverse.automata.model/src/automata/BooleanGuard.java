/**
 */
package automata;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Boolean Guard</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link automata.BooleanGuard#isValue <em>Value</em>}</li>
 *   <li>{@link automata.BooleanGuard#getOperator <em>Operator</em>}</li>
 * </ul>
 *
 * @see automata.AutomataPackage#getBooleanGuard()
 * @model
 * @generated
 */
public interface BooleanGuard extends Guard {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(boolean)
	 * @see automata.AutomataPackage#getBooleanGuard_Value()
	 * @model default="true" required="true"
	 * @generated
	 */
	boolean isValue();

	/**
	 * Sets the value of the '{@link automata.BooleanGuard#isValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #isValue()
	 * @generated
	 */
	void setValue(boolean value);

	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link automata.BooleanOperator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see automata.BooleanOperator
	 * @see #setOperator(BooleanOperator)
	 * @see automata.AutomataPackage#getBooleanGuard_Operator()
	 * @model
	 * @generated
	 */
	BooleanOperator getOperator();

	/**
	 * Sets the value of the '{@link automata.BooleanGuard#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see automata.BooleanOperator
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(BooleanOperator value);

} // BooleanGuard

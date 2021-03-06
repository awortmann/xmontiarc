/**
 */
package ur1.diverse.xautomata.xdsml.xautomatamt.automata;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Boolean Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ur1.diverse.xautomata.xdsml.xautomatamt.automata.BooleanVariable#isInitialValue <em>Initial Value</em>}</li>
 *   <li>{@link ur1.diverse.xautomata.xdsml.xautomatamt.automata.BooleanVariable#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see ur1.diverse.xautomata.xdsml.xautomatamt.automata.AutomataPackage#getBooleanVariable()
 * @model
 * @generated
 */
public interface BooleanVariable extends Variable {
	/**
	 * Returns the value of the '<em><b>Initial Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initial Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial Value</em>' attribute.
	 * @see #setInitialValue(boolean)
	 * @see ur1.diverse.xautomata.xdsml.xautomatamt.automata.AutomataPackage#getBooleanVariable_InitialValue()
	 * @model required="true"
	 * @generated
	 */
	boolean isInitialValue();

	/**
	 * Sets the value of the '{@link ur1.diverse.xautomata.xdsml.xautomatamt.automata.BooleanVariable#isInitialValue <em>Initial Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial Value</em>' attribute.
	 * @see #isInitialValue()
	 * @generated
	 */
	void setInitialValue(boolean value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(Boolean)
	 * @see ur1.diverse.xautomata.xdsml.xautomatamt.automata.AutomataPackage#getBooleanVariable_Value()
	 * @model unique="false"
	 * @generated
	 */
	Boolean getValue();

	/**
	 * Sets the value of the '{@link ur1.diverse.xautomata.xdsml.xautomatamt.automata.BooleanVariable#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Boolean value);

} // BooleanVariable

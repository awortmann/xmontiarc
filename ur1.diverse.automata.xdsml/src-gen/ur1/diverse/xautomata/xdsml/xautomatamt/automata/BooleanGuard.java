/**
 */
package ur1.diverse.xautomata.xdsml.xautomatamt.automata;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Boolean Guard</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ur1.diverse.xautomata.xdsml.xautomatamt.automata.BooleanGuard#isValue <em>Value</em>}</li>
 *   <li>{@link ur1.diverse.xautomata.xdsml.xautomatamt.automata.BooleanGuard#getOperator <em>Operator</em>}</li>
 *   <li>{@link ur1.diverse.xautomata.xdsml.xautomatamt.automata.BooleanGuard#getSource <em>Source</em>}</li>
 * </ul>
 *
 * @see ur1.diverse.xautomata.xdsml.xautomatamt.automata.AutomataPackage#getBooleanGuard()
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
	 * @see ur1.diverse.xautomata.xdsml.xautomatamt.automata.AutomataPackage#getBooleanGuard_Value()
	 * @model default="true" required="true"
	 * @generated
	 */
	boolean isValue();

	/**
	 * Sets the value of the '{@link ur1.diverse.xautomata.xdsml.xautomatamt.automata.BooleanGuard#isValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #isValue()
	 * @generated
	 */
	void setValue(boolean value);

	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link ur1.diverse.xautomata.xdsml.xautomatamt.automata.BooleanOperator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see ur1.diverse.xautomata.xdsml.xautomatamt.automata.BooleanOperator
	 * @see #setOperator(BooleanOperator)
	 * @see ur1.diverse.xautomata.xdsml.xautomatamt.automata.AutomataPackage#getBooleanGuard_Operator()
	 * @model
	 * @generated
	 */
	BooleanOperator getOperator();

	/**
	 * Sets the value of the '{@link ur1.diverse.xautomata.xdsml.xautomatamt.automata.BooleanGuard#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see ur1.diverse.xautomata.xdsml.xautomatamt.automata.BooleanOperator
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(BooleanOperator value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(BooleanVariable)
	 * @see ur1.diverse.xautomata.xdsml.xautomatamt.automata.AutomataPackage#getBooleanGuard_Source()
	 * @model required="true"
	 * @generated
	 */
	BooleanVariable getSource();

	/**
	 * Sets the value of the '{@link ur1.diverse.xautomata.xdsml.xautomatamt.automata.BooleanGuard#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(BooleanVariable value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean holds();

} // BooleanGuard

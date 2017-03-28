/**
 */
package ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.fsm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Number Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.fsm.NumberAction#getValue <em>Value</em>}</li>
 *   <li>{@link ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.fsm.NumberAction#getTarget <em>Target</em>}</li>
 *   <li>{@link ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.fsm.NumberAction#getExpression <em>Expression</em>}</li>
 * </ul>
 *
 * @see ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.fsm.FsmPackage#getNumberAction()
 * @model
 * @generated
 */
public interface NumberAction extends Action {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(long)
	 * @see ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.fsm.FsmPackage#getNumberAction_Value()
	 * @model required="true"
	 * @generated
	 */
	long getValue();

	/**
	 * Sets the value of the '{@link ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.fsm.NumberAction#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(long value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(NumberVariable)
	 * @see ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.fsm.FsmPackage#getNumberAction_Target()
	 * @model required="true"
	 * @generated
	 */
	NumberVariable getTarget();

	/**
	 * Sets the value of the '{@link ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.fsm.NumberAction#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(NumberVariable value);

	/**
	 * Returns the value of the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expression</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' attribute.
	 * @see #setExpression(String)
	 * @see ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.fsm.FsmPackage#getNumberAction_Expression()
	 * @model
	 * @generated
	 */
	String getExpression();

	/**
	 * Sets the value of the '{@link ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.fsm.NumberAction#getExpression <em>Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' attribute.
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void execute();

} // NumberAction

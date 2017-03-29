/**
 */
package org.gemoc.xportautomata.xfsm.xportautomata.fsm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State Machine</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gemoc.xportautomata.xfsm.xportautomata.fsm.StateMachine#getOwnedStates <em>Owned States</em>}</li>
 *   <li>{@link org.gemoc.xportautomata.xfsm.xportautomata.fsm.StateMachine#getInitialState <em>Initial State</em>}</li>
 *   <li>{@link org.gemoc.xportautomata.xfsm.xportautomata.fsm.StateMachine#getOwnedTransitions <em>Owned Transitions</em>}</li>
 *   <li>{@link org.gemoc.xportautomata.xfsm.xportautomata.fsm.StateMachine#getVariables <em>Variables</em>}</li>
 * </ul>
 *
 * @see org.gemoc.xportautomata.xfsm.xportautomata.fsm.FsmPackage#getStateMachine()
 * @model
 * @generated
 */
public interface StateMachine extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Owned States</b></em>' containment reference list.
	 * The list contents are of type {@link org.gemoc.xportautomata.xfsm.xportautomata.fsm.State}.
	 * It is bidirectional and its opposite is '{@link org.gemoc.xportautomata.xfsm.xportautomata.fsm.State#getOwningFSM <em>Owning FSM</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned States</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned States</em>' containment reference list.
	 * @see org.gemoc.xportautomata.xfsm.xportautomata.fsm.FsmPackage#getStateMachine_OwnedStates()
	 * @see org.gemoc.xportautomata.xfsm.xportautomata.fsm.State#getOwningFSM
	 * @model opposite="owningFSM" containment="true"
	 * @generated
	 */
	EList<State> getOwnedStates();

	/**
	 * Returns the value of the '<em><b>Initial State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initial State</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial State</em>' reference.
	 * @see #setInitialState(State)
	 * @see org.gemoc.xportautomata.xfsm.xportautomata.fsm.FsmPackage#getStateMachine_InitialState()
	 * @model required="true"
	 * @generated
	 */
	State getInitialState();

	/**
	 * Sets the value of the '{@link org.gemoc.xportautomata.xfsm.xportautomata.fsm.StateMachine#getInitialState <em>Initial State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial State</em>' reference.
	 * @see #getInitialState()
	 * @generated
	 */
	void setInitialState(State value);

	/**
	 * Returns the value of the '<em><b>Owned Transitions</b></em>' containment reference list.
	 * The list contents are of type {@link org.gemoc.xportautomata.xfsm.xportautomata.fsm.Transition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Transitions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Transitions</em>' containment reference list.
	 * @see org.gemoc.xportautomata.xfsm.xportautomata.fsm.FsmPackage#getStateMachine_OwnedTransitions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Transition> getOwnedTransitions();

	/**
	 * Returns the value of the '<em><b>Variables</b></em>' containment reference list.
	 * The list contents are of type {@link org.gemoc.xportautomata.xfsm.xportautomata.fsm.Variable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variables</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variables</em>' containment reference list.
	 * @see org.gemoc.xportautomata.xfsm.xportautomata.fsm.FsmPackage#getStateMachine_Variables()
	 * @model containment="true"
	 * @generated
	 */
	EList<Variable> getVariables();

} // StateMachine

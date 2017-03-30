/**
 */
package org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.montiarc;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Automaton Component Behavior</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.montiarc.AutomatonComponentBehavior#getDelegateFSM <em>Delegate FSM</em>}</li>
 * </ul>
 *
 * @see org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.montiarc.MontiarcPackage#getAutomatonComponentBehavior()
 * @model
 * @generated
 */
public interface AutomatonComponentBehavior extends ComponentBehavior {
	/**
	 * Returns the value of the '<em><b>Delegate FSM</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delegate FSM</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delegate FSM</em>' reference.
	 * @see #setDelegateFSM(StateMachine)
	 * @see org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.montiarc.MontiarcPackage#getAutomatonComponentBehavior_DelegateFSM()
	 * @model
	 * @generated
	 */
	StateMachine getDelegateFSM();

	/**
	 * Sets the value of the '{@link org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.montiarc.AutomatonComponentBehavior#getDelegateFSM <em>Delegate FSM</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delegate FSM</em>' reference.
	 * @see #getDelegateFSM()
	 * @generated
	 */
	void setDelegateFSM(StateMachine value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void sendPortValuesToAutomaton();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void process();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void setPortValuesFromAutomaton();

} // AutomatonComponentBehavior

/**
 */
package org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.xmontiarc;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.xmontiarc.State#getOwningFSM <em>Owning FSM</em>}</li>
 *   <li>{@link org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.xmontiarc.State#getOutgoingTransitions <em>Outgoing Transitions</em>}</li>
 *   <li>{@link org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.xmontiarc.State#getIncomingTransitions <em>Incoming Transitions</em>}</li>
 * </ul>
 *
 * @see org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.xmontiarc.XmontiarcPackage#getState()
 * @model
 * @generated
 */
public interface State extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Owning FSM</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.xmontiarc.AutomatonComponentBehavior#getOwnedStates <em>Owned States</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owning FSM</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owning FSM</em>' container reference.
	 * @see #setOwningFSM(AutomatonComponentBehavior)
	 * @see org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.xmontiarc.XmontiarcPackage#getState_OwningFSM()
	 * @see org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.xmontiarc.AutomatonComponentBehavior#getOwnedStates
	 * @model opposite="ownedStates" required="true" transient="false"
	 * @generated
	 */
	AutomatonComponentBehavior getOwningFSM();

	/**
	 * Sets the value of the '{@link org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.xmontiarc.State#getOwningFSM <em>Owning FSM</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owning FSM</em>' container reference.
	 * @see #getOwningFSM()
	 * @generated
	 */
	void setOwningFSM(AutomatonComponentBehavior value);

	/**
	 * Returns the value of the '<em><b>Outgoing Transitions</b></em>' reference list.
	 * The list contents are of type {@link org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.xmontiarc.Transition}.
	 * It is bidirectional and its opposite is '{@link org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.xmontiarc.Transition#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outgoing Transitions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing Transitions</em>' reference list.
	 * @see org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.xmontiarc.XmontiarcPackage#getState_OutgoingTransitions()
	 * @see org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.xmontiarc.Transition#getSource
	 * @model opposite="source"
	 * @generated
	 */
	EList<Transition> getOutgoingTransitions();

	/**
	 * Returns the value of the '<em><b>Incoming Transitions</b></em>' reference list.
	 * The list contents are of type {@link org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.xmontiarc.Transition}.
	 * It is bidirectional and its opposite is '{@link org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.xmontiarc.Transition#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incoming Transitions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming Transitions</em>' reference list.
	 * @see org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.xmontiarc.XmontiarcPackage#getState_IncomingTransitions()
	 * @see org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.xmontiarc.Transition#getTarget
	 * @model opposite="target"
	 * @generated
	 */
	EList<Transition> getIncomingTransitions();

} // State

/**
 */
package org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.xmontiarc.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.xmontiarc.AutomatonComponentBehavior;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.xmontiarc.State;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.xmontiarc.Transition;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.xmontiarc.Variable;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.xmontiarc.XmontiarcPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Automaton Component Behavior</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.xmontiarc.impl.AutomatonComponentBehaviorImpl#getOwnedStates <em>Owned States</em>}</li>
 *   <li>{@link org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.xmontiarc.impl.AutomatonComponentBehaviorImpl#getInitialState <em>Initial State</em>}</li>
 *   <li>{@link org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.xmontiarc.impl.AutomatonComponentBehaviorImpl#getOwnedTransitions <em>Owned Transitions</em>}</li>
 *   <li>{@link org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.xmontiarc.impl.AutomatonComponentBehaviorImpl#getVariables <em>Variables</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AutomatonComponentBehaviorImpl extends NamedElementImpl implements AutomatonComponentBehavior {
	/**
	 * The cached value of the '{@link #getOwnedStates() <em>Owned States</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedStates()
	 * @generated
	 * @ordered
	 */
	protected EList<State> ownedStates;

	/**
	 * The cached value of the '{@link #getInitialState() <em>Initial State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialState()
	 * @generated
	 * @ordered
	 */
	protected State initialState;

	/**
	 * The cached value of the '{@link #getOwnedTransitions() <em>Owned Transitions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedTransitions()
	 * @generated
	 * @ordered
	 */
	protected EList<Transition> ownedTransitions;

	/**
	 * The cached value of the '{@link #getVariables() <em>Variables</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariables()
	 * @generated
	 * @ordered
	 */
	protected EList<Variable> variables;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AutomatonComponentBehaviorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XmontiarcPackage.Literals.AUTOMATON_COMPONENT_BEHAVIOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<State> getOwnedStates() {
		if (ownedStates == null) {
			ownedStates = new EObjectContainmentWithInverseEList<State>(State.class, this, XmontiarcPackage.AUTOMATON_COMPONENT_BEHAVIOR__OWNED_STATES, XmontiarcPackage.STATE__OWNING_FSM);
		}
		return ownedStates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State getInitialState() {
		if (initialState != null && initialState.eIsProxy()) {
			InternalEObject oldInitialState = (InternalEObject)initialState;
			initialState = (State)eResolveProxy(oldInitialState);
			if (initialState != oldInitialState) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, XmontiarcPackage.AUTOMATON_COMPONENT_BEHAVIOR__INITIAL_STATE, oldInitialState, initialState));
			}
		}
		return initialState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State basicGetInitialState() {
		return initialState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitialState(State newInitialState) {
		State oldInitialState = initialState;
		initialState = newInitialState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmontiarcPackage.AUTOMATON_COMPONENT_BEHAVIOR__INITIAL_STATE, oldInitialState, initialState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Transition> getOwnedTransitions() {
		if (ownedTransitions == null) {
			ownedTransitions = new EObjectContainmentEList<Transition>(Transition.class, this, XmontiarcPackage.AUTOMATON_COMPONENT_BEHAVIOR__OWNED_TRANSITIONS);
		}
		return ownedTransitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Variable> getVariables() {
		if (variables == null) {
			variables = new EObjectContainmentEList<Variable>(Variable.class, this, XmontiarcPackage.AUTOMATON_COMPONENT_BEHAVIOR__VARIABLES);
		}
		return variables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XmontiarcPackage.AUTOMATON_COMPONENT_BEHAVIOR__OWNED_STATES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnedStates()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XmontiarcPackage.AUTOMATON_COMPONENT_BEHAVIOR__OWNED_STATES:
				return ((InternalEList<?>)getOwnedStates()).basicRemove(otherEnd, msgs);
			case XmontiarcPackage.AUTOMATON_COMPONENT_BEHAVIOR__OWNED_TRANSITIONS:
				return ((InternalEList<?>)getOwnedTransitions()).basicRemove(otherEnd, msgs);
			case XmontiarcPackage.AUTOMATON_COMPONENT_BEHAVIOR__VARIABLES:
				return ((InternalEList<?>)getVariables()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case XmontiarcPackage.AUTOMATON_COMPONENT_BEHAVIOR__OWNED_STATES:
				return getOwnedStates();
			case XmontiarcPackage.AUTOMATON_COMPONENT_BEHAVIOR__INITIAL_STATE:
				if (resolve) return getInitialState();
				return basicGetInitialState();
			case XmontiarcPackage.AUTOMATON_COMPONENT_BEHAVIOR__OWNED_TRANSITIONS:
				return getOwnedTransitions();
			case XmontiarcPackage.AUTOMATON_COMPONENT_BEHAVIOR__VARIABLES:
				return getVariables();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case XmontiarcPackage.AUTOMATON_COMPONENT_BEHAVIOR__OWNED_STATES:
				getOwnedStates().clear();
				getOwnedStates().addAll((Collection<? extends State>)newValue);
				return;
			case XmontiarcPackage.AUTOMATON_COMPONENT_BEHAVIOR__INITIAL_STATE:
				setInitialState((State)newValue);
				return;
			case XmontiarcPackage.AUTOMATON_COMPONENT_BEHAVIOR__OWNED_TRANSITIONS:
				getOwnedTransitions().clear();
				getOwnedTransitions().addAll((Collection<? extends Transition>)newValue);
				return;
			case XmontiarcPackage.AUTOMATON_COMPONENT_BEHAVIOR__VARIABLES:
				getVariables().clear();
				getVariables().addAll((Collection<? extends Variable>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case XmontiarcPackage.AUTOMATON_COMPONENT_BEHAVIOR__OWNED_STATES:
				getOwnedStates().clear();
				return;
			case XmontiarcPackage.AUTOMATON_COMPONENT_BEHAVIOR__INITIAL_STATE:
				setInitialState((State)null);
				return;
			case XmontiarcPackage.AUTOMATON_COMPONENT_BEHAVIOR__OWNED_TRANSITIONS:
				getOwnedTransitions().clear();
				return;
			case XmontiarcPackage.AUTOMATON_COMPONENT_BEHAVIOR__VARIABLES:
				getVariables().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case XmontiarcPackage.AUTOMATON_COMPONENT_BEHAVIOR__OWNED_STATES:
				return ownedStates != null && !ownedStates.isEmpty();
			case XmontiarcPackage.AUTOMATON_COMPONENT_BEHAVIOR__INITIAL_STATE:
				return initialState != null;
			case XmontiarcPackage.AUTOMATON_COMPONENT_BEHAVIOR__OWNED_TRANSITIONS:
				return ownedTransitions != null && !ownedTransitions.isEmpty();
			case XmontiarcPackage.AUTOMATON_COMPONENT_BEHAVIOR__VARIABLES:
				return variables != null && !variables.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AutomatonComponentBehaviorImpl

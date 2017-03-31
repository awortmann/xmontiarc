/**
 */
package org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.montiarc.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.montiarc.AutomatonComponentBehavior;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.montiarc.FsmPackage;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.montiarc.StateMachine;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Automaton Component Behavior</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.montiarc.impl.AutomatonComponentBehaviorImpl#getDelegateFSM <em>Delegate FSM</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AutomatonComponentBehaviorImpl extends ComponentBehaviorImpl implements AutomatonComponentBehavior {
	/**
	 * The cached value of the '{@link #getDelegateFSM() <em>Delegate FSM</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDelegateFSM()
	 * @generated
	 * @ordered
	 */
	protected StateMachine delegateFSM;

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
		return FsmPackage.Literals.AUTOMATON_COMPONENT_BEHAVIOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateMachine getDelegateFSM() {
		if (delegateFSM != null && delegateFSM.eIsProxy()) {
			InternalEObject oldDelegateFSM = (InternalEObject)delegateFSM;
			delegateFSM = (StateMachine)eResolveProxy(oldDelegateFSM);
			if (delegateFSM != oldDelegateFSM) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FsmPackage.AUTOMATON_COMPONENT_BEHAVIOR__DELEGATE_FSM, oldDelegateFSM, delegateFSM));
			}
		}
		return delegateFSM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateMachine basicGetDelegateFSM() {
		return delegateFSM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDelegateFSM(StateMachine newDelegateFSM) {
		StateMachine oldDelegateFSM = delegateFSM;
		delegateFSM = newDelegateFSM;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FsmPackage.AUTOMATON_COMPONENT_BEHAVIOR__DELEGATE_FSM, oldDelegateFSM, delegateFSM));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void wrapPortValuesToAutomaton() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void process() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unwrapPortValuesFromAutomaton() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FsmPackage.AUTOMATON_COMPONENT_BEHAVIOR__DELEGATE_FSM:
				if (resolve) return getDelegateFSM();
				return basicGetDelegateFSM();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case FsmPackage.AUTOMATON_COMPONENT_BEHAVIOR__DELEGATE_FSM:
				setDelegateFSM((StateMachine)newValue);
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
			case FsmPackage.AUTOMATON_COMPONENT_BEHAVIOR__DELEGATE_FSM:
				setDelegateFSM((StateMachine)null);
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
			case FsmPackage.AUTOMATON_COMPONENT_BEHAVIOR__DELEGATE_FSM:
				return delegateFSM != null;
		}
		return super.eIsSet(featureID);
	}

} //AutomatonComponentBehaviorImpl

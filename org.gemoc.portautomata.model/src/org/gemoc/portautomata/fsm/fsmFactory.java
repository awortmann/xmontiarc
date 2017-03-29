/**
 */
package org.gemoc.portautomata.fsm;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.gemoc.portautomata.fsm.fsmPackage
 * @generated
 */
public interface fsmFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	fsmFactory eINSTANCE = org.gemoc.portautomata.fsm.impl.fsmFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>State Machine</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>State Machine</em>'.
	 * @generated
	 */
	StateMachine createStateMachine();

	/**
	 * Returns a new object of class '<em>State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>State</em>'.
	 * @generated
	 */
	State createState();

	/**
	 * Returns a new object of class '<em>Transition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Transition</em>'.
	 * @generated
	 */
	Transition createTransition();

	/**
	 * Returns a new object of class '<em>String Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>String Variable</em>'.
	 * @generated
	 */
	StringVariable createStringVariable();

	/**
	 * Returns a new object of class '<em>Number Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Number Variable</em>'.
	 * @generated
	 */
	NumberVariable createNumberVariable();

	/**
	 * Returns a new object of class '<em>Boolean Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Boolean Variable</em>'.
	 * @generated
	 */
	BooleanVariable createBooleanVariable();

	/**
	 * Returns a new object of class '<em>Boolean Guard</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Boolean Guard</em>'.
	 * @generated
	 */
	BooleanGuard createBooleanGuard();

	/**
	 * Returns a new object of class '<em>String Guard</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>String Guard</em>'.
	 * @generated
	 */
	StringGuard createStringGuard();

	/**
	 * Returns a new object of class '<em>Equal Number Guard</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Equal Number Guard</em>'.
	 * @generated
	 */
	EqualNumberGuard createEqualNumberGuard();

	/**
	 * Returns a new object of class '<em>String Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>String Action</em>'.
	 * @generated
	 */
	StringAction createStringAction();

	/**
	 * Returns a new object of class '<em>Number Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Number Action</em>'.
	 * @generated
	 */
	NumberAction createNumberAction();

	/**
	 * Returns a new object of class '<em>Boolean Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Boolean Action</em>'.
	 * @generated
	 */
	BooleanAction createBooleanAction();

	/**
	 * Returns a new object of class '<em>Less Than Number Guard</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Less Than Number Guard</em>'.
	 * @generated
	 */
	LessThanNumberGuard createLessThanNumberGuard();

	/**
	 * Returns a new object of class '<em>Greater Than Number Guard</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Greater Than Number Guard</em>'.
	 * @generated
	 */
	GreaterThanNumberGuard createGreaterThanNumberGuard();

	/**
	 * Returns a new object of class '<em>Greater Or Equal Than Number Guard</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Greater Or Equal Than Number Guard</em>'.
	 * @generated
	 */
	GreaterOrEqualThanNumberGuard createGreaterOrEqualThanNumberGuard();

	/**
	 * Returns a new object of class '<em>Less Or Equal Than Number Guard</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Less Or Equal Than Number Guard</em>'.
	 * @generated
	 */
	LessOrEqualThanNumberGuard createLessOrEqualThanNumberGuard();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	fsmPackage getfsmPackage();

} //fsmFactory

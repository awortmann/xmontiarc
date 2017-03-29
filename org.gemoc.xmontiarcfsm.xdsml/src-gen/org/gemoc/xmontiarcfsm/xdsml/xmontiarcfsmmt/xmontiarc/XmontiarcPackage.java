/**
 */
package org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.XmontiarcFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/OCL/Import ecore='http://www.eclipse.org/emf/2002/Ecore'"
 * @generated
 */
public interface XmontiarcPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "xmontiarc";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt/xmontiarc/";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "fsm";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	XmontiarcPackage eINSTANCE = org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.impl.XmontiarcPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.impl.NamedElementImpl
	 * @see org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.impl.XmontiarcPackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.impl.AutomatonComponentBehaviorImpl <em>Automaton Component Behavior</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.impl.AutomatonComponentBehaviorImpl
	 * @see org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.impl.XmontiarcPackageImpl#getAutomatonComponentBehavior()
	 * @generated
	 */
	int AUTOMATON_COMPONENT_BEHAVIOR = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOMATON_COMPONENT_BEHAVIOR__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Owned States</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOMATON_COMPONENT_BEHAVIOR__OWNED_STATES = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Initial State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOMATON_COMPONENT_BEHAVIOR__INITIAL_STATE = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Owned Transitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOMATON_COMPONENT_BEHAVIOR__OWNED_TRANSITIONS = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOMATON_COMPONENT_BEHAVIOR__VARIABLES = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Automaton Component Behavior</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOMATON_COMPONENT_BEHAVIOR_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.impl.StateImpl <em>State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.impl.StateImpl
	 * @see org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.impl.XmontiarcPackageImpl#getState()
	 * @generated
	 */
	int STATE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Owning FSM</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__OWNING_FSM = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Outgoing Transitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__OUTGOING_TRANSITIONS = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Incoming Transitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__INCOMING_TRANSITIONS = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.impl.TransitionImpl <em>Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.impl.TransitionImpl
	 * @see org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.impl.XmontiarcPackageImpl#getTransition()
	 * @generated
	 */
	int TRANSITION = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__SOURCE = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__TARGET = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Input</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__INPUT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Output</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__OUTPUT = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Guard</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__GUARD = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Action</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__ACTION = NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.impl.VariableImpl <em>Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.impl.VariableImpl
	 * @see org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.impl.XmontiarcPackageImpl#getVariable()
	 * @generated
	 */
	int VARIABLE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__NAME = 0;

	/**
	 * The number of structural features of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.impl.StringVariableImpl <em>String Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.impl.StringVariableImpl
	 * @see org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.impl.XmontiarcPackageImpl#getStringVariable()
	 * @generated
	 */
	int STRING_VARIABLE = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_VARIABLE__NAME = VARIABLE__NAME;

	/**
	 * The feature id for the '<em><b>Initial Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_VARIABLE__INITIAL_VALUE = VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>String Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_VARIABLE_FEATURE_COUNT = VARIABLE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.impl.NumberVariableImpl <em>Number Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.impl.NumberVariableImpl
	 * @see org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.impl.XmontiarcPackageImpl#getNumberVariable()
	 * @generated
	 */
	int NUMBER_VARIABLE = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_VARIABLE__NAME = VARIABLE__NAME;

	/**
	 * The feature id for the '<em><b>Initial Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_VARIABLE__INITIAL_VALUE = VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Number Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_VARIABLE_FEATURE_COUNT = VARIABLE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.impl.BooleanVariableImpl <em>Boolean Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.impl.BooleanVariableImpl
	 * @see org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.impl.XmontiarcPackageImpl#getBooleanVariable()
	 * @generated
	 */
	int BOOLEAN_VARIABLE = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VARIABLE__NAME = VARIABLE__NAME;

	/**
	 * The feature id for the '<em><b>Initial Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VARIABLE__INITIAL_VALUE = VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Boolean Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VARIABLE_FEATURE_COUNT = VARIABLE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.impl.GuardImpl <em>Guard</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.impl.GuardImpl
	 * @see org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.impl.XmontiarcPackageImpl#getGuard()
	 * @generated
	 */
	int GUARD = 8;

	/**
	 * The feature id for the '<em><b>Not</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUARD__NOT = 0;

	/**
	 * The number of structural features of the '<em>Guard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUARD_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.impl.BooleanGuardImpl <em>Boolean Guard</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.impl.BooleanGuardImpl
	 * @see org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.impl.XmontiarcPackageImpl#getBooleanGuard()
	 * @generated
	 */
	int BOOLEAN_GUARD = 9;

	/**
	 * The feature id for the '<em><b>Not</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_GUARD__NOT = GUARD__NOT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_GUARD__VALUE = GUARD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_GUARD__SOURCE = GUARD_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Boolean Guard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_GUARD_FEATURE_COUNT = GUARD_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.impl.StringGuardImpl <em>String Guard</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.impl.StringGuardImpl
	 * @see org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.impl.XmontiarcPackageImpl#getStringGuard()
	 * @generated
	 */
	int STRING_GUARD = 10;

	/**
	 * The feature id for the '<em><b>Not</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_GUARD__NOT = GUARD__NOT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_GUARD__VALUE = GUARD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_GUARD__SOURCE = GUARD_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>String Guard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_GUARD_FEATURE_COUNT = GUARD_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.impl.NumberGuardImpl <em>Number Guard</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.impl.NumberGuardImpl
	 * @see org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.impl.XmontiarcPackageImpl#getNumberGuard()
	 * @generated
	 */
	int NUMBER_GUARD = 11;

	/**
	 * The feature id for the '<em><b>Not</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_GUARD__NOT = GUARD__NOT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_GUARD__VALUE = GUARD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_GUARD__SOURCE = GUARD_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Number Guard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_GUARD_FEATURE_COUNT = GUARD_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.impl.EqualNumberGuardImpl <em>Equal Number Guard</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.impl.EqualNumberGuardImpl
	 * @see org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.impl.XmontiarcPackageImpl#getEqualNumberGuard()
	 * @generated
	 */
	int EQUAL_NUMBER_GUARD = 12;

	/**
	 * The feature id for the '<em><b>Not</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUAL_NUMBER_GUARD__NOT = NUMBER_GUARD__NOT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUAL_NUMBER_GUARD__VALUE = NUMBER_GUARD__VALUE;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUAL_NUMBER_GUARD__SOURCE = NUMBER_GUARD__SOURCE;

	/**
	 * The number of structural features of the '<em>Equal Number Guard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUAL_NUMBER_GUARD_FEATURE_COUNT = NUMBER_GUARD_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.impl.ActionImpl <em>Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.impl.ActionImpl
	 * @see org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.impl.XmontiarcPackageImpl#getAction()
	 * @generated
	 */
	int ACTION = 13;

	/**
	 * The number of structural features of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.impl.StringActionImpl <em>String Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.impl.StringActionImpl
	 * @see org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.impl.XmontiarcPackageImpl#getStringAction()
	 * @generated
	 */
	int STRING_ACTION = 14;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_ACTION__VALUE = ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_ACTION__TARGET = ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>String Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_ACTION_FEATURE_COUNT = ACTION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.impl.NumberActionImpl <em>Number Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.impl.NumberActionImpl
	 * @see org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.impl.XmontiarcPackageImpl#getNumberAction()
	 * @generated
	 */
	int NUMBER_ACTION = 15;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_ACTION__VALUE = ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_ACTION__TARGET = ACTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_ACTION__EXPRESSION = ACTION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Number Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_ACTION_FEATURE_COUNT = ACTION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.impl.BooleanActionImpl <em>Boolean Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.impl.BooleanActionImpl
	 * @see org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.impl.XmontiarcPackageImpl#getBooleanAction()
	 * @generated
	 */
	int BOOLEAN_ACTION = 16;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_ACTION__VALUE = ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_ACTION__TARGET = ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Boolean Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_ACTION_FEATURE_COUNT = ACTION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.impl.LessThanNumberGuardImpl <em>Less Than Number Guard</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.impl.LessThanNumberGuardImpl
	 * @see org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.impl.XmontiarcPackageImpl#getLessThanNumberGuard()
	 * @generated
	 */
	int LESS_THAN_NUMBER_GUARD = 17;

	/**
	 * The feature id for the '<em><b>Not</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_THAN_NUMBER_GUARD__NOT = NUMBER_GUARD__NOT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_THAN_NUMBER_GUARD__VALUE = NUMBER_GUARD__VALUE;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_THAN_NUMBER_GUARD__SOURCE = NUMBER_GUARD__SOURCE;

	/**
	 * The number of structural features of the '<em>Less Than Number Guard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_THAN_NUMBER_GUARD_FEATURE_COUNT = NUMBER_GUARD_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.impl.GreaterThanNumberGuardImpl <em>Greater Than Number Guard</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.impl.GreaterThanNumberGuardImpl
	 * @see org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.impl.XmontiarcPackageImpl#getGreaterThanNumberGuard()
	 * @generated
	 */
	int GREATER_THAN_NUMBER_GUARD = 18;

	/**
	 * The feature id for the '<em><b>Not</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_THAN_NUMBER_GUARD__NOT = NUMBER_GUARD__NOT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_THAN_NUMBER_GUARD__VALUE = NUMBER_GUARD__VALUE;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_THAN_NUMBER_GUARD__SOURCE = NUMBER_GUARD__SOURCE;

	/**
	 * The number of structural features of the '<em>Greater Than Number Guard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_THAN_NUMBER_GUARD_FEATURE_COUNT = NUMBER_GUARD_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.impl.GreaterOrEqualThanNumberGuardImpl <em>Greater Or Equal Than Number Guard</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.impl.GreaterOrEqualThanNumberGuardImpl
	 * @see org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.impl.XmontiarcPackageImpl#getGreaterOrEqualThanNumberGuard()
	 * @generated
	 */
	int GREATER_OR_EQUAL_THAN_NUMBER_GUARD = 19;

	/**
	 * The feature id for the '<em><b>Not</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_OR_EQUAL_THAN_NUMBER_GUARD__NOT = NUMBER_GUARD__NOT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_OR_EQUAL_THAN_NUMBER_GUARD__VALUE = NUMBER_GUARD__VALUE;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_OR_EQUAL_THAN_NUMBER_GUARD__SOURCE = NUMBER_GUARD__SOURCE;

	/**
	 * The number of structural features of the '<em>Greater Or Equal Than Number Guard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_OR_EQUAL_THAN_NUMBER_GUARD_FEATURE_COUNT = NUMBER_GUARD_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.impl.LessOrEqualThanNumberGuardImpl <em>Less Or Equal Than Number Guard</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.impl.LessOrEqualThanNumberGuardImpl
	 * @see org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.impl.XmontiarcPackageImpl#getLessOrEqualThanNumberGuard()
	 * @generated
	 */
	int LESS_OR_EQUAL_THAN_NUMBER_GUARD = 20;

	/**
	 * The feature id for the '<em><b>Not</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_OR_EQUAL_THAN_NUMBER_GUARD__NOT = NUMBER_GUARD__NOT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_OR_EQUAL_THAN_NUMBER_GUARD__VALUE = NUMBER_GUARD__VALUE;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_OR_EQUAL_THAN_NUMBER_GUARD__SOURCE = NUMBER_GUARD__SOURCE;

	/**
	 * The number of structural features of the '<em>Less Or Equal Than Number Guard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_OR_EQUAL_THAN_NUMBER_GUARD_FEATURE_COUNT = NUMBER_GUARD_FEATURE_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.AutomatonComponentBehavior <em>Automaton Component Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Automaton Component Behavior</em>'.
	 * @see org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.AutomatonComponentBehavior
	 * @generated
	 */
	EClass getAutomatonComponentBehavior();

	/**
	 * Returns the meta object for the containment reference list '{@link org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.AutomatonComponentBehavior#getOwnedStates <em>Owned States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned States</em>'.
	 * @see org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.AutomatonComponentBehavior#getOwnedStates()
	 * @see #getAutomatonComponentBehavior()
	 * @generated
	 */
	EReference getAutomatonComponentBehavior_OwnedStates();

	/**
	 * Returns the meta object for the reference '{@link org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.AutomatonComponentBehavior#getInitialState <em>Initial State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Initial State</em>'.
	 * @see org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.AutomatonComponentBehavior#getInitialState()
	 * @see #getAutomatonComponentBehavior()
	 * @generated
	 */
	EReference getAutomatonComponentBehavior_InitialState();

	/**
	 * Returns the meta object for the containment reference list '{@link org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.AutomatonComponentBehavior#getOwnedTransitions <em>Owned Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Transitions</em>'.
	 * @see org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.AutomatonComponentBehavior#getOwnedTransitions()
	 * @see #getAutomatonComponentBehavior()
	 * @generated
	 */
	EReference getAutomatonComponentBehavior_OwnedTransitions();

	/**
	 * Returns the meta object for the containment reference list '{@link org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.AutomatonComponentBehavior#getVariables <em>Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Variables</em>'.
	 * @see org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.AutomatonComponentBehavior#getVariables()
	 * @see #getAutomatonComponentBehavior()
	 * @generated
	 */
	EReference getAutomatonComponentBehavior_Variables();

	/**
	 * Returns the meta object for class '{@link org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.State <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State</em>'.
	 * @see org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.State
	 * @generated
	 */
	EClass getState();

	/**
	 * Returns the meta object for the container reference '{@link org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.State#getOwningFSM <em>Owning FSM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owning FSM</em>'.
	 * @see org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.State#getOwningFSM()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_OwningFSM();

	/**
	 * Returns the meta object for the reference list '{@link org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.State#getOutgoingTransitions <em>Outgoing Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Outgoing Transitions</em>'.
	 * @see org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.State#getOutgoingTransitions()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_OutgoingTransitions();

	/**
	 * Returns the meta object for the reference list '{@link org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.State#getIncomingTransitions <em>Incoming Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Incoming Transitions</em>'.
	 * @see org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.State#getIncomingTransitions()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_IncomingTransitions();

	/**
	 * Returns the meta object for class '{@link org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.Transition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition</em>'.
	 * @see org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.Transition
	 * @generated
	 */
	EClass getTransition();

	/**
	 * Returns the meta object for the reference '{@link org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.Transition#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.Transition#getSource()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Source();

	/**
	 * Returns the meta object for the reference '{@link org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.Transition#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.Transition#getTarget()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Target();

	/**
	 * Returns the meta object for the attribute '{@link org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.Transition#getInput <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Input</em>'.
	 * @see org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.Transition#getInput()
	 * @see #getTransition()
	 * @generated
	 */
	EAttribute getTransition_Input();

	/**
	 * Returns the meta object for the attribute '{@link org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.Transition#getOutput <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Output</em>'.
	 * @see org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.Transition#getOutput()
	 * @see #getTransition()
	 * @generated
	 */
	EAttribute getTransition_Output();

	/**
	 * Returns the meta object for the containment reference '{@link org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.Transition#getGuard <em>Guard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Guard</em>'.
	 * @see org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.Transition#getGuard()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Guard();

	/**
	 * Returns the meta object for the containment reference '{@link org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.Transition#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Action</em>'.
	 * @see org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.Transition#getAction()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Action();

	/**
	 * Returns the meta object for class '{@link org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for class '{@link org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable</em>'.
	 * @see org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.Variable
	 * @generated
	 */
	EClass getVariable();

	/**
	 * Returns the meta object for the attribute '{@link org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.Variable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.Variable#getName()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_Name();

	/**
	 * Returns the meta object for class '{@link org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.StringVariable <em>String Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Variable</em>'.
	 * @see org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.StringVariable
	 * @generated
	 */
	EClass getStringVariable();

	/**
	 * Returns the meta object for the attribute '{@link org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.StringVariable#getInitialValue <em>Initial Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Initial Value</em>'.
	 * @see org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.StringVariable#getInitialValue()
	 * @see #getStringVariable()
	 * @generated
	 */
	EAttribute getStringVariable_InitialValue();

	/**
	 * Returns the meta object for class '{@link org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.NumberVariable <em>Number Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Number Variable</em>'.
	 * @see org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.NumberVariable
	 * @generated
	 */
	EClass getNumberVariable();

	/**
	 * Returns the meta object for the attribute '{@link org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.NumberVariable#getInitialValue <em>Initial Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Initial Value</em>'.
	 * @see org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.NumberVariable#getInitialValue()
	 * @see #getNumberVariable()
	 * @generated
	 */
	EAttribute getNumberVariable_InitialValue();

	/**
	 * Returns the meta object for class '{@link org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.BooleanVariable <em>Boolean Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Variable</em>'.
	 * @see org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.BooleanVariable
	 * @generated
	 */
	EClass getBooleanVariable();

	/**
	 * Returns the meta object for the attribute '{@link org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.BooleanVariable#isInitialValue <em>Initial Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Initial Value</em>'.
	 * @see org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.BooleanVariable#isInitialValue()
	 * @see #getBooleanVariable()
	 * @generated
	 */
	EAttribute getBooleanVariable_InitialValue();

	/**
	 * Returns the meta object for class '{@link org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.Guard <em>Guard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Guard</em>'.
	 * @see org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.Guard
	 * @generated
	 */
	EClass getGuard();

	/**
	 * Returns the meta object for the attribute '{@link org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.Guard#isNot <em>Not</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Not</em>'.
	 * @see org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.Guard#isNot()
	 * @see #getGuard()
	 * @generated
	 */
	EAttribute getGuard_Not();

	/**
	 * Returns the meta object for class '{@link org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.BooleanGuard <em>Boolean Guard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Guard</em>'.
	 * @see org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.BooleanGuard
	 * @generated
	 */
	EClass getBooleanGuard();

	/**
	 * Returns the meta object for the attribute '{@link org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.BooleanGuard#isValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.BooleanGuard#isValue()
	 * @see #getBooleanGuard()
	 * @generated
	 */
	EAttribute getBooleanGuard_Value();

	/**
	 * Returns the meta object for the reference '{@link org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.BooleanGuard#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.BooleanGuard#getSource()
	 * @see #getBooleanGuard()
	 * @generated
	 */
	EReference getBooleanGuard_Source();

	/**
	 * Returns the meta object for class '{@link org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.StringGuard <em>String Guard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Guard</em>'.
	 * @see org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.StringGuard
	 * @generated
	 */
	EClass getStringGuard();

	/**
	 * Returns the meta object for the attribute '{@link org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.StringGuard#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.StringGuard#getValue()
	 * @see #getStringGuard()
	 * @generated
	 */
	EAttribute getStringGuard_Value();

	/**
	 * Returns the meta object for the reference '{@link org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.StringGuard#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.StringGuard#getSource()
	 * @see #getStringGuard()
	 * @generated
	 */
	EReference getStringGuard_Source();

	/**
	 * Returns the meta object for class '{@link org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.NumberGuard <em>Number Guard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Number Guard</em>'.
	 * @see org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.NumberGuard
	 * @generated
	 */
	EClass getNumberGuard();

	/**
	 * Returns the meta object for the attribute '{@link org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.NumberGuard#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.NumberGuard#getValue()
	 * @see #getNumberGuard()
	 * @generated
	 */
	EAttribute getNumberGuard_Value();

	/**
	 * Returns the meta object for the reference '{@link org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.NumberGuard#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.NumberGuard#getSource()
	 * @see #getNumberGuard()
	 * @generated
	 */
	EReference getNumberGuard_Source();

	/**
	 * Returns the meta object for class '{@link org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.EqualNumberGuard <em>Equal Number Guard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Equal Number Guard</em>'.
	 * @see org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.EqualNumberGuard
	 * @generated
	 */
	EClass getEqualNumberGuard();

	/**
	 * Returns the meta object for class '{@link org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action</em>'.
	 * @see org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.Action
	 * @generated
	 */
	EClass getAction();

	/**
	 * Returns the meta object for class '{@link org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.StringAction <em>String Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Action</em>'.
	 * @see org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.StringAction
	 * @generated
	 */
	EClass getStringAction();

	/**
	 * Returns the meta object for the attribute '{@link org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.StringAction#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.StringAction#getValue()
	 * @see #getStringAction()
	 * @generated
	 */
	EAttribute getStringAction_Value();

	/**
	 * Returns the meta object for the reference '{@link org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.StringAction#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.StringAction#getTarget()
	 * @see #getStringAction()
	 * @generated
	 */
	EReference getStringAction_Target();

	/**
	 * Returns the meta object for class '{@link org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.NumberAction <em>Number Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Number Action</em>'.
	 * @see org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.NumberAction
	 * @generated
	 */
	EClass getNumberAction();

	/**
	 * Returns the meta object for the attribute '{@link org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.NumberAction#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.NumberAction#getValue()
	 * @see #getNumberAction()
	 * @generated
	 */
	EAttribute getNumberAction_Value();

	/**
	 * Returns the meta object for the reference '{@link org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.NumberAction#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.NumberAction#getTarget()
	 * @see #getNumberAction()
	 * @generated
	 */
	EReference getNumberAction_Target();

	/**
	 * Returns the meta object for the attribute '{@link org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.NumberAction#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expression</em>'.
	 * @see org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.NumberAction#getExpression()
	 * @see #getNumberAction()
	 * @generated
	 */
	EAttribute getNumberAction_Expression();

	/**
	 * Returns the meta object for class '{@link org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.BooleanAction <em>Boolean Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Action</em>'.
	 * @see org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.BooleanAction
	 * @generated
	 */
	EClass getBooleanAction();

	/**
	 * Returns the meta object for the attribute '{@link org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.BooleanAction#isValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.BooleanAction#isValue()
	 * @see #getBooleanAction()
	 * @generated
	 */
	EAttribute getBooleanAction_Value();

	/**
	 * Returns the meta object for the reference '{@link org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.BooleanAction#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.BooleanAction#getTarget()
	 * @see #getBooleanAction()
	 * @generated
	 */
	EReference getBooleanAction_Target();

	/**
	 * Returns the meta object for class '{@link org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.LessThanNumberGuard <em>Less Than Number Guard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Less Than Number Guard</em>'.
	 * @see org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.LessThanNumberGuard
	 * @generated
	 */
	EClass getLessThanNumberGuard();

	/**
	 * Returns the meta object for class '{@link org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.GreaterThanNumberGuard <em>Greater Than Number Guard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Greater Than Number Guard</em>'.
	 * @see org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.GreaterThanNumberGuard
	 * @generated
	 */
	EClass getGreaterThanNumberGuard();

	/**
	 * Returns the meta object for class '{@link org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.GreaterOrEqualThanNumberGuard <em>Greater Or Equal Than Number Guard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Greater Or Equal Than Number Guard</em>'.
	 * @see org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.GreaterOrEqualThanNumberGuard
	 * @generated
	 */
	EClass getGreaterOrEqualThanNumberGuard();

	/**
	 * Returns the meta object for class '{@link org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.LessOrEqualThanNumberGuard <em>Less Or Equal Than Number Guard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Less Or Equal Than Number Guard</em>'.
	 * @see org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.LessOrEqualThanNumberGuard
	 * @generated
	 */
	EClass getLessOrEqualThanNumberGuard();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	XmontiarcFactory getXmontiarcFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.impl.AutomatonComponentBehaviorImpl <em>Automaton Component Behavior</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.impl.AutomatonComponentBehaviorImpl
		 * @see org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.impl.XmontiarcPackageImpl#getAutomatonComponentBehavior()
		 * @generated
		 */
		EClass AUTOMATON_COMPONENT_BEHAVIOR = eINSTANCE.getAutomatonComponentBehavior();

		/**
		 * The meta object literal for the '<em><b>Owned States</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AUTOMATON_COMPONENT_BEHAVIOR__OWNED_STATES = eINSTANCE.getAutomatonComponentBehavior_OwnedStates();

		/**
		 * The meta object literal for the '<em><b>Initial State</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AUTOMATON_COMPONENT_BEHAVIOR__INITIAL_STATE = eINSTANCE.getAutomatonComponentBehavior_InitialState();

		/**
		 * The meta object literal for the '<em><b>Owned Transitions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AUTOMATON_COMPONENT_BEHAVIOR__OWNED_TRANSITIONS = eINSTANCE.getAutomatonComponentBehavior_OwnedTransitions();

		/**
		 * The meta object literal for the '<em><b>Variables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AUTOMATON_COMPONENT_BEHAVIOR__VARIABLES = eINSTANCE.getAutomatonComponentBehavior_Variables();

		/**
		 * The meta object literal for the '{@link org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.impl.StateImpl <em>State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.impl.StateImpl
		 * @see org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.impl.XmontiarcPackageImpl#getState()
		 * @generated
		 */
		EClass STATE = eINSTANCE.getState();

		/**
		 * The meta object literal for the '<em><b>Owning FSM</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__OWNING_FSM = eINSTANCE.getState_OwningFSM();

		/**
		 * The meta object literal for the '<em><b>Outgoing Transitions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__OUTGOING_TRANSITIONS = eINSTANCE.getState_OutgoingTransitions();

		/**
		 * The meta object literal for the '<em><b>Incoming Transitions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__INCOMING_TRANSITIONS = eINSTANCE.getState_IncomingTransitions();

		/**
		 * The meta object literal for the '{@link org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.impl.TransitionImpl <em>Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.impl.TransitionImpl
		 * @see org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.impl.XmontiarcPackageImpl#getTransition()
		 * @generated
		 */
		EClass TRANSITION = eINSTANCE.getTransition();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__SOURCE = eINSTANCE.getTransition_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__TARGET = eINSTANCE.getTransition_Target();

		/**
		 * The meta object literal for the '<em><b>Input</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION__INPUT = eINSTANCE.getTransition_Input();

		/**
		 * The meta object literal for the '<em><b>Output</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION__OUTPUT = eINSTANCE.getTransition_Output();

		/**
		 * The meta object literal for the '<em><b>Guard</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__GUARD = eINSTANCE.getTransition_Guard();

		/**
		 * The meta object literal for the '<em><b>Action</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__ACTION = eINSTANCE.getTransition_Action();

		/**
		 * The meta object literal for the '{@link org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.impl.NamedElementImpl
		 * @see org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.impl.XmontiarcPackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

		/**
		 * The meta object literal for the '{@link org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.impl.VariableImpl <em>Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.impl.VariableImpl
		 * @see org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.impl.XmontiarcPackageImpl#getVariable()
		 * @generated
		 */
		EClass VARIABLE = eINSTANCE.getVariable();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__NAME = eINSTANCE.getVariable_Name();

		/**
		 * The meta object literal for the '{@link org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.impl.StringVariableImpl <em>String Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.impl.StringVariableImpl
		 * @see org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.impl.XmontiarcPackageImpl#getStringVariable()
		 * @generated
		 */
		EClass STRING_VARIABLE = eINSTANCE.getStringVariable();

		/**
		 * The meta object literal for the '<em><b>Initial Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_VARIABLE__INITIAL_VALUE = eINSTANCE.getStringVariable_InitialValue();

		/**
		 * The meta object literal for the '{@link org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.impl.NumberVariableImpl <em>Number Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.impl.NumberVariableImpl
		 * @see org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.impl.XmontiarcPackageImpl#getNumberVariable()
		 * @generated
		 */
		EClass NUMBER_VARIABLE = eINSTANCE.getNumberVariable();

		/**
		 * The meta object literal for the '<em><b>Initial Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUMBER_VARIABLE__INITIAL_VALUE = eINSTANCE.getNumberVariable_InitialValue();

		/**
		 * The meta object literal for the '{@link org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.impl.BooleanVariableImpl <em>Boolean Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.impl.BooleanVariableImpl
		 * @see org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.impl.XmontiarcPackageImpl#getBooleanVariable()
		 * @generated
		 */
		EClass BOOLEAN_VARIABLE = eINSTANCE.getBooleanVariable();

		/**
		 * The meta object literal for the '<em><b>Initial Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOLEAN_VARIABLE__INITIAL_VALUE = eINSTANCE.getBooleanVariable_InitialValue();

		/**
		 * The meta object literal for the '{@link org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.impl.GuardImpl <em>Guard</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.impl.GuardImpl
		 * @see org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.impl.XmontiarcPackageImpl#getGuard()
		 * @generated
		 */
		EClass GUARD = eINSTANCE.getGuard();

		/**
		 * The meta object literal for the '<em><b>Not</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GUARD__NOT = eINSTANCE.getGuard_Not();

		/**
		 * The meta object literal for the '{@link org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.impl.BooleanGuardImpl <em>Boolean Guard</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.impl.BooleanGuardImpl
		 * @see org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.impl.XmontiarcPackageImpl#getBooleanGuard()
		 * @generated
		 */
		EClass BOOLEAN_GUARD = eINSTANCE.getBooleanGuard();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOLEAN_GUARD__VALUE = eINSTANCE.getBooleanGuard_Value();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOLEAN_GUARD__SOURCE = eINSTANCE.getBooleanGuard_Source();

		/**
		 * The meta object literal for the '{@link org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.impl.StringGuardImpl <em>String Guard</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.impl.StringGuardImpl
		 * @see org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.impl.XmontiarcPackageImpl#getStringGuard()
		 * @generated
		 */
		EClass STRING_GUARD = eINSTANCE.getStringGuard();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_GUARD__VALUE = eINSTANCE.getStringGuard_Value();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRING_GUARD__SOURCE = eINSTANCE.getStringGuard_Source();

		/**
		 * The meta object literal for the '{@link org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.impl.NumberGuardImpl <em>Number Guard</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.impl.NumberGuardImpl
		 * @see org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.impl.XmontiarcPackageImpl#getNumberGuard()
		 * @generated
		 */
		EClass NUMBER_GUARD = eINSTANCE.getNumberGuard();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUMBER_GUARD__VALUE = eINSTANCE.getNumberGuard_Value();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NUMBER_GUARD__SOURCE = eINSTANCE.getNumberGuard_Source();

		/**
		 * The meta object literal for the '{@link org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.impl.EqualNumberGuardImpl <em>Equal Number Guard</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.impl.EqualNumberGuardImpl
		 * @see org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.impl.XmontiarcPackageImpl#getEqualNumberGuard()
		 * @generated
		 */
		EClass EQUAL_NUMBER_GUARD = eINSTANCE.getEqualNumberGuard();

		/**
		 * The meta object literal for the '{@link org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.impl.ActionImpl <em>Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.impl.ActionImpl
		 * @see org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.impl.XmontiarcPackageImpl#getAction()
		 * @generated
		 */
		EClass ACTION = eINSTANCE.getAction();

		/**
		 * The meta object literal for the '{@link org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.impl.StringActionImpl <em>String Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.impl.StringActionImpl
		 * @see org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.impl.XmontiarcPackageImpl#getStringAction()
		 * @generated
		 */
		EClass STRING_ACTION = eINSTANCE.getStringAction();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_ACTION__VALUE = eINSTANCE.getStringAction_Value();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRING_ACTION__TARGET = eINSTANCE.getStringAction_Target();

		/**
		 * The meta object literal for the '{@link org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.impl.NumberActionImpl <em>Number Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.impl.NumberActionImpl
		 * @see org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.impl.XmontiarcPackageImpl#getNumberAction()
		 * @generated
		 */
		EClass NUMBER_ACTION = eINSTANCE.getNumberAction();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUMBER_ACTION__VALUE = eINSTANCE.getNumberAction_Value();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NUMBER_ACTION__TARGET = eINSTANCE.getNumberAction_Target();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUMBER_ACTION__EXPRESSION = eINSTANCE.getNumberAction_Expression();

		/**
		 * The meta object literal for the '{@link org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.impl.BooleanActionImpl <em>Boolean Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.impl.BooleanActionImpl
		 * @see org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.impl.XmontiarcPackageImpl#getBooleanAction()
		 * @generated
		 */
		EClass BOOLEAN_ACTION = eINSTANCE.getBooleanAction();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOLEAN_ACTION__VALUE = eINSTANCE.getBooleanAction_Value();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOLEAN_ACTION__TARGET = eINSTANCE.getBooleanAction_Target();

		/**
		 * The meta object literal for the '{@link org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.impl.LessThanNumberGuardImpl <em>Less Than Number Guard</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.impl.LessThanNumberGuardImpl
		 * @see org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.impl.XmontiarcPackageImpl#getLessThanNumberGuard()
		 * @generated
		 */
		EClass LESS_THAN_NUMBER_GUARD = eINSTANCE.getLessThanNumberGuard();

		/**
		 * The meta object literal for the '{@link org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.impl.GreaterThanNumberGuardImpl <em>Greater Than Number Guard</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.impl.GreaterThanNumberGuardImpl
		 * @see org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.impl.XmontiarcPackageImpl#getGreaterThanNumberGuard()
		 * @generated
		 */
		EClass GREATER_THAN_NUMBER_GUARD = eINSTANCE.getGreaterThanNumberGuard();

		/**
		 * The meta object literal for the '{@link org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.impl.GreaterOrEqualThanNumberGuardImpl <em>Greater Or Equal Than Number Guard</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.impl.GreaterOrEqualThanNumberGuardImpl
		 * @see org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.impl.XmontiarcPackageImpl#getGreaterOrEqualThanNumberGuard()
		 * @generated
		 */
		EClass GREATER_OR_EQUAL_THAN_NUMBER_GUARD = eINSTANCE.getGreaterOrEqualThanNumberGuard();

		/**
		 * The meta object literal for the '{@link org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.impl.LessOrEqualThanNumberGuardImpl <em>Less Or Equal Than Number Guard</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.impl.LessOrEqualThanNumberGuardImpl
		 * @see org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.impl.XmontiarcPackageImpl#getLessOrEqualThanNumberGuard()
		 * @generated
		 */
		EClass LESS_OR_EQUAL_THAN_NUMBER_GUARD = eINSTANCE.getLessOrEqualThanNumberGuard();

	}

} //XmontiarcPackage

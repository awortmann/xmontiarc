/**
 */
package ur1.diverse.xautomata.xdsml.xautomatamt.automata;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see ur1.diverse.xautomata.xdsml.xautomatamt.automata.AutomataFactory
 * @model kind="package"
 * @generated
 */
public interface AutomataPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "automata";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://ur1.diverse.xautomata.xdsml.xautomatamt/automata/";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "autoamta";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AutomataPackage eINSTANCE = ur1.diverse.xautomata.xdsml.xautomatamt.automata.impl.AutomataPackageImpl.init();

	/**
	 * The meta object id for the '{@link ur1.diverse.xautomata.xdsml.xautomatamt.automata.impl.AutomatonImpl <em>Automaton</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ur1.diverse.xautomata.xdsml.xautomatamt.automata.impl.AutomatonImpl
	 * @see ur1.diverse.xautomata.xdsml.xautomatamt.automata.impl.AutomataPackageImpl#getAutomaton()
	 * @generated
	 */
	int AUTOMATON = 0;

	/**
	 * The feature id for the '<em><b>States</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOMATON__STATES = 0;

	/**
	 * The feature id for the '<em><b>Transitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOMATON__TRANSITIONS = 1;

	/**
	 * The feature id for the '<em><b>Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOMATON__VARIABLES = 2;

	/**
	 * The number of structural features of the '<em>Automaton</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOMATON_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link ur1.diverse.xautomata.xdsml.xautomatamt.automata.impl.StateImpl <em>State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ur1.diverse.xautomata.xdsml.xautomatamt.automata.impl.StateImpl
	 * @see ur1.diverse.xautomata.xdsml.xautomatamt.automata.impl.AutomataPackageImpl#getState()
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
	int STATE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Initial</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__INITIAL = 1;

	/**
	 * The number of structural features of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link ur1.diverse.xautomata.xdsml.xautomatamt.automata.impl.TransitionImpl <em>Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ur1.diverse.xautomata.xdsml.xautomatamt.automata.impl.TransitionImpl
	 * @see ur1.diverse.xautomata.xdsml.xautomatamt.automata.impl.AutomataPackageImpl#getTransition()
	 * @generated
	 */
	int TRANSITION = 2;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__TARGET = 1;

	/**
	 * The feature id for the '<em><b>Guard</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__GUARD = 2;

	/**
	 * The feature id for the '<em><b>Action</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__ACTION = 3;

	/**
	 * The number of structural features of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link ur1.diverse.xautomata.xdsml.xautomatamt.automata.impl.VariableImpl <em>Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ur1.diverse.xautomata.xdsml.xautomatamt.automata.impl.VariableImpl
	 * @see ur1.diverse.xautomata.xdsml.xautomatamt.automata.impl.AutomataPackageImpl#getVariable()
	 * @generated
	 */
	int VARIABLE = 3;

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
	 * The meta object id for the '{@link ur1.diverse.xautomata.xdsml.xautomatamt.automata.impl.StringVariableImpl <em>String Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ur1.diverse.xautomata.xdsml.xautomatamt.automata.impl.StringVariableImpl
	 * @see ur1.diverse.xautomata.xdsml.xautomatamt.automata.impl.AutomataPackageImpl#getStringVariable()
	 * @generated
	 */
	int STRING_VARIABLE = 4;

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
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_VARIABLE__VALUE = VARIABLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>String Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_VARIABLE_FEATURE_COUNT = VARIABLE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link ur1.diverse.xautomata.xdsml.xautomatamt.automata.impl.NumberVariableImpl <em>Number Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ur1.diverse.xautomata.xdsml.xautomatamt.automata.impl.NumberVariableImpl
	 * @see ur1.diverse.xautomata.xdsml.xautomatamt.automata.impl.AutomataPackageImpl#getNumberVariable()
	 * @generated
	 */
	int NUMBER_VARIABLE = 5;

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
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_VARIABLE__VALUE = VARIABLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Number Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_VARIABLE_FEATURE_COUNT = VARIABLE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link ur1.diverse.xautomata.xdsml.xautomatamt.automata.impl.BooleanVariableImpl <em>Boolean Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ur1.diverse.xautomata.xdsml.xautomatamt.automata.impl.BooleanVariableImpl
	 * @see ur1.diverse.xautomata.xdsml.xautomatamt.automata.impl.AutomataPackageImpl#getBooleanVariable()
	 * @generated
	 */
	int BOOLEAN_VARIABLE = 6;

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
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VARIABLE__VALUE = VARIABLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Boolean Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VARIABLE_FEATURE_COUNT = VARIABLE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link ur1.diverse.xautomata.xdsml.xautomatamt.automata.impl.GuardImpl <em>Guard</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ur1.diverse.xautomata.xdsml.xautomatamt.automata.impl.GuardImpl
	 * @see ur1.diverse.xautomata.xdsml.xautomatamt.automata.impl.AutomataPackageImpl#getGuard()
	 * @generated
	 */
	int GUARD = 7;

	/**
	 * The number of structural features of the '<em>Guard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUARD_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link ur1.diverse.xautomata.xdsml.xautomatamt.automata.impl.BooleanGuardImpl <em>Boolean Guard</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ur1.diverse.xautomata.xdsml.xautomatamt.automata.impl.BooleanGuardImpl
	 * @see ur1.diverse.xautomata.xdsml.xautomatamt.automata.impl.AutomataPackageImpl#getBooleanGuard()
	 * @generated
	 */
	int BOOLEAN_GUARD = 8;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_GUARD__VALUE = GUARD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_GUARD__OPERATOR = GUARD_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_GUARD__SOURCE = GUARD_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Boolean Guard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_GUARD_FEATURE_COUNT = GUARD_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link ur1.diverse.xautomata.xdsml.xautomatamt.automata.impl.StringGuardImpl <em>String Guard</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ur1.diverse.xautomata.xdsml.xautomatamt.automata.impl.StringGuardImpl
	 * @see ur1.diverse.xautomata.xdsml.xautomatamt.automata.impl.AutomataPackageImpl#getStringGuard()
	 * @generated
	 */
	int STRING_GUARD = 9;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_GUARD__VALUE = GUARD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_GUARD__OPERATOR = GUARD_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_GUARD__SOURCE = GUARD_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>String Guard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_GUARD_FEATURE_COUNT = GUARD_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link ur1.diverse.xautomata.xdsml.xautomatamt.automata.impl.NumberGuardImpl <em>Number Guard</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ur1.diverse.xautomata.xdsml.xautomatamt.automata.impl.NumberGuardImpl
	 * @see ur1.diverse.xautomata.xdsml.xautomatamt.automata.impl.AutomataPackageImpl#getNumberGuard()
	 * @generated
	 */
	int NUMBER_GUARD = 10;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_GUARD__VALUE = GUARD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_GUARD__OPERATOR = GUARD_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_GUARD__SOURCE = GUARD_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Number Guard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_GUARD_FEATURE_COUNT = GUARD_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link ur1.diverse.xautomata.xdsml.xautomatamt.automata.impl.ActionImpl <em>Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ur1.diverse.xautomata.xdsml.xautomatamt.automata.impl.ActionImpl
	 * @see ur1.diverse.xautomata.xdsml.xautomatamt.automata.impl.AutomataPackageImpl#getAction()
	 * @generated
	 */
	int ACTION = 11;

	/**
	 * The number of structural features of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link ur1.diverse.xautomata.xdsml.xautomatamt.automata.impl.StringActionImpl <em>String Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ur1.diverse.xautomata.xdsml.xautomatamt.automata.impl.StringActionImpl
	 * @see ur1.diverse.xautomata.xdsml.xautomatamt.automata.impl.AutomataPackageImpl#getStringAction()
	 * @generated
	 */
	int STRING_ACTION = 12;

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
	 * The meta object id for the '{@link ur1.diverse.xautomata.xdsml.xautomatamt.automata.impl.NumberActionImpl <em>Number Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ur1.diverse.xautomata.xdsml.xautomatamt.automata.impl.NumberActionImpl
	 * @see ur1.diverse.xautomata.xdsml.xautomatamt.automata.impl.AutomataPackageImpl#getNumberAction()
	 * @generated
	 */
	int NUMBER_ACTION = 13;

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
	 * The number of structural features of the '<em>Number Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_ACTION_FEATURE_COUNT = ACTION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link ur1.diverse.xautomata.xdsml.xautomatamt.automata.impl.BooleanActionImpl <em>Boolean Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ur1.diverse.xautomata.xdsml.xautomatamt.automata.impl.BooleanActionImpl
	 * @see ur1.diverse.xautomata.xdsml.xautomatamt.automata.impl.AutomataPackageImpl#getBooleanAction()
	 * @generated
	 */
	int BOOLEAN_ACTION = 14;

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
	 * The meta object id for the '{@link ur1.diverse.xautomata.xdsml.xautomatamt.automata.BooleanOperator <em>Boolean Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ur1.diverse.xautomata.xdsml.xautomatamt.automata.BooleanOperator
	 * @see ur1.diverse.xautomata.xdsml.xautomatamt.automata.impl.AutomataPackageImpl#getBooleanOperator()
	 * @generated
	 */
	int BOOLEAN_OPERATOR = 15;

	/**
	 * The meta object id for the '{@link ur1.diverse.xautomata.xdsml.xautomatamt.automata.StringOperator <em>String Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ur1.diverse.xautomata.xdsml.xautomatamt.automata.StringOperator
	 * @see ur1.diverse.xautomata.xdsml.xautomatamt.automata.impl.AutomataPackageImpl#getStringOperator()
	 * @generated
	 */
	int STRING_OPERATOR = 16;

	/**
	 * The meta object id for the '{@link ur1.diverse.xautomata.xdsml.xautomatamt.automata.NumberOperator <em>Number Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ur1.diverse.xautomata.xdsml.xautomatamt.automata.NumberOperator
	 * @see ur1.diverse.xautomata.xdsml.xautomatamt.automata.impl.AutomataPackageImpl#getNumberOperator()
	 * @generated
	 */
	int NUMBER_OPERATOR = 17;


	/**
	 * Returns the meta object for class '{@link ur1.diverse.xautomata.xdsml.xautomatamt.automata.Automaton <em>Automaton</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Automaton</em>'.
	 * @see ur1.diverse.xautomata.xdsml.xautomatamt.automata.Automaton
	 * @generated
	 */
	EClass getAutomaton();

	/**
	 * Returns the meta object for the containment reference list '{@link ur1.diverse.xautomata.xdsml.xautomatamt.automata.Automaton#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>States</em>'.
	 * @see ur1.diverse.xautomata.xdsml.xautomatamt.automata.Automaton#getStates()
	 * @see #getAutomaton()
	 * @generated
	 */
	EReference getAutomaton_States();

	/**
	 * Returns the meta object for the containment reference list '{@link ur1.diverse.xautomata.xdsml.xautomatamt.automata.Automaton#getTransitions <em>Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Transitions</em>'.
	 * @see ur1.diverse.xautomata.xdsml.xautomatamt.automata.Automaton#getTransitions()
	 * @see #getAutomaton()
	 * @generated
	 */
	EReference getAutomaton_Transitions();

	/**
	 * Returns the meta object for the containment reference list '{@link ur1.diverse.xautomata.xdsml.xautomatamt.automata.Automaton#getVariables <em>Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Variables</em>'.
	 * @see ur1.diverse.xautomata.xdsml.xautomatamt.automata.Automaton#getVariables()
	 * @see #getAutomaton()
	 * @generated
	 */
	EReference getAutomaton_Variables();

	/**
	 * Returns the meta object for class '{@link ur1.diverse.xautomata.xdsml.xautomatamt.automata.State <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State</em>'.
	 * @see ur1.diverse.xautomata.xdsml.xautomatamt.automata.State
	 * @generated
	 */
	EClass getState();

	/**
	 * Returns the meta object for the attribute '{@link ur1.diverse.xautomata.xdsml.xautomatamt.automata.State#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ur1.diverse.xautomata.xdsml.xautomatamt.automata.State#getName()
	 * @see #getState()
	 * @generated
	 */
	EAttribute getState_Name();

	/**
	 * Returns the meta object for the attribute '{@link ur1.diverse.xautomata.xdsml.xautomatamt.automata.State#isInitial <em>Initial</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Initial</em>'.
	 * @see ur1.diverse.xautomata.xdsml.xautomatamt.automata.State#isInitial()
	 * @see #getState()
	 * @generated
	 */
	EAttribute getState_Initial();

	/**
	 * Returns the meta object for class '{@link ur1.diverse.xautomata.xdsml.xautomatamt.automata.Transition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition</em>'.
	 * @see ur1.diverse.xautomata.xdsml.xautomatamt.automata.Transition
	 * @generated
	 */
	EClass getTransition();

	/**
	 * Returns the meta object for the reference '{@link ur1.diverse.xautomata.xdsml.xautomatamt.automata.Transition#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see ur1.diverse.xautomata.xdsml.xautomatamt.automata.Transition#getSource()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Source();

	/**
	 * Returns the meta object for the reference '{@link ur1.diverse.xautomata.xdsml.xautomatamt.automata.Transition#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see ur1.diverse.xautomata.xdsml.xautomatamt.automata.Transition#getTarget()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Target();

	/**
	 * Returns the meta object for the containment reference '{@link ur1.diverse.xautomata.xdsml.xautomatamt.automata.Transition#getGuard <em>Guard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Guard</em>'.
	 * @see ur1.diverse.xautomata.xdsml.xautomatamt.automata.Transition#getGuard()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Guard();

	/**
	 * Returns the meta object for the containment reference '{@link ur1.diverse.xautomata.xdsml.xautomatamt.automata.Transition#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Action</em>'.
	 * @see ur1.diverse.xautomata.xdsml.xautomatamt.automata.Transition#getAction()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Action();

	/**
	 * Returns the meta object for class '{@link ur1.diverse.xautomata.xdsml.xautomatamt.automata.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable</em>'.
	 * @see ur1.diverse.xautomata.xdsml.xautomatamt.automata.Variable
	 * @generated
	 */
	EClass getVariable();

	/**
	 * Returns the meta object for the attribute '{@link ur1.diverse.xautomata.xdsml.xautomatamt.automata.Variable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ur1.diverse.xautomata.xdsml.xautomatamt.automata.Variable#getName()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_Name();

	/**
	 * Returns the meta object for class '{@link ur1.diverse.xautomata.xdsml.xautomatamt.automata.StringVariable <em>String Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Variable</em>'.
	 * @see ur1.diverse.xautomata.xdsml.xautomatamt.automata.StringVariable
	 * @generated
	 */
	EClass getStringVariable();

	/**
	 * Returns the meta object for the attribute '{@link ur1.diverse.xautomata.xdsml.xautomatamt.automata.StringVariable#getInitialValue <em>Initial Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Initial Value</em>'.
	 * @see ur1.diverse.xautomata.xdsml.xautomatamt.automata.StringVariable#getInitialValue()
	 * @see #getStringVariable()
	 * @generated
	 */
	EAttribute getStringVariable_InitialValue();

	/**
	 * Returns the meta object for the attribute '{@link ur1.diverse.xautomata.xdsml.xautomatamt.automata.StringVariable#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see ur1.diverse.xautomata.xdsml.xautomatamt.automata.StringVariable#getValue()
	 * @see #getStringVariable()
	 * @generated
	 */
	EAttribute getStringVariable_Value();

	/**
	 * Returns the meta object for class '{@link ur1.diverse.xautomata.xdsml.xautomatamt.automata.NumberVariable <em>Number Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Number Variable</em>'.
	 * @see ur1.diverse.xautomata.xdsml.xautomatamt.automata.NumberVariable
	 * @generated
	 */
	EClass getNumberVariable();

	/**
	 * Returns the meta object for the attribute '{@link ur1.diverse.xautomata.xdsml.xautomatamt.automata.NumberVariable#getInitialValue <em>Initial Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Initial Value</em>'.
	 * @see ur1.diverse.xautomata.xdsml.xautomatamt.automata.NumberVariable#getInitialValue()
	 * @see #getNumberVariable()
	 * @generated
	 */
	EAttribute getNumberVariable_InitialValue();

	/**
	 * Returns the meta object for the attribute '{@link ur1.diverse.xautomata.xdsml.xautomatamt.automata.NumberVariable#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see ur1.diverse.xautomata.xdsml.xautomatamt.automata.NumberVariable#getValue()
	 * @see #getNumberVariable()
	 * @generated
	 */
	EAttribute getNumberVariable_Value();

	/**
	 * Returns the meta object for class '{@link ur1.diverse.xautomata.xdsml.xautomatamt.automata.BooleanVariable <em>Boolean Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Variable</em>'.
	 * @see ur1.diverse.xautomata.xdsml.xautomatamt.automata.BooleanVariable
	 * @generated
	 */
	EClass getBooleanVariable();

	/**
	 * Returns the meta object for the attribute '{@link ur1.diverse.xautomata.xdsml.xautomatamt.automata.BooleanVariable#isInitialValue <em>Initial Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Initial Value</em>'.
	 * @see ur1.diverse.xautomata.xdsml.xautomatamt.automata.BooleanVariable#isInitialValue()
	 * @see #getBooleanVariable()
	 * @generated
	 */
	EAttribute getBooleanVariable_InitialValue();

	/**
	 * Returns the meta object for the attribute '{@link ur1.diverse.xautomata.xdsml.xautomatamt.automata.BooleanVariable#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see ur1.diverse.xautomata.xdsml.xautomatamt.automata.BooleanVariable#getValue()
	 * @see #getBooleanVariable()
	 * @generated
	 */
	EAttribute getBooleanVariable_Value();

	/**
	 * Returns the meta object for class '{@link ur1.diverse.xautomata.xdsml.xautomatamt.automata.Guard <em>Guard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Guard</em>'.
	 * @see ur1.diverse.xautomata.xdsml.xautomatamt.automata.Guard
	 * @generated
	 */
	EClass getGuard();

	/**
	 * Returns the meta object for class '{@link ur1.diverse.xautomata.xdsml.xautomatamt.automata.BooleanGuard <em>Boolean Guard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Guard</em>'.
	 * @see ur1.diverse.xautomata.xdsml.xautomatamt.automata.BooleanGuard
	 * @generated
	 */
	EClass getBooleanGuard();

	/**
	 * Returns the meta object for the attribute '{@link ur1.diverse.xautomata.xdsml.xautomatamt.automata.BooleanGuard#isValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see ur1.diverse.xautomata.xdsml.xautomatamt.automata.BooleanGuard#isValue()
	 * @see #getBooleanGuard()
	 * @generated
	 */
	EAttribute getBooleanGuard_Value();

	/**
	 * Returns the meta object for the attribute '{@link ur1.diverse.xautomata.xdsml.xautomatamt.automata.BooleanGuard#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see ur1.diverse.xautomata.xdsml.xautomatamt.automata.BooleanGuard#getOperator()
	 * @see #getBooleanGuard()
	 * @generated
	 */
	EAttribute getBooleanGuard_Operator();

	/**
	 * Returns the meta object for the reference '{@link ur1.diverse.xautomata.xdsml.xautomatamt.automata.BooleanGuard#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see ur1.diverse.xautomata.xdsml.xautomatamt.automata.BooleanGuard#getSource()
	 * @see #getBooleanGuard()
	 * @generated
	 */
	EReference getBooleanGuard_Source();

	/**
	 * Returns the meta object for class '{@link ur1.diverse.xautomata.xdsml.xautomatamt.automata.StringGuard <em>String Guard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Guard</em>'.
	 * @see ur1.diverse.xautomata.xdsml.xautomatamt.automata.StringGuard
	 * @generated
	 */
	EClass getStringGuard();

	/**
	 * Returns the meta object for the attribute '{@link ur1.diverse.xautomata.xdsml.xautomatamt.automata.StringGuard#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see ur1.diverse.xautomata.xdsml.xautomatamt.automata.StringGuard#getValue()
	 * @see #getStringGuard()
	 * @generated
	 */
	EAttribute getStringGuard_Value();

	/**
	 * Returns the meta object for the attribute '{@link ur1.diverse.xautomata.xdsml.xautomatamt.automata.StringGuard#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see ur1.diverse.xautomata.xdsml.xautomatamt.automata.StringGuard#getOperator()
	 * @see #getStringGuard()
	 * @generated
	 */
	EAttribute getStringGuard_Operator();

	/**
	 * Returns the meta object for the reference '{@link ur1.diverse.xautomata.xdsml.xautomatamt.automata.StringGuard#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see ur1.diverse.xautomata.xdsml.xautomatamt.automata.StringGuard#getSource()
	 * @see #getStringGuard()
	 * @generated
	 */
	EReference getStringGuard_Source();

	/**
	 * Returns the meta object for class '{@link ur1.diverse.xautomata.xdsml.xautomatamt.automata.NumberGuard <em>Number Guard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Number Guard</em>'.
	 * @see ur1.diverse.xautomata.xdsml.xautomatamt.automata.NumberGuard
	 * @generated
	 */
	EClass getNumberGuard();

	/**
	 * Returns the meta object for the attribute '{@link ur1.diverse.xautomata.xdsml.xautomatamt.automata.NumberGuard#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see ur1.diverse.xautomata.xdsml.xautomatamt.automata.NumberGuard#getValue()
	 * @see #getNumberGuard()
	 * @generated
	 */
	EAttribute getNumberGuard_Value();

	/**
	 * Returns the meta object for the attribute '{@link ur1.diverse.xautomata.xdsml.xautomatamt.automata.NumberGuard#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see ur1.diverse.xautomata.xdsml.xautomatamt.automata.NumberGuard#getOperator()
	 * @see #getNumberGuard()
	 * @generated
	 */
	EAttribute getNumberGuard_Operator();

	/**
	 * Returns the meta object for the reference '{@link ur1.diverse.xautomata.xdsml.xautomatamt.automata.NumberGuard#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see ur1.diverse.xautomata.xdsml.xautomatamt.automata.NumberGuard#getSource()
	 * @see #getNumberGuard()
	 * @generated
	 */
	EReference getNumberGuard_Source();

	/**
	 * Returns the meta object for class '{@link ur1.diverse.xautomata.xdsml.xautomatamt.automata.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action</em>'.
	 * @see ur1.diverse.xautomata.xdsml.xautomatamt.automata.Action
	 * @generated
	 */
	EClass getAction();

	/**
	 * Returns the meta object for class '{@link ur1.diverse.xautomata.xdsml.xautomatamt.automata.StringAction <em>String Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Action</em>'.
	 * @see ur1.diverse.xautomata.xdsml.xautomatamt.automata.StringAction
	 * @generated
	 */
	EClass getStringAction();

	/**
	 * Returns the meta object for the attribute '{@link ur1.diverse.xautomata.xdsml.xautomatamt.automata.StringAction#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see ur1.diverse.xautomata.xdsml.xautomatamt.automata.StringAction#getValue()
	 * @see #getStringAction()
	 * @generated
	 */
	EAttribute getStringAction_Value();

	/**
	 * Returns the meta object for the reference '{@link ur1.diverse.xautomata.xdsml.xautomatamt.automata.StringAction#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see ur1.diverse.xautomata.xdsml.xautomatamt.automata.StringAction#getTarget()
	 * @see #getStringAction()
	 * @generated
	 */
	EReference getStringAction_Target();

	/**
	 * Returns the meta object for class '{@link ur1.diverse.xautomata.xdsml.xautomatamt.automata.NumberAction <em>Number Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Number Action</em>'.
	 * @see ur1.diverse.xautomata.xdsml.xautomatamt.automata.NumberAction
	 * @generated
	 */
	EClass getNumberAction();

	/**
	 * Returns the meta object for the attribute '{@link ur1.diverse.xautomata.xdsml.xautomatamt.automata.NumberAction#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see ur1.diverse.xautomata.xdsml.xautomatamt.automata.NumberAction#getValue()
	 * @see #getNumberAction()
	 * @generated
	 */
	EAttribute getNumberAction_Value();

	/**
	 * Returns the meta object for the reference '{@link ur1.diverse.xautomata.xdsml.xautomatamt.automata.NumberAction#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see ur1.diverse.xautomata.xdsml.xautomatamt.automata.NumberAction#getTarget()
	 * @see #getNumberAction()
	 * @generated
	 */
	EReference getNumberAction_Target();

	/**
	 * Returns the meta object for class '{@link ur1.diverse.xautomata.xdsml.xautomatamt.automata.BooleanAction <em>Boolean Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Action</em>'.
	 * @see ur1.diverse.xautomata.xdsml.xautomatamt.automata.BooleanAction
	 * @generated
	 */
	EClass getBooleanAction();

	/**
	 * Returns the meta object for the attribute '{@link ur1.diverse.xautomata.xdsml.xautomatamt.automata.BooleanAction#isValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see ur1.diverse.xautomata.xdsml.xautomatamt.automata.BooleanAction#isValue()
	 * @see #getBooleanAction()
	 * @generated
	 */
	EAttribute getBooleanAction_Value();

	/**
	 * Returns the meta object for the reference '{@link ur1.diverse.xautomata.xdsml.xautomatamt.automata.BooleanAction#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see ur1.diverse.xautomata.xdsml.xautomatamt.automata.BooleanAction#getTarget()
	 * @see #getBooleanAction()
	 * @generated
	 */
	EReference getBooleanAction_Target();

	/**
	 * Returns the meta object for enum '{@link ur1.diverse.xautomata.xdsml.xautomatamt.automata.BooleanOperator <em>Boolean Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Boolean Operator</em>'.
	 * @see ur1.diverse.xautomata.xdsml.xautomatamt.automata.BooleanOperator
	 * @generated
	 */
	EEnum getBooleanOperator();

	/**
	 * Returns the meta object for enum '{@link ur1.diverse.xautomata.xdsml.xautomatamt.automata.StringOperator <em>String Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>String Operator</em>'.
	 * @see ur1.diverse.xautomata.xdsml.xautomatamt.automata.StringOperator
	 * @generated
	 */
	EEnum getStringOperator();

	/**
	 * Returns the meta object for enum '{@link ur1.diverse.xautomata.xdsml.xautomatamt.automata.NumberOperator <em>Number Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Number Operator</em>'.
	 * @see ur1.diverse.xautomata.xdsml.xautomatamt.automata.NumberOperator
	 * @generated
	 */
	EEnum getNumberOperator();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AutomataFactory getAutomataFactory();

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
		 * The meta object literal for the '{@link ur1.diverse.xautomata.xdsml.xautomatamt.automata.impl.AutomatonImpl <em>Automaton</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ur1.diverse.xautomata.xdsml.xautomatamt.automata.impl.AutomatonImpl
		 * @see ur1.diverse.xautomata.xdsml.xautomatamt.automata.impl.AutomataPackageImpl#getAutomaton()
		 * @generated
		 */
		EClass AUTOMATON = eINSTANCE.getAutomaton();

		/**
		 * The meta object literal for the '<em><b>States</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AUTOMATON__STATES = eINSTANCE.getAutomaton_States();

		/**
		 * The meta object literal for the '<em><b>Transitions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AUTOMATON__TRANSITIONS = eINSTANCE.getAutomaton_Transitions();

		/**
		 * The meta object literal for the '<em><b>Variables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AUTOMATON__VARIABLES = eINSTANCE.getAutomaton_Variables();

		/**
		 * The meta object literal for the '{@link ur1.diverse.xautomata.xdsml.xautomatamt.automata.impl.StateImpl <em>State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ur1.diverse.xautomata.xdsml.xautomatamt.automata.impl.StateImpl
		 * @see ur1.diverse.xautomata.xdsml.xautomatamt.automata.impl.AutomataPackageImpl#getState()
		 * @generated
		 */
		EClass STATE = eINSTANCE.getState();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATE__NAME = eINSTANCE.getState_Name();

		/**
		 * The meta object literal for the '<em><b>Initial</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATE__INITIAL = eINSTANCE.getState_Initial();

		/**
		 * The meta object literal for the '{@link ur1.diverse.xautomata.xdsml.xautomatamt.automata.impl.TransitionImpl <em>Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ur1.diverse.xautomata.xdsml.xautomatamt.automata.impl.TransitionImpl
		 * @see ur1.diverse.xautomata.xdsml.xautomatamt.automata.impl.AutomataPackageImpl#getTransition()
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
		 * The meta object literal for the '{@link ur1.diverse.xautomata.xdsml.xautomatamt.automata.impl.VariableImpl <em>Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ur1.diverse.xautomata.xdsml.xautomatamt.automata.impl.VariableImpl
		 * @see ur1.diverse.xautomata.xdsml.xautomatamt.automata.impl.AutomataPackageImpl#getVariable()
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
		 * The meta object literal for the '{@link ur1.diverse.xautomata.xdsml.xautomatamt.automata.impl.StringVariableImpl <em>String Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ur1.diverse.xautomata.xdsml.xautomatamt.automata.impl.StringVariableImpl
		 * @see ur1.diverse.xautomata.xdsml.xautomatamt.automata.impl.AutomataPackageImpl#getStringVariable()
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
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_VARIABLE__VALUE = eINSTANCE.getStringVariable_Value();

		/**
		 * The meta object literal for the '{@link ur1.diverse.xautomata.xdsml.xautomatamt.automata.impl.NumberVariableImpl <em>Number Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ur1.diverse.xautomata.xdsml.xautomatamt.automata.impl.NumberVariableImpl
		 * @see ur1.diverse.xautomata.xdsml.xautomatamt.automata.impl.AutomataPackageImpl#getNumberVariable()
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
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUMBER_VARIABLE__VALUE = eINSTANCE.getNumberVariable_Value();

		/**
		 * The meta object literal for the '{@link ur1.diverse.xautomata.xdsml.xautomatamt.automata.impl.BooleanVariableImpl <em>Boolean Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ur1.diverse.xautomata.xdsml.xautomatamt.automata.impl.BooleanVariableImpl
		 * @see ur1.diverse.xautomata.xdsml.xautomatamt.automata.impl.AutomataPackageImpl#getBooleanVariable()
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
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOLEAN_VARIABLE__VALUE = eINSTANCE.getBooleanVariable_Value();

		/**
		 * The meta object literal for the '{@link ur1.diverse.xautomata.xdsml.xautomatamt.automata.impl.GuardImpl <em>Guard</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ur1.diverse.xautomata.xdsml.xautomatamt.automata.impl.GuardImpl
		 * @see ur1.diverse.xautomata.xdsml.xautomatamt.automata.impl.AutomataPackageImpl#getGuard()
		 * @generated
		 */
		EClass GUARD = eINSTANCE.getGuard();

		/**
		 * The meta object literal for the '{@link ur1.diverse.xautomata.xdsml.xautomatamt.automata.impl.BooleanGuardImpl <em>Boolean Guard</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ur1.diverse.xautomata.xdsml.xautomatamt.automata.impl.BooleanGuardImpl
		 * @see ur1.diverse.xautomata.xdsml.xautomatamt.automata.impl.AutomataPackageImpl#getBooleanGuard()
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
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOLEAN_GUARD__OPERATOR = eINSTANCE.getBooleanGuard_Operator();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOLEAN_GUARD__SOURCE = eINSTANCE.getBooleanGuard_Source();

		/**
		 * The meta object literal for the '{@link ur1.diverse.xautomata.xdsml.xautomatamt.automata.impl.StringGuardImpl <em>String Guard</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ur1.diverse.xautomata.xdsml.xautomatamt.automata.impl.StringGuardImpl
		 * @see ur1.diverse.xautomata.xdsml.xautomatamt.automata.impl.AutomataPackageImpl#getStringGuard()
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
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_GUARD__OPERATOR = eINSTANCE.getStringGuard_Operator();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRING_GUARD__SOURCE = eINSTANCE.getStringGuard_Source();

		/**
		 * The meta object literal for the '{@link ur1.diverse.xautomata.xdsml.xautomatamt.automata.impl.NumberGuardImpl <em>Number Guard</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ur1.diverse.xautomata.xdsml.xautomatamt.automata.impl.NumberGuardImpl
		 * @see ur1.diverse.xautomata.xdsml.xautomatamt.automata.impl.AutomataPackageImpl#getNumberGuard()
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
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUMBER_GUARD__OPERATOR = eINSTANCE.getNumberGuard_Operator();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NUMBER_GUARD__SOURCE = eINSTANCE.getNumberGuard_Source();

		/**
		 * The meta object literal for the '{@link ur1.diverse.xautomata.xdsml.xautomatamt.automata.impl.ActionImpl <em>Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ur1.diverse.xautomata.xdsml.xautomatamt.automata.impl.ActionImpl
		 * @see ur1.diverse.xautomata.xdsml.xautomatamt.automata.impl.AutomataPackageImpl#getAction()
		 * @generated
		 */
		EClass ACTION = eINSTANCE.getAction();

		/**
		 * The meta object literal for the '{@link ur1.diverse.xautomata.xdsml.xautomatamt.automata.impl.StringActionImpl <em>String Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ur1.diverse.xautomata.xdsml.xautomatamt.automata.impl.StringActionImpl
		 * @see ur1.diverse.xautomata.xdsml.xautomatamt.automata.impl.AutomataPackageImpl#getStringAction()
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
		 * The meta object literal for the '{@link ur1.diverse.xautomata.xdsml.xautomatamt.automata.impl.NumberActionImpl <em>Number Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ur1.diverse.xautomata.xdsml.xautomatamt.automata.impl.NumberActionImpl
		 * @see ur1.diverse.xautomata.xdsml.xautomatamt.automata.impl.AutomataPackageImpl#getNumberAction()
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
		 * The meta object literal for the '{@link ur1.diverse.xautomata.xdsml.xautomatamt.automata.impl.BooleanActionImpl <em>Boolean Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ur1.diverse.xautomata.xdsml.xautomatamt.automata.impl.BooleanActionImpl
		 * @see ur1.diverse.xautomata.xdsml.xautomatamt.automata.impl.AutomataPackageImpl#getBooleanAction()
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
		 * The meta object literal for the '{@link ur1.diverse.xautomata.xdsml.xautomatamt.automata.BooleanOperator <em>Boolean Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ur1.diverse.xautomata.xdsml.xautomatamt.automata.BooleanOperator
		 * @see ur1.diverse.xautomata.xdsml.xautomatamt.automata.impl.AutomataPackageImpl#getBooleanOperator()
		 * @generated
		 */
		EEnum BOOLEAN_OPERATOR = eINSTANCE.getBooleanOperator();

		/**
		 * The meta object literal for the '{@link ur1.diverse.xautomata.xdsml.xautomatamt.automata.StringOperator <em>String Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ur1.diverse.xautomata.xdsml.xautomatamt.automata.StringOperator
		 * @see ur1.diverse.xautomata.xdsml.xautomatamt.automata.impl.AutomataPackageImpl#getStringOperator()
		 * @generated
		 */
		EEnum STRING_OPERATOR = eINSTANCE.getStringOperator();

		/**
		 * The meta object literal for the '{@link ur1.diverse.xautomata.xdsml.xautomatamt.automata.NumberOperator <em>Number Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ur1.diverse.xautomata.xdsml.xautomatamt.automata.NumberOperator
		 * @see ur1.diverse.xautomata.xdsml.xautomatamt.automata.impl.AutomataPackageImpl#getNumberOperator()
		 * @generated
		 */
		EEnum NUMBER_OPERATOR = eINSTANCE.getNumberOperator();

	}

} //AutomataPackage

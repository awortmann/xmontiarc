/**
 */
package automata;

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
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see automata.AutomataFactory
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
	String eNS_URI = "http://ur1/diverse/automata/model";

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
	AutomataPackage eINSTANCE = automata.impl.AutomataPackageImpl.init();

	/**
	 * The meta object id for the '{@link automata.impl.AutomatonImpl <em>Automaton</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see automata.impl.AutomatonImpl
	 * @see automata.impl.AutomataPackageImpl#getAutomaton()
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
	 * The number of operations of the '<em>Automaton</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOMATON_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link automata.impl.StateImpl <em>State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see automata.impl.StateImpl
	 * @see automata.impl.AutomataPackageImpl#getState()
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
	 * The number of operations of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link automata.impl.TransitionImpl <em>Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see automata.impl.TransitionImpl
	 * @see automata.impl.AutomataPackageImpl#getTransition()
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
	 * The number of structural features of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link automata.impl.VariableImpl <em>Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see automata.impl.VariableImpl
	 * @see automata.impl.AutomataPackageImpl#getVariable()
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
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__TYPE = 1;

	/**
	 * The number of structural features of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link automata.impl.GuardImpl <em>Guard</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see automata.impl.GuardImpl
	 * @see automata.impl.AutomataPackageImpl#getGuard()
	 * @generated
	 */
	int GUARD = 4;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUARD__SOURCE = 0;

	/**
	 * The number of structural features of the '<em>Guard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUARD_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Guard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUARD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link automata.impl.BooleanGuardImpl <em>Boolean Guard</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see automata.impl.BooleanGuardImpl
	 * @see automata.impl.AutomataPackageImpl#getBooleanGuard()
	 * @generated
	 */
	int BOOLEAN_GUARD = 5;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_GUARD__SOURCE = GUARD__SOURCE;

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
	 * The number of structural features of the '<em>Boolean Guard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_GUARD_FEATURE_COUNT = GUARD_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Boolean Guard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_GUARD_OPERATION_COUNT = GUARD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link automata.impl.StringGuardImpl <em>String Guard</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see automata.impl.StringGuardImpl
	 * @see automata.impl.AutomataPackageImpl#getStringGuard()
	 * @generated
	 */
	int STRING_GUARD = 6;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_GUARD__SOURCE = GUARD__SOURCE;

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
	 * The number of structural features of the '<em>String Guard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_GUARD_FEATURE_COUNT = GUARD_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>String Guard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_GUARD_OPERATION_COUNT = GUARD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link automata.impl.NumberGuardImpl <em>Number Guard</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see automata.impl.NumberGuardImpl
	 * @see automata.impl.AutomataPackageImpl#getNumberGuard()
	 * @generated
	 */
	int NUMBER_GUARD = 7;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_GUARD__SOURCE = GUARD__SOURCE;

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
	 * The number of structural features of the '<em>Number Guard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_GUARD_FEATURE_COUNT = GUARD_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Number Guard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_GUARD_OPERATION_COUNT = GUARD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link automata.impl.ActionImpl <em>Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see automata.impl.ActionImpl
	 * @see automata.impl.AutomataPackageImpl#getAction()
	 * @generated
	 */
	int ACTION = 8;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__TARGET = 0;

	/**
	 * The number of structural features of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link automata.DataType <em>Data Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see automata.DataType
	 * @see automata.impl.AutomataPackageImpl#getDataType()
	 * @generated
	 */
	int DATA_TYPE = 9;

	/**
	 * The meta object id for the '{@link automata.BooleanOperator <em>Boolean Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see automata.BooleanOperator
	 * @see automata.impl.AutomataPackageImpl#getBooleanOperator()
	 * @generated
	 */
	int BOOLEAN_OPERATOR = 10;

	/**
	 * The meta object id for the '{@link automata.StringOperator <em>String Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see automata.StringOperator
	 * @see automata.impl.AutomataPackageImpl#getStringOperator()
	 * @generated
	 */
	int STRING_OPERATOR = 11;

	/**
	 * The meta object id for the '{@link automata.NumberOperator <em>Number Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see automata.NumberOperator
	 * @see automata.impl.AutomataPackageImpl#getNumberOperator()
	 * @generated
	 */
	int NUMBER_OPERATOR = 12;


	/**
	 * Returns the meta object for class '{@link automata.Automaton <em>Automaton</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Automaton</em>'.
	 * @see automata.Automaton
	 * @generated
	 */
	EClass getAutomaton();

	/**
	 * Returns the meta object for the containment reference list '{@link automata.Automaton#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>States</em>'.
	 * @see automata.Automaton#getStates()
	 * @see #getAutomaton()
	 * @generated
	 */
	EReference getAutomaton_States();

	/**
	 * Returns the meta object for the containment reference list '{@link automata.Automaton#getTransitions <em>Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Transitions</em>'.
	 * @see automata.Automaton#getTransitions()
	 * @see #getAutomaton()
	 * @generated
	 */
	EReference getAutomaton_Transitions();

	/**
	 * Returns the meta object for the containment reference list '{@link automata.Automaton#getVariables <em>Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Variables</em>'.
	 * @see automata.Automaton#getVariables()
	 * @see #getAutomaton()
	 * @generated
	 */
	EReference getAutomaton_Variables();

	/**
	 * Returns the meta object for class '{@link automata.State <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State</em>'.
	 * @see automata.State
	 * @generated
	 */
	EClass getState();

	/**
	 * Returns the meta object for the attribute '{@link automata.State#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see automata.State#getName()
	 * @see #getState()
	 * @generated
	 */
	EAttribute getState_Name();

	/**
	 * Returns the meta object for the attribute '{@link automata.State#isInitial <em>Initial</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Initial</em>'.
	 * @see automata.State#isInitial()
	 * @see #getState()
	 * @generated
	 */
	EAttribute getState_Initial();

	/**
	 * Returns the meta object for class '{@link automata.Transition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition</em>'.
	 * @see automata.Transition
	 * @generated
	 */
	EClass getTransition();

	/**
	 * Returns the meta object for the reference '{@link automata.Transition#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see automata.Transition#getSource()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Source();

	/**
	 * Returns the meta object for the reference '{@link automata.Transition#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see automata.Transition#getTarget()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Target();

	/**
	 * Returns the meta object for the containment reference '{@link automata.Transition#getGuard <em>Guard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Guard</em>'.
	 * @see automata.Transition#getGuard()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Guard();

	/**
	 * Returns the meta object for class '{@link automata.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable</em>'.
	 * @see automata.Variable
	 * @generated
	 */
	EClass getVariable();

	/**
	 * Returns the meta object for the attribute '{@link automata.Variable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see automata.Variable#getName()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_Name();

	/**
	 * Returns the meta object for the attribute '{@link automata.Variable#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see automata.Variable#getType()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_Type();

	/**
	 * Returns the meta object for class '{@link automata.Guard <em>Guard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Guard</em>'.
	 * @see automata.Guard
	 * @generated
	 */
	EClass getGuard();

	/**
	 * Returns the meta object for the reference '{@link automata.Guard#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see automata.Guard#getSource()
	 * @see #getGuard()
	 * @generated
	 */
	EReference getGuard_Source();

	/**
	 * Returns the meta object for class '{@link automata.BooleanGuard <em>Boolean Guard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Guard</em>'.
	 * @see automata.BooleanGuard
	 * @generated
	 */
	EClass getBooleanGuard();

	/**
	 * Returns the meta object for the attribute '{@link automata.BooleanGuard#isValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see automata.BooleanGuard#isValue()
	 * @see #getBooleanGuard()
	 * @generated
	 */
	EAttribute getBooleanGuard_Value();

	/**
	 * Returns the meta object for the attribute '{@link automata.BooleanGuard#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see automata.BooleanGuard#getOperator()
	 * @see #getBooleanGuard()
	 * @generated
	 */
	EAttribute getBooleanGuard_Operator();

	/**
	 * Returns the meta object for class '{@link automata.StringGuard <em>String Guard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Guard</em>'.
	 * @see automata.StringGuard
	 * @generated
	 */
	EClass getStringGuard();

	/**
	 * Returns the meta object for the attribute '{@link automata.StringGuard#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see automata.StringGuard#getValue()
	 * @see #getStringGuard()
	 * @generated
	 */
	EAttribute getStringGuard_Value();

	/**
	 * Returns the meta object for the attribute '{@link automata.StringGuard#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see automata.StringGuard#getOperator()
	 * @see #getStringGuard()
	 * @generated
	 */
	EAttribute getStringGuard_Operator();

	/**
	 * Returns the meta object for class '{@link automata.NumberGuard <em>Number Guard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Number Guard</em>'.
	 * @see automata.NumberGuard
	 * @generated
	 */
	EClass getNumberGuard();

	/**
	 * Returns the meta object for the attribute '{@link automata.NumberGuard#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see automata.NumberGuard#getValue()
	 * @see #getNumberGuard()
	 * @generated
	 */
	EAttribute getNumberGuard_Value();

	/**
	 * Returns the meta object for the attribute '{@link automata.NumberGuard#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see automata.NumberGuard#getOperator()
	 * @see #getNumberGuard()
	 * @generated
	 */
	EAttribute getNumberGuard_Operator();

	/**
	 * Returns the meta object for class '{@link automata.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action</em>'.
	 * @see automata.Action
	 * @generated
	 */
	EClass getAction();

	/**
	 * Returns the meta object for the reference '{@link automata.Action#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see automata.Action#getTarget()
	 * @see #getAction()
	 * @generated
	 */
	EReference getAction_Target();

	/**
	 * Returns the meta object for enum '{@link automata.DataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Data Type</em>'.
	 * @see automata.DataType
	 * @generated
	 */
	EEnum getDataType();

	/**
	 * Returns the meta object for enum '{@link automata.BooleanOperator <em>Boolean Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Boolean Operator</em>'.
	 * @see automata.BooleanOperator
	 * @generated
	 */
	EEnum getBooleanOperator();

	/**
	 * Returns the meta object for enum '{@link automata.StringOperator <em>String Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>String Operator</em>'.
	 * @see automata.StringOperator
	 * @generated
	 */
	EEnum getStringOperator();

	/**
	 * Returns the meta object for enum '{@link automata.NumberOperator <em>Number Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Number Operator</em>'.
	 * @see automata.NumberOperator
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
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link automata.impl.AutomatonImpl <em>Automaton</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see automata.impl.AutomatonImpl
		 * @see automata.impl.AutomataPackageImpl#getAutomaton()
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
		 * The meta object literal for the '{@link automata.impl.StateImpl <em>State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see automata.impl.StateImpl
		 * @see automata.impl.AutomataPackageImpl#getState()
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
		 * The meta object literal for the '{@link automata.impl.TransitionImpl <em>Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see automata.impl.TransitionImpl
		 * @see automata.impl.AutomataPackageImpl#getTransition()
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
		 * The meta object literal for the '{@link automata.impl.VariableImpl <em>Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see automata.impl.VariableImpl
		 * @see automata.impl.AutomataPackageImpl#getVariable()
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
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__TYPE = eINSTANCE.getVariable_Type();

		/**
		 * The meta object literal for the '{@link automata.impl.GuardImpl <em>Guard</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see automata.impl.GuardImpl
		 * @see automata.impl.AutomataPackageImpl#getGuard()
		 * @generated
		 */
		EClass GUARD = eINSTANCE.getGuard();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GUARD__SOURCE = eINSTANCE.getGuard_Source();

		/**
		 * The meta object literal for the '{@link automata.impl.BooleanGuardImpl <em>Boolean Guard</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see automata.impl.BooleanGuardImpl
		 * @see automata.impl.AutomataPackageImpl#getBooleanGuard()
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
		 * The meta object literal for the '{@link automata.impl.StringGuardImpl <em>String Guard</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see automata.impl.StringGuardImpl
		 * @see automata.impl.AutomataPackageImpl#getStringGuard()
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
		 * The meta object literal for the '{@link automata.impl.NumberGuardImpl <em>Number Guard</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see automata.impl.NumberGuardImpl
		 * @see automata.impl.AutomataPackageImpl#getNumberGuard()
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
		 * The meta object literal for the '{@link automata.impl.ActionImpl <em>Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see automata.impl.ActionImpl
		 * @see automata.impl.AutomataPackageImpl#getAction()
		 * @generated
		 */
		EClass ACTION = eINSTANCE.getAction();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION__TARGET = eINSTANCE.getAction_Target();

		/**
		 * The meta object literal for the '{@link automata.DataType <em>Data Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see automata.DataType
		 * @see automata.impl.AutomataPackageImpl#getDataType()
		 * @generated
		 */
		EEnum DATA_TYPE = eINSTANCE.getDataType();

		/**
		 * The meta object literal for the '{@link automata.BooleanOperator <em>Boolean Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see automata.BooleanOperator
		 * @see automata.impl.AutomataPackageImpl#getBooleanOperator()
		 * @generated
		 */
		EEnum BOOLEAN_OPERATOR = eINSTANCE.getBooleanOperator();

		/**
		 * The meta object literal for the '{@link automata.StringOperator <em>String Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see automata.StringOperator
		 * @see automata.impl.AutomataPackageImpl#getStringOperator()
		 * @generated
		 */
		EEnum STRING_OPERATOR = eINSTANCE.getStringOperator();

		/**
		 * The meta object literal for the '{@link automata.NumberOperator <em>Number Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see automata.NumberOperator
		 * @see automata.impl.AutomataPackageImpl#getNumberOperator()
		 * @generated
		 */
		EEnum NUMBER_OPERATOR = eINSTANCE.getNumberOperator();

	}

} //AutomataPackage

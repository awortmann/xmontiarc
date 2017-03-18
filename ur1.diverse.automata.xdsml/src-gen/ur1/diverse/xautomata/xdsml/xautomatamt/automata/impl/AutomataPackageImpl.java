/**
 */
package ur1.diverse.xautomata.xdsml.xautomatamt.automata.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import ur1.diverse.xautomata.xdsml.xautomatamt.automata.Action;
import ur1.diverse.xautomata.xdsml.xautomatamt.automata.AutomataFactory;
import ur1.diverse.xautomata.xdsml.xautomatamt.automata.AutomataPackage;
import ur1.diverse.xautomata.xdsml.xautomatamt.automata.Automaton;
import ur1.diverse.xautomata.xdsml.xautomatamt.automata.BooleanAction;
import ur1.diverse.xautomata.xdsml.xautomatamt.automata.BooleanGuard;
import ur1.diverse.xautomata.xdsml.xautomatamt.automata.BooleanOperator;
import ur1.diverse.xautomata.xdsml.xautomatamt.automata.BooleanVariable;
import ur1.diverse.xautomata.xdsml.xautomatamt.automata.Guard;
import ur1.diverse.xautomata.xdsml.xautomatamt.automata.NumberAction;
import ur1.diverse.xautomata.xdsml.xautomatamt.automata.NumberGuard;
import ur1.diverse.xautomata.xdsml.xautomatamt.automata.NumberOperator;
import ur1.diverse.xautomata.xdsml.xautomatamt.automata.NumberVariable;
import ur1.diverse.xautomata.xdsml.xautomatamt.automata.State;
import ur1.diverse.xautomata.xdsml.xautomatamt.automata.StringAction;
import ur1.diverse.xautomata.xdsml.xautomatamt.automata.StringGuard;
import ur1.diverse.xautomata.xdsml.xautomatamt.automata.StringOperator;
import ur1.diverse.xautomata.xdsml.xautomatamt.automata.StringVariable;
import ur1.diverse.xautomata.xdsml.xautomatamt.automata.Transition;
import ur1.diverse.xautomata.xdsml.xautomatamt.automata.Variable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AutomataPackageImpl extends EPackageImpl implements AutomataPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass automatonEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stringVariableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass numberVariableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanVariableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass guardEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanGuardEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stringGuardEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass numberGuardEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stringActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass numberActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum booleanOperatorEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum stringOperatorEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum numberOperatorEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see ur1.diverse.xautomata.xdsml.xautomatamt.automata.AutomataPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private AutomataPackageImpl() {
		super(eNS_URI, AutomataFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link AutomataPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static AutomataPackage init() {
		if (isInited) return (AutomataPackage)EPackage.Registry.INSTANCE.getEPackage(AutomataPackage.eNS_URI);

		// Obtain or create and register package
		AutomataPackageImpl theAutomataPackage = (AutomataPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof AutomataPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new AutomataPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theAutomataPackage.createPackageContents();

		// Initialize created meta-data
		theAutomataPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theAutomataPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(AutomataPackage.eNS_URI, theAutomataPackage);
		return theAutomataPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAutomaton() {
		return automatonEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAutomaton_States() {
		return (EReference)automatonEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAutomaton_Transitions() {
		return (EReference)automatonEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAutomaton_Variables() {
		return (EReference)automatonEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getState() {
		return stateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getState_Name() {
		return (EAttribute)stateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getState_Initial() {
		return (EAttribute)stateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransition() {
		return transitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransition_Source() {
		return (EReference)transitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransition_Target() {
		return (EReference)transitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransition_Guard() {
		return (EReference)transitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransition_Action() {
		return (EReference)transitionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVariable() {
		return variableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVariable_Name() {
		return (EAttribute)variableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStringVariable() {
		return stringVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStringVariable_InitialValue() {
		return (EAttribute)stringVariableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStringVariable_Value() {
		return (EAttribute)stringVariableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNumberVariable() {
		return numberVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNumberVariable_InitialValue() {
		return (EAttribute)numberVariableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNumberVariable_Value() {
		return (EAttribute)numberVariableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBooleanVariable() {
		return booleanVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBooleanVariable_InitialValue() {
		return (EAttribute)booleanVariableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBooleanVariable_Value() {
		return (EAttribute)booleanVariableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGuard() {
		return guardEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBooleanGuard() {
		return booleanGuardEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBooleanGuard_Value() {
		return (EAttribute)booleanGuardEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBooleanGuard_Operator() {
		return (EAttribute)booleanGuardEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBooleanGuard_Source() {
		return (EReference)booleanGuardEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStringGuard() {
		return stringGuardEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStringGuard_Value() {
		return (EAttribute)stringGuardEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStringGuard_Operator() {
		return (EAttribute)stringGuardEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStringGuard_Source() {
		return (EReference)stringGuardEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNumberGuard() {
		return numberGuardEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNumberGuard_Value() {
		return (EAttribute)numberGuardEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNumberGuard_Operator() {
		return (EAttribute)numberGuardEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNumberGuard_Source() {
		return (EReference)numberGuardEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAction() {
		return actionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStringAction() {
		return stringActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStringAction_Value() {
		return (EAttribute)stringActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStringAction_Target() {
		return (EReference)stringActionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNumberAction() {
		return numberActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNumberAction_Value() {
		return (EAttribute)numberActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNumberAction_Target() {
		return (EReference)numberActionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBooleanAction() {
		return booleanActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBooleanAction_Value() {
		return (EAttribute)booleanActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBooleanAction_Target() {
		return (EReference)booleanActionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getBooleanOperator() {
		return booleanOperatorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getStringOperator() {
		return stringOperatorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getNumberOperator() {
		return numberOperatorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AutomataFactory getAutomataFactory() {
		return (AutomataFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		automatonEClass = createEClass(AUTOMATON);
		createEReference(automatonEClass, AUTOMATON__STATES);
		createEReference(automatonEClass, AUTOMATON__TRANSITIONS);
		createEReference(automatonEClass, AUTOMATON__VARIABLES);

		stateEClass = createEClass(STATE);
		createEAttribute(stateEClass, STATE__NAME);
		createEAttribute(stateEClass, STATE__INITIAL);

		transitionEClass = createEClass(TRANSITION);
		createEReference(transitionEClass, TRANSITION__SOURCE);
		createEReference(transitionEClass, TRANSITION__TARGET);
		createEReference(transitionEClass, TRANSITION__GUARD);
		createEReference(transitionEClass, TRANSITION__ACTION);

		variableEClass = createEClass(VARIABLE);
		createEAttribute(variableEClass, VARIABLE__NAME);

		stringVariableEClass = createEClass(STRING_VARIABLE);
		createEAttribute(stringVariableEClass, STRING_VARIABLE__INITIAL_VALUE);
		createEAttribute(stringVariableEClass, STRING_VARIABLE__VALUE);

		numberVariableEClass = createEClass(NUMBER_VARIABLE);
		createEAttribute(numberVariableEClass, NUMBER_VARIABLE__INITIAL_VALUE);
		createEAttribute(numberVariableEClass, NUMBER_VARIABLE__VALUE);

		booleanVariableEClass = createEClass(BOOLEAN_VARIABLE);
		createEAttribute(booleanVariableEClass, BOOLEAN_VARIABLE__INITIAL_VALUE);
		createEAttribute(booleanVariableEClass, BOOLEAN_VARIABLE__VALUE);

		guardEClass = createEClass(GUARD);

		booleanGuardEClass = createEClass(BOOLEAN_GUARD);
		createEAttribute(booleanGuardEClass, BOOLEAN_GUARD__VALUE);
		createEAttribute(booleanGuardEClass, BOOLEAN_GUARD__OPERATOR);
		createEReference(booleanGuardEClass, BOOLEAN_GUARD__SOURCE);

		stringGuardEClass = createEClass(STRING_GUARD);
		createEAttribute(stringGuardEClass, STRING_GUARD__VALUE);
		createEAttribute(stringGuardEClass, STRING_GUARD__OPERATOR);
		createEReference(stringGuardEClass, STRING_GUARD__SOURCE);

		numberGuardEClass = createEClass(NUMBER_GUARD);
		createEAttribute(numberGuardEClass, NUMBER_GUARD__VALUE);
		createEAttribute(numberGuardEClass, NUMBER_GUARD__OPERATOR);
		createEReference(numberGuardEClass, NUMBER_GUARD__SOURCE);

		actionEClass = createEClass(ACTION);

		stringActionEClass = createEClass(STRING_ACTION);
		createEAttribute(stringActionEClass, STRING_ACTION__VALUE);
		createEReference(stringActionEClass, STRING_ACTION__TARGET);

		numberActionEClass = createEClass(NUMBER_ACTION);
		createEAttribute(numberActionEClass, NUMBER_ACTION__VALUE);
		createEReference(numberActionEClass, NUMBER_ACTION__TARGET);

		booleanActionEClass = createEClass(BOOLEAN_ACTION);
		createEAttribute(booleanActionEClass, BOOLEAN_ACTION__VALUE);
		createEReference(booleanActionEClass, BOOLEAN_ACTION__TARGET);

		// Create enums
		booleanOperatorEEnum = createEEnum(BOOLEAN_OPERATOR);
		stringOperatorEEnum = createEEnum(STRING_OPERATOR);
		numberOperatorEEnum = createEEnum(NUMBER_OPERATOR);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		stringVariableEClass.getESuperTypes().add(this.getVariable());
		numberVariableEClass.getESuperTypes().add(this.getVariable());
		booleanVariableEClass.getESuperTypes().add(this.getVariable());
		booleanGuardEClass.getESuperTypes().add(this.getGuard());
		stringGuardEClass.getESuperTypes().add(this.getGuard());
		numberGuardEClass.getESuperTypes().add(this.getGuard());
		stringActionEClass.getESuperTypes().add(this.getAction());
		numberActionEClass.getESuperTypes().add(this.getAction());
		booleanActionEClass.getESuperTypes().add(this.getAction());

		// Initialize classes and features; add operations and parameters
		initEClass(automatonEClass, Automaton.class, "Automaton", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAutomaton_States(), this.getState(), null, "states", null, 0, -1, Automaton.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAutomaton_Transitions(), this.getTransition(), null, "transitions", null, 0, -1, Automaton.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAutomaton_Variables(), this.getVariable(), null, "variables", null, 0, -1, Automaton.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(automatonEClass, null, "assignInitialValues", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(automatonEClass, null, "determineInitialState", 0, 1, IS_UNIQUE, IS_ORDERED);

		EOperation op = addEOperation(automatonEClass, null, "initializeModel", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "args", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(automatonEClass, null, "main", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(stateEClass, State.class, "State", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getState_Name(), ecorePackage.getEString(), "name", "UnnamedState", 1, 1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getState_Initial(), ecorePackage.getEBoolean(), "initial", "false", 1, 1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(transitionEClass, Transition.class, "Transition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTransition_Source(), this.getState(), null, "source", null, 1, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransition_Target(), this.getState(), null, "target", null, 1, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransition_Guard(), this.getGuard(), null, "guard", null, 1, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransition_Action(), this.getAction(), null, "action", null, 1, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(transitionEClass, null, "execute", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(variableEClass, Variable.class, "Variable", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVariable_Name(), ecorePackage.getEString(), "name", "UnnamedVariable", 1, 1, Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stringVariableEClass, StringVariable.class, "StringVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStringVariable_InitialValue(), ecorePackage.getEString(), "initialValue", null, 1, 1, StringVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStringVariable_Value(), ecorePackage.getEString(), "value", null, 0, 1, StringVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(numberVariableEClass, NumberVariable.class, "NumberVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNumberVariable_InitialValue(), ecorePackage.getELong(), "initialValue", null, 1, 1, NumberVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNumberVariable_Value(), ecorePackage.getELongObject(), "value", null, 0, 1, NumberVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(booleanVariableEClass, BooleanVariable.class, "BooleanVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBooleanVariable_InitialValue(), ecorePackage.getEBoolean(), "initialValue", null, 1, 1, BooleanVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBooleanVariable_Value(), ecorePackage.getEBooleanObject(), "value", null, 0, 1, BooleanVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(guardEClass, Guard.class, "Guard", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(guardEClass, ecorePackage.getEBoolean(), "holds", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(booleanGuardEClass, BooleanGuard.class, "BooleanGuard", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBooleanGuard_Value(), ecorePackage.getEBoolean(), "value", "true", 1, 1, BooleanGuard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBooleanGuard_Operator(), this.getBooleanOperator(), "operator", null, 0, 1, BooleanGuard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBooleanGuard_Source(), this.getBooleanVariable(), null, "source", null, 1, 1, BooleanGuard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(booleanGuardEClass, ecorePackage.getEBoolean(), "holds", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(stringGuardEClass, StringGuard.class, "StringGuard", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStringGuard_Value(), ecorePackage.getEString(), "value", "UnnamedVariable", 1, 1, StringGuard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStringGuard_Operator(), this.getStringOperator(), "operator", null, 0, 1, StringGuard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStringGuard_Source(), this.getStringVariable(), null, "source", null, 1, 1, StringGuard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(stringGuardEClass, ecorePackage.getEBoolean(), "holds", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(numberGuardEClass, NumberGuard.class, "NumberGuard", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNumberGuard_Value(), ecorePackage.getELong(), "value", "-1", 1, 1, NumberGuard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNumberGuard_Operator(), this.getNumberOperator(), "operator", null, 0, 1, NumberGuard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNumberGuard_Source(), this.getNumberVariable(), null, "source", null, 1, 1, NumberGuard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(numberGuardEClass, ecorePackage.getEBoolean(), "holds", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(actionEClass, Action.class, "Action", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(actionEClass, null, "execute", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(stringActionEClass, StringAction.class, "StringAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStringAction_Value(), ecorePackage.getEString(), "value", null, 1, 1, StringAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStringAction_Target(), this.getStringVariable(), null, "target", null, 1, 1, StringAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(stringActionEClass, null, "execute", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(numberActionEClass, NumberAction.class, "NumberAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNumberAction_Value(), ecorePackage.getELong(), "value", null, 1, 1, NumberAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNumberAction_Target(), this.getNumberVariable(), null, "target", null, 1, 1, NumberAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(numberActionEClass, null, "execute", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(booleanActionEClass, BooleanAction.class, "BooleanAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBooleanAction_Value(), ecorePackage.getEBoolean(), "value", null, 1, 1, BooleanAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBooleanAction_Target(), this.getBooleanVariable(), null, "target", null, 1, 1, BooleanAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(booleanActionEClass, null, "execute", 0, 1, IS_UNIQUE, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(booleanOperatorEEnum, BooleanOperator.class, "BooleanOperator");
		addEEnumLiteral(booleanOperatorEEnum, BooleanOperator.EQUAL);
		addEEnumLiteral(booleanOperatorEEnum, BooleanOperator.UNEQUAL);

		initEEnum(stringOperatorEEnum, StringOperator.class, "StringOperator");
		addEEnumLiteral(stringOperatorEEnum, StringOperator.EQUAL);
		addEEnumLiteral(stringOperatorEEnum, StringOperator.UNEQUAL);

		initEEnum(numberOperatorEEnum, NumberOperator.class, "NumberOperator");
		addEEnumLiteral(numberOperatorEEnum, NumberOperator.EQUAL);
		addEEnumLiteral(numberOperatorEEnum, NumberOperator.UNEQUAL);
		addEEnumLiteral(numberOperatorEEnum, NumberOperator.LESS_THAN);
		addEEnumLiteral(numberOperatorEEnum, NumberOperator.GREATER_THAN);
		addEEnumLiteral(numberOperatorEEnum, NumberOperator.GREATER_OR_EQUAL_THAN);
		addEEnumLiteral(numberOperatorEEnum, NumberOperator.LESS_OR_EQUAL_THAN);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// aspect
		createAspectAnnotations();
	}

	/**
	 * Initializes the annotations for <b>aspect</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createAspectAnnotations() {
		String source = "aspect";	
		addAnnotation
		  (automatonEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (automatonEClass.getEOperations().get(1), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (automatonEClass.getEOperations().get(2), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (automatonEClass.getEOperations().get(3), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (transitionEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getStringVariable_Value(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getNumberVariable_Value(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getBooleanVariable_Value(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (guardEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (booleanGuardEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (stringGuardEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (numberGuardEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (actionEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (stringActionEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (numberActionEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (booleanActionEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
		   });
	}

} //AutomataPackageImpl

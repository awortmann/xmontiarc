/**
 */
package ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.fsm.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.fsm.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FsmFactoryImpl extends EFactoryImpl implements FsmFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FsmFactory init() {
		try {
			FsmFactory theFsmFactory = (FsmFactory)EPackage.Registry.INSTANCE.getEFactory(FsmPackage.eNS_URI);
			if (theFsmFactory != null) {
				return theFsmFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new FsmFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FsmFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case FsmPackage.STATE_MACHINE: return createStateMachine();
			case FsmPackage.STATE: return createState();
			case FsmPackage.TRANSITION: return createTransition();
			case FsmPackage.STRING_VARIABLE: return createStringVariable();
			case FsmPackage.NUMBER_VARIABLE: return createNumberVariable();
			case FsmPackage.BOOLEAN_VARIABLE: return createBooleanVariable();
			case FsmPackage.BOOLEAN_GUARD: return createBooleanGuard();
			case FsmPackage.STRING_GUARD: return createStringGuard();
			case FsmPackage.EQUAL_NUMBER_GUARD: return createEqualNumberGuard();
			case FsmPackage.STRING_ACTION: return createStringAction();
			case FsmPackage.NUMBER_ACTION: return createNumberAction();
			case FsmPackage.BOOLEAN_ACTION: return createBooleanAction();
			case FsmPackage.LESS_THAN_NUMBER_GUARD: return createLessThanNumberGuard();
			case FsmPackage.GREATER_THAN_NUMBER_GUARD: return createGreaterThanNumberGuard();
			case FsmPackage.GREATER_OR_EQUAL_THAN_NUMBER_GUARD: return createGreaterOrEqualThanNumberGuard();
			case FsmPackage.LESS_OR_EQUAL_THAN_NUMBER_GUARD: return createLessOrEqualThanNumberGuard();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateMachine createStateMachine() {
		StateMachineImpl stateMachine = new StateMachineImpl();
		return stateMachine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State createState() {
		StateImpl state = new StateImpl();
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transition createTransition() {
		TransitionImpl transition = new TransitionImpl();
		return transition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringVariable createStringVariable() {
		StringVariableImpl stringVariable = new StringVariableImpl();
		return stringVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NumberVariable createNumberVariable() {
		NumberVariableImpl numberVariable = new NumberVariableImpl();
		return numberVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanVariable createBooleanVariable() {
		BooleanVariableImpl booleanVariable = new BooleanVariableImpl();
		return booleanVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanGuard createBooleanGuard() {
		BooleanGuardImpl booleanGuard = new BooleanGuardImpl();
		return booleanGuard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringGuard createStringGuard() {
		StringGuardImpl stringGuard = new StringGuardImpl();
		return stringGuard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EqualNumberGuard createEqualNumberGuard() {
		EqualNumberGuardImpl equalNumberGuard = new EqualNumberGuardImpl();
		return equalNumberGuard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringAction createStringAction() {
		StringActionImpl stringAction = new StringActionImpl();
		return stringAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NumberAction createNumberAction() {
		NumberActionImpl numberAction = new NumberActionImpl();
		return numberAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanAction createBooleanAction() {
		BooleanActionImpl booleanAction = new BooleanActionImpl();
		return booleanAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LessThanNumberGuard createLessThanNumberGuard() {
		LessThanNumberGuardImpl lessThanNumberGuard = new LessThanNumberGuardImpl();
		return lessThanNumberGuard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GreaterThanNumberGuard createGreaterThanNumberGuard() {
		GreaterThanNumberGuardImpl greaterThanNumberGuard = new GreaterThanNumberGuardImpl();
		return greaterThanNumberGuard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GreaterOrEqualThanNumberGuard createGreaterOrEqualThanNumberGuard() {
		GreaterOrEqualThanNumberGuardImpl greaterOrEqualThanNumberGuard = new GreaterOrEqualThanNumberGuardImpl();
		return greaterOrEqualThanNumberGuard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LessOrEqualThanNumberGuard createLessOrEqualThanNumberGuard() {
		LessOrEqualThanNumberGuardImpl lessOrEqualThanNumberGuard = new LessOrEqualThanNumberGuardImpl();
		return lessOrEqualThanNumberGuard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FsmPackage getFsmPackage() {
		return (FsmPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static FsmPackage getPackage() {
		return FsmPackage.eINSTANCE;
	}

} //FsmFactoryImpl

/**
 */
package ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.fsm.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.fsm.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.fsm.FsmPackage
 * @generated
 */
public class FsmAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static FsmPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FsmAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = FsmPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FsmSwitch<Adapter> modelSwitch =
		new FsmSwitch<Adapter>() {
			@Override
			public Adapter caseStateMachine(StateMachine object) {
				return createStateMachineAdapter();
			}
			@Override
			public Adapter caseState(State object) {
				return createStateAdapter();
			}
			@Override
			public Adapter caseTransition(Transition object) {
				return createTransitionAdapter();
			}
			@Override
			public Adapter caseNamedElement(NamedElement object) {
				return createNamedElementAdapter();
			}
			@Override
			public Adapter caseVariable(Variable object) {
				return createVariableAdapter();
			}
			@Override
			public Adapter caseStringVariable(StringVariable object) {
				return createStringVariableAdapter();
			}
			@Override
			public Adapter caseNumberVariable(NumberVariable object) {
				return createNumberVariableAdapter();
			}
			@Override
			public Adapter caseBooleanVariable(BooleanVariable object) {
				return createBooleanVariableAdapter();
			}
			@Override
			public Adapter caseGuard(Guard object) {
				return createGuardAdapter();
			}
			@Override
			public Adapter caseBooleanGuard(BooleanGuard object) {
				return createBooleanGuardAdapter();
			}
			@Override
			public Adapter caseStringGuard(StringGuard object) {
				return createStringGuardAdapter();
			}
			@Override
			public Adapter caseNumberGuard(NumberGuard object) {
				return createNumberGuardAdapter();
			}
			@Override
			public Adapter caseEqualNumberGuard(EqualNumberGuard object) {
				return createEqualNumberGuardAdapter();
			}
			@Override
			public Adapter caseAction(Action object) {
				return createActionAdapter();
			}
			@Override
			public Adapter caseStringAction(StringAction object) {
				return createStringActionAdapter();
			}
			@Override
			public Adapter caseNumberAction(NumberAction object) {
				return createNumberActionAdapter();
			}
			@Override
			public Adapter caseBooleanAction(BooleanAction object) {
				return createBooleanActionAdapter();
			}
			@Override
			public Adapter caseLessThanNumberGuard(LessThanNumberGuard object) {
				return createLessThanNumberGuardAdapter();
			}
			@Override
			public Adapter caseGreaterThanNumberGuard(GreaterThanNumberGuard object) {
				return createGreaterThanNumberGuardAdapter();
			}
			@Override
			public Adapter caseGreaterOrEqualThanNumberGuard(GreaterOrEqualThanNumberGuard object) {
				return createGreaterOrEqualThanNumberGuardAdapter();
			}
			@Override
			public Adapter caseLessOrEqualThanNumberGuard(LessOrEqualThanNumberGuard object) {
				return createLessOrEqualThanNumberGuardAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.fsm.StateMachine <em>State Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.fsm.StateMachine
	 * @generated
	 */
	public Adapter createStateMachineAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.fsm.State <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.fsm.State
	 * @generated
	 */
	public Adapter createStateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.fsm.Transition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.fsm.Transition
	 * @generated
	 */
	public Adapter createTransitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.fsm.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.fsm.NamedElement
	 * @generated
	 */
	public Adapter createNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.fsm.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.fsm.Variable
	 * @generated
	 */
	public Adapter createVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.fsm.StringVariable <em>String Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.fsm.StringVariable
	 * @generated
	 */
	public Adapter createStringVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.fsm.NumberVariable <em>Number Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.fsm.NumberVariable
	 * @generated
	 */
	public Adapter createNumberVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.fsm.BooleanVariable <em>Boolean Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.fsm.BooleanVariable
	 * @generated
	 */
	public Adapter createBooleanVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.fsm.Guard <em>Guard</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.fsm.Guard
	 * @generated
	 */
	public Adapter createGuardAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.fsm.BooleanGuard <em>Boolean Guard</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.fsm.BooleanGuard
	 * @generated
	 */
	public Adapter createBooleanGuardAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.fsm.StringGuard <em>String Guard</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.fsm.StringGuard
	 * @generated
	 */
	public Adapter createStringGuardAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.fsm.NumberGuard <em>Number Guard</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.fsm.NumberGuard
	 * @generated
	 */
	public Adapter createNumberGuardAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.fsm.EqualNumberGuard <em>Equal Number Guard</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.fsm.EqualNumberGuard
	 * @generated
	 */
	public Adapter createEqualNumberGuardAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.fsm.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.fsm.Action
	 * @generated
	 */
	public Adapter createActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.fsm.StringAction <em>String Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.fsm.StringAction
	 * @generated
	 */
	public Adapter createStringActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.fsm.NumberAction <em>Number Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.fsm.NumberAction
	 * @generated
	 */
	public Adapter createNumberActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.fsm.BooleanAction <em>Boolean Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.fsm.BooleanAction
	 * @generated
	 */
	public Adapter createBooleanActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.fsm.LessThanNumberGuard <em>Less Than Number Guard</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.fsm.LessThanNumberGuard
	 * @generated
	 */
	public Adapter createLessThanNumberGuardAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.fsm.GreaterThanNumberGuard <em>Greater Than Number Guard</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.fsm.GreaterThanNumberGuard
	 * @generated
	 */
	public Adapter createGreaterThanNumberGuardAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.fsm.GreaterOrEqualThanNumberGuard <em>Greater Or Equal Than Number Guard</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.fsm.GreaterOrEqualThanNumberGuard
	 * @generated
	 */
	public Adapter createGreaterOrEqualThanNumberGuardAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.fsm.LessOrEqualThanNumberGuard <em>Less Or Equal Than Number Guard</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.fsm.LessOrEqualThanNumberGuard
	 * @generated
	 */
	public Adapter createLessOrEqualThanNumberGuardAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //FsmAdapterFactory

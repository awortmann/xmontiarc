/**
 */
package ur1.diverse.xautomata.xdsml.xautomatamt.automata.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import ur1.diverse.xautomata.xdsml.xautomatamt.automata.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see ur1.diverse.xautomata.xdsml.xautomatamt.automata.AutomataPackage
 * @generated
 */
public class AutomataAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static AutomataPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AutomataAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = AutomataPackage.eINSTANCE;
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
	protected AutomataSwitch<Adapter> modelSwitch =
		new AutomataSwitch<Adapter>() {
			@Override
			public Adapter caseAutomaton(Automaton object) {
				return createAutomatonAdapter();
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
	 * Creates a new adapter for an object of class '{@link ur1.diverse.xautomata.xdsml.xautomatamt.automata.Automaton <em>Automaton</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ur1.diverse.xautomata.xdsml.xautomatamt.automata.Automaton
	 * @generated
	 */
	public Adapter createAutomatonAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ur1.diverse.xautomata.xdsml.xautomatamt.automata.State <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ur1.diverse.xautomata.xdsml.xautomatamt.automata.State
	 * @generated
	 */
	public Adapter createStateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ur1.diverse.xautomata.xdsml.xautomatamt.automata.Transition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ur1.diverse.xautomata.xdsml.xautomatamt.automata.Transition
	 * @generated
	 */
	public Adapter createTransitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ur1.diverse.xautomata.xdsml.xautomatamt.automata.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ur1.diverse.xautomata.xdsml.xautomatamt.automata.Variable
	 * @generated
	 */
	public Adapter createVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ur1.diverse.xautomata.xdsml.xautomatamt.automata.StringVariable <em>String Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ur1.diverse.xautomata.xdsml.xautomatamt.automata.StringVariable
	 * @generated
	 */
	public Adapter createStringVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ur1.diverse.xautomata.xdsml.xautomatamt.automata.NumberVariable <em>Number Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ur1.diverse.xautomata.xdsml.xautomatamt.automata.NumberVariable
	 * @generated
	 */
	public Adapter createNumberVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ur1.diverse.xautomata.xdsml.xautomatamt.automata.BooleanVariable <em>Boolean Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ur1.diverse.xautomata.xdsml.xautomatamt.automata.BooleanVariable
	 * @generated
	 */
	public Adapter createBooleanVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ur1.diverse.xautomata.xdsml.xautomatamt.automata.Guard <em>Guard</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ur1.diverse.xautomata.xdsml.xautomatamt.automata.Guard
	 * @generated
	 */
	public Adapter createGuardAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ur1.diverse.xautomata.xdsml.xautomatamt.automata.BooleanGuard <em>Boolean Guard</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ur1.diverse.xautomata.xdsml.xautomatamt.automata.BooleanGuard
	 * @generated
	 */
	public Adapter createBooleanGuardAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ur1.diverse.xautomata.xdsml.xautomatamt.automata.StringGuard <em>String Guard</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ur1.diverse.xautomata.xdsml.xautomatamt.automata.StringGuard
	 * @generated
	 */
	public Adapter createStringGuardAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ur1.diverse.xautomata.xdsml.xautomatamt.automata.NumberGuard <em>Number Guard</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ur1.diverse.xautomata.xdsml.xautomatamt.automata.NumberGuard
	 * @generated
	 */
	public Adapter createNumberGuardAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ur1.diverse.xautomata.xdsml.xautomatamt.automata.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ur1.diverse.xautomata.xdsml.xautomatamt.automata.Action
	 * @generated
	 */
	public Adapter createActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ur1.diverse.xautomata.xdsml.xautomatamt.automata.StringAction <em>String Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ur1.diverse.xautomata.xdsml.xautomatamt.automata.StringAction
	 * @generated
	 */
	public Adapter createStringActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ur1.diverse.xautomata.xdsml.xautomatamt.automata.NumberAction <em>Number Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ur1.diverse.xautomata.xdsml.xautomatamt.automata.NumberAction
	 * @generated
	 */
	public Adapter createNumberActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ur1.diverse.xautomata.xdsml.xautomatamt.automata.BooleanAction <em>Boolean Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ur1.diverse.xautomata.xdsml.xautomatamt.automata.BooleanAction
	 * @generated
	 */
	public Adapter createBooleanActionAdapter() {
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

} //AutomataAdapterFactory

/**
 */
package org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.XmontiarcPackage
 * @generated
 */
public class XmontiarcSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static XmontiarcPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XmontiarcSwitch() {
		if (modelPackage == null) {
			modelPackage = XmontiarcPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case XmontiarcPackage.AUTOMATON_COMPONENT_BEHAVIOR: {
				AutomatonComponentBehavior automatonComponentBehavior = (AutomatonComponentBehavior)theEObject;
				T result = caseAutomatonComponentBehavior(automatonComponentBehavior);
				if (result == null) result = caseNamedElement(automatonComponentBehavior);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmontiarcPackage.STATE: {
				State state = (State)theEObject;
				T result = caseState(state);
				if (result == null) result = caseNamedElement(state);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmontiarcPackage.TRANSITION: {
				Transition transition = (Transition)theEObject;
				T result = caseTransition(transition);
				if (result == null) result = caseNamedElement(transition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmontiarcPackage.NAMED_ELEMENT: {
				NamedElement namedElement = (NamedElement)theEObject;
				T result = caseNamedElement(namedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmontiarcPackage.VARIABLE: {
				Variable variable = (Variable)theEObject;
				T result = caseVariable(variable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmontiarcPackage.STRING_VARIABLE: {
				StringVariable stringVariable = (StringVariable)theEObject;
				T result = caseStringVariable(stringVariable);
				if (result == null) result = caseVariable(stringVariable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmontiarcPackage.NUMBER_VARIABLE: {
				NumberVariable numberVariable = (NumberVariable)theEObject;
				T result = caseNumberVariable(numberVariable);
				if (result == null) result = caseVariable(numberVariable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmontiarcPackage.BOOLEAN_VARIABLE: {
				BooleanVariable booleanVariable = (BooleanVariable)theEObject;
				T result = caseBooleanVariable(booleanVariable);
				if (result == null) result = caseVariable(booleanVariable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmontiarcPackage.GUARD: {
				Guard guard = (Guard)theEObject;
				T result = caseGuard(guard);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmontiarcPackage.BOOLEAN_GUARD: {
				BooleanGuard booleanGuard = (BooleanGuard)theEObject;
				T result = caseBooleanGuard(booleanGuard);
				if (result == null) result = caseGuard(booleanGuard);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmontiarcPackage.STRING_GUARD: {
				StringGuard stringGuard = (StringGuard)theEObject;
				T result = caseStringGuard(stringGuard);
				if (result == null) result = caseGuard(stringGuard);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmontiarcPackage.NUMBER_GUARD: {
				NumberGuard numberGuard = (NumberGuard)theEObject;
				T result = caseNumberGuard(numberGuard);
				if (result == null) result = caseGuard(numberGuard);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmontiarcPackage.EQUAL_NUMBER_GUARD: {
				EqualNumberGuard equalNumberGuard = (EqualNumberGuard)theEObject;
				T result = caseEqualNumberGuard(equalNumberGuard);
				if (result == null) result = caseNumberGuard(equalNumberGuard);
				if (result == null) result = caseGuard(equalNumberGuard);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmontiarcPackage.ACTION: {
				Action action = (Action)theEObject;
				T result = caseAction(action);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmontiarcPackage.STRING_ACTION: {
				StringAction stringAction = (StringAction)theEObject;
				T result = caseStringAction(stringAction);
				if (result == null) result = caseAction(stringAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmontiarcPackage.NUMBER_ACTION: {
				NumberAction numberAction = (NumberAction)theEObject;
				T result = caseNumberAction(numberAction);
				if (result == null) result = caseAction(numberAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmontiarcPackage.BOOLEAN_ACTION: {
				BooleanAction booleanAction = (BooleanAction)theEObject;
				T result = caseBooleanAction(booleanAction);
				if (result == null) result = caseAction(booleanAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmontiarcPackage.LESS_THAN_NUMBER_GUARD: {
				LessThanNumberGuard lessThanNumberGuard = (LessThanNumberGuard)theEObject;
				T result = caseLessThanNumberGuard(lessThanNumberGuard);
				if (result == null) result = caseNumberGuard(lessThanNumberGuard);
				if (result == null) result = caseGuard(lessThanNumberGuard);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmontiarcPackage.GREATER_THAN_NUMBER_GUARD: {
				GreaterThanNumberGuard greaterThanNumberGuard = (GreaterThanNumberGuard)theEObject;
				T result = caseGreaterThanNumberGuard(greaterThanNumberGuard);
				if (result == null) result = caseNumberGuard(greaterThanNumberGuard);
				if (result == null) result = caseGuard(greaterThanNumberGuard);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmontiarcPackage.GREATER_OR_EQUAL_THAN_NUMBER_GUARD: {
				GreaterOrEqualThanNumberGuard greaterOrEqualThanNumberGuard = (GreaterOrEqualThanNumberGuard)theEObject;
				T result = caseGreaterOrEqualThanNumberGuard(greaterOrEqualThanNumberGuard);
				if (result == null) result = caseNumberGuard(greaterOrEqualThanNumberGuard);
				if (result == null) result = caseGuard(greaterOrEqualThanNumberGuard);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmontiarcPackage.LESS_OR_EQUAL_THAN_NUMBER_GUARD: {
				LessOrEqualThanNumberGuard lessOrEqualThanNumberGuard = (LessOrEqualThanNumberGuard)theEObject;
				T result = caseLessOrEqualThanNumberGuard(lessOrEqualThanNumberGuard);
				if (result == null) result = caseNumberGuard(lessOrEqualThanNumberGuard);
				if (result == null) result = caseGuard(lessOrEqualThanNumberGuard);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Automaton Component Behavior</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Automaton Component Behavior</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAutomatonComponentBehavior(AutomatonComponentBehavior object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>State</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>State</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseState(State object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransition(Transition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedElement(NamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariable(Variable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringVariable(StringVariable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Number Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Number Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNumberVariable(NumberVariable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBooleanVariable(BooleanVariable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Guard</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Guard</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGuard(Guard object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Guard</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Guard</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBooleanGuard(BooleanGuard object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String Guard</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String Guard</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringGuard(StringGuard object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Number Guard</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Number Guard</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNumberGuard(NumberGuard object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Equal Number Guard</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Equal Number Guard</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEqualNumberGuard(EqualNumberGuard object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAction(Action object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringAction(StringAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Number Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Number Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNumberAction(NumberAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBooleanAction(BooleanAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Less Than Number Guard</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Less Than Number Guard</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLessThanNumberGuard(LessThanNumberGuard object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Greater Than Number Guard</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Greater Than Number Guard</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGreaterThanNumberGuard(GreaterThanNumberGuard object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Greater Or Equal Than Number Guard</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Greater Or Equal Than Number Guard</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGreaterOrEqualThanNumberGuard(GreaterOrEqualThanNumberGuard object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Less Or Equal Than Number Guard</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Less Or Equal Than Number Guard</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLessOrEqualThanNumberGuard(LessOrEqualThanNumberGuard object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //XmontiarcSwitch

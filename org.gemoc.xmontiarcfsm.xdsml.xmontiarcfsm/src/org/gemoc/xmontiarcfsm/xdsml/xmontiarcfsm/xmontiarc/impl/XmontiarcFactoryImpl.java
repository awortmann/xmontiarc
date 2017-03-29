/**
 */
package org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.xmontiarc.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.xmontiarc.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class XmontiarcFactoryImpl extends EFactoryImpl implements XmontiarcFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static XmontiarcFactory init() {
		try {
			XmontiarcFactory theXmontiarcFactory = (XmontiarcFactory)EPackage.Registry.INSTANCE.getEFactory(XmontiarcPackage.eNS_URI);
			if (theXmontiarcFactory != null) {
				return theXmontiarcFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new XmontiarcFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XmontiarcFactoryImpl() {
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
			case XmontiarcPackage.AUTOMATON_COMPONENT_BEHAVIOR: return createAutomatonComponentBehavior();
			case XmontiarcPackage.STATE: return createState();
			case XmontiarcPackage.TRANSITION: return createTransition();
			case XmontiarcPackage.STRING_VARIABLE: return createStringVariable();
			case XmontiarcPackage.NUMBER_VARIABLE: return createNumberVariable();
			case XmontiarcPackage.BOOLEAN_VARIABLE: return createBooleanVariable();
			case XmontiarcPackage.BOOLEAN_GUARD: return createBooleanGuard();
			case XmontiarcPackage.STRING_GUARD: return createStringGuard();
			case XmontiarcPackage.EQUAL_NUMBER_GUARD: return createEqualNumberGuard();
			case XmontiarcPackage.STRING_ACTION: return createStringAction();
			case XmontiarcPackage.NUMBER_ACTION: return createNumberAction();
			case XmontiarcPackage.BOOLEAN_ACTION: return createBooleanAction();
			case XmontiarcPackage.LESS_THAN_NUMBER_GUARD: return createLessThanNumberGuard();
			case XmontiarcPackage.GREATER_THAN_NUMBER_GUARD: return createGreaterThanNumberGuard();
			case XmontiarcPackage.GREATER_OR_EQUAL_THAN_NUMBER_GUARD: return createGreaterOrEqualThanNumberGuard();
			case XmontiarcPackage.LESS_OR_EQUAL_THAN_NUMBER_GUARD: return createLessOrEqualThanNumberGuard();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AutomatonComponentBehavior createAutomatonComponentBehavior() {
		AutomatonComponentBehaviorImpl automatonComponentBehavior = new AutomatonComponentBehaviorImpl();
		return automatonComponentBehavior;
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
	public XmontiarcPackage getXmontiarcPackage() {
		return (XmontiarcPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static XmontiarcPackage getPackage() {
		return XmontiarcPackage.eINSTANCE;
	}

} //XmontiarcFactoryImpl

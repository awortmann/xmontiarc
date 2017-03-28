/**
 */
package ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.xmontiarc.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.xmontiarc.*;

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
			case XmontiarcPackage.COMPONENT_TYPE: return createComponentType();
			case XmontiarcPackage.PORT: return createPort();
			case XmontiarcPackage.INCOMING_PORT: return createIncomingPort();
			case XmontiarcPackage.OUTGOING_PORT: return createOutgoingPort();
			case XmontiarcPackage.INTERMEDIATE_CONNECTOR: return createIntermediateConnector();
			case XmontiarcPackage.INCOMING_CONNECTOR: return createIncomingConnector();
			case XmontiarcPackage.OUTGOING_CONNECTOR: return createOutgoingConnector();
			case XmontiarcPackage.SUBCOMPONENT: return createSubcomponent();
			case XmontiarcPackage.GROOVY_COMPONENT_BEHAVIOR: return createGroovyComponentBehavior();
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
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case XmontiarcPackage.DATA_TYPE:
				return createDataTypeFromString(eDataType, initialValue);
			case XmontiarcPackage.EDATA_TYPE:
				return createEDataTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case XmontiarcPackage.DATA_TYPE:
				return convertDataTypeToString(eDataType, instanceValue);
			case XmontiarcPackage.EDATA_TYPE:
				return convertEDataTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentType createComponentType() {
		ComponentTypeImpl componentType = new ComponentTypeImpl();
		return componentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port createPort() {
		PortImpl port = new PortImpl();
		return port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IncomingPort createIncomingPort() {
		IncomingPortImpl incomingPort = new IncomingPortImpl();
		return incomingPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutgoingPort createOutgoingPort() {
		OutgoingPortImpl outgoingPort = new OutgoingPortImpl();
		return outgoingPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntermediateConnector createIntermediateConnector() {
		IntermediateConnectorImpl intermediateConnector = new IntermediateConnectorImpl();
		return intermediateConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IncomingConnector createIncomingConnector() {
		IncomingConnectorImpl incomingConnector = new IncomingConnectorImpl();
		return incomingConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutgoingConnector createOutgoingConnector() {
		OutgoingConnectorImpl outgoingConnector = new OutgoingConnectorImpl();
		return outgoingConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Subcomponent createSubcomponent() {
		SubcomponentImpl subcomponent = new SubcomponentImpl();
		return subcomponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GroovyComponentBehavior createGroovyComponentBehavior() {
		GroovyComponentBehaviorImpl groovyComponentBehavior = new GroovyComponentBehaviorImpl();
		return groovyComponentBehavior;
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
	public DataType createDataTypeFromString(EDataType eDataType, String initialValue) {
		DataType result = DataType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDataTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType createEDataTypeFromString(EDataType eDataType, String initialValue) {
		return (EDataType)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEDataTypeToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
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

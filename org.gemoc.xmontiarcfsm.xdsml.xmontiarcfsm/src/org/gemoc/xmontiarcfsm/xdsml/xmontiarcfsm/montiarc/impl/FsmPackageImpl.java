/**
 */
package org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.montiarc.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.fsm.MontiarcPackage;

import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.fsm.impl.MontiarcPackageImpl;

import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.montiarc.AutomatonComponentBehavior;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.montiarc.ComponentBehavior;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.montiarc.ComponentType;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.montiarc.Connector;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.montiarc.DataType;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.montiarc.FsmFactory;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.montiarc.FsmPackage;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.montiarc.GroovyComponentBehavior;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.montiarc.IncomingConnector;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.montiarc.IncomingPort;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.montiarc.IntermediateConnector;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.montiarc.OutgoingConnector;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.montiarc.OutgoingPort;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.montiarc.Port;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.montiarc.StateMachine;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.montiarc.Subcomponent;

import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.montiarc.util.FsmValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FsmPackageImpl extends EPackageImpl implements FsmPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass portEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass incomingPortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass outgoingPortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass intermediateConnectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass incomingConnectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass outgoingConnectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subcomponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentBehaviorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass groovyComponentBehaviorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass automatonComponentBehaviorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stateMachineEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum dataTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType eDataTypeEDataType = null;

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
	 * @see org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.montiarc.FsmPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private FsmPackageImpl() {
		super(eNS_URI, FsmFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link FsmPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static FsmPackage init() {
		if (isInited) return (FsmPackage)EPackage.Registry.INSTANCE.getEPackage(FsmPackage.eNS_URI);

		// Obtain or create and register package
		FsmPackageImpl theFsmPackage = (FsmPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof FsmPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new FsmPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		MontiarcPackageImpl theMontiarcPackage = (MontiarcPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MontiarcPackage.eNS_URI) instanceof MontiarcPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MontiarcPackage.eNS_URI) : MontiarcPackage.eINSTANCE);

		// Create package meta-data objects
		theFsmPackage.createPackageContents();
		theMontiarcPackage.createPackageContents();

		// Initialize created meta-data
		theFsmPackage.initializePackageContents();
		theMontiarcPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theFsmPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return FsmValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theFsmPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(FsmPackage.eNS_URI, theFsmPackage);
		return theFsmPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComponentType() {
		return componentTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponentType_Name() {
		return (EAttribute)componentTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentType_Connectors() {
		return (EReference)componentTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentType_Subcomponents() {
		return (EReference)componentTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentType_IncomingPorts() {
		return (EReference)componentTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentType_OutgoingPorts() {
		return (EReference)componentTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentType_Behavior() {
		return (EReference)componentTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPort() {
		return portEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPort_Type() {
		return (EAttribute)portEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPort_Name() {
		return (EAttribute)portEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPort_Value() {
		return (EAttribute)portEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIncomingPort() {
		return incomingPortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOutgoingPort() {
		return outgoingPortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutgoingPort_InitialValue() {
		return (EAttribute)outgoingPortEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConnector() {
		return connectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnector_Parent() {
		return (EReference)connectorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntermediateConnector() {
		return intermediateConnectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIntermediateConnector_Source() {
		return (EReference)intermediateConnectorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIntermediateConnector_Target() {
		return (EReference)intermediateConnectorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIncomingConnector() {
		return incomingConnectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIncomingConnector_Source() {
		return (EReference)incomingConnectorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIncomingConnector_Target() {
		return (EReference)incomingConnectorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOutgoingConnector() {
		return outgoingConnectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOutgoingConnector_Source() {
		return (EReference)outgoingConnectorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOutgoingConnector_Target() {
		return (EReference)outgoingConnectorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubcomponent() {
		return subcomponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubcomponent_Name() {
		return (EAttribute)subcomponentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubcomponent_Type() {
		return (EReference)subcomponentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubcomponent_IncomingPorts() {
		return (EReference)subcomponentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubcomponent_Parent() {
		return (EReference)subcomponentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubcomponent_OutgoingPorts() {
		return (EReference)subcomponentEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubcomponent_LocalBehavior() {
		return (EReference)subcomponentEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComponentBehavior() {
		return componentBehaviorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGroovyComponentBehavior() {
		return groovyComponentBehaviorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGroovyComponentBehavior_ScriptBody() {
		return (EAttribute)groovyComponentBehaviorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAutomatonComponentBehavior() {
		return automatonComponentBehaviorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAutomatonComponentBehavior_DelegateFSM() {
		return (EReference)automatonComponentBehaviorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStateMachine() {
		return stateMachineEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDataType() {
		return dataTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getEDataType() {
		return eDataTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FsmFactory getFsmFactory() {
		return (FsmFactory)getEFactoryInstance();
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
		componentTypeEClass = createEClass(COMPONENT_TYPE);
		createEAttribute(componentTypeEClass, COMPONENT_TYPE__NAME);
		createEReference(componentTypeEClass, COMPONENT_TYPE__CONNECTORS);
		createEReference(componentTypeEClass, COMPONENT_TYPE__SUBCOMPONENTS);
		createEReference(componentTypeEClass, COMPONENT_TYPE__INCOMING_PORTS);
		createEReference(componentTypeEClass, COMPONENT_TYPE__OUTGOING_PORTS);
		createEReference(componentTypeEClass, COMPONENT_TYPE__BEHAVIOR);

		portEClass = createEClass(PORT);
		createEAttribute(portEClass, PORT__TYPE);
		createEAttribute(portEClass, PORT__NAME);
		createEAttribute(portEClass, PORT__VALUE);

		incomingPortEClass = createEClass(INCOMING_PORT);

		outgoingPortEClass = createEClass(OUTGOING_PORT);
		createEAttribute(outgoingPortEClass, OUTGOING_PORT__INITIAL_VALUE);

		connectorEClass = createEClass(CONNECTOR);
		createEReference(connectorEClass, CONNECTOR__PARENT);

		intermediateConnectorEClass = createEClass(INTERMEDIATE_CONNECTOR);
		createEReference(intermediateConnectorEClass, INTERMEDIATE_CONNECTOR__SOURCE);
		createEReference(intermediateConnectorEClass, INTERMEDIATE_CONNECTOR__TARGET);

		incomingConnectorEClass = createEClass(INCOMING_CONNECTOR);
		createEReference(incomingConnectorEClass, INCOMING_CONNECTOR__SOURCE);
		createEReference(incomingConnectorEClass, INCOMING_CONNECTOR__TARGET);

		outgoingConnectorEClass = createEClass(OUTGOING_CONNECTOR);
		createEReference(outgoingConnectorEClass, OUTGOING_CONNECTOR__SOURCE);
		createEReference(outgoingConnectorEClass, OUTGOING_CONNECTOR__TARGET);

		subcomponentEClass = createEClass(SUBCOMPONENT);
		createEAttribute(subcomponentEClass, SUBCOMPONENT__NAME);
		createEReference(subcomponentEClass, SUBCOMPONENT__TYPE);
		createEReference(subcomponentEClass, SUBCOMPONENT__INCOMING_PORTS);
		createEReference(subcomponentEClass, SUBCOMPONENT__PARENT);
		createEReference(subcomponentEClass, SUBCOMPONENT__OUTGOING_PORTS);
		createEReference(subcomponentEClass, SUBCOMPONENT__LOCAL_BEHAVIOR);

		componentBehaviorEClass = createEClass(COMPONENT_BEHAVIOR);

		groovyComponentBehaviorEClass = createEClass(GROOVY_COMPONENT_BEHAVIOR);
		createEAttribute(groovyComponentBehaviorEClass, GROOVY_COMPONENT_BEHAVIOR__SCRIPT_BODY);

		automatonComponentBehaviorEClass = createEClass(AUTOMATON_COMPONENT_BEHAVIOR);
		createEReference(automatonComponentBehaviorEClass, AUTOMATON_COMPONENT_BEHAVIOR__DELEGATE_FSM);

		stateMachineEClass = createEClass(STATE_MACHINE);

		// Create enums
		dataTypeEEnum = createEEnum(DATA_TYPE);

		// Create data types
		eDataTypeEDataType = createEDataType(EDATA_TYPE);
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
		incomingPortEClass.getESuperTypes().add(this.getPort());
		outgoingPortEClass.getESuperTypes().add(this.getPort());
		intermediateConnectorEClass.getESuperTypes().add(this.getConnector());
		incomingConnectorEClass.getESuperTypes().add(this.getConnector());
		outgoingConnectorEClass.getESuperTypes().add(this.getConnector());
		groovyComponentBehaviorEClass.getESuperTypes().add(this.getComponentBehavior());
		automatonComponentBehaviorEClass.getESuperTypes().add(this.getComponentBehavior());

		// Initialize classes and features; add operations and parameters
		initEClass(componentTypeEClass, ComponentType.class, "ComponentType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getComponentType_Name(), ecorePackage.getEString(), "name", "UnnamedComponentType", 1, 1, ComponentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponentType_Connectors(), this.getConnector(), this.getConnector_Parent(), "connectors", null, 0, -1, ComponentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponentType_Subcomponents(), this.getSubcomponent(), this.getSubcomponent_Parent(), "subcomponents", null, 0, -1, ComponentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponentType_IncomingPorts(), this.getIncomingPort(), null, "incomingPorts", null, 0, -1, ComponentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponentType_OutgoingPorts(), this.getOutgoingPort(), null, "outgoingPorts", null, 0, -1, ComponentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponentType_Behavior(), this.getComponentBehavior(), null, "behavior", null, 0, 1, ComponentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = addEOperation(componentTypeEClass, null, "initializeModel", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "args", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(componentTypeEClass, null, "main", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(componentTypeEClass, null, "compute", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(componentTypeEClass, null, "update", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(componentTypeEClass, this.getSubcomponent(), "findOwnerOf", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getPort(), "p", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(componentTypeEClass, this.getPort(), "getOutgoingPortsOfSubcomponents", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(componentTypeEClass, this.getPort(), "getIncomingPortsOfSubcomponents", 0, -1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(componentTypeEClass, this.getPort(), "getDirectedPortsOfSubcomponents", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "collectIncoming", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(portEClass, Port.class, "Port", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPort_Type(), this.getDataType(), "type", "Number", 0, 1, Port.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPort_Name(), ecorePackage.getEString(), "name", "UnnamedPort", 1, 1, Port.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPort_Value(), this.getEDataType(), "value", null, 0, 1, Port.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(portEClass, ecorePackage.getEString(), "toString", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(incomingPortEClass, IncomingPort.class, "IncomingPort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(outgoingPortEClass, OutgoingPort.class, "OutgoingPort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOutgoingPort_InitialValue(), ecorePackage.getEString(), "initialValue", "DefaultValue", 1, 1, OutgoingPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(connectorEClass, Connector.class, "Connector", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConnector_Parent(), this.getComponentType(), this.getComponentType_Connectors(), "parent", null, 0, 1, Connector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(connectorEClass, null, "update", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(connectorEClass, this.getPort(), "getSource", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(connectorEClass, this.getPort(), "getTarget", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(connectorEClass, ecorePackage.getEString(), "getSourceRepresentation", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(connectorEClass, ecorePackage.getEString(), "getTargetRepresentation", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(connectorEClass, ecorePackage.getEString(), "getRepresentation", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(intermediateConnectorEClass, IntermediateConnector.class, "IntermediateConnector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIntermediateConnector_Source(), this.getOutgoingPort(), null, "source", null, 1, 1, IntermediateConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIntermediateConnector_Target(), this.getIncomingPort(), null, "target", null, 1, 1, IntermediateConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(incomingConnectorEClass, IncomingConnector.class, "IncomingConnector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIncomingConnector_Source(), this.getIncomingPort(), null, "source", null, 1, 1, IncomingConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIncomingConnector_Target(), this.getIncomingPort(), null, "target", null, 1, 1, IncomingConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(outgoingConnectorEClass, OutgoingConnector.class, "OutgoingConnector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOutgoingConnector_Source(), this.getOutgoingPort(), null, "source", null, 1, 1, OutgoingConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOutgoingConnector_Target(), this.getOutgoingPort(), null, "target", null, 1, 1, OutgoingConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(subcomponentEClass, Subcomponent.class, "Subcomponent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSubcomponent_Name(), ecorePackage.getEString(), "name", "UnnamedSubcomponent", 1, 1, Subcomponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSubcomponent_Type(), this.getComponentType(), null, "type", null, 1, 1, Subcomponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSubcomponent_IncomingPorts(), this.getIncomingPort(), null, "incomingPorts", null, 0, -1, Subcomponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSubcomponent_Parent(), this.getComponentType(), this.getComponentType_Subcomponents(), "parent", null, 0, 1, Subcomponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSubcomponent_OutgoingPorts(), this.getOutgoingPort(), null, "outgoingPorts", null, 0, -1, Subcomponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSubcomponent_LocalBehavior(), this.getComponentBehavior(), null, "localBehavior", null, 0, 1, Subcomponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(subcomponentEClass, null, "createDefaultBehavior", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(subcomponentEClass, null, "compute", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(componentBehaviorEClass, ComponentBehavior.class, "ComponentBehavior", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(groovyComponentBehaviorEClass, GroovyComponentBehavior.class, "GroovyComponentBehavior", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGroovyComponentBehavior_ScriptBody(), ecorePackage.getEString(), "scriptBody", "\"\"", 1, 1, GroovyComponentBehavior.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(automatonComponentBehaviorEClass, AutomatonComponentBehavior.class, "AutomatonComponentBehavior", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAutomatonComponentBehavior_DelegateFSM(), this.getStateMachine(), null, "delegateFSM", null, 0, 1, AutomatonComponentBehavior.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(automatonComponentBehaviorEClass, null, "wrapPortValuesToAutomaton", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(automatonComponentBehaviorEClass, null, "process", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(automatonComponentBehaviorEClass, null, "unwrapPortValuesFromAutomaton", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(stateMachineEClass, StateMachine.class, "StateMachine", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(dataTypeEEnum, DataType.class, "DataType");
		addEEnumLiteral(dataTypeEEnum, DataType.NUMBER);
		addEEnumLiteral(dataTypeEEnum, DataType.BOOLEAN);
		addEEnumLiteral(dataTypeEEnum, DataType.STRING);

		// Initialize data types
		initEDataType(eDataTypeEDataType, EDataType.class, "EDataType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot
		createPivotAnnotations();
		// aspect
		createAspectAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "invocationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
			 "settingDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
			 "validationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot"
		   });	
		addAnnotation
		  (componentTypeEClass, 
		   source, 
		   new String[] {
			 "constraints", "AtomicOrComposed"
		   });	
		addAnnotation
		  (portEClass, 
		   source, 
		   new String[] {
			 "constraints", "NameIsLowerCase"
		   });	
		addAnnotation
		  (connectorEClass, 
		   source, 
		   new String[] {
			 "constraints", "DifferentSourceAndTarget MatchingPortTypes"
		   });	
		addAnnotation
		  (subcomponentEClass, 
		   source, 
		   new String[] {
			 "constraints", "NameIsLowerCase"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createPivotAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot";	
		addAnnotation
		  (componentTypeEClass, 
		   source, 
		   new String[] {
			 "AtomicOrComposed", "Tuple {\n\tmessage : String = \'Component type \\\'\' + name + \'\\\' cannot have connectors and behavior\',\n\tstatus : Boolean = \n            behavior.equalsIgnoreCase(\'\') or self.connectors->isEmpty()\n}.status"
		   });	
		addAnnotation
		  (portEClass, 
		   source, 
		   new String[] {
			 "NameIsLowerCase", "Tuple {\n\tmessage : String = \'Port \\\'\' + name + \'\\\' must be lowercase\',\n\tstatus : Boolean = \n            let firstLetter : String = (name).substring(0,1)\n                in firstLetter.toLowerCase() = firstLetter\n}.status"
		   });	
		addAnnotation
		  (connectorEClass, 
		   source, 
		   new String[] {
			 "DifferentSourceAndTarget", "Tuple {\n\tmessage : String = \'Connectors cannot have the same source and target.\',\n\tstatus : Boolean = \n            source <> target\n}.status",
			 "MatchingPortTypes", "Tuple {\n\tmessage : String = \'The data types of source and target ports must match.\',\n\tstatus : Boolean = \n            source <> target\n}.status"
		   });	
		addAnnotation
		  (subcomponentEClass, 
		   source, 
		   new String[] {
			 "NameIsLowerCase", "Tuple {\n\tmessage : String = \'\\\'\' + name + \'\\\' must be lowercase\',\n\tstatus : Boolean = \n            let firstLetter : String = (name).substring(0,1) \n                in firstLetter.toLowerCase() = firstLetter\n}.status"
		   });
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
		  (componentTypeEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (componentTypeEClass.getEOperations().get(1), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (componentTypeEClass.getEOperations().get(2), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (componentTypeEClass.getEOperations().get(3), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (componentTypeEClass.getEOperations().get(4), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (componentTypeEClass.getEOperations().get(5), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (componentTypeEClass.getEOperations().get(6), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (componentTypeEClass.getEOperations().get(7), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (portEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getPort_Value(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (connectorEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (connectorEClass.getEOperations().get(1), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (connectorEClass.getEOperations().get(2), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (connectorEClass.getEOperations().get(3), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (connectorEClass.getEOperations().get(4), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (connectorEClass.getEOperations().get(5), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (subcomponentEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (subcomponentEClass.getEOperations().get(1), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (automatonComponentBehaviorEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (automatonComponentBehaviorEClass.getEOperations().get(1), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (automatonComponentBehaviorEClass.getEOperations().get(2), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getAutomatonComponentBehavior_DelegateFSM(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (eDataTypeEDataType, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (stateMachineEClass, 
		   source, 
		   new String[] {
		   });
	}

} //FsmPackageImpl

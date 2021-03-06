/**
 */
package xmontiarc;

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
 * @see xmontiarc.XmontiarcFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot'"
 * @generated
 */
public interface XmontiarcPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "xmontiarc";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://ur1/diverse/xmontiarc/model";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ur1.diverse.xmontiarc.model";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	XmontiarcPackage eINSTANCE = xmontiarc.impl.XmontiarcPackageImpl.init();

	/**
	 * The meta object id for the '{@link xmontiarc.impl.ComponentTypeImpl <em>Component Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xmontiarc.impl.ComponentTypeImpl
	 * @see xmontiarc.impl.XmontiarcPackageImpl#getComponentType()
	 * @generated
	 */
	int COMPONENT_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_TYPE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Connectors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_TYPE__CONNECTORS = 1;

	/**
	 * The feature id for the '<em><b>Subcomponents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_TYPE__SUBCOMPONENTS = 2;

	/**
	 * The feature id for the '<em><b>Incoming Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_TYPE__INCOMING_PORTS = 3;

	/**
	 * The feature id for the '<em><b>Outgoing Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_TYPE__OUTGOING_PORTS = 4;

	/**
	 * The feature id for the '<em><b>Behavior</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_TYPE__BEHAVIOR = 5;

	/**
	 * The number of structural features of the '<em>Component Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_TYPE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Component Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link xmontiarc.impl.PortImpl <em>Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xmontiarc.impl.PortImpl
	 * @see xmontiarc.impl.XmontiarcPackageImpl#getPort()
	 * @generated
	 */
	int PORT = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__NAME = 1;

	/**
	 * The number of structural features of the '<em>Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link xmontiarc.impl.IncomingPortImpl <em>Incoming Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xmontiarc.impl.IncomingPortImpl
	 * @see xmontiarc.impl.XmontiarcPackageImpl#getIncomingPort()
	 * @generated
	 */
	int INCOMING_PORT = 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCOMING_PORT__TYPE = PORT__TYPE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCOMING_PORT__NAME = PORT__NAME;

	/**
	 * The number of structural features of the '<em>Incoming Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCOMING_PORT_FEATURE_COUNT = PORT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Incoming Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCOMING_PORT_OPERATION_COUNT = PORT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link xmontiarc.impl.OutgoingPortImpl <em>Outgoing Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xmontiarc.impl.OutgoingPortImpl
	 * @see xmontiarc.impl.XmontiarcPackageImpl#getOutgoingPort()
	 * @generated
	 */
	int OUTGOING_PORT = 3;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTGOING_PORT__TYPE = PORT__TYPE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTGOING_PORT__NAME = PORT__NAME;

	/**
	 * The feature id for the '<em><b>Initial Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTGOING_PORT__INITIAL_VALUE = PORT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Outgoing Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTGOING_PORT_FEATURE_COUNT = PORT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Outgoing Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTGOING_PORT_OPERATION_COUNT = PORT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link xmontiarc.impl.ConnectorImpl <em>Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xmontiarc.impl.ConnectorImpl
	 * @see xmontiarc.impl.XmontiarcPackageImpl#getConnector()
	 * @generated
	 */
	int CONNECTOR = 4;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__PARENT = 0;

	/**
	 * The number of structural features of the '<em>Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link xmontiarc.impl.IntermediateConnectorImpl <em>Intermediate Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xmontiarc.impl.IntermediateConnectorImpl
	 * @see xmontiarc.impl.XmontiarcPackageImpl#getIntermediateConnector()
	 * @generated
	 */
	int INTERMEDIATE_CONNECTOR = 5;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_CONNECTOR__PARENT = CONNECTOR__PARENT;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_CONNECTOR__SOURCE = CONNECTOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_CONNECTOR__TARGET = CONNECTOR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Intermediate Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_CONNECTOR_FEATURE_COUNT = CONNECTOR_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Intermediate Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_CONNECTOR_OPERATION_COUNT = CONNECTOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link xmontiarc.impl.IncomingConnectorImpl <em>Incoming Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xmontiarc.impl.IncomingConnectorImpl
	 * @see xmontiarc.impl.XmontiarcPackageImpl#getIncomingConnector()
	 * @generated
	 */
	int INCOMING_CONNECTOR = 6;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCOMING_CONNECTOR__PARENT = CONNECTOR__PARENT;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCOMING_CONNECTOR__SOURCE = CONNECTOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCOMING_CONNECTOR__TARGET = CONNECTOR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Incoming Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCOMING_CONNECTOR_FEATURE_COUNT = CONNECTOR_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Incoming Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCOMING_CONNECTOR_OPERATION_COUNT = CONNECTOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link xmontiarc.impl.OutgoingConnectorImpl <em>Outgoing Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xmontiarc.impl.OutgoingConnectorImpl
	 * @see xmontiarc.impl.XmontiarcPackageImpl#getOutgoingConnector()
	 * @generated
	 */
	int OUTGOING_CONNECTOR = 7;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTGOING_CONNECTOR__PARENT = CONNECTOR__PARENT;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTGOING_CONNECTOR__SOURCE = CONNECTOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTGOING_CONNECTOR__TARGET = CONNECTOR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Outgoing Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTGOING_CONNECTOR_FEATURE_COUNT = CONNECTOR_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Outgoing Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTGOING_CONNECTOR_OPERATION_COUNT = CONNECTOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link xmontiarc.impl.SubcomponentImpl <em>Subcomponent</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xmontiarc.impl.SubcomponentImpl
	 * @see xmontiarc.impl.XmontiarcPackageImpl#getSubcomponent()
	 * @generated
	 */
	int SUBCOMPONENT = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBCOMPONENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBCOMPONENT__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Incoming Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBCOMPONENT__INCOMING_PORTS = 2;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBCOMPONENT__PARENT = 3;

	/**
	 * The feature id for the '<em><b>Outgoing Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBCOMPONENT__OUTGOING_PORTS = 4;

	/**
	 * The number of structural features of the '<em>Subcomponent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBCOMPONENT_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Subcomponent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBCOMPONENT_OPERATION_COUNT = 0;


	/**
	 * The meta object id for the '{@link xmontiarc.impl.ComponentBehaviorImpl <em>Component Behavior</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xmontiarc.impl.ComponentBehaviorImpl
	 * @see xmontiarc.impl.XmontiarcPackageImpl#getComponentBehavior()
	 * @generated
	 */
	int COMPONENT_BEHAVIOR = 9;

	/**
	 * The number of structural features of the '<em>Component Behavior</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_BEHAVIOR_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Component Behavior</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_BEHAVIOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link xmontiarc.impl.GroovyComponentBehaviorImpl <em>Groovy Component Behavior</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xmontiarc.impl.GroovyComponentBehaviorImpl
	 * @see xmontiarc.impl.XmontiarcPackageImpl#getGroovyComponentBehavior()
	 * @generated
	 */
	int GROOVY_COMPONENT_BEHAVIOR = 10;

	/**
	 * The feature id for the '<em><b>Script Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROOVY_COMPONENT_BEHAVIOR__SCRIPT_BODY = COMPONENT_BEHAVIOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Groovy Component Behavior</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROOVY_COMPONENT_BEHAVIOR_FEATURE_COUNT = COMPONENT_BEHAVIOR_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Groovy Component Behavior</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROOVY_COMPONENT_BEHAVIOR_OPERATION_COUNT = COMPONENT_BEHAVIOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link xmontiarc.impl.AutomatonComponentBehaviorImpl <em>Automaton Component Behavior</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xmontiarc.impl.AutomatonComponentBehaviorImpl
	 * @see xmontiarc.impl.XmontiarcPackageImpl#getAutomatonComponentBehavior()
	 * @generated
	 */
	int AUTOMATON_COMPONENT_BEHAVIOR = 11;

	/**
	 * The number of structural features of the '<em>Automaton Component Behavior</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOMATON_COMPONENT_BEHAVIOR_FEATURE_COUNT = COMPONENT_BEHAVIOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Automaton Component Behavior</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOMATON_COMPONENT_BEHAVIOR_OPERATION_COUNT = COMPONENT_BEHAVIOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link xmontiarc.DataType <em>Data Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xmontiarc.DataType
	 * @see xmontiarc.impl.XmontiarcPackageImpl#getDataType()
	 * @generated
	 */
	int DATA_TYPE = 12;


	/**
	 * Returns the meta object for class '{@link xmontiarc.ComponentType <em>Component Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Type</em>'.
	 * @see xmontiarc.ComponentType
	 * @generated
	 */
	EClass getComponentType();

	/**
	 * Returns the meta object for the attribute '{@link xmontiarc.ComponentType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see xmontiarc.ComponentType#getName()
	 * @see #getComponentType()
	 * @generated
	 */
	EAttribute getComponentType_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link xmontiarc.ComponentType#getConnectors <em>Connectors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Connectors</em>'.
	 * @see xmontiarc.ComponentType#getConnectors()
	 * @see #getComponentType()
	 * @generated
	 */
	EReference getComponentType_Connectors();

	/**
	 * Returns the meta object for the containment reference list '{@link xmontiarc.ComponentType#getSubcomponents <em>Subcomponents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Subcomponents</em>'.
	 * @see xmontiarc.ComponentType#getSubcomponents()
	 * @see #getComponentType()
	 * @generated
	 */
	EReference getComponentType_Subcomponents();

	/**
	 * Returns the meta object for the reference '{@link xmontiarc.ComponentType#getBehavior <em>Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Behavior</em>'.
	 * @see xmontiarc.ComponentType#getBehavior()
	 * @see #getComponentType()
	 * @generated
	 */
	EReference getComponentType_Behavior();

	/**
	 * Returns the meta object for the containment reference list '{@link xmontiarc.ComponentType#getIncomingPorts <em>Incoming Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Incoming Ports</em>'.
	 * @see xmontiarc.ComponentType#getIncomingPorts()
	 * @see #getComponentType()
	 * @generated
	 */
	EReference getComponentType_IncomingPorts();

	/**
	 * Returns the meta object for the containment reference list '{@link xmontiarc.ComponentType#getOutgoingPorts <em>Outgoing Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Outgoing Ports</em>'.
	 * @see xmontiarc.ComponentType#getOutgoingPorts()
	 * @see #getComponentType()
	 * @generated
	 */
	EReference getComponentType_OutgoingPorts();

	/**
	 * Returns the meta object for class '{@link xmontiarc.Port <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port</em>'.
	 * @see xmontiarc.Port
	 * @generated
	 */
	EClass getPort();

	/**
	 * Returns the meta object for the attribute '{@link xmontiarc.Port#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see xmontiarc.Port#getName()
	 * @see #getPort()
	 * @generated
	 */
	EAttribute getPort_Name();

	/**
	 * Returns the meta object for class '{@link xmontiarc.IncomingPort <em>Incoming Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Incoming Port</em>'.
	 * @see xmontiarc.IncomingPort
	 * @generated
	 */
	EClass getIncomingPort();

	/**
	 * Returns the meta object for class '{@link xmontiarc.OutgoingPort <em>Outgoing Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Outgoing Port</em>'.
	 * @see xmontiarc.OutgoingPort
	 * @generated
	 */
	EClass getOutgoingPort();

	/**
	 * Returns the meta object for the attribute '{@link xmontiarc.OutgoingPort#getInitialValue <em>Initial Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Initial Value</em>'.
	 * @see xmontiarc.OutgoingPort#getInitialValue()
	 * @see #getOutgoingPort()
	 * @generated
	 */
	EAttribute getOutgoingPort_InitialValue();

	/**
	 * Returns the meta object for the attribute '{@link xmontiarc.Port#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see xmontiarc.Port#getType()
	 * @see #getPort()
	 * @generated
	 */
	EAttribute getPort_Type();

	/**
	 * Returns the meta object for class '{@link xmontiarc.Connector <em>Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connector</em>'.
	 * @see xmontiarc.Connector
	 * @generated
	 */
	EClass getConnector();

	/**
	 * Returns the meta object for the container reference '{@link xmontiarc.Connector#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see xmontiarc.Connector#getParent()
	 * @see #getConnector()
	 * @generated
	 */
	EReference getConnector_Parent();

	/**
	 * Returns the meta object for class '{@link xmontiarc.IntermediateConnector <em>Intermediate Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Intermediate Connector</em>'.
	 * @see xmontiarc.IntermediateConnector
	 * @generated
	 */
	EClass getIntermediateConnector();

	/**
	 * Returns the meta object for the reference '{@link xmontiarc.IntermediateConnector#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see xmontiarc.IntermediateConnector#getSource()
	 * @see #getIntermediateConnector()
	 * @generated
	 */
	EReference getIntermediateConnector_Source();

	/**
	 * Returns the meta object for the reference '{@link xmontiarc.IntermediateConnector#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see xmontiarc.IntermediateConnector#getTarget()
	 * @see #getIntermediateConnector()
	 * @generated
	 */
	EReference getIntermediateConnector_Target();

	/**
	 * Returns the meta object for class '{@link xmontiarc.IncomingConnector <em>Incoming Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Incoming Connector</em>'.
	 * @see xmontiarc.IncomingConnector
	 * @generated
	 */
	EClass getIncomingConnector();

	/**
	 * Returns the meta object for the reference '{@link xmontiarc.IncomingConnector#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see xmontiarc.IncomingConnector#getSource()
	 * @see #getIncomingConnector()
	 * @generated
	 */
	EReference getIncomingConnector_Source();

	/**
	 * Returns the meta object for the reference '{@link xmontiarc.IncomingConnector#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see xmontiarc.IncomingConnector#getTarget()
	 * @see #getIncomingConnector()
	 * @generated
	 */
	EReference getIncomingConnector_Target();

	/**
	 * Returns the meta object for class '{@link xmontiarc.OutgoingConnector <em>Outgoing Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Outgoing Connector</em>'.
	 * @see xmontiarc.OutgoingConnector
	 * @generated
	 */
	EClass getOutgoingConnector();

	/**
	 * Returns the meta object for the reference '{@link xmontiarc.OutgoingConnector#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see xmontiarc.OutgoingConnector#getSource()
	 * @see #getOutgoingConnector()
	 * @generated
	 */
	EReference getOutgoingConnector_Source();

	/**
	 * Returns the meta object for the reference '{@link xmontiarc.OutgoingConnector#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see xmontiarc.OutgoingConnector#getTarget()
	 * @see #getOutgoingConnector()
	 * @generated
	 */
	EReference getOutgoingConnector_Target();

	/**
	 * Returns the meta object for class '{@link xmontiarc.Subcomponent <em>Subcomponent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Subcomponent</em>'.
	 * @see xmontiarc.Subcomponent
	 * @generated
	 */
	EClass getSubcomponent();

	/**
	 * Returns the meta object for the attribute '{@link xmontiarc.Subcomponent#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see xmontiarc.Subcomponent#getName()
	 * @see #getSubcomponent()
	 * @generated
	 */
	EAttribute getSubcomponent_Name();

	/**
	 * Returns the meta object for the reference '{@link xmontiarc.Subcomponent#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see xmontiarc.Subcomponent#getType()
	 * @see #getSubcomponent()
	 * @generated
	 */
	EReference getSubcomponent_Type();

	/**
	 * Returns the meta object for the containment reference list '{@link xmontiarc.Subcomponent#getIncomingPorts <em>Incoming Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Incoming Ports</em>'.
	 * @see xmontiarc.Subcomponent#getIncomingPorts()
	 * @see #getSubcomponent()
	 * @generated
	 */
	EReference getSubcomponent_IncomingPorts();

	/**
	 * Returns the meta object for the container reference '{@link xmontiarc.Subcomponent#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see xmontiarc.Subcomponent#getParent()
	 * @see #getSubcomponent()
	 * @generated
	 */
	EReference getSubcomponent_Parent();

	/**
	 * Returns the meta object for the containment reference list '{@link xmontiarc.Subcomponent#getOutgoingPorts <em>Outgoing Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Outgoing Ports</em>'.
	 * @see xmontiarc.Subcomponent#getOutgoingPorts()
	 * @see #getSubcomponent()
	 * @generated
	 */
	EReference getSubcomponent_OutgoingPorts();

	/**
	 * Returns the meta object for class '{@link xmontiarc.ComponentBehavior <em>Component Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Behavior</em>'.
	 * @see xmontiarc.ComponentBehavior
	 * @generated
	 */
	EClass getComponentBehavior();

	/**
	 * Returns the meta object for class '{@link xmontiarc.GroovyComponentBehavior <em>Groovy Component Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Groovy Component Behavior</em>'.
	 * @see xmontiarc.GroovyComponentBehavior
	 * @generated
	 */
	EClass getGroovyComponentBehavior();

	/**
	 * Returns the meta object for the attribute '{@link xmontiarc.GroovyComponentBehavior#getScriptBody <em>Script Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Script Body</em>'.
	 * @see xmontiarc.GroovyComponentBehavior#getScriptBody()
	 * @see #getGroovyComponentBehavior()
	 * @generated
	 */
	EAttribute getGroovyComponentBehavior_ScriptBody();

	/**
	 * Returns the meta object for class '{@link xmontiarc.AutomatonComponentBehavior <em>Automaton Component Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Automaton Component Behavior</em>'.
	 * @see xmontiarc.AutomatonComponentBehavior
	 * @generated
	 */
	EClass getAutomatonComponentBehavior();

	/**
	 * Returns the meta object for enum '{@link xmontiarc.DataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Data Type</em>'.
	 * @see xmontiarc.DataType
	 * @generated
	 */
	EEnum getDataType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	XmontiarcFactory getXmontiarcFactory();

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
		 * The meta object literal for the '{@link xmontiarc.impl.ComponentTypeImpl <em>Component Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xmontiarc.impl.ComponentTypeImpl
		 * @see xmontiarc.impl.XmontiarcPackageImpl#getComponentType()
		 * @generated
		 */
		EClass COMPONENT_TYPE = eINSTANCE.getComponentType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT_TYPE__NAME = eINSTANCE.getComponentType_Name();

		/**
		 * The meta object literal for the '<em><b>Connectors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_TYPE__CONNECTORS = eINSTANCE.getComponentType_Connectors();

		/**
		 * The meta object literal for the '<em><b>Subcomponents</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_TYPE__SUBCOMPONENTS = eINSTANCE.getComponentType_Subcomponents();

		/**
		 * The meta object literal for the '<em><b>Behavior</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_TYPE__BEHAVIOR = eINSTANCE.getComponentType_Behavior();

		/**
		 * The meta object literal for the '<em><b>Incoming Ports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_TYPE__INCOMING_PORTS = eINSTANCE.getComponentType_IncomingPorts();

		/**
		 * The meta object literal for the '<em><b>Outgoing Ports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_TYPE__OUTGOING_PORTS = eINSTANCE.getComponentType_OutgoingPorts();

		/**
		 * The meta object literal for the '{@link xmontiarc.impl.PortImpl <em>Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xmontiarc.impl.PortImpl
		 * @see xmontiarc.impl.XmontiarcPackageImpl#getPort()
		 * @generated
		 */
		EClass PORT = eINSTANCE.getPort();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT__NAME = eINSTANCE.getPort_Name();

		/**
		 * The meta object literal for the '{@link xmontiarc.impl.IncomingPortImpl <em>Incoming Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xmontiarc.impl.IncomingPortImpl
		 * @see xmontiarc.impl.XmontiarcPackageImpl#getIncomingPort()
		 * @generated
		 */
		EClass INCOMING_PORT = eINSTANCE.getIncomingPort();

		/**
		 * The meta object literal for the '{@link xmontiarc.impl.OutgoingPortImpl <em>Outgoing Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xmontiarc.impl.OutgoingPortImpl
		 * @see xmontiarc.impl.XmontiarcPackageImpl#getOutgoingPort()
		 * @generated
		 */
		EClass OUTGOING_PORT = eINSTANCE.getOutgoingPort();

		/**
		 * The meta object literal for the '<em><b>Initial Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTGOING_PORT__INITIAL_VALUE = eINSTANCE.getOutgoingPort_InitialValue();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT__TYPE = eINSTANCE.getPort_Type();

		/**
		 * The meta object literal for the '{@link xmontiarc.impl.ConnectorImpl <em>Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xmontiarc.impl.ConnectorImpl
		 * @see xmontiarc.impl.XmontiarcPackageImpl#getConnector()
		 * @generated
		 */
		EClass CONNECTOR = eINSTANCE.getConnector();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTOR__PARENT = eINSTANCE.getConnector_Parent();

		/**
		 * The meta object literal for the '{@link xmontiarc.impl.IntermediateConnectorImpl <em>Intermediate Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xmontiarc.impl.IntermediateConnectorImpl
		 * @see xmontiarc.impl.XmontiarcPackageImpl#getIntermediateConnector()
		 * @generated
		 */
		EClass INTERMEDIATE_CONNECTOR = eINSTANCE.getIntermediateConnector();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERMEDIATE_CONNECTOR__SOURCE = eINSTANCE.getIntermediateConnector_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERMEDIATE_CONNECTOR__TARGET = eINSTANCE.getIntermediateConnector_Target();

		/**
		 * The meta object literal for the '{@link xmontiarc.impl.IncomingConnectorImpl <em>Incoming Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xmontiarc.impl.IncomingConnectorImpl
		 * @see xmontiarc.impl.XmontiarcPackageImpl#getIncomingConnector()
		 * @generated
		 */
		EClass INCOMING_CONNECTOR = eINSTANCE.getIncomingConnector();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INCOMING_CONNECTOR__SOURCE = eINSTANCE.getIncomingConnector_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INCOMING_CONNECTOR__TARGET = eINSTANCE.getIncomingConnector_Target();

		/**
		 * The meta object literal for the '{@link xmontiarc.impl.OutgoingConnectorImpl <em>Outgoing Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xmontiarc.impl.OutgoingConnectorImpl
		 * @see xmontiarc.impl.XmontiarcPackageImpl#getOutgoingConnector()
		 * @generated
		 */
		EClass OUTGOING_CONNECTOR = eINSTANCE.getOutgoingConnector();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUTGOING_CONNECTOR__SOURCE = eINSTANCE.getOutgoingConnector_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUTGOING_CONNECTOR__TARGET = eINSTANCE.getOutgoingConnector_Target();

		/**
		 * The meta object literal for the '{@link xmontiarc.impl.SubcomponentImpl <em>Subcomponent</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xmontiarc.impl.SubcomponentImpl
		 * @see xmontiarc.impl.XmontiarcPackageImpl#getSubcomponent()
		 * @generated
		 */
		EClass SUBCOMPONENT = eINSTANCE.getSubcomponent();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBCOMPONENT__NAME = eINSTANCE.getSubcomponent_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBCOMPONENT__TYPE = eINSTANCE.getSubcomponent_Type();

		/**
		 * The meta object literal for the '<em><b>Incoming Ports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBCOMPONENT__INCOMING_PORTS = eINSTANCE.getSubcomponent_IncomingPorts();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBCOMPONENT__PARENT = eINSTANCE.getSubcomponent_Parent();

		/**
		 * The meta object literal for the '<em><b>Outgoing Ports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBCOMPONENT__OUTGOING_PORTS = eINSTANCE.getSubcomponent_OutgoingPorts();

		/**
		 * The meta object literal for the '{@link xmontiarc.impl.ComponentBehaviorImpl <em>Component Behavior</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xmontiarc.impl.ComponentBehaviorImpl
		 * @see xmontiarc.impl.XmontiarcPackageImpl#getComponentBehavior()
		 * @generated
		 */
		EClass COMPONENT_BEHAVIOR = eINSTANCE.getComponentBehavior();

		/**
		 * The meta object literal for the '{@link xmontiarc.impl.GroovyComponentBehaviorImpl <em>Groovy Component Behavior</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xmontiarc.impl.GroovyComponentBehaviorImpl
		 * @see xmontiarc.impl.XmontiarcPackageImpl#getGroovyComponentBehavior()
		 * @generated
		 */
		EClass GROOVY_COMPONENT_BEHAVIOR = eINSTANCE.getGroovyComponentBehavior();

		/**
		 * The meta object literal for the '<em><b>Script Body</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GROOVY_COMPONENT_BEHAVIOR__SCRIPT_BODY = eINSTANCE.getGroovyComponentBehavior_ScriptBody();

		/**
		 * The meta object literal for the '{@link xmontiarc.impl.AutomatonComponentBehaviorImpl <em>Automaton Component Behavior</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xmontiarc.impl.AutomatonComponentBehaviorImpl
		 * @see xmontiarc.impl.XmontiarcPackageImpl#getAutomatonComponentBehavior()
		 * @generated
		 */
		EClass AUTOMATON_COMPONENT_BEHAVIOR = eINSTANCE.getAutomatonComponentBehavior();

		/**
		 * The meta object literal for the '{@link xmontiarc.DataType <em>Data Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xmontiarc.DataType
		 * @see xmontiarc.impl.XmontiarcPackageImpl#getDataType()
		 * @generated
		 */
		EEnum DATA_TYPE = eINSTANCE.getDataType();

	}

} //XmontiarcPackage

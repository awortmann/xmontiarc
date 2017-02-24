/**
 */
package montiarc;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see montiarc.MontiarcFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/OCL/Import ur1.diverse.cd='cd.ecore#/'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot'"
 * @generated
 */
public interface MontiarcPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "montiarc";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://u1/diverse/montiarc/model";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ur1.diverse.montiarc.model";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MontiarcPackage eINSTANCE = montiarc.impl.MontiarcPackageImpl.init();

	/**
	 * The meta object id for the '{@link montiarc.impl.ComponentTypeImpl <em>Component Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see montiarc.impl.ComponentTypeImpl
	 * @see montiarc.impl.MontiarcPackageImpl#getComponentType()
	 * @generated
	 */
	int COMPONENT_TYPE = 0;

	/**
	 * The meta object id for the '{@link montiarc.impl.PortTypeImpl <em>Port Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see montiarc.impl.PortTypeImpl
	 * @see montiarc.impl.MontiarcPackageImpl#getPortType()
	 * @generated
	 */
	int PORT_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_TYPE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Super Component Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_TYPE__SUPER_COMPONENT_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_TYPE__PORTS = 2;

	/**
	 * The feature id for the '<em><b>Connectors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_TYPE__CONNECTORS = 3;

	/**
	 * The feature id for the '<em><b>Subcomponents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_TYPE__SUBCOMPONENTS = 4;

	/**
	 * The feature id for the '<em><b>Groovy Behavior</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_TYPE__GROOVY_BEHAVIOR = 5;

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
	 * The feature id for the '<em><b>Is Incoming</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_TYPE__IS_INCOMING = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_TYPE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_TYPE__TYPE = 2;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_TYPE__PARENT = 3;

	/**
	 * The number of structural features of the '<em>Port Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Port Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link montiarc.impl.ComponentInstanceImpl <em>Component Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see montiarc.impl.ComponentInstanceImpl
	 * @see montiarc.impl.MontiarcPackageImpl#getComponentInstance()
	 * @generated
	 */
	int COMPONENT_INSTANCE = 2;

	/**
	 * The feature id for the '<em><b>Instance Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE__INSTANCE_NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE__PORTS = 2;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE__PARENT = 3;

	/**
	 * The number of structural features of the '<em>Component Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Component Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link montiarc.impl.PortInstanceImpl <em>Port Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see montiarc.impl.PortInstanceImpl
	 * @see montiarc.impl.MontiarcPackageImpl#getPortInstance()
	 * @generated
	 */
	int PORT_INSTANCE = 3;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_INSTANCE__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_INSTANCE__PARENT = 1;

	/**
	 * The number of structural features of the '<em>Port Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_INSTANCE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Port Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_INSTANCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link montiarc.impl.ConnectorTypeImpl <em>Connector Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see montiarc.impl.ConnectorTypeImpl
	 * @see montiarc.impl.MontiarcPackageImpl#getConnectorType()
	 * @generated
	 */
	int CONNECTOR_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_TYPE__PARENT = 0;

	/**
	 * The number of structural features of the '<em>Connector Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Connector Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link montiarc.impl.IntermediateConnectorTypeImpl <em>Intermediate Connector Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see montiarc.impl.IntermediateConnectorTypeImpl
	 * @see montiarc.impl.MontiarcPackageImpl#getIntermediateConnectorType()
	 * @generated
	 */
	int INTERMEDIATE_CONNECTOR_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_CONNECTOR_TYPE__PARENT = CONNECTOR_TYPE__PARENT;

	/**
	 * The feature id for the '<em><b>Source Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_CONNECTOR_TYPE__SOURCE_PORT = CONNECTOR_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_CONNECTOR_TYPE__TARGET_PORT = CONNECTOR_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Intermediate Connector Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_CONNECTOR_TYPE_FEATURE_COUNT = CONNECTOR_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Intermediate Connector Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_CONNECTOR_TYPE_OPERATION_COUNT = CONNECTOR_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link montiarc.impl.IncomingConnectorTypeImpl <em>Incoming Connector Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see montiarc.impl.IncomingConnectorTypeImpl
	 * @see montiarc.impl.MontiarcPackageImpl#getIncomingConnectorType()
	 * @generated
	 */
	int INCOMING_CONNECTOR_TYPE = 6;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCOMING_CONNECTOR_TYPE__PARENT = CONNECTOR_TYPE__PARENT;

	/**
	 * The feature id for the '<em><b>Target Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCOMING_CONNECTOR_TYPE__TARGET_PORT = CONNECTOR_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source Port Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCOMING_CONNECTOR_TYPE__SOURCE_PORT_TYPE = CONNECTOR_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Incoming Connector Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCOMING_CONNECTOR_TYPE_FEATURE_COUNT = CONNECTOR_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Incoming Connector Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCOMING_CONNECTOR_TYPE_OPERATION_COUNT = CONNECTOR_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link montiarc.impl.OutgoingConnectorTypeImpl <em>Outgoing Connector Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see montiarc.impl.OutgoingConnectorTypeImpl
	 * @see montiarc.impl.MontiarcPackageImpl#getOutgoingConnectorType()
	 * @generated
	 */
	int OUTGOING_CONNECTOR_TYPE = 7;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTGOING_CONNECTOR_TYPE__PARENT = CONNECTOR_TYPE__PARENT;

	/**
	 * The feature id for the '<em><b>Source Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTGOING_CONNECTOR_TYPE__SOURCE_PORT = CONNECTOR_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target Port Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTGOING_CONNECTOR_TYPE__TARGET_PORT_TYPE = CONNECTOR_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Outgoing Connector Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTGOING_CONNECTOR_TYPE_FEATURE_COUNT = CONNECTOR_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Outgoing Connector Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTGOING_CONNECTOR_TYPE_OPERATION_COUNT = CONNECTOR_TYPE_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link montiarc.ComponentType <em>Component Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Type</em>'.
	 * @see montiarc.ComponentType
	 * @generated
	 */
	EClass getComponentType();

	/**
	 * Returns the meta object for the attribute '{@link montiarc.ComponentType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see montiarc.ComponentType#getName()
	 * @see #getComponentType()
	 * @generated
	 */
	EAttribute getComponentType_Name();

	/**
	 * Returns the meta object for the reference '{@link montiarc.ComponentType#getSuperComponentType <em>Super Component Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Super Component Type</em>'.
	 * @see montiarc.ComponentType#getSuperComponentType()
	 * @see #getComponentType()
	 * @generated
	 */
	EReference getComponentType_SuperComponentType();

	/**
	 * Returns the meta object for the containment reference list '{@link montiarc.ComponentType#getPorts <em>Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ports</em>'.
	 * @see montiarc.ComponentType#getPorts()
	 * @see #getComponentType()
	 * @generated
	 */
	EReference getComponentType_Ports();

	/**
	 * Returns the meta object for the containment reference list '{@link montiarc.ComponentType#getConnectors <em>Connectors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Connectors</em>'.
	 * @see montiarc.ComponentType#getConnectors()
	 * @see #getComponentType()
	 * @generated
	 */
	EReference getComponentType_Connectors();

	/**
	 * Returns the meta object for the containment reference list '{@link montiarc.ComponentType#getSubcomponents <em>Subcomponents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Subcomponents</em>'.
	 * @see montiarc.ComponentType#getSubcomponents()
	 * @see #getComponentType()
	 * @generated
	 */
	EReference getComponentType_Subcomponents();

	/**
	 * Returns the meta object for the attribute '{@link montiarc.ComponentType#getGroovyBehavior <em>Groovy Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Groovy Behavior</em>'.
	 * @see montiarc.ComponentType#getGroovyBehavior()
	 * @see #getComponentType()
	 * @generated
	 */
	EAttribute getComponentType_GroovyBehavior();

	/**
	 * Returns the meta object for class '{@link montiarc.PortType <em>Port Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port Type</em>'.
	 * @see montiarc.PortType
	 * @generated
	 */
	EClass getPortType();

	/**
	 * Returns the meta object for the attribute '{@link montiarc.PortType#isIsIncoming <em>Is Incoming</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Incoming</em>'.
	 * @see montiarc.PortType#isIsIncoming()
	 * @see #getPortType()
	 * @generated
	 */
	EAttribute getPortType_IsIncoming();

	/**
	 * Returns the meta object for the attribute '{@link montiarc.PortType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see montiarc.PortType#getName()
	 * @see #getPortType()
	 * @generated
	 */
	EAttribute getPortType_Name();

	/**
	 * Returns the meta object for the reference '{@link montiarc.PortType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see montiarc.PortType#getType()
	 * @see #getPortType()
	 * @generated
	 */
	EReference getPortType_Type();

	/**
	 * Returns the meta object for the container reference '{@link montiarc.PortType#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see montiarc.PortType#getParent()
	 * @see #getPortType()
	 * @generated
	 */
	EReference getPortType_Parent();

	/**
	 * Returns the meta object for class '{@link montiarc.ComponentInstance <em>Component Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Instance</em>'.
	 * @see montiarc.ComponentInstance
	 * @generated
	 */
	EClass getComponentInstance();

	/**
	 * Returns the meta object for the attribute '{@link montiarc.ComponentInstance#getInstanceName <em>Instance Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instance Name</em>'.
	 * @see montiarc.ComponentInstance#getInstanceName()
	 * @see #getComponentInstance()
	 * @generated
	 */
	EAttribute getComponentInstance_InstanceName();

	/**
	 * Returns the meta object for the reference '{@link montiarc.ComponentInstance#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see montiarc.ComponentInstance#getType()
	 * @see #getComponentInstance()
	 * @generated
	 */
	EReference getComponentInstance_Type();

	/**
	 * Returns the meta object for the containment reference list '{@link montiarc.ComponentInstance#getPorts <em>Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ports</em>'.
	 * @see montiarc.ComponentInstance#getPorts()
	 * @see #getComponentInstance()
	 * @generated
	 */
	EReference getComponentInstance_Ports();

	/**
	 * Returns the meta object for the container reference '{@link montiarc.ComponentInstance#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see montiarc.ComponentInstance#getParent()
	 * @see #getComponentInstance()
	 * @generated
	 */
	EReference getComponentInstance_Parent();

	/**
	 * Returns the meta object for class '{@link montiarc.PortInstance <em>Port Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port Instance</em>'.
	 * @see montiarc.PortInstance
	 * @generated
	 */
	EClass getPortInstance();

	/**
	 * Returns the meta object for the reference '{@link montiarc.PortInstance#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see montiarc.PortInstance#getType()
	 * @see #getPortInstance()
	 * @generated
	 */
	EReference getPortInstance_Type();

	/**
	 * Returns the meta object for the container reference '{@link montiarc.PortInstance#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see montiarc.PortInstance#getParent()
	 * @see #getPortInstance()
	 * @generated
	 */
	EReference getPortInstance_Parent();

	/**
	 * Returns the meta object for class '{@link montiarc.ConnectorType <em>Connector Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connector Type</em>'.
	 * @see montiarc.ConnectorType
	 * @generated
	 */
	EClass getConnectorType();

	/**
	 * Returns the meta object for the container reference '{@link montiarc.ConnectorType#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see montiarc.ConnectorType#getParent()
	 * @see #getConnectorType()
	 * @generated
	 */
	EReference getConnectorType_Parent();

	/**
	 * Returns the meta object for class '{@link montiarc.IntermediateConnectorType <em>Intermediate Connector Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Intermediate Connector Type</em>'.
	 * @see montiarc.IntermediateConnectorType
	 * @generated
	 */
	EClass getIntermediateConnectorType();

	/**
	 * Returns the meta object for the reference '{@link montiarc.IntermediateConnectorType#getSourcePort <em>Source Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source Port</em>'.
	 * @see montiarc.IntermediateConnectorType#getSourcePort()
	 * @see #getIntermediateConnectorType()
	 * @generated
	 */
	EReference getIntermediateConnectorType_SourcePort();

	/**
	 * Returns the meta object for the reference '{@link montiarc.IntermediateConnectorType#getTargetPort <em>Target Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Port</em>'.
	 * @see montiarc.IntermediateConnectorType#getTargetPort()
	 * @see #getIntermediateConnectorType()
	 * @generated
	 */
	EReference getIntermediateConnectorType_TargetPort();

	/**
	 * Returns the meta object for class '{@link montiarc.IncomingConnectorType <em>Incoming Connector Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Incoming Connector Type</em>'.
	 * @see montiarc.IncomingConnectorType
	 * @generated
	 */
	EClass getIncomingConnectorType();

	/**
	 * Returns the meta object for the reference '{@link montiarc.IncomingConnectorType#getTargetPort <em>Target Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Port</em>'.
	 * @see montiarc.IncomingConnectorType#getTargetPort()
	 * @see #getIncomingConnectorType()
	 * @generated
	 */
	EReference getIncomingConnectorType_TargetPort();

	/**
	 * Returns the meta object for the reference '{@link montiarc.IncomingConnectorType#getSourcePortType <em>Source Port Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source Port Type</em>'.
	 * @see montiarc.IncomingConnectorType#getSourcePortType()
	 * @see #getIncomingConnectorType()
	 * @generated
	 */
	EReference getIncomingConnectorType_SourcePortType();

	/**
	 * Returns the meta object for class '{@link montiarc.OutgoingConnectorType <em>Outgoing Connector Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Outgoing Connector Type</em>'.
	 * @see montiarc.OutgoingConnectorType
	 * @generated
	 */
	EClass getOutgoingConnectorType();

	/**
	 * Returns the meta object for the reference '{@link montiarc.OutgoingConnectorType#getSourcePort <em>Source Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source Port</em>'.
	 * @see montiarc.OutgoingConnectorType#getSourcePort()
	 * @see #getOutgoingConnectorType()
	 * @generated
	 */
	EReference getOutgoingConnectorType_SourcePort();

	/**
	 * Returns the meta object for the reference '{@link montiarc.OutgoingConnectorType#getTargetPortType <em>Target Port Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Port Type</em>'.
	 * @see montiarc.OutgoingConnectorType#getTargetPortType()
	 * @see #getOutgoingConnectorType()
	 * @generated
	 */
	EReference getOutgoingConnectorType_TargetPortType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MontiarcFactory getMontiarcFactory();

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
		 * The meta object literal for the '{@link montiarc.impl.ComponentTypeImpl <em>Component Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see montiarc.impl.ComponentTypeImpl
		 * @see montiarc.impl.MontiarcPackageImpl#getComponentType()
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
		 * The meta object literal for the '<em><b>Super Component Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_TYPE__SUPER_COMPONENT_TYPE = eINSTANCE.getComponentType_SuperComponentType();

		/**
		 * The meta object literal for the '<em><b>Ports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_TYPE__PORTS = eINSTANCE.getComponentType_Ports();

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
		 * The meta object literal for the '<em><b>Groovy Behavior</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT_TYPE__GROOVY_BEHAVIOR = eINSTANCE.getComponentType_GroovyBehavior();

		/**
		 * The meta object literal for the '{@link montiarc.impl.PortTypeImpl <em>Port Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see montiarc.impl.PortTypeImpl
		 * @see montiarc.impl.MontiarcPackageImpl#getPortType()
		 * @generated
		 */
		EClass PORT_TYPE = eINSTANCE.getPortType();

		/**
		 * The meta object literal for the '<em><b>Is Incoming</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT_TYPE__IS_INCOMING = eINSTANCE.getPortType_IsIncoming();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT_TYPE__NAME = eINSTANCE.getPortType_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT_TYPE__TYPE = eINSTANCE.getPortType_Type();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT_TYPE__PARENT = eINSTANCE.getPortType_Parent();

		/**
		 * The meta object literal for the '{@link montiarc.impl.ComponentInstanceImpl <em>Component Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see montiarc.impl.ComponentInstanceImpl
		 * @see montiarc.impl.MontiarcPackageImpl#getComponentInstance()
		 * @generated
		 */
		EClass COMPONENT_INSTANCE = eINSTANCE.getComponentInstance();

		/**
		 * The meta object literal for the '<em><b>Instance Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT_INSTANCE__INSTANCE_NAME = eINSTANCE.getComponentInstance_InstanceName();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_INSTANCE__TYPE = eINSTANCE.getComponentInstance_Type();

		/**
		 * The meta object literal for the '<em><b>Ports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_INSTANCE__PORTS = eINSTANCE.getComponentInstance_Ports();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_INSTANCE__PARENT = eINSTANCE.getComponentInstance_Parent();

		/**
		 * The meta object literal for the '{@link montiarc.impl.PortInstanceImpl <em>Port Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see montiarc.impl.PortInstanceImpl
		 * @see montiarc.impl.MontiarcPackageImpl#getPortInstance()
		 * @generated
		 */
		EClass PORT_INSTANCE = eINSTANCE.getPortInstance();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT_INSTANCE__TYPE = eINSTANCE.getPortInstance_Type();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT_INSTANCE__PARENT = eINSTANCE.getPortInstance_Parent();

		/**
		 * The meta object literal for the '{@link montiarc.impl.ConnectorTypeImpl <em>Connector Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see montiarc.impl.ConnectorTypeImpl
		 * @see montiarc.impl.MontiarcPackageImpl#getConnectorType()
		 * @generated
		 */
		EClass CONNECTOR_TYPE = eINSTANCE.getConnectorType();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTOR_TYPE__PARENT = eINSTANCE.getConnectorType_Parent();

		/**
		 * The meta object literal for the '{@link montiarc.impl.IntermediateConnectorTypeImpl <em>Intermediate Connector Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see montiarc.impl.IntermediateConnectorTypeImpl
		 * @see montiarc.impl.MontiarcPackageImpl#getIntermediateConnectorType()
		 * @generated
		 */
		EClass INTERMEDIATE_CONNECTOR_TYPE = eINSTANCE.getIntermediateConnectorType();

		/**
		 * The meta object literal for the '<em><b>Source Port</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERMEDIATE_CONNECTOR_TYPE__SOURCE_PORT = eINSTANCE.getIntermediateConnectorType_SourcePort();

		/**
		 * The meta object literal for the '<em><b>Target Port</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERMEDIATE_CONNECTOR_TYPE__TARGET_PORT = eINSTANCE.getIntermediateConnectorType_TargetPort();

		/**
		 * The meta object literal for the '{@link montiarc.impl.IncomingConnectorTypeImpl <em>Incoming Connector Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see montiarc.impl.IncomingConnectorTypeImpl
		 * @see montiarc.impl.MontiarcPackageImpl#getIncomingConnectorType()
		 * @generated
		 */
		EClass INCOMING_CONNECTOR_TYPE = eINSTANCE.getIncomingConnectorType();

		/**
		 * The meta object literal for the '<em><b>Target Port</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INCOMING_CONNECTOR_TYPE__TARGET_PORT = eINSTANCE.getIncomingConnectorType_TargetPort();

		/**
		 * The meta object literal for the '<em><b>Source Port Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INCOMING_CONNECTOR_TYPE__SOURCE_PORT_TYPE = eINSTANCE.getIncomingConnectorType_SourcePortType();

		/**
		 * The meta object literal for the '{@link montiarc.impl.OutgoingConnectorTypeImpl <em>Outgoing Connector Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see montiarc.impl.OutgoingConnectorTypeImpl
		 * @see montiarc.impl.MontiarcPackageImpl#getOutgoingConnectorType()
		 * @generated
		 */
		EClass OUTGOING_CONNECTOR_TYPE = eINSTANCE.getOutgoingConnectorType();

		/**
		 * The meta object literal for the '<em><b>Source Port</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUTGOING_CONNECTOR_TYPE__SOURCE_PORT = eINSTANCE.getOutgoingConnectorType_SourcePort();

		/**
		 * The meta object literal for the '<em><b>Target Port Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUTGOING_CONNECTOR_TYPE__TARGET_PORT_TYPE = eINSTANCE.getOutgoingConnectorType_TargetPortType();

	}

} //MontiarcPackage

/**
 */
package ur1.diverse.xmontiarc.xdsml.xmontiarcmt.xmontiarc;

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
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see ur1.diverse.xmontiarc.xdsml.xmontiarcmt.xmontiarc.XmontiarcFactory
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
	String eNS_URI = "http://ur1.diverse.xmontiarc.xdsml.xmontiarcmt/xmontiarc/";

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
	XmontiarcPackage eINSTANCE = ur1.diverse.xmontiarc.xdsml.xmontiarcmt.xmontiarc.impl.XmontiarcPackageImpl.init();

	/**
	 * The meta object id for the '{@link ur1.diverse.xmontiarc.xdsml.xmontiarcmt.xmontiarc.impl.ComponentTypeImpl <em>Component Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ur1.diverse.xmontiarc.xdsml.xmontiarcmt.xmontiarc.impl.ComponentTypeImpl
	 * @see ur1.diverse.xmontiarc.xdsml.xmontiarcmt.xmontiarc.impl.XmontiarcPackageImpl#getComponentType()
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
	 * The feature id for the '<em><b>Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_TYPE__PORTS = 1;

	/**
	 * The feature id for the '<em><b>Connectors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_TYPE__CONNECTORS = 2;

	/**
	 * The feature id for the '<em><b>Subcomponents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_TYPE__SUBCOMPONENTS = 3;

	/**
	 * The feature id for the '<em><b>Behavior</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_TYPE__BEHAVIOR = 4;

	/**
	 * The number of structural features of the '<em>Component Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_TYPE_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link ur1.diverse.xmontiarc.xdsml.xmontiarcmt.xmontiarc.impl.PortImpl <em>Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ur1.diverse.xmontiarc.xdsml.xmontiarcmt.xmontiarc.impl.PortImpl
	 * @see ur1.diverse.xmontiarc.xdsml.xmontiarcmt.xmontiarc.impl.XmontiarcPackageImpl#getPort()
	 * @generated
	 */
	int PORT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__INCOMING = 2;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__VALUE = 3;

	/**
	 * The number of structural features of the '<em>Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link ur1.diverse.xmontiarc.xdsml.xmontiarcmt.xmontiarc.impl.ConnectorImpl <em>Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ur1.diverse.xmontiarc.xdsml.xmontiarcmt.xmontiarc.impl.ConnectorImpl
	 * @see ur1.diverse.xmontiarc.xdsml.xmontiarcmt.xmontiarc.impl.XmontiarcPackageImpl#getConnector()
	 * @generated
	 */
	int CONNECTOR = 2;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__TARGET = 1;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__PARENT = 2;

	/**
	 * The number of structural features of the '<em>Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link ur1.diverse.xmontiarc.xdsml.xmontiarcmt.xmontiarc.impl.SubcomponentImpl <em>Subcomponent</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ur1.diverse.xmontiarc.xdsml.xmontiarcmt.xmontiarc.impl.SubcomponentImpl
	 * @see ur1.diverse.xmontiarc.xdsml.xmontiarcmt.xmontiarc.impl.XmontiarcPackageImpl#getSubcomponent()
	 * @generated
	 */
	int SUBCOMPONENT = 3;

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
	 * The feature id for the '<em><b>Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBCOMPONENT__PORTS = 2;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBCOMPONENT__PARENT = 3;

	/**
	 * The number of structural features of the '<em>Subcomponent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBCOMPONENT_FEATURE_COUNT = 4;


	/**
	 * Returns the meta object for class '{@link ur1.diverse.xmontiarc.xdsml.xmontiarcmt.xmontiarc.ComponentType <em>Component Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Type</em>'.
	 * @see ur1.diverse.xmontiarc.xdsml.xmontiarcmt.xmontiarc.ComponentType
	 * @generated
	 */
	EClass getComponentType();

	/**
	 * Returns the meta object for the attribute '{@link ur1.diverse.xmontiarc.xdsml.xmontiarcmt.xmontiarc.ComponentType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ur1.diverse.xmontiarc.xdsml.xmontiarcmt.xmontiarc.ComponentType#getName()
	 * @see #getComponentType()
	 * @generated
	 */
	EAttribute getComponentType_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link ur1.diverse.xmontiarc.xdsml.xmontiarcmt.xmontiarc.ComponentType#getPorts <em>Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ports</em>'.
	 * @see ur1.diverse.xmontiarc.xdsml.xmontiarcmt.xmontiarc.ComponentType#getPorts()
	 * @see #getComponentType()
	 * @generated
	 */
	EReference getComponentType_Ports();

	/**
	 * Returns the meta object for the containment reference list '{@link ur1.diverse.xmontiarc.xdsml.xmontiarcmt.xmontiarc.ComponentType#getConnectors <em>Connectors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Connectors</em>'.
	 * @see ur1.diverse.xmontiarc.xdsml.xmontiarcmt.xmontiarc.ComponentType#getConnectors()
	 * @see #getComponentType()
	 * @generated
	 */
	EReference getComponentType_Connectors();

	/**
	 * Returns the meta object for the containment reference list '{@link ur1.diverse.xmontiarc.xdsml.xmontiarcmt.xmontiarc.ComponentType#getSubcomponents <em>Subcomponents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Subcomponents</em>'.
	 * @see ur1.diverse.xmontiarc.xdsml.xmontiarcmt.xmontiarc.ComponentType#getSubcomponents()
	 * @see #getComponentType()
	 * @generated
	 */
	EReference getComponentType_Subcomponents();

	/**
	 * Returns the meta object for the attribute '{@link ur1.diverse.xmontiarc.xdsml.xmontiarcmt.xmontiarc.ComponentType#getBehavior <em>Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Behavior</em>'.
	 * @see ur1.diverse.xmontiarc.xdsml.xmontiarcmt.xmontiarc.ComponentType#getBehavior()
	 * @see #getComponentType()
	 * @generated
	 */
	EAttribute getComponentType_Behavior();

	/**
	 * Returns the meta object for class '{@link ur1.diverse.xmontiarc.xdsml.xmontiarcmt.xmontiarc.Port <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port</em>'.
	 * @see ur1.diverse.xmontiarc.xdsml.xmontiarcmt.xmontiarc.Port
	 * @generated
	 */
	EClass getPort();

	/**
	 * Returns the meta object for the attribute '{@link ur1.diverse.xmontiarc.xdsml.xmontiarcmt.xmontiarc.Port#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ur1.diverse.xmontiarc.xdsml.xmontiarcmt.xmontiarc.Port#getName()
	 * @see #getPort()
	 * @generated
	 */
	EAttribute getPort_Name();

	/**
	 * Returns the meta object for the attribute '{@link ur1.diverse.xmontiarc.xdsml.xmontiarcmt.xmontiarc.Port#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see ur1.diverse.xmontiarc.xdsml.xmontiarcmt.xmontiarc.Port#getType()
	 * @see #getPort()
	 * @generated
	 */
	EAttribute getPort_Type();

	/**
	 * Returns the meta object for the attribute '{@link ur1.diverse.xmontiarc.xdsml.xmontiarcmt.xmontiarc.Port#isIncoming <em>Incoming</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Incoming</em>'.
	 * @see ur1.diverse.xmontiarc.xdsml.xmontiarcmt.xmontiarc.Port#isIncoming()
	 * @see #getPort()
	 * @generated
	 */
	EAttribute getPort_Incoming();

	/**
	 * Returns the meta object for the attribute '{@link ur1.diverse.xmontiarc.xdsml.xmontiarcmt.xmontiarc.Port#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see ur1.diverse.xmontiarc.xdsml.xmontiarcmt.xmontiarc.Port#getValue()
	 * @see #getPort()
	 * @generated
	 */
	EAttribute getPort_Value();

	/**
	 * Returns the meta object for class '{@link ur1.diverse.xmontiarc.xdsml.xmontiarcmt.xmontiarc.Connector <em>Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connector</em>'.
	 * @see ur1.diverse.xmontiarc.xdsml.xmontiarcmt.xmontiarc.Connector
	 * @generated
	 */
	EClass getConnector();

	/**
	 * Returns the meta object for the reference '{@link ur1.diverse.xmontiarc.xdsml.xmontiarcmt.xmontiarc.Connector#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see ur1.diverse.xmontiarc.xdsml.xmontiarcmt.xmontiarc.Connector#getSource()
	 * @see #getConnector()
	 * @generated
	 */
	EReference getConnector_Source();

	/**
	 * Returns the meta object for the reference '{@link ur1.diverse.xmontiarc.xdsml.xmontiarcmt.xmontiarc.Connector#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see ur1.diverse.xmontiarc.xdsml.xmontiarcmt.xmontiarc.Connector#getTarget()
	 * @see #getConnector()
	 * @generated
	 */
	EReference getConnector_Target();

	/**
	 * Returns the meta object for the container reference '{@link ur1.diverse.xmontiarc.xdsml.xmontiarcmt.xmontiarc.Connector#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see ur1.diverse.xmontiarc.xdsml.xmontiarcmt.xmontiarc.Connector#getParent()
	 * @see #getConnector()
	 * @generated
	 */
	EReference getConnector_Parent();

	/**
	 * Returns the meta object for class '{@link ur1.diverse.xmontiarc.xdsml.xmontiarcmt.xmontiarc.Subcomponent <em>Subcomponent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Subcomponent</em>'.
	 * @see ur1.diverse.xmontiarc.xdsml.xmontiarcmt.xmontiarc.Subcomponent
	 * @generated
	 */
	EClass getSubcomponent();

	/**
	 * Returns the meta object for the attribute '{@link ur1.diverse.xmontiarc.xdsml.xmontiarcmt.xmontiarc.Subcomponent#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ur1.diverse.xmontiarc.xdsml.xmontiarcmt.xmontiarc.Subcomponent#getName()
	 * @see #getSubcomponent()
	 * @generated
	 */
	EAttribute getSubcomponent_Name();

	/**
	 * Returns the meta object for the reference '{@link ur1.diverse.xmontiarc.xdsml.xmontiarcmt.xmontiarc.Subcomponent#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see ur1.diverse.xmontiarc.xdsml.xmontiarcmt.xmontiarc.Subcomponent#getType()
	 * @see #getSubcomponent()
	 * @generated
	 */
	EReference getSubcomponent_Type();

	/**
	 * Returns the meta object for the containment reference list '{@link ur1.diverse.xmontiarc.xdsml.xmontiarcmt.xmontiarc.Subcomponent#getPorts <em>Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ports</em>'.
	 * @see ur1.diverse.xmontiarc.xdsml.xmontiarcmt.xmontiarc.Subcomponent#getPorts()
	 * @see #getSubcomponent()
	 * @generated
	 */
	EReference getSubcomponent_Ports();

	/**
	 * Returns the meta object for the container reference '{@link ur1.diverse.xmontiarc.xdsml.xmontiarcmt.xmontiarc.Subcomponent#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see ur1.diverse.xmontiarc.xdsml.xmontiarcmt.xmontiarc.Subcomponent#getParent()
	 * @see #getSubcomponent()
	 * @generated
	 */
	EReference getSubcomponent_Parent();

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
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link ur1.diverse.xmontiarc.xdsml.xmontiarcmt.xmontiarc.impl.ComponentTypeImpl <em>Component Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ur1.diverse.xmontiarc.xdsml.xmontiarcmt.xmontiarc.impl.ComponentTypeImpl
		 * @see ur1.diverse.xmontiarc.xdsml.xmontiarcmt.xmontiarc.impl.XmontiarcPackageImpl#getComponentType()
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
		 * The meta object literal for the '<em><b>Behavior</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT_TYPE__BEHAVIOR = eINSTANCE.getComponentType_Behavior();

		/**
		 * The meta object literal for the '{@link ur1.diverse.xmontiarc.xdsml.xmontiarcmt.xmontiarc.impl.PortImpl <em>Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ur1.diverse.xmontiarc.xdsml.xmontiarcmt.xmontiarc.impl.PortImpl
		 * @see ur1.diverse.xmontiarc.xdsml.xmontiarcmt.xmontiarc.impl.XmontiarcPackageImpl#getPort()
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
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT__TYPE = eINSTANCE.getPort_Type();

		/**
		 * The meta object literal for the '<em><b>Incoming</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT__INCOMING = eINSTANCE.getPort_Incoming();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT__VALUE = eINSTANCE.getPort_Value();

		/**
		 * The meta object literal for the '{@link ur1.diverse.xmontiarc.xdsml.xmontiarcmt.xmontiarc.impl.ConnectorImpl <em>Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ur1.diverse.xmontiarc.xdsml.xmontiarcmt.xmontiarc.impl.ConnectorImpl
		 * @see ur1.diverse.xmontiarc.xdsml.xmontiarcmt.xmontiarc.impl.XmontiarcPackageImpl#getConnector()
		 * @generated
		 */
		EClass CONNECTOR = eINSTANCE.getConnector();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTOR__SOURCE = eINSTANCE.getConnector_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTOR__TARGET = eINSTANCE.getConnector_Target();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTOR__PARENT = eINSTANCE.getConnector_Parent();

		/**
		 * The meta object literal for the '{@link ur1.diverse.xmontiarc.xdsml.xmontiarcmt.xmontiarc.impl.SubcomponentImpl <em>Subcomponent</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ur1.diverse.xmontiarc.xdsml.xmontiarcmt.xmontiarc.impl.SubcomponentImpl
		 * @see ur1.diverse.xmontiarc.xdsml.xmontiarcmt.xmontiarc.impl.XmontiarcPackageImpl#getSubcomponent()
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
		 * The meta object literal for the '<em><b>Ports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBCOMPONENT__PORTS = eINSTANCE.getSubcomponent_Ports();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBCOMPONENT__PARENT = eINSTANCE.getSubcomponent_Parent();

	}

} //XmontiarcPackage

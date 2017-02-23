/**
 */
package ur1.diverse.montiarc.xdsml.xmontiarcmt.montiarc;

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
 * @see ur1.diverse.montiarc.xdsml.xmontiarcmt.montiarc.MontiarcFactory
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
	String eNS_URI = "http://ur1.diverse.montiarc.xdsml.xmontiarcmt/montiarc/";

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
	MontiarcPackage eINSTANCE = ur1.diverse.montiarc.xdsml.xmontiarcmt.montiarc.impl.MontiarcPackageImpl.init();

	/**
	 * The meta object id for the '{@link ur1.diverse.montiarc.xdsml.xmontiarcmt.montiarc.impl.ComponentTypeImpl <em>Component Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ur1.diverse.montiarc.xdsml.xmontiarcmt.montiarc.impl.ComponentTypeImpl
	 * @see ur1.diverse.montiarc.xdsml.xmontiarcmt.montiarc.impl.MontiarcPackageImpl#getComponentType()
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
	 * The meta object id for the '{@link ur1.diverse.montiarc.xdsml.xmontiarcmt.montiarc.impl.PortImpl <em>Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ur1.diverse.montiarc.xdsml.xmontiarcmt.montiarc.impl.PortImpl
	 * @see ur1.diverse.montiarc.xdsml.xmontiarcmt.montiarc.impl.MontiarcPackageImpl#getPort()
	 * @generated
	 */
	int PORT = 1;

	/**
	 * The feature id for the '<em><b>Is Incoming</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__IS_INCOMING = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__NAME = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__TYPE = 2;

	/**
	 * The feature id for the '<em><b>Port Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__PORT_VALUE = 3;

	/**
	 * The number of structural features of the '<em>Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link ur1.diverse.montiarc.xdsml.xmontiarcmt.montiarc.impl.ConnectorImpl <em>Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ur1.diverse.montiarc.xdsml.xmontiarcmt.montiarc.impl.ConnectorImpl
	 * @see ur1.diverse.montiarc.xdsml.xmontiarcmt.montiarc.impl.MontiarcPackageImpl#getConnector()
	 * @generated
	 */
	int CONNECTOR = 2;

	/**
	 * The feature id for the '<em><b>Source Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__SOURCE_PORT = 0;

	/**
	 * The feature id for the '<em><b>Target Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__TARGET_PORT = 1;

	/**
	 * The feature id for the '<em><b>Source Subcomponent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__SOURCE_SUBCOMPONENT = 2;

	/**
	 * The feature id for the '<em><b>Target Subcomponent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__TARGET_SUBCOMPONENT = 3;

	/**
	 * The number of structural features of the '<em>Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link ur1.diverse.montiarc.xdsml.xmontiarcmt.montiarc.impl.SubcomponentDeclarationImpl <em>Subcomponent Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ur1.diverse.montiarc.xdsml.xmontiarcmt.montiarc.impl.SubcomponentDeclarationImpl
	 * @see ur1.diverse.montiarc.xdsml.xmontiarcmt.montiarc.impl.MontiarcPackageImpl#getSubcomponentDeclaration()
	 * @generated
	 */
	int SUBCOMPONENT_DECLARATION = 3;

	/**
	 * The feature id for the '<em><b>Instance Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBCOMPONENT_DECLARATION__INSTANCE_NAME = 0;

	/**
	 * The feature id for the '<em><b>Component Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBCOMPONENT_DECLARATION__COMPONENT_TYPE = 1;

	/**
	 * The number of structural features of the '<em>Subcomponent Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBCOMPONENT_DECLARATION_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link ur1.diverse.montiarc.xdsml.xmontiarcmt.montiarc.impl.PortValueImpl <em>Port Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ur1.diverse.montiarc.xdsml.xmontiarcmt.montiarc.impl.PortValueImpl
	 * @see ur1.diverse.montiarc.xdsml.xmontiarcmt.montiarc.impl.MontiarcPackageImpl#getPortValue()
	 * @generated
	 */
	int PORT_VALUE = 4;

	/**
	 * The number of structural features of the '<em>Port Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_VALUE_FEATURE_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link ur1.diverse.montiarc.xdsml.xmontiarcmt.montiarc.ComponentType <em>Component Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Type</em>'.
	 * @see ur1.diverse.montiarc.xdsml.xmontiarcmt.montiarc.ComponentType
	 * @generated
	 */
	EClass getComponentType();

	/**
	 * Returns the meta object for the attribute '{@link ur1.diverse.montiarc.xdsml.xmontiarcmt.montiarc.ComponentType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ur1.diverse.montiarc.xdsml.xmontiarcmt.montiarc.ComponentType#getName()
	 * @see #getComponentType()
	 * @generated
	 */
	EAttribute getComponentType_Name();

	/**
	 * Returns the meta object for the reference '{@link ur1.diverse.montiarc.xdsml.xmontiarcmt.montiarc.ComponentType#getSuperComponentType <em>Super Component Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Super Component Type</em>'.
	 * @see ur1.diverse.montiarc.xdsml.xmontiarcmt.montiarc.ComponentType#getSuperComponentType()
	 * @see #getComponentType()
	 * @generated
	 */
	EReference getComponentType_SuperComponentType();

	/**
	 * Returns the meta object for the containment reference list '{@link ur1.diverse.montiarc.xdsml.xmontiarcmt.montiarc.ComponentType#getPorts <em>Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ports</em>'.
	 * @see ur1.diverse.montiarc.xdsml.xmontiarcmt.montiarc.ComponentType#getPorts()
	 * @see #getComponentType()
	 * @generated
	 */
	EReference getComponentType_Ports();

	/**
	 * Returns the meta object for the containment reference list '{@link ur1.diverse.montiarc.xdsml.xmontiarcmt.montiarc.ComponentType#getConnectors <em>Connectors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Connectors</em>'.
	 * @see ur1.diverse.montiarc.xdsml.xmontiarcmt.montiarc.ComponentType#getConnectors()
	 * @see #getComponentType()
	 * @generated
	 */
	EReference getComponentType_Connectors();

	/**
	 * Returns the meta object for the containment reference list '{@link ur1.diverse.montiarc.xdsml.xmontiarcmt.montiarc.ComponentType#getSubcomponents <em>Subcomponents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Subcomponents</em>'.
	 * @see ur1.diverse.montiarc.xdsml.xmontiarcmt.montiarc.ComponentType#getSubcomponents()
	 * @see #getComponentType()
	 * @generated
	 */
	EReference getComponentType_Subcomponents();

	/**
	 * Returns the meta object for the attribute '{@link ur1.diverse.montiarc.xdsml.xmontiarcmt.montiarc.ComponentType#getGroovyBehavior <em>Groovy Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Groovy Behavior</em>'.
	 * @see ur1.diverse.montiarc.xdsml.xmontiarcmt.montiarc.ComponentType#getGroovyBehavior()
	 * @see #getComponentType()
	 * @generated
	 */
	EAttribute getComponentType_GroovyBehavior();

	/**
	 * Returns the meta object for class '{@link ur1.diverse.montiarc.xdsml.xmontiarcmt.montiarc.Port <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port</em>'.
	 * @see ur1.diverse.montiarc.xdsml.xmontiarcmt.montiarc.Port
	 * @generated
	 */
	EClass getPort();

	/**
	 * Returns the meta object for the attribute '{@link ur1.diverse.montiarc.xdsml.xmontiarcmt.montiarc.Port#isIsIncoming <em>Is Incoming</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Incoming</em>'.
	 * @see ur1.diverse.montiarc.xdsml.xmontiarcmt.montiarc.Port#isIsIncoming()
	 * @see #getPort()
	 * @generated
	 */
	EAttribute getPort_IsIncoming();

	/**
	 * Returns the meta object for the attribute '{@link ur1.diverse.montiarc.xdsml.xmontiarcmt.montiarc.Port#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ur1.diverse.montiarc.xdsml.xmontiarcmt.montiarc.Port#getName()
	 * @see #getPort()
	 * @generated
	 */
	EAttribute getPort_Name();

	/**
	 * Returns the meta object for the reference '{@link ur1.diverse.montiarc.xdsml.xmontiarcmt.montiarc.Port#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see ur1.diverse.montiarc.xdsml.xmontiarcmt.montiarc.Port#getType()
	 * @see #getPort()
	 * @generated
	 */
	EReference getPort_Type();

	/**
	 * Returns the meta object for the reference '{@link ur1.diverse.montiarc.xdsml.xmontiarcmt.montiarc.Port#getPortValue <em>Port Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Port Value</em>'.
	 * @see ur1.diverse.montiarc.xdsml.xmontiarcmt.montiarc.Port#getPortValue()
	 * @see #getPort()
	 * @generated
	 */
	EReference getPort_PortValue();

	/**
	 * Returns the meta object for class '{@link ur1.diverse.montiarc.xdsml.xmontiarcmt.montiarc.Connector <em>Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connector</em>'.
	 * @see ur1.diverse.montiarc.xdsml.xmontiarcmt.montiarc.Connector
	 * @generated
	 */
	EClass getConnector();

	/**
	 * Returns the meta object for the reference '{@link ur1.diverse.montiarc.xdsml.xmontiarcmt.montiarc.Connector#getSourcePort <em>Source Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source Port</em>'.
	 * @see ur1.diverse.montiarc.xdsml.xmontiarcmt.montiarc.Connector#getSourcePort()
	 * @see #getConnector()
	 * @generated
	 */
	EReference getConnector_SourcePort();

	/**
	 * Returns the meta object for the reference '{@link ur1.diverse.montiarc.xdsml.xmontiarcmt.montiarc.Connector#getTargetPort <em>Target Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Port</em>'.
	 * @see ur1.diverse.montiarc.xdsml.xmontiarcmt.montiarc.Connector#getTargetPort()
	 * @see #getConnector()
	 * @generated
	 */
	EReference getConnector_TargetPort();

	/**
	 * Returns the meta object for the reference '{@link ur1.diverse.montiarc.xdsml.xmontiarcmt.montiarc.Connector#getSourceSubcomponent <em>Source Subcomponent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source Subcomponent</em>'.
	 * @see ur1.diverse.montiarc.xdsml.xmontiarcmt.montiarc.Connector#getSourceSubcomponent()
	 * @see #getConnector()
	 * @generated
	 */
	EReference getConnector_SourceSubcomponent();

	/**
	 * Returns the meta object for the reference '{@link ur1.diverse.montiarc.xdsml.xmontiarcmt.montiarc.Connector#getTargetSubcomponent <em>Target Subcomponent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Subcomponent</em>'.
	 * @see ur1.diverse.montiarc.xdsml.xmontiarcmt.montiarc.Connector#getTargetSubcomponent()
	 * @see #getConnector()
	 * @generated
	 */
	EReference getConnector_TargetSubcomponent();

	/**
	 * Returns the meta object for class '{@link ur1.diverse.montiarc.xdsml.xmontiarcmt.montiarc.SubcomponentDeclaration <em>Subcomponent Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Subcomponent Declaration</em>'.
	 * @see ur1.diverse.montiarc.xdsml.xmontiarcmt.montiarc.SubcomponentDeclaration
	 * @generated
	 */
	EClass getSubcomponentDeclaration();

	/**
	 * Returns the meta object for the attribute '{@link ur1.diverse.montiarc.xdsml.xmontiarcmt.montiarc.SubcomponentDeclaration#getInstanceName <em>Instance Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instance Name</em>'.
	 * @see ur1.diverse.montiarc.xdsml.xmontiarcmt.montiarc.SubcomponentDeclaration#getInstanceName()
	 * @see #getSubcomponentDeclaration()
	 * @generated
	 */
	EAttribute getSubcomponentDeclaration_InstanceName();

	/**
	 * Returns the meta object for the reference '{@link ur1.diverse.montiarc.xdsml.xmontiarcmt.montiarc.SubcomponentDeclaration#getComponentType <em>Component Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Component Type</em>'.
	 * @see ur1.diverse.montiarc.xdsml.xmontiarcmt.montiarc.SubcomponentDeclaration#getComponentType()
	 * @see #getSubcomponentDeclaration()
	 * @generated
	 */
	EReference getSubcomponentDeclaration_ComponentType();

	/**
	 * Returns the meta object for class '{@link ur1.diverse.montiarc.xdsml.xmontiarcmt.montiarc.PortValue <em>Port Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port Value</em>'.
	 * @see ur1.diverse.montiarc.xdsml.xmontiarcmt.montiarc.PortValue
	 * @generated
	 */
	EClass getPortValue();

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
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link ur1.diverse.montiarc.xdsml.xmontiarcmt.montiarc.impl.ComponentTypeImpl <em>Component Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ur1.diverse.montiarc.xdsml.xmontiarcmt.montiarc.impl.ComponentTypeImpl
		 * @see ur1.diverse.montiarc.xdsml.xmontiarcmt.montiarc.impl.MontiarcPackageImpl#getComponentType()
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
		 * The meta object literal for the '{@link ur1.diverse.montiarc.xdsml.xmontiarcmt.montiarc.impl.PortImpl <em>Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ur1.diverse.montiarc.xdsml.xmontiarcmt.montiarc.impl.PortImpl
		 * @see ur1.diverse.montiarc.xdsml.xmontiarcmt.montiarc.impl.MontiarcPackageImpl#getPort()
		 * @generated
		 */
		EClass PORT = eINSTANCE.getPort();

		/**
		 * The meta object literal for the '<em><b>Is Incoming</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT__IS_INCOMING = eINSTANCE.getPort_IsIncoming();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT__NAME = eINSTANCE.getPort_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT__TYPE = eINSTANCE.getPort_Type();

		/**
		 * The meta object literal for the '<em><b>Port Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT__PORT_VALUE = eINSTANCE.getPort_PortValue();

		/**
		 * The meta object literal for the '{@link ur1.diverse.montiarc.xdsml.xmontiarcmt.montiarc.impl.ConnectorImpl <em>Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ur1.diverse.montiarc.xdsml.xmontiarcmt.montiarc.impl.ConnectorImpl
		 * @see ur1.diverse.montiarc.xdsml.xmontiarcmt.montiarc.impl.MontiarcPackageImpl#getConnector()
		 * @generated
		 */
		EClass CONNECTOR = eINSTANCE.getConnector();

		/**
		 * The meta object literal for the '<em><b>Source Port</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTOR__SOURCE_PORT = eINSTANCE.getConnector_SourcePort();

		/**
		 * The meta object literal for the '<em><b>Target Port</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTOR__TARGET_PORT = eINSTANCE.getConnector_TargetPort();

		/**
		 * The meta object literal for the '<em><b>Source Subcomponent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTOR__SOURCE_SUBCOMPONENT = eINSTANCE.getConnector_SourceSubcomponent();

		/**
		 * The meta object literal for the '<em><b>Target Subcomponent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTOR__TARGET_SUBCOMPONENT = eINSTANCE.getConnector_TargetSubcomponent();

		/**
		 * The meta object literal for the '{@link ur1.diverse.montiarc.xdsml.xmontiarcmt.montiarc.impl.SubcomponentDeclarationImpl <em>Subcomponent Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ur1.diverse.montiarc.xdsml.xmontiarcmt.montiarc.impl.SubcomponentDeclarationImpl
		 * @see ur1.diverse.montiarc.xdsml.xmontiarcmt.montiarc.impl.MontiarcPackageImpl#getSubcomponentDeclaration()
		 * @generated
		 */
		EClass SUBCOMPONENT_DECLARATION = eINSTANCE.getSubcomponentDeclaration();

		/**
		 * The meta object literal for the '<em><b>Instance Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBCOMPONENT_DECLARATION__INSTANCE_NAME = eINSTANCE.getSubcomponentDeclaration_InstanceName();

		/**
		 * The meta object literal for the '<em><b>Component Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBCOMPONENT_DECLARATION__COMPONENT_TYPE = eINSTANCE.getSubcomponentDeclaration_ComponentType();

		/**
		 * The meta object literal for the '{@link ur1.diverse.montiarc.xdsml.xmontiarcmt.montiarc.impl.PortValueImpl <em>Port Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ur1.diverse.montiarc.xdsml.xmontiarcmt.montiarc.impl.PortValueImpl
		 * @see ur1.diverse.montiarc.xdsml.xmontiarcmt.montiarc.impl.MontiarcPackageImpl#getPortValue()
		 * @generated
		 */
		EClass PORT_VALUE = eINSTANCE.getPortValue();

	}

} //MontiarcPackage

/**
 */
package montiarc.impl;

import cd.CdPackage;
import montiarc.Component;
import montiarc.ComponentType;
import montiarc.Connector;
import montiarc.MontiarcFactory;
import montiarc.MontiarcPackage;
import montiarc.Port;
import montiarc.PortType;
import montiarc.util.MontiarcValidator;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MontiarcPackageImpl extends EPackageImpl implements MontiarcPackage {
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
	private EClass portTypeEClass = null;

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
	private EClass connectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentEClass = null;

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
	 * @see montiarc.MontiarcPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private MontiarcPackageImpl() {
		super(eNS_URI, MontiarcFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link MontiarcPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static MontiarcPackage init() {
		if (isInited) return (MontiarcPackage)EPackage.Registry.INSTANCE.getEPackage(MontiarcPackage.eNS_URI);

		// Obtain or create and register package
		MontiarcPackageImpl theMontiarcPackage = (MontiarcPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof MontiarcPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new MontiarcPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		CdPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theMontiarcPackage.createPackageContents();

		// Initialize created meta-data
		theMontiarcPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theMontiarcPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return MontiarcValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theMontiarcPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(MontiarcPackage.eNS_URI, theMontiarcPackage);
		return theMontiarcPackage;
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
	public EReference getComponentType_SuperComponentType() {
		return (EReference)componentTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentType_Ports() {
		return (EReference)componentTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentType_Connectors() {
		return (EReference)componentTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentType_Subcomponents() {
		return (EReference)componentTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponentType_GroovyBehavior() {
		return (EAttribute)componentTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPortType() {
		return portTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPortType_IsIncoming() {
		return (EAttribute)portTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPortType_Name() {
		return (EAttribute)portTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPortType_Type() {
		return (EReference)portTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPortType_Parent() {
		return (EReference)portTypeEClass.getEStructuralFeatures().get(3);
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
	public EReference getPort_Type() {
		return (EReference)portEClass.getEStructuralFeatures().get(0);
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
	public EReference getConnector_SourcePort() {
		return (EReference)connectorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnector_TargetPort() {
		return (EReference)connectorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnector_SourceSubcomponent() {
		return (EReference)connectorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnector_TargetSubcomponent() {
		return (EReference)connectorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnector_Parent() {
		return (EReference)connectorEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComponent() {
		return componentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponent_InstanceName() {
		return (EAttribute)componentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponent_Type() {
		return (EReference)componentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponent_Ports() {
		return (EReference)componentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MontiarcFactory getMontiarcFactory() {
		return (MontiarcFactory)getEFactoryInstance();
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
		portEClass = createEClass(PORT);
		createEReference(portEClass, PORT__TYPE);

		componentTypeEClass = createEClass(COMPONENT_TYPE);
		createEAttribute(componentTypeEClass, COMPONENT_TYPE__NAME);
		createEReference(componentTypeEClass, COMPONENT_TYPE__SUPER_COMPONENT_TYPE);
		createEReference(componentTypeEClass, COMPONENT_TYPE__PORTS);
		createEReference(componentTypeEClass, COMPONENT_TYPE__CONNECTORS);
		createEReference(componentTypeEClass, COMPONENT_TYPE__SUBCOMPONENTS);
		createEAttribute(componentTypeEClass, COMPONENT_TYPE__GROOVY_BEHAVIOR);

		portTypeEClass = createEClass(PORT_TYPE);
		createEAttribute(portTypeEClass, PORT_TYPE__IS_INCOMING);
		createEAttribute(portTypeEClass, PORT_TYPE__NAME);
		createEReference(portTypeEClass, PORT_TYPE__TYPE);
		createEReference(portTypeEClass, PORT_TYPE__PARENT);

		connectorEClass = createEClass(CONNECTOR);
		createEReference(connectorEClass, CONNECTOR__SOURCE_PORT);
		createEReference(connectorEClass, CONNECTOR__TARGET_PORT);
		createEReference(connectorEClass, CONNECTOR__SOURCE_SUBCOMPONENT);
		createEReference(connectorEClass, CONNECTOR__TARGET_SUBCOMPONENT);
		createEReference(connectorEClass, CONNECTOR__PARENT);

		componentEClass = createEClass(COMPONENT);
		createEAttribute(componentEClass, COMPONENT__INSTANCE_NAME);
		createEReference(componentEClass, COMPONENT__TYPE);
		createEReference(componentEClass, COMPONENT__PORTS);
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

		// Obtain other dependent packages
		CdPackage theCdPackage = (CdPackage)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(portEClass, Port.class, "Port", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPort_Type(), this.getPortType(), null, "type", null, 1, 1, Port.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(componentTypeEClass, ComponentType.class, "ComponentType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getComponentType_Name(), ecorePackage.getEString(), "name", null, 1, 1, ComponentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponentType_SuperComponentType(), this.getComponentType(), null, "superComponentType", null, 0, 1, ComponentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponentType_Ports(), this.getPortType(), this.getPortType_Parent(), "ports", null, 0, -1, ComponentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponentType_Connectors(), this.getConnector(), this.getConnector_Parent(), "connectors", null, 0, -1, ComponentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponentType_Subcomponents(), this.getComponent(), null, "subcomponents", null, 0, -1, ComponentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponentType_GroovyBehavior(), ecorePackage.getEString(), "groovyBehavior", null, 0, 1, ComponentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(portTypeEClass, PortType.class, "PortType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPortType_IsIncoming(), ecorePackage.getEBoolean(), "isIncoming", null, 1, 1, PortType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPortType_Name(), ecorePackage.getEString(), "name", null, 1, 1, PortType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPortType_Type(), theCdPackage.getCDClass(), null, "type", null, 0, 1, PortType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPortType_Parent(), this.getComponentType(), this.getComponentType_Ports(), "parent", null, 1, 1, PortType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(connectorEClass, Connector.class, "Connector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConnector_SourcePort(), this.getPortType(), null, "sourcePort", null, 1, 1, Connector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnector_TargetPort(), this.getPortType(), null, "targetPort", null, 1, 1, Connector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnector_SourceSubcomponent(), this.getComponent(), null, "sourceSubcomponent", null, 1, 1, Connector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnector_TargetSubcomponent(), this.getComponent(), null, "targetSubcomponent", null, 1, 1, Connector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnector_Parent(), this.getComponentType(), this.getComponentType_Connectors(), "parent", null, 1, 1, Connector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(componentEClass, Component.class, "Component", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getComponent_InstanceName(), ecorePackage.getEString(), "instanceName", null, 1, 1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponent_Type(), this.getComponentType(), null, "type", null, 1, 1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponent_Ports(), this.getPort(), null, "ports", null, 0, -1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/OCL/Import
		createImportAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot
		createPivotAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/OCL/Import</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createImportAnnotations() {
		String source = "http://www.eclipse.org/OCL/Import";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "ur1.diverse.cd", "cd.ecore#/"
		   });
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
			 "constraints", "NameIsLeadingUpperCase ConnectorsDoNotCrossCutComponents"
		   });	
		addAnnotation
		  (portTypeEClass, 
		   source, 
		   new String[] {
			 "constraints", "NameIsLeadingUpperCase"
		   });	
		addAnnotation
		  (connectorEClass, 
		   source, 
		   new String[] {
			 "constraints", "ConnectsDifferentComponents ConnectsDifferentComponents PortTypeMatch"
		   });	
		addAnnotation
		  (componentEClass, 
		   source, 
		   new String[] {
			 "constraints", "NameIsLeadingUpperCase"
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
			 "NameIsLeadingUpperCase", "Tuple {\n\tmessage : String = \'The name of component type \"\' + name + \'\" must begin uppercase.\',\n\tstatus : Boolean = \n\t\t\tlet firstLetter: String = (name).substring(1, 1) \n\t\t\t\tin firstLetter.toUpperCase() = firstLetter\n}.status",
			 "ConnectorsDoNotCrossCutComponents", "\n\t\t\ttrue"
		   });	
		addAnnotation
		  (portTypeEClass, 
		   source, 
		   new String[] {
			 "NameIsLeadingUpperCase", "Tuple {\n\tmessage : String = \'The name of port \"\' + name + \'\" must begin lowercase.\',\n\tstatus : Boolean = let firstLetter : String =\n\t\t\t(name).substring(1, 1)\n\t\tin firstLetter.toLowerCase() = firstLetter\n}.status"
		   });	
		addAnnotation
		  (connectorEClass, 
		   source, 
		   new String[] {
			 "ConnectsDifferentComponents", "Tuple {\n\tmessage : String = \'The connector must connect two different subcomponents.\',\n\tstatus : Boolean = \n\t\t\tself.sourceSubcomponent <> self.targetSubcomponent\n}.status",
			 "PortTypeMatch", "Tuple {\n\tmessage : String = \'Both ports of a connector must have the same type\',\n\tstatus : Boolean = \n\t\t\tself.sourcePort.type = self.targetPort.type\n}.status"
		   });	
		addAnnotation
		  (componentEClass, 
		   source, 
		   new String[] {
			 "NameIsLeadingUpperCase", "Tuple {\n\tmessage : String = \'The name of instance name of subcomponent \"\' + instanceName +\n\t\t\t\'\" must begin lowercase.\',\n\tstatus : Boolean = let firstLetter : String = (instanceName).substring(1, 1)\n\t\tin firstLetter.toUpperCase() = firstLetter\n}.status"
		   });
	}

} //MontiarcPackageImpl

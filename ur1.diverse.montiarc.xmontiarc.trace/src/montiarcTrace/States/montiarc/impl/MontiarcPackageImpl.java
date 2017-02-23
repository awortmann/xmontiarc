/**
 */
package montiarcTrace.States.montiarc.impl;

import fr.inria.diverse.trace.commons.model.trace.TracePackage;

import montiarcTrace.MontiarcTracePackage;

import montiarcTrace.States.StatesPackage;

import montiarcTrace.States.impl.StatesPackageImpl;

import montiarcTrace.States.montiarc.MontiarcFactory;
import montiarcTrace.States.montiarc.MontiarcPackage;
import montiarcTrace.States.montiarc.TracedPort;
import montiarcTrace.States.montiarc.TracedPortValue;

import montiarcTrace.Steps.StepsPackage;

import montiarcTrace.Steps.impl.StepsPackageImpl;

import montiarcTrace.impl.MontiarcTracePackageImpl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import ur1.diverse.montiarc.xdsml.xmontiarc.cd.CdPackage;

import ur1.diverse.montiarc.xdsml.xmontiarc.montiarcruntime.MontiarcruntimePackage;

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
	private EClass tracedPortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedPortValueEClass = null;

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
	 * @see montiarcTrace.States.montiarc.MontiarcPackage#eNS_URI
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
		TracePackage.eINSTANCE.eClass();
		ur1.diverse.montiarc.xdsml.xmontiarc.montiarc.MontiarcPackage.eINSTANCE.eClass();
		CdPackage.eINSTANCE.eClass();
		MontiarcruntimePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		MontiarcTracePackageImpl theMontiarcTracePackage = (MontiarcTracePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MontiarcTracePackage.eNS_URI) instanceof MontiarcTracePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MontiarcTracePackage.eNS_URI) : MontiarcTracePackage.eINSTANCE);
		StepsPackageImpl theStepsPackage = (StepsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI) instanceof StepsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI) : StepsPackage.eINSTANCE);
		StatesPackageImpl theStatesPackage = (StatesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StatesPackage.eNS_URI) instanceof StatesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StatesPackage.eNS_URI) : StatesPackage.eINSTANCE);

		// Create package meta-data objects
		theMontiarcPackage.createPackageContents();
		theMontiarcTracePackage.createPackageContents();
		theStepsPackage.createPackageContents();
		theStatesPackage.createPackageContents();

		// Initialize created meta-data
		theMontiarcPackage.initializePackageContents();
		theMontiarcTracePackage.initializePackageContents();
		theStepsPackage.initializePackageContents();
		theStatesPackage.initializePackageContents();

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
	public EClass getTracedPort() {
		return tracedPortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedPort_OriginalObject() {
		return (EReference)tracedPortEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedPort_PortValueSequence() {
		return (EReference)tracedPortEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedPortValue() {
		return tracedPortValueEClass;
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
		tracedPortEClass = createEClass(TRACED_PORT);
		createEReference(tracedPortEClass, TRACED_PORT__ORIGINAL_OBJECT);
		createEReference(tracedPortEClass, TRACED_PORT__PORT_VALUE_SEQUENCE);

		tracedPortValueEClass = createEClass(TRACED_PORT_VALUE);
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
		ur1.diverse.montiarc.xdsml.xmontiarc.montiarc.MontiarcPackage theMontiarcPackage_1 = (ur1.diverse.montiarc.xdsml.xmontiarc.montiarc.MontiarcPackage)EPackage.Registry.INSTANCE.getEPackage(ur1.diverse.montiarc.xdsml.xmontiarc.montiarc.MontiarcPackage.eNS_URI);
		StatesPackage theStatesPackage = (StatesPackage)EPackage.Registry.INSTANCE.getEPackage(StatesPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(tracedPortEClass, TracedPort.class, "TracedPort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTracedPort_OriginalObject(), theMontiarcPackage_1.getPort(), null, "originalObject", null, 0, 1, TracedPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTracedPort_PortValueSequence(), theStatesPackage.getPort_portValue_Value(), theStatesPackage.getPort_portValue_Value_Parent(), "portValueSequence", null, 0, -1, TracedPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tracedPortValueEClass, TracedPortValue.class, "TracedPortValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
	}

} //MontiarcPackageImpl

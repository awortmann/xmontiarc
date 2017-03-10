/**
 */
package montiarcTrace.Steps.impl;

import fr.inria.diverse.trace.commons.model.trace.TracePackage;

import montiarcTrace.MontiarcTracePackage;

import montiarcTrace.States.StatesPackage;

import montiarcTrace.States.impl.StatesPackageImpl;

import montiarcTrace.States.montiarc.impl.MontiarcPackageImpl;

import montiarcTrace.Steps.Montiarc_ComponentType_Compute;
import montiarcTrace.Steps.Montiarc_ComponentType_Compute_AbstractSubStep;
import montiarcTrace.Steps.Montiarc_ComponentType_Compute_ImplicitStep;
import montiarcTrace.Steps.Montiarc_ComponentType_Update;
import montiarcTrace.Steps.RootImplicitStep;
import montiarcTrace.Steps.SpecificStep;
import montiarcTrace.Steps.StepsFactory;
import montiarcTrace.Steps.StepsPackage;

import montiarcTrace.impl.MontiarcTracePackageImpl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import ur1.diverse.montiarc.xdsml.xmontiarc.cd.CdPackage;

import ur1.diverse.montiarc.xdsml.xmontiarc.montiarc.MontiarcPackage;

import ur1.diverse.montiarc.xdsml.xmontiarc.montiarcruntime.MontiarcruntimePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class StepsPackageImpl extends EPackageImpl implements StepsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass montiarc_ComponentType_ComputeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass montiarc_ComponentType_Compute_AbstractSubStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass montiarc_ComponentType_Compute_ImplicitStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass montiarc_ComponentType_UpdateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rootImplicitStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass specificStepEClass = null;

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
	 * @see montiarcTrace.Steps.StepsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private StepsPackageImpl() {
		super(eNS_URI, StepsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link StepsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static StepsPackage init() {
		if (isInited) return (StepsPackage)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI);

		// Obtain or create and register package
		StepsPackageImpl theStepsPackage = (StepsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof StepsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new StepsPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		TracePackage.eINSTANCE.eClass();
		MontiarcPackage.eINSTANCE.eClass();
		CdPackage.eINSTANCE.eClass();
		MontiarcruntimePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		MontiarcTracePackageImpl theMontiarcTracePackage = (MontiarcTracePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MontiarcTracePackage.eNS_URI) instanceof MontiarcTracePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MontiarcTracePackage.eNS_URI) : MontiarcTracePackage.eINSTANCE);
		StatesPackageImpl theStatesPackage = (StatesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StatesPackage.eNS_URI) instanceof StatesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StatesPackage.eNS_URI) : StatesPackage.eINSTANCE);
		MontiarcPackageImpl theMontiarcPackage_1 = (MontiarcPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(montiarcTrace.States.montiarc.MontiarcPackage.eNS_URI) instanceof MontiarcPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(montiarcTrace.States.montiarc.MontiarcPackage.eNS_URI) : montiarcTrace.States.montiarc.MontiarcPackage.eINSTANCE);

		// Create package meta-data objects
		theStepsPackage.createPackageContents();
		theMontiarcTracePackage.createPackageContents();
		theStatesPackage.createPackageContents();
		theMontiarcPackage_1.createPackageContents();

		// Initialize created meta-data
		theStepsPackage.initializePackageContents();
		theMontiarcTracePackage.initializePackageContents();
		theStatesPackage.initializePackageContents();
		theMontiarcPackage_1.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theStepsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(StepsPackage.eNS_URI, theStepsPackage);
		return theStepsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMontiarc_ComponentType_Compute() {
		return montiarc_ComponentType_ComputeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMontiarc_ComponentType_Compute_AbstractSubStep() {
		return montiarc_ComponentType_Compute_AbstractSubStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMontiarc_ComponentType_Compute_ImplicitStep() {
		return montiarc_ComponentType_Compute_ImplicitStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMontiarc_ComponentType_Update() {
		return montiarc_ComponentType_UpdateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRootImplicitStep() {
		return rootImplicitStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSpecificStep() {
		return specificStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificStep_EndingState() {
		return (EReference)specificStepEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificStep_StartingState() {
		return (EReference)specificStepEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StepsFactory getStepsFactory() {
		return (StepsFactory)getEFactoryInstance();
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
		montiarc_ComponentType_ComputeEClass = createEClass(MONTIARC_COMPONENT_TYPE_COMPUTE);

		montiarc_ComponentType_Compute_AbstractSubStepEClass = createEClass(MONTIARC_COMPONENT_TYPE_COMPUTE_ABSTRACT_SUB_STEP);

		montiarc_ComponentType_Compute_ImplicitStepEClass = createEClass(MONTIARC_COMPONENT_TYPE_COMPUTE_IMPLICIT_STEP);

		montiarc_ComponentType_UpdateEClass = createEClass(MONTIARC_COMPONENT_TYPE_UPDATE);

		rootImplicitStepEClass = createEClass(ROOT_IMPLICIT_STEP);

		specificStepEClass = createEClass(SPECIFIC_STEP);
		createEReference(specificStepEClass, SPECIFIC_STEP__ENDING_STATE);
		createEReference(specificStepEClass, SPECIFIC_STEP__STARTING_STATE);
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
		TracePackage theTracePackage = (TracePackage)EPackage.Registry.INSTANCE.getEPackage(TracePackage.eNS_URI);
		MontiarcPackage theMontiarcPackage = (MontiarcPackage)EPackage.Registry.INSTANCE.getEPackage(MontiarcPackage.eNS_URI);
		StatesPackage theStatesPackage = (StatesPackage)EPackage.Registry.INSTANCE.getEPackage(StatesPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		EGenericType g1 = createEGenericType(this.getSpecificStep());
		montiarc_ComponentType_ComputeEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theTracePackage.getSequentialStep());
		EGenericType g2 = createEGenericType(this.getMontiarc_ComponentType_Compute_AbstractSubStep());
		g1.getETypeArguments().add(g2);
		montiarc_ComponentType_ComputeEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getMontiarc_ComponentType_Compute_AbstractSubStep());
		montiarc_ComponentType_ComputeEClass.getEGenericSuperTypes().add(g1);
		montiarc_ComponentType_Compute_AbstractSubStepEClass.getESuperTypes().add(this.getSpecificStep());
		montiarc_ComponentType_Compute_ImplicitStepEClass.getESuperTypes().add(this.getMontiarc_ComponentType_Compute_AbstractSubStep());
		montiarc_ComponentType_Compute_ImplicitStepEClass.getESuperTypes().add(theTracePackage.getSmallStep());
		montiarc_ComponentType_UpdateEClass.getESuperTypes().add(this.getSpecificStep());
		montiarc_ComponentType_UpdateEClass.getESuperTypes().add(theTracePackage.getSmallStep());
		rootImplicitStepEClass.getESuperTypes().add(theTracePackage.getSmallStep());
		specificStepEClass.getESuperTypes().add(theTracePackage.getStep());

		// Initialize classes and features; add operations and parameters
		initEClass(montiarc_ComponentType_ComputeEClass, Montiarc_ComponentType_Compute.class, "Montiarc_ComponentType_Compute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(montiarc_ComponentType_ComputeEClass, theMontiarcPackage.getComponentType(), "getCaller", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(montiarc_ComponentType_Compute_AbstractSubStepEClass, Montiarc_ComponentType_Compute_AbstractSubStep.class, "Montiarc_ComponentType_Compute_AbstractSubStep", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(montiarc_ComponentType_Compute_ImplicitStepEClass, Montiarc_ComponentType_Compute_ImplicitStep.class, "Montiarc_ComponentType_Compute_ImplicitStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(montiarc_ComponentType_UpdateEClass, Montiarc_ComponentType_Update.class, "Montiarc_ComponentType_Update", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(montiarc_ComponentType_UpdateEClass, theMontiarcPackage.getComponentType(), "getCaller", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(rootImplicitStepEClass, RootImplicitStep.class, "RootImplicitStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(specificStepEClass, SpecificStep.class, "SpecificStep", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSpecificStep_EndingState(), theStatesPackage.getState(), theStatesPackage.getState_EndedSteps(), "endingState", null, 0, 1, SpecificStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSpecificStep_StartingState(), theStatesPackage.getState(), theStatesPackage.getState_StartedSteps(), "startingState", null, 1, 1, SpecificStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //StepsPackageImpl

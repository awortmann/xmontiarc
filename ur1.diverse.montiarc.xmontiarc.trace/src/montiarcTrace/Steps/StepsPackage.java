/**
 */
package montiarcTrace.Steps;

import fr.inria.diverse.trace.commons.model.trace.TracePackage;

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
 * @see montiarcTrace.Steps.StepsFactory
 * @model kind="package"
 * @generated
 */
public interface StepsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Steps";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "montiarcTrace_Steps";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "events";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	StepsPackage eINSTANCE = montiarcTrace.Steps.impl.StepsPackageImpl.init();

	/**
	 * The meta object id for the '{@link montiarcTrace.Steps.SpecificStep <em>Specific Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see montiarcTrace.Steps.SpecificStep
	 * @see montiarcTrace.Steps.impl.StepsPackageImpl#getSpecificStep()
	 * @generated
	 */
	int SPECIFIC_STEP = 5;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_STEP__MSEOCCURRENCE = TracePackage.STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_STEP__ENDING_STATE = TracePackage.STEP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_STEP__STARTING_STATE = TracePackage.STEP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Specific Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_STEP_FEATURE_COUNT = TracePackage.STEP_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link montiarcTrace.Steps.impl.Montiarc_ComponentType_ComputeImpl <em>Montiarc Component Type Compute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see montiarcTrace.Steps.impl.Montiarc_ComponentType_ComputeImpl
	 * @see montiarcTrace.Steps.impl.StepsPackageImpl#getMontiarc_ComponentType_Compute()
	 * @generated
	 */
	int MONTIARC_COMPONENT_TYPE_COMPUTE = 0;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONTIARC_COMPONENT_TYPE_COMPUTE__MSEOCCURRENCE = SPECIFIC_STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONTIARC_COMPONENT_TYPE_COMPUTE__ENDING_STATE = SPECIFIC_STEP__ENDING_STATE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONTIARC_COMPONENT_TYPE_COMPUTE__STARTING_STATE = SPECIFIC_STEP__STARTING_STATE;

	/**
	 * The feature id for the '<em><b>Sub Steps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONTIARC_COMPONENT_TYPE_COMPUTE__SUB_STEPS = SPECIFIC_STEP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Montiarc Component Type Compute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONTIARC_COMPONENT_TYPE_COMPUTE_FEATURE_COUNT = SPECIFIC_STEP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link montiarcTrace.Steps.Montiarc_ComponentType_Compute_AbstractSubStep <em>Montiarc Component Type Compute Abstract Sub Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see montiarcTrace.Steps.Montiarc_ComponentType_Compute_AbstractSubStep
	 * @see montiarcTrace.Steps.impl.StepsPackageImpl#getMontiarc_ComponentType_Compute_AbstractSubStep()
	 * @generated
	 */
	int MONTIARC_COMPONENT_TYPE_COMPUTE_ABSTRACT_SUB_STEP = 1;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONTIARC_COMPONENT_TYPE_COMPUTE_ABSTRACT_SUB_STEP__MSEOCCURRENCE = SPECIFIC_STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONTIARC_COMPONENT_TYPE_COMPUTE_ABSTRACT_SUB_STEP__ENDING_STATE = SPECIFIC_STEP__ENDING_STATE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONTIARC_COMPONENT_TYPE_COMPUTE_ABSTRACT_SUB_STEP__STARTING_STATE = SPECIFIC_STEP__STARTING_STATE;

	/**
	 * The number of structural features of the '<em>Montiarc Component Type Compute Abstract Sub Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONTIARC_COMPONENT_TYPE_COMPUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT = SPECIFIC_STEP_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link montiarcTrace.Steps.impl.Montiarc_ComponentType_Compute_ImplicitStepImpl <em>Montiarc Component Type Compute Implicit Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see montiarcTrace.Steps.impl.Montiarc_ComponentType_Compute_ImplicitStepImpl
	 * @see montiarcTrace.Steps.impl.StepsPackageImpl#getMontiarc_ComponentType_Compute_ImplicitStep()
	 * @generated
	 */
	int MONTIARC_COMPONENT_TYPE_COMPUTE_IMPLICIT_STEP = 2;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONTIARC_COMPONENT_TYPE_COMPUTE_IMPLICIT_STEP__MSEOCCURRENCE = MONTIARC_COMPONENT_TYPE_COMPUTE_ABSTRACT_SUB_STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONTIARC_COMPONENT_TYPE_COMPUTE_IMPLICIT_STEP__ENDING_STATE = MONTIARC_COMPONENT_TYPE_COMPUTE_ABSTRACT_SUB_STEP__ENDING_STATE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONTIARC_COMPONENT_TYPE_COMPUTE_IMPLICIT_STEP__STARTING_STATE = MONTIARC_COMPONENT_TYPE_COMPUTE_ABSTRACT_SUB_STEP__STARTING_STATE;

	/**
	 * The number of structural features of the '<em>Montiarc Component Type Compute Implicit Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONTIARC_COMPONENT_TYPE_COMPUTE_IMPLICIT_STEP_FEATURE_COUNT = MONTIARC_COMPONENT_TYPE_COMPUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link montiarcTrace.Steps.impl.Montiarc_ComponentType_UpdateImpl <em>Montiarc Component Type Update</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see montiarcTrace.Steps.impl.Montiarc_ComponentType_UpdateImpl
	 * @see montiarcTrace.Steps.impl.StepsPackageImpl#getMontiarc_ComponentType_Update()
	 * @generated
	 */
	int MONTIARC_COMPONENT_TYPE_UPDATE = 3;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONTIARC_COMPONENT_TYPE_UPDATE__MSEOCCURRENCE = SPECIFIC_STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONTIARC_COMPONENT_TYPE_UPDATE__ENDING_STATE = SPECIFIC_STEP__ENDING_STATE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONTIARC_COMPONENT_TYPE_UPDATE__STARTING_STATE = SPECIFIC_STEP__STARTING_STATE;

	/**
	 * The number of structural features of the '<em>Montiarc Component Type Update</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONTIARC_COMPONENT_TYPE_UPDATE_FEATURE_COUNT = SPECIFIC_STEP_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link montiarcTrace.Steps.impl.RootImplicitStepImpl <em>Root Implicit Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see montiarcTrace.Steps.impl.RootImplicitStepImpl
	 * @see montiarcTrace.Steps.impl.StepsPackageImpl#getRootImplicitStep()
	 * @generated
	 */
	int ROOT_IMPLICIT_STEP = 4;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_IMPLICIT_STEP__MSEOCCURRENCE = TracePackage.SMALL_STEP__MSEOCCURRENCE;

	/**
	 * The number of structural features of the '<em>Root Implicit Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_IMPLICIT_STEP_FEATURE_COUNT = TracePackage.SMALL_STEP_FEATURE_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link montiarcTrace.Steps.Montiarc_ComponentType_Compute <em>Montiarc Component Type Compute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Montiarc Component Type Compute</em>'.
	 * @see montiarcTrace.Steps.Montiarc_ComponentType_Compute
	 * @generated
	 */
	EClass getMontiarc_ComponentType_Compute();

	/**
	 * Returns the meta object for class '{@link montiarcTrace.Steps.Montiarc_ComponentType_Compute_AbstractSubStep <em>Montiarc Component Type Compute Abstract Sub Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Montiarc Component Type Compute Abstract Sub Step</em>'.
	 * @see montiarcTrace.Steps.Montiarc_ComponentType_Compute_AbstractSubStep
	 * @generated
	 */
	EClass getMontiarc_ComponentType_Compute_AbstractSubStep();

	/**
	 * Returns the meta object for class '{@link montiarcTrace.Steps.Montiarc_ComponentType_Compute_ImplicitStep <em>Montiarc Component Type Compute Implicit Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Montiarc Component Type Compute Implicit Step</em>'.
	 * @see montiarcTrace.Steps.Montiarc_ComponentType_Compute_ImplicitStep
	 * @generated
	 */
	EClass getMontiarc_ComponentType_Compute_ImplicitStep();

	/**
	 * Returns the meta object for class '{@link montiarcTrace.Steps.Montiarc_ComponentType_Update <em>Montiarc Component Type Update</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Montiarc Component Type Update</em>'.
	 * @see montiarcTrace.Steps.Montiarc_ComponentType_Update
	 * @generated
	 */
	EClass getMontiarc_ComponentType_Update();

	/**
	 * Returns the meta object for class '{@link montiarcTrace.Steps.RootImplicitStep <em>Root Implicit Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root Implicit Step</em>'.
	 * @see montiarcTrace.Steps.RootImplicitStep
	 * @generated
	 */
	EClass getRootImplicitStep();

	/**
	 * Returns the meta object for class '{@link montiarcTrace.Steps.SpecificStep <em>Specific Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Specific Step</em>'.
	 * @see montiarcTrace.Steps.SpecificStep
	 * @generated
	 */
	EClass getSpecificStep();

	/**
	 * Returns the meta object for the reference '{@link montiarcTrace.Steps.SpecificStep#getEndingState <em>Ending State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ending State</em>'.
	 * @see montiarcTrace.Steps.SpecificStep#getEndingState()
	 * @see #getSpecificStep()
	 * @generated
	 */
	EReference getSpecificStep_EndingState();

	/**
	 * Returns the meta object for the reference '{@link montiarcTrace.Steps.SpecificStep#getStartingState <em>Starting State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Starting State</em>'.
	 * @see montiarcTrace.Steps.SpecificStep#getStartingState()
	 * @see #getSpecificStep()
	 * @generated
	 */
	EReference getSpecificStep_StartingState();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	StepsFactory getStepsFactory();

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
		 * The meta object literal for the '{@link montiarcTrace.Steps.impl.Montiarc_ComponentType_ComputeImpl <em>Montiarc Component Type Compute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see montiarcTrace.Steps.impl.Montiarc_ComponentType_ComputeImpl
		 * @see montiarcTrace.Steps.impl.StepsPackageImpl#getMontiarc_ComponentType_Compute()
		 * @generated
		 */
		EClass MONTIARC_COMPONENT_TYPE_COMPUTE = eINSTANCE.getMontiarc_ComponentType_Compute();

		/**
		 * The meta object literal for the '{@link montiarcTrace.Steps.Montiarc_ComponentType_Compute_AbstractSubStep <em>Montiarc Component Type Compute Abstract Sub Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see montiarcTrace.Steps.Montiarc_ComponentType_Compute_AbstractSubStep
		 * @see montiarcTrace.Steps.impl.StepsPackageImpl#getMontiarc_ComponentType_Compute_AbstractSubStep()
		 * @generated
		 */
		EClass MONTIARC_COMPONENT_TYPE_COMPUTE_ABSTRACT_SUB_STEP = eINSTANCE.getMontiarc_ComponentType_Compute_AbstractSubStep();

		/**
		 * The meta object literal for the '{@link montiarcTrace.Steps.impl.Montiarc_ComponentType_Compute_ImplicitStepImpl <em>Montiarc Component Type Compute Implicit Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see montiarcTrace.Steps.impl.Montiarc_ComponentType_Compute_ImplicitStepImpl
		 * @see montiarcTrace.Steps.impl.StepsPackageImpl#getMontiarc_ComponentType_Compute_ImplicitStep()
		 * @generated
		 */
		EClass MONTIARC_COMPONENT_TYPE_COMPUTE_IMPLICIT_STEP = eINSTANCE.getMontiarc_ComponentType_Compute_ImplicitStep();

		/**
		 * The meta object literal for the '{@link montiarcTrace.Steps.impl.Montiarc_ComponentType_UpdateImpl <em>Montiarc Component Type Update</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see montiarcTrace.Steps.impl.Montiarc_ComponentType_UpdateImpl
		 * @see montiarcTrace.Steps.impl.StepsPackageImpl#getMontiarc_ComponentType_Update()
		 * @generated
		 */
		EClass MONTIARC_COMPONENT_TYPE_UPDATE = eINSTANCE.getMontiarc_ComponentType_Update();

		/**
		 * The meta object literal for the '{@link montiarcTrace.Steps.impl.RootImplicitStepImpl <em>Root Implicit Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see montiarcTrace.Steps.impl.RootImplicitStepImpl
		 * @see montiarcTrace.Steps.impl.StepsPackageImpl#getRootImplicitStep()
		 * @generated
		 */
		EClass ROOT_IMPLICIT_STEP = eINSTANCE.getRootImplicitStep();

		/**
		 * The meta object literal for the '{@link montiarcTrace.Steps.SpecificStep <em>Specific Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see montiarcTrace.Steps.SpecificStep
		 * @see montiarcTrace.Steps.impl.StepsPackageImpl#getSpecificStep()
		 * @generated
		 */
		EClass SPECIFIC_STEP = eINSTANCE.getSpecificStep();

		/**
		 * The meta object literal for the '<em><b>Ending State</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_STEP__ENDING_STATE = eINSTANCE.getSpecificStep_EndingState();

		/**
		 * The meta object literal for the '<em><b>Starting State</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_STEP__STARTING_STATE = eINSTANCE.getSpecificStep_StartingState();

	}

} //StepsPackage

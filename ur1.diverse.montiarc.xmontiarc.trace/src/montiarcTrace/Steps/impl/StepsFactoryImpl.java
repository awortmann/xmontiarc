/**
 */
package montiarcTrace.Steps.impl;

import montiarcTrace.Steps.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class StepsFactoryImpl extends EFactoryImpl implements StepsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static StepsFactory init() {
		try {
			StepsFactory theStepsFactory = (StepsFactory)EPackage.Registry.INSTANCE.getEFactory(StepsPackage.eNS_URI);
			if (theStepsFactory != null) {
				return theStepsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new StepsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StepsFactoryImpl() {
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
			case StepsPackage.MONTIARC_COMPONENT_TYPE_COMPUTE: return createMontiarc_ComponentType_Compute();
			case StepsPackage.MONTIARC_COMPONENT_TYPE_COMPUTE_IMPLICIT_STEP: return createMontiarc_ComponentType_Compute_ImplicitStep();
			case StepsPackage.MONTIARC_COMPONENT_TYPE_UPDATE: return createMontiarc_ComponentType_Update();
			case StepsPackage.ROOT_IMPLICIT_STEP: return createRootImplicitStep();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Montiarc_ComponentType_Compute createMontiarc_ComponentType_Compute() {
		Montiarc_ComponentType_ComputeImpl montiarc_ComponentType_Compute = new Montiarc_ComponentType_ComputeImpl();
		return montiarc_ComponentType_Compute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Montiarc_ComponentType_Compute_ImplicitStep createMontiarc_ComponentType_Compute_ImplicitStep() {
		Montiarc_ComponentType_Compute_ImplicitStepImpl montiarc_ComponentType_Compute_ImplicitStep = new Montiarc_ComponentType_Compute_ImplicitStepImpl();
		return montiarc_ComponentType_Compute_ImplicitStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Montiarc_ComponentType_Update createMontiarc_ComponentType_Update() {
		Montiarc_ComponentType_UpdateImpl montiarc_ComponentType_Update = new Montiarc_ComponentType_UpdateImpl();
		return montiarc_ComponentType_Update;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RootImplicitStep createRootImplicitStep() {
		RootImplicitStepImpl rootImplicitStep = new RootImplicitStepImpl();
		return rootImplicitStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StepsPackage getStepsPackage() {
		return (StepsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static StepsPackage getPackage() {
		return StepsPackage.eINSTANCE;
	}

} //StepsFactoryImpl

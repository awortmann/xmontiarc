/**
 */
package ur1.diverse.montiarc.xdsml.xmontiarcmt.montiarcruntime.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import ur1.diverse.montiarc.xdsml.xmontiarcmt.cd.CdPackage;

import ur1.diverse.montiarc.xdsml.xmontiarcmt.cd.impl.CdPackageImpl;

import ur1.diverse.montiarc.xdsml.xmontiarcmt.montiarc.MontiarcPackage;

import ur1.diverse.montiarc.xdsml.xmontiarcmt.montiarc.impl.MontiarcPackageImpl;

import ur1.diverse.montiarc.xdsml.xmontiarcmt.montiarcruntime.MontiarcruntimeFactory;
import ur1.diverse.montiarc.xdsml.xmontiarcmt.montiarcruntime.MontiarcruntimePackage;
import ur1.diverse.montiarc.xdsml.xmontiarcmt.montiarcruntime.PortValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MontiarcruntimePackageImpl extends EPackageImpl implements MontiarcruntimePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass portValueEClass = null;

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
	 * @see ur1.diverse.montiarc.xdsml.xmontiarcmt.montiarcruntime.MontiarcruntimePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private MontiarcruntimePackageImpl() {
		super(eNS_URI, MontiarcruntimeFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link MontiarcruntimePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static MontiarcruntimePackage init() {
		if (isInited) return (MontiarcruntimePackage)EPackage.Registry.INSTANCE.getEPackage(MontiarcruntimePackage.eNS_URI);

		// Obtain or create and register package
		MontiarcruntimePackageImpl theMontiarcruntimePackage = (MontiarcruntimePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof MontiarcruntimePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new MontiarcruntimePackageImpl());

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		CdPackageImpl theCdPackage = (CdPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI) instanceof CdPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI) : CdPackage.eINSTANCE);
		MontiarcPackageImpl theMontiarcPackage = (MontiarcPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MontiarcPackage.eNS_URI) instanceof MontiarcPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MontiarcPackage.eNS_URI) : MontiarcPackage.eINSTANCE);

		// Create package meta-data objects
		theMontiarcruntimePackage.createPackageContents();
		theCdPackage.createPackageContents();
		theMontiarcPackage.createPackageContents();

		// Initialize created meta-data
		theMontiarcruntimePackage.initializePackageContents();
		theCdPackage.initializePackageContents();
		theMontiarcPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theMontiarcruntimePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(MontiarcruntimePackage.eNS_URI, theMontiarcruntimePackage);
		return theMontiarcruntimePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPortValue() {
		return portValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPortValue_Value() {
		return (EAttribute)portValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPortValue_Type() {
		return (EReference)portValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MontiarcruntimeFactory getMontiarcruntimeFactory() {
		return (MontiarcruntimeFactory)getEFactoryInstance();
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
		portValueEClass = createEClass(PORT_VALUE);
		createEAttribute(portValueEClass, PORT_VALUE__VALUE);
		createEReference(portValueEClass, PORT_VALUE__TYPE);
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

		// Initialize classes and features; add operations and parameters
		initEClass(portValueEClass, PortValue.class, "PortValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPortValue_Value(), ecorePackage.getEJavaObject(), "value", null, 1, 1, PortValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPortValue_Type(), theCdPackage.getCDClass(), null, "type", null, 1, 1, PortValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //MontiarcruntimePackageImpl

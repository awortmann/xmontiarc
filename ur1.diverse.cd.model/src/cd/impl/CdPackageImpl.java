/**
 */
package cd.impl;

import cd.CDAttribute;
import cd.CDClass;
import cd.CDConstant;
import cd.CDEnumeration;
import cd.CdFactory;
import cd.CdPackage;
import cd.ClassDiagram;

import cd.util.CdValidator;
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
public class CdPackageImpl extends EPackageImpl implements CdPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cdClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cdAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classDiagramEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cdEnumerationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cdConstantEClass = null;

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
	 * @see cd.CdPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CdPackageImpl() {
		super(eNS_URI, CdFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link CdPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CdPackage init() {
		if (isInited) return (CdPackage)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI);

		// Obtain or create and register package
		CdPackageImpl theCdPackage = (CdPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof CdPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new CdPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theCdPackage.createPackageContents();

		// Initialize created meta-data
		theCdPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theCdPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return CdValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theCdPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CdPackage.eNS_URI, theCdPackage);
		return theCdPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCDClass() {
		return cdClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCDClass_Name() {
		return (EAttribute)cdClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCDClass_Attributes() {
		return (EReference)cdClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCDClass_SuperType() {
		return (EReference)cdClassEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCDAttribute() {
		return cdAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCDAttribute_Name() {
		return (EAttribute)cdAttributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCDAttribute_Type() {
		return (EReference)cdAttributeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClassDiagram() {
		return classDiagramEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassDiagram_Classes() {
		return (EReference)classDiagramEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCDEnumeration() {
		return cdEnumerationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCDEnumeration_Constants() {
		return (EReference)cdEnumerationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCDConstant() {
		return cdConstantEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCDConstant_Name() {
		return (EAttribute)cdConstantEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCDConstant_Value() {
		return (EAttribute)cdConstantEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCDConstant_Classes() {
		return (EReference)cdConstantEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CdFactory getCdFactory() {
		return (CdFactory)getEFactoryInstance();
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
		cdClassEClass = createEClass(CD_CLASS);
		createEAttribute(cdClassEClass, CD_CLASS__NAME);
		createEReference(cdClassEClass, CD_CLASS__ATTRIBUTES);
		createEReference(cdClassEClass, CD_CLASS__SUPER_TYPE);

		cdAttributeEClass = createEClass(CD_ATTRIBUTE);
		createEAttribute(cdAttributeEClass, CD_ATTRIBUTE__NAME);
		createEReference(cdAttributeEClass, CD_ATTRIBUTE__TYPE);

		classDiagramEClass = createEClass(CLASS_DIAGRAM);
		createEReference(classDiagramEClass, CLASS_DIAGRAM__CLASSES);

		cdEnumerationEClass = createEClass(CD_ENUMERATION);
		createEReference(cdEnumerationEClass, CD_ENUMERATION__CONSTANTS);

		cdConstantEClass = createEClass(CD_CONSTANT);
		createEAttribute(cdConstantEClass, CD_CONSTANT__NAME);
		createEAttribute(cdConstantEClass, CD_CONSTANT__VALUE);
		createEReference(cdConstantEClass, CD_CONSTANT__CLASSES);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		cdEnumerationEClass.getESuperTypes().add(this.getCDClass());

		// Initialize classes, features, and operations; add parameters
		initEClass(cdClassEClass, CDClass.class, "CDClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCDClass_Name(), ecorePackage.getEString(), "name", null, 0, 1, CDClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCDClass_Attributes(), this.getCDAttribute(), null, "attributes", null, 0, -1, CDClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCDClass_SuperType(), this.getCDClass(), null, "superType", null, 0, 1, CDClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cdAttributeEClass, CDAttribute.class, "CDAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCDAttribute_Name(), ecorePackage.getEString(), "name", null, 0, 1, CDAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCDAttribute_Type(), this.getCDClass(), null, "type", null, 1, 1, CDAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(classDiagramEClass, ClassDiagram.class, "ClassDiagram", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getClassDiagram_Classes(), this.getCDClass(), null, "classes", null, 1, -1, ClassDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cdEnumerationEClass, CDEnumeration.class, "CDEnumeration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCDEnumeration_Constants(), this.getCDConstant(), null, "constants", null, 0, -1, CDEnumeration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cdConstantEClass, CDConstant.class, "CDConstant", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCDConstant_Name(), ecorePackage.getEString(), "name", null, 0, 1, CDConstant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCDConstant_Value(), ecorePackage.getEInt(), "value", null, 0, 1, CDConstant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCDConstant_Classes(), this.getCDClass(), null, "classes", null, 1, -1, CDConstant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
			 "ecore", "http://www.eclipse.org/emf/2002/Ecore"
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
		  (cdClassEClass, 
		   source, 
		   new String[] {
			 "constraints", "NameIsLeadingUpperCase"
		   });	
		addAnnotation
		  (cdAttributeEClass, 
		   source, 
		   new String[] {
			 "constraints", "NameIsLeadingUpperCase"
		   });	
		addAnnotation
		  (cdConstantEClass, 
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
		  (cdClassEClass, 
		   source, 
		   new String[] {
			 "NameIsLeadingUpperCase", "Tuple {\n\tmessage : String = \'The name of class \"\' + name + \'\" must begin uppercase.\',\n\tstatus : Boolean = \n\t\t\tlet firstLetter: String = (name).substring(1,1)\n\t\t\t\tin firstLetter.toUpperCase() = firstLetter\n}.status"
		   });	
		addAnnotation
		  (cdAttributeEClass, 
		   source, 
		   new String[] {
			 "NameIsLeadingUpperCase", "Tuple {\n\tmessage : String = \'The name of class \"\' + name + \'\" must begin lowercase.\',\n\tstatus : Boolean = \n\t\t\tlet firstLetter: String = (name).substring(1,1)\n\t\t\t\tin firstLetter.toLowerCase() = firstLetter\n}.status"
		   });	
		addAnnotation
		  (cdConstantEClass, 
		   source, 
		   new String[] {
			 "NameIsLeadingUpperCase", "Tuple {\n\tmessage : String = \'The name of constant \"\' + name + \'\" must be all uppercase.\',\n\tstatus : Boolean = \n\t\t\tname.toUpperCase() = name\n}.status"
		   });
	}

} //CdPackageImpl

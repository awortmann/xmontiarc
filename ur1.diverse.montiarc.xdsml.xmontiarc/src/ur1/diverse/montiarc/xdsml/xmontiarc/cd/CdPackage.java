/**
 */
package ur1.diverse.montiarc.xdsml.xmontiarc.cd;

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
 * @see ur1.diverse.montiarc.xdsml.xmontiarc.cd.CdFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/OCL/Import ecore='http://www.eclipse.org/emf/2002/Ecore'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot'"
 * @generated
 */
public interface CdPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "cd";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://ur1.diverse.montiarc.xdsml.xmontiarc/cd/";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ur1.diverse.cd";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CdPackage eINSTANCE = ur1.diverse.montiarc.xdsml.xmontiarc.cd.impl.CdPackageImpl.init();

	/**
	 * The meta object id for the '{@link ur1.diverse.montiarc.xdsml.xmontiarc.cd.impl.CDClassImpl <em>CD Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ur1.diverse.montiarc.xdsml.xmontiarc.cd.impl.CDClassImpl
	 * @see ur1.diverse.montiarc.xdsml.xmontiarc.cd.impl.CdPackageImpl#getCDClass()
	 * @generated
	 */
	int CD_CLASS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CD_CLASS__NAME = 0;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CD_CLASS__ATTRIBUTES = 1;

	/**
	 * The feature id for the '<em><b>Super Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CD_CLASS__SUPER_TYPE = 2;

	/**
	 * The number of structural features of the '<em>CD Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CD_CLASS_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link ur1.diverse.montiarc.xdsml.xmontiarc.cd.impl.CDAttributeImpl <em>CD Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ur1.diverse.montiarc.xdsml.xmontiarc.cd.impl.CDAttributeImpl
	 * @see ur1.diverse.montiarc.xdsml.xmontiarc.cd.impl.CdPackageImpl#getCDAttribute()
	 * @generated
	 */
	int CD_ATTRIBUTE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CD_ATTRIBUTE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CD_ATTRIBUTE__TYPE = 1;

	/**
	 * The number of structural features of the '<em>CD Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CD_ATTRIBUTE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link ur1.diverse.montiarc.xdsml.xmontiarc.cd.impl.ClassDiagramImpl <em>Class Diagram</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ur1.diverse.montiarc.xdsml.xmontiarc.cd.impl.ClassDiagramImpl
	 * @see ur1.diverse.montiarc.xdsml.xmontiarc.cd.impl.CdPackageImpl#getClassDiagram()
	 * @generated
	 */
	int CLASS_DIAGRAM = 2;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_DIAGRAM__CLASSES = 0;

	/**
	 * The number of structural features of the '<em>Class Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_DIAGRAM_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link ur1.diverse.montiarc.xdsml.xmontiarc.cd.impl.CDEnumerationImpl <em>CD Enumeration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ur1.diverse.montiarc.xdsml.xmontiarc.cd.impl.CDEnumerationImpl
	 * @see ur1.diverse.montiarc.xdsml.xmontiarc.cd.impl.CdPackageImpl#getCDEnumeration()
	 * @generated
	 */
	int CD_ENUMERATION = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CD_ENUMERATION__NAME = CD_CLASS__NAME;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CD_ENUMERATION__ATTRIBUTES = CD_CLASS__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Super Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CD_ENUMERATION__SUPER_TYPE = CD_CLASS__SUPER_TYPE;

	/**
	 * The feature id for the '<em><b>Constants</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CD_ENUMERATION__CONSTANTS = CD_CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>CD Enumeration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CD_ENUMERATION_FEATURE_COUNT = CD_CLASS_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link ur1.diverse.montiarc.xdsml.xmontiarc.cd.impl.CDConstantImpl <em>CD Constant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ur1.diverse.montiarc.xdsml.xmontiarc.cd.impl.CDConstantImpl
	 * @see ur1.diverse.montiarc.xdsml.xmontiarc.cd.impl.CdPackageImpl#getCDConstant()
	 * @generated
	 */
	int CD_CONSTANT = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CD_CONSTANT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CD_CONSTANT__VALUE = 1;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CD_CONSTANT__CLASSES = 2;

	/**
	 * The number of structural features of the '<em>CD Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CD_CONSTANT_FEATURE_COUNT = 3;


	/**
	 * Returns the meta object for class '{@link ur1.diverse.montiarc.xdsml.xmontiarc.cd.CDClass <em>CD Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CD Class</em>'.
	 * @see ur1.diverse.montiarc.xdsml.xmontiarc.cd.CDClass
	 * @generated
	 */
	EClass getCDClass();

	/**
	 * Returns the meta object for the attribute '{@link ur1.diverse.montiarc.xdsml.xmontiarc.cd.CDClass#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ur1.diverse.montiarc.xdsml.xmontiarc.cd.CDClass#getName()
	 * @see #getCDClass()
	 * @generated
	 */
	EAttribute getCDClass_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link ur1.diverse.montiarc.xdsml.xmontiarc.cd.CDClass#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attributes</em>'.
	 * @see ur1.diverse.montiarc.xdsml.xmontiarc.cd.CDClass#getAttributes()
	 * @see #getCDClass()
	 * @generated
	 */
	EReference getCDClass_Attributes();

	/**
	 * Returns the meta object for the reference '{@link ur1.diverse.montiarc.xdsml.xmontiarc.cd.CDClass#getSuperType <em>Super Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Super Type</em>'.
	 * @see ur1.diverse.montiarc.xdsml.xmontiarc.cd.CDClass#getSuperType()
	 * @see #getCDClass()
	 * @generated
	 */
	EReference getCDClass_SuperType();

	/**
	 * Returns the meta object for class '{@link ur1.diverse.montiarc.xdsml.xmontiarc.cd.CDAttribute <em>CD Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CD Attribute</em>'.
	 * @see ur1.diverse.montiarc.xdsml.xmontiarc.cd.CDAttribute
	 * @generated
	 */
	EClass getCDAttribute();

	/**
	 * Returns the meta object for the attribute '{@link ur1.diverse.montiarc.xdsml.xmontiarc.cd.CDAttribute#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ur1.diverse.montiarc.xdsml.xmontiarc.cd.CDAttribute#getName()
	 * @see #getCDAttribute()
	 * @generated
	 */
	EAttribute getCDAttribute_Name();

	/**
	 * Returns the meta object for the reference '{@link ur1.diverse.montiarc.xdsml.xmontiarc.cd.CDAttribute#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see ur1.diverse.montiarc.xdsml.xmontiarc.cd.CDAttribute#getType()
	 * @see #getCDAttribute()
	 * @generated
	 */
	EReference getCDAttribute_Type();

	/**
	 * Returns the meta object for class '{@link ur1.diverse.montiarc.xdsml.xmontiarc.cd.ClassDiagram <em>Class Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class Diagram</em>'.
	 * @see ur1.diverse.montiarc.xdsml.xmontiarc.cd.ClassDiagram
	 * @generated
	 */
	EClass getClassDiagram();

	/**
	 * Returns the meta object for the containment reference list '{@link ur1.diverse.montiarc.xdsml.xmontiarc.cd.ClassDiagram#getClasses <em>Classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Classes</em>'.
	 * @see ur1.diverse.montiarc.xdsml.xmontiarc.cd.ClassDiagram#getClasses()
	 * @see #getClassDiagram()
	 * @generated
	 */
	EReference getClassDiagram_Classes();

	/**
	 * Returns the meta object for class '{@link ur1.diverse.montiarc.xdsml.xmontiarc.cd.CDEnumeration <em>CD Enumeration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CD Enumeration</em>'.
	 * @see ur1.diverse.montiarc.xdsml.xmontiarc.cd.CDEnumeration
	 * @generated
	 */
	EClass getCDEnumeration();

	/**
	 * Returns the meta object for the containment reference list '{@link ur1.diverse.montiarc.xdsml.xmontiarc.cd.CDEnumeration#getConstants <em>Constants</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Constants</em>'.
	 * @see ur1.diverse.montiarc.xdsml.xmontiarc.cd.CDEnumeration#getConstants()
	 * @see #getCDEnumeration()
	 * @generated
	 */
	EReference getCDEnumeration_Constants();

	/**
	 * Returns the meta object for class '{@link ur1.diverse.montiarc.xdsml.xmontiarc.cd.CDConstant <em>CD Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CD Constant</em>'.
	 * @see ur1.diverse.montiarc.xdsml.xmontiarc.cd.CDConstant
	 * @generated
	 */
	EClass getCDConstant();

	/**
	 * Returns the meta object for the attribute '{@link ur1.diverse.montiarc.xdsml.xmontiarc.cd.CDConstant#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ur1.diverse.montiarc.xdsml.xmontiarc.cd.CDConstant#getName()
	 * @see #getCDConstant()
	 * @generated
	 */
	EAttribute getCDConstant_Name();

	/**
	 * Returns the meta object for the attribute '{@link ur1.diverse.montiarc.xdsml.xmontiarc.cd.CDConstant#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see ur1.diverse.montiarc.xdsml.xmontiarc.cd.CDConstant#getValue()
	 * @see #getCDConstant()
	 * @generated
	 */
	EAttribute getCDConstant_Value();

	/**
	 * Returns the meta object for the containment reference list '{@link ur1.diverse.montiarc.xdsml.xmontiarc.cd.CDConstant#getClasses <em>Classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Classes</em>'.
	 * @see ur1.diverse.montiarc.xdsml.xmontiarc.cd.CDConstant#getClasses()
	 * @see #getCDConstant()
	 * @generated
	 */
	EReference getCDConstant_Classes();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CdFactory getCdFactory();

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
		 * The meta object literal for the '{@link ur1.diverse.montiarc.xdsml.xmontiarc.cd.impl.CDClassImpl <em>CD Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ur1.diverse.montiarc.xdsml.xmontiarc.cd.impl.CDClassImpl
		 * @see ur1.diverse.montiarc.xdsml.xmontiarc.cd.impl.CdPackageImpl#getCDClass()
		 * @generated
		 */
		EClass CD_CLASS = eINSTANCE.getCDClass();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CD_CLASS__NAME = eINSTANCE.getCDClass_Name();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CD_CLASS__ATTRIBUTES = eINSTANCE.getCDClass_Attributes();

		/**
		 * The meta object literal for the '<em><b>Super Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CD_CLASS__SUPER_TYPE = eINSTANCE.getCDClass_SuperType();

		/**
		 * The meta object literal for the '{@link ur1.diverse.montiarc.xdsml.xmontiarc.cd.impl.CDAttributeImpl <em>CD Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ur1.diverse.montiarc.xdsml.xmontiarc.cd.impl.CDAttributeImpl
		 * @see ur1.diverse.montiarc.xdsml.xmontiarc.cd.impl.CdPackageImpl#getCDAttribute()
		 * @generated
		 */
		EClass CD_ATTRIBUTE = eINSTANCE.getCDAttribute();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CD_ATTRIBUTE__NAME = eINSTANCE.getCDAttribute_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CD_ATTRIBUTE__TYPE = eINSTANCE.getCDAttribute_Type();

		/**
		 * The meta object literal for the '{@link ur1.diverse.montiarc.xdsml.xmontiarc.cd.impl.ClassDiagramImpl <em>Class Diagram</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ur1.diverse.montiarc.xdsml.xmontiarc.cd.impl.ClassDiagramImpl
		 * @see ur1.diverse.montiarc.xdsml.xmontiarc.cd.impl.CdPackageImpl#getClassDiagram()
		 * @generated
		 */
		EClass CLASS_DIAGRAM = eINSTANCE.getClassDiagram();

		/**
		 * The meta object literal for the '<em><b>Classes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS_DIAGRAM__CLASSES = eINSTANCE.getClassDiagram_Classes();

		/**
		 * The meta object literal for the '{@link ur1.diverse.montiarc.xdsml.xmontiarc.cd.impl.CDEnumerationImpl <em>CD Enumeration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ur1.diverse.montiarc.xdsml.xmontiarc.cd.impl.CDEnumerationImpl
		 * @see ur1.diverse.montiarc.xdsml.xmontiarc.cd.impl.CdPackageImpl#getCDEnumeration()
		 * @generated
		 */
		EClass CD_ENUMERATION = eINSTANCE.getCDEnumeration();

		/**
		 * The meta object literal for the '<em><b>Constants</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CD_ENUMERATION__CONSTANTS = eINSTANCE.getCDEnumeration_Constants();

		/**
		 * The meta object literal for the '{@link ur1.diverse.montiarc.xdsml.xmontiarc.cd.impl.CDConstantImpl <em>CD Constant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ur1.diverse.montiarc.xdsml.xmontiarc.cd.impl.CDConstantImpl
		 * @see ur1.diverse.montiarc.xdsml.xmontiarc.cd.impl.CdPackageImpl#getCDConstant()
		 * @generated
		 */
		EClass CD_CONSTANT = eINSTANCE.getCDConstant();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CD_CONSTANT__NAME = eINSTANCE.getCDConstant_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CD_CONSTANT__VALUE = eINSTANCE.getCDConstant_Value();

		/**
		 * The meta object literal for the '<em><b>Classes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CD_CONSTANT__CLASSES = eINSTANCE.getCDConstant_Classes();

	}

} //CdPackage

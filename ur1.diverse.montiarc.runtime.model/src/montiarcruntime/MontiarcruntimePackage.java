/**
 */
package montiarcruntime;

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
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see montiarcruntime.MontiarcruntimeFactory
 * @model kind="package"
 * @generated
 */
public interface MontiarcruntimePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "montiarcruntime";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/montiarcruntime";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "montiarcruntime";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MontiarcruntimePackage eINSTANCE = montiarcruntime.impl.MontiarcruntimePackageImpl.init();

	/**
	 * The meta object id for the '{@link montiarcruntime.impl.PortValueImpl <em>Port Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see montiarcruntime.impl.PortValueImpl
	 * @see montiarcruntime.impl.MontiarcruntimePackageImpl#getPortValue()
	 * @generated
	 */
	int PORT_VALUE = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_VALUE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_VALUE__TYPE = 1;

	/**
	 * The number of structural features of the '<em>Port Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_VALUE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Port Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_VALUE_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link montiarcruntime.PortValue <em>Port Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port Value</em>'.
	 * @see montiarcruntime.PortValue
	 * @generated
	 */
	EClass getPortValue();

	/**
	 * Returns the meta object for the attribute '{@link montiarcruntime.PortValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see montiarcruntime.PortValue#getValue()
	 * @see #getPortValue()
	 * @generated
	 */
	EAttribute getPortValue_Value();

	/**
	 * Returns the meta object for the reference '{@link montiarcruntime.PortValue#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see montiarcruntime.PortValue#getType()
	 * @see #getPortValue()
	 * @generated
	 */
	EReference getPortValue_Type();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MontiarcruntimeFactory getMontiarcruntimeFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link montiarcruntime.impl.PortValueImpl <em>Port Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see montiarcruntime.impl.PortValueImpl
		 * @see montiarcruntime.impl.MontiarcruntimePackageImpl#getPortValue()
		 * @generated
		 */
		EClass PORT_VALUE = eINSTANCE.getPortValue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT_VALUE__VALUE = eINSTANCE.getPortValue_Value();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT_VALUE__TYPE = eINSTANCE.getPortValue_Type();

	}

} //MontiarcruntimePackage

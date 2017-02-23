/**
 */
package ur1.diverse.montiarc.xdsml.xmontiarcmt.montiarc;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Subcomponent Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ur1.diverse.montiarc.xdsml.xmontiarcmt.montiarc.SubcomponentDeclaration#getInstanceName <em>Instance Name</em>}</li>
 *   <li>{@link ur1.diverse.montiarc.xdsml.xmontiarcmt.montiarc.SubcomponentDeclaration#getComponentType <em>Component Type</em>}</li>
 * </ul>
 *
 * @see ur1.diverse.montiarc.xdsml.xmontiarcmt.montiarc.MontiarcPackage#getSubcomponentDeclaration()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='NameIsLeadingUpperCase'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot NameIsLeadingUpperCase='Tuple {\n\tmessage : String = \'The name of instance name of subcomponent \"\' + instanceName +\n\t\t\t\'\" must begin lowercase.\',\n\tstatus : Boolean = let firstLetter : String = (instanceName).substring(1, 1)\n\t\tin firstLetter.toUpperCase() = firstLetter\n}.status'"
 * @generated
 */
public interface SubcomponentDeclaration extends EObject {
	/**
	 * Returns the value of the '<em><b>Instance Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instance Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instance Name</em>' attribute.
	 * @see #setInstanceName(String)
	 * @see ur1.diverse.montiarc.xdsml.xmontiarcmt.montiarc.MontiarcPackage#getSubcomponentDeclaration_InstanceName()
	 * @model required="true"
	 * @generated
	 */
	String getInstanceName();

	/**
	 * Sets the value of the '{@link ur1.diverse.montiarc.xdsml.xmontiarcmt.montiarc.SubcomponentDeclaration#getInstanceName <em>Instance Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instance Name</em>' attribute.
	 * @see #getInstanceName()
	 * @generated
	 */
	void setInstanceName(String value);

	/**
	 * Returns the value of the '<em><b>Component Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Component Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component Type</em>' reference.
	 * @see #setComponentType(ComponentType)
	 * @see ur1.diverse.montiarc.xdsml.xmontiarcmt.montiarc.MontiarcPackage#getSubcomponentDeclaration_ComponentType()
	 * @model required="true"
	 * @generated
	 */
	ComponentType getComponentType();

	/**
	 * Sets the value of the '{@link ur1.diverse.montiarc.xdsml.xmontiarcmt.montiarc.SubcomponentDeclaration#getComponentType <em>Component Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component Type</em>' reference.
	 * @see #getComponentType()
	 * @generated
	 */
	void setComponentType(ComponentType value);

} // SubcomponentDeclaration

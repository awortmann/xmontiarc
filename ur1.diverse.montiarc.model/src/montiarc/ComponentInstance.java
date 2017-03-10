/**
 */
package montiarc;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link montiarc.ComponentInstance#getInstanceName <em>Instance Name</em>}</li>
 *   <li>{@link montiarc.ComponentInstance#getComponentType <em>Component Type</em>}</li>
 *   <li>{@link montiarc.ComponentInstance#getPortInstances <em>Port Instances</em>}</li>
 *   <li>{@link montiarc.ComponentInstance#getParent <em>Parent</em>}</li>
 *   <li>{@link montiarc.ComponentInstance#getConnectorInstances <em>Connector Instances</em>}</li>
 * </ul>
 *
 * @see montiarc.MontiarcPackage#getComponentInstance()
 * @model
 * @generated
 */
public interface ComponentInstance extends EObject {
	/**
	 * Returns the value of the '<em><b>Instance Name</b></em>' attribute.
	 * The default value is <code>"UnnamedComponentInstance"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instance Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instance Name</em>' attribute.
	 * @see #setInstanceName(String)
	 * @see montiarc.MontiarcPackage#getComponentInstance_InstanceName()
	 * @model default="UnnamedComponentInstance" required="true"
	 * @generated
	 */
	String getInstanceName();

	/**
	 * Sets the value of the '{@link montiarc.ComponentInstance#getInstanceName <em>Instance Name</em>}' attribute.
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
	 * @see montiarc.MontiarcPackage#getComponentInstance_ComponentType()
	 * @model required="true"
	 * @generated
	 */
	ComponentType getComponentType();

	/**
	 * Sets the value of the '{@link montiarc.ComponentInstance#getComponentType <em>Component Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component Type</em>' reference.
	 * @see #getComponentType()
	 * @generated
	 */
	void setComponentType(ComponentType value);

	/**
	 * Returns the value of the '<em><b>Port Instances</b></em>' containment reference list.
	 * The list contents are of type {@link montiarc.PortInstance}.
	 * It is bidirectional and its opposite is '{@link montiarc.PortInstance#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port Instances</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port Instances</em>' containment reference list.
	 * @see montiarc.MontiarcPackage#getComponentInstance_PortInstances()
	 * @see montiarc.PortInstance#getParent
	 * @model opposite="parent" containment="true" transient="true" derived="true"
	 * @generated
	 */
	EList<PortInstance> getPortInstances();

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link montiarc.ComponentType#getComponentInstances <em>Component Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(ComponentType)
	 * @see montiarc.MontiarcPackage#getComponentInstance_Parent()
	 * @see montiarc.ComponentType#getComponentInstances
	 * @model opposite="componentInstances" required="true" transient="false"
	 * @generated
	 */
	ComponentType getParent();

	/**
	 * Sets the value of the '{@link montiarc.ComponentInstance#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(ComponentType value);

	/**
	 * Returns the value of the '<em><b>Connector Instances</b></em>' containment reference list.
	 * The list contents are of type {@link montiarc.ConnectorInstance}.
	 * It is bidirectional and its opposite is '{@link montiarc.ConnectorInstance#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connector Instances</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connector Instances</em>' containment reference list.
	 * @see montiarc.MontiarcPackage#getComponentInstance_ConnectorInstances()
	 * @see montiarc.ConnectorInstance#getParent
	 * @model opposite="parent" containment="true" transient="true" derived="true"
	 * @generated
	 */
	EList<ConnectorInstance> getConnectorInstances();

} // ComponentInstance

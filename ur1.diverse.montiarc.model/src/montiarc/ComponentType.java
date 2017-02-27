/**
 */
package montiarc;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link montiarc.ComponentType#getName <em>Name</em>}</li>
 *   <li>{@link montiarc.ComponentType#getSuperComponentType <em>Super Component Type</em>}</li>
 *   <li>{@link montiarc.ComponentType#getPortTypes <em>Port Types</em>}</li>
 *   <li>{@link montiarc.ComponentType#getConnectors <em>Connectors</em>}</li>
 *   <li>{@link montiarc.ComponentType#getComponentInstances <em>Component Instances</em>}</li>
 *   <li>{@link montiarc.ComponentType#getGroovyBehavior <em>Groovy Behavior</em>}</li>
 * </ul>
 *
 * @see montiarc.MontiarcPackage#getComponentType()
 * @model
 * @generated
 */
public interface ComponentType extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>"UnnamedComponentType"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see montiarc.MontiarcPackage#getComponentType_Name()
	 * @model default="UnnamedComponentType" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link montiarc.ComponentType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Super Component Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Super Component Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Super Component Type</em>' reference.
	 * @see #setSuperComponentType(ComponentType)
	 * @see montiarc.MontiarcPackage#getComponentType_SuperComponentType()
	 * @model
	 * @generated
	 */
	ComponentType getSuperComponentType();

	/**
	 * Sets the value of the '{@link montiarc.ComponentType#getSuperComponentType <em>Super Component Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Super Component Type</em>' reference.
	 * @see #getSuperComponentType()
	 * @generated
	 */
	void setSuperComponentType(ComponentType value);

	/**
	 * Returns the value of the '<em><b>Port Types</b></em>' containment reference list.
	 * The list contents are of type {@link montiarc.PortType}.
	 * It is bidirectional and its opposite is '{@link montiarc.PortType#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port Types</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port Types</em>' containment reference list.
	 * @see montiarc.MontiarcPackage#getComponentType_PortTypes()
	 * @see montiarc.PortType#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<PortType> getPortTypes();

	/**
	 * Returns the value of the '<em><b>Connectors</b></em>' containment reference list.
	 * The list contents are of type {@link montiarc.ConnectorType}.
	 * It is bidirectional and its opposite is '{@link montiarc.ConnectorType#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connectors</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connectors</em>' containment reference list.
	 * @see montiarc.MontiarcPackage#getComponentType_Connectors()
	 * @see montiarc.ConnectorType#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<ConnectorType> getConnectors();

	/**
	 * Returns the value of the '<em><b>Component Instances</b></em>' containment reference list.
	 * The list contents are of type {@link montiarc.ComponentInstance}.
	 * It is bidirectional and its opposite is '{@link montiarc.ComponentInstance#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Component Instances</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component Instances</em>' containment reference list.
	 * @see montiarc.MontiarcPackage#getComponentType_ComponentInstances()
	 * @see montiarc.ComponentInstance#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<ComponentInstance> getComponentInstances();

	/**
	 * Returns the value of the '<em><b>Groovy Behavior</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Groovy Behavior</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Groovy Behavior</em>' attribute.
	 * @see #setGroovyBehavior(String)
	 * @see montiarc.MontiarcPackage#getComponentType_GroovyBehavior()
	 * @model
	 * @generated
	 */
	String getGroovyBehavior();

	/**
	 * Sets the value of the '{@link montiarc.ComponentType#getGroovyBehavior <em>Groovy Behavior</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Groovy Behavior</em>' attribute.
	 * @see #getGroovyBehavior()
	 * @generated
	 */
	void setGroovyBehavior(String value);

} // ComponentType

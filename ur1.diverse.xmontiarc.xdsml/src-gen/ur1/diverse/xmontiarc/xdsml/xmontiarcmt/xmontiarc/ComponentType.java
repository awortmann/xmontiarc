/**
 */
package ur1.diverse.xmontiarc.xdsml.xmontiarcmt.xmontiarc;

import java.util.Optional;
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
 *   <li>{@link ur1.diverse.xmontiarc.xdsml.xmontiarcmt.xmontiarc.ComponentType#getName <em>Name</em>}</li>
 *   <li>{@link ur1.diverse.xmontiarc.xdsml.xmontiarcmt.xmontiarc.ComponentType#getPorts <em>Ports</em>}</li>
 *   <li>{@link ur1.diverse.xmontiarc.xdsml.xmontiarcmt.xmontiarc.ComponentType#getConnectors <em>Connectors</em>}</li>
 *   <li>{@link ur1.diverse.xmontiarc.xdsml.xmontiarcmt.xmontiarc.ComponentType#getSubcomponents <em>Subcomponents</em>}</li>
 *   <li>{@link ur1.diverse.xmontiarc.xdsml.xmontiarcmt.xmontiarc.ComponentType#getBehavior <em>Behavior</em>}</li>
 * </ul>
 *
 * @see ur1.diverse.xmontiarc.xdsml.xmontiarcmt.xmontiarc.XmontiarcPackage#getComponentType()
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
	 * @see ur1.diverse.xmontiarc.xdsml.xmontiarcmt.xmontiarc.XmontiarcPackage#getComponentType_Name()
	 * @model default="UnnamedComponentType" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ur1.diverse.xmontiarc.xdsml.xmontiarcmt.xmontiarc.ComponentType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Ports</b></em>' containment reference list.
	 * The list contents are of type {@link ur1.diverse.xmontiarc.xdsml.xmontiarcmt.xmontiarc.Port}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ports</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ports</em>' containment reference list.
	 * @see ur1.diverse.xmontiarc.xdsml.xmontiarcmt.xmontiarc.XmontiarcPackage#getComponentType_Ports()
	 * @model containment="true"
	 * @generated
	 */
	EList<Port> getPorts();

	/**
	 * Returns the value of the '<em><b>Connectors</b></em>' containment reference list.
	 * The list contents are of type {@link ur1.diverse.xmontiarc.xdsml.xmontiarcmt.xmontiarc.Connector}.
	 * It is bidirectional and its opposite is '{@link ur1.diverse.xmontiarc.xdsml.xmontiarcmt.xmontiarc.Connector#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connectors</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connectors</em>' containment reference list.
	 * @see ur1.diverse.xmontiarc.xdsml.xmontiarcmt.xmontiarc.XmontiarcPackage#getComponentType_Connectors()
	 * @see ur1.diverse.xmontiarc.xdsml.xmontiarcmt.xmontiarc.Connector#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<Connector> getConnectors();

	/**
	 * Returns the value of the '<em><b>Subcomponents</b></em>' containment reference list.
	 * The list contents are of type {@link ur1.diverse.xmontiarc.xdsml.xmontiarcmt.xmontiarc.Subcomponent}.
	 * It is bidirectional and its opposite is '{@link ur1.diverse.xmontiarc.xdsml.xmontiarcmt.xmontiarc.Subcomponent#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subcomponents</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subcomponents</em>' containment reference list.
	 * @see ur1.diverse.xmontiarc.xdsml.xmontiarcmt.xmontiarc.XmontiarcPackage#getComponentType_Subcomponents()
	 * @see ur1.diverse.xmontiarc.xdsml.xmontiarcmt.xmontiarc.Subcomponent#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<Subcomponent> getSubcomponents();

	/**
	 * Returns the value of the '<em><b>Behavior</b></em>' attribute.
	 * The default value is <code>"\"\""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Behavior</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Behavior</em>' attribute.
	 * @see #setBehavior(String)
	 * @see ur1.diverse.xmontiarc.xdsml.xmontiarcmt.xmontiarc.XmontiarcPackage#getComponentType_Behavior()
	 * @model default="\"\"" required="true"
	 * @generated
	 */
	String getBehavior();

	/**
	 * Sets the value of the '{@link ur1.diverse.xmontiarc.xdsml.xmontiarcmt.xmontiarc.ComponentType#getBehavior <em>Behavior</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Behavior</em>' attribute.
	 * @see #getBehavior()
	 * @generated
	 */
	void setBehavior(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model argsMany="true"
	 * @generated
	 */
	void initializeModel(EList<String> args);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void main();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void compute();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void update();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Subcomponent findOwnerOf(Port p);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<Port> getOutgoingPortsOfSubcomponents();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<Port> getIncomingPortsOfSubcomponents();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	EList<Port> getDirectedPortsOfSubcomponents(boolean collectIncoming);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<Port> getIncomingPorts();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<Port> getOutgoingPorts();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	EList<Port> getDirectedPorts(boolean collectIncomingPorts);

} // ComponentType

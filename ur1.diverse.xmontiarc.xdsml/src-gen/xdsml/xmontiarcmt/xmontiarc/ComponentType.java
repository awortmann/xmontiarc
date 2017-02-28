/**
 */
package xdsml.xmontiarcmt.xmontiarc;

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
 *   <li>{@link xdsml.xmontiarcmt.xmontiarc.ComponentType#getName <em>Name</em>}</li>
 *   <li>{@link xdsml.xmontiarcmt.xmontiarc.ComponentType#getPorts <em>Ports</em>}</li>
 *   <li>{@link xdsml.xmontiarcmt.xmontiarc.ComponentType#getConnectors <em>Connectors</em>}</li>
 *   <li>{@link xdsml.xmontiarcmt.xmontiarc.ComponentType#getSubcomponents <em>Subcomponents</em>}</li>
 *   <li>{@link xdsml.xmontiarcmt.xmontiarc.ComponentType#getBehavior <em>Behavior</em>}</li>
 * </ul>
 *
 * @see xdsml.xmontiarcmt.xmontiarc.XmontiarcPackage#getComponentType()
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
	 * @see xdsml.xmontiarcmt.xmontiarc.XmontiarcPackage#getComponentType_Name()
	 * @model default="UnnamedComponentType" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link xdsml.xmontiarcmt.xmontiarc.ComponentType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Ports</b></em>' containment reference list.
	 * The list contents are of type {@link xdsml.xmontiarcmt.xmontiarc.Port}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ports</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ports</em>' containment reference list.
	 * @see xdsml.xmontiarcmt.xmontiarc.XmontiarcPackage#getComponentType_Ports()
	 * @model containment="true"
	 * @generated
	 */
	EList<Port> getPorts();

	/**
	 * Returns the value of the '<em><b>Connectors</b></em>' containment reference list.
	 * The list contents are of type {@link xdsml.xmontiarcmt.xmontiarc.Connector}.
	 * It is bidirectional and its opposite is '{@link xdsml.xmontiarcmt.xmontiarc.Connector#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connectors</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connectors</em>' containment reference list.
	 * @see xdsml.xmontiarcmt.xmontiarc.XmontiarcPackage#getComponentType_Connectors()
	 * @see xdsml.xmontiarcmt.xmontiarc.Connector#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<Connector> getConnectors();

	/**
	 * Returns the value of the '<em><b>Subcomponents</b></em>' containment reference list.
	 * The list contents are of type {@link xdsml.xmontiarcmt.xmontiarc.Subcomponent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subcomponents</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subcomponents</em>' containment reference list.
	 * @see xdsml.xmontiarcmt.xmontiarc.XmontiarcPackage#getComponentType_Subcomponents()
	 * @model containment="true"
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
	 * @see xdsml.xmontiarcmt.xmontiarc.XmontiarcPackage#getComponentType_Behavior()
	 * @model default="\"\"" required="true"
	 * @generated
	 */
	String getBehavior();

	/**
	 * Sets the value of the '{@link xdsml.xmontiarcmt.xmontiarc.ComponentType#getBehavior <em>Behavior</em>}' attribute.
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
	void init(EList<String> args);

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

} // ComponentType

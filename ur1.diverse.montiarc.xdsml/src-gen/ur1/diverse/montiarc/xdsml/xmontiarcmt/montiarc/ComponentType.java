/**
 */
package ur1.diverse.montiarc.xdsml.xmontiarcmt.montiarc;

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
 *   <li>{@link ur1.diverse.montiarc.xdsml.xmontiarcmt.montiarc.ComponentType#getName <em>Name</em>}</li>
 *   <li>{@link ur1.diverse.montiarc.xdsml.xmontiarcmt.montiarc.ComponentType#getSuperComponentType <em>Super Component Type</em>}</li>
 *   <li>{@link ur1.diverse.montiarc.xdsml.xmontiarcmt.montiarc.ComponentType#getPorts <em>Ports</em>}</li>
 *   <li>{@link ur1.diverse.montiarc.xdsml.xmontiarcmt.montiarc.ComponentType#getConnectors <em>Connectors</em>}</li>
 *   <li>{@link ur1.diverse.montiarc.xdsml.xmontiarcmt.montiarc.ComponentType#getSubcomponents <em>Subcomponents</em>}</li>
 *   <li>{@link ur1.diverse.montiarc.xdsml.xmontiarcmt.montiarc.ComponentType#getGroovyBehavior <em>Groovy Behavior</em>}</li>
 * </ul>
 *
 * @see ur1.diverse.montiarc.xdsml.xmontiarcmt.montiarc.MontiarcPackage#getComponentType()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='NameIsLeadingUpperCase ConnectorsDoNotCrossCutComponents'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot NameIsLeadingUpperCase='Tuple {\n\tmessage : String = \'The name of component type \"\' + name + \'\" must begin uppercase.\',\n\tstatus : Boolean = \n\t\t\tlet firstLetter: String = (name).substring(1, 1) \n\t\t\t\tin firstLetter.toUpperCase() = firstLetter\n}.status' ConnectorsDoNotCrossCutComponents='\n\t\t\ttrue'"
 * @generated
 */
public interface ComponentType extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see ur1.diverse.montiarc.xdsml.xmontiarcmt.montiarc.MontiarcPackage#getComponentType_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ur1.diverse.montiarc.xdsml.xmontiarcmt.montiarc.ComponentType#getName <em>Name</em>}' attribute.
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
	 * @see ur1.diverse.montiarc.xdsml.xmontiarcmt.montiarc.MontiarcPackage#getComponentType_SuperComponentType()
	 * @model
	 * @generated
	 */
	ComponentType getSuperComponentType();

	/**
	 * Sets the value of the '{@link ur1.diverse.montiarc.xdsml.xmontiarcmt.montiarc.ComponentType#getSuperComponentType <em>Super Component Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Super Component Type</em>' reference.
	 * @see #getSuperComponentType()
	 * @generated
	 */
	void setSuperComponentType(ComponentType value);

	/**
	 * Returns the value of the '<em><b>Ports</b></em>' containment reference list.
	 * The list contents are of type {@link ur1.diverse.montiarc.xdsml.xmontiarcmt.montiarc.Port}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ports</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ports</em>' containment reference list.
	 * @see ur1.diverse.montiarc.xdsml.xmontiarcmt.montiarc.MontiarcPackage#getComponentType_Ports()
	 * @model containment="true"
	 * @generated
	 */
	EList<Port> getPorts();

	/**
	 * Returns the value of the '<em><b>Connectors</b></em>' containment reference list.
	 * The list contents are of type {@link ur1.diverse.montiarc.xdsml.xmontiarcmt.montiarc.Connector}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connectors</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connectors</em>' containment reference list.
	 * @see ur1.diverse.montiarc.xdsml.xmontiarcmt.montiarc.MontiarcPackage#getComponentType_Connectors()
	 * @model containment="true"
	 * @generated
	 */
	EList<Connector> getConnectors();

	/**
	 * Returns the value of the '<em><b>Subcomponents</b></em>' containment reference list.
	 * The list contents are of type {@link ur1.diverse.montiarc.xdsml.xmontiarcmt.montiarc.SubcomponentDeclaration}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subcomponents</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subcomponents</em>' containment reference list.
	 * @see ur1.diverse.montiarc.xdsml.xmontiarcmt.montiarc.MontiarcPackage#getComponentType_Subcomponents()
	 * @model containment="true"
	 * @generated
	 */
	EList<SubcomponentDeclaration> getSubcomponents();

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
	 * @see ur1.diverse.montiarc.xdsml.xmontiarcmt.montiarc.MontiarcPackage#getComponentType_GroovyBehavior()
	 * @model
	 * @generated
	 */
	String getGroovyBehavior();

	/**
	 * Sets the value of the '{@link ur1.diverse.montiarc.xdsml.xmontiarcmt.montiarc.ComponentType#getGroovyBehavior <em>Groovy Behavior</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Groovy Behavior</em>' attribute.
	 * @see #getGroovyBehavior()
	 * @generated
	 */
	void setGroovyBehavior(String value);

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

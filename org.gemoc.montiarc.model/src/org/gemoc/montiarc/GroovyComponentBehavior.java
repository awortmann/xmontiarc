/**
 */
package org.gemoc.montiarc;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Groovy Component Behavior</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gemoc.montiarc.GroovyComponentBehavior#getScriptBody <em>Script Body</em>}</li>
 * </ul>
 *
 * @see org.gemoc.montiarc.MontiarcPackage#getGroovyComponentBehavior()
 * @model
 * @generated
 */
public interface GroovyComponentBehavior extends ComponentBehavior {
	/**
	 * Returns the value of the '<em><b>Script Body</b></em>' attribute.
	 * The default value is <code>"\"\""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Script Body</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Script Body</em>' attribute.
	 * @see #setScriptBody(String)
	 * @see org.gemoc.montiarc.MontiarcPackage#getGroovyComponentBehavior_ScriptBody()
	 * @model default="\"\"" required="true"
	 * @generated
	 */
	String getScriptBody();

	/**
	 * Sets the value of the '{@link org.gemoc.montiarc.GroovyComponentBehavior#getScriptBody <em>Script Body</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Script Body</em>' attribute.
	 * @see #getScriptBody()
	 * @generated
	 */
	void setScriptBody(String value);

} // GroovyComponentBehavior

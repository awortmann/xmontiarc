/**
 */
package xdsml.xmontiarcmt.runtime;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Message</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link xdsml.xmontiarcmt.runtime.Message#getPayload <em>Payload</em>}</li>
 * </ul>
 *
 * @see xdsml.xmontiarcmt.runtime.RuntimePackage#getMessage()
 * @model
 * @generated
 */
public interface Message extends EObject {
	/**
	 * Returns the value of the '<em><b>Payload</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Payload</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Payload</em>' attribute.
	 * @see #setPayload(Object)
	 * @see xdsml.xmontiarcmt.runtime.RuntimePackage#getMessage_Payload()
	 * @model
	 * @generated
	 */
	Object getPayload();

	/**
	 * Sets the value of the '{@link xdsml.xmontiarcmt.runtime.Message#getPayload <em>Payload</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Payload</em>' attribute.
	 * @see #getPayload()
	 * @generated
	 */
	void setPayload(Object value);

} // Message

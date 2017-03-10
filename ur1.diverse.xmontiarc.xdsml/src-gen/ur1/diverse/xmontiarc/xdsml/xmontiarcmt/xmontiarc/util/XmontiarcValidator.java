/**
 */
package ur1.diverse.xmontiarc.xdsml.xmontiarcmt.xmontiarc.util;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import ur1.diverse.xmontiarc.xdsml.xmontiarcmt.xmontiarc.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see ur1.diverse.xmontiarc.xdsml.xmontiarcmt.xmontiarc.XmontiarcPackage
 * @generated
 */
public class XmontiarcValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final XmontiarcValidator INSTANCE = new XmontiarcValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "ur1.diverse.xmontiarc.xdsml.xmontiarcmt.xmontiarc";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XmontiarcValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return XmontiarcPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case XmontiarcPackage.COMPONENT_TYPE:
				return validateComponentType((ComponentType)value, diagnostics, context);
			case XmontiarcPackage.PORT:
				return validatePort((Port)value, diagnostics, context);
			case XmontiarcPackage.CONNECTOR:
				return validateConnector((Connector)value, diagnostics, context);
			case XmontiarcPackage.SUBCOMPONENT:
				return validateSubcomponent((Subcomponent)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComponentType(ComponentType componentType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(componentType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePort(Port port, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(port, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConnector(Connector connector, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(connector, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubcomponent(Subcomponent subcomponent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(subcomponent, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(subcomponent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(subcomponent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(subcomponent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(subcomponent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(subcomponent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(subcomponent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(subcomponent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(subcomponent, diagnostics, context);
		if (result || diagnostics != null) result &= validateSubcomponent_NameIsLowerCase(subcomponent, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the NameIsLowerCase constraint of '<em>Subcomponent</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SUBCOMPONENT__NAME_IS_LOWER_CASE__EEXPRESSION = "Tuple {\n" +
		"\tmessage : String = '\\'' + name + '\\' must be lowercase',\n" +
		"\tstatus : Boolean = \n" +
		"            let firstLetter : String = (name).substring(0,1) \n" +
		"                in firstLetter.toLowerCase() = firstLetter\n" +
		"}.status";

	/**
	 * Validates the NameIsLowerCase constraint of '<em>Subcomponent</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubcomponent_NameIsLowerCase(Subcomponent subcomponent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(XmontiarcPackage.Literals.SUBCOMPONENT,
				 subcomponent,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "NameIsLowerCase",
				 SUBCOMPONENT__NAME_IS_LOWER_CASE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //XmontiarcValidator

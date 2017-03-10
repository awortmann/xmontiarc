/**
 */
package ur1.diverse.montiarc.xdsml.xmontiarcmt.montiarc.util;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import ur1.diverse.montiarc.xdsml.xmontiarcmt.montiarc.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see ur1.diverse.montiarc.xdsml.xmontiarcmt.montiarc.MontiarcPackage
 * @generated
 */
public class MontiarcValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final MontiarcValidator INSTANCE = new MontiarcValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "ur1.diverse.montiarc.xdsml.xmontiarcmt.montiarc";

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
	public MontiarcValidator() {
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
	  return MontiarcPackage.eINSTANCE;
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
			case MontiarcPackage.COMPONENT_TYPE:
				return validateComponentType((ComponentType)value, diagnostics, context);
			case MontiarcPackage.PORT:
				return validatePort((Port)value, diagnostics, context);
			case MontiarcPackage.CONNECTOR:
				return validateConnector((Connector)value, diagnostics, context);
			case MontiarcPackage.SUBCOMPONENT_DECLARATION:
				return validateSubcomponentDeclaration((SubcomponentDeclaration)value, diagnostics, context);
			case MontiarcPackage.PORT_VALUE:
				return validatePortValue((PortValue)value, diagnostics, context);
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
		if (!validate_NoCircularContainment(componentType, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(componentType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(componentType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(componentType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(componentType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(componentType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(componentType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(componentType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(componentType, diagnostics, context);
		if (result || diagnostics != null) result &= validateComponentType_NameIsLeadingUpperCase(componentType, diagnostics, context);
		if (result || diagnostics != null) result &= validateComponentType_ConnectorsDoNotCrossCutComponents(componentType, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the NameIsLeadingUpperCase constraint of '<em>Component Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String COMPONENT_TYPE__NAME_IS_LEADING_UPPER_CASE__EEXPRESSION = "Tuple {\n" +
		"\tmessage : String = 'The name of component type \"' + name + '\" must begin uppercase.',\n" +
		"\tstatus : Boolean = \n" +
		"\t\t\tlet firstLetter: String = (name).substring(1, 1) \n" +
		"\t\t\t\tin firstLetter.toUpperCase() = firstLetter\n" +
		"}.status";

	/**
	 * Validates the NameIsLeadingUpperCase constraint of '<em>Component Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComponentType_NameIsLeadingUpperCase(ComponentType componentType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(MontiarcPackage.Literals.COMPONENT_TYPE,
				 componentType,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "NameIsLeadingUpperCase",
				 COMPONENT_TYPE__NAME_IS_LEADING_UPPER_CASE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the ConnectorsDoNotCrossCutComponents constraint of '<em>Component Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String COMPONENT_TYPE__CONNECTORS_DO_NOT_CROSS_CUT_COMPONENTS__EEXPRESSION = "\n" +
		"\t\t\ttrue";

	/**
	 * Validates the ConnectorsDoNotCrossCutComponents constraint of '<em>Component Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComponentType_ConnectorsDoNotCrossCutComponents(ComponentType componentType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(MontiarcPackage.Literals.COMPONENT_TYPE,
				 componentType,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "ConnectorsDoNotCrossCutComponents",
				 COMPONENT_TYPE__CONNECTORS_DO_NOT_CROSS_CUT_COMPONENTS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePort(Port port, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(port, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(port, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(port, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(port, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(port, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(port, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(port, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(port, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(port, diagnostics, context);
		if (result || diagnostics != null) result &= validatePort_NameIsLeadingUpperCase(port, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the NameIsLeadingUpperCase constraint of '<em>Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PORT__NAME_IS_LEADING_UPPER_CASE__EEXPRESSION = "Tuple {\n" +
		"\tmessage : String = 'The name of port \"' + name + '\" must begin lowercase.',\n" +
		"\tstatus : Boolean = let firstLetter : String =\n" +
		"\t\t\t(name).substring(1, 1)\n" +
		"\t\tin firstLetter.toLowerCase() = firstLetter\n" +
		"}.status";

	/**
	 * Validates the NameIsLeadingUpperCase constraint of '<em>Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePort_NameIsLeadingUpperCase(Port port, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(MontiarcPackage.Literals.PORT,
				 port,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "NameIsLeadingUpperCase",
				 PORT__NAME_IS_LEADING_UPPER_CASE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConnector(Connector connector, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(connector, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(connector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(connector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(connector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(connector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(connector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(connector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(connector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(connector, diagnostics, context);
		if (result || diagnostics != null) result &= validateConnector_ConnectsDifferentComponents(connector, diagnostics, context);
		if (result || diagnostics != null) result &= validateConnector_PortTypeMatch(connector, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the ConnectsDifferentComponents constraint of '<em>Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CONNECTOR__CONNECTS_DIFFERENT_COMPONENTS__EEXPRESSION = "Tuple {\n" +
		"\tmessage : String = 'The connector must connect two different subcomponents.',\n" +
		"\tstatus : Boolean = \n" +
		"\t\t\tself.sourceSubcomponent <> self.targetSubcomponent\n" +
		"}.status";

	/**
	 * Validates the ConnectsDifferentComponents constraint of '<em>Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConnector_ConnectsDifferentComponents(Connector connector, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(MontiarcPackage.Literals.CONNECTOR,
				 connector,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "ConnectsDifferentComponents",
				 CONNECTOR__CONNECTS_DIFFERENT_COMPONENTS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the PortTypeMatch constraint of '<em>Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CONNECTOR__PORT_TYPE_MATCH__EEXPRESSION = "Tuple {\n" +
		"\tmessage : String = 'Both ports of a connector must have the same type',\n" +
		"\tstatus : Boolean = \n" +
		"\t\t\tself.sourcePort.type = self.targetPort.type\n" +
		"}.status";

	/**
	 * Validates the PortTypeMatch constraint of '<em>Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConnector_PortTypeMatch(Connector connector, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(MontiarcPackage.Literals.CONNECTOR,
				 connector,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "PortTypeMatch",
				 CONNECTOR__PORT_TYPE_MATCH__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubcomponentDeclaration(SubcomponentDeclaration subcomponentDeclaration, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(subcomponentDeclaration, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(subcomponentDeclaration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(subcomponentDeclaration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(subcomponentDeclaration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(subcomponentDeclaration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(subcomponentDeclaration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(subcomponentDeclaration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(subcomponentDeclaration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(subcomponentDeclaration, diagnostics, context);
		if (result || diagnostics != null) result &= validateSubcomponentDeclaration_NameIsLeadingUpperCase(subcomponentDeclaration, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the NameIsLeadingUpperCase constraint of '<em>Subcomponent Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SUBCOMPONENT_DECLARATION__NAME_IS_LEADING_UPPER_CASE__EEXPRESSION = "Tuple {\n" +
		"\tmessage : String = 'The name of instance name of subcomponent \"' + instanceName +\n" +
		"\t\t\t'\" must begin lowercase.',\n" +
		"\tstatus : Boolean = let firstLetter : String = (instanceName).substring(1, 1)\n" +
		"\t\tin firstLetter.toUpperCase() = firstLetter\n" +
		"}.status";

	/**
	 * Validates the NameIsLeadingUpperCase constraint of '<em>Subcomponent Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubcomponentDeclaration_NameIsLeadingUpperCase(SubcomponentDeclaration subcomponentDeclaration, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(MontiarcPackage.Literals.SUBCOMPONENT_DECLARATION,
				 subcomponentDeclaration,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "NameIsLeadingUpperCase",
				 SUBCOMPONENT_DECLARATION__NAME_IS_LEADING_UPPER_CASE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePortValue(PortValue portValue, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(portValue, diagnostics, context);
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

} //MontiarcValidator

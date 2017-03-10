/**
 */
package ur1.diverse.montiarc.xdsml.xmontiarc.cd.util;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import ur1.diverse.montiarc.xdsml.xmontiarc.cd.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see ur1.diverse.montiarc.xdsml.xmontiarc.cd.CdPackage
 * @generated
 */
public class CdValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final CdValidator INSTANCE = new CdValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "ur1.diverse.montiarc.xdsml.xmontiarc.cd";

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
	public CdValidator() {
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
	  return CdPackage.eINSTANCE;
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
			case CdPackage.CD_CLASS:
				return validateCDClass((CDClass)value, diagnostics, context);
			case CdPackage.CD_ATTRIBUTE:
				return validateCDAttribute((CDAttribute)value, diagnostics, context);
			case CdPackage.CLASS_DIAGRAM:
				return validateClassDiagram((ClassDiagram)value, diagnostics, context);
			case CdPackage.CD_ENUMERATION:
				return validateCDEnumeration((CDEnumeration)value, diagnostics, context);
			case CdPackage.CD_CONSTANT:
				return validateCDConstant((CDConstant)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCDClass(CDClass cdClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(cdClass, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(cdClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(cdClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(cdClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(cdClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(cdClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(cdClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(cdClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(cdClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateCDClass_NameIsLeadingUpperCase(cdClass, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the NameIsLeadingUpperCase constraint of '<em>CD Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CD_CLASS__NAME_IS_LEADING_UPPER_CASE__EEXPRESSION = "Tuple {\n" +
		"\tmessage : String = 'The name of class \"' + name + '\" must begin uppercase.',\n" +
		"\tstatus : Boolean = \n" +
		"\t\t\tlet firstLetter: String = (name).substring(1,1)\n" +
		"\t\t\t\tin firstLetter.toUpperCase() = firstLetter\n" +
		"}.status";

	/**
	 * Validates the NameIsLeadingUpperCase constraint of '<em>CD Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCDClass_NameIsLeadingUpperCase(CDClass cdClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(CdPackage.Literals.CD_CLASS,
				 cdClass,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "NameIsLeadingUpperCase",
				 CD_CLASS__NAME_IS_LEADING_UPPER_CASE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCDAttribute(CDAttribute cdAttribute, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(cdAttribute, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(cdAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(cdAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(cdAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(cdAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(cdAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(cdAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(cdAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(cdAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validateCDAttribute_NameIsLeadingUpperCase(cdAttribute, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the NameIsLeadingUpperCase constraint of '<em>CD Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CD_ATTRIBUTE__NAME_IS_LEADING_UPPER_CASE__EEXPRESSION = "Tuple {\n" +
		"\tmessage : String = 'The name of class \"' + name + '\" must begin lowercase.',\n" +
		"\tstatus : Boolean = \n" +
		"\t\t\tlet firstLetter: String = (name).substring(1,1)\n" +
		"\t\t\t\tin firstLetter.toLowerCase() = firstLetter\n" +
		"}.status";

	/**
	 * Validates the NameIsLeadingUpperCase constraint of '<em>CD Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCDAttribute_NameIsLeadingUpperCase(CDAttribute cdAttribute, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(CdPackage.Literals.CD_ATTRIBUTE,
				 cdAttribute,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "NameIsLeadingUpperCase",
				 CD_ATTRIBUTE__NAME_IS_LEADING_UPPER_CASE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClassDiagram(ClassDiagram classDiagram, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(classDiagram, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCDEnumeration(CDEnumeration cdEnumeration, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(cdEnumeration, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(cdEnumeration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(cdEnumeration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(cdEnumeration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(cdEnumeration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(cdEnumeration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(cdEnumeration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(cdEnumeration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(cdEnumeration, diagnostics, context);
		if (result || diagnostics != null) result &= validateCDClass_NameIsLeadingUpperCase(cdEnumeration, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCDConstant(CDConstant cdConstant, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(cdConstant, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(cdConstant, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(cdConstant, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(cdConstant, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(cdConstant, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(cdConstant, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(cdConstant, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(cdConstant, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(cdConstant, diagnostics, context);
		if (result || diagnostics != null) result &= validateCDConstant_NameIsLeadingUpperCase(cdConstant, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the NameIsLeadingUpperCase constraint of '<em>CD Constant</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CD_CONSTANT__NAME_IS_LEADING_UPPER_CASE__EEXPRESSION = "Tuple {\n" +
		"\tmessage : String = 'The name of constant \"' + name + '\" must be all uppercase.',\n" +
		"\tstatus : Boolean = \n" +
		"\t\t\tname.toUpperCase() = name\n" +
		"}.status";

	/**
	 * Validates the NameIsLeadingUpperCase constraint of '<em>CD Constant</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCDConstant_NameIsLeadingUpperCase(CDConstant cdConstant, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(CdPackage.Literals.CD_CONSTANT,
				 cdConstant,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "NameIsLeadingUpperCase",
				 CD_CONSTANT__NAME_IS_LEADING_UPPER_CASE__EEXPRESSION,
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

} //CdValidator

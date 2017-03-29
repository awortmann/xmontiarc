package constraints;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.validation.IValidationContext;
import org.eclipse.emf.validation.model.ConstraintStatus;
import org.gemoc.montiarc.ComponentType;
import org.gemoc.montiarc.Port;
import org.gemoc.montiarc.Subcomponent;


public class AllNamesValid extends MontiArcModelConstraint {

	@Override
	public IStatus validate(IValidationContext ctx) {
		EObject obj = ctx.getTarget();
		if (obj instanceof ComponentType) {
			ComponentType type = (ComponentType) obj;
			Optional<ConstraintStatus> optError = this.checkComponentTypeName(ctx, type);
			if (optError.isPresent()) {
				return optError.get();
			}
			
		}
		else if (obj instanceof Subcomponent) {
			Subcomponent sc = (Subcomponent) obj;
			Optional<ConstraintStatus> optError = this.checkSubcomponentName(ctx, sc);
			if (optError.isPresent()) {
				return optError.get();
			}
		}
		else if (obj instanceof Port) {
			Port port = (Port) obj;
			Optional<ConstraintStatus> optError = this.checkPortName(ctx, port);
			if (optError.isPresent()) {
				return optError.get();
			}
		}
		return ctx.createSuccessStatus();
	}
	
	private Optional<ConstraintStatus> checkComponentTypeName(IValidationContext ctx, ComponentType type) {
		Optional<ConstraintStatus> error = Optional.empty();
		this.log("checkComponentTypeName", type);
		Set<EObject> problemElements = new HashSet<>();
		if (!firstLetterIsUppercase(type.getName())) {
			problemElements.add(type);
			error = Optional.of(ConstraintStatus.createStatus(
	                ctx,
	                problemElements,
	                format("The name of {0} should start upper case."),
	                new Object[] {type}));
		}
        return error;
    }
	
	private Optional<ConstraintStatus> checkPortName(IValidationContext ctx, Port port) {
		Optional<ConstraintStatus> error = Optional.empty();
		this.log("checkPortName", port);
		Set<EObject> problemElements = new HashSet<>();
		if (!firstLetterIsLowercase(port.getName())) {
			problemElements.add(port);
			error = Optional.of(ConstraintStatus.createStatus(
	                ctx,
	                problemElements,
	                format("The name of {0} should start lower case."),
	                new Object[] {port}));
		}
        return error;
    }
	
	private Optional<ConstraintStatus> checkSubcomponentName(IValidationContext ctx, Subcomponent sc) {
		Optional<ConstraintStatus> error = Optional.empty();
		this.log("checkSubcomponentName", sc);
		Set<EObject> problemElements = new HashSet<>();
		if (!firstLetterIsLowercase(sc.getName())) {
			problemElements.add(sc);
			error = Optional.of(ConstraintStatus.createStatus(
	                ctx,
	                problemElements,
	                format("The name of {0} should start lower case."),
	                new Object[] {sc}));
		}
        return error;
    }
	
	private boolean firstLetterIsUppercase(String name) {
		return this.firstLetterIs(true, name);
	}
	
	private boolean firstLetterIsLowercase(String name) {
		return this.firstLetterIs(false, name);
	}
	
	private boolean firstLetterIs(boolean uppercase, String name) {
		String firstLetter = name.charAt(0)+"";
		if (uppercase && firstLetter.toUpperCase().equals(firstLetter)) {
			return true;
		} else if (!uppercase && firstLetter.toLowerCase().equals(firstLetter)) {
			return true;
		}
		return false;
	}

}

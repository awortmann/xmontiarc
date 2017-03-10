package constraints;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.validation.IValidationContext;
import org.eclipse.emf.validation.model.ConstraintStatus;

import xmontiarc.Connector;

public class ConnectedPortsAreTypeCompatible extends MontiArcModelConstraint {

	@Override
	public IStatus validate(IValidationContext ctx) {
		EObject obj = ctx.getTarget();
		if (obj instanceof Connector) {
			 Connector con = ( Connector) obj;
			 Optional<ConstraintStatus> optError = this.checkConnector(ctx, con);
				if (optError.isPresent()) {
					return optError.get();
				}
		}
		return ctx.createSuccessStatus();
	}
	
	private Optional<ConstraintStatus> checkConnector(IValidationContext ctx, Connector con) {
		Optional<ConstraintStatus> error = Optional.empty();
		Set<Connector> errors = new HashSet<>();
		if (!con.getSource().getType().equals(con.getTarget().getType())) {
			errors.add(con);
			error = Optional.of(ConstraintStatus.createStatus(
	                ctx,
	                errors,
	                format("The connector {0} connects incompatible ports."),
	                new Object[] {con}));
		}
        return error;
    }

}
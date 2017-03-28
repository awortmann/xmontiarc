package ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Abstract;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.fsm.Guard;
import ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.aspects.GuardAspectGuardAspectProperties;

@Aspect(className = Guard.class)
@SuppressWarnings("all")
public abstract class GuardAspect {
  @Step
  @Abstract
  public static boolean holds(final Guard _self) {
	final ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.aspects.GuardAspectGuardAspectProperties _self_ = ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.aspects.GuardAspectGuardAspectContext
			.getSelf(_self);
	Object result = null;
	if (_self instanceof ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.fsm.StringGuard) {
		result = ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.aspects.StringGuardAspect
				.holds((ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.fsm.StringGuard) _self);
	} else if (_self instanceof ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.fsm.LessOrEqualThanNumberGuard) {
		result = ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.aspects.LessOrEqualThanNumberGuardAspect
				.holds((ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.fsm.LessOrEqualThanNumberGuard) _self);
	} else if (_self instanceof ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.fsm.GreaterThanNumberGuard) {
		result = ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.aspects.GreaterThanNumberGuardAspect
				.holds((ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.fsm.GreaterThanNumberGuard) _self);
	} else if (_self instanceof ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.fsm.LessThanNumberGuard) {
		result = ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.aspects.LessThanNumberGuardAspect
				.holds((ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.fsm.LessThanNumberGuard) _self);
	} else if (_self instanceof ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.fsm.EqualNumberGuard) {
		result = ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.aspects.EqualNumberGuardAspect
				.holds((ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.fsm.EqualNumberGuard) _self);
	} else if (_self instanceof ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.fsm.GreaterOrEqualThanNumberGuard) {
		result = ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.aspects.GreaterOrEqualThanNumberGuardAspect
				.holds((ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.fsm.GreaterOrEqualThanNumberGuard) _self);
	} else if (_self instanceof ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.fsm.NumberGuard) {
		result = ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.aspects.NumberGuardAspect
				.holds((ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.fsm.NumberGuard) _self);
	} else if (_self instanceof ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.fsm.BooleanGuard) {
		result = ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.aspects.BooleanGuardAspect
				.holds((ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.fsm.BooleanGuard) _self);
	} else if (_self instanceof ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.fsm.Guard) {
		fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
			@Override
			public void execute() {
				addToResult(ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.aspects.GuardAspect._privk3_holds(_self_,
						(ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.fsm.Guard) _self));
			}
		};
		fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager manager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry
				.getInstance().findStepManager(_self);
		if (manager != null) {
			manager.executeStep(_self, command, "Guard", "holds");
		} else {
			fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IEventManager eventManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.EventManagerRegistry
					.getInstance().findEventManager(null);
			if (eventManager != null) {
				eventManager.manageEvents();
			}
			command.execute();
		}
		result = command.getResult();
		;
	} else {
		throw new IllegalArgumentException(
				"Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString());
	}
	;
	return (boolean) result;
}
  
  protected static boolean _privk3_holds(final GuardAspectGuardAspectProperties _self_, final Guard _self) {
    throw new java.lang.RuntimeException("Not implemented");
  }
}

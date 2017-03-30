package org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Abstract;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.fsm.Guard;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.aspects.GuardAspectGuardAspectProperties;

@Aspect(className = Guard.class)
@SuppressWarnings("all")
public abstract class GuardAspect {
  @Step
  @Abstract
  public static boolean holds(final Guard _self) {
	final org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.aspects.GuardAspectGuardAspectProperties _self_ = org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.aspects.GuardAspectGuardAspectContext
			.getSelf(_self);
	Object result = null;
	if (_self instanceof org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.fsm.LessThanNumberGuard) {
		result = org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.aspects.LessThanNumberGuardAspect
				.holds((org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.fsm.LessThanNumberGuard) _self);
	} else if (_self instanceof org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.fsm.GreaterOrEqualThanNumberGuard) {
		result = org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.aspects.GreaterOrEqualThanNumberGuardAspect
				.holds((org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.fsm.GreaterOrEqualThanNumberGuard) _self);
	} else if (_self instanceof org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.fsm.GreaterThanNumberGuard) {
		result = org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.aspects.GreaterThanNumberGuardAspect
				.holds((org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.fsm.GreaterThanNumberGuard) _self);
	} else if (_self instanceof org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.fsm.EqualNumberGuard) {
		result = org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.aspects.EqualNumberGuardAspect
				.holds((org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.fsm.EqualNumberGuard) _self);
	} else if (_self instanceof org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.fsm.LessOrEqualThanNumberGuard) {
		result = org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.aspects.LessOrEqualThanNumberGuardAspect
				.holds((org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.fsm.LessOrEqualThanNumberGuard) _self);
	} else if (_self instanceof org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.fsm.BooleanGuard) {
		result = org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.aspects.BooleanGuardAspect
				.holds((org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.fsm.BooleanGuard) _self);
	} else if (_self instanceof org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.fsm.StringGuard) {
		result = org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.aspects.StringGuardAspect
				.holds((org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.fsm.StringGuard) _self);
	} else if (_self instanceof org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.fsm.NumberGuard) {
		result = org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.aspects.NumberGuardAspect
				.holds((org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.fsm.NumberGuard) _self);
	} else if (_self instanceof org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.fsm.Guard) {
		fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
			@Override
			public void execute() {
				addToResult(org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.aspects.GuardAspect._privk3_holds(_self_,
						(org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.fsm.Guard) _self));
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

package org.gemoc.xportautomata.xdsml.xportautomata.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Abstract;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import org.gemoc.xportautomata.xdsml.xportautomata.fsm.Guard;
import org.gemoc.xportautomata.xdsml.xportautomata.aspects.GuardAspectGuardAspectProperties;

@Aspect(className = Guard.class)
@SuppressWarnings("all")
public abstract class GuardAspect {
  @Step
  @Abstract
  public static boolean holds(final Guard _self) {
	final org.gemoc.xportautomata.xdsml.xportautomata.aspects.GuardAspectGuardAspectProperties _self_ = org.gemoc.xportautomata.xdsml.xportautomata.aspects.GuardAspectGuardAspectContext
			.getSelf(_self);
	Object result = null;
	if (_self instanceof org.gemoc.xportautomata.xdsml.xportautomata.fsm.StringGuard) {
		result = org.gemoc.xportautomata.xdsml.xportautomata.aspects.StringGuardAspect
				.holds((org.gemoc.xportautomata.xdsml.xportautomata.fsm.StringGuard) _self);
	} else if (_self instanceof org.gemoc.xportautomata.xdsml.xportautomata.fsm.LessThanNumberGuard) {
		result = org.gemoc.xportautomata.xdsml.xportautomata.aspects.LessThanNumberGuardAspect
				.holds((org.gemoc.xportautomata.xdsml.xportautomata.fsm.LessThanNumberGuard) _self);
	} else if (_self instanceof org.gemoc.xportautomata.xdsml.xportautomata.fsm.EqualNumberGuard) {
		result = org.gemoc.xportautomata.xdsml.xportautomata.aspects.EqualNumberGuardAspect
				.holds((org.gemoc.xportautomata.xdsml.xportautomata.fsm.EqualNumberGuard) _self);
	} else if (_self instanceof org.gemoc.xportautomata.xdsml.xportautomata.fsm.GreaterThanNumberGuard) {
		result = org.gemoc.xportautomata.xdsml.xportautomata.aspects.GreaterThanNumberGuardAspect
				.holds((org.gemoc.xportautomata.xdsml.xportautomata.fsm.GreaterThanNumberGuard) _self);
	} else if (_self instanceof org.gemoc.xportautomata.xdsml.xportautomata.fsm.GreaterOrEqualThanNumberGuard) {
		result = org.gemoc.xportautomata.xdsml.xportautomata.aspects.GreaterOrEqualThanNumberGuardAspect
				.holds((org.gemoc.xportautomata.xdsml.xportautomata.fsm.GreaterOrEqualThanNumberGuard) _self);
	} else if (_self instanceof org.gemoc.xportautomata.xdsml.xportautomata.fsm.LessOrEqualThanNumberGuard) {
		result = org.gemoc.xportautomata.xdsml.xportautomata.aspects.LessOrEqualThanNumberGuardAspect
				.holds((org.gemoc.xportautomata.xdsml.xportautomata.fsm.LessOrEqualThanNumberGuard) _self);
	} else if (_self instanceof org.gemoc.xportautomata.xdsml.xportautomata.fsm.NumberGuard) {
		result = org.gemoc.xportautomata.xdsml.xportautomata.aspects.NumberGuardAspect
				.holds((org.gemoc.xportautomata.xdsml.xportautomata.fsm.NumberGuard) _self);
	} else if (_self instanceof org.gemoc.xportautomata.xdsml.xportautomata.fsm.BooleanGuard) {
		result = org.gemoc.xportautomata.xdsml.xportautomata.aspects.BooleanGuardAspect
				.holds((org.gemoc.xportautomata.xdsml.xportautomata.fsm.BooleanGuard) _self);
	} else if (_self instanceof org.gemoc.xportautomata.xdsml.xportautomata.fsm.Guard) {
		fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
			@Override
			public void execute() {
				addToResult(org.gemoc.xportautomata.xdsml.xportautomata.aspects.GuardAspect._privk3_holds(_self_,
						(org.gemoc.xportautomata.xdsml.xportautomata.fsm.Guard) _self));
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

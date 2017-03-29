package org.gemoc.xportautomata.xdsml.xportautomata.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Abstract;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import org.gemoc.xportautomata.xdsml.xportautomata.fsm.Action;
import org.gemoc.xportautomata.xdsml.xportautomata.aspects.ActionAspectActionAspectProperties;

@Aspect(className = Action.class)
@SuppressWarnings("all")
public abstract class ActionAspect {
  @Abstract
  public static void execute(final Action _self) {
	final org.gemoc.xportautomata.xdsml.xportautomata.aspects.ActionAspectActionAspectProperties _self_ = org.gemoc.xportautomata.xdsml.xportautomata.aspects.ActionAspectActionAspectContext
			.getSelf(_self);
	if (_self instanceof org.gemoc.xportautomata.xdsml.xportautomata.fsm.NumberAction) {
		org.gemoc.xportautomata.xdsml.xportautomata.aspects.NumberActionAspect
				.execute((org.gemoc.xportautomata.xdsml.xportautomata.fsm.NumberAction) _self);
	} else if (_self instanceof org.gemoc.xportautomata.xdsml.xportautomata.fsm.BooleanAction) {
		org.gemoc.xportautomata.xdsml.xportautomata.aspects.BooleanActionAspect
				.execute((org.gemoc.xportautomata.xdsml.xportautomata.fsm.BooleanAction) _self);
	} else if (_self instanceof org.gemoc.xportautomata.xdsml.xportautomata.fsm.StringAction) {
		org.gemoc.xportautomata.xdsml.xportautomata.aspects.StringActionAspect
				.execute((org.gemoc.xportautomata.xdsml.xportautomata.fsm.StringAction) _self);
	} else if (_self instanceof org.gemoc.xportautomata.xdsml.xportautomata.fsm.Action) {
		org.gemoc.xportautomata.xdsml.xportautomata.aspects.ActionAspect._privk3_execute(_self_,
				(org.gemoc.xportautomata.xdsml.xportautomata.fsm.Action) _self);
	} else {
		throw new IllegalArgumentException(
				"Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString());
	}
	;
}
  
  protected static void _privk3_execute(final ActionAspectActionAspectProperties _self_, final Action _self) {
    throw new java.lang.RuntimeException("Not implemented");
  }
}

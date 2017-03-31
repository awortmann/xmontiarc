package org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Abstract;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.fsm.Action;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.aspects.ActionAspectActionAspectProperties;

@Aspect(className = Action.class)
@SuppressWarnings("all")
public abstract class ActionAspect {
  @Abstract
  public static void execute(final Action _self) {
	final org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.aspects.ActionAspectActionAspectProperties _self_ = org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.aspects.ActionAspectActionAspectContext
			.getSelf(_self);
	if (_self instanceof org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.fsm.BooleanAction) {
		org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.aspects.BooleanActionAspect
				.execute((org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.fsm.BooleanAction) _self);
	} else if (_self instanceof org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.fsm.StringAction) {
		org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.aspects.StringActionAspect
				.execute((org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.fsm.StringAction) _self);
	} else if (_self instanceof org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.fsm.NumberAction) {
		org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.aspects.NumberActionAspect
				.execute((org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.fsm.NumberAction) _self);
	} else if (_self instanceof org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.fsm.Action) {
		org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.aspects.ActionAspect._privk3_execute(_self_,
				(org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.fsm.Action) _self);
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

package org.gemoc.sample.legacyfsm.xsfsm.xsfsm.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Abstract;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.Action;
import org.gemoc.sample.legacyfsm.xsfsm.xsfsm.aspects.ActionAspectActionAspectProperties;

@Aspect(className = Action.class)
@SuppressWarnings("all")
public abstract class ActionAspect {
  @Abstract
  public static void execute(final Action _self) {
	final org.gemoc.sample.legacyfsm.xsfsm.xsfsm.aspects.ActionAspectActionAspectProperties _self_ = org.gemoc.sample.legacyfsm.xsfsm.xsfsm.aspects.ActionAspectActionAspectContext
			.getSelf(_self);
	if (_self instanceof org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.NumberAction) {
		org.gemoc.sample.legacyfsm.xsfsm.xsfsm.aspects.NumberActionAspect
				.execute((org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.NumberAction) _self);
	} else if (_self instanceof org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.BooleanAction) {
		org.gemoc.sample.legacyfsm.xsfsm.xsfsm.aspects.BooleanActionAspect
				.execute((org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.BooleanAction) _self);
	} else if (_self instanceof org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.StringAction) {
		org.gemoc.sample.legacyfsm.xsfsm.xsfsm.aspects.StringActionAspect
				.execute((org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.StringAction) _self);
	} else if (_self instanceof org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.Action) {
		org.gemoc.sample.legacyfsm.xsfsm.xsfsm.aspects.ActionAspect._privk3_execute(_self_,
				(org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.Action) _self);
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

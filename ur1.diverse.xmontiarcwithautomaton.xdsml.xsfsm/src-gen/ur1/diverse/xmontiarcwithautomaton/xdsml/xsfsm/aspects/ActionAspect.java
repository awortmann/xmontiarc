package ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Abstract;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.fsm.Action;
import ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.aspects.ActionAspectActionAspectProperties;

@Aspect(className = Action.class)
@SuppressWarnings("all")
public abstract class ActionAspect {
  @Abstract
  public static void execute(final Action _self) {
	final ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.aspects.ActionAspectActionAspectProperties _self_ = ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.aspects.ActionAspectActionAspectContext
			.getSelf(_self);
	if (_self instanceof ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.fsm.NumberAction) {
		ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.aspects.NumberActionAspect
				.execute((ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.fsm.NumberAction) _self);
	} else if (_self instanceof ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.fsm.StringAction) {
		ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.aspects.StringActionAspect
				.execute((ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.fsm.StringAction) _self);
	} else if (_self instanceof ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.fsm.BooleanAction) {
		ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.aspects.BooleanActionAspect
				.execute((ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.fsm.BooleanAction) _self);
	} else if (_self instanceof ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.fsm.Action) {
		ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.aspects.ActionAspect._privk3_execute(_self_,
				(ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.fsm.Action) _self);
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

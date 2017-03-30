package org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Abstract;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.aspects.AutomatonComponentBehaviorAspectAutomatonComponentBehaviorAspectProperties;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.montiarc.AutomatonComponentBehavior;

@Aspect(className = AutomatonComponentBehavior.class)
@SuppressWarnings("all")
public abstract class AutomatonComponentBehaviorAspect {
  @Abstract
  public static void sendPortValuesToAutomaton(final AutomatonComponentBehavior _self) {
	final org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.aspects.AutomatonComponentBehaviorAspectAutomatonComponentBehaviorAspectProperties _self_ = org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.aspects.AutomatonComponentBehaviorAspectAutomatonComponentBehaviorAspectContext
			.getSelf(_self);
	if (_self instanceof org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.montiarc.AutomatonComponentBehavior) {
		org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.aspects.AutomatonComponentBehaviorGlueAspect
				.sendPortValuesToAutomaton(
						(org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.montiarc.AutomatonComponentBehavior) _self);
	} else {
		throw new IllegalArgumentException(
				"Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString());
	}
	;
}
  
  @Abstract
  public static void process(final AutomatonComponentBehavior _self) {
	final org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.aspects.AutomatonComponentBehaviorAspectAutomatonComponentBehaviorAspectProperties _self_ = org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.aspects.AutomatonComponentBehaviorAspectAutomatonComponentBehaviorAspectContext
			.getSelf(_self);
	if (_self instanceof org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.montiarc.AutomatonComponentBehavior) {
		org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.aspects.AutomatonComponentBehaviorGlueAspect
				.process((org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.montiarc.AutomatonComponentBehavior) _self);
	} else {
		throw new IllegalArgumentException(
				"Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString());
	}
	;
}
  
  @Abstract
  public static void setPortValuesFromAutomaton(final AutomatonComponentBehavior _self) {
	final org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.aspects.AutomatonComponentBehaviorAspectAutomatonComponentBehaviorAspectProperties _self_ = org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.aspects.AutomatonComponentBehaviorAspectAutomatonComponentBehaviorAspectContext
			.getSelf(_self);
	if (_self instanceof org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.montiarc.AutomatonComponentBehavior) {
		org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.aspects.AutomatonComponentBehaviorGlueAspect
				.setPortValuesFromAutomaton(
						(org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.montiarc.AutomatonComponentBehavior) _self);
	} else {
		throw new IllegalArgumentException(
				"Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString());
	}
	;
}
  
  protected static void _privk3_sendPortValuesToAutomaton(final AutomatonComponentBehaviorAspectAutomatonComponentBehaviorAspectProperties _self_, final AutomatonComponentBehavior _self) {
    throw new java.lang.RuntimeException("Not implemented");
  }
  
  protected static void _privk3_process(final AutomatonComponentBehaviorAspectAutomatonComponentBehaviorAspectProperties _self_, final AutomatonComponentBehavior _self) {
    throw new java.lang.RuntimeException("Not implemented");
  }
  
  protected static void _privk3_setPortValuesFromAutomaton(final AutomatonComponentBehaviorAspectAutomatonComponentBehaviorAspectProperties _self_, final AutomatonComponentBehavior _self) {
    throw new java.lang.RuntimeException("Not implemented");
  }
}

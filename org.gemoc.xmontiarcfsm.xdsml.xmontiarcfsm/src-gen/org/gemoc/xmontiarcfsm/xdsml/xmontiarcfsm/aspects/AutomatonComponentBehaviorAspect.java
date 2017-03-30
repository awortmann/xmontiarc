package org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Abstract;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.aspects.AutomatonComponentBehaviorAspectAutomatonComponentBehaviorAspectProperties;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.montiarc.AutomatonComponentBehavior;

@Aspect(className = AutomatonComponentBehavior.class)
@SuppressWarnings("all")
public abstract class AutomatonComponentBehaviorAspect {
  @Abstract
  public static void wrapPortValuesToAutomaton(final AutomatonComponentBehavior _self) {
	final org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.aspects.AutomatonComponentBehaviorAspectAutomatonComponentBehaviorAspectProperties _self_ = org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.aspects.AutomatonComponentBehaviorAspectAutomatonComponentBehaviorAspectContext
			.getSelf(_self);
	if (_self instanceof org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.montiarc.AutomatonComponentBehavior) {
		org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.aspects.AutomatonComponentBehaviorGlueAspect
				.wrapPortValuesToAutomaton(
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
  public static void unwrapPortValuesFromAutomaton(final AutomatonComponentBehavior _self) {
	final org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.aspects.AutomatonComponentBehaviorAspectAutomatonComponentBehaviorAspectProperties _self_ = org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.aspects.AutomatonComponentBehaviorAspectAutomatonComponentBehaviorAspectContext
			.getSelf(_self);
	if (_self instanceof org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.montiarc.AutomatonComponentBehavior) {
		org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.aspects.AutomatonComponentBehaviorGlueAspect
				.unwrapPortValuesFromAutomaton(
						(org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.montiarc.AutomatonComponentBehavior) _self);
	} else {
		throw new IllegalArgumentException(
				"Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString());
	}
	;
}
  
  protected static void _privk3_wrapPortValuesToAutomaton(final AutomatonComponentBehaviorAspectAutomatonComponentBehaviorAspectProperties _self_, final AutomatonComponentBehavior _self) {
    throw new java.lang.RuntimeException("Not implemented");
  }
  
  protected static void _privk3_process(final AutomatonComponentBehaviorAspectAutomatonComponentBehaviorAspectProperties _self_, final AutomatonComponentBehavior _self) {
    throw new java.lang.RuntimeException("Not implemented");
  }
  
  protected static void _privk3_unwrapPortValuesFromAutomaton(final AutomatonComponentBehaviorAspectAutomatonComponentBehaviorAspectProperties _self_, final AutomatonComponentBehavior _self) {
    throw new java.lang.RuntimeException("Not implemented");
  }
}

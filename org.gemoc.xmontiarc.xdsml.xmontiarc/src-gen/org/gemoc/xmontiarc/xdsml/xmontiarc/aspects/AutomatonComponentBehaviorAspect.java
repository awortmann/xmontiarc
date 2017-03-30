package org.gemoc.xmontiarc.xdsml.xmontiarc.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Abstract;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import org.gemoc.xmontiarc.xdsml.xmontiarc.aspects.AutomatonComponentBehaviorAspectAutomatonComponentBehaviorAspectProperties;
import org.gemoc.xmontiarc.xdsml.xmontiarc.montiarc.AutomatonComponentBehavior;

@Aspect(className = AutomatonComponentBehavior.class)
@SuppressWarnings("all")
public abstract class AutomatonComponentBehaviorAspect {
  @Abstract
  public static void sendPortValuesToAutomaton(final AutomatonComponentBehavior _self) {
	final org.gemoc.xmontiarc.xdsml.xmontiarc.aspects.AutomatonComponentBehaviorAspectAutomatonComponentBehaviorAspectProperties _self_ = org.gemoc.xmontiarc.xdsml.xmontiarc.aspects.AutomatonComponentBehaviorAspectAutomatonComponentBehaviorAspectContext
			.getSelf(_self);
	_privk3_sendPortValuesToAutomaton(_self_, _self);
	;
}
  
  @Abstract
  public static void process(final AutomatonComponentBehavior _self) {
	final org.gemoc.xmontiarc.xdsml.xmontiarc.aspects.AutomatonComponentBehaviorAspectAutomatonComponentBehaviorAspectProperties _self_ = org.gemoc.xmontiarc.xdsml.xmontiarc.aspects.AutomatonComponentBehaviorAspectAutomatonComponentBehaviorAspectContext
			.getSelf(_self);
	_privk3_process(_self_, _self);
	;
}
  
  @Abstract
  public static void setPortValuesFromAutomaton(final AutomatonComponentBehavior _self) {
	final org.gemoc.xmontiarc.xdsml.xmontiarc.aspects.AutomatonComponentBehaviorAspectAutomatonComponentBehaviorAspectProperties _self_ = org.gemoc.xmontiarc.xdsml.xmontiarc.aspects.AutomatonComponentBehaviorAspectAutomatonComponentBehaviorAspectContext
			.getSelf(_self);
	_privk3_setPortValuesFromAutomaton(_self_, _self);
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

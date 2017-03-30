package org.gemoc.xmontiarc.xdsml.xmontiarc.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import org.eclipse.emf.common.util.EMap;
import org.gemoc.xmontiarc.xdsml.xmontiarc.aspects.AutomatonComponentBehaviorAspectAutomatonComponentBehaviorAspectProperties;
import org.gemoc.xmontiarc.xdsml.xmontiarc.montiarc.AutomatonComponentBehavior;

@Aspect(className = AutomatonComponentBehavior.class)
@SuppressWarnings("all")
public class AutomatonComponentBehaviorAspect {
  public static void process(final AutomatonComponentBehavior _self, final EMap<String, Object> vars) {
    final org.gemoc.xmontiarc.xdsml.xmontiarc.aspects.AutomatonComponentBehaviorAspectAutomatonComponentBehaviorAspectProperties _self_ = org.gemoc.xmontiarc.xdsml.xmontiarc.aspects.AutomatonComponentBehaviorAspectAutomatonComponentBehaviorAspectContext.getSelf(_self);
    _privk3_process(_self_, _self,vars);;
  }
  
  protected static void _privk3_process(final AutomatonComponentBehaviorAspectAutomatonComponentBehaviorAspectProperties _self_, final AutomatonComponentBehavior _self, final EMap<String, Object> vars) {
  }
}

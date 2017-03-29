package org.gemoc.portautomata.fsm.k3dsa;

import fr.inria.diverse.k3.al.annotationprocessor.Abstract;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import org.gemoc.portautomata.fsm.Action;
import org.gemoc.portautomata.fsm.k3dsa.ActionAspectActionAspectProperties;

@Aspect(className = Action.class)
@SuppressWarnings("all")
public abstract class ActionAspect {
  @Abstract
  public static void execute(final Action _self) {
    final org.gemoc.portautomata.fsm.k3dsa.ActionAspectActionAspectProperties _self_ = org.gemoc.portautomata.fsm.k3dsa.ActionAspectActionAspectContext.getSelf(_self);
     if (_self instanceof org.gemoc.portautomata.fsm.BooleanAction){
    					org.gemoc.portautomata.fsm.k3dsa.BooleanActionAspect.execute((org.gemoc.portautomata.fsm.BooleanAction)_self);
    } else  if (_self instanceof org.gemoc.portautomata.fsm.StringAction){
    					org.gemoc.portautomata.fsm.k3dsa.StringActionAspect.execute((org.gemoc.portautomata.fsm.StringAction)_self);
    } else  if (_self instanceof org.gemoc.portautomata.fsm.NumberAction){
    					org.gemoc.portautomata.fsm.k3dsa.NumberActionAspect.execute((org.gemoc.portautomata.fsm.NumberAction)_self);
    } else  if (_self instanceof org.gemoc.portautomata.fsm.Action){
    					org.gemoc.portautomata.fsm.k3dsa.ActionAspect._privk3_execute(_self_, (org.gemoc.portautomata.fsm.Action)_self);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
  }
  
  protected static void _privk3_execute(final ActionAspectActionAspectProperties _self_, final Action _self) {
    throw new java.lang.RuntimeException("Not implemented");
  }
}

package org.gemoc.portautomata.fsm.k3dsa;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import org.gemoc.portautomata.fsm.LessThanNumberGuard;
import org.gemoc.portautomata.fsm.NumberVariable;
import org.gemoc.portautomata.fsm.k3dsa.LessThanNumberGuardAspectLessThanNumberGuardAspectProperties;
import org.gemoc.portautomata.fsm.k3dsa.NumberGuardAspect;
import org.gemoc.portautomata.fsm.k3dsa.NumberVariableAspect;

@Aspect(className = LessThanNumberGuard.class)
@SuppressWarnings("all")
public class LessThanNumberGuardAspect extends NumberGuardAspect {
  public static boolean holds(final LessThanNumberGuard _self) {
    final org.gemoc.portautomata.fsm.k3dsa.LessThanNumberGuardAspectLessThanNumberGuardAspectProperties _self_ = org.gemoc.portautomata.fsm.k3dsa.LessThanNumberGuardAspectLessThanNumberGuardAspectContext.getSelf(_self);
    Object result = null;
     if (_self instanceof org.gemoc.portautomata.fsm.LessThanNumberGuard){
    					result = org.gemoc.portautomata.fsm.k3dsa.LessThanNumberGuardAspect._privk3_holds(_self_, (org.gemoc.portautomata.fsm.LessThanNumberGuard)_self);
    } else  if (_self instanceof org.gemoc.portautomata.fsm.NumberGuard){
    					result = org.gemoc.portautomata.fsm.k3dsa.NumberGuardAspect.holds((org.gemoc.portautomata.fsm.NumberGuard)_self);
    } else  if (_self instanceof org.gemoc.portautomata.fsm.Guard){
    					result = org.gemoc.portautomata.fsm.k3dsa.GuardAspect.holds((org.gemoc.portautomata.fsm.Guard)_self);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
    return (boolean)result;
  }
  
  protected static boolean _privk3_holds(final LessThanNumberGuardAspectLessThanNumberGuardAspectProperties _self_, final LessThanNumberGuard _self) {
    final NumberVariable source = _self.getSource();
    final Long value = Long.valueOf(_self.getValue());
    Long _value = NumberVariableAspect.value(source);
    return (value.compareTo(_value) > 0);
  }
}

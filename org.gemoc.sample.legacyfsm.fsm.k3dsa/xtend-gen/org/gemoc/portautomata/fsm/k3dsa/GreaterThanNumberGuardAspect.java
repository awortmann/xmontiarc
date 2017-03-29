package org.gemoc.portautomata.fsm.k3dsa;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import org.gemoc.portautomata.fsm.GreaterThanNumberGuard;
import org.gemoc.portautomata.fsm.NumberVariable;
import org.gemoc.portautomata.fsm.k3dsa.GreaterThanNumberGuardAspectGreaterThanNumberGuardAspectProperties;
import org.gemoc.portautomata.fsm.k3dsa.NumberGuardAspect;
import org.gemoc.portautomata.fsm.k3dsa.NumberVariableAspect;

@Aspect(className = GreaterThanNumberGuard.class)
@SuppressWarnings("all")
public class GreaterThanNumberGuardAspect extends NumberGuardAspect {
  public static boolean holds(final GreaterThanNumberGuard _self) {
    final org.gemoc.portautomata.fsm.k3dsa.GreaterThanNumberGuardAspectGreaterThanNumberGuardAspectProperties _self_ = org.gemoc.portautomata.fsm.k3dsa.GreaterThanNumberGuardAspectGreaterThanNumberGuardAspectContext.getSelf(_self);
    Object result = null;
     if (_self instanceof org.gemoc.portautomata.fsm.GreaterThanNumberGuard){
    					result = org.gemoc.portautomata.fsm.k3dsa.GreaterThanNumberGuardAspect._privk3_holds(_self_, (org.gemoc.portautomata.fsm.GreaterThanNumberGuard)_self);
    } else  if (_self instanceof org.gemoc.portautomata.fsm.NumberGuard){
    					result = org.gemoc.portautomata.fsm.k3dsa.NumberGuardAspect.holds((org.gemoc.portautomata.fsm.NumberGuard)_self);
    } else  if (_self instanceof org.gemoc.portautomata.fsm.Guard){
    					result = org.gemoc.portautomata.fsm.k3dsa.GuardAspect.holds((org.gemoc.portautomata.fsm.Guard)_self);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
    return (boolean)result;
  }
  
  protected static boolean _privk3_holds(final GreaterThanNumberGuardAspectGreaterThanNumberGuardAspectProperties _self_, final GreaterThanNumberGuard _self) {
    final NumberVariable source = _self.getSource();
    final Long value = Long.valueOf(_self.getValue());
    Long _value = NumberVariableAspect.value(source);
    return (value.compareTo(_value) > 0);
  }
}

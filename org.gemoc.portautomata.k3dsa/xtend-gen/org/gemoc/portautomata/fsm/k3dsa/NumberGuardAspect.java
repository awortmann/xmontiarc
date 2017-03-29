package org.gemoc.portautomata.fsm.k3dsa;

import com.google.common.base.Objects;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import org.gemoc.portautomata.fsm.NumberGuard;
import org.gemoc.portautomata.fsm.NumberVariable;
import org.gemoc.portautomata.fsm.k3dsa.GuardAspect;
import org.gemoc.portautomata.fsm.k3dsa.NumberGuardAspectNumberGuardAspectProperties;
import org.gemoc.portautomata.fsm.k3dsa.NumberVariableAspect;

@Aspect(className = NumberGuard.class)
@SuppressWarnings("all")
public class NumberGuardAspect extends GuardAspect {
  public static boolean holds(final NumberGuard _self) {
    final org.gemoc.portautomata.fsm.k3dsa.NumberGuardAspectNumberGuardAspectProperties _self_ = org.gemoc.portautomata.fsm.k3dsa.NumberGuardAspectNumberGuardAspectContext.getSelf(_self);
    Object result = null;
     if (_self instanceof org.gemoc.portautomata.fsm.LessThanNumberGuard){
    					result = org.gemoc.portautomata.fsm.k3dsa.LessThanNumberGuardAspect.holds((org.gemoc.portautomata.fsm.LessThanNumberGuard)_self);
    } else  if (_self instanceof org.gemoc.portautomata.fsm.EqualNumberGuard){
    					result = org.gemoc.portautomata.fsm.k3dsa.EqualNumberGuardAspect.holds((org.gemoc.portautomata.fsm.EqualNumberGuard)_self);
    } else  if (_self instanceof org.gemoc.portautomata.fsm.LessOrEqualThanNumberGuard){
    					result = org.gemoc.portautomata.fsm.k3dsa.LessOrEqualThanNumberGuardAspect.holds((org.gemoc.portautomata.fsm.LessOrEqualThanNumberGuard)_self);
    } else  if (_self instanceof org.gemoc.portautomata.fsm.GreaterOrEqualThanNumberGuard){
    					result = org.gemoc.portautomata.fsm.k3dsa.GreaterOrEqualThanNumberGuardAspect.holds((org.gemoc.portautomata.fsm.GreaterOrEqualThanNumberGuard)_self);
    } else  if (_self instanceof org.gemoc.portautomata.fsm.GreaterThanNumberGuard){
    					result = org.gemoc.portautomata.fsm.k3dsa.GreaterThanNumberGuardAspect.holds((org.gemoc.portautomata.fsm.GreaterThanNumberGuard)_self);
    } else  if (_self instanceof org.gemoc.portautomata.fsm.NumberGuard){
    					result = org.gemoc.portautomata.fsm.k3dsa.NumberGuardAspect._privk3_holds(_self_, (org.gemoc.portautomata.fsm.NumberGuard)_self);
    } else  if (_self instanceof org.gemoc.portautomata.fsm.Guard){
    					result = org.gemoc.portautomata.fsm.k3dsa.GuardAspect.holds((org.gemoc.portautomata.fsm.Guard)_self);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
    return (boolean)result;
  }
  
  protected static boolean _privk3_holds(final NumberGuardAspectNumberGuardAspectProperties _self_, final NumberGuard _self) {
    final NumberVariable source = _self.getSource();
    final Long value = Long.valueOf(_self.getValue());
    Long _value = NumberVariableAspect.value(source);
    return Objects.equal(value, _value);
  }
}

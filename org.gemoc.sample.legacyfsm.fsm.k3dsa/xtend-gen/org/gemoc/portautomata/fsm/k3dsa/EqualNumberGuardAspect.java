package org.gemoc.portautomata.fsm.k3dsa;

import com.google.common.base.Objects;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import org.gemoc.portautomata.fsm.EqualNumberGuard;
import org.gemoc.portautomata.fsm.NumberVariable;
import org.gemoc.portautomata.fsm.k3dsa.EqualNumberGuardAspectEqualNumberGuardAspectProperties;
import org.gemoc.portautomata.fsm.k3dsa.NumberGuardAspect;
import org.gemoc.portautomata.fsm.k3dsa.NumberVariableAspect;

@Aspect(className = EqualNumberGuard.class)
@SuppressWarnings("all")
public class EqualNumberGuardAspect extends NumberGuardAspect {
  public static boolean holds(final EqualNumberGuard _self) {
    final org.gemoc.portautomata.fsm.k3dsa.EqualNumberGuardAspectEqualNumberGuardAspectProperties _self_ = org.gemoc.portautomata.fsm.k3dsa.EqualNumberGuardAspectEqualNumberGuardAspectContext.getSelf(_self);
    Object result = null;
     if (_self instanceof org.gemoc.portautomata.fsm.EqualNumberGuard){
    					result = org.gemoc.portautomata.fsm.k3dsa.EqualNumberGuardAspect._privk3_holds(_self_, (org.gemoc.portautomata.fsm.EqualNumberGuard)_self);
    } else  if (_self instanceof org.gemoc.portautomata.fsm.NumberGuard){
    					result = org.gemoc.portautomata.fsm.k3dsa.NumberGuardAspect.holds((org.gemoc.portautomata.fsm.NumberGuard)_self);
    } else  if (_self instanceof org.gemoc.portautomata.fsm.Guard){
    					result = org.gemoc.portautomata.fsm.k3dsa.GuardAspect.holds((org.gemoc.portautomata.fsm.Guard)_self);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
    return (boolean)result;
  }
  
  protected static boolean _privk3_holds(final EqualNumberGuardAspectEqualNumberGuardAspectProperties _self_, final EqualNumberGuard _self) {
    final NumberVariable source = _self.getSource();
    final Long value = Long.valueOf(_self.getValue());
    Long _value = NumberVariableAspect.value(source);
    return Objects.equal(value, _value);
  }
}

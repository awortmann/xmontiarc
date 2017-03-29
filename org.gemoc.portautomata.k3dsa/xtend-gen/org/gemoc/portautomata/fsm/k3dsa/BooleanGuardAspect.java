package org.gemoc.portautomata.fsm.k3dsa;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import org.gemoc.portautomata.fsm.BooleanGuard;
import org.gemoc.portautomata.fsm.BooleanVariable;
import org.gemoc.portautomata.fsm.k3dsa.BooleanGuardAspectBooleanGuardAspectProperties;
import org.gemoc.portautomata.fsm.k3dsa.BooleanVariableAspect;
import org.gemoc.portautomata.fsm.k3dsa.GuardAspect;

@Aspect(className = BooleanGuard.class)
@SuppressWarnings("all")
public class BooleanGuardAspect extends GuardAspect {
  public static boolean holds(final BooleanGuard _self) {
    final org.gemoc.portautomata.fsm.k3dsa.BooleanGuardAspectBooleanGuardAspectProperties _self_ = org.gemoc.portautomata.fsm.k3dsa.BooleanGuardAspectBooleanGuardAspectContext.getSelf(_self);
    Object result = null;
     if (_self instanceof org.gemoc.portautomata.fsm.BooleanGuard){
    					result = org.gemoc.portautomata.fsm.k3dsa.BooleanGuardAspect._privk3_holds(_self_, (org.gemoc.portautomata.fsm.BooleanGuard)_self);
    } else  if (_self instanceof org.gemoc.portautomata.fsm.Guard){
    					result = org.gemoc.portautomata.fsm.k3dsa.GuardAspect.holds((org.gemoc.portautomata.fsm.Guard)_self);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
    return (boolean)result;
  }
  
  protected static boolean _privk3_holds(final BooleanGuardAspectBooleanGuardAspectProperties _self_, final BooleanGuard _self) {
    final BooleanVariable source = _self.getSource();
    final boolean value = _self.isValue();
    boolean _isNot = _self.isNot();
    if (_isNot) {
      Boolean _value = BooleanVariableAspect.value(source);
      return (value != (_value).booleanValue());
    } else {
      Boolean _value_1 = BooleanVariableAspect.value(source);
      return (value == (_value_1).booleanValue());
    }
  }
}

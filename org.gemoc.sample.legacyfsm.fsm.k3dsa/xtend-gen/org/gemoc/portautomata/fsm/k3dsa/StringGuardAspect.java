package org.gemoc.portautomata.fsm.k3dsa;

import com.google.common.base.Objects;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import org.gemoc.portautomata.fsm.StringGuard;
import org.gemoc.portautomata.fsm.StringVariable;
import org.gemoc.portautomata.fsm.k3dsa.GuardAspect;
import org.gemoc.portautomata.fsm.k3dsa.StringGuardAspectStringGuardAspectProperties;
import org.gemoc.portautomata.fsm.k3dsa.StringVariableAspect;

@Aspect(className = StringGuard.class)
@SuppressWarnings("all")
public class StringGuardAspect extends GuardAspect {
  public static boolean holds(final StringGuard _self) {
    final org.gemoc.portautomata.fsm.k3dsa.StringGuardAspectStringGuardAspectProperties _self_ = org.gemoc.portautomata.fsm.k3dsa.StringGuardAspectStringGuardAspectContext.getSelf(_self);
    Object result = null;
     if (_self instanceof org.gemoc.portautomata.fsm.StringGuard){
    					result = org.gemoc.portautomata.fsm.k3dsa.StringGuardAspect._privk3_holds(_self_, (org.gemoc.portautomata.fsm.StringGuard)_self);
    } else  if (_self instanceof org.gemoc.portautomata.fsm.Guard){
    					result = org.gemoc.portautomata.fsm.k3dsa.GuardAspect.holds((org.gemoc.portautomata.fsm.Guard)_self);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
    return (boolean)result;
  }
  
  protected static boolean _privk3_holds(final StringGuardAspectStringGuardAspectProperties _self_, final StringGuard _self) {
    final StringVariable source = _self.getSource();
    final String value = _self.getValue();
    boolean _isNot = _self.isNot();
    if (_isNot) {
      String _value = StringVariableAspect.value(source);
      return (!Objects.equal(value, _value));
    } else {
      String _value_1 = StringVariableAspect.value(source);
      return Objects.equal(value, _value_1);
    }
  }
}

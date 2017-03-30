package org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.aspects;

import com.google.common.base.Objects;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.fsm.StringGuard;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.fsm.StringVariable;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.aspects.GuardAspect;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.aspects.StringGuardAspectStringGuardAspectProperties;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.aspects.StringVariableAspect;

@Aspect(className = StringGuard.class)
@SuppressWarnings("all")
public class StringGuardAspect extends GuardAspect {
  public static boolean holds(final StringGuard _self) {
	final org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.aspects.StringGuardAspectStringGuardAspectProperties _self_ = org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.aspects.StringGuardAspectStringGuardAspectContext
			.getSelf(_self);
	Object result = null;
	result = _privk3_holds(_self_, _self);
	;
	return (boolean) result;
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

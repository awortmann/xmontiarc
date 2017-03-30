package org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.aspects;

import com.google.common.base.Objects;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.fsm.EqualNumberGuard;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.fsm.NumberVariable;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.aspects.EqualNumberGuardAspectEqualNumberGuardAspectProperties;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.aspects.NumberGuardAspect;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.aspects.NumberVariableAspect;

@Aspect(className = EqualNumberGuard.class)
@SuppressWarnings("all")
public class EqualNumberGuardAspect extends NumberGuardAspect {
  public static boolean holds(final EqualNumberGuard _self) {
	final org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.aspects.EqualNumberGuardAspectEqualNumberGuardAspectProperties _self_ = org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.aspects.EqualNumberGuardAspectEqualNumberGuardAspectContext
			.getSelf(_self);
	Object result = null;
	result = _privk3_holds(_self_, _self);
	;
	return (boolean) result;
}
  
  protected static boolean _privk3_holds(final EqualNumberGuardAspectEqualNumberGuardAspectProperties _self_, final EqualNumberGuard _self) {
    final NumberVariable source = _self.getSource();
    final Long value = Long.valueOf(_self.getValue());
    Long _value = NumberVariableAspect.value(source);
    return Objects.equal(value, _value);
  }
}

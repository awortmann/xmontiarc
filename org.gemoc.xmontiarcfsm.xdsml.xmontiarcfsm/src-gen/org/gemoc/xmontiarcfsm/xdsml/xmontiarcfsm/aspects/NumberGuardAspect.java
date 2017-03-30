package org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.aspects;

import com.google.common.base.Objects;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.fsm.NumberGuard;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.fsm.NumberVariable;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.aspects.GuardAspect;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.aspects.NumberGuardAspectNumberGuardAspectProperties;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.aspects.NumberVariableAspect;

@Aspect(className = NumberGuard.class)
@SuppressWarnings("all")
public class NumberGuardAspect extends GuardAspect {
  public static boolean holds(final NumberGuard _self) {
	final org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.aspects.NumberGuardAspectNumberGuardAspectProperties _self_ = org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.aspects.NumberGuardAspectNumberGuardAspectContext
			.getSelf(_self);
	Object result = null;
	if (_self instanceof org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.fsm.LessThanNumberGuard) {
		result = org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.aspects.LessThanNumberGuardAspect
				.holds((org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.fsm.LessThanNumberGuard) _self);
	} else if (_self instanceof org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.fsm.GreaterOrEqualThanNumberGuard) {
		result = org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.aspects.GreaterOrEqualThanNumberGuardAspect
				.holds((org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.fsm.GreaterOrEqualThanNumberGuard) _self);
	} else if (_self instanceof org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.fsm.EqualNumberGuard) {
		result = org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.aspects.EqualNumberGuardAspect
				.holds((org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.fsm.EqualNumberGuard) _self);
	} else if (_self instanceof org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.fsm.LessOrEqualThanNumberGuard) {
		result = org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.aspects.LessOrEqualThanNumberGuardAspect
				.holds((org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.fsm.LessOrEqualThanNumberGuard) _self);
	} else if (_self instanceof org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.fsm.GreaterThanNumberGuard) {
		result = org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.aspects.GreaterThanNumberGuardAspect
				.holds((org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.fsm.GreaterThanNumberGuard) _self);
	} else if (_self instanceof org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.fsm.NumberGuard) {
		result = org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.aspects.NumberGuardAspect._privk3_holds(_self_,
				(org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.fsm.NumberGuard) _self);
	} else {
		throw new IllegalArgumentException(
				"Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString());
	}
	;
	return (boolean) result;
}
  
  protected static boolean _privk3_holds(final NumberGuardAspectNumberGuardAspectProperties _self_, final NumberGuard _self) {
    final NumberVariable source = _self.getSource();
    final Long value = Long.valueOf(_self.getValue());
    Long _value = NumberVariableAspect.value(source);
    return Objects.equal(value, _value);
  }
}

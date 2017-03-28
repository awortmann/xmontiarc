package org.gemoc.sample.legacyfsm.xsfsm.xsfsm.aspects;

import com.google.common.base.Objects;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.NumberGuard;
import org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.NumberVariable;
import org.gemoc.sample.legacyfsm.xsfsm.xsfsm.aspects.GuardAspect;
import org.gemoc.sample.legacyfsm.xsfsm.xsfsm.aspects.NumberGuardAspectNumberGuardAspectProperties;
import org.gemoc.sample.legacyfsm.xsfsm.xsfsm.aspects.NumberVariableAspect;

@Aspect(className = NumberGuard.class)
@SuppressWarnings("all")
public class NumberGuardAspect extends GuardAspect {
  public static boolean holds(final NumberGuard _self) {
	final org.gemoc.sample.legacyfsm.xsfsm.xsfsm.aspects.NumberGuardAspectNumberGuardAspectProperties _self_ = org.gemoc.sample.legacyfsm.xsfsm.xsfsm.aspects.NumberGuardAspectNumberGuardAspectContext
			.getSelf(_self);
	Object result = null;
	if (_self instanceof org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.LessOrEqualThanNumberGuard) {
		result = org.gemoc.sample.legacyfsm.xsfsm.xsfsm.aspects.LessOrEqualThanNumberGuardAspect
				.holds((org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.LessOrEqualThanNumberGuard) _self);
	} else if (_self instanceof org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.EqualNumberGuard) {
		result = org.gemoc.sample.legacyfsm.xsfsm.xsfsm.aspects.EqualNumberGuardAspect
				.holds((org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.EqualNumberGuard) _self);
	} else if (_self instanceof org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.LessThanNumberGuard) {
		result = org.gemoc.sample.legacyfsm.xsfsm.xsfsm.aspects.LessThanNumberGuardAspect
				.holds((org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.LessThanNumberGuard) _self);
	} else if (_self instanceof org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.GreaterOrEqualThanNumberGuard) {
		result = org.gemoc.sample.legacyfsm.xsfsm.xsfsm.aspects.GreaterOrEqualThanNumberGuardAspect
				.holds((org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.GreaterOrEqualThanNumberGuard) _self);
	} else if (_self instanceof org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.GreaterThanNumberGuard) {
		result = org.gemoc.sample.legacyfsm.xsfsm.xsfsm.aspects.GreaterThanNumberGuardAspect
				.holds((org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.GreaterThanNumberGuard) _self);
	} else if (_self instanceof org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.NumberGuard) {
		result = org.gemoc.sample.legacyfsm.xsfsm.xsfsm.aspects.NumberGuardAspect._privk3_holds(_self_,
				(org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.NumberGuard) _self);
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

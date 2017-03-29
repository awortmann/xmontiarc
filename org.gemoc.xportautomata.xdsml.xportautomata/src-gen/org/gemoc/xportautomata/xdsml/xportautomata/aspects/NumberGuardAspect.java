package org.gemoc.xportautomata.xdsml.xportautomata.aspects;

import com.google.common.base.Objects;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import org.gemoc.xportautomata.xdsml.xportautomata.fsm.NumberGuard;
import org.gemoc.xportautomata.xdsml.xportautomata.fsm.NumberVariable;
import org.gemoc.xportautomata.xdsml.xportautomata.aspects.GuardAspect;
import org.gemoc.xportautomata.xdsml.xportautomata.aspects.NumberGuardAspectNumberGuardAspectProperties;
import org.gemoc.xportautomata.xdsml.xportautomata.aspects.NumberVariableAspect;

@Aspect(className = NumberGuard.class)
@SuppressWarnings("all")
public class NumberGuardAspect extends GuardAspect {
  public static boolean holds(final NumberGuard _self) {
	final org.gemoc.xportautomata.xdsml.xportautomata.aspects.NumberGuardAspectNumberGuardAspectProperties _self_ = org.gemoc.xportautomata.xdsml.xportautomata.aspects.NumberGuardAspectNumberGuardAspectContext
			.getSelf(_self);
	Object result = null;
	if (_self instanceof org.gemoc.xportautomata.xdsml.xportautomata.fsm.GreaterOrEqualThanNumberGuard) {
		result = org.gemoc.xportautomata.xdsml.xportautomata.aspects.GreaterOrEqualThanNumberGuardAspect
				.holds((org.gemoc.xportautomata.xdsml.xportautomata.fsm.GreaterOrEqualThanNumberGuard) _self);
	} else if (_self instanceof org.gemoc.xportautomata.xdsml.xportautomata.fsm.LessOrEqualThanNumberGuard) {
		result = org.gemoc.xportautomata.xdsml.xportautomata.aspects.LessOrEqualThanNumberGuardAspect
				.holds((org.gemoc.xportautomata.xdsml.xportautomata.fsm.LessOrEqualThanNumberGuard) _self);
	} else if (_self instanceof org.gemoc.xportautomata.xdsml.xportautomata.fsm.LessThanNumberGuard) {
		result = org.gemoc.xportautomata.xdsml.xportautomata.aspects.LessThanNumberGuardAspect
				.holds((org.gemoc.xportautomata.xdsml.xportautomata.fsm.LessThanNumberGuard) _self);
	} else if (_self instanceof org.gemoc.xportautomata.xdsml.xportautomata.fsm.EqualNumberGuard) {
		result = org.gemoc.xportautomata.xdsml.xportautomata.aspects.EqualNumberGuardAspect
				.holds((org.gemoc.xportautomata.xdsml.xportautomata.fsm.EqualNumberGuard) _self);
	} else if (_self instanceof org.gemoc.xportautomata.xdsml.xportautomata.fsm.GreaterThanNumberGuard) {
		result = org.gemoc.xportautomata.xdsml.xportautomata.aspects.GreaterThanNumberGuardAspect
				.holds((org.gemoc.xportautomata.xdsml.xportautomata.fsm.GreaterThanNumberGuard) _self);
	} else if (_self instanceof org.gemoc.xportautomata.xdsml.xportautomata.fsm.NumberGuard) {
		result = org.gemoc.xportautomata.xdsml.xportautomata.aspects.NumberGuardAspect._privk3_holds(_self_,
				(org.gemoc.xportautomata.xdsml.xportautomata.fsm.NumberGuard) _self);
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

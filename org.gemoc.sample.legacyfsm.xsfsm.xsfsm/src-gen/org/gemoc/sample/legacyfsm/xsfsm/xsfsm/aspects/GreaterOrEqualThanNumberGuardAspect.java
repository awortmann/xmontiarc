package org.gemoc.sample.legacyfsm.xsfsm.xsfsm.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.GreaterOrEqualThanNumberGuard;
import org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.NumberVariable;
import org.gemoc.sample.legacyfsm.xsfsm.xsfsm.aspects.GreaterOrEqualThanNumberGuardAspectGreaterOrEqualThanNumberGuardAspectProperties;
import org.gemoc.sample.legacyfsm.xsfsm.xsfsm.aspects.NumberGuardAspect;
import org.gemoc.sample.legacyfsm.xsfsm.xsfsm.aspects.NumberVariableAspect;

@Aspect(className = GreaterOrEqualThanNumberGuard.class)
@SuppressWarnings("all")
public class GreaterOrEqualThanNumberGuardAspect extends NumberGuardAspect {
  public static boolean holds(final GreaterOrEqualThanNumberGuard _self) {
	final org.gemoc.sample.legacyfsm.xsfsm.xsfsm.aspects.GreaterOrEqualThanNumberGuardAspectGreaterOrEqualThanNumberGuardAspectProperties _self_ = org.gemoc.sample.legacyfsm.xsfsm.xsfsm.aspects.GreaterOrEqualThanNumberGuardAspectGreaterOrEqualThanNumberGuardAspectContext
			.getSelf(_self);
	Object result = null;
	result = _privk3_holds(_self_, _self);
	;
	return (boolean) result;
}
  
  protected static boolean _privk3_holds(final GreaterOrEqualThanNumberGuardAspectGreaterOrEqualThanNumberGuardAspectProperties _self_, final GreaterOrEqualThanNumberGuard _self) {
    final NumberVariable source = _self.getSource();
    final Long value = Long.valueOf(_self.getValue());
    Long _value = NumberVariableAspect.value(source);
    return (value.compareTo(_value) >= 0);
  }
}

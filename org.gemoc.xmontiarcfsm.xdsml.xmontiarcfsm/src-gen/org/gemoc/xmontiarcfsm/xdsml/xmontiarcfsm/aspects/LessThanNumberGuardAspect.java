package org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.fsm.LessThanNumberGuard;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.fsm.NumberVariable;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.aspects.LessThanNumberGuardAspectLessThanNumberGuardAspectProperties;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.aspects.NumberGuardAspect;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.aspects.NumberVariableAspect;

@Aspect(className = LessThanNumberGuard.class)
@SuppressWarnings("all")
public class LessThanNumberGuardAspect extends NumberGuardAspect {
  public static boolean holds(final LessThanNumberGuard _self) {
	final org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.aspects.LessThanNumberGuardAspectLessThanNumberGuardAspectProperties _self_ = org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.aspects.LessThanNumberGuardAspectLessThanNumberGuardAspectContext
			.getSelf(_self);
	Object result = null;
	result = _privk3_holds(_self_, _self);
	;
	return (boolean) result;
}
  
  protected static boolean _privk3_holds(final LessThanNumberGuardAspectLessThanNumberGuardAspectProperties _self_, final LessThanNumberGuard _self) {
    final NumberVariable source = _self.getSource();
    final Long value = Long.valueOf(_self.getValue());
    Long _value = NumberVariableAspect.value(source);
    return (value.compareTo(_value) > 0);
  }
}

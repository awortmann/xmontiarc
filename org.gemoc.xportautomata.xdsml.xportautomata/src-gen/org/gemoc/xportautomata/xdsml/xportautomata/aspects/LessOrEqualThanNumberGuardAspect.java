package org.gemoc.xportautomata.xdsml.xportautomata.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import org.gemoc.xportautomata.xdsml.xportautomata.fsm.LessOrEqualThanNumberGuard;
import org.gemoc.xportautomata.xdsml.xportautomata.fsm.NumberVariable;
import org.gemoc.xportautomata.xdsml.xportautomata.aspects.LessOrEqualThanNumberGuardAspectLessOrEqualThanNumberGuardAspectProperties;
import org.gemoc.xportautomata.xdsml.xportautomata.aspects.NumberGuardAspect;
import org.gemoc.xportautomata.xdsml.xportautomata.aspects.NumberVariableAspect;

@Aspect(className = LessOrEqualThanNumberGuard.class)
@SuppressWarnings("all")
public class LessOrEqualThanNumberGuardAspect extends NumberGuardAspect {
  public static boolean holds(final LessOrEqualThanNumberGuard _self) {
	final org.gemoc.xportautomata.xdsml.xportautomata.aspects.LessOrEqualThanNumberGuardAspectLessOrEqualThanNumberGuardAspectProperties _self_ = org.gemoc.xportautomata.xdsml.xportautomata.aspects.LessOrEqualThanNumberGuardAspectLessOrEqualThanNumberGuardAspectContext
			.getSelf(_self);
	Object result = null;
	result = _privk3_holds(_self_, _self);
	;
	return (boolean) result;
}
  
  protected static boolean _privk3_holds(final LessOrEqualThanNumberGuardAspectLessOrEqualThanNumberGuardAspectProperties _self_, final LessOrEqualThanNumberGuard _self) {
    final NumberVariable source = _self.getSource();
    final Long value = Long.valueOf(_self.getValue());
    Long _value = NumberVariableAspect.value(source);
    return (value.compareTo(_value) >= 0);
  }
}

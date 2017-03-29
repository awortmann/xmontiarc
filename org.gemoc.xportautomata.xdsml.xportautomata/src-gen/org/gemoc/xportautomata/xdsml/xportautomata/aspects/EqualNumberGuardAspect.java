package org.gemoc.xportautomata.xdsml.xportautomata.aspects;

import com.google.common.base.Objects;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import org.gemoc.xportautomata.xdsml.xportautomata.fsm.EqualNumberGuard;
import org.gemoc.xportautomata.xdsml.xportautomata.fsm.NumberVariable;
import org.gemoc.xportautomata.xdsml.xportautomata.aspects.EqualNumberGuardAspectEqualNumberGuardAspectProperties;
import org.gemoc.xportautomata.xdsml.xportautomata.aspects.NumberGuardAspect;
import org.gemoc.xportautomata.xdsml.xportautomata.aspects.NumberVariableAspect;

@Aspect(className = EqualNumberGuard.class)
@SuppressWarnings("all")
public class EqualNumberGuardAspect extends NumberGuardAspect {
  public static boolean holds(final EqualNumberGuard _self) {
	final org.gemoc.xportautomata.xdsml.xportautomata.aspects.EqualNumberGuardAspectEqualNumberGuardAspectProperties _self_ = org.gemoc.xportautomata.xdsml.xportautomata.aspects.EqualNumberGuardAspectEqualNumberGuardAspectContext
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

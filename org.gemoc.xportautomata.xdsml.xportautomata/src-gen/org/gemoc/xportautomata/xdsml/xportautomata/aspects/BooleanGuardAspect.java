package org.gemoc.xportautomata.xdsml.xportautomata.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import org.gemoc.xportautomata.xdsml.xportautomata.fsm.BooleanGuard;
import org.gemoc.xportautomata.xdsml.xportautomata.fsm.BooleanVariable;
import org.gemoc.xportautomata.xdsml.xportautomata.aspects.BooleanGuardAspectBooleanGuardAspectProperties;
import org.gemoc.xportautomata.xdsml.xportautomata.aspects.BooleanVariableAspect;
import org.gemoc.xportautomata.xdsml.xportautomata.aspects.GuardAspect;

@Aspect(className = BooleanGuard.class)
@SuppressWarnings("all")
public class BooleanGuardAspect extends GuardAspect {
  public static boolean holds(final BooleanGuard _self) {
	final org.gemoc.xportautomata.xdsml.xportautomata.aspects.BooleanGuardAspectBooleanGuardAspectProperties _self_ = org.gemoc.xportautomata.xdsml.xportautomata.aspects.BooleanGuardAspectBooleanGuardAspectContext
			.getSelf(_self);
	Object result = null;
	result = _privk3_holds(_self_, _self);
	;
	return (boolean) result;
}
  
  protected static boolean _privk3_holds(final BooleanGuardAspectBooleanGuardAspectProperties _self_, final BooleanGuard _self) {
    final BooleanVariable source = _self.getSource();
    final boolean value = _self.isValue();
    boolean _isNot = _self.isNot();
    if (_isNot) {
      Boolean _value = BooleanVariableAspect.value(source);
      return (value != (_value).booleanValue());
    } else {
      Boolean _value_1 = BooleanVariableAspect.value(source);
      return (value == (_value_1).booleanValue());
    }
  }
}

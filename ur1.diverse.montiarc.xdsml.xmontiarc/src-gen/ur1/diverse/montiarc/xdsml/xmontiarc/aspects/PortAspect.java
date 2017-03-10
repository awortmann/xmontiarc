package ur1.diverse.montiarc.xdsml.xmontiarc.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import ur1.diverse.montiarc.xdsml.xmontiarc.montiarc.Port;
import ur1.diverse.montiarc.xdsml.xmontiarc.montiarcruntime.PortValue;
import ur1.diverse.montiarc.xdsml.xmontiarc.aspects.PortAspectPortAspectProperties;

@Aspect(className = Port.class)
@SuppressWarnings("all")
public class PortAspect {
  public static PortValue portValue(final Port _self) {
	final ur1.diverse.montiarc.xdsml.xmontiarc.aspects.PortAspectPortAspectProperties _self_ = ur1.diverse.montiarc.xdsml.xmontiarc.aspects.PortAspectPortAspectContext
			.getSelf(_self);
	Object result = null;
	result = _privk3_portValue(_self_, _self);
	;
	return (ur1.diverse.montiarc.xdsml.xmontiarc.montiarcruntime.PortValue) result;
}
  
  public static void portValue(final Port _self, final PortValue portValue) {
	final ur1.diverse.montiarc.xdsml.xmontiarc.aspects.PortAspectPortAspectProperties _self_ = ur1.diverse.montiarc.xdsml.xmontiarc.aspects.PortAspectPortAspectContext
			.getSelf(_self);
	_privk3_portValue(_self_, _self, portValue);
	;
}
  
  protected static PortValue _privk3_portValue(final PortAspectPortAspectProperties _self_, final Port _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getPortValue") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (ur1.diverse.montiarc.xdsml.xmontiarc.montiarcruntime.PortValue) ret;
    				}
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.portValue;
  }
  
  protected static void _privk3_portValue(final PortAspectPortAspectProperties _self_, final Port _self, final PortValue portValue) {
    _self_.portValue = portValue; try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setPortValue")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, portValue);
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
  }
}

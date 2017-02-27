package ur1.diverse.montiarc.xdsml.montiarc.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import montiarc.PortInstance;
import montiarcruntime.PortValue;
import ur1.diverse.montiarc.xdsml.montiarc.aspects.PortInstanceAspectPortInstanceAspectProperties;

@Aspect(className = PortInstance.class)
@SuppressWarnings("all")
public class PortInstanceAspect {
  public static PortValue portValue(final PortInstance _self) {
    final ur1.diverse.montiarc.xdsml.montiarc.aspects.PortInstanceAspectPortInstanceAspectProperties _self_ = ur1.diverse.montiarc.xdsml.montiarc.aspects.PortInstanceAspectPortInstanceAspectContext.getSelf(_self);
    Object result = null;
    result = _privk3_portValue(_self_, _self);;
    return (montiarcruntime.PortValue)result;
  }
  
  public static void portValue(final PortInstance _self, final PortValue portValue) {
    final ur1.diverse.montiarc.xdsml.montiarc.aspects.PortInstanceAspectPortInstanceAspectProperties _self_ = ur1.diverse.montiarc.xdsml.montiarc.aspects.PortInstanceAspectPortInstanceAspectContext.getSelf(_self);
    _privk3_portValue(_self_, _self,portValue);;
  }
  
  protected static PortValue _privk3_portValue(final PortInstanceAspectPortInstanceAspectProperties _self_, final PortInstance _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getPortValue") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (montiarcruntime.PortValue) ret;
    				}
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.portValue;
  }
  
  protected static void _privk3_portValue(final PortInstanceAspectPortInstanceAspectProperties _self_, final PortInstance _self, final PortValue portValue) {
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

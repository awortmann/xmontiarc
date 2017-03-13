package ur1.diverse.xmontiarc.xdsml.xmontiarc.adapters.xmontiarcmt;

import fr.inria.diverse.melange.adapters.AdaptersFactory;
import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.WeakHashMap;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import ur1.diverse.xmontiarc.xdsml.xmontiarc.adapters.xmontiarcmt.runtime.MessageAdapter;
import ur1.diverse.xmontiarc.xdsml.xmontiarc.adapters.xmontiarcmt.xmontiarc.ComponentTypeAdapter;
import ur1.diverse.xmontiarc.xdsml.xmontiarc.adapters.xmontiarcmt.xmontiarc.ConnectorAdapter;
import ur1.diverse.xmontiarc.xdsml.xmontiarc.adapters.xmontiarcmt.xmontiarc.PortAdapter;
import ur1.diverse.xmontiarc.xdsml.xmontiarc.adapters.xmontiarcmt.xmontiarc.SubcomponentAdapter;
import ur1.diverse.xmontiarc.xdsml.xmontiarc.runtime.Message;
import ur1.diverse.xmontiarc.xdsml.xmontiarc.xmontiarc.ComponentType;
import ur1.diverse.xmontiarc.xdsml.xmontiarc.xmontiarc.Connector;
import ur1.diverse.xmontiarc.xdsml.xmontiarc.xmontiarc.Port;
import ur1.diverse.xmontiarc.xdsml.xmontiarc.xmontiarc.Subcomponent;

@SuppressWarnings("all")
public class XMontiArcMTAdaptersFactory implements AdaptersFactory {
  private static XMontiArcMTAdaptersFactory instance;
  
  public static XMontiArcMTAdaptersFactory getInstance() {
    if (instance == null) {
    	instance = new ur1.diverse.xmontiarc.xdsml.xmontiarc.adapters.xmontiarcmt.XMontiArcMTAdaptersFactory();
    }
    return instance;
  }
  
  private WeakHashMap<EObject, EObjectAdapter> register;
  
  public XMontiArcMTAdaptersFactory() {
    register = new WeakHashMap();
  }
  
  public EObjectAdapter createAdapter(final EObject o, final Resource res) {
    if (o instanceof ur1.diverse.xmontiarc.xdsml.xmontiarc.xmontiarc.ComponentType){
    	return createComponentTypeAdapter((ur1.diverse.xmontiarc.xdsml.xmontiarc.xmontiarc.ComponentType) o, res);
    }
    if (o instanceof ur1.diverse.xmontiarc.xdsml.xmontiarc.xmontiarc.Port){
    	return createPortAdapter((ur1.diverse.xmontiarc.xdsml.xmontiarc.xmontiarc.Port) o, res);
    }
    if (o instanceof ur1.diverse.xmontiarc.xdsml.xmontiarc.xmontiarc.Connector){
    	return createConnectorAdapter((ur1.diverse.xmontiarc.xdsml.xmontiarc.xmontiarc.Connector) o, res);
    }
    if (o instanceof ur1.diverse.xmontiarc.xdsml.xmontiarc.xmontiarc.Subcomponent){
    	return createSubcomponentAdapter((ur1.diverse.xmontiarc.xdsml.xmontiarc.xmontiarc.Subcomponent) o, res);
    }
    if (o instanceof ur1.diverse.xmontiarc.xdsml.xmontiarc.runtime.Message){
    	return createMessageAdapter((ur1.diverse.xmontiarc.xdsml.xmontiarc.runtime.Message) o, res);
    }
    
    return null;
  }
  
  public ComponentTypeAdapter createComponentTypeAdapter(final ComponentType adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (ur1.diverse.xmontiarc.xdsml.xmontiarc.adapters.xmontiarcmt.xmontiarc.ComponentTypeAdapter) adapter;
    else {
    	adapter = new ur1.diverse.xmontiarc.xdsml.xmontiarc.adapters.xmontiarcmt.xmontiarc.ComponentTypeAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (ur1.diverse.xmontiarc.xdsml.xmontiarc.adapters.xmontiarcmt.xmontiarc.ComponentTypeAdapter) adapter;
    }
  }
  
  public PortAdapter createPortAdapter(final Port adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (ur1.diverse.xmontiarc.xdsml.xmontiarc.adapters.xmontiarcmt.xmontiarc.PortAdapter) adapter;
    else {
    	adapter = new ur1.diverse.xmontiarc.xdsml.xmontiarc.adapters.xmontiarcmt.xmontiarc.PortAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (ur1.diverse.xmontiarc.xdsml.xmontiarc.adapters.xmontiarcmt.xmontiarc.PortAdapter) adapter;
    }
  }
  
  public ConnectorAdapter createConnectorAdapter(final Connector adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (ur1.diverse.xmontiarc.xdsml.xmontiarc.adapters.xmontiarcmt.xmontiarc.ConnectorAdapter) adapter;
    else {
    	adapter = new ur1.diverse.xmontiarc.xdsml.xmontiarc.adapters.xmontiarcmt.xmontiarc.ConnectorAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (ur1.diverse.xmontiarc.xdsml.xmontiarc.adapters.xmontiarcmt.xmontiarc.ConnectorAdapter) adapter;
    }
  }
  
  public SubcomponentAdapter createSubcomponentAdapter(final Subcomponent adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (ur1.diverse.xmontiarc.xdsml.xmontiarc.adapters.xmontiarcmt.xmontiarc.SubcomponentAdapter) adapter;
    else {
    	adapter = new ur1.diverse.xmontiarc.xdsml.xmontiarc.adapters.xmontiarcmt.xmontiarc.SubcomponentAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (ur1.diverse.xmontiarc.xdsml.xmontiarc.adapters.xmontiarcmt.xmontiarc.SubcomponentAdapter) adapter;
    }
  }
  
  public MessageAdapter createMessageAdapter(final Message adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (ur1.diverse.xmontiarc.xdsml.xmontiarc.adapters.xmontiarcmt.runtime.MessageAdapter) adapter;
    else {
    	adapter = new ur1.diverse.xmontiarc.xdsml.xmontiarc.adapters.xmontiarcmt.runtime.MessageAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (ur1.diverse.xmontiarc.xdsml.xmontiarc.adapters.xmontiarcmt.runtime.MessageAdapter) adapter;
    }
  }
}

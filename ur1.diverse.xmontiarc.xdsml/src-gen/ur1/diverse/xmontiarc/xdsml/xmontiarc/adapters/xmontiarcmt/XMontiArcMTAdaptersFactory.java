package ur1.diverse.xmontiarc.xdsml.xmontiarc.adapters.xmontiarcmt;

import fr.inria.diverse.melange.adapters.AdaptersFactory;
import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.WeakHashMap;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import ur1.diverse.xmontiarc.xdsml.xmontiarc.runtime.Message;
import ur1.diverse.xmontiarc.xdsml.xmontiarc.xmontiarc.ComponentType;
import ur1.diverse.xmontiarc.xdsml.xmontiarc.xmontiarc.Connector;
import ur1.diverse.xmontiarc.xdsml.xmontiarc.xmontiarc.IncomingConnector;
import ur1.diverse.xmontiarc.xdsml.xmontiarc.xmontiarc.IncomingPort;
import ur1.diverse.xmontiarc.xdsml.xmontiarc.xmontiarc.IntermediateConnector;
import ur1.diverse.xmontiarc.xdsml.xmontiarc.xmontiarc.OutgoingConnector;
import ur1.diverse.xmontiarc.xdsml.xmontiarc.xmontiarc.OutgoingPort;
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
    if (o instanceof ur1.diverse.xmontiarc.xdsml.xmontiarc.runtime.Message){
    	return createMessageAdapter((ur1.diverse.xmontiarc.xdsml.xmontiarc.runtime.Message) o, res);
    }
    if (o instanceof ur1.diverse.xmontiarc.xdsml.xmontiarc.xmontiarc.ComponentType){
    	return createComponentTypeAdapter((ur1.diverse.xmontiarc.xdsml.xmontiarc.xmontiarc.ComponentType) o, res);
    }
    if (o instanceof ur1.diverse.xmontiarc.xdsml.xmontiarc.xmontiarc.IncomingPort){
    	return createIncomingPortAdapter((ur1.diverse.xmontiarc.xdsml.xmontiarc.xmontiarc.IncomingPort) o, res);
    }
    if (o instanceof ur1.diverse.xmontiarc.xdsml.xmontiarc.xmontiarc.OutgoingPort){
    	return createOutgoingPortAdapter((ur1.diverse.xmontiarc.xdsml.xmontiarc.xmontiarc.OutgoingPort) o, res);
    }
    if (o instanceof ur1.diverse.xmontiarc.xdsml.xmontiarc.xmontiarc.Port){
    	return createPortAdapter((ur1.diverse.xmontiarc.xdsml.xmontiarc.xmontiarc.Port) o, res);
    }
    if (o instanceof ur1.diverse.xmontiarc.xdsml.xmontiarc.xmontiarc.IntermediateConnector){
    	return createIntermediateConnectorAdapter((ur1.diverse.xmontiarc.xdsml.xmontiarc.xmontiarc.IntermediateConnector) o, res);
    }
    if (o instanceof ur1.diverse.xmontiarc.xdsml.xmontiarc.xmontiarc.IncomingConnector){
    	return createIncomingConnectorAdapter((ur1.diverse.xmontiarc.xdsml.xmontiarc.xmontiarc.IncomingConnector) o, res);
    }
    if (o instanceof ur1.diverse.xmontiarc.xdsml.xmontiarc.xmontiarc.OutgoingConnector){
    	return createOutgoingConnectorAdapter((ur1.diverse.xmontiarc.xdsml.xmontiarc.xmontiarc.OutgoingConnector) o, res);
    }
    if (o instanceof ur1.diverse.xmontiarc.xdsml.xmontiarc.xmontiarc.Subcomponent){
    	return createSubcomponentAdapter((ur1.diverse.xmontiarc.xdsml.xmontiarc.xmontiarc.Subcomponent) o, res);
    }
    
    return null;
  }
  
  public ur1.diverse.xmontiarc.xdsml.xmontiarc.adapters.xmontiarcmt.runtime.MessageAdapter createMessageAdapter(final Message adaptee, final Resource res) {
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
  
  public ur1.diverse.xmontiarc.xdsml.xmontiarc.adapters.xmontiarcmt.xmontiarc.ComponentTypeAdapter createComponentTypeAdapter(final ComponentType adaptee, final Resource res) {
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
  
  public ur1.diverse.xmontiarc.xdsml.xmontiarc.adapters.xmontiarcmt.xmontiarc.PortAdapter createPortAdapter(final Port adaptee, final Resource res) {
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
  
  public ur1.diverse.xmontiarc.xdsml.xmontiarc.adapters.xmontiarcmt.xmontiarc.IncomingPortAdapter createIncomingPortAdapter(final IncomingPort adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (ur1.diverse.xmontiarc.xdsml.xmontiarc.adapters.xmontiarcmt.xmontiarc.IncomingPortAdapter) adapter;
    else {
    	adapter = new ur1.diverse.xmontiarc.xdsml.xmontiarc.adapters.xmontiarcmt.xmontiarc.IncomingPortAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (ur1.diverse.xmontiarc.xdsml.xmontiarc.adapters.xmontiarcmt.xmontiarc.IncomingPortAdapter) adapter;
    }
  }
  
  public ur1.diverse.xmontiarc.xdsml.xmontiarc.adapters.xmontiarcmt.xmontiarc.OutgoingPortAdapter createOutgoingPortAdapter(final OutgoingPort adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (ur1.diverse.xmontiarc.xdsml.xmontiarc.adapters.xmontiarcmt.xmontiarc.OutgoingPortAdapter) adapter;
    else {
    	adapter = new ur1.diverse.xmontiarc.xdsml.xmontiarc.adapters.xmontiarcmt.xmontiarc.OutgoingPortAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (ur1.diverse.xmontiarc.xdsml.xmontiarc.adapters.xmontiarcmt.xmontiarc.OutgoingPortAdapter) adapter;
    }
  }
  
  public ur1.diverse.xmontiarc.xdsml.xmontiarc.adapters.xmontiarcmt.xmontiarc.ConnectorAdapter createConnectorAdapter(final Connector adaptee, final Resource res) {
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
  
  public ur1.diverse.xmontiarc.xdsml.xmontiarc.adapters.xmontiarcmt.xmontiarc.IntermediateConnectorAdapter createIntermediateConnectorAdapter(final IntermediateConnector adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (ur1.diverse.xmontiarc.xdsml.xmontiarc.adapters.xmontiarcmt.xmontiarc.IntermediateConnectorAdapter) adapter;
    else {
    	adapter = new ur1.diverse.xmontiarc.xdsml.xmontiarc.adapters.xmontiarcmt.xmontiarc.IntermediateConnectorAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (ur1.diverse.xmontiarc.xdsml.xmontiarc.adapters.xmontiarcmt.xmontiarc.IntermediateConnectorAdapter) adapter;
    }
  }
  
  public ur1.diverse.xmontiarc.xdsml.xmontiarc.adapters.xmontiarcmt.xmontiarc.IncomingConnectorAdapter createIncomingConnectorAdapter(final IncomingConnector adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (ur1.diverse.xmontiarc.xdsml.xmontiarc.adapters.xmontiarcmt.xmontiarc.IncomingConnectorAdapter) adapter;
    else {
    	adapter = new ur1.diverse.xmontiarc.xdsml.xmontiarc.adapters.xmontiarcmt.xmontiarc.IncomingConnectorAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (ur1.diverse.xmontiarc.xdsml.xmontiarc.adapters.xmontiarcmt.xmontiarc.IncomingConnectorAdapter) adapter;
    }
  }
  
  public ur1.diverse.xmontiarc.xdsml.xmontiarc.adapters.xmontiarcmt.xmontiarc.OutgoingConnectorAdapter createOutgoingConnectorAdapter(final OutgoingConnector adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (ur1.diverse.xmontiarc.xdsml.xmontiarc.adapters.xmontiarcmt.xmontiarc.OutgoingConnectorAdapter) adapter;
    else {
    	adapter = new ur1.diverse.xmontiarc.xdsml.xmontiarc.adapters.xmontiarcmt.xmontiarc.OutgoingConnectorAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (ur1.diverse.xmontiarc.xdsml.xmontiarc.adapters.xmontiarcmt.xmontiarc.OutgoingConnectorAdapter) adapter;
    }
  }
  
  public ur1.diverse.xmontiarc.xdsml.xmontiarc.adapters.xmontiarcmt.xmontiarc.SubcomponentAdapter createSubcomponentAdapter(final Subcomponent adaptee, final Resource res) {
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
}

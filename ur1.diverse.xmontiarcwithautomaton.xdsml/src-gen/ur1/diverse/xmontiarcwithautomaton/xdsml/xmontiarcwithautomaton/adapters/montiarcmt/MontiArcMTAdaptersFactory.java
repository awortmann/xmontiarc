package ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.adapters.montiarcmt;

import fr.inria.diverse.melange.adapters.AdaptersFactory;
import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.WeakHashMap;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.adapters.montiarcmt.xmontiarc.AutomatonComponentBehaviorAdapter;
import ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.adapters.montiarcmt.xmontiarc.ComponentBehaviorAdapter;
import ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.adapters.montiarcmt.xmontiarc.ComponentTypeAdapter;
import ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.adapters.montiarcmt.xmontiarc.ConnectorAdapter;
import ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.adapters.montiarcmt.xmontiarc.GroovyComponentBehaviorAdapter;
import ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.adapters.montiarcmt.xmontiarc.IncomingConnectorAdapter;
import ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.adapters.montiarcmt.xmontiarc.IncomingPortAdapter;
import ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.adapters.montiarcmt.xmontiarc.IntermediateConnectorAdapter;
import ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.adapters.montiarcmt.xmontiarc.OutgoingConnectorAdapter;
import ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.adapters.montiarcmt.xmontiarc.OutgoingPortAdapter;
import ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.adapters.montiarcmt.xmontiarc.PortAdapter;
import ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.adapters.montiarcmt.xmontiarc.SubcomponentAdapter;
import ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.xmontiarc.AutomatonComponentBehavior;
import ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.xmontiarc.ComponentBehavior;
import ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.xmontiarc.ComponentType;
import ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.xmontiarc.Connector;
import ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.xmontiarc.GroovyComponentBehavior;
import ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.xmontiarc.IncomingConnector;
import ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.xmontiarc.IncomingPort;
import ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.xmontiarc.IntermediateConnector;
import ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.xmontiarc.OutgoingConnector;
import ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.xmontiarc.OutgoingPort;
import ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.xmontiarc.Port;
import ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.xmontiarc.Subcomponent;

@SuppressWarnings("all")
public class MontiArcMTAdaptersFactory implements AdaptersFactory {
  private static MontiArcMTAdaptersFactory instance;
  
  public static MontiArcMTAdaptersFactory getInstance() {
    if (instance == null) {
    	instance = new ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.adapters.montiarcmt.MontiArcMTAdaptersFactory();
    }
    return instance;
  }
  
  private WeakHashMap<EObject, EObjectAdapter> register;
  
  public MontiArcMTAdaptersFactory() {
    register = new WeakHashMap();
  }
  
  public EObjectAdapter createAdapter(final EObject o, final Resource res) {
    if (o instanceof ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.xmontiarc.ComponentType){
    	return createComponentTypeAdapter((ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.xmontiarc.ComponentType) o, res);
    }
    if (o instanceof ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.xmontiarc.IncomingPort){
    	return createIncomingPortAdapter((ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.xmontiarc.IncomingPort) o, res);
    }
    if (o instanceof ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.xmontiarc.OutgoingPort){
    	return createOutgoingPortAdapter((ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.xmontiarc.OutgoingPort) o, res);
    }
    if (o instanceof ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.xmontiarc.IntermediateConnector){
    	return createIntermediateConnectorAdapter((ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.xmontiarc.IntermediateConnector) o, res);
    }
    if (o instanceof ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.xmontiarc.IncomingConnector){
    	return createIncomingConnectorAdapter((ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.xmontiarc.IncomingConnector) o, res);
    }
    if (o instanceof ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.xmontiarc.OutgoingConnector){
    	return createOutgoingConnectorAdapter((ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.xmontiarc.OutgoingConnector) o, res);
    }
    if (o instanceof ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.xmontiarc.Subcomponent){
    	return createSubcomponentAdapter((ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.xmontiarc.Subcomponent) o, res);
    }
    if (o instanceof ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.xmontiarc.GroovyComponentBehavior){
    	return createGroovyComponentBehaviorAdapter((ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.xmontiarc.GroovyComponentBehavior) o, res);
    }
    if (o instanceof ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.xmontiarc.AutomatonComponentBehavior){
    	return createAutomatonComponentBehaviorAdapter((ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.xmontiarc.AutomatonComponentBehavior) o, res);
    }
    
    return null;
  }
  
  public ComponentTypeAdapter createComponentTypeAdapter(final ComponentType adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.adapters.montiarcmt.xmontiarc.ComponentTypeAdapter) adapter;
    else {
    	adapter = new ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.adapters.montiarcmt.xmontiarc.ComponentTypeAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.adapters.montiarcmt.xmontiarc.ComponentTypeAdapter) adapter;
    }
  }
  
  public PortAdapter createPortAdapter(final Port adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.adapters.montiarcmt.xmontiarc.PortAdapter) adapter;
    else {
    	adapter = new ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.adapters.montiarcmt.xmontiarc.PortAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.adapters.montiarcmt.xmontiarc.PortAdapter) adapter;
    }
  }
  
  public IncomingPortAdapter createIncomingPortAdapter(final IncomingPort adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.adapters.montiarcmt.xmontiarc.IncomingPortAdapter) adapter;
    else {
    	adapter = new ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.adapters.montiarcmt.xmontiarc.IncomingPortAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.adapters.montiarcmt.xmontiarc.IncomingPortAdapter) adapter;
    }
  }
  
  public OutgoingPortAdapter createOutgoingPortAdapter(final OutgoingPort adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.adapters.montiarcmt.xmontiarc.OutgoingPortAdapter) adapter;
    else {
    	adapter = new ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.adapters.montiarcmt.xmontiarc.OutgoingPortAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.adapters.montiarcmt.xmontiarc.OutgoingPortAdapter) adapter;
    }
  }
  
  public ConnectorAdapter createConnectorAdapter(final Connector adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.adapters.montiarcmt.xmontiarc.ConnectorAdapter) adapter;
    else {
    	adapter = new ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.adapters.montiarcmt.xmontiarc.ConnectorAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.adapters.montiarcmt.xmontiarc.ConnectorAdapter) adapter;
    }
  }
  
  public IntermediateConnectorAdapter createIntermediateConnectorAdapter(final IntermediateConnector adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.adapters.montiarcmt.xmontiarc.IntermediateConnectorAdapter) adapter;
    else {
    	adapter = new ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.adapters.montiarcmt.xmontiarc.IntermediateConnectorAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.adapters.montiarcmt.xmontiarc.IntermediateConnectorAdapter) adapter;
    }
  }
  
  public IncomingConnectorAdapter createIncomingConnectorAdapter(final IncomingConnector adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.adapters.montiarcmt.xmontiarc.IncomingConnectorAdapter) adapter;
    else {
    	adapter = new ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.adapters.montiarcmt.xmontiarc.IncomingConnectorAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.adapters.montiarcmt.xmontiarc.IncomingConnectorAdapter) adapter;
    }
  }
  
  public OutgoingConnectorAdapter createOutgoingConnectorAdapter(final OutgoingConnector adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.adapters.montiarcmt.xmontiarc.OutgoingConnectorAdapter) adapter;
    else {
    	adapter = new ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.adapters.montiarcmt.xmontiarc.OutgoingConnectorAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.adapters.montiarcmt.xmontiarc.OutgoingConnectorAdapter) adapter;
    }
  }
  
  public SubcomponentAdapter createSubcomponentAdapter(final Subcomponent adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.adapters.montiarcmt.xmontiarc.SubcomponentAdapter) adapter;
    else {
    	adapter = new ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.adapters.montiarcmt.xmontiarc.SubcomponentAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.adapters.montiarcmt.xmontiarc.SubcomponentAdapter) adapter;
    }
  }
  
  public ComponentBehaviorAdapter createComponentBehaviorAdapter(final ComponentBehavior adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.adapters.montiarcmt.xmontiarc.ComponentBehaviorAdapter) adapter;
    else {
    	adapter = new ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.adapters.montiarcmt.xmontiarc.ComponentBehaviorAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.adapters.montiarcmt.xmontiarc.ComponentBehaviorAdapter) adapter;
    }
  }
  
  public GroovyComponentBehaviorAdapter createGroovyComponentBehaviorAdapter(final GroovyComponentBehavior adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.adapters.montiarcmt.xmontiarc.GroovyComponentBehaviorAdapter) adapter;
    else {
    	adapter = new ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.adapters.montiarcmt.xmontiarc.GroovyComponentBehaviorAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.adapters.montiarcmt.xmontiarc.GroovyComponentBehaviorAdapter) adapter;
    }
  }
  
  public AutomatonComponentBehaviorAdapter createAutomatonComponentBehaviorAdapter(final AutomatonComponentBehavior adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.adapters.montiarcmt.xmontiarc.AutomatonComponentBehaviorAdapter) adapter;
    else {
    	adapter = new ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.adapters.montiarcmt.xmontiarc.AutomatonComponentBehaviorAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.adapters.montiarcmt.xmontiarc.AutomatonComponentBehaviorAdapter) adapter;
    }
  }
}

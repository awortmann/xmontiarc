package org.gemoc.xmontiarc.xdsml.xmontiarc.adapters.xmontiarcmt;

import fr.inria.diverse.melange.adapters.AdaptersFactory;
import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.WeakHashMap;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.gemoc.xmontiarc.xdsml.xmontiarc.adapters.xmontiarcmt.montiarc.AutomatonComponentBehaviorAdapter;
import org.gemoc.xmontiarc.xdsml.xmontiarc.adapters.xmontiarcmt.montiarc.ComponentBehaviorAdapter;
import org.gemoc.xmontiarc.xdsml.xmontiarc.adapters.xmontiarcmt.montiarc.ComponentTypeAdapter;
import org.gemoc.xmontiarc.xdsml.xmontiarc.adapters.xmontiarcmt.montiarc.ConnectorAdapter;
import org.gemoc.xmontiarc.xdsml.xmontiarc.adapters.xmontiarcmt.montiarc.GroovyComponentBehaviorAdapter;
import org.gemoc.xmontiarc.xdsml.xmontiarc.adapters.xmontiarcmt.montiarc.IncomingConnectorAdapter;
import org.gemoc.xmontiarc.xdsml.xmontiarc.adapters.xmontiarcmt.montiarc.IncomingPortAdapter;
import org.gemoc.xmontiarc.xdsml.xmontiarc.adapters.xmontiarcmt.montiarc.IntermediateConnectorAdapter;
import org.gemoc.xmontiarc.xdsml.xmontiarc.adapters.xmontiarcmt.montiarc.OutgoingConnectorAdapter;
import org.gemoc.xmontiarc.xdsml.xmontiarc.adapters.xmontiarcmt.montiarc.OutgoingPortAdapter;
import org.gemoc.xmontiarc.xdsml.xmontiarc.adapters.xmontiarcmt.montiarc.PortAdapter;
import org.gemoc.xmontiarc.xdsml.xmontiarc.adapters.xmontiarcmt.montiarc.SubcomponentAdapter;
import org.gemoc.xmontiarc.xdsml.xmontiarc.montiarc.AutomatonComponentBehavior;
import org.gemoc.xmontiarc.xdsml.xmontiarc.montiarc.ComponentBehavior;
import org.gemoc.xmontiarc.xdsml.xmontiarc.montiarc.ComponentType;
import org.gemoc.xmontiarc.xdsml.xmontiarc.montiarc.Connector;
import org.gemoc.xmontiarc.xdsml.xmontiarc.montiarc.GroovyComponentBehavior;
import org.gemoc.xmontiarc.xdsml.xmontiarc.montiarc.IncomingConnector;
import org.gemoc.xmontiarc.xdsml.xmontiarc.montiarc.IncomingPort;
import org.gemoc.xmontiarc.xdsml.xmontiarc.montiarc.IntermediateConnector;
import org.gemoc.xmontiarc.xdsml.xmontiarc.montiarc.OutgoingConnector;
import org.gemoc.xmontiarc.xdsml.xmontiarc.montiarc.OutgoingPort;
import org.gemoc.xmontiarc.xdsml.xmontiarc.montiarc.Port;
import org.gemoc.xmontiarc.xdsml.xmontiarc.montiarc.Subcomponent;

@SuppressWarnings("all")
public class XMontiArcMTAdaptersFactory implements AdaptersFactory {
  private static XMontiArcMTAdaptersFactory instance;
  
  public static XMontiArcMTAdaptersFactory getInstance() {
    if (instance == null) {
    	instance = new org.gemoc.xmontiarc.xdsml.xmontiarc.adapters.xmontiarcmt.XMontiArcMTAdaptersFactory();
    }
    return instance;
  }
  
  private WeakHashMap<EObject, EObjectAdapter> register;
  
  public XMontiArcMTAdaptersFactory() {
    register = new WeakHashMap();
  }
  
  public EObjectAdapter createAdapter(final EObject o, final Resource res) {
    if (o instanceof org.gemoc.xmontiarc.xdsml.xmontiarc.montiarc.ComponentType){
    	return createComponentTypeAdapter((org.gemoc.xmontiarc.xdsml.xmontiarc.montiarc.ComponentType) o, res);
    }
    if (o instanceof org.gemoc.xmontiarc.xdsml.xmontiarc.montiarc.IncomingPort){
    	return createIncomingPortAdapter((org.gemoc.xmontiarc.xdsml.xmontiarc.montiarc.IncomingPort) o, res);
    }
    if (o instanceof org.gemoc.xmontiarc.xdsml.xmontiarc.montiarc.OutgoingPort){
    	return createOutgoingPortAdapter((org.gemoc.xmontiarc.xdsml.xmontiarc.montiarc.OutgoingPort) o, res);
    }
    if (o instanceof org.gemoc.xmontiarc.xdsml.xmontiarc.montiarc.Port){
    	return createPortAdapter((org.gemoc.xmontiarc.xdsml.xmontiarc.montiarc.Port) o, res);
    }
    if (o instanceof org.gemoc.xmontiarc.xdsml.xmontiarc.montiarc.IntermediateConnector){
    	return createIntermediateConnectorAdapter((org.gemoc.xmontiarc.xdsml.xmontiarc.montiarc.IntermediateConnector) o, res);
    }
    if (o instanceof org.gemoc.xmontiarc.xdsml.xmontiarc.montiarc.IncomingConnector){
    	return createIncomingConnectorAdapter((org.gemoc.xmontiarc.xdsml.xmontiarc.montiarc.IncomingConnector) o, res);
    }
    if (o instanceof org.gemoc.xmontiarc.xdsml.xmontiarc.montiarc.OutgoingConnector){
    	return createOutgoingConnectorAdapter((org.gemoc.xmontiarc.xdsml.xmontiarc.montiarc.OutgoingConnector) o, res);
    }
    if (o instanceof org.gemoc.xmontiarc.xdsml.xmontiarc.montiarc.Subcomponent){
    	return createSubcomponentAdapter((org.gemoc.xmontiarc.xdsml.xmontiarc.montiarc.Subcomponent) o, res);
    }
    if (o instanceof org.gemoc.xmontiarc.xdsml.xmontiarc.montiarc.GroovyComponentBehavior){
    	return createGroovyComponentBehaviorAdapter((org.gemoc.xmontiarc.xdsml.xmontiarc.montiarc.GroovyComponentBehavior) o, res);
    }
    if (o instanceof org.gemoc.xmontiarc.xdsml.xmontiarc.montiarc.AutomatonComponentBehavior){
    	return createAutomatonComponentBehaviorAdapter((org.gemoc.xmontiarc.xdsml.xmontiarc.montiarc.AutomatonComponentBehavior) o, res);
    }
    
    return null;
  }
  
  public ComponentTypeAdapter createComponentTypeAdapter(final ComponentType adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.xmontiarc.xdsml.xmontiarc.adapters.xmontiarcmt.montiarc.ComponentTypeAdapter) adapter;
    else {
    	adapter = new org.gemoc.xmontiarc.xdsml.xmontiarc.adapters.xmontiarcmt.montiarc.ComponentTypeAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.xmontiarc.xdsml.xmontiarc.adapters.xmontiarcmt.montiarc.ComponentTypeAdapter) adapter;
    }
  }
  
  public PortAdapter createPortAdapter(final Port adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.xmontiarc.xdsml.xmontiarc.adapters.xmontiarcmt.montiarc.PortAdapter) adapter;
    else {
    	adapter = new org.gemoc.xmontiarc.xdsml.xmontiarc.adapters.xmontiarcmt.montiarc.PortAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.xmontiarc.xdsml.xmontiarc.adapters.xmontiarcmt.montiarc.PortAdapter) adapter;
    }
  }
  
  public IncomingPortAdapter createIncomingPortAdapter(final IncomingPort adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.xmontiarc.xdsml.xmontiarc.adapters.xmontiarcmt.montiarc.IncomingPortAdapter) adapter;
    else {
    	adapter = new org.gemoc.xmontiarc.xdsml.xmontiarc.adapters.xmontiarcmt.montiarc.IncomingPortAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.xmontiarc.xdsml.xmontiarc.adapters.xmontiarcmt.montiarc.IncomingPortAdapter) adapter;
    }
  }
  
  public OutgoingPortAdapter createOutgoingPortAdapter(final OutgoingPort adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.xmontiarc.xdsml.xmontiarc.adapters.xmontiarcmt.montiarc.OutgoingPortAdapter) adapter;
    else {
    	adapter = new org.gemoc.xmontiarc.xdsml.xmontiarc.adapters.xmontiarcmt.montiarc.OutgoingPortAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.xmontiarc.xdsml.xmontiarc.adapters.xmontiarcmt.montiarc.OutgoingPortAdapter) adapter;
    }
  }
  
  public ConnectorAdapter createConnectorAdapter(final Connector adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.xmontiarc.xdsml.xmontiarc.adapters.xmontiarcmt.montiarc.ConnectorAdapter) adapter;
    else {
    	adapter = new org.gemoc.xmontiarc.xdsml.xmontiarc.adapters.xmontiarcmt.montiarc.ConnectorAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.xmontiarc.xdsml.xmontiarc.adapters.xmontiarcmt.montiarc.ConnectorAdapter) adapter;
    }
  }
  
  public IntermediateConnectorAdapter createIntermediateConnectorAdapter(final IntermediateConnector adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.xmontiarc.xdsml.xmontiarc.adapters.xmontiarcmt.montiarc.IntermediateConnectorAdapter) adapter;
    else {
    	adapter = new org.gemoc.xmontiarc.xdsml.xmontiarc.adapters.xmontiarcmt.montiarc.IntermediateConnectorAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.xmontiarc.xdsml.xmontiarc.adapters.xmontiarcmt.montiarc.IntermediateConnectorAdapter) adapter;
    }
  }
  
  public IncomingConnectorAdapter createIncomingConnectorAdapter(final IncomingConnector adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.xmontiarc.xdsml.xmontiarc.adapters.xmontiarcmt.montiarc.IncomingConnectorAdapter) adapter;
    else {
    	adapter = new org.gemoc.xmontiarc.xdsml.xmontiarc.adapters.xmontiarcmt.montiarc.IncomingConnectorAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.xmontiarc.xdsml.xmontiarc.adapters.xmontiarcmt.montiarc.IncomingConnectorAdapter) adapter;
    }
  }
  
  public OutgoingConnectorAdapter createOutgoingConnectorAdapter(final OutgoingConnector adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.xmontiarc.xdsml.xmontiarc.adapters.xmontiarcmt.montiarc.OutgoingConnectorAdapter) adapter;
    else {
    	adapter = new org.gemoc.xmontiarc.xdsml.xmontiarc.adapters.xmontiarcmt.montiarc.OutgoingConnectorAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.xmontiarc.xdsml.xmontiarc.adapters.xmontiarcmt.montiarc.OutgoingConnectorAdapter) adapter;
    }
  }
  
  public SubcomponentAdapter createSubcomponentAdapter(final Subcomponent adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.xmontiarc.xdsml.xmontiarc.adapters.xmontiarcmt.montiarc.SubcomponentAdapter) adapter;
    else {
    	adapter = new org.gemoc.xmontiarc.xdsml.xmontiarc.adapters.xmontiarcmt.montiarc.SubcomponentAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.xmontiarc.xdsml.xmontiarc.adapters.xmontiarcmt.montiarc.SubcomponentAdapter) adapter;
    }
  }
  
  public ComponentBehaviorAdapter createComponentBehaviorAdapter(final ComponentBehavior adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.xmontiarc.xdsml.xmontiarc.adapters.xmontiarcmt.montiarc.ComponentBehaviorAdapter) adapter;
    else {
    	adapter = new org.gemoc.xmontiarc.xdsml.xmontiarc.adapters.xmontiarcmt.montiarc.ComponentBehaviorAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.xmontiarc.xdsml.xmontiarc.adapters.xmontiarcmt.montiarc.ComponentBehaviorAdapter) adapter;
    }
  }
  
  public GroovyComponentBehaviorAdapter createGroovyComponentBehaviorAdapter(final GroovyComponentBehavior adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.xmontiarc.xdsml.xmontiarc.adapters.xmontiarcmt.montiarc.GroovyComponentBehaviorAdapter) adapter;
    else {
    	adapter = new org.gemoc.xmontiarc.xdsml.xmontiarc.adapters.xmontiarcmt.montiarc.GroovyComponentBehaviorAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.xmontiarc.xdsml.xmontiarc.adapters.xmontiarcmt.montiarc.GroovyComponentBehaviorAdapter) adapter;
    }
  }
  
  public AutomatonComponentBehaviorAdapter createAutomatonComponentBehaviorAdapter(final AutomatonComponentBehavior adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.xmontiarc.xdsml.xmontiarc.adapters.xmontiarcmt.montiarc.AutomatonComponentBehaviorAdapter) adapter;
    else {
    	adapter = new org.gemoc.xmontiarc.xdsml.xmontiarc.adapters.xmontiarcmt.montiarc.AutomatonComponentBehaviorAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.xmontiarc.xdsml.xmontiarc.adapters.xmontiarcmt.montiarc.AutomatonComponentBehaviorAdapter) adapter;
    }
  }
}

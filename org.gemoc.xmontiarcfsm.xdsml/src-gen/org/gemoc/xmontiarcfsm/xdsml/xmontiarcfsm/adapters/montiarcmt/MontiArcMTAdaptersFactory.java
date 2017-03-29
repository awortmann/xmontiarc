package org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.adapters.montiarcmt;

import fr.inria.diverse.melange.adapters.AdaptersFactory;
import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.WeakHashMap;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.adapters.montiarcmt.montiarc.AutomatonComponentBehaviorAdapter;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.adapters.montiarcmt.montiarc.ComponentBehaviorAdapter;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.adapters.montiarcmt.montiarc.ComponentTypeAdapter;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.adapters.montiarcmt.montiarc.ConnectorAdapter;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.adapters.montiarcmt.montiarc.GroovyComponentBehaviorAdapter;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.adapters.montiarcmt.montiarc.IncomingConnectorAdapter;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.adapters.montiarcmt.montiarc.IncomingPortAdapter;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.adapters.montiarcmt.montiarc.IntermediateConnectorAdapter;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.adapters.montiarcmt.montiarc.OutgoingConnectorAdapter;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.adapters.montiarcmt.montiarc.OutgoingPortAdapter;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.adapters.montiarcmt.montiarc.PortAdapter;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.adapters.montiarcmt.montiarc.SubcomponentAdapter;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.montiarc.AutomatonComponentBehavior;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.montiarc.ComponentBehavior;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.montiarc.ComponentType;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.montiarc.Connector;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.montiarc.GroovyComponentBehavior;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.montiarc.IncomingConnector;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.montiarc.IncomingPort;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.montiarc.IntermediateConnector;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.montiarc.OutgoingConnector;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.montiarc.OutgoingPort;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.montiarc.Port;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.montiarc.Subcomponent;

@SuppressWarnings("all")
public class MontiArcMTAdaptersFactory implements AdaptersFactory {
  private static MontiArcMTAdaptersFactory instance;
  
  public static MontiArcMTAdaptersFactory getInstance() {
    if (instance == null) {
    	instance = new org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.adapters.montiarcmt.MontiArcMTAdaptersFactory();
    }
    return instance;
  }
  
  private WeakHashMap<EObject, EObjectAdapter> register;
  
  public MontiArcMTAdaptersFactory() {
    register = new WeakHashMap();
  }
  
  public EObjectAdapter createAdapter(final EObject o, final Resource res) {
    if (o instanceof org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.montiarc.ComponentType){
    	return createComponentTypeAdapter((org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.montiarc.ComponentType) o, res);
    }
    if (o instanceof org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.montiarc.IncomingPort){
    	return createIncomingPortAdapter((org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.montiarc.IncomingPort) o, res);
    }
    if (o instanceof org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.montiarc.OutgoingPort){
    	return createOutgoingPortAdapter((org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.montiarc.OutgoingPort) o, res);
    }
    if (o instanceof org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.montiarc.IntermediateConnector){
    	return createIntermediateConnectorAdapter((org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.montiarc.IntermediateConnector) o, res);
    }
    if (o instanceof org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.montiarc.IncomingConnector){
    	return createIncomingConnectorAdapter((org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.montiarc.IncomingConnector) o, res);
    }
    if (o instanceof org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.montiarc.OutgoingConnector){
    	return createOutgoingConnectorAdapter((org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.montiarc.OutgoingConnector) o, res);
    }
    if (o instanceof org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.montiarc.Subcomponent){
    	return createSubcomponentAdapter((org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.montiarc.Subcomponent) o, res);
    }
    if (o instanceof org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.montiarc.GroovyComponentBehavior){
    	return createGroovyComponentBehaviorAdapter((org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.montiarc.GroovyComponentBehavior) o, res);
    }
    if (o instanceof org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.montiarc.AutomatonComponentBehavior){
    	return createAutomatonComponentBehaviorAdapter((org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.montiarc.AutomatonComponentBehavior) o, res);
    }
    
    return null;
  }
  
  public ComponentTypeAdapter createComponentTypeAdapter(final ComponentType adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.adapters.montiarcmt.montiarc.ComponentTypeAdapter) adapter;
    else {
    	adapter = new org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.adapters.montiarcmt.montiarc.ComponentTypeAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.adapters.montiarcmt.montiarc.ComponentTypeAdapter) adapter;
    }
  }
  
  public PortAdapter createPortAdapter(final Port adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.adapters.montiarcmt.montiarc.PortAdapter) adapter;
    else {
    	adapter = new org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.adapters.montiarcmt.montiarc.PortAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.adapters.montiarcmt.montiarc.PortAdapter) adapter;
    }
  }
  
  public IncomingPortAdapter createIncomingPortAdapter(final IncomingPort adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.adapters.montiarcmt.montiarc.IncomingPortAdapter) adapter;
    else {
    	adapter = new org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.adapters.montiarcmt.montiarc.IncomingPortAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.adapters.montiarcmt.montiarc.IncomingPortAdapter) adapter;
    }
  }
  
  public OutgoingPortAdapter createOutgoingPortAdapter(final OutgoingPort adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.adapters.montiarcmt.montiarc.OutgoingPortAdapter) adapter;
    else {
    	adapter = new org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.adapters.montiarcmt.montiarc.OutgoingPortAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.adapters.montiarcmt.montiarc.OutgoingPortAdapter) adapter;
    }
  }
  
  public ConnectorAdapter createConnectorAdapter(final Connector adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.adapters.montiarcmt.montiarc.ConnectorAdapter) adapter;
    else {
    	adapter = new org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.adapters.montiarcmt.montiarc.ConnectorAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.adapters.montiarcmt.montiarc.ConnectorAdapter) adapter;
    }
  }
  
  public IntermediateConnectorAdapter createIntermediateConnectorAdapter(final IntermediateConnector adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.adapters.montiarcmt.montiarc.IntermediateConnectorAdapter) adapter;
    else {
    	adapter = new org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.adapters.montiarcmt.montiarc.IntermediateConnectorAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.adapters.montiarcmt.montiarc.IntermediateConnectorAdapter) adapter;
    }
  }
  
  public IncomingConnectorAdapter createIncomingConnectorAdapter(final IncomingConnector adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.adapters.montiarcmt.montiarc.IncomingConnectorAdapter) adapter;
    else {
    	adapter = new org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.adapters.montiarcmt.montiarc.IncomingConnectorAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.adapters.montiarcmt.montiarc.IncomingConnectorAdapter) adapter;
    }
  }
  
  public OutgoingConnectorAdapter createOutgoingConnectorAdapter(final OutgoingConnector adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.adapters.montiarcmt.montiarc.OutgoingConnectorAdapter) adapter;
    else {
    	adapter = new org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.adapters.montiarcmt.montiarc.OutgoingConnectorAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.adapters.montiarcmt.montiarc.OutgoingConnectorAdapter) adapter;
    }
  }
  
  public SubcomponentAdapter createSubcomponentAdapter(final Subcomponent adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.adapters.montiarcmt.montiarc.SubcomponentAdapter) adapter;
    else {
    	adapter = new org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.adapters.montiarcmt.montiarc.SubcomponentAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.adapters.montiarcmt.montiarc.SubcomponentAdapter) adapter;
    }
  }
  
  public ComponentBehaviorAdapter createComponentBehaviorAdapter(final ComponentBehavior adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.adapters.montiarcmt.montiarc.ComponentBehaviorAdapter) adapter;
    else {
    	adapter = new org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.adapters.montiarcmt.montiarc.ComponentBehaviorAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.adapters.montiarcmt.montiarc.ComponentBehaviorAdapter) adapter;
    }
  }
  
  public GroovyComponentBehaviorAdapter createGroovyComponentBehaviorAdapter(final GroovyComponentBehavior adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.adapters.montiarcmt.montiarc.GroovyComponentBehaviorAdapter) adapter;
    else {
    	adapter = new org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.adapters.montiarcmt.montiarc.GroovyComponentBehaviorAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.adapters.montiarcmt.montiarc.GroovyComponentBehaviorAdapter) adapter;
    }
  }
  
  public AutomatonComponentBehaviorAdapter createAutomatonComponentBehaviorAdapter(final AutomatonComponentBehavior adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.adapters.montiarcmt.montiarc.AutomatonComponentBehaviorAdapter) adapter;
    else {
    	adapter = new org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.adapters.montiarcmt.montiarc.AutomatonComponentBehaviorAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.adapters.montiarcmt.montiarc.AutomatonComponentBehaviorAdapter) adapter;
    }
  }
}

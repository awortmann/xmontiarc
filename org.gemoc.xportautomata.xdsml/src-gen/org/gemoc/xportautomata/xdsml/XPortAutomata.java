package org.gemoc.xportautomata.xdsml;

import fr.inria.diverse.melange.lib.IMetamodel;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.gemoc.portautomata.PortAutomataMT;
import org.gemoc.xportautomata.xdsml.XPortAutomataMT;

@SuppressWarnings("all")
public class XPortAutomata implements IMetamodel {
  private Resource resource;
  
  public Resource getResource() {
    return this.resource;
  }
  
  public void setResource(final Resource resource) {
    this.resource = resource;
  }
  
  public static XPortAutomata load(final String uri) {
    ResourceSet rs = new ResourceSetImpl();
    Resource res = rs.getResource(URI.createURI(uri), true);
    XPortAutomata mm = new XPortAutomata();
    mm.setResource(res);
    return mm ;
  }
  
  public PortAutomataMT toPortAutomataMT() {
    org.gemoc.xportautomata.xdsml.xportautomata.adapters.portautomatamt.XPortAutomataAdapter adaptee = new org.gemoc.xportautomata.xdsml.xportautomata.adapters.portautomatamt.XPortAutomataAdapter() ;
    adaptee.setAdaptee(resource);
    return adaptee;
  }
  
  public XPortAutomataMT toXPortAutomataMT() {
    org.gemoc.xportautomata.xdsml.xportautomata.adapters.xportautomatamt.XPortAutomataAdapter adaptee = new org.gemoc.xportautomata.xdsml.xportautomata.adapters.xportautomatamt.XPortAutomataAdapter() ;
    adaptee.setAdaptee(resource);
    return adaptee;
  }
}

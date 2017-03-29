package org.gemoc.xmontiarc.xdsml;

import fr.inria.diverse.melange.lib.IMetamodel;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.gemoc.montiarc.MontiArcMT;
import org.gemoc.xmontiarc.xdsml.XMontiArcMT;

@SuppressWarnings("all")
public class XMontiArc implements IMetamodel {
  private Resource resource;
  
  public Resource getResource() {
    return this.resource;
  }
  
  public void setResource(final Resource resource) {
    this.resource = resource;
  }
  
  public static XMontiArc load(final String uri) {
    ResourceSet rs = new ResourceSetImpl();
    Resource res = rs.getResource(URI.createURI(uri), true);
    XMontiArc mm = new XMontiArc();
    mm.setResource(res);
    return mm ;
  }
  
  public MontiArcMT toMontiArcMT() {
    org.gemoc.xmontiarc.xdsml.xmontiarc.adapters.montiarcmt.XMontiArcAdapter adaptee = new org.gemoc.xmontiarc.xdsml.xmontiarc.adapters.montiarcmt.XMontiArcAdapter() ;
    adaptee.setAdaptee(resource);
    return adaptee;
  }
  
  public XMontiArcMT toXMontiArcMT() {
    org.gemoc.xmontiarc.xdsml.xmontiarc.adapters.xmontiarcmt.XMontiArcAdapter adaptee = new org.gemoc.xmontiarc.xdsml.xmontiarc.adapters.xmontiarcmt.XMontiArcAdapter() ;
    adaptee.setAdaptee(resource);
    return adaptee;
  }
}

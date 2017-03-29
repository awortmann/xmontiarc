package org.gemoc.xmontiarcfsm.xdsml;

import fr.inria.diverse.melange.lib.IMetamodel;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.gemoc.montiarc.MontiArcMT;
import org.gemoc.xmontiarc.xdsml.XMontiArcMT;
import org.gemoc.xmontiarcfsm.xdsml.XMontiArcFSMMT;

@SuppressWarnings("all")
public class XMontiArcFSM implements IMetamodel {
  private Resource resource;
  
  public Resource getResource() {
    return this.resource;
  }
  
  public void setResource(final Resource resource) {
    this.resource = resource;
  }
  
  public static XMontiArcFSM load(final String uri) {
    ResourceSet rs = new ResourceSetImpl();
    Resource res = rs.getResource(URI.createURI(uri), true);
    XMontiArcFSM mm = new XMontiArcFSM();
    mm.setResource(res);
    return mm ;
  }
  
  public XMontiArcMT toXMontiArcMT() {
    org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.adapters.xmontiarcmt.XMontiArcFSMAdapter adaptee = new org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.adapters.xmontiarcmt.XMontiArcFSMAdapter() ;
    adaptee.setAdaptee(resource);
    return adaptee;
  }
  
  public MontiArcMT toMontiArcMT() {
    org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.adapters.montiarcmt.XMontiArcFSMAdapter adaptee = new org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.adapters.montiarcmt.XMontiArcFSMAdapter() ;
    adaptee.setAdaptee(resource);
    return adaptee;
  }
  
  public XMontiArcFSMMT toXMontiArcFSMMT() {
    org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.adapters.xmontiarcfsmmt.XMontiArcFSMAdapter adaptee = new org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.adapters.xmontiarcfsmmt.XMontiArcFSMAdapter() ;
    adaptee.setAdaptee(resource);
    return adaptee;
  }
}

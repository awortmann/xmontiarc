package org.gemoc.xportautomata.xdsml.xportautomata.adapters.xportautomatamt;

import fr.inria.diverse.melange.adapters.ResourceAdapter;
import java.io.IOException;
import java.util.Set;
import org.eclipse.emf.common.util.URI;
import org.gemoc.xportautomata.xdsml.XPortAutomataMT;
import org.gemoc.xportautomata.xdsml.xportautomatamt.fsm.FsmFactory;

@SuppressWarnings("all")
public class XPortAutomataAdapter extends ResourceAdapter implements XPortAutomataMT {
  public XPortAutomataAdapter() {
    super(org.gemoc.xportautomata.xdsml.xportautomata.adapters.xportautomatamt.XPortAutomataMTAdaptersFactory.getInstance());
  }
  
  @Override
  public FsmFactory getFsmFactory() {
    return new org.gemoc.xportautomata.xdsml.xportautomata.adapters.xportautomatamt.fsm.FsmFactoryAdapter();
  }
  
  @Override
  public Set getFactories() {
    java.util.Set<org.eclipse.emf.ecore.EFactory> res = new java.util.HashSet<org.eclipse.emf.ecore.EFactory>();
    res.add(getFsmFactory());
    return res;
  }
  
  @Override
  public void save(final String uri) throws IOException {
    this.adaptee.setURI(URI.createURI(uri));
    this.adaptee.save(null);
  }
}

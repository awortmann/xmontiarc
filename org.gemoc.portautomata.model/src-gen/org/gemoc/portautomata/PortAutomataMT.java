package org.gemoc.portautomata;

import fr.inria.diverse.melange.lib.IModelType;
import java.io.IOException;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.gemoc.portautomata.fsm.fsmFactory;

@SuppressWarnings("all")
public interface PortAutomataMT extends IModelType {
  public abstract EList<EObject> getContents();
  
  public abstract fsmFactory getfsmFactory();
  
  public abstract void save(final String uri) throws IOException;
}

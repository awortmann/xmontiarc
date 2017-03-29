package org.gemoc.xmontiarcfsm.xdsml;

import fr.inria.diverse.melange.lib.IModelType;
import java.io.IOException;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.montiarc.MontiarcFactory;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.XmontiarcFactory;

@SuppressWarnings("all")
public interface XMontiArcFSMMT extends IModelType {
  public abstract EList<EObject> getContents();
  
  public abstract MontiarcFactory getMontiarcFactory();
  
  public abstract XmontiarcFactory getXmontiarcFactory();
  
  public abstract void save(final String uri) throws IOException;
}

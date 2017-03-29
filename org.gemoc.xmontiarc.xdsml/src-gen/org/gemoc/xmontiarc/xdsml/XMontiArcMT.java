package org.gemoc.xmontiarc.xdsml;

import fr.inria.diverse.melange.lib.IModelType;
import java.io.IOException;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.gemoc.xmontiarc.xdsml.xmontiarcmt.montiarc.MontiarcFactory;

@SuppressWarnings("all")
public interface XMontiArcMT extends IModelType {
  public abstract EList<EObject> getContents();
  
  public abstract MontiarcFactory getMontiarcFactory();
  
  public abstract void save(final String uri) throws IOException;
}

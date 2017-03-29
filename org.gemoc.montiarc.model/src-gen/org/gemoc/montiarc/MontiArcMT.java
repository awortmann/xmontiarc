package org.gemoc.montiarc;

import fr.inria.diverse.melange.lib.IModelType;
import java.io.IOException;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.gemoc.montiarc.montiarc.MontiarcFactory;

@SuppressWarnings("all")
public interface MontiArcMT extends IModelType {
  public abstract EList<EObject> getContents();
  
  public abstract MontiarcFactory getMontiarcFactory();
  
  public abstract void save(final String uri) throws IOException;
}

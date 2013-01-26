package org.openstreetmap.josm.plugins.nlgeo.nwb;

import java.io.Serializable;

import org.openstreetmap.josm.plugins.openservices.wfs.WFSDataSet;

public class NWBDataSet extends WFSDataSet {

  public NWBDataSet() {
    super(new FeatureParser());
    setMapper(new NWBToJosmMapper(this));
  }
 
  @Override
  protected Serializable getId(Object o) {
    if (o instanceof Wegvak)
      return ((Wegvak)o).getId();
    return null;
  }
}

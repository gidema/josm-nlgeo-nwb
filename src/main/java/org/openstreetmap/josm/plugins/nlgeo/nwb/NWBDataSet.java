package org.openstreetmap.josm.plugins.nlgeo.nwb;

import java.io.Serializable;

import org.openstreetmap.josm.plugins.openservices.wfs.WFSDataSet;

public class NWBDataSet extends WFSDataSet<Wegvak> {

  public NWBDataSet() {
    super(new FeatureParser());
    setMapper(new NWBToJosmMapper(this));
  }
 
  @Override
  protected Serializable getId(Wegvak o) {
    return o.getId();
  }
}

package org.openstreetmap.josm.plugins.nlgeo.nwb;

import org.openstreetmap.josm.plugins.openservices.wfs.WfsHost;

public class NwbWfsHost extends WfsHost {
  private static NwbWfsHost instance;
  
  private NwbWfsHost() {
    super("http://geodata.nationaalgeoregister.nl/nwbwegen/wfs");
    addFeature("nwbwegen:wegvakken");
  }
  
  public static NwbWfsHost getInstance() {
    if (instance == null) {
      instance = new NwbWfsHost();
    }
    return instance;
  }
}

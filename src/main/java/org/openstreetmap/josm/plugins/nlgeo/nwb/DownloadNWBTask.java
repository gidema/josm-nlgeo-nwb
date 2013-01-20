// License: GPL. Copyright 2007 by Immanuel Scholz and others
package org.openstreetmap.josm.plugins.nlgeo.nwb;


import org.openstreetmap.josm.plugins.openservices.CustomDataLayer;
import org.openstreetmap.josm.plugins.openservices.wfs.DownloadWFSTask;

/**
 * Task allowing to download GPS data.
 */
public class DownloadNWBTask extends DownloadWFSTask {

  /**
   * Task to download 'Nationaal wegenbestand' data.
   * @param type
   */
  public DownloadNWBTask(NWBDataType type) {
    super(NwbWfsHost.getInstance());
    switch (type) {
    case WEGVAK:
      setWfsFeature("nwbwegen:wegvakken");
      this.setLayerName("wegvakken");
      break;
    }
  }

  @Override
  public CustomDataLayer createTargetLayer(String name) {
    return new CustomDataLayer(new NWBDataSet(), name);
  }
  
  
}

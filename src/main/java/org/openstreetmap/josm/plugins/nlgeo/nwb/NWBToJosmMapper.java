package org.openstreetmap.josm.plugins.nlgeo.nwb;

import java.util.HashMap;
import java.util.Map;

import org.openstreetmap.josm.data.osm.DataSet;
import org.openstreetmap.josm.data.osm.Way;
import org.openstreetmap.josm.plugins.openservices.JosmObjectFactory;
import org.openstreetmap.josm.plugins.openservices.ObjectToJosmMapper;

import com.vividsolutions.jts.geom.LineString;

/**
 * Build a josm DataSet from NWB features;
 * 
 * @author Gertjan Idema
 *
 */
public class NWBToJosmMapper implements ObjectToJosmMapper<Wegvak> {
  private final JosmObjectFactory objectFactory;

  /**
   * Default constructor. Set source CRS to epsg:28992 (RD new)
   */
  public NWBToJosmMapper(DataSet dataSet) {
    this.objectFactory = new JosmObjectFactory(dataSet, 28992);
  }

  @Override
  public void create(Wegvak wegvak) {
    Map<String, String> keys = createWayTags(wegvak);
    for (int i=0; i < wegvak.getWegdelen().getNumGeometries(); i++) {
      LineString ls = (LineString) wegvak.getWegdelen().getGeometryN(i);
      Way way = objectFactory.buildWay(ls);
      way.setKeys(keys);
    }
    return;
  }

  private static Map<String, String> createWayTags(Wegvak wegvak) {
    Map<String, String> keys = new HashMap<String, String>();
    keys.put("highway", "unclassified");
    keys.put("name", wegvak.getWegvaknaam());
    keys.put("source", "Nationaal wegenbestand");
    return keys;
  }
}

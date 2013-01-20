package org.openstreetmap.josm.plugins.nlgeo.nwb;

import org.opengis.feature.simple.SimpleFeature;
import org.openstreetmap.josm.plugins.openservices.wfs.WFSFeatureParser;

import com.vividsolutions.jts.geom.MultiLineString;

public class FeatureParser implements WFSFeatureParser<Wegvak> {
  
  @Override
  public Wegvak parse(SimpleFeature feature) {
    String type = feature.getFeatureType().getName().getLocalPart();
    if (type.equals("nwbwegen:wegvakken")) {
      return parseWegvak(feature);
    }
    return null;
  }
  
  public Wegvak parseWegvak(SimpleFeature feature) {
    Wegvak wegvak = new Wegvak();
    wegvak.setId(((Double)feature.getAttribute("wvk_id")).longValue());
    wegvak.setWegvaknaam((String) feature.getAttribute("stt_naam"));
    wegvak.setPlaatsnaam((String) feature.getAttribute("gme_naam"));
    wegvak.setWegdelen((MultiLineString) feature.getAttribute("geom"));
    return wegvak;
  }
}

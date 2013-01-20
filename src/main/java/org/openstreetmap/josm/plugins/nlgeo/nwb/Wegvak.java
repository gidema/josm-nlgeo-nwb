package org.openstreetmap.josm.plugins.nlgeo.nwb;

import com.vividsolutions.jts.geom.MultiLineString;

public class Wegvak {
  private Long id;
  private String wegvaknaam;
  private String plaatsnaam;
  private MultiLineString wegdelen;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getWegvaknaam() {
    return wegvaknaam;
  }

  public void setWegvaknaam(String wegvaknaam) {
    this.wegvaknaam = wegvaknaam;
  }

  public String getPlaatsnaam() {
    return plaatsnaam;
  }

  public void setPlaatsnaam(String plaatsnaam) {
    this.plaatsnaam = plaatsnaam;
  }

  public MultiLineString getWegdelen() {
    return wegdelen;
  }

  public void setWegdelen(MultiLineString wegdelen) {
    this.wegdelen = wegdelen;
  }
}

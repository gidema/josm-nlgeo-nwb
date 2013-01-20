package org.openstreetmap.josm.plugins.nlgeo.nwb;

public enum NWBDataType {
  WEGVAK("wegvak");
  
  String name;
  
  private NWBDataType(String name) {
    this.name = name;
  }
  
  @Override
  public String toString() {
    return name;
  }
}

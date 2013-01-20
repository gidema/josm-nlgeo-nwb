package org.openstreetmap.josm.plugins.nlgeo.nwb;

import java.util.HashMap;
import java.util.Map;

import org.openstreetmap.josm.plugins.openservices.ObjectToJosmMapper;
import org.openstreetmap.josm.plugins.openservices.wfs.WFSDataSet;

public class NWBDataSet extends WFSDataSet<Wegvak> {
  private final Map<Long, Wegvak> wegvakken = new HashMap<Long, Wegvak>();
  private final ObjectToJosmMapper<Wegvak> objectMapper = new NWBToJosmMapper(this);

  public NWBDataSet() {
    super(new FeatureParser());
  }

  @Override
  public void add(Wegvak wegvak) {
    if (wegvakken.get(wegvak.getId()) == null) {
      wegvakken.put(wegvak.getId(), wegvak);
      objectMapper.create(wegvak);
    }
  }
}

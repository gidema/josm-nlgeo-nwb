package org.openstreetmap.josm.plugins.nlgeo.nwb;

import static org.openstreetmap.josm.plugins.nlgeo.nwb.NWBDataType.WEGVAK;

import javax.swing.JMenu;

import org.openstreetmap.josm.plugins.Plugin;
import org.openstreetmap.josm.plugins.PluginInformation;
import org.openstreetmap.josm.plugins.openservices.OpenServicesPlugin;

public class NWBPlugin extends Plugin {
  
  private JMenu nwbMenu;
//  private static Logger logger = Logger.getLogger(OpenServicesPlugin.class.getName());

  public NWBPlugin(PluginInformation info) {
    super(info);
    addMenu();
  }

  public void addMenu() {
    JMenu mainMenu = OpenServicesPlugin.getMenu();
    nwbMenu = new JMenu("NWB");
    mainMenu.add(nwbMenu);
    nwbMenu.add(new DownloadNWBAction(WEGVAK));
    return;
  }
}

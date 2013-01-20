package org.openstreetmap.josm.plugins.nlgeo.nwb;

import static org.openstreetmap.josm.gui.help.HelpUtil.ht;
import static org.openstreetmap.josm.tools.I18n.tr;

import org.openstreetmap.josm.actions.downloadtasks.DownloadTask;
import org.openstreetmap.josm.plugins.openservices.CustomDownloadAction;

public class DownloadNWBAction extends CustomDownloadAction {
  /**
   * 
   */
  private static final long serialVersionUID = 1L;

  private final NWBDataType type;

  public DownloadNWBAction(NWBDataType type) {
    super(tr("Download " + type), "download", tr("Download NWB " + type +
        " data"), "NWB" + type, ht("/NWB/Download"));
    this.type = type;
  }

  @Override
  protected DownloadTask getDownloadTask() {
    return new DownloadNWBTask(type);
  }
}
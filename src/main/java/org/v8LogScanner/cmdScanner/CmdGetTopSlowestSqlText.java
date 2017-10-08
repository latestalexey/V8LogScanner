package org.v8LogScanner.cmdScanner;

import java.util.List;

import org.v8LogScanner.LocalTCPLogScanner.LanScanProfile;
import org.v8LogScanner.cmdAppl.CmdCommand;
import org.v8LogScanner.rgx.RegExp;
import org.v8LogScanner.rgx.RegExp.EventTypes;
import org.v8LogScanner.rgx.RegExp.PropTypes;
import org.v8LogScanner.rgx.ScanProfile;
import org.v8LogScanner.rgx.ScanProfile.RgxOpTypes;

public class CmdGetTopSlowestSqlText implements CmdCommand {

  @Override
  public String getTip() {
    return "";
  }

  @Override
  public void execute() {
    
    V8LogScannerAppl appl = V8LogScannerAppl.instance();
    ScanProfile.buildTopSlowestSqlText(appl.profile);

  }

}

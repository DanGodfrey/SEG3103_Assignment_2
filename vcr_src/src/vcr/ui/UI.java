package vcr.ui;

import vcr.util.*;

public interface UI {

  public void refresh();
  public void send(VCREvent event);
  public VCREvent next();
  
  public void start();
  public void stop();
  
}


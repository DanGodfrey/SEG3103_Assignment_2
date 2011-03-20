package vcr.ui;

import vcr.util.*;

public class VoidUI implements UI {

  VCRManager vcr_;

  public VoidUI() { 
  	init(new VCRManager(this));
  }

  public VoidUI(VCRManager vcr) {
    init(vcr);	
  }

  private void init(VCRManager vcr) {
    vcr_ = vcr;	
  }

  private VCRManager vcr() {
    return vcr_;	
  }
 
  public void start() {
    vcr().start();	
  }

  public void stop() {
    vcr().stop();	
  }

  public void refresh() {  }

  public void send(VCREvent event) {
    vcr_.processEvent(event);	
  }

  public VCREvent next() {
    return new VCREvent();
  }

  
}


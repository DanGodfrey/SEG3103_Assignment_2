package vcr.util;

import java.util.*;

public class VCRClock extends TimerTask {

  public static int SIMULATED_MINUTE_IN_MILLISECONDS = 5000;

   VCRManager vcr_;
   VCREvent timeout_;


   public VCRClock(VCRManager vcr) {
     vcr_ = vcr;   
     timeout_ = new VCREvent(VCREvent.UNIT_OF_TIME);         	
   }
    
  public void run() {
    vcr_.processEvent(timeout_);      	
  }


}


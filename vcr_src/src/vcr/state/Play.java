package vcr.state;

import vcr.util.*;

public class Play extends Ready  {


  //~~~~~~~~~~~~~~~~~~~~~
  // THE CONSTRUCTOR
  //~~~~~~~~~~~~~~~~~~~~~  

  public Play(VCRManager vcr) {
    super(vcr);
  }

  //~~~~~~~~~~~~~~~~~~~~~
  // INTERFACE
  //~~~~~~~~~~~~~~~~~~~~~  
  public VCRState handle(VCREvent event) { 

    VCRState nextState;
    String type = event.getType();
    
    if (type.equals(VCREvent.UNIT_OF_TIME)) {
      nextState = handleUnitOfTime();	
    
    } else {
      nextState = super.handle(event);
    }	
      
  	return nextState; 
  	
  }


  public VCRState handleUnitOfTime() {
    vcr().forward(VCRManager.SPEED_PLAY);
    return vcr().getState();
  }

  public String toString() {
    return "PLAY";	
  }
  
}


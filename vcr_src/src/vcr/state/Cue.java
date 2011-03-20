package vcr.state;

import vcr.util.*;

public class Cue extends Ready {

  //~~~~~~~~~~~~~~~~~~~~~
  // THE CONSTRUCTOR
  //~~~~~~~~~~~~~~~~~~~~~  

  public Cue(VCRManager vcr) {
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

  public String toString() {
    return ">>";	
  }

  public VCRState handleUnitOfTime() {
    vcr().forward(VCRManager.SPEED_CUE);
    return vcr().getState();
  }

}

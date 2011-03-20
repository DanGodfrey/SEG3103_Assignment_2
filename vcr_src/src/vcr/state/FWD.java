package vcr.state;

import vcr.util.*;

public class FWD extends Ready  {

  //~~~~~~~~~~~~~~~~~~~~~
  // THE CONSTRUCTOR
  //~~~~~~~~~~~~~~~~~~~~~  

  public FWD(VCRManager vcr) {
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
    
    }else if (type.equals(VCREvent.RECORD)) {
      nextState = handleNoAction();  	
    
    } else if (type.equals(VCREvent.PAUSE)) {
      nextState = handleNoAction();  	

    } else if (type.equals(VCREvent.CUE)) {
      nextState = handleNoAction();  	

    } else if (type.equals(VCREvent.REVERSE)) {    
      nextState = handleNoAction();  	
        
    } else {
      nextState = super.handle(event);
    }	
      
  	return nextState; 
  	
  }

  public String toString() {
    return "FWD";	
  }


  public VCRState handleUnitOfTime() {
    vcr().forward(VCRManager.SPEED_FAST);
    return vcr().getState();
  }

}

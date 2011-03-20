package vcr.state;

import vcr.util.*;

public class Rewind extends Ready  {

  //~~~~~~~~~~~~~~~~~~~~~
  // THE CONSTRUCTOR
  //~~~~~~~~~~~~~~~~~~~~~  

  public Rewind(VCRManager vcr) {
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
    
    } else if (type.equals(VCREvent.CUE)) {
      nextState = super.handleNoAction();  	

    } else if (type.equals(VCREvent.REVERSE)) {    
      nextState = super.handleNoAction();  	
        
    } else {
      nextState = super.handle(event);
    }	
      
  	return nextState; 
  	
  }

  public String toString() {
    return "RWD";	
  }



  public VCRState handleUnitOfTime() {
  	vcr().reverse(VCRManager.SPEED_FAST);
    return vcr().getState();
  }

}

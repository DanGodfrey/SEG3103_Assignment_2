package vcr.state;

import vcr.util.*;

public class Idle extends Ready  {

  //~~~~~~~~~~~~~~~~~~~~~
  // THE CONSTRUCTOR
  //~~~~~~~~~~~~~~~~~~~~~  

  public Idle(VCRManager vcr) {
    super(vcr);
  }

  //~~~~~~~~~~~~~~~~~~~~~
  // INTERFACE
  //~~~~~~~~~~~~~~~~~~~~~  
  public VCRState handle(VCREvent event) { 
    VCRState nextState;
    String type = event.getType();
    
    if (type.equals(VCREvent.PAUSE)) {
      nextState = handleNoAction();	

    } else if (type.equals(VCREvent.REVERSE)) {
      nextState = handleNoAction();	

    } else if (type.equals(VCREvent.END_OF_TAPE)) {
      nextState = handleNoAction();	    
    
    } else {
      nextState = super.handle(event);
    }	
      
  	return nextState; 
  }

  public String toString() {
    return "[]";	
  }

}

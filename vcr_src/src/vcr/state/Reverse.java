package vcr.state;

import vcr.util.*;

public class Reverse extends Ready  {

  //~~~~~~~~~~~~~~~~~~~~~
  // THE CONSTRUCTOR
  //~~~~~~~~~~~~~~~~~~~~~  

  public Reverse(VCRManager vcr) {
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
      nextState = super.handleNoAction();  	
        
    } else {
      nextState = super.handle(event);
    }	
      
  	return nextState; 
  	
  }

  public String toString() {
    return "<<";	
  }


  public VCRState handleUnitOfTime() {
  	vcr().reverse(VCRManager.SPEED_CUE);
    return vcr().getState();
  }

}

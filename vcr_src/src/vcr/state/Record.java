package vcr.state;

import vcr.util.*;

public class Record extends Ready  {

  //~~~~~~~~~~~~~~~~~~~~~
  // THE CONSTRUCTOR
  //~~~~~~~~~~~~~~~~~~~~~  

  public Record(VCRManager vcr) {
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
    
    }else if (type.equals(VCREvent.PLAY)) {
      nextState = super.handleNoAction();  	

    } else if (type.equals(VCREvent.FWD)) {
      nextState = super.handleNoAction();  	

    } else if (type.equals(VCREvent.REWIND)) {    
      nextState = super.handleNoAction();  	
    
    } else if (type.equals(VCREvent.CUE)) {
      nextState = super.handleNoAction();  	

    } else if (type.equals(VCREvent.REVERSE)) {    
      nextState = super.handleNoAction();  	

    } else if (type.equals(VCREvent.END_OF_TAPE)) {    
      nextState = super.handleEndOfTape();  	
        
    } else {
      nextState = super.handle(event);
    }	
      
  	return nextState; 
  	
  }

  public String toString() {
    return "REC";	
  }


  public VCRState handleUnitOfTime() {
    vcr().record();
    return vcr().getState();
  }

  public VCRState handleEndOfTape() {
    return new Rewind(vcr());	
  }

}

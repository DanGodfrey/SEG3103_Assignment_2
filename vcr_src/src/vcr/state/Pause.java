package vcr.state;

import vcr.util.*;

public class Pause extends Ready  {

  boolean wasRecording_;

  //~~~~~~~~~~~~~~~~~~~~~
  // THE CONSTRUCTOR
  //~~~~~~~~~~~~~~~~~~~~~  

  public Pause(VCRManager vcr) {
    super(vcr);	
    wasRecording_ = (vcr().getState() instanceof Record) ? true : false;
  }


  //~~~~~~~~~~~~~~~~~~~~~
  // INTERFACE
  //~~~~~~~~~~~~~~~~~~~~~  
  public VCRState handle(VCREvent event) { 

    VCRState nextState;
    String type = event.getType();
    
    if (type.equals(VCREvent.UNIT_OF_TIME)) {
      nextState = handleUnitOfTime();	

    }else if (type.equals(VCREvent.PLAY) && wasRecording_) {
      nextState = handleNoAction();

    }else if (type.equals(VCREvent.REWIND) && wasRecording_) {
      nextState = handleNoAction();

    }else if (type.equals(VCREvent.FWD) && wasRecording_) {
      nextState = handleNoAction();

    }else if (type.equals(VCREvent.CUE) && wasRecording_) {
      nextState = handleNoAction();

    }else if (type.equals(VCREvent.REVERSE) && wasRecording_) {
      nextState = handleNoAction();

    }else if (type.equals(VCREvent.RECORD) && !wasRecording_) {
      nextState = handleNoAction();
   
    }else if (type.equals(VCREvent.PAUSE)) {
      nextState = handlePause();
    
    } else {
      nextState = super.handle(event);
    }	
      
  	return nextState; 
  	
  }


  public VCRState handleUnitOfTime() {
    return super.handleNoAction();
  }
  
  public VCRState handlePause() {

    VCRState nextState;
  
    if (wasRecording_) {
      nextState = new Record(vcr());
    } else {
      nextState = new Play(vcr());
    }
    
    return nextState;   	  
	
  }

  public String toString() {
    return "PAUSE";	
  }

}

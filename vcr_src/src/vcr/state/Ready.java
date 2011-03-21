package vcr.state;

import vcr.util.*;

public abstract class Ready implements VCRState {

  VCRManager vcr_;

  //~~~~~~~~~~~~~~~~~~~~~
  // THE GETTERS
  //~~~~~~~~~~~~~~~~~~~~~  
  protected VCRManager vcr() {
    return vcr_;	
  }


  //~~~~~~~~~~~~~~~~~~~~~
  // THE CONSTRUCTOR
  //~~~~~~~~~~~~~~~~~~~~~  

  public Ready(VCRManager vcr) {
    vcr_ = vcr;
  }


  //~~~~~~~~~~~~~~~~~~~~~
  // INTERFACE METHOD
  //~~~~~~~~~~~~~~~~~~~~~  

  public VCRState handle(VCREvent event) {
 
    VCRState nextState;
    String type = event.getType();
    
    if (type.equals(VCREvent.POWER)) {
      nextState = handlePower();  	
    
    } else if (type.equals(VCREvent.PLAY)) {
      nextState = handlePlay();
          	
    } else if (type.equals(VCREvent.STOP)) {    	
      nextState = handleStop();

    } else if (type.equals(VCREvent.EJECT)) {    	
      nextState = handleEject();

    } else if (type.equals(VCREvent.INJECT)) {    	
      nextState = handleNoAction();



    } else if (type.equals(VCREvent.FWD)) {    	
      nextState = handleFWD();
      
    } else if (type.equals(VCREvent.REWIND)) {    	
      nextState = handleRewind();


    } else if (type.equals(VCREvent.CUE)) {    	
      nextState = handleCue();
 
    } else if (type.equals(VCREvent.REVERSE)) {    	
      nextState = handleReverse();



    } else if (type.equals(VCREvent.RECORD)) {    	
      nextState = handleRecord();

    } else if (type.equals(VCREvent.PAUSE)) {    	
      nextState = handlePause();

    } else if (type.equals(VCREvent.UNIT_OF_TIME)) {    	
      nextState = handleNoAction();

    } else if (type.equals(VCREvent.START_OF_TAPE)) {    	
      nextState = handleStartOfTape();


    } else if (type.equals(VCREvent.END_OF_TAPE)) {    	
      nextState = handleEndOfTape();


    } else {
      nextState = handleNoAction();	
    
    }  	
  	
  	return nextState; 	
  	
  }

  public String toString() {
    return this.getClass().getName();	
  }


  //~~~~~~~~~~~~~~~~~~~~~
  // DISPATCH METHODS
  //~~~~~~~~~~~~~~~~~~~~~  

  public VCRState handleNoAction() {
    return this;	
  }


  public VCRState handlePower() {
    return new Off(vcr());	
  }

  public VCRState handlePlay() {
    return new Play(vcr());	
  }

  public VCRState handleStop() {
   
    return new Idle(vcr());
  }

  public VCRState handleEject() {
    vcr().eject();
    return new Empty(vcr());	
  }




  public VCRState handleFWD() {
    return new FWD(vcr());	
  }

  public VCRState handleRewind() {
    return new Rewind(vcr());	
  }

  public VCRState handleCue() {
    return new Cue(vcr());	
  }

  public VCRState handleReverse() {
    return new Reverse(vcr());	
  }



  public VCRState handleRecord() {
    return new Record(vcr());	
  }

  public VCRState handlePause() {
    return new Pause(vcr());	
  }


  public VCRState handleEndOfTape() {
    return new Rewind(vcr());	
  }

  public VCRState handleStartOfTape() {
    return new Idle(vcr());	
  }

}


package vcr.state;

import vcr.util.*;

public class Off implements VCRState{

  VCRManager vcr_;

  //~~~~~~~~~~~~~~~~~~~~~
  // THE GETTERS
  //~~~~~~~~~~~~~~~~~~~~~  
  private VCRManager vcr() {
    return vcr_;	
  }
  


  //~~~~~~~~~~~~~~~~~~~~~
  // THE CONSTRUCTOR
  //~~~~~~~~~~~~~~~~~~~~~  

  public Off(VCRManager vcr) {
    vcr_ = vcr;	
  }

  //~~~~~~~~~~~~~~~~~~~~~
  // INTERFACE
  //~~~~~~~~~~~~~~~~~~~~~  


  public VCRState handle(VCREvent event) {
  	
    VCRState nextState;
    String type = event.getType();
    
    if (type.equals(VCREvent.POWER)) {
      nextState = handlePower();  	

    } else if (type.equals(VCREvent.INJECT)) {
      nextState = handleInject();	

    } else if (type.equals(VCREvent.EJECT)) {
      nextState = handleEject();	
    	
    } else {
      nextState = handleNoAction();	
    }  	
  	
  	return nextState;
  	
  }

  public String toString() {
    return "Off";	
  }


  //~~~~~~~~~~~~~~~~~~~~~
  // PRIVATE
  //~~~~~~~~~~~~~~~~~~~~~  

  public VCRState handleNoAction() {
    return this;	
  }


  private VCRState handlePower() {
    return new Empty(vcr());
  }

  public VCRState handleInject() {
    VCRState next;
    if (vcr().getTape() instanceof NullDevice) {
      vcr().inject();
      next = new Idle(vcr());	
    } else {
      next = handleNoAction();
    }	
    return next;
  }

  public VCRState handleEject() {
    VCRState next;
    if (vcr().getTape() instanceof NullDevice) {
      next = handleNoAction();
    } else {
      vcr().eject();
      next = new Empty(vcr());	      
    }	
    return next;
  	
  }



}


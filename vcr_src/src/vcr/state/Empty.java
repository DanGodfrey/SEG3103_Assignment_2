package vcr.state;

import vcr.util.*;


public class Empty implements VCRState {

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

  private void init(VCRManager vcr) {
    vcr_ = vcr;	
  }

  public Empty(VCRManager vcr) {
    init(vcr);
  }


  //~~~~~~~~~~~~~~~~~~~~~
  // INTERFACE METHODS
  //~~~~~~~~~~~~~~~~~~~~~  

  public VCRState handle(VCREvent event) {
  	
    VCRState nextState;
    String type = event.getType();
    
    if (type.equals(VCREvent.POWER)) {
      nextState = handlePower();  	
    
    } else if (type.equals(VCREvent.INJECT)) {
      nextState = handleInject();	
    
    } else {
      nextState = handleOther();	
    }  	
  	
  	return nextState;
  	
  }

  public String toString() {
    return "[]";	
    
  }


  //~~~~~~~~~~~~~~~~~~~~~
  // DISPATCH METHODS
  //~~~~~~~~~~~~~~~~~~~~~  

  public VCRState handlePower() {
    return new Off(vcr());	
  }

  public VCRState handleInject() {
    vcr().inject();
    return new Idle(vcr());	
  }

  public VCRState handleOther() {
    return this;	
  }


}


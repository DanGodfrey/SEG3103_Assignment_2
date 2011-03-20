package vcr.util;

import java.util.Timer;

import vcr.state.*;
import vcr.ui.*;

public class VCRManager {

  UI ui_;
  VCRState state_;
  Device tape_;
  Timer timer_;
  boolean recording_;

  public static final String POWER_ON = "on";
  public static final String POWER_OFF = "off";

  public static final int SPEED_PLAY = 1;
  public static final int SPEED_CUE = 2;
  public static final int SPEED_FAST = 5;
  public static final int SPEED_PAUSE = 0;
  public static final int SPEED_STOP = 0;

  public static final String MOTION_FORWARD = "forward";
  public static final String MOTION_REVERSE = "reverse";
  public static final String MOTION_NONE = "no_motion";

  public static final String VIEW_TV = "tv";
  public static final String VIEW_TAPE = "tape";  


  //~~~~~~~~~~~~~~~~~~~~~
  // THE CONSTRUCTOR
  //~~~~~~~~~~~~~~~~~~~~~  

  public VCRManager() {
    init(new VoidUI(this));	
  }

  public VCRManager(UI ui) {
    init(ui);
  }



  private void init(UI ui) {
    ui_ = ui;
    state_ = new Off(this);
    tape_ = NullDevice.getDefault();
    recording_ = false;
    timer_ = new Timer();
  }


  //~~~~~~~~~~~~~~~~~~~~~
  // CONTROLLING TIME
  //~~~~~~~~~~~~~~~~~~~~~  

  public void start() {
    timer_.schedule(new VCRClock(this),1000,VCRClock.SIMULATED_MINUTE_IN_MILLISECONDS);	
  }

  public void stop() {
    timer_.cancel();	
  }


  //~~~~~~~~~~~~~~~~~~~~~
  // HANDLING EVENTS
  //~~~~~~~~~~~~~~~~~~~~~  
  
  public void processEvent(VCREvent event) { 
    VCRState nextState = getState().handle(event);
    state_ = nextState;
    ui_.refresh();
  }

  public void forward(int speed) {
    Time t = new Time(speed);
    processEvent(getTape().forward(t));
  }

  public void reverse(int speed) {
    Time t = new Time(speed);
    processEvent(getTape().reverse(t));
  }

  public void record() {
    getTape().record(TV.getChar(1)); 
    forward(VCRManager.SPEED_PLAY);	
  }

  public void inject() {
    tape_ = new Tape();
  }

  public void eject() {
    tape_ = NullDevice.getDefault();
  }


  //~~~~~~~~~~~~~~~~~~~~~
  // GETTERS
  //~~~~~~~~~~~~~~~~~~~~~  

  public VCRState getState() {
    return state_;	
  }

  public Device getTape() {
    return tape_;	
  }
}


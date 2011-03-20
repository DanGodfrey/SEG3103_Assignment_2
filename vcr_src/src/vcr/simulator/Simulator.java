package vcr.simulator;

import java.util.Random;
import java.util.Date;

import vcr.util.*;
import vcr.ui.Console;


public class Simulator {

  static VCREvent unit_of_time;
  static String[] events;
  static Random r;  

  public Simulator() {
    init();	
  }
  
  public static void init() {
    events = new String[11];
    events[0] = VCREvent.PLAY;  	
    events[1] = VCREvent.STOP;
    events[2] = VCREvent.INJECT;
    events[3] = VCREvent.EJECT;
    events[4] = VCREvent.POWER;          	
          	
    events[5] = VCREvent.FWD;  	
    events[6] = VCREvent.REWIND;  	
    events[7] = VCREvent.CUE;  	
    events[8] = VCREvent.REVERSE;  	
    
    events[9] = VCREvent.RECORD;  	
    events[10] = VCREvent.PAUSE;  	
 	
    
    r = new Random((new Date()).getTime());
    unit_of_time = new VCREvent(VCREvent.UNIT_OF_TIME);  
  }

  public static VCREvent nextEvent() {
    int i = Math.abs(r.nextInt()) % events.length;
    return new VCREvent(events[i]);       
  }

  public static void main(String[] args) {
    init();
    Console ui = new Console();
    ui.start();

    while (true) {
      VCREvent event = nextEvent();
      ui.send(event);
      ui.send(unit_of_time);
    } 
  }


}


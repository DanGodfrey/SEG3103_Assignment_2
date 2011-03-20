
package vcr.simulator;

import vcr.util.*;
import vcr.ui.Console;

import java.util.Random;
import java.util.Date;

public class ReadySimulator {

  static VCREvent unit_of_time;
  static String[] events;
  static Random r;  
  
  public static void init() {
    events = new String[9];
    events[0] = VCREvent.PLAY;  	
    events[1] = VCREvent.STOP;
          	
    events[2] = VCREvent.FWD;  	
    events[3] = VCREvent.REWIND;  	
    events[4] = VCREvent.CUE;  	
    events[5] = VCREvent.REVERSE;  	
    
    events[6] = VCREvent.RECORD;  	
    events[7] = VCREvent.PAUSE;  	

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

    VCREvent event = new VCREvent(VCREvent.INJECT);
    ui.send(event);

    while (true) {
      event = nextEvent();
      ui.send(event);
      ui.send(unit_of_time);
    } 
  }

}
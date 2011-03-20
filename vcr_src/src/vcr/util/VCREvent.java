package vcr.util;


import java.util.* ;


public class VCREvent {


  //~~~~~~~~~~~~~~~~~~~~~
  // EVENT CONSTANTS
  //~~~~~~~~~~~~~~~~~~~~~  


  public static final String POWER = "power";
  public static final String PLAY = "play";
  public static final String STOP = "stop";
  public static final String EJECT = "eject";
  public static final String INJECT = "inject"; 

  public static final String FWD = "fwd";
  public static final String REWIND = "rewind";
  public static final String CUE = "cue";
  public static final String REVERSE = "reverse";

  public static final String RECORD = "record";
  public static final String PAUSE = "pause"; 

  public static final String UNIT_OF_TIME = "timeout";
  public static final String END_OF_TAPE = "end_of_tape";
  public static final String START_OF_TAPE = "start_of_tape";

  public static final String UNKNOWN = "unknown";
  public static final String NO_EVENT = "no_event";



  String type_;
  String value_;
  String[] info_;


  //~~~~~~~~~~~~~~~~~~~~~
  // CLASS METHODS
  //~~~~~~~~~~~~~~~~~~~~~  


  public static String[] getInfo(String msg) {
    
    StringTokenizer info = new StringTokenizer (msg) ;
    String[] values = new String[info.countTokens()];
    
    for(int i=0; i<values.length; i++) {
      values[i] = info.nextToken();	
    }
        
    return values;
  }


  public static String getType(String msg) {
    
    String[] info = getInfo(msg);
    String type;
    
    if (info.length >0) {
      type = info[0];
    } else {
      type = UNKNOWN;
    }
        
    return (isEvent(msg)) ? type : UNKNOWN;
  }



  //~~~~~~~~~~~~~~~~~~~~~
  // GETTERS
  //~~~~~~~~~~~~~~~~~~~~~  
  


  public String getType() {
    return type_;	
  }


  public String getValue() {
    return value_;	
  }



  //~~~~~~~~~~~~~~~~~~~~~
  // CONSTRUCTOR
  //~~~~~~~~~~~~~~~~~~~~~  


  private void init(String msg) {
    value_ = msg;
    info_ = getInfo(msg);
    type_ = (isEvent(msg)) ? info_[0] : UNKNOWN;
  }


  public VCREvent() {
    init(NO_EVENT);	
  }


  public VCREvent(String msg) {
    
    if (msg == null) {
      init(NO_EVENT);  	
    } else {
      init(msg);  	
    }
  }
 
  public static boolean isEvent(String msg) {
    
    return
      ( msg.startsWith(UNKNOWN) ||
        msg.startsWith(NO_EVENT) ||
        msg.startsWith(POWER) ||
        msg.startsWith(PLAY) ||
        msg.startsWith(STOP) ||
        msg.startsWith(FWD) ||
        msg.startsWith(REWIND) ||
        msg.startsWith(CUE) ||
        msg.startsWith(REVERSE) ||
        msg.startsWith(RECORD) ||
        msg.startsWith(EJECT) ||
        msg.startsWith(INJECT) ||
        msg.startsWith(UNKNOWN) ||
        msg.startsWith(PAUSE) ||
        msg.startsWith(UNIT_OF_TIME) ||
        msg.startsWith(START_OF_TAPE) ||
        msg.startsWith(END_OF_TAPE)
      )  
        ? true : false;    
  }  	


  public boolean equals(VCREvent event) {
    return (getValue().equals(event.getValue()));  	
  }


  public String toString() {
    String e = "Event: <" + getType() + ">";
    String u = "Unknown: <" + getValue() + ">";
    return (isEvent(getValue())) ? e : u;
  }


}



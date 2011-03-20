package vcr.util;

public class Debug {

  public static final String DEBUG = "debug";
  public static final String PROBE = "probe";
  public static final String PRODUCTION = "production";
  public static final String DEFAULT = PRODUCTION;

  private static Debug this_;
  private String level_;
  private String id_;

  //```````````````````````
  // CONSTRUCTOR
  //```````````````````````  
 
  public Debug() { 
    init();
  }

  private void init() {
    set(DEBUG);	
  }

  public static synchronized Debug getDefault() {
    if (this_ == null) {
      this_ = new Debug();	
    }
    return this_;
  }

  public static Debug getDefault(String level) {
    Debug debug = getDefault();
    debug.set(level);
    return debug;  	
  }

  //```````````````````````
  // SETTING PRIORITY LEVELS
  //```````````````````````  

  public void set(String level) {

    boolean isValidLevel = (level.equals(DEBUG) || level.equals(PROBE) || level.equals(PRODUCTION));
    
    if (isValidLevel) {
      level_ = level;
      if (level_.equals(DEBUG)) {
        id_ = "DEBUG: ";	
      } else if (level_.equals(PROBE)) {
      	id_ = "PROBE: ";
      } else if (level_.equals(PRODUCTION)) {
        id_ = "";	
      }
    } else {
      level_ = DEFAULT;
      id_ = "";	
    }
  }


  //```````````````````````
  // DISPLAYING INFO
  //```````````````````````  

  public void println(Object m) {
    
    boolean doPrint = !level_.equals(PRODUCTION);
    
    if (doPrint) {
      String msg;
      try {
        msg = m.toString();      
      } catch (Exception e) {
        msg = e.toString();
      }
      System.out.println(id_ + msg);
    }
  }

  public void println(Object[] msg) {
    String m = "(ARRAY OF SIZE " + msg.length + ")";
    println(m);
    for(int i=0; i < msg.length; i++) {
      println(msg[i]);
    }
  }

  public void println(boolean b) {
    String msg = b + "";
    println(msg);
  }

  public void println(int a) {
    String msg = a + "";
    println(msg); 	
  }

}

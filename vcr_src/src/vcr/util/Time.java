package vcr.util;

public class Time {

  //~~~~~~~~~~~~~~~~~~~~~
  // DEFAULT PROPERTIES 
  //~~~~~~~~~~~~~~~~~~~~~  



  public static int SECONDS_PER_MINUTE = 60;
  public static int MINUTES_PER_HOUR = 60;
  public static int SECONDS_PER_HOUR = SECONDS_PER_MINUTE * MINUTES_PER_HOUR;
  public static int MILLISECONDS_PER_SECOND = 1000;
  
  long seconds_;

  private void setTime(int hours, int minutes, int seconds){
    long hoursInSeconds = hours * SECONDS_PER_HOUR;
    long minutesInSeconds = minutes * SECONDS_PER_MINUTE;
    seconds_ = hoursInSeconds + minutesInSeconds + seconds;
  }


  //~~~~~~~~~~~~~~~~~~~~~
  // CONSTRUCTORS
  //~~~~~~~~~~~~~~~~~~~~~  


  public Time(int hours, int minutes, int seconds) {
    setTime(hours,minutes,seconds);
  }

  public Time(int minutes) {
    setTime(0,minutes,0);
  }



  //~~~~~~~~~~~~~~~~~~~~~
  // PRIVATE PROPERTIES
  //~~~~~~~~~~~~~~~~~~~~~  

  private String append0(int t) {
    
    t = Math.abs(t);
    String leading0 = "0";
    String time = new String((new Long(t)).toString());
    if (t < 10)	{
      time = leading0.concat(time);  	
    }
    return time;
  }

  private int getHours() {
    long hours = seconds() / SECONDS_PER_HOUR;
    return (int)hours;
  }


  private int getMinutes() {
    long minutes = (seconds() % SECONDS_PER_HOUR) / SECONDS_PER_MINUTE;
    return (int)minutes;	
  }


  private int getSeconds() {
    long seconds = (seconds() % SECONDS_PER_HOUR) % SECONDS_PER_MINUTE;	
  	return (int)seconds;
  }



  //~~~~~~~~~~~~~~~~~~~~~
  // BASIC EQUALITIES
  //~~~~~~~~~~~~~~~~~~~~~  


  public boolean equals(Time t) {
    return (seconds() == t.seconds());	
  }


  public boolean lessThan(Time t) {
    return (this.seconds() < t.seconds());	
  }


  public boolean greaterThan(Time t) {
  	return (this.seconds() > t.seconds());
  }

  public boolean lessThanOrEqual(Time t) {
    return this.lessThan(t) || equals(t);  	
  }
  
  public boolean greaterThanOrEqual(Time t) {
    return this.greaterThan(t) || equals(t);    	
  }



  //~~~~~~~~~~~~~~~~~~~~~
  // BASIC OPERATIONS
  //~~~~~~~~~~~~~~~~~~~~~  

  
  public long seconds() { return seconds_; }

  public int inMinutes() {
    long minutes = seconds()/ SECONDS_PER_MINUTE ;    	
    return (int) minutes;
  }

  public void offset(long seconds) {
    seconds_ = seconds() + seconds;
  }



  public void add(Time t) {
    offset(t.seconds());
  }


  public void subtract(Time t) {
    offset(-t.seconds());
  }


  public String toString() {
    
    String s = (seconds() < 0) ? "-" : "";
    return 	s + append0(getHours()) + ":" + append0(getMinutes()) + ":" + append0(getSeconds());
  	
  }

  public Time copy() {
    return new Time(getHours(),getMinutes(),getSeconds());	
  }


}



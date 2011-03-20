package vcr.util;


public class Tape implements Device {


  //~~~~~~~~~~~~~~~~~~~~~
  // DEFAULT PROPERTIES AND CONSTRUCTOR
  //~~~~~~~~~~~~~~~~~~~~~  

  public static final Time DEFAULT_POSITION = new Time(0);
  public static final Time DEFAULT_LENGTH = new Time(180);
  public static final Time START = new Time(0,0,0);


  //``````````````````````
  // THE TAPE'S PROPERTIES
  //``````````````````````


  Time length_;
  Time position_;
  String name_;
  char[] info;

  //``````````````````````
  // CONSTRUCTORS
  //``````````````````````

  private void init(Time length, Time position) {
    length_ = length.copy();
    position_ = position.copy();  	
    info = new char[length_.inMinutes()];
  }


  public Tape() { 
  	init(DEFAULT_LENGTH, DEFAULT_POSITION); 
  }

  public Tape(Time position) {
    init(DEFAULT_LENGTH,position);
  }  


  public Tape(Time position, Time length) {
    init(length,position); 
  }



  //``````````````````````
  // BASIC PROPERTIES
  //``````````````````````

  public boolean isAtEnd() {
    return (this.position().equals(length_)) ? true : false;
  }


  public boolean isAtStart() {
    return (this.position().equals(START)) ? true : false;
  }

  private VCREvent status() {
    VCREvent event;
    
    if (isAtStart()) {
      event = new VCREvent(VCREvent.START_OF_TAPE);
    } else {
      event = new VCREvent();	
    }   
    return event;   	
  }


  //``````````````````````
  // INTERFACE METHODS
  //``````````````````````

  public VCREvent forward(Time t) {
    position_.add(t);
    return status();	
  }


  public VCREvent reverse(Time t) {
    position_.subtract(t);
    return status();
  }

  public void record(char c) {
    info[position_.inMinutes()] = c;
  }


  public Time position() {
    return position_;	
  }

  public char show() {
    char c = info[position_.inMinutes()];
    char[] empty = new char[1];
    return c == empty[0] ? ' ' : c ;
  }

  public String toString() {
    return position_.toString();	
  }


}



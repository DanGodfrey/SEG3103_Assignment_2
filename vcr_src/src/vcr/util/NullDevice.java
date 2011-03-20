package vcr.util;

public class NullDevice implements Device  {

  private static NullDevice this_;

  private NullDevice() { }
  
  public static synchronized NullDevice getDefault() {
  	if (this_ == null) {
  	  this_ = new NullDevice();
  	}
  	return this_;
  }
  
  public VCREvent forward(Time t) {
    return new VCREvent();	
  }
 
  public VCREvent reverse(Time t) {
    return new VCREvent();	
  }

  public void record(char c) { }
 
 
  public Time position() {
    return new Time(0);	
  }
 
  public String toString() {
    return "-- -- --";	
  }
 
  public char show() {
    return ' ';	
  }
 
}



package vcr.util;

public interface Device {

  public VCREvent forward(Time t);
  public VCREvent reverse(Time t);
  public void record(char c);
  public String toString();
  public char show();
  public Time position();

}



package vcr.util;

import java.util.Random;

class TV implements Runnable {

  public static final long DEFAULT_CHANNEL = 2;
  private static final int MIN_CHARACTER = 65;
  private static final int MAX_CHARACTER = 90;

  long channel_;
  Random content_;

  //````````````````
  // THE CONSTRUCTORS
  //````````````````

  private void init(long channel) {
    content_ = new Random();
    setChannel(channel);
  }

  public TV () {
   init(DEFAULT_CHANNEL);
  }

  public TV(long channel) {
    init(channel);
  }

  //````````````````
  // INTERFACE METHODS
  //````````````````

  public String toString() {
    return getContent(getChannel()).toString();
  }


  //````````````````
  // THE GETTERS AND SETTERS
  //````````````````

  public void setChannel(long channel) {
    channel_ = channel;
    content_.setSeed(channel);
  }

  public long getChannel() {
    return channel_;
  }

  public Character getContent(long channel) {
    char info = getChar(content_.nextInt());
    return new Character((char)info);
  }

  public static char getChar(int info) {
    info = Math.abs(info);
    int a = (int)(info % (MAX_CHARACTER - MIN_CHARACTER + 1)) + MIN_CHARACTER;
    return (char)a;
  }



  public void run() {
    while(true) {

    try {
        Thread.sleep(100);
        System.out.print(this);
      } catch (InterruptedException e) {
        System.out.println("<eol>");
      }
    }

  }

  public static void main(String[] args) { 
    TV  tv = new TV(2); 
    tv.run(); 
  } 


}



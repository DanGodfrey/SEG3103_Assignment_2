package vcr.ui;

import java.io.*;

import vcr.*;
import vcr.util.*;
import vcr.state.*;

public class Console implements UI {

  static private final int SCREEN_LENGTH = 30;
  static VCRManager vcr_;  

  //`````````````````````````
  // CONSTRUCTOR
  //`````````````````````````

  public Console() { 
    init(new VCRManager(this));    
  }
  
  public Console(VCRManager vcr) {
    init(vcr);	
  }

  private void init(VCRManager vcr) {
    vcr_ = vcr;	
  }



  //~~~~~~~~~~~~~~~~~~~~~
  // INTERFACE METHODS
  //~~~~~~~~~~~~~~~~~~~~~  

  public void start() {
    vcr().start();	
  }

  public void stop() {
    vcr().stop();	
  }

  public void refresh() {
    displayln("");
    VCRState state = vcr().getState();
    String line1 = " " + state + " " + "[ " + vcr().getTape().toString() + "]";

    displayln(screenOutline());
    displayln(showLine(line1));
    displayln(screenOutline());   
    displayln("");
  }

  public void send(VCREvent event) {
    vcr().processEvent(event);	
  }

  public VCREvent next() {
    try {
      displayln("");
      display("Next Event:");
      return new VCREvent(Input.readString());    	
    } catch (IOException e) {
    	return new VCREvent();
    }
  }
  


  //~~~~~~~~~~~~~~~~~~~~~
  // INTERNAL DISPLAY UI OPTIONS
  //~~~~~~~~~~~~~~~~~~~~~  

  private void display(Object a) {
    System.out.print(a.toString());	
  }

  private void displayln(Object a) {
    display(a + "\n");	
  }

  private static String screenDelimit() {
    return "+";	
  }

  private static String showLine(String line) {
  
    int nextIndex = line.length() + screenDelimit().length();
    int lastIndex = SCREEN_LENGTH - screenDelimit().length();
    
    String toEndOfLine = "";
    for (int i=nextIndex; i < lastIndex; i++) {
      toEndOfLine = toEndOfLine.concat(" ");	
    }	
    
    String ans = screenDelimit() + line + toEndOfLine + screenDelimit();
    return ans;
  	
  }

  private static String screenOutline() {
    String a = "";
    for (int i=0; i< SCREEN_LENGTH; i++) {
      a = a.concat(screenDelimit());	
    }
    return a;	
  }

  private VCRManager vcr() {
    return vcr_;
  }





}

package vcr;

import vcr.ui.*;


public class VCR {

  public static void main(String[] args) {
    
    UI ui = new Console();
    
    if (args.length > 0) {
      ui.start();	
    }
    
    while(true) {
      ui.send(ui.next());	
    }
  }

}


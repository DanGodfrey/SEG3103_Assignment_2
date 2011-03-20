
package vcr.ui;

import java.io.* ;
import java.util.* ; // needed for StringTokenizer

class Input {

  static final BufferedReader keyboard = new BufferedReader( new InputStreamReader(System.in));

  static int readInt()  throws IOException { 
    return new Integer (keyboard.readLine().trim() ).intValue() ;
  }

  static double readDouble()  throws IOException{ 
    return new Double (keyboard.readLine().trim() ).doubleValue() ;
  }

  static double[] readDoubleLine()  throws IOException  { 
    StringTokenizer dline = new StringTokenizer (keyboard.readLine()) ;
    double[] values = new double[dline.countTokens()] ;
    for (int i = 0 ; i < values.length ; i++ )
      values[i] = new Double (dline.nextToken()).doubleValue() ;
    return values ;
  }

  static int[] readIntLine()  throws IOException  { 
    StringTokenizer iline = new StringTokenizer (keyboard.readLine()) ;
    int[] values = new int[iline.countTokens()] ;
    for (int i = 0 ; i < values.length ; i++ )
         values[i] = Integer.parseInt (iline.nextToken()) ;
    return values ;
  }

  static char[] readCharLine()  throws IOException { 
    String cline = keyboard.readLine() ;
    char[] values = new char[cline.length()] ;
    cline.getChars(0,cline.length(),values,0);
    return values ;
  }
  
  static String readString() throws IOException {
    return keyboard.readLine();
  }
  
}


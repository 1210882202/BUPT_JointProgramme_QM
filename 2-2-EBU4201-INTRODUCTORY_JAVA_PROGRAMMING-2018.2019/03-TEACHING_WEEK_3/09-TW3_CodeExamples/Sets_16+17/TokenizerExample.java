// ========================================================
//   NOTE: The example below can be used as a complement  
//         to slides 21-23 of the slide set "Strings".
// ========================================================

import java.util.*;

public class TokenizerExample {
  public static void main(String[] args) {
    // Trying out the 3 constructors of the StringTokenizer class.	
    // StringTokenizer myS = new StringTokenizer("I like numbers.");
    StringTokenizer myS = new StringTokenizer("I like numbers much.", "nu");
    // StringTokenizer myS = new StringTokenizer("I like numbers.", "nu", true);

    System.out.println("There are " + myS.countTokens() + " tokens; they are:");
    while (myS.hasMoreTokens())
      System.out.println(myS.nextToken());
  }
}
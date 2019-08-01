// ========================================================================================
//   NOTE: The example below should be used as a complement to slide 23 of the slide 
//         set "Garbage Collection". Full explanation of the example was given in class.
// ========================================================================================

public class VarScopeTester {
  
  public static void main(String[] args) {
    for (int x=0; x < 5; x++) {
      System.out.println("inside loop: x = " + x);
    }
    System.out.println("after loop: x = " + x);
  }
  
  /*
  public static void main(String[] args) {
    int x;
    for (x=0; x < 5; x++)
      System.out.println("inside loop: x = " + x);
    System.out.println("after loop: x = " + x);
  }
  */
}
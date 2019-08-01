
// ========================================================================================
//   NOTE: The example below can be used as a complement to slide 15 of the slide 
//         set "Strings". Please also note that:
//         1. Both the "capacity" and "length" of a StringBuffer object are measured in
//            "characters", not "bytes".
//         2. Each "character" (i.e. a char) stored in a string occupies 2 bytes of space.
// ========================================================================================

public class StringBufferChecker {
  public static void main(String[] args) {
    StringBuffer s = new StringBuffer(10);
    System.out.println("\nInitial statement: StringBuffer s = new StringBuffer(10);");
    System.out.println("initial capacity             = " + s.capacity());
    System.out.println("capacity after 'Hello'       = " + s.append("Hello").capacity());
    System.out.println("length when 'Hello'          = " + s.length());
    System.out.println("capacity after 'Hello There' = " + s.append(" There").capacity());
    System.out.println("length when 'Hello There'    = " + s.length());
    // last value is (2*old capacity + 2)

    StringBuffer x = new StringBuffer(5);
    System.out.println("\nInitial statement: StringBuffer x = new StringBuffer(5);");    
    System.out.println("initial capacity                   = " + x.capacity());    
    System.out.println("capacity after 'HelloThere!!!'     = " + x.append("HelloThere!!!").capacity());
    System.out.println("length when 'HelloThere!!!'        = " + x.length());
    System.out.println("capacity after 'HelloThere!!! 123' = " + x.append(" 123").capacity());
    System.out.println("length when 'HelloThere!!! 123'    = " + x.length());

    StringBuffer y = new StringBuffer("HelloThere!!!");
    System.out.println("\nInitial statement: StringBuffer y = new StringBuffer(\"HelloThere!!!\");");       
    System.out.println("capacity                           = " + y.capacity());    
    System.out.println("length when 'HelloThere!!!'        = " + y.length());
    
    StringBuffer z = new StringBuffer();
    System.out.println("\nInitial statement: StringBuffer z = new StringBuffer();");       
    System.out.println("capacity = " + z.capacity());    
    System.out.println("length   = " + z.length());    
  }
}

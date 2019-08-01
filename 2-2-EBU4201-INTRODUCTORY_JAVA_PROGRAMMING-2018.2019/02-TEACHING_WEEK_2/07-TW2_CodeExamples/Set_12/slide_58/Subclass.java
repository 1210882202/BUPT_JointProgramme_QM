public class Subclass extends Superclass { 

  /* public Subclass() {
    super("Invoking Superclass constructor");
  } */
 
  // overrides printMethod in Superclass 
  public void printMethod() { 	
    super.printMethod();
    System.out.println("Printed in Subclass"); 
  } 

  public static void main(String[] args) {
    Subclass s = new Subclass();
    s.printMethod(); 
  } 
}

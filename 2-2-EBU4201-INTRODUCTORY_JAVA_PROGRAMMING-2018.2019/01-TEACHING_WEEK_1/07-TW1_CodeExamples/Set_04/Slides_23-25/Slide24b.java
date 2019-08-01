public class Slide24b {
  public static void main (String args[]) {
    int a = 4;
    int result = ++a + a;
    System.out.println("result = "+ result + ", a = " + a); 

    a = 4;
    result = a + ++a;
    System.out.println("result = "+ result + ", a = " + a); 
  }
}

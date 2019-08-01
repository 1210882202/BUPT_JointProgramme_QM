public class Example3 extends Example implements Countable {
  int sub = 0;
  public void counting() {    
    // implements interface abstract method
    sub = Countable.y - super.x;
    System.out.println("Sub is " + sub);
  }
}

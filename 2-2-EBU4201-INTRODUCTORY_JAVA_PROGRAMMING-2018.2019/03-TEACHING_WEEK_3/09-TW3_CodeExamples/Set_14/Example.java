public class Example implements Countable { 
  int x = 1;
  int y = 2;	  
  int sum = 0;
  public void counting() { // implements interface method
    sum = x + y;
    System.out.println("Sum is " + sum);
  }
}

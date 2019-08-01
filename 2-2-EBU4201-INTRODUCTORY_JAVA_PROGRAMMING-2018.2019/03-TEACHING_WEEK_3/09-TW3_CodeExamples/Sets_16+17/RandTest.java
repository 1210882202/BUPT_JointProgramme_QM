import java.util.Random;

public class RandTest {
  public static void main(String[] args) {
    Random r = new Random();
    float aRandomFloat = r.nextFloat();
    int aRandomInt = r.nextInt();
    System.out.println("A random float is " + aRandomFloat);
    System.out.println("A random int is   " + aRandomInt);
  }
}
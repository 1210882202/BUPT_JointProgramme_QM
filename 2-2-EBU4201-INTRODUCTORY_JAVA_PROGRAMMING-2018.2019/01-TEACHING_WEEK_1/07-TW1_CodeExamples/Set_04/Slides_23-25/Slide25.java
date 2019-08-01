public class Slide25 {
  public static void main (String args[]) {
    // From top example
    int i = 0;
    i = i++;    // i is 0, not 1
    System.out.println("i = " + i);

    // From bottom example
    int a=4, b=5, j=1, k = 0;
    if ((a=5) == b)
      k = j + (a=5);
    System.out.println("a=" + a + ", b=" + b + ", j=" + j + ", k=" + k);
  }
}

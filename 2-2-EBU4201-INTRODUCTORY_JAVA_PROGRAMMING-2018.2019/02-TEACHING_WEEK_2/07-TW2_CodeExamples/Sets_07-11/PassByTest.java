public class PassByTest {
  public void printArray(double[] array) {
    System.out.print("[ ");
    for (int i = 0; i < array.length; i++) {
      System.out.print(array[i] + " ");
    }
    System.out.println("]");
  }
  public void mutate(double array[]) {
    for (int i = 0; i < (array.length/2); i++) 
      array[i] = 0;
  }
  public static void main(String[] args) {
    double[] d = {2,2,2,2,2};
    PassByTest b = new PassByTest();

    System.out.println("d before mutate() is " + d);
    System.out.print("Array is: ");
    b.printArray(d);
    b.mutate(d);

    System.out.println("d after mutate() is " + d);
    System.out.print("After mutate, Array is: ");
    b.printArray(d);		
  }
}

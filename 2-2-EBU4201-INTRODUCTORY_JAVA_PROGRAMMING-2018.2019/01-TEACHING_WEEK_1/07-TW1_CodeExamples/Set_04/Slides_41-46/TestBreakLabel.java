public class TestBreakLabel {
  public static void main(String[] args) {
    outer:
    for (int i=1; i<5; i++) {
      System.out.println("Begin outer for i=" + i); 
      inner:
      for (int j=1; j<5; j++) {
        if (j == i) break outer;
	  System.out.println("   inner: i=" + i + " j=" + j);
      }
      System.out.println("End outer for i=" + i); 
    } 
    System.out.println("Finished.");
  }
}

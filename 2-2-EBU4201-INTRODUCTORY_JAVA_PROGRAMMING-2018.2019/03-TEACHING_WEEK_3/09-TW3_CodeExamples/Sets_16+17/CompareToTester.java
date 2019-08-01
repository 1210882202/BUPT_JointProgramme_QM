public class CompareToTester {
  public static void main(String[] args) {
    // String str1 = "Joanna";
    // String str2 = "James";

    String str1 = args[0];
    String str2 = args[1];

    int result = str1.compareTo(str2);    
    System.out.println("result = " + result);

    if (result < 0) {
      System.out.println("str1 comes before str2");
    }
    else if (result > 0) {
      System.out.println("str1 comes after str2");
    }
    else {
      System.out.println("str1 and str2 are equal");
    }
  }
}
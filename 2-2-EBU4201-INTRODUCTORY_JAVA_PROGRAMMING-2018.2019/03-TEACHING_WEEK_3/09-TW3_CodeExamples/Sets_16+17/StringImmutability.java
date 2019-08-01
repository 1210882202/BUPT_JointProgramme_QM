public class StringImmutability {
  public static void main(String[] args) {
    String c = "Sherlock";
    String d = c;
    d = "Holmes";
    System.out.println(c);
    System.out.println(d);
  }
}
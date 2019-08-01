public class Foo {
   public void m1(int value) {
      assert 0 <= value;
      System.out.println("OK");
   }
   public static void main(String[] args) {
      Foo foo = new Foo();
      System.out.print("foo.m1(1): ");
      foo.m1(1);
      System.out.print("foo.m1(-1): ");
      foo.m1(-1);
   }
}

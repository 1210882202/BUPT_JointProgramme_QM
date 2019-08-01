public class ExampleGoneWrong {
  public void method1() {
	int x = 10;
	System.out.println(x);
	method2();
  }
  public void method2() {
	x = 20;
  }
}
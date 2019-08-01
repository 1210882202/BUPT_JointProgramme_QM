public class Slide32 {

  /* Test what happens when:
     -- the return statement is missing;
     -- the method's return type is missing;
     -- when using the void return method type.
  */
  public void doSomeMaths(int x, int y) {
    int temp;
    if (x > y)     temp = x * y;
    else if (x < y) temp = x + y;
    else            temp = x;
    return temp;
  }
}

public class Rectangle extends Object {
  private static int count = 0;
  private int width;
  private int height;
  public Rectangle(int width,int height) {
    this.width = width;
    this.height = height;
    count++;
  }
  public static int getCount() {
    return count;
  } // end getCount() method

  /* we don't actually want to provide setCount() */
  public int getWidth() { return this.width; }
  public int getHeight() { return this.height; }
  public void setWidth(int width) { this.width = width; }
  public void setHeight(int height) { this.height = height; }
  public void draw() {
    // ...
  }
  public int area() { return (this.width*this.height); }
} // end class Rectangle

public class RectangleTest {
   public static void main(String[] args) {
     System.out.println("There are " + Rectangle.getCount() + " rectangles.");

      Rectangle r1;
      r1 = new Rectangle(10,20);
      System.out.println("There are " + Rectangle.getCount() + " rectangles.");
   }
}

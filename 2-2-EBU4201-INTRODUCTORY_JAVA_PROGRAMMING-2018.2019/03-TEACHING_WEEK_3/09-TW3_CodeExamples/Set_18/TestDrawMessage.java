import javax.swing.JFrame;

 public class TestDrawMessage extends JFrame {
   public TestDrawMessage() {
     getContentPane().add(new DrawMessage());
   }
   public static void main(String[] args) {
     JFrame frame = new TestDrawMessage();
     frame.setSize(100,200);
     frame.setVisible(true);
   }
 }
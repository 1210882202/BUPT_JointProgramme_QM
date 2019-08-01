import javax.swing.*;

public class AddGraphics {
  public static void main(String[] args) {
    JFrame myFrame = new JFrame();
    MyDrawingPanel myDrawingPanel = new MyDrawingPanel();
    myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    myFrame.getContentPane().add(myDrawingPanel);
    myFrame.setSize(220, 190);
    myFrame.setVisible(true);
  }
}
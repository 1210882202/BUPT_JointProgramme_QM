import javax.swing.*;

public class SimpleGui {
  public static void main(String[] args) {
    JFrame myFrame = new JFrame();
    JButton myButton = new JButton("Click me");
    myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    myFrame.getContentPane().add(myButton);
    myFrame.setSize(200, 200);
    myFrame.setVisible(true);
  }
}
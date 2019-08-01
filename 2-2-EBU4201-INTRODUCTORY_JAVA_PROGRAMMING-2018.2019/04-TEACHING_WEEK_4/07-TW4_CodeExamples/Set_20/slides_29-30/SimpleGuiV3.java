import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SimpleGuiV3 implements ActionListener {
  JFrame myFrame;
  public static void main(String[] args) {
    SimpleGuiV3 myGui = new SimpleGuiV3();
    myGui.go();
  }
  public void go() {
    myFrame = new JFrame();
    myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    JButton myButton = new JButton("Change colours");
    myButton.addActionListener(this);
    MyDrawingPanel2 myDrawingPanel = new MyDrawingPanel2();
    myFrame.getContentPane().add(BorderLayout.SOUTH, myButton);
    myFrame.getContentPane().add(BorderLayout.CENTER, myDrawingPanel);
    myFrame.setSize(200, 200);
    myFrame.setVisible(true);
  }
  public void actionPerformed(ActionEvent event) {
    myFrame.repaint();
  }
}

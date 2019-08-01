
// ========================================================================================
//   NOTE: The code below is the full solution for Exercise 2 (slide 29) of the slide 
//         set "Basic GUI". Full explanation of the example was given in class.
//         Please also note the following:
//         1. java.awt.* and java.awt.event.* are different packages and in this
//            case, package java.awt.* is not required.
//         2. The statement used inside of the main() method could be equally replaced
//            with "JFrame myGUI = TestFixed();" because of polymorphism.
// ========================================================================================

import java.awt.event.*;
import javax.swing.*;

public class TestFixed extends JFrame implements ActionListener {
  JButton jbtOK;
  public TestFixed() {
    jbtOK = new JButton("OK");
    jbtOK.addActionListener(this);
    getContentPane().add(jbtOK);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(100, 100);
    setVisible(true);
  }
  public void actionPerformed(ActionEvent e) {
    if (e.getSource() == jbtOK)
      System.out.println("OK button is clicked");
  }
  public static void main(String[] args) {
    TestFixed myGUI = new TestFixed();
  }
}
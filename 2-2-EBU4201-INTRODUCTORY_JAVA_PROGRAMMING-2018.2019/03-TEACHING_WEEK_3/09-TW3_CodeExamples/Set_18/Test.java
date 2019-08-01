import javax.swing.*;
import java.awt.event.*;

public class Test extends JFrame implements ActionListener {
  JButton jbtOK;
  public Test() {
    jbtOK = new JButton("OK");
    jbtOK.addActionListener(this);
    getContentPane().add(jbtOK);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(100,100);
    setVisible(true);
  }
  public void actionPerformed(ActionEvent e) {
    if (e.getSource() == jbtOK)
      System.out.println("OK button is clicked");
  }
  public static void main(String[] args) {
    JFrame myFrame = new Test();
  }
}
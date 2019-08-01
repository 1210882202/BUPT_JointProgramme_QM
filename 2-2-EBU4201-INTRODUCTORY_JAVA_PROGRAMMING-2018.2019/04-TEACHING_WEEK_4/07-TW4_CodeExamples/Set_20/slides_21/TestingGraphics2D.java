// This example complements slide 21 of the topic "GUI in
// Java (Advanced)"; the example was demonstrated and explained in class.

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class TestingGraphics2D extends JPanel {

  public void paintComponent(Graphics g) {
    g.setColor(Color.red);
    g.draw3DRect(25, 10, 70, 80, true);
    g.draw3DRect(25, 110, 70, 80, false);
    g.fill3DRect(100, 10, 70, 80, true);
    g.fill3DRect(100, 110, 70, 80, false);
  }

  public static void main(String[] args) {
    JFrame frame = new JFrame();
    frame.getContentPane().add(new TestingGraphics2D());

    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(400, 400);
    frame.setVisible(true);
  }
}
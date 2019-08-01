// This example complements slide 28 of the topic "GUI in
// Java (Advanced)"; the example was demonstrated and explained in class.

import java.awt.*;           
import javax.swing.*;

public class TestingFontClasses extends JPanel {
  public void paintComponent(Graphics g) {
    int fontSize = 20;
    String s = "Good Morning";
    Font f = new Font(s, Font.BOLD, fontSize);
    g.setFont(f);
    FontMetrics fm = g.getFontMetrics();
    g.setColor(Color.red);
    int panelWidth = this.getWidth();
    int panelHeight = this.getHeight();
    int stringWidth = fm.stringWidth(s);
    int stringHeight = fm.getHeight();

    int topHeightMostCharsInFont = fm.getAscent();

    int x = panelWidth/2 - stringWidth/2;
    
    int y = panelHeight/2 - stringHeight/2 + topHeightMostCharsInFont;

    // int y = panelHeight/2 - stringHeight/2;

    g.drawString(s, x, y);

    System.out.println("\npanelWidth          = " + panelWidth);
    System.out.println("panelHeight           = " + panelHeight);
    System.out.println("stringWidth           = " + stringWidth);
    System.out.println("stringHeight          = " + stringHeight);
    System.out.println("topHeightMostCharsInFont   = " + topHeightMostCharsInFont);
    System.out.println("string's coordinates (x,y) = (" + x + "," + y + ")");
  }
  public static void main(String[] args) {
    JFrame frame = new JFrame();
    frame.getContentPane().add(new TestingFontClasses());
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(160,200);
    frame.setVisible(true);
  }
}

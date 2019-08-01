import java.awt.*;
import javax.swing.*;

public class MyDrawingPanel extends JPanel {
  public void paintComponent(Graphics g) {
    g.setColor(Color.red);
    g.fillRect(50,50,80,50);
  }
}
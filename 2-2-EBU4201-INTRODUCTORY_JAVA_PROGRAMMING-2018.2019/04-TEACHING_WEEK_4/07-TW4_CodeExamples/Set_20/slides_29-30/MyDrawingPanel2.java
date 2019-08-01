import java.awt.*;
import javax.swing.*;

public class MyDrawingPanel2 extends JPanel {
  public void paintComponent(Graphics g) {
    g.setColor(Color.white);
    g.fillRect(0,0,this.getWidth(),this.getHeight());
    int red = (int) (Math.random()*255);
    int green = (int) (Math.random()*255);
    int blue = (int) (Math.random()*255);
    Color randomColor = new Color(red,green,blue);
    g.setColor(randomColor);
    g.fillRect(20,20,80,50);
  }
}

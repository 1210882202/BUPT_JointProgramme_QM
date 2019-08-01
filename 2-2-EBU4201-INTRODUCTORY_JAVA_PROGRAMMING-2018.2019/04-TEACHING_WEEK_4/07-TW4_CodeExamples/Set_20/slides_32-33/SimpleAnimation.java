import javax.swing.*;
import java.awt.*;

public class SimpleAnimation {
  int x = 50;
  int y = 50;
  public static void main(String[] args) {
    SimpleAnimation myGui = new SimpleAnimation();
    myGui.go();
  }
  public void go() {
    JFrame myFrame = new JFrame();
    myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    MyDrawingPanel myDrawingPanel = new MyDrawingPanel();
    myFrame.getContentPane().add(myDrawingPanel);
    myFrame.setSize(300,300);
    myFrame.setVisible(true);
    for (int i=0; i<130; i++) {
      x++;
      y++;
      myDrawingPanel.repaint();
      try { Thread.sleep(100); }
      catch (Exception ex) { }
    }
  }
  public class MyDrawingPanel extends JPanel {
    public void paintComponent(Graphics g) {
      g.setColor(Color.white);
      g.fillRect(0,0,this.getWidth(),this.getHeight());
      g.setColor(Color.red);
      g.fillRect(x,y,50,50);
    }
  }
}
import javax.swing.JPanel;
import java.awt.Graphics;

 class DrawMessage extends JPanel {
   protected void paintComponent(Graphics g) {
     super.paintComponent(g);
     g.drawString("Welcome to Java",20,20);
   }
 }

import javax.swing.*;
import java.awt.*;

public class HousePanel extends JPanel {
  public void paintComponent(Graphics g) {
    int houseX = 10;
    int houseY = getHeight()/3;
    int door = 50, window = 55, windowInset = 20;
    int houseWidth = getWidth() - (houseX*2);
    int houseHeight = getHeight() - 50;
    int[] x = {0, getWidth()/2, getWidth()};
    int[] y = {getHeight()/3, 5, getHeight()/3};
    g.setColor(Color.darkGray);
    g.fillPolygon(x, y, 3);
    g.setColor(Color.yellow);
    g.fillRect(houseX, houseY, houseWidth, houseHeight);
    g.setColor(Color.darkGray);
    g.fillRect(houseX+windowInset, houseY+windowInset, window, window);
    g.fillRect(houseX+houseWidth-windowInset-window,
               houseY+windowInset, window, window);
    g.fillRect(houseX+(houseWidth/2)-door/2, (houseHeight/2)+houseY+windowInset/2,
               door, houseHeight/2-windowInset/2);
  }
  public static void main(String args[]){
	JFrame frame = new JFrame("House Example");
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.getContentPane().add(new HousePanel());
	frame.setSize(300,300);
	frame.setVisible(true);
  }
}
// This example complements slides 14 and 18 of the topic "GUI in
// Java (Advanced)"; the example was demonstrated and explained in class.
// It should be used with the file TestingGraphics.java.

import java.awt.*;
import javax.swing.*;

public class MyGraphics extends JPanel {
  public void paintComponent(Graphics g) {
    // Slide 17: Showing that the result of drawing an "oval" shape
    // is 'a circle or ellipse that fits within the rectangle 
    // specified by the "x", "y", "width", and "height" arguments'.
    g.setColor(Color.RED);
    g.drawRect(50,50,100,50);
    g.setColor(Color.BLUE);
    g.drawOval(50,50,100,50);
	
    // Slide 17: Showing (with 3 examples) that,
    // 1. the center of an "arc" shape is the 'center
    //    of the rectangle whose origin is "(x,y)" and whose size
    //    is specified by the "width" and "height" arguments';
    // 2. the "sweepAngle" parameter of the "arc" shape is the
    //    'angular extent of the "arc" shape, relative to the
    //    "startAngle" parameter'.
    g.setColor(Color.PINK);
    g.drawArc(170, 50, 50, 50, 0, 90);
    g.setColor(Color.BLACK);
    g.drawRect(170, 50, 50, 50);
	
    g.setColor(Color.GREEN);
    g.drawArc(250, 50, 50, 50, 0, 180);
    g.setColor(Color.BLACK);
    g.drawRect(250, 50, 50, 50);
	
    g.setColor(Color.CYAN);
    g.drawArc(400, 50, 50, 50, 45, 180);
    g.setColor(Color.BLACK);
    g.drawRect(400, 50, 50, 50);

    // Slide 13: Showing how to add an image to a
    // paintable widget in a GUI.
    Image myImage = new ImageIcon("compressed.jpg").getImage();
    g.drawImage(myImage, 150, 150, this);
  }
}
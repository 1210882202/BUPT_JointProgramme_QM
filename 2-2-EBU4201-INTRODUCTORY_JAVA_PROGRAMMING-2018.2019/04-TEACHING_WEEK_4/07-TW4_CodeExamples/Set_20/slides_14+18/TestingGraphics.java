// This example complements slides 14 and 18 of the topic "GUI in
// Java (Advanced)"; the example was demonstrated and explained in class.
// It should be used with the file MyGraphics.java.

import javax.swing.*;

public class TestingGraphics {
  public static void main(String[] args) {
    JFrame myFrame = new JFrame();
    myFrame.setTitle("Testing Graphics");
    MyGraphics myGraphs = new MyGraphics();
    myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    // Statement below is the "old" Java way in which graphics
    // and components were added to a frame:
    // myFrame.getContentPane().add(myGraphs);
    
    // Statement below is the "new" Java way of doing the
    // same thing; both the statement below and the statement 
    // above will work.
    myFrame.add(myGraphs);
    myFrame.setSize(600, 400);
    myFrame.setVisible(true);
  }
}
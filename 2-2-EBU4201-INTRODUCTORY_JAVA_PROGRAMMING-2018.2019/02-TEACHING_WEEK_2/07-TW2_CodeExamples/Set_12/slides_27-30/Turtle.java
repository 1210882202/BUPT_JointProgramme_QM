import java.awt.*;

public class Turtle extends Creature {  
  
  public int run(int duration,  boolean  zigzag) {
    System.out.println("I run like a Turtle!");
    if (zigzag) return (int)(speed*duration*0.25);
    return speed*duration; 
  }
}             

import java.awt.*;

public abstract class Creature {  
  protected String name, tailType; 
  protected Color color; 
  protected int speed; 

  // method declaration only; no implementation
  public abstract int run(int duration, boolean zigzag);

  public void swim(int duration) {
    // stuff
  } 
}            

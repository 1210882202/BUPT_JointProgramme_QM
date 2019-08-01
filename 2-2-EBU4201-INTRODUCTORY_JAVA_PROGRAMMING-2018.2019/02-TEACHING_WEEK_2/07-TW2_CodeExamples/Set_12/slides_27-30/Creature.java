import java.awt.*;

public class Creature {  
  protected String name, tailType;  
  protected Color color; 
  protected int speed; 

  public int run(int duration, boolean  zigzag) {
    System.out.println("I run like a generic creature!");
    if (zigzag) return (int)(speed*duration/2);
    return speed*duration; 
  }

  public void swim(int duration) {
    System.out.println("I swim for " + duration + " minutes like a generic creature");
  }

  // accessor/mutator methods
  public void setName(String n) { this.name = n; }
  public String getName() { return this.name;}

  public void setSpeed(int n) { this.speed = n; }
  public int getSpeed() { return this.speed;}
}            

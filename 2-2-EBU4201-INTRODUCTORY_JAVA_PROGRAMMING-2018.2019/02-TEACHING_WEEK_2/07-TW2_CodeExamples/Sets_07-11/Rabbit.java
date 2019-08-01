import java.awt.*;

public class Rabbit {  
  private String name, tailType, furType;
  private Color color;
  private int   speed;

  public String getName() { return name; }
  public void setName(String name) { this.name = name; }

  public int getSpeed() { return speed; }
  public void setSpeed(int speed) { this.speed = speed; }

  public String getFurType() { return furType; } 

  public void setFurType(String furType) { 
    // check to see that the furType is valid for rabbits
    if (furType.equals("scaley") || furType.equals("bald")) {
      System.out.println("ERROR: Illegal fur type.");
    }
    else this.furType = furType;
  }

  public void sleep(int duration) {
    // Code of sleep
  }
   
  public int run(int duration, boolean zigzag) {
    // code of run
    return 0;
  }
}
import java.awt.*;

public class Rabbit extends Creature {  
  protected String furType;  

  public void sleep(int duration) {
    System.out.println("I sleep for " + duration + " minutes like a Rabbit!");
  }
 
  public int run(int duration, boolean  zigzag) {
    System.out.println("I run like a Rabbit!");
    if (zigzag) return (int)(speed*duration*0.75);
      return speed*duration; 
  }

  // specific Rabbit accessor/mutator methods 
  // Can override Creature's methods if necessary

   public void setFurType(String n) {
     // insert code do some checking on furtype!
     this.furType =  n; 
   }
   public String getFurType() { return this.furType; }  
}             

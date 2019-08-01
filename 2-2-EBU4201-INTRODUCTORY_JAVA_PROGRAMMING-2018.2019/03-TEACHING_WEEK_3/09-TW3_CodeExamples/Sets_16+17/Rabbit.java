public class Rabbit {  
  private String furType;
  private String name;
  private int speed;

  public void sleep(int duration) {
    System.out.println("I sleep for " + duration + " minutes like a Rabbit!");
  }
 
  public int run(int duration,  boolean  zigzag) {
    System.out.println("I run like a Rabbit!");
    if (zigzag)
      return (int)(speed*duration*0.75);
    return speed*duration; 
  }

  public void setName(String name) { this.name = name; }

  public String getName() { return this.name; }

  public void setFurType(String n) { this.furType =  n; }

  public String getFurType() { return this.furType; }

  public void setSpeed(int speed) { this.speed = speed; }

  public int getSpeed() { return this.speed; }
}             
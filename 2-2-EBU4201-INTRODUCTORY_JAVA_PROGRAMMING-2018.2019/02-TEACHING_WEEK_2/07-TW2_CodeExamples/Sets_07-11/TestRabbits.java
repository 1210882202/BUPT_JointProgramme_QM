public class TestRabbits {
  public static void main(String[] args) {
    Rabbit r = new Rabbit();
    r.setName("Bugs");
    r.setFurType("Fluffy");
    r.sleep(5);

    // accessing Rabbit objects in an array
    Rabbit[] racers = new Rabbit[2];
    racers[0] = new Rabbit();
    racers[0].setName("Bugs");
    racers[0].setFurType("Fluffy");
    racers[0].sleep(5);

    racers[1] = new Rabbit();
    racers[1].setName("Bunny");    
  }
}
public class AnotherTestRabbits_2 {
  public static void main(String[] args) {
    Rabbit[] racers = new Rabbit[3];
    racers[0] = new Rabbit();
    racers[0].setName("Bugs");
    racers[0].setFurType("Fluffy");
    racers[0].setSpeed(150);

    racers[1] = new Rabbit();
    racers[1].setName("Bunny");
    racers[1].setFurType("Long-haired");
    racers[1].setSpeed(145);

    racers[2] = new Rabbit();
    racers[2].setName("Bob");
    racers[2].setFurType("Shaggy");
    racers[2].setSpeed(120);

    for (int i = 0; i<racers.length; i++) {
      System.out.println(racers[i]);
    }
  }
}
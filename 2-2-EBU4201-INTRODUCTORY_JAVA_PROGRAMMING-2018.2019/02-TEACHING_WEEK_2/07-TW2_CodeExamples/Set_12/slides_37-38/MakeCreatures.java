public class MakeCreatures {
  public static void main(String[] args) {
    MakeCreatures mCreat = new MakeCreatures();
    mCreat.go();
  }

  public void go() {
    // Creature aCreature = new Creature();

    Creature bCreature = new Rabbit();
    bCreature.run(5, true);
  }
}
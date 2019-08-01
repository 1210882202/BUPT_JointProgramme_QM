public class CreatureList {

  private Creature[] creatures = new Creature[5];
  private int nextIndex = 0;

  public void addToList(Creature r) {
    if (nextIndex < creatures.length) {
      creatures[nextIndex] = r;
      System.out.println("Creature added at " + nextIndex + "; " + r);
      nextIndex++;
    }
  }
}
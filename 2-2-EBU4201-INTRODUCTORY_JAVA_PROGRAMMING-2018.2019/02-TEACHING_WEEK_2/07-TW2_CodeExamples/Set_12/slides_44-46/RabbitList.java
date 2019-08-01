public class RabbitList {
  private Rabbit[] rabbits = new Rabbit[5];
  private int nextIndex = 0;

  public void addToList(Rabbit r) {
    if (nextIndex < rabbits.length) {
      rabbits[nextIndex] = r;
      System.out.println("Rabbit added at " + nextIndex);
      nextIndex++;
    }
  }
}

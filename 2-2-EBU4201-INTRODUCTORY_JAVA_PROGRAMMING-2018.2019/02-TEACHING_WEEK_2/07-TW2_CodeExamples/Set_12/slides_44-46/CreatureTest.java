public class CreatureTest {

  public static void main(String[] args) {
    CreatureList list = new CreatureList();
    Rabbit r = new Rabbit();
    Turtle t = new Turtle();
    list.addToList(r);
    list.addToList(t);

    list.addToList(new Rabbit());
  }
}

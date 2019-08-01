import java.util.*;

public class CreatureTest_new {

  public static void main(String[] args) {
    ArrayList<Creature> clist = new ArrayList<Creature>();
    Rabbit r = new Rabbit();
    Turtle t = new Turtle();
    clist.add(r);
    clist.add(t);

    clist.add(new Rabbit());

    for (Creature c : clist)
      c.run(5, true);

    for (Creature c : clist)
      System.out.println(c);
  }
}
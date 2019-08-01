public class CreatureTest { 
 
  public static void main(String[] args) {
    System.out.println("Rabbit test: ");
    Rabbit r = new Rabbit();
    r.setSpeed(10);
    System.out.println( r.run(5, true));
    r.sleep(8);
    r.swim(2);

    System.out.println("\nTurtle test: ");
    Turtle t = new Turtle();
    t.setSpeed(5);
    System.out.println( t.run(4, true));
    t.swim(6);

    // remember Turtles can't sleep (and do not have a sleep method)
    // so you cannot call t.sleep(5); !
    t.sleep(5);
  }             
}

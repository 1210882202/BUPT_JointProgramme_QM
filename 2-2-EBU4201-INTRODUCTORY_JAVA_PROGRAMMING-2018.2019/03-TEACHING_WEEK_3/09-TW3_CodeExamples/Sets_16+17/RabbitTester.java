public class RabbitTester {
  public static void main(String[] args) {
    Rabbit c = new Rabbit();
    c.setName("Joe");

    Rabbit d = c;
    d.setName("Bugs");

    System.out.println(c.getName());
    System.out.println(d.getName());
  }
}
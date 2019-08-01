public class Tiger extends Marsupial {
  private int speed;

  public Tiger() {
    // because of this call, we don't go up to the superclass constructor here
    this(5);
    System.out.println("Making a Tiger without args");
  }
  public Tiger(int newSpeed) {
    super();
    System.out.println("Making a Tiger with int arg");
    this.speed = newSpeed;
    // maybe more initialisation
  }
}

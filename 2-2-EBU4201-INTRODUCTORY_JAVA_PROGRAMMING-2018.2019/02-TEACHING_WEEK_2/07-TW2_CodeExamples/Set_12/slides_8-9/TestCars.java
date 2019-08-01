public class TestCars {

  public static void main(String[] args) {
     Car c = new Car();
     c.bodyColour = "Red";
     c.drive();

     System.out.println("Colour of c object: " + c.bodyColour);

     SmartCar d = new SmartCar();
     d.bodyColour = "Blue";
     d.drive();

     System.out.println("Colour of d object: " + d.bodyColour);
  }
}

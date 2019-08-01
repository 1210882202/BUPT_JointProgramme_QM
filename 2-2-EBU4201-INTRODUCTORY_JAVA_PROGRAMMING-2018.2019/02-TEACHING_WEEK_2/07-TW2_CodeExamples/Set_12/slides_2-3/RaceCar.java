public class RaceCar {
   private String bodyColour;

   public RaceCar(String bodyColour) {
      this.bodyColour = bodyColour;
   }

  public static void main(String[] args) {
     RaceCar carOne = new RaceCar("Yellow");
     RaceCar carTwo = new RaceCar("Red");

     System.out.println("After creating 2 objects of type RaceCar:\n");
     System.out.println(carOne + "; " + carTwo);
  }
}

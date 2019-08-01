public class RaceCar_again {
   private String bodyColour;

   public RaceCar_again(String bodyColour) {
      this.bodyColour = bodyColour;
   }

  public static void main(String[] args) {
     RaceCar_again myCar = new RaceCar_again("Yellow");
     RaceCar_again yourCar = new RaceCar_again("Yellow");

     System.out.println("After creating 2 yellow objects of type RaceCar:\n");
     System.out.println(myCar + "; " + yourCar);
  }
}
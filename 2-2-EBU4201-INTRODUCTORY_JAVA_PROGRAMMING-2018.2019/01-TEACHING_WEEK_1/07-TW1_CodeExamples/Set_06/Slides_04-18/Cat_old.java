public class Cat {
  private String name;
  private String colour;
  private int age;

  public Cat() {  }
  
  public Cat(String name) {
   this.name = name;
  }

  public String getName() { 
    return name;
  }

  public String getColour() {
    return colour;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void meow() {
    System.out.println("Meow! Meow");
  }

  public void eat() {
    System.out.println("Yummy! Yummy");
  }
} // end class cat
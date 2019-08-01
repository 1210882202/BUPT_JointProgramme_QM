import java.util.*;

public class HashMapTester {
   public static void main( String[] args ) {
      Map<String, String> petSounds = new HashMap<String, String>();
      petSounds.put("cat", "Meow");  petSounds.put("mouse", "Squeak");
      petSounds.put("dog", "Woof");  petSounds.put("guineaPig", "Squeak");
      System.out.println("map = " + petSounds);
      String val = petSounds.get("dog");
      System.out.println("Value for key 'dog' is: " + val);
   }
}
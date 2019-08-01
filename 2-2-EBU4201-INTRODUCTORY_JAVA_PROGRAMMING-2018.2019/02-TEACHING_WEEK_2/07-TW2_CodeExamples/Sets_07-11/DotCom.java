import java.util.ArrayList;

public class DotCom {
  private ArrayList<String> locationCells;
  // private int numberOfHits = 0; --> Don't need this.
  private String name;
    
  public void setLocationCells(ArrayList<String> loc) {
    locationCells = loc;
  }

  public void setName(String name) { this.name = name; }
  public String getName() { return this.name; }

  public String checkYourself(String stringGuess) {
    String result = "miss";
    int index = locationCells.indexOf(stringGuess);

    if (index >= 0) {
      this.locationCells.remove(stringGuess);
      // OR this.locationCells.remove(index);
      if (locationCells.isEmpty()) { result = "kill"; }
      else result = "hit";
    }
    System.out.println(result);
    return result;
  }
} // end of DotCom
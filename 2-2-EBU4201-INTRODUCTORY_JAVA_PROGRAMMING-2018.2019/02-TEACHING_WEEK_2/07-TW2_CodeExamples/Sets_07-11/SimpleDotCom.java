public class SimpleDotCom {
  private int[] locationCells;
  private int numberOfHits = 0;
  
  public void setLocationCells(int[] loc) { locationCells = loc; }

  public String checkYourself(String stringGuess) {
    int guess = Integer.parseInt(stringGuess);
    String result = "miss";
    for (int i : this.locationCells) {
      if (guess == i) {
        result = "hit";
        this.numberOfHits++;
        break;
      }
    }
    if (this.numberOfHits == this.locationCells.length) { result = "kill"; }
    System.out.println(result);
    return result;
  }
} // end of SimpleDotCom
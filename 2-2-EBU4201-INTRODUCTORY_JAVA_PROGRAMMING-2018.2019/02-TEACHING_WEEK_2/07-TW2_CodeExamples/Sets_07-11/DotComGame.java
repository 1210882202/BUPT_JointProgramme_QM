import java.util.ArrayList; // must have this line

public class DotComGame {
  public static void main(String[] args){
    int numOfGuesses = 0;
    GameHelper helper = new GameHelper();
    DotCom dot = new DotCom();
    int randomNum = (int) (Math.random() * 5);
    ArrayList<String> locations = new ArrayList<String>();
    locations.add("" + randomNum);
    locations.add("" + (randomNum + 1));
    locations.add("" + (randomNum + 2));

    // This code as before ...
    dot.setLocationCells(locations);
    boolean isAlive = true;
    while (isAlive == true) {
      String guess = helper.getUserInput("Enter a number ");
      String result = dot.checkYourself(guess);
      numOfGuesses++;
      if (result.equals("kill")) {
        isAlive = false;
        System.out.println("You took " + numOfGuesses + " guesses");
      }
    }
  }
}
import java.util.*;

public class DotComBust {
  private GameHelper helper = new GameHelper();
  private ArrayList<DotCom> dotComList = new ArrayList<DotCom>();
  private int numOfGuesses = 0;
	
  private void setUpGame() {
    // first make some dot coms and give them locations
    DotCom one = new DotCom();
    one.setName("Pets.com");
    DotCom two = new DotCom();
    two.setName("eToys.com");
    DotCom three = new DotCom();
    three.setName("Go2.com");
    dotComList.add(one); 
    dotComList.add(two);
    dotComList.add(three);
		
    System.out.println("Your goal is to sink three dot coms.");
    System.out.println("Pets.com, eToys.com, Go2.com");
    System.out.println("Try to sink them all in the fewest number of guesses");
		
    for (DotCom dc : dotComList) {
      ArrayList<String> newLocation = helper.placeDotCom(3);
      dc.setLocationCells(newLocation);
    }
  }

  private void startPlaying() {
    while (!dotComList.isEmpty()) {
      String userGuess = helper.getUserInput("Enter a guess");
      checkUserGuess(userGuess);
    }
    finishGame();
  }
	
  private void checkUserGuess(String userGuess) {
    numOfGuesses++;
    String result = "miss";
    String name = ""; 
    for (DotCom dc : dotComList) {
      result = dc.checkYourself(userGuess);
      if (result.equals("hit")) { break; }
      if (result.equals("kill")) {
        name = dc.getName();
        dotComList.remove(dc);
        break;
      }
    }
    System.out.println(result);
    System.out.println("You sunk the company " + name);
  }

  private void finishGame() {
    System.out.println("All Dot Coms are dead! Your stock is now worthless.");
    if (numOfGuesses <= 18) {
      System.out.println("It only took you " + numOfGuesses + " guesses.");
      System.out.println("You got out before your options sank.");
    } 
    else {
      System.out.println("Took you long enough. " + numOfGuesses + " guesses");
      System.out.println("Fish are dancing with your options.");
    }
  }

  public static void main(String[] args) {
    DotComBust game = new DotComBust();
    game.setUpGame();
    game.startPlaying();
  }
}

	

public class SimpleDotComTest {
  public static void main(String[] args) {
    SimpleDotCom dot = new SimpleDotCom();
    int[] locations = {2, 3, 4};
    dot.setLocationCells(locations);

    String userGuess = "2"; // result should be "hit" or "kill"
    String result = dot.checkYourself(userGuess);
    String testResult = "failed";
    if (result.equals("hit") || result.equals("kill")) {
       testResult = "passed";
    }
    System.out.println(testResult);
  }
}
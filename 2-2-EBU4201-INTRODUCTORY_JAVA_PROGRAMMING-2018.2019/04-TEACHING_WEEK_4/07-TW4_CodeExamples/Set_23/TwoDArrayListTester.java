import java.util.ArrayList;

public class TwoDArrayListTester {

  public static void main(String[] args) {
    ArrayList<ArrayList<Integer>> topList = new ArrayList<ArrayList<Integer>>();
    for (int i = 0; i < 3; i++)
      topList.add(new ArrayList<Integer>());
    
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++)
        topList.get(i).add(new Integer(i+j));
    }
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++)
        System.out.print(topList.get(i).get(j) + " ");
      System.out.println();
    }
  }
}
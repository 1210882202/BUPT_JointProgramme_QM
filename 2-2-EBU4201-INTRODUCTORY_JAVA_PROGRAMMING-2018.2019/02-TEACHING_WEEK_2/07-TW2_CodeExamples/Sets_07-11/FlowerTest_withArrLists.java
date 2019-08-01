import java.util.ArrayList;
// import java.util.*;

public class FlowerTest_withArrLists {
  public static void main(String[] args) {
    ArrayList<Flower> myList = new ArrayList<Flower>();

    Flower f = new Flower(); 
    myList.add(f);

    Flower m = new Flower(); 
    myList.add(m);

    int size = myList.size();
    System.out.println("Size of myList = " + size);

    boolean inIt = myList.contains(f);
    int index = myList.indexOf(f); 
    System.out.println("inIt = " + inIt + "; index = " + index);

    for (int i=0; i < size; i++)
      System.out.println(myList.get(i));   
  }
}
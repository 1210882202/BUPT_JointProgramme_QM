/**
 * This class counts to a number dictated by 
 * the input to the program. 
 * Copyright: Copyright (c) 2001
 * @author Laurissa Tokarchuk
 * @version 1.0
 */
public class CountTo {
  /** 
   * This method counts from zero to X, printing 
   * the "count" to the screen. 
   * @param countTo The int number to count to.
   */
  public void count(int countTo) {
    for (int i = 0; i < countTo; i++)
      System.out.println("Count = " + (i+1));
  }  
  public static void main(String[] args) {
    new CountTo().count(5);		
  }
}

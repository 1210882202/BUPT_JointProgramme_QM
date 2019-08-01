// ===================================================================
// Example illustrating the use of the FileReader class methods, as 
// a complement to slide 22 of topic "File I/O".
// It assumes that inputFile.txt is in the same folder as the program.
// The example was explained and run in class.
// ===================================================================

import java.io.*;

//Example illustrating the use of some FileReader methods.
public class FileReaderMethods {
  public static void main(String[] args) {
    try {
      // FileReader fr = new FileReader("inputFile.txt");
      FileReader fr = new FileReader("inputFile_2.txt");

      // Read a single character from the file; returns an int. 
      int character = fr.read();
      System.out.println(character);
      System.out.println("result of using read() method is: " + (char) character);
	  
      // Reads characters into an array;
      // returns number of characters read.
      char[] myStoredArray = new char[8];
      int numCharsRead = fr.read(myStoredArray);
      System.out.println("\nResult of using overloaded read() method is:");
      System.out.println("numCharsRead = " + numCharsRead);
      for (int i=0; i < myStoredArray.length; i++)
	    System.out.println("myStoredArray[" + i + "] = " + myStoredArray[i]);	  
      fr.close();
    }
    catch (FileNotFoundException ex1) {
      System.err.println("Problem: non-existing file.");
    }
    catch (IOException ex2) {
      System.err.println("Problem: could not read character or can't close file.");
    }
  }
}
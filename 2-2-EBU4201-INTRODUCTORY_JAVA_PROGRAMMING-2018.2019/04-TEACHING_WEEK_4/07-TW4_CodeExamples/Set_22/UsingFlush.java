// ===========================================================
// Example illustrating the use of the BufferedWriter flush()
// method, as a complement to slide 23 of topic "File I/O".
// The example was explained and run in class.
// ===========================================================

import java.io.*;

public class UsingFlush {
  // Prints some data to a file using a BufferedWriter
  public void writeToFile(String filename) {
    BufferedWriter bufferedWriter = null;
    try {
      bufferedWriter = new BufferedWriter(new FileWriter(filename));
      // Start writing to the output stream
      bufferedWriter.write("Writing line 1 to file");
      bufferedWriter.newLine();
      bufferedWriter.write("Writing line 2 to file");        
    }
    catch (FileNotFoundException ex) { ex.printStackTrace(); }
    catch (IOException ex) { ex.printStackTrace(); }
    finally { // Close the BufferedWriter
      try {
        if (bufferedWriter != null) {
          bufferedWriter.flush();

          // Write more text to the output stream.
          bufferedWriter.newLine();
          bufferedWriter.write("Writing line 3 to file");

          // This method also includes flushing the stream.
          bufferedWriter.close();
        }
      } 
      catch (IOException ex) { ex.printStackTrace(); }
    }
  }
  public static void main(String[] args) {
    new UsingFlush().writeToFile("myFile.txt");
  }
}
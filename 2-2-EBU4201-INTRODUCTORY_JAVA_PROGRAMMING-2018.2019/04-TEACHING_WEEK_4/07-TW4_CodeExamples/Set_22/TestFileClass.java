// =================================================================
// Example illustrating the use of the File class methods, as a
// complement to slide 13 of topic "File I/O".
// It assumes that:
// ** input_diffFolder.txt is not in the same folder as the program;
// ** input_sameFolder.txt is in the same folder as the program.
// The example was explained and run in class.
// =================================================================

import java.io.*;
public class TestFileClass {
  public static void main(String[] args) throws IOException {

    File file1 = new File("input_sameFolder.txt");
    System.out.println("Does it exist? " + file1.exists());
    System.out.println("Can it be read? " + file1.canRead());
    System.out.println("Can it be written? " + file1.canWrite());
    System.out.println("What is its absolute path? " + file1.getAbsolutePath());
    System.out.println("What is its name? " + file1.getName());
    System.out.println("What is its path? " + file1.getPath());

    System.out.println();
    File file2 = new File("input_diffFolder.txt");
    System.out.println("Does it exist? " + file2.exists());
    System.out.println("Can it be read? " + file2.canRead());
    System.out.println("Can it be written? " + file2.canWrite());
    System.out.println("What is its absolute path? " + file2.getAbsolutePath());
    System.out.println("What is its name? " + file2.getName());
    System.out.println("What is its path? " + file2.getPath());

    System.out.println();
    File file3 = new File("./AnotherFolder/input_diffFolder.txt");
    System.out.println("Does it exist? " + file3.exists());
    System.out.println("Can it be read? " + file3.canRead());
    System.out.println("Can it be written? " + file3.canWrite());
    System.out.println("What is its absolute path? " + file3.getAbsolutePath());
    System.out.println("What is its name? " + file3.getName());
    System.out.println("What is its path? " + file3.getPath());
  }
}
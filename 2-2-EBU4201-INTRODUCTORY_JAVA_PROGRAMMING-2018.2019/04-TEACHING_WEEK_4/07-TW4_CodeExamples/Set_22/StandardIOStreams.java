import java.io.*;

public class StandardIOStreams {
  public String getKeyboardInput() {
    StringBuffer strBuf = new StringBuffer();
    try {
      int c = 0;
      while (true) {
    	c = System.in.read();
    	if (c != -1) { strBuf.append("" + (char) c); }
    	else break;
      }
      System.in.close();
    }
    catch (IOException e) { System.err.println("IO Error: " + e.getMessage()); }
    return strBuf.toString();
  }
  public static void main(String[] args) {
    StandardIOStreams sIOstream = new StandardIOStreams();
    System.out.println("Hi");
    System.out.print("keyboard input is: ");
    String str = sIOstream.getKeyboardInput();
    System.out.print(str);
    System.out.println("bye");
  }
}

public class TestingArgs {
  public static void main(String[] args) {
    System.out.println("number of arguments = " + args.length);

    // print out all valid args values
    for (int i=0; i<args.length; i++)
      System.out.println(args[i]);
  }
}
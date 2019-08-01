public class TestExceptions {
  public static void main(String[] args) {
    RiskyClass rc = new RiskyClass();
    for (int i = 0; i < args.length; i++) {
      rc.checkFileName(args[i]);
    } // end for
  }   // end main()
}

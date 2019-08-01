public class TestExceptions2 {
 public static void main(String[] args) {
  RiskyClass rc = new RiskyClass();
  for(int i = 0; i < args.length; i++) {
    try {
      rc.checkFileName(args[i]);
    } // end try
    catch (Exception e) {
      System.err.println(""+ e + " at "+ i);
    } // end catch
  }   // end for
 } // end main()
}
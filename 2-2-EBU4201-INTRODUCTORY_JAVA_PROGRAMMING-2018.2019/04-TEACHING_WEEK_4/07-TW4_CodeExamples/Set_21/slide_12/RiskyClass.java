public class RiskyClass {        
    public void checkFileName(String s) throws Exception {
        if (s.equals("/etc/passwd"))
            throw new Exception("bad filename");
    }
}

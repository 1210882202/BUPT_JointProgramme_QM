// ===========================================================
// Example illustrating the use of the ArrayList class, as a
// complement to slide 6 of topic "Collections & Sorting".
// ===========================================================

import java.util.ArrayList;

public class TestingArrayList {
    public static void main(String args[]) {
        ArrayList<String> alist = new ArrayList<String>();
        System.out.println("Initial size of 'alist': " + alist.size());

        alist.add("C");
        alist.add("A");
        alist.add("E");
        alist.add("B");
        alist.add("D");
        alist.add("F");
        alist.add(1, "A2");
        System.out.println("Size of 'alist' after additions: " + alist.size());
        System.out.println("Contents of 'alist': " + alist);

        alist.remove("F");
        alist.remove(2);
        System.out.println("Size of 'alist' after deletions: " + alist.size());
        System.out.println("Contents of 'alist': " + alist);
    }
}
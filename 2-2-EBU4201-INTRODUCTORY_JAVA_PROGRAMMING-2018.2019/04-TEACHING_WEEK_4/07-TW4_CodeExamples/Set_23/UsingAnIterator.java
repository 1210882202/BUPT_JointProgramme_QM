// ===========================================================
// Example illustrating the use of the Iterator interface, as
// a complement to slide 8 of topic "Collections & Sorting".
// The example was explained and run in class.
// ===========================================================

import java.util.*;

public class UsingAnIterator {
    public static void main(String[] args) {
        // A simple way to "walk" through a collection,
        // one element at a time.
        List<String> list = new ArrayList<String>();

        list.add("One");
        list.add("Two");
        list.add("Three");

        Iterator<String> iter = list.iterator();
        while (iter.hasNext()) {
            String word = iter.next();
            System.out.println(word);
        }
    }
}
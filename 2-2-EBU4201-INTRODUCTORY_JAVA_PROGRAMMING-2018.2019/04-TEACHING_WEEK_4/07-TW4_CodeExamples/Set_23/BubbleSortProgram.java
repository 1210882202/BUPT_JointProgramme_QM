
// ==========================================================================
// Example illustrating an implementation of the "bubble sorting" algorithm.
// This was discussed in class as an answer to "Exercise 2: Programming
// Exercise 5.14 (IJP book)" of the topic "Collections & Sorting".
// ==========================================================================

public class BubbleSortProgram {
    public static void main(String[] args) {
        double[] myList = {5.0, 4.4, 1.9, 2.9, 3.4, 2.9, 3.5};
        BubbleSortProgram myBubble = new BubbleSortProgram();

        System.out.println("My list before sort:");
        myBubble.printList(myList); myBubble.bubbleSort(myList);

        System.out.println("My list after sort:");
        myBubble.printList(myList);
    }

    void printList(double[] list) {
        for (int i = 0; i < list.length; i++)
            System.out.println(list[i]);
    }

    void bubbleSort(double[] list) {
        boolean changed = true;
        do {
            changed = false;
            for (int j = 0; j < list.length-1; j++)
                if (list[j] > list[j+1]) {
                    double temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;
                    changed = true;
                }
        } while (changed);
    }
}
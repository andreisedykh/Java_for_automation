package fundamentals.arraySort;

public class Main {
    public static void main(String[] args) {
        //Insertion sort demo
        System.out.println("Start of Insertion sorting");

        InsertionSort ob = new InsertionSort();
        ob.sort();
        System.out.println("Insertion sorting completed");
        System.out.println();

        //Selection sort demo
        System.out.println("Start of Selection sorting");
        SelectionSort ob1 = new SelectionSort();
        ob1.sort();
        System.out.println("Selection sorting completed");
        System.out.println();

        //Bubble sort
        System.out.println("Start of Bubble sorting");
        BubbleSort ob2 = new BubbleSort();
        ob2.sort();
        System.out.println("Bubble sorting completed");
    }
}

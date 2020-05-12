package fundamentals.arraySort;

import java.util.Scanner;

public class InsertionSort {
    void sort()
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter array size number");
        int arrayLength = scan.nextInt(); // вводим число = длине массива
        int arr[] = new int[arrayLength];
        System.out.print("Before sorting");
        System.out.println();

        for (int i = 0; i < arr.length; i++) {
            //элементу массива присваивается случайное число от 0 до 99
            arr[i] = (int) (Math.random() * 100);
            System.out.print(arr[i] + " ");
        }

        //int n = arrayLength;
        for (int i = 1; i < arrayLength; ++i) {
            int key = arr[i];
            int j = i - 1;

            // Move elements of arr[0..i-1], that are greater than key, to one position ahead of their current position
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }

        System.out.println();
        System.out.print("After sorting");
        System.out.println();
        printArray(arr);
    }

    //Print array method
    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");

        System.out.println();
    }
}

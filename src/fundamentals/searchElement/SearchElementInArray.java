package fundamentals.searchElement;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class SearchElementInArray {
    public static void searchElement() {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter array size number");
        int arrayLength = scan.nextInt(); // вводим число = длине массива
        int array[] = new int[arrayLength]; // объявляем массив равный введенному числу

        boolean isIntInArray = false;
        Random random = new Random();

        for (int i = 0; i < arrayLength; i++) { // заполняем массив значениями
            array[i] = random.nextInt(100);
            bubbleSort(array);
            System.out.print(array[i] + " ");
        }

        System.out.println();
        System.out.println("Enter element you are searching for");
        int elementValue = scan.nextInt(); // вводим индекс искомого елемента

        long startTime = System.nanoTime();
        BinarySearch ob = new BinarySearch();
        int result = ob.binarySearch(array, 0, arrayLength - 1, elementValue);
        long endTime = System.nanoTime();
        long duration = endTime - startTime;
        System.out.println("Execution time of BinarySearch method is: " + duration);
        if (result == -1)
            System.out.println("False. Element not present");
        else
            System.out.println("True. Element found at index " + result);
    }

    public static void bubbleSort(int[] arr){
        /*Внешний цикл каждый раз сокращает фрагмент массива, так как внутренний цикл каждый раз ставит в конец фрагмента максимальный элемент*/
        for(int i = arr.length-1 ; i > 0 ; i--){
            for(int j = 0 ; j < i ; j++){
                /*Сравниваем элементы попарно,если они имеют неправильный порядок, то меняем местами*/
                if( arr[j] > arr[j+1] ){
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }
    }

    public static void regularSearch() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter array size number");
        int arrayLength = scan.nextInt(); // вводим число = длине массива
        int array[] = new int[arrayLength]; // объявляем массив равный введенному числу

        boolean isIntInArray = false;
        Random random = new Random();

        for (int i = 0; i < arrayLength; i++) { // заполняем массив значениями
            array[i] = random.nextInt(100);
            bubbleSort(array);
            System.out.print(array[i] + " ");
        }

        System.out.println();
        System.out.println("Enter element you are searching for");
        int elementValue = scan.nextInt(); // вводим индекс искомого елемента

        long startTime = System.nanoTime();
        LinearSearch ob = new LinearSearch();
        int result = ob.linearsearch(array, elementValue);
        long endTime = System.nanoTime();
        long duration = endTime - startTime;
        System.out.println("Execution time of LinearSearch method is: " + duration);
        if (result == -1)
            System.out.println("False. Element not present");
        else
            System.out.println("True. Element found at index " + result);
    }
}

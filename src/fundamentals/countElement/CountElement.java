package fundamentals.countElement;

import java.util.Scanner;

public class CountElement {

    public static void countElement() {
        String text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua";
        System.out.println("String is " + text);

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter symbol");
        String element = scan.nextLine(); // вводим символ

        int occurrencesCount = text.length() - text.replace(element, "").length();
        System.out.println("Element: " + element + " was found " + occurrencesCount + " times");
    }
}
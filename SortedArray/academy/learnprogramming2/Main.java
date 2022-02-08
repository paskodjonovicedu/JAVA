package academy.learnprogramming2;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
	// write your code here
        printArray();

    }

    private static int[] getIntegers(int number) {
        System.out.println("Enter " + number + " integer values.\r");
        int[] values = new int[number];
        for (int i = 0; i < values.length; i++) {
            values[i] = scanner.nextInt();
        }
        return values;
    }

    int[] myIntegers = getIntegers(5);

    private void printArray() {
        for (int i = 0; i < myIntegers.length; i++) {
            System.out.println("Element " + i + " contents " + myIntegers[i]);
        }
    }

    private void sortIntegers() {

    }
}

package academy.learnprogramming;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int[] myIntegers = readElements(readInteger());
        System.out.println("MIN value= " + findMin(myIntegers));
    }

    public static int readInteger() {
        System.out.println("How many elements user needs to enter:\r");
        return scanner.nextInt();
    }

    public static int[] readElements(int elements) {
        int[] array = new int[elements];
        for (int i = 0; i < elements; i++) {
            System.out.println("Enter number:");
            int number = scanner.nextInt();
            scanner.nextLine();
            array[i] = number;
        }
        return array;
    }

    public static int findMin(int[] array) {
        int[] newArray = Arrays.copyOf(array, array.length);
        int temp;
        boolean flag = true;
        while (flag) {
            flag = false;
            for (int i = 0; i < array.length - 1; i++) {
                if (newArray[i] > newArray[i + 1]) {
                    temp = newArray[i];
                    newArray[i] = newArray[i + 1];
                    newArray[i + 1] = temp;
                    flag = true;
                }
            }
        }
        return newArray[0];
    }
}

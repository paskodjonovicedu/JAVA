package academy.learnprogramming;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);

        double sum = 0;
        double avg;
        int counter = 0;

        while (true) {
            boolean isAnInt = scanner.hasNextInt();
            if (isAnInt) {
                counter++;
                int n = scanner.nextInt();
                sum += n;
                scanner.nextLine();
            } else {
                break;
            }
        }
        avg = sum / counter;
        System.out.println(avg);
        System.out.println("SUM = " + Math.round(sum) + " AVG = " + Math.round(avg));
        scanner.close();
    }
}

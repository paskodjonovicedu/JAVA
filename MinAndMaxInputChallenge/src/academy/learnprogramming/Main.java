package academy.learnprogramming;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner scanner = new Scanner(System.in);

//        int counter = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
//        boolean first = true;

        while (true) {
            System.out.println("Enter number:");

            boolean isAnInt = scanner.hasNextInt();
            if (isAnInt) {
                int n = scanner.nextInt();

//                if (first) {
//                    first = false;
//                    min = n;
//                    max = n;
//                }

                if (n < min) {
                    min = n;
                }

                if (n > max) {
                    max = n;
                }
                scanner.nextLine();
            } else {
                break;
            }
        }
        System.out.println("Minimun number= " + min + "; Maximum number " + max);
        scanner.close();
    }
}

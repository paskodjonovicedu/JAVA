package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	// write your code here

        String numberAsString = "2018.18";
        System.out.println("NumberAsString= " + numberAsString);

        double number = Double.parseDouble(numberAsString);
        System.out.println("Number " + number);

        numberAsString += 1;
        number += 1;

        System.out.println("numberAsString " + numberAsString);
        System.out.println("number " + number);
    }
}

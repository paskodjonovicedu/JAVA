package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        int result = 1 + 2;
        System.out.println(result);

        boolean isAlien = true;

        if (isAlien == false) {
            System.out.println("It is not an alien");
        } else {
            System.out.println("It is an alien");
        }

        System.out.println("//////////////////////////");

        int topScore = 80;
        if (topScore >= 100) {
            System.out.println("You got the high score!");
        }

        int secondTopScore = 60;
        if (topScore > secondTopScore && topScore < 100) {
            System.out.println("Greater than second top score and less than 100");
        }

//        String stringTopScore = "80";
//        if (topScore == stringTopScore) {
//            System.out.println("ISTO");
//        }
        boolean isCar = false;
        isCar = true;
        boolean wasCar = isCar ? true : false;
        if (wasCar) {
            System.out.println("wasCar is true");
        } else {
            System.out.println("wasCar is false");
        }
        System.out.println("///////////////CHALLENGE///////////");

        double doubleVar = 20.00;
        double doubleVar2 = 80.00;
        doubleVar = (doubleVar + doubleVar2) * 100.00;
        doubleVar = doubleVar % 40.00;
        boolean doubleBool =  doubleVar == 0 ? true : false;
        System.out.println(doubleBool);
        if (!doubleBool) {
            System.out.println("Got some remainder");
        } else {
            System.out.println("Remainder is 0");
        }
    }
}

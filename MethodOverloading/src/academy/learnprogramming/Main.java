package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        int newScore = calculateScore("Pasko", 500);
        System.out.println("New score is " + newScore);
        calculateScore();

        calcFeetAndInchesToCentimeters(6, 0);
        calcFeetAndInchesToCentimeters(24);
    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(int score) {
        System.out.println("Unnamed player scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore() {
        System.out.println("Unnamed player name, no player score");
        return 0;
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if ((feet >= 0) && (inches >= 0 && inches <= 12)) {
            double toCM = feet * 30.48 + inches * 2.54;
            System.out.println(toCM);
            return toCM;
        } else {
            System.out.println("Invalid feet or inches");
            return -1;
        }
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        if (inches >= 0) {
            double toFeet = inches * 0.0833;
            System.out.println(toFeet);
        }
        return -1;
    }
}

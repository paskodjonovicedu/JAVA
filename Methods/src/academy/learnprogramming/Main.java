package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("your final score was " + highScore);

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("your final score was " + highScore);

        int score2 = calculateHIghScorePosition(1500);
        displayHighScorePosition("Pasko", score2);

        score2 = calculateHIghScorePosition(900);
        displayHighScorePosition("Bob", score2);

        score2 = calculateHIghScorePosition(400);
        displayHighScorePosition("Percy", score2);

        score2 = calculateHIghScorePosition(50);
        displayHighScorePosition("Gilbert", score2);
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            return finalScore;
        }
        return -1;
    }

    public static void displayHighScorePosition(String playerName, int pos) {
        System.out.println(playerName + " managed to get into position " + pos);
    }

    public static int calculateHIghScorePosition(int score2) {
//        if (score2 >= 1000) {
//            return 1;
//        } else if (score2 >= 500) {
//            return 2;
//        } else if (score2 >= 100) {
//            return 3;
//        }
//        return 4;

        int position = 4; // assuming position 4 will be returned

        if (score2 >= 1000) {
            position = 1;
        } else if (score2 >= 500) {
            position = 2;
        } else if (score2 >= 100) {
            position = 3;
        }
        return position;
    }
}

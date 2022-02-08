package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

//        if (score < 5000 && score > 1000) {
//            System.out.println("your score was less than 5000 but greater than 1000");
//        } else if (score < 1000){
//            System.out.println("your score was less than 1000");
//        } else {
//            System.out.println("got here");
//        }

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("your final score was " + finalScore);
        }

        boolean newGameOver = true;
        int newscore = 10000;
        int newlevelCompleted = 8;
        int newbonus = 200;
        if (newGameOver) {
            int finalScore = newscore + (newlevelCompleted * newbonus);
            System.out.println("your new final score was " + finalScore);
        }
    }
}

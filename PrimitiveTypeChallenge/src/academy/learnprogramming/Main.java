package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	// write your code here
        byte byteBroj = 10;
        short shortBroj = 20;
        int intBroj = 50;
        long longBroj = 50000L + (10L * (byteBroj + shortBroj + intBroj));
        System.out.println("SUMAA = " + longBroj);

        short shortTotal = (short) (1000 + 10 * (byteBroj + shortBroj + intBroj));
        System.out.println(shortTotal);
    }
}

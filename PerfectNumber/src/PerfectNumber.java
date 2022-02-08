public class PerfectNumber {

    public static boolean isPerfectNumber(int number) {
        int perfect = 0;
        if (number < 1) {
            System.out.println("Invalid Value");
        } else {
            for (int i = 1; i <= number; i++) {
                if ((number % i == 0) && (i != number)) {
                    perfect += i;
                    if (perfect == number) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}

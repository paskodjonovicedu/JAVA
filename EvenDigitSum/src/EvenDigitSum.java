public class EvenDigitSum {

    public static int getEvenDigitSum(int number) {
        if (number < 0) {
            return -1;
        }
        // uzimamo zadnji broj
        // provjeravamo taj zadnji broj je li paran
        // ako je paran sumiramo
        // dijelimo sa 10
        // zadnji broj opet nula
        int lastDigit = 0;
        int sum = 0;
        while (number > 0) {
            lastDigit = number % 10;
            if (isEven(number)) {
                sum += lastDigit;
            }
            number /= 10;
            lastDigit = 0;
        }
        return sum;
    }

    public static boolean isEven(int number) {
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}

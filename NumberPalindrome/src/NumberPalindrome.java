public class NumberPalindrome {

    public static boolean isPalindrome(int number) {
        number = Math.abs(number);
        int reverse = 0;
        int lastDigit = 0;
        int newNUmber = number;

        while (newNUmber > 0) {
            lastDigit = newNUmber % 10;
            reverse = reverse * 10 + lastDigit;
            newNUmber /= 10;
        }
        if (number == reverse) {
            return true;
        } else {
            return false;
        }
    }
}

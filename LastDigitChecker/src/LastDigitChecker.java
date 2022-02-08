public class LastDigitChecker {

    public static boolean hasSameLastDigit(int firstEl, int secondEl, int thirdEl) {
        if ((firstEl >= 10 && firstEl <= 1000) && (secondEl >= 10 && secondEl <= 1000) && (thirdEl >= 10 && thirdEl <= 1000)) {
            int lastFirstEl = 0;
            int lastSecondEl = 0;
            int lastThirdEl = 0;

            lastFirstEl = firstEl % 10;
            lastSecondEl = secondEl % 10;
            lastThirdEl = thirdEl % 10;

            return (lastFirstEl == lastSecondEl || lastFirstEl == lastThirdEl) || (lastSecondEl == lastThirdEl);
        } else {
            return false;
        }
    }

    public static boolean isValid(int number) {
        if (number >= 10 && number <= 1000) {
            return true;
        }
        return false;
    }
}

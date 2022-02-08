public class FirstAndLastDigitSum {

    public static int sumFirstANdLastDigit(int number) {
        int lastDigit = 0;
        if (number >= 0) {
            lastDigit = number % 10;

            while (number > 9) {
                number = number / 10;
            }

            System.out.println("First number " + number + " Last number " + lastDigit + " Total " + (number + lastDigit));
            return  number + lastDigit;
        } else {
            return -1;
        }
    }
}

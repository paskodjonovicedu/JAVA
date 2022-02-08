public class NumberToWords {

    public static void numberToWords(int number) {
        int lastDigit = 0;
        String converted = null;
        if (number < 0) {
            System.out.println("Ivalid Value");
        } else {
            while (number > 0) {
                lastDigit = number % 10;
                switch (lastDigit) {
                    case 9:
                        converted = "Nine";
                        break;
                    case 8:
                        converted = "Eight";
                        break;
                    case 7:
                        converted = "Seven";
                        break;
                    case 6:
                        converted = "Six";
                        break;
                    case 5:
                        converted = "Five";
                        break;
                    case 4:
                        converted = "Four";
                        break;
                    case 3:
                        converted = "Three";
                        break;
                    case 2:
                        converted = "Two";
                        break;
                    case 1:
                        converted = "One";
                        break;
                    case 0:
                        converted = "Zero";
                        break;
                    default:
                        converted = "Ivalid Value";
                        break;
                }
                number /= 10;
                lastDigit = 0;
                System.out.println(converted);
            }
        }
    }

    public static int reverse(int number) {
        int number2 = number;
        if (number < 0) {
            number = Math.abs(number);
        }
        int reversed = 0;
        while (number != 0) {
            int lastDigit = number % 10;
            reversed = reversed * 10 + lastDigit;
            number = number / 10;
        }
        if (number2 < 0) {
            reversed = reversed * -1;
        }
        return reversed;
    }

    public static int getDigitCount(int number) {
        int number2 = number;
        if (number < 0) {
            return -1;
        } else {
            int count = 0;
            int lastDigit;

            while (number != 0) {
                count++;
                lastDigit = number % 10;
                number = number / 10;
            }
            if (number2 == 0) {
                count = 1;
            }

            return count;
        }
    }
}

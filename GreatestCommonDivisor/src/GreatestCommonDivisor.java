public class GreatestCommonDivisor {

    public static int getGreatestCommonDivisor(int first, int second) {
        if ((first > 10) || (second > 10)) {
            int divisor = 0;
            int broj = 0;
            if (first > second) {
                broj = first;
            } else {
                broj = second;
            }
            //
                for (int i = 1; i <= broj + 100; i++) {
                    if ((first % i == 0) && (second % i == 0)) {
                        divisor = i;
                    }
                }
                return divisor;
        } else {
            return -1;
        }
    }
}

public class SharedDigit {

    public static boolean hasSharedDigit(int firstEl, int secondEl) {
        int lastDigFirst = 0;
        int lastDigSecond = 0;
        if ((firstEl >= 10 && firstEl <= 99) && (secondEl >= 10 && secondEl <= 99)) {
            // uzimamo zadnje brojeve
            // provjeravamo jesu li isti => ako su isti => true i break;
            // ako nisu isti nastavljamo i micemo zadnje brojeve
            // oni gornji brojevi postaju opet nula
            // pa nastavljamo sa novm brojevima

            // 34 = 56 => 3 = 5 || 3 = 6 === 4 = 5 || 4 = 6
//            while ((firstEl > 0) && (secondEl > 0)) {
                lastDigFirst = firstEl % 10;
                lastDigSecond = secondEl % 10;
                firstEl /= 10;
                secondEl /= 10;
                if ((firstEl == secondEl) || (firstEl == lastDigSecond) || (lastDigFirst == secondEl) || lastDigFirst == lastDigSecond ) {
                    return true;
                }

                lastDigFirst = 0;
                lastDigSecond = 0;
//            }

        } else {
            return false;
        }
        return false;
    }
}

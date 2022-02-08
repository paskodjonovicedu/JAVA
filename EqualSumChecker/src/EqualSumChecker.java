public class EqualSumChecker {
    public static boolean hasEqualSum(int firstEl, int secondEl, int thirdEl) {
        if ((firstEl + secondEl) == thirdEl) {
            return true;
        } else {
            return false;
        }
    }
}

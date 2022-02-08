public class TeenNumberChecker {

    public static boolean hasTenn(int firstEl, int secondEL, int thirdEl) {
        return (firstEl <= 19 && firstEl >= 13) || (secondEL <= 19 && secondEL >= 13) || (thirdEl <= 19 && thirdEl >= 13);
    }

    public static boolean isTeen(int firstEL) {
        return (firstEL >= 13 && firstEL <= 19);
    }
}

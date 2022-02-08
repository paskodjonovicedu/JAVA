public class FlourPackProblem {

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if (bigCount < 0 || smallCount < 0 || goal < 0) return false;
        int weight = bigCount * 5 + smallCount;
        if (weight == goal) return true;

        else {
            if (weight > goal && smallCount >= goal % 5) return true;
            else if (bigCount == 0 && smallCount >= goal)
                return true;
            else return false;
        }
    }
}

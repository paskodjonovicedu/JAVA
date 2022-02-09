package academy.learnprogramming;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int[] array = {1,2,3,4,5,6,7,8};
        System.out.println("array= " + Arrays.toString(array));
        reverse(array);
        System.out.println("Reversed array= " + Arrays.toString(array));
    }

    public static void reverse(int[] array) {
        int maxIndex = array.length - 1;
        int halfIndex = array.length /2;
        for (int i = 0; i< halfIndex; i++) {
            int temp = array[i];
            array[i] = array[maxIndex - i];
            array[maxIndex - i] = temp;
        }
    }
}

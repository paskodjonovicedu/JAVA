package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int myValue = 10000;

        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer Min value = " + myMinIntValue);
        System.out.println("Integer Max value = " + myMaxIntValue);
        System.out.println("Busted MAX VALUE = " + (myMaxIntValue + 1));
        System.out.println("Busted MIN VALUE = " + (myMinIntValue - 1));

        int myMaxIntTest = 2147483647;

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte MIN VALUE = " + myMinByteValue);
        System.out.println("Byte MAX VALUE = " + myMaxByteValue);

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short MIN VALUE = " + myMinShortValue);
        System.out.println("Short MAX VALUE = " + myMaxShortValue);

        long myLongValue = 100L;
        Long myMinLongValue = Long.MIN_VALUE;
        Long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long MIN VALUE = " + myMinLongValue);
        System.out.println("Long MAX VALUE = " + myMaxLongValue);
        long bigLongLiteralValue = 2_147_483_647_324L;
        System.out.println(bigLongLiteralValue);

        short bigShortLiteralValue = 32767;

        int myTotal = (myMinIntValue / 2);

        byte myNewByteValue = (byte) (myMinByteValue / 2);

        short myNewShortValue = (short) (myMinShortValue / 2);


    }
}

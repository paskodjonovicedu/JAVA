package academy.learnprogramming;

import java.text.DecimalFormat;

public class Main {

    public static void main(String[] args) {

        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float MIN VALUE = " + myMinFloatValue);
        System.out.println("Float MAX VALUE = " + myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("double MIN VALUE = " + myMinDoubleValue);
        System.out.println("double MAX VALUE = " + myMaxDoubleValue);

        int myIntValue = 5 / 3;
        float myFloatValue = 5f / 3f;
        double myDoubleValue = 5d / 3.00;
        System.out.println("MYINtValue= " + myIntValue);
        System.out.println("MyFloatValue= " + myFloatValue);
        System.out.println("MyDoubleValue= " + myDoubleValue);

        double pounds = 200;
        double toKG = pounds * 0.45359237;
        System.out.println(toKG);

        DecimalFormat df = new DecimalFormat("#.000");
        String toKg2Dec = df.format(toKG);
        System.out.println(toKg2Dec);

        double pi = 3.1415927d;
        double anotherNumber = 3_000_000.4_567_890d;
        System.out.println(pi);
        System.out.println(anotherNumber);
    }
}

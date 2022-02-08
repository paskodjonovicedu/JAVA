package academy.learnprogramming;

import com.sun.jdi.Value;

public class Main {

    public static void main(String[] args) {
        // write your code here

        int switchValue = 5;
        char switchValue2 = 'C';

//        switch (switchValue) {
//            case 1:
//                System.out.println("value was 1");
//                break;
//            case 2:
//                System.out.println("value was 2");
//                break;
//            case 3:
//            case 4:
//            case 5:
//                System.out.println("was a 3 or 4 or 5");
//                System.out.println("Actually it was a " + switchValue);
//                break;
//            default:
//                System.out.println("was not 1 or 2");
//                break;
//        }
        switch (switchValue2) {
            case 'A':
                System.out.println("A was found");
                break;
            case 'B':
                System.out.println("B was found");
                break;
            case 'C':
                System.out.println("C was found");
                break;
            default:
                System.out.println("was not A or B or C");
                break;
        }

        String month = "January";
        switch (month.toLowerCase()) {
            case "january":
                System.out.println("Jan");
                break;
            case "june":
                System.out.println("Jun");
                break;
            default:
                System.out.println("not sure");
                break;
        }
    }
}

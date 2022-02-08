package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	// write your code here

        SimpleCalculator calculator = new SimpleCalculator();
        calculator.setFirstNumber(5.0);
        calculator.setSecondNumber(4);
        System.out.println("add= " + calculator.getAdditionResult());
        System.out.println("substract= " + calculator.getSubtractionResult());
        calculator.setFirstNumber(15);
        calculator.setSecondNumber(3);
        System.out.println("multiply= " + calculator.getMultiplicationResult());
        System.out.println("divide= " + calculator.getDivisionResult());
    }
}

package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Printer printer = new Printer(50,true);
        System.out.println("initial page count = " + printer.getPagesPrinted());
        int pagesPrinted = printer.printPages(4);
        System.out.println("pages printed was " + pagesPrinted + " new total print count for printer " + printer.getPagesPrinted());
        pagesPrinted = printer.printPages(2);
        System.out.println("pages printed was " + pagesPrinted + " new total print count for printer " + printer.getPagesPrinted());
    }
}

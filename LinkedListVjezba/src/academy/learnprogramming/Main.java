package academy.learnprogramming;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        LinkedList<String> knjigeZaCitanje = new LinkedList<String>();
        addINOrder(knjigeZaCitanje, "Pad");
        addINOrder(knjigeZaCitanje, "Stranac");
        addINOrder(knjigeZaCitanje, "Persijska pisma");
        addINOrder(knjigeZaCitanje, "Albert Kami");
        addINOrder(knjigeZaCitanje, "Pad");
        printList(knjigeZaCitanje);
        citaj(knjigeZaCitanje);

    }

    private static void printList(LinkedList<String> linkedList) {
        Iterator<String> i = linkedList.iterator();
        while (i.hasNext()) {
            System.out.println("Now reading " + i.next());
        }
        System.out.println("=========================");
    }

    private static boolean addINOrder(LinkedList<String> linkedList, String newKnjiga) {
        ListIterator<String> stringListIterator = linkedList.listIterator();

        while (stringListIterator.hasNext()) {
            int comparison = stringListIterator.next().compareTo(newKnjiga);
            if (comparison == 0) {
                System.out.println(newKnjiga + " is already included in library");
                return false;
            } else if (comparison > 0) {
                stringListIterator.previous();
                stringListIterator.add(newKnjiga);
                return true;
            } else if (comparison < 0) {

            }
        }
        stringListIterator.add(newKnjiga);
        return true;
    }

    private static void citaj(LinkedList knjige) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean goingForward = true;
        ListIterator<String> listIterator = knjige.listIterator();
        if (knjige.isEmpty()) {
            System.out.println("No books in library");
        } else {
            System.out.println("Now reading " + listIterator.next());
            printMenu();
        }
        while (!quit) {
            int action = scanner.nextInt();
            scanner.nextLine();
            switch (action) {
                case 0:
                    System.out.println("Reading over");
                    quit = true;
                    break;

                case 1:
                    if (!goingForward) {
                        if (listIterator.hasNext()) {
                            listIterator.next();
                        }
                        goingForward = true;
                    }
                    if (listIterator.hasNext()) {
                        System.out.println("Now reading " + listIterator.next());
                    } else {
                        System.out.println("Reached the end of the list");
                        goingForward = false;
                    }
                    break;

                case 2:
                    if (goingForward) {
                        if (listIterator.hasPrevious()) {
                            listIterator.previous();
                        }
                        goingForward = false;
                    }
                    if (listIterator.hasPrevious()) {
                        System.out.println("Now reading " + listIterator.previous());
                    } else {
                        System.out.println("We are at the start of the list");
                        goingForward = true;
                    }
                    break;

                case 3:
                    printMenu();
                    break;
            }
        }
    }

    private static void printMenu() {
        System.out.println("Available options:\npress");
        System.out.println("0 - to quit\n" +
                "1 - go to next book\n" +
                "2 - go to previous book\n" +
                "3 - print menu options");
    }
}

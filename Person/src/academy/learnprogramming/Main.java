package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Person person = new Person();
        person.setFirstName("");
        person.setLastName("");
        person.setAge(5);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        person.setFirstName("Pasko");
        person.setAge(25);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        person.setLastName("Djonovic");
        System.out.println("fullName= " + person.getFullName());
    }
}

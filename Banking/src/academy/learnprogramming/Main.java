package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Bank bank = new Bank("National Australia Bank");

        bank.addBranch("Adelaide");

        bank.addCustomer("Adelaide", "Tim", 50.05);
        bank.addCustomer("Adelaide", "Pasko", 100);
        bank.addCustomer("Adelaide", "Vasilije", 20.20);

        bank.addBranch("Sydney");
        bank.addCustomer("Sydney", "Bob", 150.54);

        bank.addCustomerTransaction("Adelaide", "Tim", 44.22);
        bank.addCustomerTransaction("Adelaide", "Tim", 12.44);
        bank.addCustomerTransaction("Adelaide", "Pasko", 1.65);

        bank.listCustomer("Adelaide", true);
        bank.listCustomer("Sydney", true);

        bank.addBranch("Melbourne");
        if (!bank.addCustomer("Melbourne", "Brian", 10)) {
            System.out.println("Error Melbourne branch does not exist");
        }

        if (!bank.addBranch("Adelaide")) {
            System.out.println("Adelaide branch already exists");
        }

        if (!bank.addCustomerTransaction("Adelaide", "Fergus", 53)) {
            System.out.println("Customer does not exist");
        }

        if (!bank.addCustomer("Adelaide", "Tim", 20.21)) {
            System.out.println("Customer Tim already exist");
        }
    }
}

import java.util.Scanner;
public class ATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Input account details
        System.out.println("Enter Account Holder Name: ");
        String BankAccountHolder = sc.nextLine();
        System.out.println("Enter Account Number: ");
        String BankAccountNumber = sc.nextLine();
        System.out.println("Enter Initial Balance: ");
        double BankInitialBalance = sc.nextDouble();

        // Create BankAccount object
        BankAccount account = new BankAccount(BankAccountHolder, BankAccountNumber, BankInitialBalance);

        // Perform operations
        // prop value to deposit and withdraw
        account.deposit(5000);
        account.withdraw(300);
        account.displayBalance();

        sc.close();
    }
}
// BankAccount class to manage bank account details
class BankAccount {
    String BankAccountHolder;
    String BankAccountNumber;
    double BankInitialBalance;

    // Constructor to initialize bank account details
    public BankAccount(String BankAccountHolder, String BankAccountNumber, double BankInitialBalance) {
        this.BankAccountHolder = BankAccountHolder;
        this.BankAccountNumber = BankAccountNumber;
        this.BankInitialBalance = BankInitialBalance;
    }
    //method to deposit money
    public void deposit(double amount) {
        BankInitialBalance += amount;
        System.out.println("Deposited: " + amount);
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount <= BankInitialBalance) {
            BankInitialBalance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance!");
        }
    }
    // Method to display current balance
    public void displayBalance() {
        System.out.println("Current Balance: " + BankInitialBalance);
    }
}

//input
//Enter Account Holder Name:
//Harman
//Enter Account Number:
//        12
//Enter Initial Balance:
//        6000
//Deposited: 5000.0
//Withdrawn: 300.0
//output
//Current Balance: 10700.0
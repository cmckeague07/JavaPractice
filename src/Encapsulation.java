public class Encapsulation {
    public static void main(String[] args) {
        System.out.println("Encapsulation");
        BankAccount bank1 = new BankAccount("Conor McKeague", 250000);
        bank1.deposit(10000);
        bank1.withdraw(50000);
        bank1.getBalance();
    }

}
class BankAccount {
    // Private instance variables
    private double balance;
    private String accountHolderName;

    // Constructor
    public BankAccount(String accountHolderName, double initialBalance) {
        this.accountHolderName = accountHolderName;
        this.balance = initialBalance;
    }

    // Getter for balance
    public double getBalance() {
        System.out.println("Balance + "  + balance);
        return balance;
    }

    // Setter for balance with validation
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    // Withdraw method with validation
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }

    // Getter for accountHolderName (no setter for accountHolderName to make it read-only)
    public String getAccountHolderName() {
        return accountHolderName;
    }
}
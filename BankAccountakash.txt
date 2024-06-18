public class BankAccountakash {
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    public BankAccount(String accountNumber, String accountHolderName, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: $" + amount);
        System.out.println("New Balance: $" + balance);
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
            System.out.println("New Balance: $" + balance);
        } else {
            System.out.println("Insufficient funds.");
        }
    }

    public void display() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Balance: $" + balance);
    }

    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount("123456789", "John Doe", 1000.00);
        
        myAccount.display(); // Display initial account details
        
        myAccount.deposit(500.00); // Deposit $500
        myAccount.withdraw(200.00); // Withdraw $200
        myAccount.withdraw(1500.00); // Attempt to withdraw $1500
    }
}

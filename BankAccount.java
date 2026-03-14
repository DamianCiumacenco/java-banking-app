import java.util.ArrayList;

public class BankAccount {
    private String accountHolder;
    private double balance;
    private ArrayList<String> transactionHistory;
    
    public BankAccount(String accountHolder) {
        this.accountHolder = accountHolder;
        this.balance = 0.0;
        this.transactionHistory = new ArrayList<>();
        System.out.println(" Account created for: " + accountHolder);
    }
    
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            transactionHistory.add(" Deposited: €" + amount);
            System.out.println(" Deposited €" + amount + " | Balance: €" + balance);
        } else {
            System.out.println(" Amount must be positive!");
        }
    }
    
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            transactionHistory.add(" Withdrew: €" + amount);
            System.out.println(" Withdrew €" + amount + " | Balance: €" + balance);
        } else if (amount > balance) {
            System.out.println(" Insufficient funds! Balance: €" + balance);
        } else {
            System.out.println(" Amount must be positive!");
        }
    }
    
    public void checkBalance() {
        System.out.println(" Current balance: €" + balance);
    }
    
    public void showHistory() {
        System.out.println("\n===  TRANSACTIONS FOR " + accountHolder + " ===");
        if (transactionHistory.isEmpty()) {
            System.out.println("No transactions yet.");
        } else {
            for (String transaction : transactionHistory) {
                System.out.println(transaction);
            }
        }
        System.out.println("Current balance: €" + balance);
        System.out.println("=================================");
    }
}

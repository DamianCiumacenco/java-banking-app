// Simple Banking System
// Damian Ciumacenco
// Jun 2025

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=================================");
        System.out.println("    SIMPLE BANKING SYSTEM    ");
        System.out.println("=================================");
        
        System.out.print("Enter account holder name: ");
        String name = scanner.nextLine();
        BankAccount account = new BankAccount(name);
        
        while (true) {
            System.out.println("\n=== 📱 MAIN MENU ===");
            System.out.println("1.  Deposit");
            System.out.println("2.  Withdraw");
            System.out.println("3.  Balance");
            System.out.println("4.  History");
            System.out.println("5.  Exit");
            System.out.print("Choose option (1-5): ");
            
            int choice = scanner.nextInt();
            
            switch(choice) {
                case 1:
                    System.out.print("Enter amount: €");
                    double depositAmount = scanner.nextDouble();
                    account.deposit(depositAmount);
                    break;
                case 2:
                    System.out.print("Enter amount: €");
                    double withdrawAmount = scanner.nextDouble();
                    account.withdraw(withdrawAmount);
                    break;
                case 3:
                    account.checkBalance();
                    break;
                case 4:
                    account.showHistory();
                    break;
                case 5:
                    System.out.println("\n Thank you for banking with us, " + name + "!");
                    System.out.println("Have a great day!");
                    scanner.close();
                    return;
                default:
                    System.out.println(" Invalid option! Choose 1-5.");
            }
        }
    }
}


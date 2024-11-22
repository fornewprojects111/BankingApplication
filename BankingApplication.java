package com.nit.Banking;
import java.util.Scanner;

public class BankingApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double balance = 0.0;
        boolean exit = false;

        System.out.println("Welcome to the Simple Banking Application!");

        while (!exit) {
            System.out.println("\nPlease choose an option:");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    balance = deposit(scanner, balance);
                    break;
                case 2:
                    balance = withdraw(scanner, balance);
                    break;
                case 3:
                    checkBalance(balance);
                    break;
                case 4:
                    System.out.println("Thank you for using the banking application. Goodbye!");
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }

    public static double deposit(Scanner scanner, double balance) {
        System.out.print("Enter the amount to deposit: ");
        double amount = scanner.nextDouble();

        if (amount > 0) {
            balance += amount;
            System.out.println("Successfully deposited $" + amount);
        } else {
            System.out.println("Invalid amount. Deposit failed.");
        }

        return balance;
    }

    public static double withdraw(Scanner scanner, double balance) {
        System.out.print("Enter the amount to withdraw: ");
        double amount = scanner.nextDouble();

        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Successfully withdrew $" + amount);
        } else if (amount > balance) {
            System.out.println("Insufficient balance. Withdrawal failed.");
        } else {
            System.out.println("Invalid amount. Withdrawal failed.");
        }

        return balance;
    }

    public static void checkBalance(double balance) {
    	 System.out.println("Your current balance is: $" + balance);
    }
}
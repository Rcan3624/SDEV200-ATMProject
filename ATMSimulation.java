package com.example.atmproject;

import javafx.application.Application;
import javafx.stage.Stage;

import java.math.BigDecimal;
import java.util.Scanner;

public class ATMSimulation extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        
    }

    public class Account {
        private String FirstName;
        private String LastName;

        //getAccountInfo():
        //getCheckingBalance():
        //getSavingsBalance():

    }



    // Method to check the balance
    private static void checkBalance() {
        BigDecimal balance = null;
        System.out.println("Your current balance is: $" + balance);
    }

    public class User {
        Short userPinInfo;

        //getPinInfo():
        //changePin():
        //transactionHistory():
    }

    public class ATM {
        byte pinAttempt;
        BigDecimal transactionAmount;
        // Method to display the main menu
        private static void displayMenu() {
            System.out.println("\nATM Menu:");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
            System.out.print("Please choose an option: ");
        }

        // Method to deposit money
        private static void depositMoney() {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter amount to deposit: $");
            double amount = scanner.nextDouble();
            if (amount > 0) {
                System.out.println("Deposited $" + amount + ". Your new balance is $" + amount);
            } else {
                System.out.println("Invalid deposit amount.");
            }
        }

        // Method to withdraw money
        private static void withdrawMoney() {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter amount to withdraw: $");
            double amount = scanner.nextDouble();
            double balance = 0;
            if (amount > 0 && amount <= balance) {
                balance -= amount;
                System.out.println("Withdrew $" + amount + ". Your new balance is $" + balance);
            } else if (amount > balance) {
                System.out.println("Insufficient balance.");
            } else {
                System.out.println("Invalid withdrawal amount.");
            }
        }


        //setSavingsBalance():
        //transactionOption():
        //exit():
    }

}


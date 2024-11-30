import java.math.BigDecimal;
import java.util.Scanner;

public class ATM {
    byte pinAttempt;
//    BigDecimal transactionAmount;

    // Method to handle the login process
    public boolean login(String pin) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter PIN: ");
        String enteredPin = scanner.nextLine();
        return enteredPin.equals(pin);
    }

    // Method to display the main menu
    public void displayMenu() {
        System.out.println("\nATM Menu:");
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit Money");
        System.out.println("3. Withdraw Money");
        System.out.println("4. Exit");
        System.out.print("Please choose an option: ");
    }






    //setSavingsBalance():
    //transactionOption():
    //exit():
}

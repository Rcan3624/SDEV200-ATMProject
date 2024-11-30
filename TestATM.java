import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class TestATM extends ATM {
    public static void main(String[] args) {

        System.out.println("Welcome to the ATM!");

        String pin = "1234";

        // Test ATM class functions
        ATM atmCommand = new ATM();

        atmCommand.login(pin);
        atmCommand.displayMenu();

        System.out.println("ATM Diagnostic Complete");



    }
}


//            // Login process
//            if (!login(PIN)) {
//                System.out.println("Incorrect PIN. Exiting program.");
//                return;
//            }
package ui;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Menu {
    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);
        int option;
        do {
            System.out.println("\"=== Sapphire Bank ===\"");
            System.out.println("1 - Create account");
            System.out.println("2 - Check balance");
            System.out.println("3 - Deposit");
            System.out.println("4 - Withdraw");
            System.out.println("5 - Exit");
            System.out.print("Choose an option from 1 to 5: ");
        try {
           
            option = scanner.nextInt();
        }
        catch (InputMismatchException e) {
            System.err.println("The character must be of the numeric type");
            scanner.nextLine();
            option = 0;
        

        }


            switch (option) {
                case 1:
                    System.out.println("Creating account...");
                    break;
                case 2:
                    System.out.println("Checking balance...");
                    break;
                case 3:
                    System.out.println("Depositing...");
                    break;
                case 4:
                    System.out.println("Withdrawing...");
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid option!");

            }
        } while (option != 5);
        scanner.close();


    }
}

import java.util.Scanner;

public class TerminalAccount {
    public static void main (String [] args){
        System.out.println("=================================");
        System.out.println("\"Welcome to Sapphire Bank!\"");
        System.out.println("=================================");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your full name: ");
        String clientName = scanner.nextLine();
        System.out.println("Hello, " + clientName + "Welcome to Sapphire Bank");

        System.out.println("Enter your Tax ID Number (TIN): ");
        String taxIdNumber = scanner.nextLine();

        System.out.println("Please provide your email address.");
        String email = scanner.nextLine();

        System.out.println("Add your address.");

        System.out.println("Add your postal code: ");
        String postalCode = scanner.nextLine();

        System.out.println("Add your street: ");
        String road = scanner.nextLine();

        System.out.println("Add your house number.");
        String number = scanner.nextLine();

        System.out.println("Add your neighborhood: ");
        String neighborhood = scanner.nextLine();

        System.out.println("Add your city: ");
        String city = scanner.nextLine();

        System.out.println("Add your state: ");
        String state = scanner.nextLine();

        System.out.println("Add the supplement if applicable: ");
        String complement = scanner.nextLine();

        System.out.println("Finally, enter your password: ");
        String password = scanner.nextLine();

        System.out.println("Congratulations, your account has been successfully created.");


    }
}

// Import Scanner function into program
import java.util.Scanner;

// Create a class called Q2Currency per instructions
public class Q2Currency {
    public static void main(String[] args) {
        // Call scanner function to get user input
        Scanner scanner = new Scanner(System.in);
        // Define variables for currency and amount
        String currencyFrom;
        double amount;

        // Validate the currency input per instructions
        while (true) {
            // Ask user what currency they are converting from
            System.out.print("What currency you are converting from? (Dollar or Euro): ");
            // Set everything to lowercase to avoid case sensitivity
            currencyFrom = scanner.nextLine().trim().toLowerCase();
            // Check for valid input from user
            if (currencyFrom.equals("dollar") || currencyFrom.equals("euro")) {
                break;
            } else {
                // If input is invalid, prompt user to enter either Dollar or Euro
                System.out.println("Wrong input, please enter either Dollar or Euro.");
            }
        }

        // Get the amount of money to convert from user input
        System.out.print("Enter amount of money you have: ");
        // Check for valid input from user
        while (!scanner.hasNextDouble()) {
            System.out.print("Please enter a valid number: ");
            scanner.next(); // discard invalid input
        }
        // Set variables if input is valid
        amount = scanner.nextDouble();
        scanner.close();

        // Perform the conversion
        double convertedAmount = convertCurrency(currencyFrom, amount);

        // Display the result in the terminal window
        if (currencyFrom.equals("dollar")) {
            // For dollars, display the amount in Euros
            System.out.printf("We will give you %.2f Euros%n", convertedAmount);
        } else {
            // For Euros, display the amount in Dollars
            System.out.printf("We will give you %.2f Dollars%n", convertedAmount);
        }
    }
    // Defining convertCurrency function to calculate the conversion rate
    public static double convertCurrency(String currencyFrom, double amount) {
        double conversionRate = 0.89; // 1 Dollar = 0.89 Euro
        if (currencyFrom.equals("dollar")) {
            return amount * conversionRate;
        } else {
            return amount / conversionRate;
        }
    }
}

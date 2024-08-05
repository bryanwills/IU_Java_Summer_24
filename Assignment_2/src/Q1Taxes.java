// Import the scanner function into program
import java.util.Scanner;

// Create a class called Q1Taxes per instructions
public class Q1Taxes {
    public static void main(String[] args) {
        // Call scanner function to get user input
        Scanner scanner = new Scanner(System.in);
        // Prompt for income
        System.out.print("Enter your annual income: ");
        // Store income as varaiable 'income'
        double income = scanner.nextDouble();
        scanner.close();
        // Get the taxes calculated from the function 'calculateTaxes' and store in variable 'taxes'
        double taxes = calculateTaxes(income);

        System.out.println("The amount of taxes you need to pay is: $" + taxes);
    }
    // Define a function 'calculateTaxes' that takes in a double 'income' and returns a double 'taxes'
    public static double calculateTaxes(double income) {
        // Set taxes to 0 intitally
        double taxes = 0.0;
        //Calculate the taxes based on the parameters given

        // This function will first try for income less than 20,000, then between 20,000 and 40,000,
        // then between 40,000 and 100,000, and finally greater than 100,000 per instructions.
        if (income <= 20000) {
            taxes = income * 0.03;
        } else if (income > 20000 && income < 40000) {
            taxes = 20000 * 0.03 + (income - 20000) * 0.05;
        } else if (income >= 40000 && income <= 100000) {
            taxes = (income * 0.05) + 500;
        } else if (income > 100000) {
            taxes = income * 0.10;
        }

        // Ensure taxes do not exceed $20,000. If so, taxes are set to $20,000.
        if (taxes > 20000) {
            taxes = 20000;
        }
        // Returun the taxes calculated
        return taxes;
    }
}

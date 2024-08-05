// Import scanner function into program
import java.util.Scanner;

public class Q3Menu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean finished = false;
        // Prompt user for password
        System.out.print("Enter a password to use this program: ");
        String password = input.next();
        // Added a while statement to continue to ask for password until the first letter is 'J' or 'j'
        while (password.charAt(0) != 'J' && password.charAt(0) != 'j') {
            System.out.println("Invalid password -- Try again");
            password = input.next();
        }
        // While loop continues to display menu until choice 5 is selected by user
        while (!finished) {
            // Menu Display
            System.out.println("");
            System.out.println("Some Menu");
            System.out.println("=====================");
            System.out.println("1. Do Something 1");
            System.out.println("2. Do Something 2");
            System.out.println("3. Do Something 3");
            System.out.println("4. Do Something 4");
            System.out.println("5. Exit");
            System.out.println("");
            // Ask user for their choice
            System.out.print("Please enter your choice (1-5): ");
            int userChoice = input.nextInt();
            // Checks the user input in a nested if-else statment, copying the choices from the example code
            if (userChoice == 1) {
                System.out.println("Choice 1");
            } else if (userChoice == 2) {
                System.out.println("Choice 2");
            } else if (userChoice == 3) {
                System.out.println("Choice 3");
            } else if (userChoice == 4) {
                System.out.println("Choice 4");
            } else if (userChoice == 5) {
                finished = true;
            } else {
                System.out.println("Invalid input");
            }
        }
        input.close();
    }
}

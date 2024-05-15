import java.util.Scanner;

public class Q1ExercisingActivities {

    public static void main(String[] args) {
        // Constants for calories burned per hour for each activity
        final int CALORIES_BURNED_BICYCLING = 200;
        final int CALORIES_BURNED_JOGGING = 475;
        final int CALORIES_BURNED_SWIMMING = 275;
        final int CALORIES_PER_POUND = 3500;

        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for hours spent on each activity
        System.out.print("Enter the number of hours you spent bicycling: ");
        double hoursBicycling = scanner.nextDouble();

        System.out.print("Enter the number of hours you spent jogging: ");
        double hoursJogging = scanner.nextDouble();

        System.out.print("Enter the number of hours you spent swimming: ");
        double hoursSwimming = scanner.nextDouble();

        // Calculate the total calories burned
        int totalCalories = (int) (hoursBicycling * CALORIES_BURNED_BICYCLING +
                                   hoursJogging * CALORIES_BURNED_JOGGING +
                                   hoursSwimming * CALORIES_BURNED_SWIMMING);

        // Calculate the pounds lost
        double poundsLost = (double) totalCalories / CALORIES_PER_POUND;

        // Display the results
        System.out.printf("You burned a total of %d calories.\n", totalCalories);
        System.out.printf("That's approximately %.2f pounds lost!\n", poundsLost);

        // Close the scanner
        scanner.close();
    }
}
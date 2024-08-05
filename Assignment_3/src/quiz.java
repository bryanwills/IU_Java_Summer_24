// Necessary imports for the program to run
import java.util.Random;
import java.util.Scanner;

public class quiz {
    public static void main(String[] args) {
        // Initialze scanner and random into program
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        //start the loop and run it as long as it is true
        while (true) {
            int num1 = random.nextInt(10); // Generate first random single-digit number
            int num2 = random.nextInt(10); // Generate second random single-digit number

            while (true) {
                // Prompt the user for the answer to the problem, unless -1 is given
                System.out.printf("What is %d * %d? (Enter -1 to exit): ", num1, num2);
                int userAnswer = scanner.nextInt();

                if (userAnswer == -1) {
                    scanner.close();
                    return; // Exit the program if user enters -1
                }

                int correctAnswer = num1 * num2;
                if (userAnswer == correctAnswer) {
                    printCorrectMessage();
                    break; // Exit the inner loop to generate a new question
                } else {
                    printIncorrectMessage(); //prints incorrect message on screen
                }
            }
        }
    }
    // function for the correct answer. Provides a random messaage for correct answers
    public static void printCorrectMessage() {
        Random random = new Random();
        int messageNumber = random.nextInt(3); // Assuming there are 3 different correct messages

        switch (messageNumber) {
            case 0:
                System.out.println("Great job!");
                break;
            case 1:
                System.out.println("Correct!");
                break;
            case 2:
                System.out.println("Well done!");
                break;
        }
    }
    // Function for incorrect answers. Will provide a message prompting user to try again
    public static void printIncorrectMessage() {
        Random random = new Random();
        int messageNumber = random.nextInt(3); // Assuming there are 3 different incorrect messages

        switch (messageNumber) {
            case 0:
                System.out.println("Oops, that's not correct.");
                break;
            case 1:
                System.out.println("Try again.");
                break;
            case 2:
                System.out.println("Not quite, keep trying.");
                break;
        }
    }
}

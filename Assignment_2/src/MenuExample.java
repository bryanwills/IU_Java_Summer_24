import java.util.Scanner;

public class MenuExample{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean finished = false;

        System.out.print("Enter a password to use this program..");
        String password = input.next();

        while (!password.equalsIgnoreCase("Java")) {
            System.out.println("Invalid password -- Try again");
            password = input.next();
        }

        while(finished == false) {
        //Menu Display
        System.out.println("");
        System.out.println("Some Menu");
        System.out.println("=====================");
        System.out.println("1. Do Something 1");
        System.out.println("2. Do Something 2");
        System.out.println("3. Do Something 3");
        System.out.println("4. Do Something 4");
        System.out.println("5. Exit");
        System.out.println("");

        System.out.print("Please enter your choice (1-5): ");
        int userChoice = input.nextInt();

        switch (userChoice) {
            case 1:
            System.out.println("Choice 1");
            break;
            case 2:
            System.out.println("Choice 2");
            break;
            case 3:
            System.out.println("Choice 3");
            break;
            case 4:
            System.out.println("Choice 4");
            break;
            case 5:
            finished = true;
            break;
            default: System.out.println("Invalid input);");
            }
        }
    }
}
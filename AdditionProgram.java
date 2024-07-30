import java.util.Scanner; // Import the Scanner class for user input

public class AdditionProgram {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the first number
        System.out.print("Enter the first number: ");
        // Read the first number from the user
        double num1 = scanner.nextDouble();

        // Prompt the user to enter the second number
        System.out.print("Enter the second number: ");
        // Read the second number from the user
        double num2 = scanner.nextDouble();

        // Calculate the sum of the two numbers
        double sum = num1 + num2;

        // Display the result
        System.out.println("The sum of " + num1 + " and " + num2 + " is " + sum);

        // Close the scanner object to prevent resource leaks
        scanner.close();
    }
}

// Import the Scanner class for user input
import java.util.Scanner;

public class tempConv {
    // Main method where the program execution begins
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n"); // Print a blank line for spacing
        System.out.print("What is the temperature outside in Celsius: ");
        
        // Read a double value for temperature input in Celsius from the user
        double temp = scanner.nextDouble();
        System.out.println("Outside it is: " + temp + " °C");

        scanner.nextLine(); // Consume the newline character left by nextDouble()

        System.out.println("\n"); // Print another blank line for spacing
        System.out.print("In what format do you want to have your temp,please type in celsius or fahrenheit to continue: ");
        
        // Read a String value for the desired temperature unit from the user
        String unit = scanner.nextLine();

        // Use a switch statement to determine the selected unit
        switch (unit) {
            case "celsius":
                // If user selected celsius, inform them that the unit is unchanged
                System.out.println("This is the normal unit, so the unit is the same.");
                System.out.println("It's " + temp + " °C outside");
                break;

            case "fahrenheit":
                // If user selected fahrenheit, convert Celsius to Fahrenheit
                double unit_convert = (temp * 1.8) + 32;
                System.out.println("In Fahrenheit, it's: " + unit_convert + " °F outside");
                System.out.println("Thank you for using this program.");
                break;

            default:
                // If the user entered an invalid option, display an error message
                System.out.println("Invalid input. Please type 'farenheit' or 'celsius' to continue.");
        }

        // Close the scanner to free up resources
        scanner.close();
    }
}

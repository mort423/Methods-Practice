import java.util.Scanner;
import java.util.Random;

public class ScannerLoopPractice {
    // We create one Scanner object to use throughout the program
    private static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        System.out.println("Welcome to Scanner and Loop Practice!");
        System.out.println("------------------------------------");
        
        // Menu system to run different exercises
        while (true) {
            System.out.println("\nChoose an exercise to run:");
            System.out.println("1. Scanner Practice");
            System.out.println("2. Name Greeter");
            System.out.println("3. Countdown Timer");
            System.out.println("4. Age Calculator");
            System.out.println("5. Number Guessing Game");
            System.out.println("6. Temperature Converter");
            System.out.println("0. Exit");
            
            System.out.print("\nEnter your choice (0-6): ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Clear buffer
            
            if (choice == 0) {
                break;
            }
            
            // Run the selected exercise
            switch (choice) {
                case 1:
                    practiceScanner();
                    break;
                case 2:
                    nameGreeter();
                    break;
                case 3:
                    countdownTimer();
                    break;
                case 4:
                    ageCalculator();
                    break;
                case 5:
                    numberGuessing();
                    break;
                case 6:
                    temperatureConverter();
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
        
        System.out.println("Thanks for practicing! Goodbye!");
        scanner.close();
    }
    
    // Exercise 1: Practice using Scanner
    private static void practiceScanner() {
        System.out.println("\n=== Scanner Practice ===");
        System.out.println("TODO: Your code here!");
        // TODO: Add your code to:
        // 1. Print a message asking for input
        // 2. Use scanner to read the input
        // 3. Print the input back to the user
    }
    
    // Exercise 2: Name and Color Greeter
    private static void nameGreeter() {
        System.out.println("\n=== Name Greeter ===");
        System.out.println("TODO: Your code here!");
        // TODO: Add your code to:
        // 1. Ask for the user's name
        // 2. Ask for their favorite color
        // 3. Print a greeting using both pieces of information
    }
    
    // Exercise 3: Countdown Timer
    private static void countdownTimer() {
        System.out.println("\n=== Countdown Timer ===");
        System.out.println("TODO: Your code here!");
        // TODO: Add your code to:
        // 1. Ask for a starting number
        // 2. Count down from that number to 1
        // 3. Print "Blast off!" at the end
    }
    
    // Exercise 4: Age Calculator with Repeat Option
    private static void ageCalculator() {
        System.out.println("\n=== Age Calculator ===");
        System.out.println("TODO: Your code here!");
        // TODO: Add your code to:
        // 1. Ask for current age
        // 2. Ask for years to add
        // 3. Calculate and print future age
        // 4. Ask if they want to calculate again
        // 5. Repeat if they say yes
        // Remember to clear the scanner buffer after reading numbers!
    }
    
    // Exercise 5: Number Guessing Game with Input Validation
    private static void numberGuessing() {
        System.out.println("\n=== Number Guessing Game ===");
        Random random = new Random();
        int targetNumber = random.nextInt(100) + 1; // Random number between 1 and 100
        
        System.out.println("TODO: Your code here!");
        // TODO: Add your code to:
        // 1. Ask the user to guess a number
        // 2. Tell them if their guess is too high or too low
        // 3. Keep asking until they guess correctly
        // 4. Validate that they enter a valid number
    }
    
    // Exercise 6: Temperature Converter
    private static void temperatureConverter() {
        System.out.println("\n=== Temperature Converter ===");
        System.out.println("TODO: Your code here!");
        // TODO: Add your code to:
        // 1. Show menu (C to F, F to C, Quit)
        // 2. Get user's choice
        // 3. Get temperature value
        // 4. Perform conversion
        // 5. Display result
        // 6. Repeat until user quits
        // Remember to validate all input!
    }
    
    // Helper method for temperature conversions
    private static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }
    
    private static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }
    
    // Helper method for input validation
    private static int getValidIntInput(String prompt, String errorMessage) {
        while (true) {
            System.out.print(prompt);
            if (scanner.hasNextInt()) {
                int input = scanner.nextInt();
                scanner.nextLine(); // Clear buffer
                return input;
            } else {
                System.out.println(errorMessage);
                scanner.nextLine(); // Clear invalid input
            }
        }
    }
}
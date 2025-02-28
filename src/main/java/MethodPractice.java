public class MethodPractice {
    public static void main(String[] args) {
        // This main method will test all your implementations
        System.out.println("=== TESTING RETURN TYPES ===");
        System.out.println("Rectangle area (4x5): " + calculateRectangleArea(4, 5));
        //System.out.println("Triangle area (6x3): " + calculateTriangleArea(6, 3));
        System.out.println();

        System.out.println("=== TESTING PARAMETERS ===");
        System.out.println("Full name: " + formatFullName("Jane", "Doe"));
        System.out.println("Grade for 85: " + calculateLetterGrade(85));
        System.out.println();

        System.out.println("=== TESTING PRIMITIVE VS REFERENCE TYPES ===");
        testPrimitiveVsReference();
        System.out.println();

        System.out.println("=== TESTING STATIC METHODS ===");
        System.out.println("Circle area (radius 3): " + calculateCircleArea(3));
        System.out.println();

        System.out.println("=== TESTING RETURN VALUE CAPTURE ===");
        testCapturingReturnValues();
        System.out.println();

        System.out.println("=== TESTING ALL PATHS RETURN ===");
        //System.out.println("Max of 10 and 20: " + findMax(10, 20));
        //System.out.println("Grade for 75: " + getLetterGrade(75));
        System.out.println();

        System.out.println("=== TESTING VARIABLE SCOPE ===");
        testVariableScope();
        scopeExample();
        System.out.println();

        System.out.println("=== TESTING PASS BY VALUE ===");
        testPassByValue();
        System.out.println();

        System.out.println("=== FINAL EXERCISE ===");
        testFinalExercise();
    }

    // === EXERCISE 1: RETURN TYPES ===
    
    // TODO: Complete this method to return the area of a rectangle
    public static double calculateRectangleArea(double length, double width) {
        // Your code here
        return 0.0; // placeholder return
    }

    // TODO: Create a method to calculate the area of a triangle
    // public static double calculateTriangleArea(double base, double height) {
    //    // Your code here
    // }

    // === EXERCISE 2: PARAMETER TYPES ===
    
    // TODO: Complete this method to combine first and last name
    public static String formatFullName(String firstName, String lastName) {
        // Your code here
        return ""; // placeholder return
    }

    // TODO: Complete this method to return a letter grade based on score
    public static String calculateLetterGrade(int score) {
        // Your code here
        return ""; // placeholder return
    }

    // === EXERCISE 3: PRIMITIVE VS REFERENCE TYPES ===
    
    // TODO: Complete this method that tries to double a primitive value
    public static void tryToDoubleValue(int value) {
        // Your code here
    }

    // TODO: Complete this method to double all values in an array
    public static void doubleArrayValues(int[] values) {
        // Your code here
    }

    // This method tests your implementations
    public static void testPrimitiveVsReference() {
        // Test primitive parameter
        int number = 5;
        System.out.println("Before tryToDoubleValue: " + number);
        tryToDoubleValue(number);
        System.out.println("After tryToDoubleValue: " + number);
        
        // Test reference parameter
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.print("Before doubleArrayValues: ");
        printArray(numbers);
        doubleArrayValues(numbers);
        System.out.print("After doubleArrayValues: ");
        printArray(numbers);
    }
    
    // Helper method to print an array
    public static void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
    
    // === EXERCISE 4: STATIC KEYWORD ===
    
    // TODO: Complete this method to calculate the area of a circle
    public static double calculateCircleArea(double radius) {
        // Your code here
        return 0.0; // placeholder return
    }
    
    // === EXERCISE 5: CAPTURING RETURN VALUES ===
    
    // TODO: Complete this method to calculate a number raised to a power
    public static double power(double base, int exponent) {
        // Your code here
        return 0.0; // placeholder return
    }
    
    // TODO: Complete this method to demonstrate the three ways to capture return values
    public static void testCapturingReturnValues() {
        // 1. Store in a variable
        // Your code here
        
        // 2. Use in an expression
        // Your code here
        
        // 3. Pass to another method
        // Your code here
    }
    
    // Helper method for demonstrating return value capturing
    public static void displayResult(double value) {
        System.out.println("The result is: " + value);
    }
    
    // === EXERCISE 6: ALL PATHS MUST RETURN Remove the MultiLine Comments when you get here ===
    /* 
    // TODO: Fix this method to return the larger of two numbers
    public static int findMax(int a, int b) {
        if (a > b) {
            return a;
        }
        // Missing code here - causes a compiler error!
    }
    
    // TODO: Complete this method to return a letter grade, ensuring all paths return a value
    public static String getLetterGrade(int score) {
        if (score >= 90) {
            return "A";
        }
        if (score >= 80) {
            return "B";
        }
        // Your code here
        
        // Make sure all paths return a value!
    }

    */
    
    // === EXERCISE 7: VARIABLE SCOPE ===
    
    // TODO: Complete this method to demonstrate variable scope
    public static void testVariableScope() {
        // Declare a variable in this scope
        
        // Create an if block and declare a variable inside it
        
        // Try to print a variable from another scope
        
        // Your code here
    }
    
    // TODO: Fix this method that has a scope error
    public static void scopeExample() {
        if (true) {
            int x = 10;
        }
        
        // This line has an error because x is not in scope
        // System.out.println(x);
        
        // Your fix here
    }
    
    // === EXERCISE 8: PASS BY VALUE ===
    
    // TODO: Complete this method to demonstrate pass-by-value semantics
    public static void testPassByValue() {
        // Test with primitive types
        int a = 5;
        int b = 10;
        System.out.println("Before swap: a = " + a + ", b = " + b);
        swapValues(a, b);
        System.out.println("After attempted swap: a = " + a + ", b = " + b);
        
        // Test with an array
        int[] arr = {1, 2, 3, 4, 5};
        System.out.print("Before reverse: ");
        printArray(arr);
        reverseArray(arr);
        System.out.print("After reverse: ");
        printArray(arr);
    }
    
    // TODO: Implement this method that attempts to swap two integer values
    public static void swapValues(int a, int b) {
        // Your code here
    }
    
    // TODO: Implement this method to reverse the contents of an array
    public static void reverseArray(int[] arr) {
        // Your code here
    }
    
    // === FINAL EXERCISE ===
    
    // TODO: Implement a method to calculate the average of an array of integers
    public static double calculateAverage(int[] numbers) {
        // Your code here
        return 0.0; // placeholder return
    }
    
    // TODO: Implement a method to remove all vowels from a string
    public static String removeVowels(String input) {
        // Your code here
        return ""; // placeholder return
    }
    
    // This method tests your final exercise implementations
    public static void testFinalExercise() {
        // Test calculateAverage
        int[] testScores = {78, 85, 90, 72, 88};
        System.out.println("Average of test scores: " + calculateAverage(testScores));
        
        // Test removeVowels
        String original = "Hello Java Programming";
        String noVowels = removeVowels(original);
        System.out.println("Original: " + original);
        System.out.println("Without vowels: " + noVowels);
    }

}

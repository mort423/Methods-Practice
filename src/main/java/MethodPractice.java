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

        double area = length * width;

        return area; // placeholder return
    }

    public static double calculateTriangleArea(double base, double hight) {
        // Your code here

        double area = 0.5 * base * hight;

        return area; // placeholder return
    }

    // === EXERCISE 2: PARAMETER TYPES ===
    
    // TODO: Complete this method to combine first and last name
    public static String formatFullName(String firstName, String lastName) {
        // Your code here

        String fullname = firstName + lastName;

        return fullname; // placeholder return
    }

    // TODO: Complete this method to return a letter grade based on score
    public static String calculateLetterGrade(int score) {
        // Your code here

        String i = "";

        if(score <= 100 && score >= 90){
            i = "A";
        }
        else if(score <= 89 && score >= 80){
            i = "B";
        }
        else if(score <= 79 && score >= 70){
            i = "C";
        }
        else if(score <= 69 && score >= 60){
            i = "D";
        }
        else{
            i = "F";
        }

        return i; 
    }

     // === EXERCISE 3: PRIMITIVE VS REFERENCE TYPES ===
    
    // TODO: Complete this method that tries to double a primitive value
    public static void tryToDoubleValue(int value) {
        // Your code here
        value = value * 2;
        System.out.println("Inside tryToDoubleValue: " + value);
    }

    // TODO: Complete this method to double all values in an array
    public static void doubleArrayValues(int[] values) {

        for (int i = 0; i < values.length; i++) {
            values[i] = values[i] * 2;
        }

        int[] arr = values;

        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

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

        return Math.PI * (radius * 2);
    }
    
    // === EXERCISE 5: CAPTURING RETURN VALUES ===
    
    // TODO: Complete this method to calculate a number raised to a power
    public static double power(double base, int exponent) {
        // Your code here
        return Math.pow(base, exponent);
    }
    
    // TODO: Complete this method to demonstrate the three ways to capture return values
    public static void testCapturingReturnValues() {
        // 1. Store in a variable
        // Your code here
        double result = power(2, 3);
        System.out.println("Stored: " + result);

        
        // 2. Use in an expression
        // Your code here
         System.out.println("expression: " + (power(3, 2) + 10));
        
        // 3. Pass to another method
        // Your code here
        printResult(power(4, 2));
    }
    
    // Helper method for demonstrating return value capturing
    public static void displayResult(double value) {
        System.out.println("The result is: " + value);
    }
    
    // === EXERCISE 6: ALL PATHS MUST RETURN Remove the MultiLine Comments when you get here ===
    
    // TODO: Fix this method to return the larger of two numbers
    public static int findMax(int a, int b) {
        if (a > b) {
            return a;

        } else { 
            return b;  
        }
        
    }

    public static void printResult(double value) {
        System.out.println("Result: " + value);
    }
    
    // TODO: Complete this method to return a letter grade, ensuring all paths return a value
    public static String getLetterGrade(int score) {
        if (score >= 90) {
            return "A";
        } 
        if (score >= 80) {
            return "B";
        } 
        if (score >= 70) {
            return "C";
        } 
        if (score >= 60) {
            return "D";
        } 
        return "F";

    }

    
    
    // === EXERCISE 7: VARIABLE SCOPE ===
    
    // TODO: Complete this method to demonstrate variable scope
    public static void testVariableScope() {
        int x = 10;

        System.out.println("x in method scope: " + x);

        if (x > 5) {
            int y = 20;
            System.out.println("y inside if block: " + y);
        }
    }
    
    // TODO: Fix this method that has a scope error
    public static void scopeExample() {
        int x; 
    
        if (true) {
            x = 10;
        }
        
        System.out.println(x);
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
        
        int[] arr = {1, 2, 3, 4, 5};
        System.out.print("Before reverse: ");
        printArray(arr);
        reverseArray(arr);
        System.out.print("After reverse: ");
        printArray(arr);
    }
    
    // TODO: Implement this method that attempts to swap two integer values
    public static void swapValues(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println("Inside swapValues: a = " + a + ", b = " + b);
    }
    
    // TODO: Implement this method to reverse the contents of an array
    public static void reverseArray(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
    }
    
    // === FINAL EXERCISE ===
    
    // TODO: Implement a method to calculate the average of an array of integers
    public static double calculateAverage(int[] numbers) {
        if (numbers.length == 0) {
            return 0.0; 
        }

        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }

        return (double) sum / numbers.length;
    }
    
    // TODO: Implement a method to remove all vowels from a string
    public static String removeVowels(String input) {
        // Your code here
         return input.replaceAll("[aeiouAEIOU]", "");
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

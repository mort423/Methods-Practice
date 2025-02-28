# Java Functions Practice Exercises

This repository contains materials for learning Java functions, targeted at students with prior Python experience. The exercises are designed for a Grade 12 Computer Science class.

## Repository Contents

- **Java_Functions_Guide.md**: A comprehensive guide explaining Java function concepts with examples
- **FunctionPractice.java**: A practice file with exercises for each concept

## How to Use This Repository

1. Clone or download this repository to your local machine
2. Open the `Java_Functions_Guide` file and start reading from the beginning
3. As you encounter practice exercises in the guide, open the `MethodPractice.java` file and complete the corresponding exercises
4. Compile and run the Java file to test your implementations

## Working with Commented Code

Some sections of code in `FunctionPractice.java` are commented out to allow you to run the program without errors while you're still learning the concepts. In particular:

- The methods related to "All Paths Must Return" (Exercise 6) are commented out with multi-line comments (`/* */`)
- The corresponding function calls in the main method are commented out with single-line comments (`//`)

### When to Uncomment the Code

When you reach the "All Paths Must Return" section in the guide:

1. Remove the multi-line comments (`/* */`) around the `findMax` and `getLetterGrade` methods
2. Remove the single-line comments (`//`) before the function calls in the main method:
   ```java
   // System.out.println("Max of 10 and 20: " + findMax(10, 20));
   // System.out.println("Grade for 75: " + getLetterGrade(75));
   ```
3. Complete the methods as instructed in the guide
4. Run the program to test your implementations

## Tips for Success

- Complete each exercise in order, as later exercises build on concepts from earlier ones
- Make sure you understand each concept before moving on to the next
- Test your code after each implementation to ensure it works correctly
- If you get stuck, review the explanations and examples in the guide

## Extending Your Learning

After completing these exercises, challenge yourself by:

1. Creating your own functions that combine multiple concepts
2. Refactoring some of the existing methods to make them more efficient
3. Adding error handling to the methods (we'll cover this in more detail in future lessons)

## Troubleshooting

If you encounter compilation errors:

1. Check that you've properly implemented all required methods
2. Ensure all methods with return types actually return values of the correct type
3. Verify that you've uncommented code sections at the appropriate time
4. Check for typos or syntax errors

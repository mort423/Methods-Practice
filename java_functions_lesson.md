# Java Functions: From Python to Java

## Introduction
If you're coming from Python, you'll find that Java functions (called "methods" in Java) follow similar concepts but with stricter rules. This guide will help you understand the key differences and how to write effective Java methods.

For each topic, you'll find both explanations and practice exercises. Open the accompanying `FunctionPractice.java` file to complete the exercises as you work through this guide.

## 1. Return Types and the Void Return

In Python, you don't have to declare the type of value a function returns. In Java, you must specify the return type before the method name.

```java
// This method returns an integer
public static int add(int a, int b) {
    return a + b;
}

// This method returns a String
public static String greeting(String name) {
    return "Hello, " + name + "!";
}

// This method doesn't return anything (void)
public static void printMessage(String message) {
    System.out.println(message);
    // No return statement needed
}
```

If a method has a return type other than `void`, it MUST return a value of that type.

### Practice Exercise 1
In the `FunctionPractice.java` file, complete the `calculateRectangleArea` method to return the area of a rectangle. Then create a new method called `calculateTriangleArea` that takes the base and height of a triangle and returns its area (0.5 × base × height).

## 2. Parameters and Parameter Types

In Java, you must specify the type of each parameter:

```java
// Python:
// def calculate_area(width, height):
//     return width * height

// Java:
public static double calculateArea(double width, double height) {
    return width * height;
}
```

You can have multiple parameters of different types:

```java
public static void displayStudentInfo(String name, int age, double gpa) {
    System.out.println("Name: " + name);
    System.out.println("Age: " + age);
    System.out.println("GPA: " + gpa);
}
```

### Practice Exercise 2
In the `FunctionPractice.java` file, complete the `formatFullName` method that takes two String parameters (firstName and lastName) and returns them combined with a space in between. Then implement the `calculateLetterGrade` method that takes a numerical score (int) and returns the letter grade (String) according to the following scale:
- 90-100: "A"
- 80-89: "B"
- 70-79: "C"
- 60-69: "D"
- Below 60: "F"

## 3. Primitive vs Reference Types

Java has two categories of data types:

### Primitive Types
These are basic data types: `int`, `double`, `boolean`, `char`, etc.

When primitives are passed to methods, Java creates a copy of the value. Changes to the parameter inside the method don't affect the original variable.

```java
public static void incrementNumber(int number) {
    number = number + 1;  // This only changes the local copy
    System.out.println("Inside method: number = " + number);
}

public static void main(String[] args) {
    int x = 5;
    System.out.println("Before method call: x = " + x);
    incrementNumber(x);
    System.out.println("After method call: x = " + x);  // Still 5!
}
```

Output:
```
Before method call: x = 5
Inside method: number = 6
After method call: x = 5
```

### Reference Types
These include arrays, Strings, and objects. When you pass these to methods, Java passes a copy of the reference (like a memory address).

This means the method can modify the contents of the original data structure:

```java
public static void modifyArray(int[] numbers) {
    numbers[0] = 99;  // This changes the original array
    System.out.println("Inside method: numbers[0] = " + numbers[0]);
}

public static void main(String[] args) {
    int[] scores = {75, 80, 85};
    System.out.println("Before method call: scores[0] = " + scores[0]);
    modifyArray(scores);
    System.out.println("After method call: scores[0] = " + scores[0]);  // Now 99!
}
```

Output:
```
Before method call: scores[0] = 75
Inside method: numbers[0] = 99
After method call: scores[0] = 99
```

### Practice Exercise 3
In the `FunctionPractice.java` file:
1. Complete the `tryToDoubleValue` method that takes an int parameter and attempts to double it.
2. Complete the `doubleArrayValues` method that takes an array of integers and doubles each value in the array.
3. Run the `testPrimitiveVsReference` method to see how these different parameter types behave.

## 4. The Static Keyword

The `static` keyword means the method belongs to the class itself, not to instances of the class. For now, you can think of it as making the method globally accessible.

```java
public class MathUtils {
    // Static method - can be called without creating an object
    public static double calculateCircleArea(double radius) {
        return Math.PI * radius * radius;
    }
}

// In another class:
double area = MathUtils.calculateCircleArea(5.0);
```

When you're first learning Java, you'll use `static` for most methods, especially the `main` method:

```java
public static void main(String[] args) {
    // This is where your program starts executing
}
```

### Practice Exercise 4
In the `FunctionPractice.java` file, implement the static method `calculateCircleArea` that takes a radius as a parameter and returns the area of a circle (π × r²). Use the constant `Math.PI` for the value of π.

## 5. Capturing Return Values

When a method returns a value, you must do something with it:

```java
public static int square(int num) {
    return num * num;
}

public static void main(String[] args) {
    // Option 1: Store the return value in a variable
    int result = square(5);
    System.out.println("5 squared is: " + result);
    
    // Option 2: Use the return value directly in another expression
    System.out.println("4 squared is: " + square(4));
    
    // Option 3: Pass the return value to another method
    printNumber(square(3));
}

public static void printNumber(int num) {
    System.out.println("The number is: " + num);
}
```

### Practice Exercise 5
In the `FunctionPractice.java` file:
1. Implement the `power` method that takes a base and exponent and returns the base raised to the power of the exponent.
2. Complete the `testCapturingReturnValues` method to demonstrate the three ways of capturing return values (storing in a variable, using in an expression, and passing to another method).

## 6. All Paths Must Return a Value Error

If your method has a return type other than `void`, Java requires that every possible execution path returns a value of the appropriate type.

```java
// This will cause a compiler error
public static int getAbsoluteValue(int num) {
    if (num < 0) {
        return -num; // Return for negative case
    }
    // Missing return for positive case!
}

// Fixed version:
public static int getAbsoluteValue(int num) {
    if (num < 0) {
        return -num; // Return for negative case
    } else {
        return num;  // Return for positive/zero case
    }
}

// Alternative fix:
public static int getAbsoluteValue(int num) {
    if (num < 0) {
        return -num;
    }
    return num;  // This ensures all paths return a value
}
```

### Practice Exercise 6
In the `FunctionPractice.java` file:
1. Fix the `findMax` method that should return the larger of two numbers but currently has a compiler error.
2. Complete the `getLetterGrade` method that returns a letter grade based on a score, ensuring all possible paths return a value.

## 7. Variable Scope

Variables declared inside a method are only accessible within that method. This is called "local scope."

```java
public static void main(String[] args) {
    int x = 10;  // Variable x is available in main
    
    if (x > 5) {
        int y = 20;  // Variable y is only available in this if block
        System.out.println(x + y);  // Works fine
    }
    
    // System.out.println(y);  // Error! y is not accessible here
    
    exampleMethod();  // Call another method
    // System.out.println(z);  // Error! z from exampleMethod isn't accessible
}

public static void exampleMethod() {
    int z = 30;  // Variable z is only available in exampleMethod
    System.out.println(z);
    
    // System.out.println(x);  // Error! x from main isn't accessible here
}
```

Each method creates its own "bubble" of variables that other methods can't see.

### Scope and Shadowing

You can have variables with the same name in different scopes, but this can be confusing:

```java
public static void main(String[] args) {
    int value = 10;
    System.out.println("In main, value = " + value);  // 10
    
    if (value > 5) {
        int value = 20;  // This creates a new variable that "shadows" the outer one
        // This will cause a compiler error in Java!
        System.out.println("In if block, value = " + value);  // Would be 20
    }
    
    System.out.println("In main again, value = " + value);  // 10
}
```

Java won't allow this "shadowing" in the same method, but it will between methods:

```java
public static void main(String[] args) {
    int value = 10;
    System.out.println("In main, value = " + value);  // 10
    
    changeValue(value);
    
    System.out.println("Back in main, value = " + value);  // Still 10
}

public static void changeValue(int value) {
    // This is a different variable that happens to have the same name
    value = 20;
    System.out.println("In changeValue, value = " + value);  // 20
}
```

### Practice Exercise 7
In the `FunctionPractice.java` file:
1. Complete the `testVariableScope` method that demonstrates how variables in different scopes behave.
2. Fix the `scopeExample` method that currently has a scope-related error.

## 8. Pass-by-Value Semantics

Java is strictly pass-by-value, which means:

1. For primitives (int, double, etc.), Java passes a copy of the actual value
2. For objects (arrays, Strings, etc.), Java passes a copy of the reference (memory address)

### Example with Primitives:

```java
public static void tryToModify(int x, double y) {
    x = 100;
    y = 200.5;
    System.out.println("Inside method: x = " + x + ", y = " + y);
}

public static void main(String[] args) {
    int a = 5;
    double b = 10.5;
    
    System.out.println("Before: a = " + a + ", b = " + b);
    tryToModify(a, b);
    System.out.println("After: a = " + a + ", b = " + b);  // Values unchanged!
}
```

Output:
```
Before: a = 5, b = 10.5
Inside method: x = 100, y = 200.5
After: a = 5, b = 10.5
```

### Example with References:

```java
public static void modifyArray(int[] arr) {
    // This modifies the contents of the array
    arr[0] = 999;
    
    // This only replaces the local reference, not the original variable
    arr = new int[]{1, 2, 3, 4};
    System.out.println("Inside method: arr[0] = " + arr[0]);
}

public static void main(String[] args) {
    int[] numbers = {10, 20, 30};
    
    System.out.println("Before: numbers[0] = " + numbers[0]);
    modifyArray(numbers);
    System.out.println("After: numbers[0] = " + numbers[0]);
}
```

Output:
```
Before: numbers[0] = 10
Inside method: arr[0] = 1
After: numbers[0] = 999
```

Notice that we changed the first element to 999, and that change persisted. But when we created a whole new array inside the method, that change did NOT affect the original array variable.

### Practice Exercise 8
In the `FunctionPractice.java` file:
1. Complete the `testPassByValue` method to demonstrate how primitives and references behave differently when passed to methods.
2. Implement the `swapValues` method that attempts to swap two integer values.
3. Implement the `reverseArray` method that successfully reverses the contents of an array.

## Summary of Key Differences from Python

1. Java requires explicit return types for methods.
2. Parameters must have declared types.
3. Variables have strict scope (where they can be accessed).
4. Java is pass-by-value (copies values or references).
5. Methods with non-void return types MUST return values in all possible execution paths.

### Final Practice Exercise

Now that you've learned all the key concepts, complete the final exercise in the `FunctionPractice.java` file:

1. Implement the `calculateAverage` method that takes an array of integers and returns the average as a double.
2. Implement the `removeVowels` method that takes a String and returns the same String with all vowels removed.
3. Run the `testFinalExercise` method to see your implementations in action.

package Reflection.Basic_Level.Invoke_Private_Method;

import java.lang.reflect.Method;

public class InvokePrivateMethod {
    public static void main(String[] args) {
        try {
            // Create an instance of Calculator
            Calculator calculator = new Calculator();

            // Get the Method object for 'multiply'
            Method multiplyMethod = Calculator.class.getDeclaredMethod("multiply", int.class, int.class);

            // Allow access to the private method
            multiplyMethod.setAccessible(true);

            // Invoke the private method
            int result = (int) multiplyMethod.invoke(calculator, 5, 4);

            // Display the result
            System.out.println("Result of multiplication: " + result);

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

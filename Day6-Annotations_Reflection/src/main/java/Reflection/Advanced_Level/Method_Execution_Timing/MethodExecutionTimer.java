package Reflection.Advanced_Level.Method_Execution_Timing;

import java.lang.reflect.Method;

public class MethodExecutionTimer {
    public static void main(String[] args) {
        try {
            Class<?> clazz = Sample.class; // Get the class dynamically
            Object instance = clazz.getDeclaredConstructor().newInstance(); // Create an instance

            for (Method method : clazz.getDeclaredMethods()) {
                if (method.getParameterCount() == 0) { // Execute only parameterless methods
                    long startTime = System.nanoTime();

                    method.invoke(instance); // Invoke method dynamically

                    long endTime = System.nanoTime();
                    long executionTime = (endTime - startTime) / 1_000_000; // Convert to milliseconds
                    System.out.println("Method: " + method.getName() + " | Execution Time: " + executionTime + " ms");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
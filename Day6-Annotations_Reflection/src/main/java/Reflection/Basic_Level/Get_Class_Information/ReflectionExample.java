package Reflection.Basic_Level.Get_Class_Information;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Scanner;

public class ReflectionExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the class name (e.g., java.util.ArrayList): ");
        String className = scanner.nextLine();
        scanner.close();

        try {
            // Load the class dynamically
            Class<?> clazz = Class.forName(className);

            // Display class name
            System.out.println("\nClass Name: " + clazz.getName());

            // Get and display methods
            System.out.println("\nMethods:");
            for (Method method : clazz.getDeclaredMethods()) {
                System.out.println("  " + method);
            }

            // Get and display fields
            System.out.println("\nFields:");
            for (Field field : clazz.getDeclaredFields()) {
                System.out.println("  " + field);
            }

            // Get and display constructors
            System.out.println("\nConstructors:");
            for (Constructor<?> constructor : clazz.getConstructors()) {
                System.out.println("  " + constructor);
            }

        } catch (ClassNotFoundException e) {
            System.out.println("Error: Class not found!");
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}

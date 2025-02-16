package Reflection.Basic_Level.Dynamically_Create_Objects;

public class DynamicObjectCreation {
    public static void main(String[] args) {
        try {
            // Load Student class dynamically
            Class<?> studentClass = Class.forName("Student");

            // Create an instance dynamically
            Object studentObj = studentClass.getDeclaredConstructor().newInstance();

            // Invoke display() method using Reflection
            studentClass.getMethod("display").invoke(studentObj);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

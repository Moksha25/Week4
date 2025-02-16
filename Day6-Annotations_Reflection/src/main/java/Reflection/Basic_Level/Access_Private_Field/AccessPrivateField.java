package Reflection.Basic_Level.Access_Private_Field;

import java.lang.reflect.Field;

public class AccessPrivateField {
    public static void main(String[] args) {
        try {
            // Create a Person object
            Person person = new Person(25);
            System.out.println("Original Age: " + person.getAge());

            // Get the Field object for 'age'
            Field ageField = Person.class.getDeclaredField("age");

            // Allow access to the private field
            ageField.setAccessible(true);

            // Modify the private field 'age'
            ageField.set(person, 30);

            // Retrieve the updated value
            System.out.println("Updated Age: " + person.getAge());

        } catch (NoSuchFieldException | IllegalAccessException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

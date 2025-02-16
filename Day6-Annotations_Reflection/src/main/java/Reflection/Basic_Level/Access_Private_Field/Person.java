package Reflection.Basic_Level.Access_Private_Field;

public class Person {
    private int age;

    // Constructor
    public Person(int age) {
        this.age = age;
    }

    // Getter method for verification
    public int getAge() {
        return age;
    }
}

package Reflection.Basic_Level.Dynamically_Create_Objects;

public class Student {
    private String name;

    // Constructor
    public Student() {
        this.name = "Default Student";
    }

    // Method to display student info
    public void display() {
        System.out.println("Student Name: " + name);
    }
}

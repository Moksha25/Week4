package Annotation.Intermediate_Level.Create_MaxLength_Annotation_for_Field_Validation;

public class Main
{
    public static void main(String[] args) {
        try {
            User validUser = new User("JohnDoe");
            System.out.println("Valid Username: " + validUser.getUsername());

            // This should throw an exception
            User invalidUser = new User("SuperLongUsername");
            System.out.println("Invalid Username: " + invalidUser.getUsername());

        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

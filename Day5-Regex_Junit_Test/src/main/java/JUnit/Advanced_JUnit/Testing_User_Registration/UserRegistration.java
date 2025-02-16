package JUnit.Advanced_JUnit.Testing_User_Registration;

import java.util.regex.Pattern;

public class UserRegistration
{
    public static void registerUser(String username, String email, String password) {
        if (!isValidUsername(username)) {
            throw new IllegalArgumentException("Invalid username. Must be 5-15 characters and contain only letters, numbers, and underscores.");
        }
        if (!isValidEmail(email)) {
            throw new IllegalArgumentException("Invalid email format.");
        }
        if (!isValidPassword(password)) {
            throw new IllegalArgumentException("Invalid password. Must be at least 8 characters, with one uppercase letter and one digit.");
        }
        System.out.println("User registered successfully: " + username);
    }

    private static boolean isValidUsername(String username) {
        return username.matches("^[a-zA-Z][a-zA-Z0-9_]{4,14}$");
    }

    private static boolean isValidEmail(String email) {
        return Pattern.matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$", email);
    }

    private static boolean isValidPassword(String password) {
        return password.matches("^(?=.*[A-Z])(?=.*\\d).{8,}$");
    }
}

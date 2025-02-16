package JUnit.Advanced_JUnit.Testing_User_Registration;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class UserRegistrationTest
{
    @Test
    void testValidUserRegistration() {
        assertDoesNotThrow(() -> UserRegistration.registerUser("John_Doe", "john@example.com", "Password1"));
        assertDoesNotThrow(() -> UserRegistration.registerUser("User123", "user123@test.org", "StrongPass9"));
    }

    @Test
    void testInvalidUsername() {
        assertThrows(IllegalArgumentException.class, () -> UserRegistration.registerUser("123User", "valid@example.com", "Password1"));
        assertThrows(IllegalArgumentException.class, () -> UserRegistration.registerUser("Us", "valid@example.com", "Password1"));
        assertThrows(IllegalArgumentException.class, () -> UserRegistration.registerUser("TooLongUsername12345", "valid@example.com", "Password1"));
    }

    @Test
    void testInvalidEmail() {
        assertThrows(IllegalArgumentException.class, () -> UserRegistration.registerUser("ValidUser", "invalid-email", "Password1"));
        assertThrows(IllegalArgumentException.class, () -> UserRegistration.registerUser("ValidUser", "user@domain", "Password1"));
        assertThrows(IllegalArgumentException.class, () -> UserRegistration.registerUser("ValidUser", "user@.com", "Password1"));
    }

    @Test
    void testInvalidPassword() {
        assertThrows(IllegalArgumentException.class, () -> UserRegistration.registerUser("ValidUser", "valid@example.com", "short1"));
        assertThrows(IllegalArgumentException.class, () -> UserRegistration.registerUser("ValidUser", "valid@example.com", "nouppercase1"));
        assertThrows(IllegalArgumentException.class, () -> UserRegistration.registerUser("ValidUser", "valid@example.com", "NOLOWERCASE1"));
    }
}

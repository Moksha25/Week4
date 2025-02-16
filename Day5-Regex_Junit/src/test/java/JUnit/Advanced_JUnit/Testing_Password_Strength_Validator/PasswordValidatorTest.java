package JUnit.Advanced_JUnit.Testing_Password_Strength_Validator;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PasswordValidatorTest
{
    @Test
    void testValidPassword() {
        assertTrue(PasswordValidator.isValidPassword("StrongP@ss1"), "Valid password should pass");
    }

    @Test
    void testTooShortPassword() {
        assertFalse(PasswordValidator.isValidPassword("Sh0rt"), "Password with less than 8 characters should fail");
    }

    @Test
    void testNoUppercaseLetter() {
        assertFalse(PasswordValidator.isValidPassword("weakpassword1"), "Password without uppercase should fail");
    }

    @Test
    void testNoDigit() {
        assertFalse(PasswordValidator.isValidPassword("NoDigitHere!"), "Password without a digit should fail");
    }

    @Test
    void testNullPassword() {
        assertFalse(PasswordValidator.isValidPassword(null), "Null password should fail");
    }

    @Test
    void testEmptyPassword() {
        assertFalse(PasswordValidator.isValidPassword(""), "Empty password should fail");
    }
}

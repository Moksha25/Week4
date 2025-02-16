package JUnit.Advanced_JUnit.Testing_Password_Strength_Validator;

import java.util.regex.Pattern;

public class PasswordValidator
{
    private static final String PASSWORD_PATTERN = "^(?=.*[A-Z])(?=.*\\d).{8,}$";

    public static boolean isValidPassword(String password) {
        if (password == null) {
            return false;
        }
        return Pattern.matches(PASSWORD_PATTERN, password);
    }
}

package Basic_Regex_Problems.Validate_Username;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UsernameValidator
{
    public static boolean isValidUsername(String username)
    {
        String regex = "^[a-zA-Z][a-zA-Z0-9_]{4,14}$";
        return Pattern.matches(regex, username);
    }

    public static void main (String args[])
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter username : ");
        String username = scanner.nextLine();

        if (isValidUsername(username))
        {
            System.out.println("valid username.");
        }
        else
        {
            System.out.println("Invalid username.");
        }
    }
}

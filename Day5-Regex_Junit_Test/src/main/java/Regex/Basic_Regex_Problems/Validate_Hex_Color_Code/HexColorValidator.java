package Basic_Regex_Problems.Validate_Hex_Color_Code;

import java.util.Scanner;
import java.util.regex.Pattern;

public class HexColorValidator
{
    public static boolean isValidHexColor(String color)
    {
        String regex = "^#([A-Fa-f0-9]{6})$";
        return Pattern.matches(regex, color);
    }

    public static void main (String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter hex color : ");
        String color = sc.nextLine();

        if (isValidHexColor(color))
        {
            System.out.println("Valid hex color.");
        }
        else
        {
            System.out.println("Invalid hex color.");
        }
    }
}

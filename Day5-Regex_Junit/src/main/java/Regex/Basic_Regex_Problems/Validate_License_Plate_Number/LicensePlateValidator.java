package Basic_Regex_Problems.Validate_License_Plate_Number;

import java.util.Scanner;
import java.util.regex.Pattern;

public class LicensePlateValidator
{
    public static boolean isValidLicensePlate(String plate) {
        String regex = "^[A-Z]{2}\\d{4}$";
        return Pattern.matches(regex, plate);
    }

    public static void main (String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter plate number : ");
        String plate = sc.nextLine();

        if (isValidLicensePlate(plate))
        {
            System.out.println("Valid plate number.");
        }
        else
        {
            System.out.println("Invalid plate number.");
        }
    }
}

package Regex.Advanced_Problems.Validate_Social_Security_Number_SSN;

import java.util.Scanner;

public class SSNValidator
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an SSN: ");
        String ssn = sc.nextLine();

        String regex = "^\\d{3}-\\d{2}-\\d{4}$";

        if (ssn.matches(regex))
        {
            System.out.println(ssn + "\" is valid");
        }
        else
        {
            System.out.println( ssn + "\" is invalid");
        }
    }
}

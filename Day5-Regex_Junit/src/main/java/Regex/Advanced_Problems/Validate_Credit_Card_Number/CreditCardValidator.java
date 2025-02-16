package Regex.Advanced_Problems.Validate_Credit_Card_Number;

import java.util.Scanner;
import java.util.regex.Pattern;

public class CreditCardValidator
{
    private static final String VISA_REGEX = "^4\\d{15}$";
    private static final String MASTERCARD_REGEX = "^5[1-5]\\d{14}$";

    public static boolean isValidVisa(String cardNumber)
    {
        return Pattern.matches(VISA_REGEX, cardNumber);
    }

    public static boolean isValidMasterCard(String cardNumber)
    {
        return Pattern.matches(MASTERCARD_REGEX, cardNumber);
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a credit card number:");
        String cardNumber = sc.nextLine();

        if (isValidVisa(cardNumber))
        {
            System.out.println(cardNumber + " is a valid Visa card.");
        }
        else if (isValidMasterCard(cardNumber))
        {
            System.out.println(cardNumber + " is a valid MasterCard.");
        }
        else
        {
            System.out.println(cardNumber + " is not a valid Visa or MasterCard.");
        }
    }
}

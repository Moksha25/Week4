package Regex.Advanced_Problems.Validate_IP_Address;

import java.util.Scanner;
import java.util.regex.Pattern;

public class IPAddressValidator
{
    private static final String IP_REGEX =
            "^(25[0-5]|2[0-4][0-9]|1?[0-9][0-9]?)\\." +  // First octet (0-255)
                    "(25[0-5]|2[0-4][0-9]|1?[0-9][0-9]?)\\." +  // Second octet (0-255)
                    "(25[0-5]|2[0-4][0-9]|1?[0-9][0-9]?)\\." +  // Third octet (0-255)
                    "(25[0-5]|2[0-4][0-9]|1?[0-9][0-9]?)$";    // Fourth octet (0-255)

    private static final Pattern pattern = Pattern.compile(IP_REGEX);

    public static boolean isValidIPAddress(String ip)
    {
        return pattern.matcher(ip).matches();
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter an IP address:");
        String ip = sc.nextLine();

        if (isValidIPAddress(ip))
        {
            System.out.println(ip + " is a valid IPv4 address.");
        }
        else
        {
            System.out.println(ip + " is not a valid IPv4 address.");
        }
    }
}

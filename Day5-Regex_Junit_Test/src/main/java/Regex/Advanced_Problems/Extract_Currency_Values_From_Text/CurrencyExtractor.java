package Regex.Advanced_Problems.Extract_Currency_Values_From_Text;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CurrencyExtractor
{
    public static void main(String[] args)
    {
        String text = "The price is $45.99, and the discount is 10.50.";

        String regex = "\\$?\\d+\\.\\d{2}";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        List<String> currencyValues = new ArrayList<>();
        while (matcher.find())
        {
            currencyValues.add(matcher.group());
        }

        System.out.println("Extracted Currency Values: " + String.join(", ", currencyValues));
    }
}

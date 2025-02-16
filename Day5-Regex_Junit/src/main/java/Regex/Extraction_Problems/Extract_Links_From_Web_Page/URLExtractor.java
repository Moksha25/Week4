package Regex.Extraction_Problems.Extract_Links_From_Web_Page;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class URLExtractor
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String text = scanner.nextLine();

        String regex = "\\bhttps?://[a-zA-Z0-9.-]+\\.[a-z]{2,6}(/[a-zA-Z0-9@:%_+.~#?&/=]*)?\\b";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        ArrayList<String> urls = new ArrayList<>();

        while (matcher.find())
        {
            urls.add(matcher.group());
        }

        System.out.println("Extracted URLs: " + String.join(", ", urls));

        scanner.close();
    }
}

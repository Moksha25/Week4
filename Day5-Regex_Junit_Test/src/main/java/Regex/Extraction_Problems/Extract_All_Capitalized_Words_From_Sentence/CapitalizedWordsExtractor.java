package Regex.Extraction_Problems.Extract_All_Capitalized_Words_From_Sentence;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CapitalizedWordsExtractor
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String text = scanner.nextLine();

        String regex = "\\b[A-Z][a-z]*\\b";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        ArrayList<String> capitalizedWords = new ArrayList<>();

        while (matcher.find())
        {
            capitalizedWords.add(matcher.group());
        }

        System.out.println("Extracted Capitalized Words: " + String.join(", ", capitalizedWords));

        scanner.close();
    }
}

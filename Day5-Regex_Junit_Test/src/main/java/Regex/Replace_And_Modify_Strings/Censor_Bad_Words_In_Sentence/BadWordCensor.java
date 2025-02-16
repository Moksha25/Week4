package Regex.Replace_And_Modify_Strings.Censor_Bad_Words_In_Sentence;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class BadWordCensor
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        List<String> badWords = Arrays.asList("damn", "stupid");

        System.out.println("Enter a sentence:");
        String input = sc.nextLine();

        String censoredText = censorBadWords(input, badWords);

        System.out.println("Censored text:");
        System.out.println(censoredText);

        sc.close();
    }

    public static String censorBadWords(String text, List<String> badWords)
    {
        for (String word : badWords)
        {
            String regex = "\\b" + word + "\\b"; // Match whole words only
            text = text.replaceAll(regex, "****");
        }
        return text;
    }
}

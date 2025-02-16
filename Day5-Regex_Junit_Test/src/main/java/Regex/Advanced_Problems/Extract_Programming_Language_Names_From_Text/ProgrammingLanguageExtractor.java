package Regex.Advanced_Problems.Extract_Programming_Language_Names_From_Text;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ProgrammingLanguageExtractor
{
    public static void main(String[] args)
    {
        String text = "I love Java, Python, and JavaScript, but I haven't tried Go yet.";

        String regex = "\\b(JavaScript|Java|Python|C\\+\\+|C#|C|Ruby|Go|Swift|Kotlin|PHP|Rust|TypeScript)\\b";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        List<String> languages = new ArrayList<>();
        while (matcher.find())
        {
            languages.add(matcher.group());
        }

        System.out.println("Extracted Programming Languages: " + String.join(", ", languages));
    }
}

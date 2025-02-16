package Regex.Extraction_Problems.Extract_All_Capitalized_Words_From_Sentence;

import org.junit.jupiter.api.Test;
import java.util.regex.*;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;

public class CapitalizedWordsExtractorTest {

    public ArrayList<String> extractCapitalizedWords(String text)
    {
        String regex = "\\b[A-Z][a-z]*\\b";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        ArrayList<String> capitalizedWords = new ArrayList<>();
        while (matcher.find())
        {
            capitalizedWords.add(matcher.group());
        }
        return capitalizedWords;
    }

    @Test
    public void testExtractCapitalizedWords()
    {
        String text = "The Eiffel Tower is in Paris and the Statue of Liberty is in New York.";
        ArrayList<String> expectedWords = new ArrayList<>();
        expectedWords.add("Eiffel");
        expectedWords.add("Tower");
        expectedWords.add("Paris");
        expectedWords.add("Statue");
        expectedWords.add("Liberty");
        expectedWords.add("New");
        expectedWords.add("York");

        assertEquals(expectedWords, extractCapitalizedWords(text));
    }
}

package Regex.Extraction_Problems.Extract_Links_From_Web_Page;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class URLExtractorTest
{
    public ArrayList<String> extractURLs(String text)
    {
        String regex = "\\bhttps?://[a-zA-Z0-9.-]+\\.[a-z]{2,6}(/[a-zA-Z0-9@:%_+.~#?&/=]*)?\\b";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        ArrayList<String> urls = new ArrayList<>();
        while (matcher.find())
        {
            urls.add(matcher.group());
        }
        return urls;
    }

    @Test
    public void testValidURLs()
    {
        String text = "Visit https://www.google.com and http://example.org for more info.";
        ArrayList<String> expectedURLs = new ArrayList<>();
        expectedURLs.add("https://www.google.com");
        expectedURLs.add("http://example.org");

        assertEquals(expectedURLs, extractURLs(text));
    }
}

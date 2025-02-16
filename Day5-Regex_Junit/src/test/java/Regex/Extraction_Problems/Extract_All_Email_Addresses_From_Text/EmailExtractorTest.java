package Regex.Extraction_Problems.Extract_All_Email_Addresses_From_Text;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EmailExtractorTest
{
    public ArrayList<String> extractEmails(String text)
    {
        String regex = "[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        ArrayList<String> emails = new ArrayList<>();
        while (matcher.find())
        {
            emails.add(matcher.group());
        }
        return emails;
    }

    @Test
    public void testValidEmails()
    {
        String text = "Contact us at support@example.com and info@company.org";
        ArrayList<String> expectedEmails = new ArrayList<>();
        expectedEmails.add("support@example.com");
        expectedEmails.add("info@company.org");

        assertEquals(expectedEmails, extractEmails(text));
    }
}

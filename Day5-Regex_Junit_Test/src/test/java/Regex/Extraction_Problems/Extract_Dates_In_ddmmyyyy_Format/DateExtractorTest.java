package Regex.Extraction_Problems.Extract_Dates_In_ddmmyyyy_Format;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DateExtractorTest
{
    public ArrayList<String> extractDates(String text) {
        String regex = "\\b(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[0-2])/([0-9]{4})\\b";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        ArrayList<String> dates = new ArrayList<>();
        while (matcher.find()) {
            dates.add(matcher.group());
        }
        return dates;
    }

    @Test
    public void testValidDates() {
        String text = "The events are scheduled for 12/05/2023, 15/08/2024, and 29/02/2020.";
        ArrayList<String> expectedDates = new ArrayList<>();
        expectedDates.add("12/05/2023");
        expectedDates.add("15/08/2024");
        expectedDates.add("29/02/2020");

        assertEquals(expectedDates, extractDates(text));
    }
}

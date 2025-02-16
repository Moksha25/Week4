package Regex.Replace_And_Modify_Strings.Censor_Bad_Words_In_Sentence;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BadWordCensorTest
{
    @Test
    public void testCensorBadWords()
    {
        List<String> badWords = Arrays.asList("damn", "stupid");

        assertEquals("This is a **** bad example with some **** words.",
                BadWordCensor.censorBadWords("This is a damn bad example with some stupid words.", badWords));
    }

}

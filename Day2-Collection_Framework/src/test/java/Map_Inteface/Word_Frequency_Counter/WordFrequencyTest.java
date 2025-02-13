package Map_Inteface.Word_Frequency_Counter;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static Map_Inteface.Word_Frequency_Counter.WordFrequency.countWordFrequency;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class WordFrequencyTest
{
    @Test
    public void testCountWordFrequency()
    {
        String text = "Hello world, hello Java!";

        Map<String, Integer> expected = Map.of(
                "hello", 2,
                "world", 1,
                "java", 1
        );

        Map<String, Integer> result = WordFrequency.countWordFrequency(text);
        assertEquals(expected, result);
    }
}

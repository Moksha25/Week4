package List_Interface.Find_Frequency_Of_Elements;

import List_Interface.Find_Frequence_Of_Elements.Frequency;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class FrequencyTest
{
    @Test
    void testFrequency()
    {
        List<String> list = new ArrayList<>(Arrays.asList("apple", "banana", "apple", "orange"));

        Map<String, Integer> freqMap = Frequency.countFrequency(list);

        Assertions.assertEquals(2, freqMap.getOrDefault("apple", 0));
        Assertions.assertEquals(1, freqMap.getOrDefault("banana", 0));
        Assertions.assertEquals(1, freqMap.getOrDefault("orange", 0));
    }
}

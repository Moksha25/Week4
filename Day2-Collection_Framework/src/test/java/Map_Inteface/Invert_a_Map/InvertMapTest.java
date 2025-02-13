package Map_Inteface.Invert_a_Map;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class InvertMapTest
{
    @Test
    public void testInvertMap()
    {
        Map<String, Integer> originalMap = new HashMap<>();
        originalMap.put("A", 1);
        originalMap.put("B", 2);
        originalMap.put("C", 1);

        Map<Integer, List<String>> expected = new HashMap<>();
        expected.put(1, Arrays.asList("A", "C"));
        expected.put(2, Collections.singletonList("B"));

        Map<Integer, List<String>> result = InvertMap.invertMap(originalMap);
        assertEquals(expected, result);
    }
}

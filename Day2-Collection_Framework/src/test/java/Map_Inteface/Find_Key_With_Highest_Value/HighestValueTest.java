package Map_Inteface.Find_Key_With_Highest_Value;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HighestValueTest
{
    @Test
    public void testFindKeyWithMaxValue()
    {
        Map<String, Integer> map = new HashMap<>();
        map.put("A", 10);
        map.put("B", 20);
        map.put("C", 15);

        String expected = "B";

        String result = HighestValue.findKeyWithMaxValue(map);
        assertEquals(expected, result);
    }
}

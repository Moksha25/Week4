package Map_Inteface.Merge_Two_Maps;

import Map_Inteface.Merge_Two_Map.Merge;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MergeTest
{
    @Test
    public void testMergeMapsWithEmptyMap()
    {
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("A", 1);

        Map<String, Integer> map2 = new HashMap<>();

        Map<String, Integer> expected = new HashMap<>();
        expected.put("A", 1);

        Map<String, Integer> result = Merge.mergeMaps(map1, map2);
        assertEquals(expected, result);
    }

}

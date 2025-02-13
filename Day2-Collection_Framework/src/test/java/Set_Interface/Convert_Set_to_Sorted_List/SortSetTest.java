package Set_Interface.Convert_Set_to_Sorted_List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SortSetTest
{
    @Test
    void testSortSet()
    {
        Set<Integer> elements = new HashSet<>(Arrays.asList(5,3,9,1));
        Set<Integer> expectedResult = new HashSet<>(Arrays.asList(1,3,5,9));

        List<Integer> result = SortSet.sort(elements);
        Assertions.assertArrayEquals(expectedResult.toArray(), result.toArray());
    }
}

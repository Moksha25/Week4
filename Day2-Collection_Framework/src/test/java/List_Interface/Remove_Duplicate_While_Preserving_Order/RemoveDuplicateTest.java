package List_Interface.Remove_Duplicate_While_Preserving_Order;

import List_Interface.Remove_Duplicates_While_Preserving_Order.RemoveDuplicates;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RemoveDuplicateTest
{
    @Test
    void testDuplicates()
    {
        List<Integer> list = new ArrayList<>(Arrays.asList(3, 1, 2, 2, 3, 4));
        List<Integer> expectedList = Arrays.asList(3, 1, 2, 4);

        List<Integer> result = RemoveDuplicates.removeDuplicates((ArrayList<Integer>) list);
        assertEquals(expectedList, result);

    }
}

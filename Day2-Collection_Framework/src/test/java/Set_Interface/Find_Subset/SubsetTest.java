package Set_Interface.Find_Subset;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SubsetTest
{
    @Test
    void testSubset()
    {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(2,3));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(1,2,3,4));

        boolean result = Subset.subset(set1, set2);
        boolean expectedResult = true;

        Assertions.assertEquals(expectedResult, result);
    }
}

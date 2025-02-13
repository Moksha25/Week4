package Set_Interface.Union_And_Intersection_Of_Two_Sets;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class UnionAndIntersectionTest
{
    @Test
    void testUnion()
    {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1,2,3));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(3,4,5));

        Set<Integer> union = UnionAndIntersection.union(set1, set2);

        Set<Integer> expectedResult = new HashSet(Arrays.asList(1,2,3,4,5));

        Assertions.assertEquals(expectedResult, union);
    }

    @Test
    void testIntersection()
    {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1,2,3));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(3,4,5));

        Set<Integer> intersection = UnionAndIntersection.intersection(set1, set2);

        Set<Integer> expectedResult = new HashSet<>(Arrays.asList(3));

        Assertions.assertEquals(expectedResult, intersection);
    }
}

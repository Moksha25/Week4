package Set_Interface.Check_If_Two_Sets_Are_Equal;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashSet;

public class CheckEqualSetsTest
{
    @Test
    void testCheckEqualSets()
    {
        HashSet<Integer> set1 = new HashSet<>(Arrays.asList(1,2,3));
        HashSet<Integer> set2 = new HashSet<>(Arrays.asList(3,2,1));

        boolean expectedresult = true;

        boolean checkresult = CheckEqualSets.check(set1, set2);
        Assertions.assertEquals(expectedresult, checkresult);
    }
}

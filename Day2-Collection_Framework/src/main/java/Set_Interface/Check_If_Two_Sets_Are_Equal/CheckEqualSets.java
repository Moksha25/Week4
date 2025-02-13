package Set_Interface.Check_If_Two_Sets_Are_Equal;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CheckEqualSets
{
    public static boolean check(Set<Integer> set1, Set<Integer> set2)
    {
        return set1.equals(set2);
    }

    public static void main (String args[])
    {
        HashSet<Integer> set1 = new HashSet<Integer>(Arrays.asList(1,2,3));
        HashSet<Integer> set2 = new HashSet<Integer>(Arrays.asList(3,2,1));

        boolean result = check(set1, set2);
        System.out.println("Are sets equal ? -> " + result);
    }
}

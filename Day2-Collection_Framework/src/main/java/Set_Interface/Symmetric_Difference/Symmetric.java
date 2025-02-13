package Set_Interface.Symmetric_Difference;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Symmetric
{
    public static Set<Integer> symmetric(Set<Integer> set1, Set<Integer> set2)
    {
        Set<Integer> unionSet = new HashSet<>(set1);
        unionSet.addAll(set2);

        Set<Integer> intersectionSet = new HashSet<>(set1);
        intersectionSet.retainAll(set2);

        unionSet.removeAll(intersectionSet);

        return unionSet;
    }

    public static void main (String args[])
    {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1,2,3));
        System.out.println("Set1 : " + set1);

        Set<Integer> set2 = new HashSet<>(Arrays.asList(3,4,5));
        System.out.println("Set2 : " + set2);

        System.out.println("Symmetric difference : " + symmetric(set1, set2));
    }
}

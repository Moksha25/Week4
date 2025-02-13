package Set_Interface.Union_And_Intersection_Of_Two_Sets;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class UnionAndIntersection
{
    public static Set<Integer> union(Set<Integer> set1, Set<Integer> set2)
    {
        Set<Integer> result = new HashSet<>(set1);
        result.addAll(set2);
        return result;
    }

    public static Set<Integer> intersection(Set<Integer> set1, Set<Integer> set2)
    {
        Set<Integer> result = new HashSet<>(set1);
        result.retainAll(set2);
        return result;
    }

    public static void main (String args[])
    {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1,2,3));
        System.out.println("Set1 : " + set1);

        Set<Integer> set2 = new HashSet<>(Arrays.asList(3,4,5));
        System.out.println("Set2 : " + set2);

        System.out.println("Union : " + union(set1, set2));
        System.out.println("Intersection : " + intersection(set1, set2));
    }
}

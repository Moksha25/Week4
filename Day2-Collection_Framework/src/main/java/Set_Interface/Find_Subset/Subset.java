package Set_Interface.Find_Subset;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Subset
{
    public static boolean subset(Set<Integer> set1, Set<Integer> set2)
    {
        return set2.containsAll(set1);
    }

    public static void main(String args[])
    {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(2,3));
        System.out.println("Set1 : " + set1);

        Set<Integer> set2 = new HashSet<>(Arrays.asList(1,2,3,4));
        System.out.println("Set2 : " + set2);

        System.out.println("Subset : " + subset(set1, set2));
    }
}

package Set_Interface.Convert_Set_to_Sorted_List;

import java.util.*;

public class SortSet
{
    public static List<Integer> sort(Set<Integer> elements)
    {
        ArrayList<Integer> result = new ArrayList<>(elements);
        Collections.sort(result);
        return result;
    }

    public static void main (String args[])
    {
        Set<Integer> elements = new HashSet<>(Arrays.asList(5,3,9,1));
        System.out.println("Orignal elements : " + elements);

        List<Integer> result = SortSet.sort(elements);
        System.out.println("Sorted elements : " + result);
    }
}

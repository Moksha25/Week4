package List_Interface.Remove_Duplicates_While_Preserving_Order;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {
    public static ArrayList<Integer> removeDuplicates(ArrayList<Integer> list) {
        Set<Integer> seen = new HashSet<>();
        ArrayList<Integer> duplicates = new ArrayList<>();

        for (Integer num : list) {
            if (!seen.contains(num)) {
                seen.add(num);
                duplicates.add(num);
            }
        }
        return duplicates;
    }

    public static void main (String args[])
    {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(3,1,2,2,3,4));
        System.out.println("Orignal elements : " + list);

        ArrayList<Integer> result = removeDuplicates(list);
        System.out.println("Elements after removing duplicates : " + result);
    }
}

package List_Interface.Reverse_List;

import List_Interface.Reverse_List.Reverse;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ReverseTest
{
    @Test
    void testReverse()
    {
        ArrayList<Integer> ArrayList = new ArrayList<>(Arrays.asList(5,6,7,8));
        List<Integer> expectedReversedArray = new ArrayList<>(Arrays.asList(8,7,6,5));

        ArrayList<Integer> reversedArrayList = Reverse.reverseArrayList(ArrayList);
        Assertions.assertArrayEquals(expectedReversedArray.toArray(), reversedArrayList.toArray());

        LinkedList<Integer> LinkedList = new LinkedList<>(Arrays.asList(10,20,30,40,50));
        LinkedList<Integer> expectedReversedLinkedList = new LinkedList<>(Arrays.asList(50,40,30,20,10));

        LinkedList<Integer> reversedLinkedList = Reverse.reverseLinkedList(LinkedList);
        Assertions.assertArrayEquals(expectedReversedLinkedList.toArray(), reversedLinkedList.toArray());
    }
}

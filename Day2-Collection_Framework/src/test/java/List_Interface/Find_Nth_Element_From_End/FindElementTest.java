package List_Interface.Find_Nth_Element_From_End;

import List_Interface.Find_Nth_Element_From_End.FindElement;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.LinkedList;

public class FindElementTest
{
    @Test
    void testFindElement()
    {
        LinkedList<String> element = new LinkedList<String>(Arrays.asList("A","B","C","D","E"));
        String expectedElement = "D";
        int n=2;

        String result = FindElement.findElement(element,n);
        Assertions.assertArrayEquals(expectedElement.toCharArray(), result.toCharArray());
    }
}

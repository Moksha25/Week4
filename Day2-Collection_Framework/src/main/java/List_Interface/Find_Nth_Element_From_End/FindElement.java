package List_Interface.Find_Nth_Element_From_End;

import java.util.Arrays;
import java.util.LinkedList;

public class FindElement
{
    public static String findElement(LinkedList<String> elements, int n)
    {
        int index = elements.size() - n;
        if(index < 0) return null;
        return elements.get(index);
    }

    public static void main (String args[])
    {
        LinkedList<String> elements = new LinkedList<>(Arrays.asList("A", "B", "C", "D", "E"));
        System.out.println("All elements : " + elements);

        int n=2;

        String result = findElement(elements, n);
        System.out.println("Element found : " + result);
    }
}

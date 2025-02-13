package List_Interface.Rotate_Elements_in_List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Rotate
{
    public static List<Integer> rotateElement(List<Integer> list, int position)
    {
        int size = list.size();
        position = position % size;

        List<Integer> rotate = new ArrayList<>();

        for(int i=position; i<size; i++)
        {
            rotate.add(list.get(i));
        }

        for(int i=0; i<position; i++)
        {
            rotate.add(list.get(i));
        }
        return rotate;
    }

    public static void main (String args[])
    {
        List<Integer> list = new ArrayList<>(Arrays.asList(10,20,30,40,50));
        int position = 2;
        System.out.println("Orignal elements : " + list);

        List<Integer> rotateElement = rotateElement(list, position);
        System.out.println("Rotate elements : " + rotateElement);
    }
}

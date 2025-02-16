package Annotation.Exercise.Suppress_Unchecked_Warnings;

import java.util.ArrayList;

public class UncheckedWarnings
{
    @SuppressWarnings("unchecked")
    public static void main(String[] args)
    {
        ArrayList list = new ArrayList();

        list.add("Hello");
        list.add(100);

        for (Object obj : list)
        {
            System.out.println(obj);
        }
    }
}

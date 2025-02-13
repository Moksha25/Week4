package List_Interface.Reverse_List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class Reverse
{
    public static ArrayList<Integer> reverseArrayList(ArrayList<Integer> al)
    {
        ArrayList<Integer> reversedal = new ArrayList<>();
        for(int i= al.size() - 1; i >= 0; i--)
        {
            reversedal.add(al.get(i));
        }
        return reversedal;
    }

    public static LinkedList<Integer> reverseLinkedList(LinkedList<Integer> ll)
    {
        LinkedList<Integer> reversedll = new LinkedList<>();
        for(int i=ll.size() -1; i >= 0; i--)
        {
            reversedll.add(ll.get(i));
        }
        return reversedll;
    }

    public static void main (String args[])
    {
        ArrayList<Integer> al = new ArrayList<>(Arrays.asList(1,2,3,4,5));

        System.out.println("Orignal ArrayList : " + al);
        ArrayList<Integer> reversedal = reverseArrayList(al);
        System.out.println("Reversed ArrayList : " + reversedal);

        LinkedList<Integer> ll = new LinkedList<>(Arrays.asList(1,2,3,4,5));

        System.out.println("Orignal LinkedList : " + ll);
        LinkedList<Integer> reversedll = reverseLinkedList(ll);
        System.out.println("Reversed LinkedList : " + reversedll);

    }

}

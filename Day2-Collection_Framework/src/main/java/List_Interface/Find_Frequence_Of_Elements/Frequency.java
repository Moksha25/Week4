package List_Interface.Find_Frequence_Of_Elements;

import java.util.*;

public class Frequency
{
    public static Map<String, Integer> countFrequency(List<String> list)
    {
        Map<String, Integer> frequencyMap = new HashMap<>();

        for(String word : list)
        {
            frequencyMap.put(word, frequencyMap.getOrDefault(word, 0) + 1);
        }
        return frequencyMap;
    }

    public static void main (String args[])
    {
        List<String> list = new ArrayList<>(Arrays.asList("apple", "banana", "apple", "orange"));
        System.out.println("Orignal list of strings : " + list);

        Map<String, Integer> frequencyMap = countFrequency(list);
        System.out.println("Frequency of list of strings : " + frequencyMap);
    }
}

package Count_Words_In_File;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountWords
{
    public static void main(String[] args)
    {
        String filePath = "src/main/java/Count_Words_In_File/file";
        Map<String, Integer> wordCountMap = new HashMap<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath)))
        {
            String line;
            while ((line = reader.readLine()) != null)
            {
                String[] words = line.toLowerCase().split("\\W+");
                for (String word : words)
                {
                    if (!word.isEmpty())
                    {
                        wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
                    }
                }
            }
        }
        catch (IOException e)
        {
            System.out.println("Error: An I/O error occurred while reading - " + e.getMessage());
            return;
        }

        List<Map.Entry<String, Integer>> sortedWords = new ArrayList<>(wordCountMap.entrySet());
        sortedWords.sort((a, b) -> b.getValue().compareTo(a.getValue()));

        System.out.println("Top 5 most frequently occurring words:");
        for (int i = 0; i < Math.min(5, sortedWords.size()); i++)
        {
            System.out.println(sortedWords.get(i).getKey() + ": " + sortedWords.get(i).getValue());
        }
    }
}

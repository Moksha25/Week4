package Map_Inteface.Word_Frequency_Counter;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class WordFrequency
{
    public static HashMap<String, Integer> countWordFrequency(String filename) {
        HashMap<String, Integer> wordCount = new HashMap<>();

        try (Scanner scanner = new Scanner(new File(filename))) {
            while (scanner.hasNext()) {
                String word = scanner.next().toLowerCase().replaceAll("[^a-z]", ""); // Normalize words
                if (!word.isEmpty()) {
                    wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
        return wordCount;
    }

    public static void main (String args[]) throws FileNotFoundException
    {
        String filename = "src/main/java/Map_Inteface/Word_Frequency_Counter/Word";
        HashMap<String, Integer> wordFrequency = countWordFrequency(filename);
        System.out.println("Word Frequencies: " + wordFrequency);
    }
}

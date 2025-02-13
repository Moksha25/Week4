package Filter_Streams;

import java.io.*;

public class ConvertUppercaseToLowercase
{
    public static void main(String[] args)
    {
        String sourceFile = "src/main/java/Filter_Streams/source";
        String destinationFile = "src/main/java/Filter_Streams/destination";

        try (BufferedReader reader = new BufferedReader(new FileReader(sourceFile));
             BufferedWriter writer = new BufferedWriter(new FileWriter(destinationFile)))
        {
            String line;
            while ((line = reader.readLine()) != null)
            {
                writer.write(line.toLowerCase());
                writer.newLine();
            }

            System.out.println("File conversion completed successfully!");
        }
        catch (IOException e)
        {
            System.out.println("Error: An I/O error occurred - " + e.getMessage());
        }
    }
}

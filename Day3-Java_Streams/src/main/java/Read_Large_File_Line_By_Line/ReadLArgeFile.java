package Read_Large_File_Line_By_Line;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadLArgeFile
{
    public static void main(String[] args)
    {
        String filePath = "src/main/java/Read_Large_File_Line_By_Line/largeFile";

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath)))
        {
            String line;
            while ((line = reader.readLine()) != null)
            {
                if (line.toLowerCase().contains("error"))
                {
                    System.out.println(line);
                }
            }
        }
        catch (IOException e)
        {
            System.out.println("Error: An I/O error occurred while reading - " + e.getMessage());
        }
    }
}

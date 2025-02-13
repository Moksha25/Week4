package File_Handling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadAndWriteTextFile
{
    public static void main(String[] args)
    {
        String sourceFile = "src/main/java/File_Handling/file";
        String destinationFile = "destination.txt";

        try (FileInputStream fis = new FileInputStream(sourceFile);
             FileOutputStream fos = new FileOutputStream(destinationFile)) {

            int byteData;
            while ((byteData = fis.read()) != -1)
            {
                fos.write(byteData);
            }

            System.out.println("File copied successfully!");
        }
        catch (FileNotFoundException e)
        {
            System.out.println("Error: Source file not found!");
        }
        catch (IOException e)
        {
            System.out.println("Error: An I/O error occurred - " + e.getMessage());
        }
    }
}

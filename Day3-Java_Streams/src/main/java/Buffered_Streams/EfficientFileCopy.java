package Buffered_Streams;

import java.io.*;

public class EfficientFileCopy
{
    public static void main(String[] args)
    {
        String sourceFile = "src/main/java/Buffered_Streams/source";
        String destinationFile = "src/main/java/Buffered_Streams/destination";

        long startTime, endTime;

        // Copy using buffered streams
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(sourceFile));
             BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destinationFile)))
        {
            byte[] buffer = new byte[4096]; // 4 KB buffer
            int bytesRead;

            startTime = System.nanoTime();
            while ((bytesRead = bis.read(buffer)) != -1)
            {
                bos.write(buffer, 0, bytesRead);
            }
            endTime = System.nanoTime();

            System.out.println("Buffered Copy completed in: " + (endTime - startTime) / 1_000_000 + " ms");
        }
        catch (FileNotFoundException e)
        {
            System.out.println("Error: Source file not found!");
        }
        catch (IOException e)
        {
            System.out.println("Error: An I/O error occurred - " + e.getMessage());
        }

        // Copy using unbuffered streams
        try (FileInputStream fis = new FileInputStream(sourceFile);
             FileOutputStream fos = new FileOutputStream(destinationFile))
        {
            int byteData;
            startTime = System.nanoTime();
            while ((byteData = fis.read()) != -1)
            {
                fos.write(byteData);
            }
            endTime = System.nanoTime();

            System.out.println("Unbuffered Copy completed in: " + (endTime - startTime) / 1_000_000 + " ms");
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

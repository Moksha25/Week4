package ByteArray_Stream;

import java.io.*;

public class ConvertImageToByteArray
{
    public static void main(String[] args)
    {
        String sourceImage = "src/main/java/ByteArray_Stream/sourceImage.jpg";
        String destinationImage = "src/main/java/ByteArray_Stream/copiedImage.jpg";

        try (FileInputStream fis = new FileInputStream(sourceImage);
             ByteArrayOutputStream baos = new ByteArrayOutputStream())
        {
            byte[] buffer = new byte[4096];
            int bytesRead;

            while ((bytesRead = fis.read(buffer)) != -1)
            {
                baos.write(buffer, 0, bytesRead);
            }

            byte[] imageData = baos.toByteArray();

            try (ByteArrayInputStream bais = new ByteArrayInputStream(imageData);
                 FileOutputStream fos = new FileOutputStream(destinationImage))
            {
                while ((bytesRead = bais.read(buffer)) != -1)
                {
                    fos.write(buffer, 0, bytesRead);
                }

                System.out.println("Image copied successfully!");
            }
        }
        catch (IOException e)
        {
            System.out.println("Error: An I/O error occurred - " + e.getMessage());
        }
    }
}

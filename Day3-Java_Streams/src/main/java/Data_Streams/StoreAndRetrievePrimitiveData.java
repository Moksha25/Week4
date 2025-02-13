package Data_Streams;

import java.io.*;

public class StoreAndRetrievePrimitiveData
{
    public static void main(String[] args)
    {
        String fileName = "src/main/java/Data_Streams/source";

        // Writing student data to file
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(fileName)))
        {
            dos.writeInt(101);
            dos.writeUTF("John Doe");
            dos.writeDouble(3.8);

            System.out.println("Student data saved successfully!");
        }
        catch (IOException e)
        {
            System.out.println("Error: An I/O error occurred while writing - " + e.getMessage());
        }

        // Reading student data from file
        try (DataInputStream dis = new DataInputStream(new FileInputStream(fileName)))
        {
            int rollNumber = dis.readInt();
            String name = dis.readUTF();
            double gpa = dis.readDouble();

            System.out.println("Student Details:");
            System.out.println("Roll Number: " + rollNumber);
            System.out.println("Name: " + name);
            System.out.println("GPA: " + gpa);
        }
        catch (IOException e)
        {
            System.out.println("Error: An I/O error occurred while reading - " + e.getMessage());
        }
    }
}

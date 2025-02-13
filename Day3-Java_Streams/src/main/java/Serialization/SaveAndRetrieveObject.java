package Serialization;

import java.io.*;
import java.util.*;

class Employee implements Serializable {
    private static final long serialVersionUID = 1L;
    private int id;
    private String name;
    private String department;
    private double salary;

    public Employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                '}';
    }
}

public class SaveAndRetrieveObject
{
    private static final String FILE_NAME = "employees.dat";

    public static void main(String[] args)
    {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "Moksha", "HR", 50000));
        employees.add(new Employee(2, "Bhumi", "IT", 60000));
        employees.add(new Employee(3, "Vinita", "Finance", 55000));

        // Serialize the employee list
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME)))
        {
            oos.writeObject(employees);
            System.out.println("Employee data saved successfully!");
        }
        catch (IOException e)
        {
            System.out.println("Error: An I/O error occurred while writing - " + e.getMessage());
        }

        // Deserialize the employee list
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME)))
        {
            List<Employee> retrievedEmployees = (List<Employee>) ois.readObject();
            System.out.println("Retrieved Employee Details:");
            for (Employee emp : retrievedEmployees)
            {
                System.out.println(emp);
            }
        }
        catch (IOException | ClassNotFoundException e)
        {
            System.out.println("Error: An error occurred while reading - " + e.getMessage());
        }
    }
}

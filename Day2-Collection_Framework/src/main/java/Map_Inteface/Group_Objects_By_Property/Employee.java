package Map_Inteface.Group_Objects_By_Property;

public class Employee {
    private String name;
    private Department department;

    // Constructor, getters, and setters
    public Employee(String name, Department department) {
        this.name = name;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public Department getDepartment() {
        return department;
    }

    @Override
    public String toString() {
        return name;
    }
}

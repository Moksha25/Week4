package Map_Inteface.Group_Objects_By_Property;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupObjects
{
    public static void main(String[] args)
    {
        List<Employee> employees = Arrays.asList(
                new Employee("Alice", Department.HR),
                new Employee("Bob", Department.IT),
                new Employee("Carol", Department.HR),
                new Employee("David", Department.SALES),
                new Employee("Eve", Department.IT)
        );

        Map<Department, List<Employee>> groupedByDepartment = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment));

        groupedByDepartment.forEach((department, employeeList) ->
        {
            System.out.println(department + ": " + employeeList);
        });
    }
}



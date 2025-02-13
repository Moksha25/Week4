package Map_Inteface.Group_Objects_By_Property;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GroupObjectsTest
{
    @Test
    public void testGroupEmployeesByDepartment()
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

        Map<Department, List<Employee>> expected = new HashMap<>();
        expected.put(Department.HR, Arrays.asList(new Employee("Alice", Department.HR), new Employee("Carol", Department.HR)));
        expected.put(Department.IT, Arrays.asList(new Employee("Bob", Department.IT), new Employee("Eve", Department.IT)));
        expected.put(Department.SALES, Arrays.asList(new Employee("David", Department.SALES)));

        assertEquals(expected, groupedByDepartment);
    }
}

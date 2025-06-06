package Stream.Important62;

import Stream.Employee.Employee;
import Stream.Employee.EmployeeDto;

import java.util.Arrays;
import java.util.List;

//Java 8 Stream API-58 | Transform one object into another . Transform Employee to EmployeeDTO
public class TransformObject {

    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee(1, "John", "HR", 60000),
                new Employee(2, "Jane", "Finance", 45000),
                new Employee(3, "Mike", "HR", 75000),
                new Employee(4, "Sarah", "Finance", 30000)
        );

        List<EmployeeDto> employeeDtos = employees.stream().
                map(e -> new EmployeeDto(e.getId(), e.getName(), e.getDepartment(), e.getSalary())).toList();

        System.out.println(employeeDtos);
    }
}

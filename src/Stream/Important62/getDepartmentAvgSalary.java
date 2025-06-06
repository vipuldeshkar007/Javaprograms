package Stream.Important62;

import Stream.Employee.Employee;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class getDepartmentAvgSalary {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee(1, "John", "HR", 60000),
                new Employee(2, "Jane", "Finance", 45000),
                new Employee(3, "Mike", "HR", 75000),
                new Employee(4, "Sarah", "Finance", 30000),
               new Employee(4, "Jack", "HR", 20000)

        );

        Map<String, Double> avgSalaryDept = employees.stream().collect(
                Collectors.groupingBy(Employee::getDepartment,  Collectors.averagingDouble(Employee::getSalary))
        );
        System.out.println("avgSalaryDept"+avgSalaryDept);
        // get group by dept with max user,
        String dept = String.valueOf(employees.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting())).
                entrySet().stream().max(Map.Entry.comparingByValue()).map(Map.Entry::getKey).orElse(null));
        System.out.println("dept -- "+dept);
    }
}

package Stream.Important62;

import Stream.Employee.Employee;

import java.util.Arrays;
import java.util.List;

public class EmoyloyeeNameToString {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee(1, "John", "HR", 60000),
                new Employee(2, "Jane", "Finance", 45000),
                new Employee(3, "Mike", "HR", 75000),
                new Employee(4, "Sarah", "Finance", 30000)
        );
        String emplyoeeNameStr = employees.stream()
                .map(Employee::getName).distinct().reduce((a,b) -> a+" | "+b ).get();
        System.out.println(emplyoeeNameStr);
    }
}

package Stream;

import java.util.*;
import java.util.stream.Collectors;
import Stream.Employee.Employee;

public class publicsys {
    public static void main(String[] args) {
        // Sample Employee List
        List<Employee> employees = Arrays.asList(
                new Employee(1, "John", "HR", 60000),
                new Employee(2, "Jane", "Finance", 45000),
                new Employee(3, "Mike", "HR", 75000),
                new Employee(4, "Sarah", "Finance", 30000)
        );
        // 1. Find Employees Earning More Than 50,000
        List<Employee> salaryFilter = employees.stream().
                filter(e -> e.getSalary() > 50000).toList();
        System.out.println("Employee list with more than 50000 salary"+ salaryFilter);
        // 2. Group Employees by Department
        Map<String, List<Employee>> groupByDept = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment));
        System.out.println("Employee list with grouped by department"+ groupByDept);

        // 3. Find the Employee with the 3rd Highest Salary
        Employee empDetails = (Employee) employees.stream()
                    .sorted(Comparator.comparingDouble(Employee::getSalary))
                    .skip(2)
                    .findFirst().orElse(null);
        System.out.println("empDetails "+ empDetails);
        // 4. Sort Employees by Name
        List<Employee> sortByName =  employees.stream().
                sorted(Comparator.comparing(Employee::getName)).
                toList();

        System.out.println("Sorted by Name -- "+ sortByName);

    }
}


class publicsys2 {

    public static void main(String args[]) {
        List<Integer> ls = Arrays.asList(1, 3, 4, 9, 5, 4, 5, 7, 8, 3, 9);
//        Print all repeating elements using stream API
        Set<Integer> seen = new HashSet<>();
        Set<Integer> repeating = ls.stream().
                filter(n -> !seen.add(n))
                .collect(Collectors.toSet());
        System.out.println("Repeating -- "+repeating);

        List<String> ls2 = Arrays.asList("Publicis", "Sapient", "PS");
//        find max length Element from list
        Optional<String> s = ls2.stream().max(Comparator.comparing(String::length));
        System.out.println("longest string -- "+s);


    }
}

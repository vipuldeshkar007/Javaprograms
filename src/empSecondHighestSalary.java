import java.util.*;
import java.util.stream.Collectors;

public class empSecondHighestSalary {
    public static class Employee{

        String name;
        Integer salary;
        String department;

        public Employee(String name, Integer salary, String department){
            this.name = name;
            this.salary = salary;
            this.department = department;
        }
        @Override
        public String toString(){

            return "name -- "+name+" salary -- "+salary+" Department -- "+department;
        }

        public Integer getSalary() {
            return this.salary;
        }
    }
    // create a list of employee and find the second highest salary by department
    public static void main(String[] args) {
        List<Employee> empList = List.of(
                new Employee("amey", 10000, "hr"),
                new Employee("atharva", 20000, "hr"),
                new Employee("aditya", 15000, "hr"),
                new Employee("vipul", 40000, "hr"),
                new Employee("ajit", 50000, "Engineering"),
                new Employee("suny", 20000, "Engineering"),
                new Employee("rishab", 25000, "Engineering"),
                new Employee("ritiesh", 40000, "Engineering"),
                new Employee("om", 20000, "BDE"),
                new Employee("amar", 40000, "BDE"),
                new Employee("omkar", 30000, "BDE")
        );

        Map<String,List<Employee>> mEmp =  empList.stream().collect(Collectors
                .groupingBy(e -> e.department));

        Map<String, List<Employee>> secondHighestSalary = mEmp.entrySet().stream().collect(
                Collectors.toMap(e -> e.getKey(),
                        e2 -> e2.getValue().stream()
                                .sorted(Comparator.comparingInt(Employee::getSalary).reversed()).skip(1).limit(1).toList()));

        System.out.println(secondHighestSalary);
    }
}
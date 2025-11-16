import java.util.Arrays;
import java.util.List;
import java.util.Objects;
//Process a list of `Department` objects to produce a single, alphabetized list of the names
//of all employees who earn over a certain salary threshold. The names in the final list should be
//in the format "Department Name: Employee Name".
//
//Please also handle Null Safety: Departments or their employee lists might be null.
//        */

class EmployeeDataProcessor {

    static class Employee {
        private String name;
        private double salary;

        public Employee(String name, double salary) {
            this.name = name;
            this.salary = salary;
        }

        public String getName() {
            return name;
        }

        public double getSalary() {
            return salary;
        }
    }

    static class Department {
        private String name;
        private List<Employee> employees;

        public Department(String name, List<Employee> employees) {
            this.name = name;
            this.employees = employees;
        }

        public String getName() {
            return name;
        }

        public List<Employee> getEmployees() {
            return employees;
        }
    }

    // Implement this method with all requirements using Java Streams API only
    public List<List<String>> findHighEarners(List<Department> departments, double salaryThreshold) {
        List<Department> filteredList = departments.stream().filter(Objects::nonNull).toList();
        System.out.println(filteredList);
        List<List<String>> higherEarner = filteredList.stream().filter(e -> e.getEmployees()!=null)
                .map(dept -> dept.getEmployees().stream().filter(Objects::nonNull)
                        .filter(e -> e.getSalary() > salaryThreshold)
                .map(s -> dept.getName()+" : "+s.getName()).toList()).toList();
        return higherEarner;
    }

    public static void main(String[] args) {
        EmployeeDataProcessor processor = new EmployeeDataProcessor();

        List<Department> edgeCaseDepartments = Arrays.asList(
                new Department("Engineering", Arrays.asList(
                        new Employee("Alice", 110000),
                        null,
                        new Employee("Bob", 95000)
                )),
                new Department("HR", null),
                new Department("", Arrays.asList()),
                null,
                new Department("Finance", Arrays.asList(
                        new Employee("Liz", 150000),
                        new Employee("Charlie", -50000)
                ))
        );

        List<List<String>> result2 = processor.findHighEarners(edgeCaseDepartments, 100000);
        System.out.println("Expected: " + result2);
        // Expected: [Engineering: Alice, Finance: Liz] 
    }
}
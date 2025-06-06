package Stream.Employee;

public class EmployeeDto {
    private int id;
    private String name;
    private String department;
    private double salary;
    public String getName() { return name; }
    public String getDepartment() { return department; }
    public double getSalary() { return salary; }

    public EmployeeDto(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }
    @Override
    public String toString() {
        return String.format("EmployeeDTO{id=%d, name='%s', department='%s', salary=%.2f}", id, name, department, salary);
    }
}

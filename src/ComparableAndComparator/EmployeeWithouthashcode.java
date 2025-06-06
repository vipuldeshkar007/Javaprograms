package ComparableAndComparator;

public class EmployeeWithouthashcode {
    public static void main(String[] args) {
        Employee e = new Employee(1, "Vipul");
        Employee e2 = new Employee(1, "Vipul");
        System.out.println(e.equals(e2));
        System.out.println(e.hashCode() == e2.hashCode());
    }
}

class Employee {
    int id;
    String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
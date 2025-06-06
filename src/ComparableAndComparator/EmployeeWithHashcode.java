package ComparableAndComparator;

import java.util.*;

public class EmployeeWithHashcode {
    public static void main(String[] args) {
        Employee2 e = new Employee2(1, "Vipul");
        Employee2 e2 = new Employee2(1, "Vipul");
        Employee2 e3 = new Employee2(2, "Abhishek");
        Employee2 e4 = new Employee2(3, "Bipin");

        System.out.println(e.equals(e2));
        System.out.println(e.hashCode() == e2.hashCode());

        List<Employee2> elist = new ArrayList<>();
        elist.add(e);
        elist.add(e2);
        elist.add(e3);
        elist.add(e4);
        System.out.println("before sorting"+elist);
        System.out.println("After sorting"+elist);

    }
}


class Employee2 implements Comparable {
    int id;
    String name;

    public Employee2(int id, String name) {
        this.id = id;
        this.name = name;
    }


    @Override
    public boolean equals(Object o){
        if(this == o) return true;
        if(!(o instanceof Employee2)) return false;
        Employee2 emp = (Employee2) o;
        return emp.id == this.id;
    }
    @Override
    public int hashCode(){
        return Objects.hash(id, name);
    }

    @Override
    public int compareTo(Object o) {
        if(! (o instanceof Employee2 e2)) throw new RuntimeException();
        return this.id -  e2.id;
    }

    @Override
    public String toString() {
        return "Employee::{ id = "+ id+
                ", name = "+ name+"}";
    }
}
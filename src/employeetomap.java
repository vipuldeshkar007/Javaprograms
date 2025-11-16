import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class employeetomap {
    private static class Employee {
        private Object id;
        private String name;
        public Employee(Object id, String name){

            this.id = id;
            this.name = name;
        }
        public Object getId(){
            return this.id;
        }
        public String getName(){
            return this.name;
        }
        @Override
        public String toString(){
            return this.id+ " "+this.name;
        }
    }
    public static void main(String[] args) {
        List<Employee> empList = List.of(
                new Employee("1", "ramesh"),
                new Employee(1, "ramesh"),
                new Employee(1, "ramesh"),
                new Employee((char) 1, "ramesh"),
                new Employee(1L, "ramesh")

        );
        Map<Integer, String> map = new HashMap<>();
        for(Employee e: empList){
            if(e.getId() instanceof String){
                map.put(Integer.parseInt((String) e.getId()), e.getName());
            }
        }

        System.out.println("empList---"+empList);
    }
}

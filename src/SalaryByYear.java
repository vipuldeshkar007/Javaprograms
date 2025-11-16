import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SalaryByYear {


    // WAP to print sum of salaries by year for given list of employees using streams- e1(2020, 20k), e2(2020, 40k), e3(2021, 30k)

    private static class Employee {

        public Integer year;
        public Integer salary;

        public Employee(Integer year, Integer salary){
            this.year = year;
            this.salary = salary;
        }

        @Override
        public String toString(){
            return "Year -- " +this.year+"  Salary -- "+this.salary;
        }

    }
    /// / op 2021 - 30k, 2020 - 60k
    // sort year in descending order
    public static void main(String args[]){
        List<Employee> empList = List.of(
                new Employee(2020, 20),
                new Employee(2020, 50),
                new Employee(2021, 30)
        );
        Map<Integer, Integer> map = empList.stream().collect(Collectors.groupingBy(e -> e.year, Collectors.summingInt(e -> e.salary)));

        System.out.println(map);
//        Map<Integer, Integer> map2 = map.entrySet().stream().sorted(Comparator.comparingInt(Map.Entry::getKey)).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

        Map<Integer, Integer> map2 = map.entrySet().stream().collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1,e2) -> e1, LinkedHashMap::new));

        System.out.println(map2);
    }
}
//Employee Department - @ManyToMany
//get all employee whose salary > 1000 and department is 'HR'
//.findByDepartmentAndSalaryOrderBySalaryDesc("HR", 1000);
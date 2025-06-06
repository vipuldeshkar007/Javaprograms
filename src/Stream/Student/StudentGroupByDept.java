package Stream.Student;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//Given a list of student objects, group them by their department.
public class StudentGroupByDept {
    public static void main(String[] args) {
        List<Student> studentList = List.of(
                new Student(1, "IT", "Vipul"),
                new Student(2, "IT", "Atharva"),
                new Student(3, "IT", "Nikhil"),
                new Student(1, "CIVIL", "Vipul"),
                new Student(5, "CIVIL", "Lucky"),
                new Student(6, "CIVIL", "Mayur"),
                new Student(7, "CIVIL", "Nicky"),
                new Student(8, "CIVIL", "Virendra"),
                new Student(1, "CSE", "Vipul"),
                new Student(10, "CSE", "Aniket"),
                new Student(11, "CSE", "Chirayu"),
                new Student(12, "CSE", "raj"),
                new Student(13, "CSE", "Prem")
        );
        Map<String, List<Student>> groupBy = studentList.stream().
                collect(Collectors.groupingBy(Student::getDeptId));
        System.out.println(groupBy);
    }
}



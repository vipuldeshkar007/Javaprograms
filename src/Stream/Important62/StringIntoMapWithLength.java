package Stream.Important62;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StringIntoMapWithLength {
    public static void main(String[] args) {
        List<String> employeeList = List.of("VIpul Deshkar", "Vijay Singh", "Aniket Punde", "Ram Kadam", "Vishal Kamble", "Harshad Pawar", "Himanshu");
        Map<String, Integer> map =  employeeList.stream().collect(Collectors.toMap(e-> e, String::length));
        System.out.print("map - "+map);
    }
}

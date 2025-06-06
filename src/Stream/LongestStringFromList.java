package Stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class LongestStringFromList {

    public static void main(String[] args) {
        List<String> employeeList = List.of("VIpul Deshkar", "Vijay Singh", "Aniket Punde", "Ram Kadam", "Vishal Kamble", "Harshad Pawar", "Himanshu");

        List<String> longestString = employeeList.stream()
                .flatMap(name -> Arrays.stream(name.split(" "))).map(String::toLowerCase).toList();

        System.out.println("abc");
        System.out.println(longestString);
    }
}

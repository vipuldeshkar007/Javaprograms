package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class MergeTwoList {

    public static void main(String args[]) {
        List<String> employeeList = List.of("VIpul Deshkar", "Vijay Singh", "Aniket Punde", "Ram Kadam", "Vishal Kamble", "Harshad Pawar", "Himanshu");
        List<String> clientList = List.of("Jim", "Aziz", "Robert", "Colin", "Dimma", "Fernando");

        String[] employeeListArr = employeeList.toArray(String[]::new);
        String[] cliemtListArr = clientList.toArray(String[]::new);
        
        Stream<String> employeeListStream = employeeList.stream();

        Stream<String> clientListStream = employeeList.stream();
        System.out.println("Printing from array");
        Stream.concat(Arrays.stream(employeeListArr), Arrays.stream(cliemtListArr))
                .sorted().forEach(System.out::println);
        String[] arr = Stream.concat(Arrays.stream(employeeListArr), Arrays.stream(cliemtListArr))
                .sorted().toArray(String[]::new);
        System.out.println("Printing from new array "+arr);
        String str = Stream.concat(Arrays.stream(employeeListArr), Arrays.stream(cliemtListArr))
                .sorted().reduce("", String::concat);
        System.out.println("Printing from array string");
        System.out.println(String.join(" ",str));

        List<String> projectUsers = Stream.concat(employeeListStream,clientListStream).sorted().toList();
        System.out.println("Printing from List " +projectUsers);


    }

}







package Stream;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
//Given a list of integers, find the sum of all even numbers.
//Given a list of strings, find the longest string.
//Given a list of strings, reverse each string.
//Given a list of numbers, find the second largest number.
//Given a list of String, find the second largest String.
public class ImpStreamprograms {

    public static void main(String[] args){
//        Given a list of integers, find the sum of all numbers
        List<Integer> intList = List.of(1,2,45,53,20,30);
        int sum = intList.stream().mapToInt(e -> e).sum();
        System.out.println("sum of all numbers -- "+sum);
//        Given a list of integers, find the sum of all even numbers
        int evensum = intList.stream().filter(e -> e%2 == 0).mapToInt(e -> e).sum();
        System.out.println("sum of all even numbers -- "+evensum);

//      Given a list of numbers, find the second largest number.
        Optional<Integer> secondLargestNo = intList.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst();
        secondLargestNo.ifPresent(integer -> System.out.println("Second largest number -- " + integer));
//        Given a list of strings, find the longest string
        List<String> stringList = List.of("amey", "abhinav", "Aniket");
        Optional<String> str = stringList.stream().max(Comparator.comparingInt(String::length));
        System.out.println("longest string from list -- "+str.get());
//        Given a list of strings, find the second longest String
        Optional<String> secondLargestString = stringList.stream().sorted(Comparator.comparingInt(String::length).reversed()).skip(1).findFirst();
        secondLargestString.ifPresent(s -> System.out.println("Second longest string from list -- "+s));
        //       Given a list of strings, reverse each string.
        List<String> reversedList = stringList.stream().map(s -> {
            StringBuilder sb = new StringBuilder(s);
            return sb.reverse().toString();
        }).toList();
        System.out.println("reversed String -- " +reversedList);
//
    }
}

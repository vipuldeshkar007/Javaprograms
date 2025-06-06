package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

//Given two lists of integers, find the intersection and union.
//Given a list of student objects, group them by their department.
//Given a list of words, find the most frequent word.
//How to find distinct odd numbers using Java Stream API?
//How to remove all null values from a list of strings using Java Stream API?
public class InteractionAndUnion {

    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1,5,3,15,20,20,21,null,50, null);
        List<Integer> list2 = Arrays.asList(2,5,4,13,15,21,54, null);
        // intersection — all common elements from both lists
        List<Integer> interaction = list2.stream().
                filter(list1::contains).toList();
        System.out.println("interaction -- "+interaction);
        // Union — all unique elements from both lists
        List<Integer> union = Stream.concat(list1.stream(), list2.stream()).distinct().toList();
        System.out.println("union -- "+union);

    }
}

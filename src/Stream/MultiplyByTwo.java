package Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MultiplyByTwo {

    public static void main(String[] args){
        List<Integer> nums = Arrays.asList(6,2,5,8,5);
        String[] FruitsArr = {"apple", "banana", "mango"};
        String[] FruitsArr2 = {"grapes", "watermelon", "guava"};
        Stream<String> fruitStream = Arrays.stream(FruitsArr);
        Stream<Integer> streams = Stream.of(8,97,2,8,1,4,3,7,2);
//        nums.add(10);
//        nums.add(2);
        System.out.print("sortedArry: ");
        streams.sorted().forEach((stream) -> {
            System.out.print(stream+ ",");
        });
        fruitStream.sorted().forEach((stream) -> System.out.print(stream+ ","));
        nums.stream().sorted().forEach((stream) -> System.out.print(stream+ ","));

        // Merging the two array;
        Stream.concat(Arrays.stream(FruitsArr), Arrays.stream(FruitsArr2)).sorted().forEach(arr -> System.out.println(arr));
        // merging to List;
        List<String> fruitList1 = List.of("banana", "apple", "Orange");
        List<String> fruitList2 = List.of("MustMelon", "Watermelon", "Mango");
        List<String> fruitList3 = new ArrayList<>();
        fruitList3.add("Strawberry");
        fruitList3.add("grapes");
        String[] thirdListArr = fruitList3.toArray(String[]::new);
        for(String item: fruitList3){ System.out.println(item);}

        Stream<String> sampleList = Stream.concat(fruitList1.stream(), fruitList2.stream());
        Stream.concat(sampleList, fruitList3.stream())
                .forEach(listItem -> System.out.println(listItem));

        List<List<String>> sentences = Arrays.asList(
                List.of("This is abhishek", "This is Vipul", "This is Ameya"),
                List.of("This is Atharva", "This is Omkar", "This is Vishal"),
                List.of("This is Aayush", "This is Shubham", "This is Yash")
        );

        sentences.stream()
                .flatMap(Collection::stream).map(String::toUpperCase).forEach(System.out::println);
        List<String> list = sentences.stream()
                .flatMap(Collection::stream)
                .map(String::toUpperCase)
                .toList();

        list.stream().flatMap(l -> Arrays.stream(l.split(" "))).forEach(System.out::println);


    }
}

package DSA;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FirstRepeatingCharacter {

    public static void main(String args[]){

        String s = "wbacabad";

        LinkedHashMap<String, Long> characterCountMap = Arrays.stream(s.split("")).collect(
                Collectors.groupingBy(e -> e, LinkedHashMap::new,Collectors.counting()));
//        characterCountMap.entrySet().stream().filter(a -> a.getValue() > 1)
//                .map(Map.Entry::getKey).forEach(e -> System.out.println(e));
        String repeatingStr = characterCountMap.entrySet().stream().filter(a -> a.getValue() > 1)
                .map(Map.Entry::getKey).reduce((e1, e2) -> String.join(",",e1, e2)).get();
        System.out.println("repeatingStr -- "+repeatingStr);
    }
}

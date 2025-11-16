package DSA;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class RemoveEvenFrequencyChar {
    public static void main(String args[]){
        String s = "aabbccddef";
        String finalStr = Arrays.stream(s.split("")).collect(Collectors.groupingBy(Function.identity(),
                Collectors.counting())).entrySet().stream().filter(e -> e.getValue() % 2 != 0)
                .map(Map.Entry::getKey).reduce(String::concat).orElse("");
        System.out.println(finalStr);
    }
}

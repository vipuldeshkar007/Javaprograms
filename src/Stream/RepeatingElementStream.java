package Stream;

import java.util.*;
import java.util.stream.Collectors;

public class RepeatingElementStream {
    public static void main(String[] args) {
        List<Integer> ls = Arrays.asList(1,3,4,9,5,2,6,7,8,3,9);
        Set<Integer> seen = new HashSet<>();
        List<Integer> repeatingElement = ls.stream().filter(e -> !seen.add(e)).toList();
        System.out.println("Repeating Element: " +repeatingElement);
//        Approch 2
        Map<Integer, Long> elementCount = ls.stream().
                collect(Collectors.groupingBy(e -> e, Collectors.counting() ));
        System.out.println("Element count: " +elementCount);
        List<Integer> repeatingElement2 = elementCount.entrySet().stream().
                filter(e -> e.getValue() > 1).
                map(Map.Entry::getKey).toList();
        System.out.println("Repeating Element with map: " +repeatingElement2);

    }

}

package Stream.Important62;

import java.util.Comparator;
import java.util.Map;
import java.util.stream.Collectors;

public class ReturnCharactorWithMaxFrequency {
    public static void main(String[] args) {
        String character = "javadeveloper";
        Map<Character, Long> map = character.chars() //convert to Intstream
                .mapToObj(c -> (char) c) // convert to char
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));
        char c= map.entrySet().stream().max(Map.Entry.comparingByValue()).map(Map.Entry::getKey).orElse(null);
        System.out.print("Repeating char -- "+c);

    }

}

package Stream.Important62;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupStringByMiddleChar {
    public static void main(String[] args) {
        List<String> strList = List.of("ewe", "jhl", "khl", "wea", "ref");

        Map<Character, List<String>> map = strList.stream()
                .collect(Collectors.groupingBy(e -> e.charAt(e.length() / 2)));
        System.out.println(map);
    }
}


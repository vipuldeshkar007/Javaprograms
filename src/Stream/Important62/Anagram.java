package Stream.Important62;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Anagram {
    public static void main(String[] args) {
        List<String> anagramStrList = Arrays.asList("face", "ace", "pat", "pet",  "tap", "ten", "net", "tep", "ept");
        Map<List<String>,List<String>> angramgroupList = anagramStrList.stream()
                .collect(Collectors.groupingBy(x ->
                        Arrays.stream(x.split("")).sorted().toList()));
        System.out.println(angramgroupList.values());
    }
}

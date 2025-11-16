package Stream.Important62;

import java.util.List;
import java.util.stream.Collectors;
import java.util.Arrays;
import java.util.Map;
class Anagram {
    public static void main(String args[]){
        // way1
        List<String> list = List.of("cat", "pat", "tap", "cab", "bat", "tab");
        List<List<String>> anagramList = list.stream().collect(
                Collectors.groupingBy(
                        word -> {
                            char[] c = word.toCharArray();
                            Arrays.sort(c);
                            return new String(c);
                        }
                )
        ).values().stream().toList();
        System.out.println("Way 1 ---- "+anagramList);
        // way2 
        List<String> anagramStrList = Arrays.asList("face", "ace", "pat", "pet",  "tap", "ten", "net", "tep", "ept");
        Map<List<String>, List<String>> anagramMap = anagramStrList.stream().sorted().collect(Collectors.groupingBy(x -> Arrays.stream( x.split("")).toList()));

        System.out.println("Way 2 ---- "+anagramMap.values());

    }
}
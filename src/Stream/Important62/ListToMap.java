package Stream.Important62;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ListToMap {
    public static void main(String[] args) {
        List<String> strList = List.of("ab", "bb", "bc", "db");
//        Map<Integer, String> map = IntStream.range(0, strList.size()).
        Map<String, String> map = strList.stream().
                collect(Collectors.toMap(Function.identity(),Function.identity()));

    }
}

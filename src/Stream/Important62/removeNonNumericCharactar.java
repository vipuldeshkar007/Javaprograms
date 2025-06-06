package Stream.Important62;

import java.util.Arrays;
import java.util.List;
// Remove all non-numeric characters from a list.
//Arrays.asList("a1b1c1", "1b2c3a", "123abc");
//output -- 111, 123, 123
public class removeNonNumericCharactar {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("a1b1c1", "1b2c3a", "123abc");
        List<String> list2 = list.stream().
                map(e -> e.replaceAll("[a-zA-Z]+", "")).toList();
        System.out.println(list2);
    }
}

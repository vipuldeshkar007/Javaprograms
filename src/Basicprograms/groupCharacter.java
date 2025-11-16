package Basicprograms;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class groupCharacter {
    public static void main(String[] args) {
//        char[] c = {'a','a','a','b','c','c','c'};
        char[] c ={'a','b','b','b','b','b','b','b','b','b','b','b','b'};
        Map<Character, Long> charCount = IntStream.range(0, c.length).boxed().map(i -> c[i])
                .collect(Collectors.groupingBy(e-> e, Collectors.counting()));
        String s = charCount.entrySet().stream().map(e -> String.valueOf(e.getKey()) +""+ (e.getValue()>1?e.getValue():"")).reduce((a,b)-> a+b).get();

        System.out.println("s -- "+s);
        String[] c2 = s.split("");
        System.out.println(c2.length);

    }
}

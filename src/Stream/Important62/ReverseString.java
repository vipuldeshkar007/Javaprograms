package Stream.Important62;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class ReverseString {
    public static void main(String args[]){
        String s = "Synechron";

        String reversedString = Arrays.stream(s.split("")).collect(Collectors.collectingAndThen(
                Collectors.toList(), (list) -> {
                    Collections.reverse(list);
                    return list.stream().reduce("", (a,b) -> a+b);
                }
        ));
    }
}

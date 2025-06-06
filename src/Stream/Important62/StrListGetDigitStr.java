package Stream.Important62;

//29 Java 8 Stream API -29 Find and print strings containing only digits. || Most Asked
//Input {“123”, “abc”, “abc123”, “45” } output → “123”, “45”

import java.util.List;

public class StrListGetDigitStr {
    public static void main(String[] args) {
        List<String> strList = List.of("123", "123a", "ab", "45");

        List<String> filterdList = strList.stream().filter(s -> s.matches("[0-9]+")).toList();
        System.out.println(filterdList);
    }
}

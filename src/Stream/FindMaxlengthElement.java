package Stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class FindMaxlengthElement {
    public static void main(String[] args) {
        List<String> ls = Arrays.asList("Publicis", "Sapient", "PS");

        Optional<String> maxLengthString = ls.stream().max(Comparator.comparingInt(String::length));
        maxLengthString.ifPresent(System.out::println);
    }
}

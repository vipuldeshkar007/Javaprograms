package Stream;

import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Stream;

public class FindFIrstElement {
    public static void main(String[] args) {
        Stream<String> a = Stream.of("Vipul", "Lucky", "Mayur");
        Stream<Integer> b = Stream.of(5, 7, 25);
        Optional<String> firstElementA = a.findFirst();
        Optional<Integer> firstElementB = b.findAny();
        System.out.println(firstElementA.get());
        System.out.println(firstElementB.get());
        Comparator<Integer> c =Integer::compareTo; // Re-create streamB for further use since streams cannot be reused
        Stream<Integer> newStreamB = Stream.of(5, 7, 25);

        Optional<Integer> maxElement = newStreamB.distinct().max(c);
        maxElement.ifPresentOrElse(System.out::println,()->System.out.println("ELement not found"));

    }
}

package Stream.Important62;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Concat2Stream {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("java", "c#");
        Stream<String> stream2 =Stream.of("groovy", "python");
        Stream<String> stream3 =Stream.of("javascript", "typescript");

        Stream<String> streamList = Stream.concat(stream, stream2);
        Stream<String> contactStreamList = Stream.concat(streamList, stream3);

        List<String> streamList2 = contactStreamList.sorted().collect(Collectors.toList());
        System.out.println(streamList2);
    }
}

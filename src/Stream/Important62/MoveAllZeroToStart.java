package Stream.Important62;

import java.util.List;
import java.util.stream.Stream;

public class MoveAllZeroToStart {
    public static void main(String[] args) {
        List<Integer> intStr = List.of(1,5,0,2,0,4,0);
        List<Integer> listOfZero = intStr.stream()
                .filter(x -> x == 0).toList();

        List<Integer> listOfNonZero = intStr.stream()
                .filter(x -> x  > 0).toList();
        List<Integer> list = Stream.concat(listOfZero.stream(), listOfNonZero.stream()).toList();
        System.out.println(list);
    }
}

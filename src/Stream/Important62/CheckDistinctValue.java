package Stream.Important62;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CheckDistinctValue {
    public static void main(String[] args) {
        List<Integer> intlst = List.of(1,2,1,4,1);
        List<Integer> intlst2 = List.of(1,2,3,4,5);

        Map<Integer, Long> gropuelement= intlst.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(gropuelement);

        Long max = gropuelement.values().stream().max(Comparator.comparingLong(x->x)).get();
        System.out.println(max);
        boolean isDistinct= max > 1;
        System.out.print(isDistinct);
    }
}

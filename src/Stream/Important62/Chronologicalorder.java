package Stream.Important62;

import java.util.Comparator;
import java.util.List;
import java.util.Objects;

public class Chronologicalorder {
    public static void main(String[] args) {
        List<String> chronologicalString = List.of(
                "14:30:1:Server started",
                "14:30:4:Server down",
                "14:30:2:Server db connected",
                "14:30:3:Server db disconnected"
        );
        List<String> sortedchronologicalString = chronologicalString.stream().sorted((s1, s2) -> {
            String[] part1 = s1.split(":");
            String[] part2 = s2.split(":");

            Integer hour1 = Integer.parseInt(part1[0]);
            Integer minutes1 = Integer.parseInt(part1[1]);
            Integer id1 = Integer.parseInt(part1[2]);

            Integer hour2 = Integer.parseInt(part2[0]);
            Integer minutes2 = Integer.parseInt(part2[1]);
            Integer id2 = Integer.parseInt(part2[2]);

            if(!Objects.equals(hour1, hour2)) return hour1.compareTo(hour2);
            if(!Objects.equals(minutes1, minutes2)) return minutes1.compareTo(minutes2);
            return id1.compareTo(id2);
        }).map(logs -> logs.split(":", 4)[3]).toList();
        System.out.println("First Way to chronologicalString - "+sortedchronologicalString);
        // second way
        List<String> sortedchronologicalString2 = chronologicalString.stream().
                sorted(Comparator.comparing((String e) -> e.split(":")[0])
                        .thenComparing((String e) -> e.split(":")[1])
                        .thenComparing((String e) -> e.split(":")[2])).map(e -> e.split(":", 4)[3]).toList();
        System.out.println("Second Way to chronologicalString - "+sortedchronologicalString2);


    }
}

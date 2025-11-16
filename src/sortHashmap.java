import java.util.*;
import java.util.stream.Collectors;

public class sortHashmap {

    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<String, Integer>();

        // enter data into hashmap
        hm.put("Math", 98);
        hm.put("Data Structure", 85);
        hm.put("Database", 91);
        hm.put("Java", 95);
        hm.put("Operating System", 79);
        hm.put("Networking", 80);
        LinkedHashMap<String, Integer> sortedByValue = hm.entrySet().stream()
                .sorted(Comparator.comparingInt(Map.Entry::getValue)).collect(Collectors.toMap(Map.Entry::getKey,
                        Map.Entry::getValue,  (e1, e2) -> e2, LinkedHashMap<String, Integer>::new));
        System.out.println(sortedByValue);
    }
}

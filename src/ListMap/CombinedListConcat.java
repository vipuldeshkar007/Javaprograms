package ListMap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CombinedListConcat {
    public static void main(String[] args) {
        List<List<String>> listOfLists = List.of(
                List.of("a", "b", "c"),
                List.of("1", "2", "3"),
                List.of("x", "y", "z")
        );
        List<List<String>> listOfLists2 = List.of(
                List.of("m", "n", "o"),
                List.of("10", "20", "30"),
                List.of("a", "s", "d")
        );
        int size = listOfLists.get(0).size();
        List<String> comibnedList = new ArrayList<>();
        for (List<String> lists : listOfLists) {
//            lists.set(5,"m");
            for(String s : lists){
                comibnedList.add(s);

            }
        Collections.sort(comibnedList);
        }System.out.println(comibnedList);
    }
}

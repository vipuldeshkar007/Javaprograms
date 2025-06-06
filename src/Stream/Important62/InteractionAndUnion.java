package Stream.Important62;

import java.util.List;
import java.util.stream.Stream;

public class InteractionAndUnion {
    public static void main(String[] args) {
        List<String> strlist1 = List.of("ab", "ba", "aa", "bb");
        List<String> strlist2 = List.of("abc", "ba", "aac", "bb");
//        common from two list
        List<String> interactionStrList = strlist1.stream().filter(strlist2::contains).toList();
        System.out.println("Intesection list == " +interactionStrList);
//        Union distinct
        List<String> union = Stream.concat(strlist1.stream(),strlist2.stream()).distinct().toList();
        System.out.println("Union list == " +union);

    }
}

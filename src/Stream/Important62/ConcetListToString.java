package Stream.Important62;

import java.util.List;

public class ConcetListToString {

    public static void main(String[] args) {
        List<String> strList =  List.of("a", "b", "c", "de");
        String concatString = strList.stream().map(String::toUpperCase).
                reduce((a, b) -> a +" "+b).get();
        System.out.println(concatString);


    }
}

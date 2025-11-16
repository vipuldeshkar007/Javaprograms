import java.text.DateFormat;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SimpleDateFormat {


    public static void main(String[] args) {
//        String date = "1996/05/09 10:28:30";
//        Date d = new Date();
//        SimpleDateFormat fmt = new SimpleDateFormat("MM/dd/yyyy hh:mm:ss");
//        DateTimeFormatter dtf =fmt;
//        String str="AMAR"; -- find the first non-repeated character using stream api
            String str="AMAR";
        List<String> sList = Arrays.stream(str.split("")).collect(Collectors.groupingBy(Function.identity() ,LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream().filter(e -> e.getValue() <= 1).map(Map.Entry::getKey).toList();
        System.out.println("first non-repeated character = " +sList.get(0));
    }
}

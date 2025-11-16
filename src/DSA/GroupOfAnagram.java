package DSA;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

    public class GroupOfAnagram {
        public static void main(String args[]){
            List<String> anagramList = List.of("bat", "tab", "tap", "pat", "cat");
            Map<String, List<String>> anagramGroup = anagramList.stream().sorted().collect(Collectors.groupingBy
                    (words ->{
                        char[] chars =words.toCharArray();
                        Arrays.sort(chars);
                        return new String(chars);
                    }));
            List<List<String>> list = anagramGroup.values().stream().toList();
            System.out.println("list -- "+list);
        }
    }

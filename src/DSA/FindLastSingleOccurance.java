// Use this editor to write, compile and run your Java code online
// Input: str = "GeeksQuiz"
// Output: z
// 'r' is the first character from the end which has frequency 1.
// Input: str = "aabbcc"
// Output: Single Occurance Not Found in given string
// All the characters of the given string have frequencies greater than 1.


package DSA;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class FindLastSingleOccurance {
    public static void getLastSingleOccurance(String str){
        Map<Character, Integer> map = new LinkedHashMap<>();
        String s = "Single Occurance Not Found";
        try{
            for(int i=0; i < str.length(); i++){
                char c = str.charAt(i);
                if(map.containsKey(c)){
                    map.put(c, map.get(c)+1);
                }else{
                    map.put(c, 1);
                }
            }
            List<Character> lChar = map.entrySet().stream().filter(e -> e.getValue() <= 1)
                    .map(Map.Entry::getKey).toList();
            int size = lChar.size();
            System.out.println(lChar.get(size-1));
        }catch (Exception e){
            System.out.println("Single Occurance Not Found in given string");
        }
    }
    public static void main(String args[]){
        String str = "GeeksQuizz";
        String str2 = "aabbcc";
        FindLastSingleOccurance.getLastSingleOccurance(str);
        FindLastSingleOccurance.getLastSingleOccurance(str2);

    }
}

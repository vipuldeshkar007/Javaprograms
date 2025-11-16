package String;

import java.util.LinkedHashMap;
import java.util.Map;

public class GroupChars {
    public static void main(String[] args) {
        String s = "bbcacb";
        char[] cArr =  s.toCharArray();
        Map<Character, Integer> freq = new LinkedHashMap<>();
        for(char c : cArr) {
            freq.put(c, freq.getOrDefault(c,0)+1);
        }
        StringBuilder sb = new StringBuilder();
        for(Map.Entry<Character, Integer> entry : freq.entrySet()){
            sb.append(String.valueOf(entry.getKey()).repeat(entry.getValue()));
        }
        String output = "[" + sb.toString() + "]";
        System.out.println("Input  -: [" + s + "]");
        System.out.println("Output -: " + output);
    }
}

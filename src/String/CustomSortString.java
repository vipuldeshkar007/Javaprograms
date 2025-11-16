package String;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomSortString {
    public static void main(String[] args) {
        String input = "bbcacb";

        // Count frequencies
        Map<Character, Integer> freq = new HashMap<>();
        for(Character ch: input.toCharArray()) {
            freq.put(ch, freq.getOrDefault(ch, 0)+1);
        }
        // Maintain first appearance order
        List<Character> order = new ArrayList<>();
        for (char ch : input.toCharArray()) {
            if (!order.contains(ch)) {
                order.add(ch);
            }
        }

        order.sort((c1, c2) -> {
            int f1 = freq.get(c1);
            int f2 = freq.get(c2);
            if(f1 != f2){
                return Integer.compare(f1, f2);
            }
            return 0;
        });

        StringBuilder sb = new StringBuilder();
        for(char ch: order){
            sb.append(String.valueOf(ch).repeat(freq.get(ch)));
        }
        String output = "[" + sb.toString() + "]";
        System.out.println("Input  -: [" + input + "]");
        System.out.println("Output -: " + output);
    }
}

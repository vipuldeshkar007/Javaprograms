package String;

import java.util.Arrays;

public class SortStringDesc {
    public static void main(String[] args) {
        String input = "bbcacb";

        // Convert string to char array
        char[] chars = input.toCharArray();

        // Sort array
        Arrays.sort(chars);

        // Reverse sorted array (since Arrays.sort gives ascending order)
        StringBuilder sb = new StringBuilder(new String(chars));
        sb.reverse();

        // Wrap with brackets
        String output = "[" + sb.toString() + "]";

        System.out.println("Input  -: [" + input + "]");
        System.out.println("Output -: " + output);
    }
}
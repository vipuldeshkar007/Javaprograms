package Stream.Important62;

import java.util.stream.IntStream;

public class middleCharacterOfString {
    public static void main(String[] args) {
        String s = "IlovemyIndi";
        int center = (s.length()-1)/2;
        char c = s.charAt(center);
        System.out.println(c);

    }
}

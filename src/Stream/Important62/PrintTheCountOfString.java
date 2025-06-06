package Stream.Important62;

import java.util.stream.IntStream;

public class PrintTheCountOfString {
    public static void main(String[] args) {
        String str = "abyebyekartikbyemeetsoonbye";
        String check = "bye";

        long l = IntStream.range(0, str.length()-2).filter(x-> str.substring(x, x+3).equals("bye")).count();
        System.out.print(l);
    }
}

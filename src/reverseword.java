import java.util.Arrays;
import java.util.stream.IntStream;

public class reverseword {
    public static void main(String[] args) {
        String  s  = "Welcome to World of Java Programming";

        StringBuilder  sbnew  = new StringBuilder(s).reverse();
        System.out.println("with stringBuilder -- "+sbnew.toString());
//        "gnimmargorP avaJ fo dlroW ot emocleW"
        String[] aArr = s.split(" ");
        int aLength = aArr.length;
        String s2 = Arrays.stream(aArr).map(e -> {
            StringBuilder sb = new StringBuilder(e).reverse();
            return sb.toString();
        }).reduce((a,b) -> a+ " "+b ).get();
        String[] s3 = s2.split(" ");
        String s4 = "";
        for(int i=s3.length - 1; i>=0; i--){
            s4 += " "+ s3[i] +" ";
        }
        System.out.println("with stream API -- "+s4.trim());
        String s5 = "";

        for(int i = s.length() -1; i >=0; i--){
            char c = s.charAt(i);
            s5 += c;
        }
        System.out.println("without stream API -- "+s5.trim());
//        String s6 = IntStream.range(0, aLength).sorted()   .map(e -> {
//            StringBuilder sb = new StringBuilder(e).reverse();
//            return sb.toString();
//        }).reduce((a,b) -> a+ " "+b ).get();
    }
}

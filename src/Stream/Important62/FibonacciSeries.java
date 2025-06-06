package Stream.Important62;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FibonacciSeries {
    public static void main(String[] args) {
        int range = 10;
        int a = 0, b=1;
        int[] array = new int[range];
        for(int i = 0; i< range;i++){
            array[i] = a;
            int sum = a+b;
            a=b;
            b=sum;
            System.out.print(array[i]+ " ");
        }
        Stream.iterate(new long[]{0,1}, arr -> new long[]{arr[1], arr[0] + arr[1]})
                .limit(10)
                .map(x -> x[0]).forEach(System.out::print);
    }
}

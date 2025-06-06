package Stream.Important62;

import java.util.List;
import java.util.stream.IntStream;

//Write a program to multiply 1st and last element, 2nd and 2nd last element etc.
public class multiplyArrayInStream {
    public static void main(String[] args) {
        List<Integer> intList = List.of(2,3,1,7,2,8);
        List<Integer> mulList = IntStream.range(0, intList.size()/2).
                map(x -> intList.get(x) * intList.get(intList.size()-x-1)).boxed().toList();
        System.out.println("mulList"+mulList);
    }
}

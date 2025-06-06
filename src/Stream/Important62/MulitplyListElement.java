package Stream.Important62;

import java.util.List;

public class MulitplyListElement {
    public static void main(String[] args) {
        List<Integer> intList = List.of(1,4,2,5);
        int sum = intList.stream().mapToInt(x->x).sum();
        System.out.println("sum -- "+sum);
    }
}

package LambdaExpression;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorFunctionalInterface {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(9);
        list.add(41);
        list.add(2);
        list.add(3);
        list.add(5);
        Collections.sort(list, (a,b)-> b-a);
        System.out.println(list);
    }

}

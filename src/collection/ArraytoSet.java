package collection.treeset;

import java.util.*;

public class ArraytoList {

    publis static void main(String[] args) {
        String[] array = {"vipul", "lucky", "Aniket", "lucky"};
        List<String> list = Arrays.asList(array);
        TreeSet<String> treeset = new TreeSet<>();
        treeset.addAll(list);
        LinkedHashSet<String> lHashSet = new LinkedHashSet<>();
        treeset.set(1, "abc");
        System.out.println("Elements from array == "+array);
        System.out.println("Elements from treeset == "+treeset);
    }
}

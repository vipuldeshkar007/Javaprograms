package collection;

import java.util.*;

public class ArraytoSet {

    public static void main(String[] args) {
        String[] array = {"vipul", "lucky", "Aniket", "lucky"};
        List<String> list = Arrays.asList(array);
        TreeSet<String> treeset = new TreeSet<>();
        treeset.addAll(list);
        list.set(3, "Atharva");
        LinkedHashSet<String> lHashSet = new LinkedHashSet<>();
        lHashSet.addAll(list);
        HashSet<String> hashSet = new HashSet<>();
        hashSet.addAll(list);
        System.out.println("Elements from array == "+array);
        System.out.println("Elements from treeset == "+treeset);
        System.out.println("Elements from linkedHashset == "+treeset);
        System.out.println("Elements from hshSet == "+hashSet);
    }
}

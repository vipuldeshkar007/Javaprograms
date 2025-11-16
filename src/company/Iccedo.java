package company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

//
//Find sum of length of unique characters of all substrings in a strings, using Java 8( Ex: abc, o/p: 10)
public class Iccedo {
    public static void main(String[] args) {
        String s = "abc";
        String[] sArr = s.split("");
        List<List<String>> subStringList2 = new ArrayList();
        List<String> subStringList3 = new ArrayList();
        List<List<String>> subString = Arrays.stream(sArr).map(e ->{
            List<String> subStringList = new ArrayList();
            for(int i = 0; i< sArr.length; i++) {
                subStringList.add(e + "" + sArr[i]);
            }
            subStringList2.add(subStringList);
            return subStringList;}).toList();
        subStringList3.add(s);
        List<List<String>> finalLIst = subString.stream().map(e -> {
            for(int i = 0; i< e.size(); i++) {
                subStringList3.add(e.get(i));
            }
            return subStringList3;
        }).toList();
        System.out.println("subStringList size --> "+subStringList3);

        System.out.println("subStringList size --> "+ subStringList3.size());
    }
}

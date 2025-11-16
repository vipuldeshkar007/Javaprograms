package LinkedList;

import java.util.List;
import java.util.stream.Stream;

public class ListofWords {
    public static void main(String[] args) {
        List<String> strList = List.of("Amey", "Vipul", "Vikas");
 	    List<String> lLetterCapitalList = strList.stream().map(s -> {
            char[] c = new char[1];
            c[0] = s.charAt(s.length()-1);
            String s2 = s.substring(0,s.length()-1);
            String s3 =  new String(c);
            return s2.concat(s3.toUpperCase());
 	    }).toList();
        System.out.println(lLetterCapitalList);
//        2nd highest using plain java
        List<Integer> salaryList = List.of(10,20, 70, 30, 50, 40);

        int n =3;
        String nhighestsalary =  salaryList.stream().sorted().map(Object::toString).skip(n).limit(1).findFirst().get();
        System.out.println(nhighestsalary);
    }


}

class CustomException extends RuntimeException{
    public CustomException(String msg){
        super(msg);
    }
}
package Optional;

import java.util.Optional;

public class CheckOptionalString {

    public static void main(String[] args){
        System.out.println("abc");
        String[] newStrArr = new String[15];
        String wordToLowerCase = newStrArr[10] != null?newStrArr[10].toLowerCase():"";
        Optional<String> checkNull = Optional.ofNullable(newStrArr[10]);
        if(!checkNull.isPresent()) {
            System.out.println(wordToLowerCase);
        }
    }
}

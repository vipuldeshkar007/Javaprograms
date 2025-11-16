package String;

public class CharCount {
    public static void main(String[] args) {
        String s =  "aaaabbbbbccccdddd";
        char[] cArr = s.toCharArray();
        int count = 1;
        for(int i = 0; i<cArr.length - 1;i++){
            if(cArr[i] == cArr[i+1]){
                count++;
            }else {
                System.out.println(cArr[i] + " count is -- " + count);
                count = 1;
            }
        }
//        System.out.println(cArr[cArr.length - 1] + " count is -- " + count);
    }
}

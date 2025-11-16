package String;

public class RandomSort {
    public static void main(String[] args) {
        String s = "bbcacb";
        StringBuilder sb = new StringBuilder();
        int ccount = 0;
        for(int i= 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(c == 'a'){
                sb.insert(ccount, c);
            }else if(c == 'c'){
                sb.insert(ccount, c);
                ccount++;
            } else if(c == 'b'){
                sb.append(c);
            }
        }
        System.out.println("sb -- "+sb.toString());
    }
}

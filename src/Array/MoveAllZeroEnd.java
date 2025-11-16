package Array;

import java.util.Arrays;

public class MoveAllZeroEnd {

    public static void main(String args[]){
        int[] a = {0,1,31,-2,0,3,5,0,2,0,-2,0,1};
        int count=0;
        for(int i = 0; i < a.length; i++){
            if(a[i] != 0) {
                a[count++] = a[i];
            }
        }
        while( count < a.length){
            a[count++] =0;
        }
        System.out.println("a -- "+ Arrays.toString(a));

    }
}

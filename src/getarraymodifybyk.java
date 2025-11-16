import java.util.Arrays;

public class getarraymodifybyk {
    public static void main(String[] args) {

        int[] a = {2,5,7,8,5,8,34};
//        [8,5,8,34,2,5,7]
        int alength =  a.length -1;
        int k=3;
        reverseArr(a, 0, k-1);
        reverseArr(a, k, a.length-1);

        reverseArr(a, 0, a.length-1);
    }
    public static void reverseArr(int[] a, int start, int end){
        while(start < end){
            int temp = a[start];
            a[start] = a[end];
            a[end] = temp;
            start++;
            end--;
        }
        System.out.println(Arrays.toString(a));
    }
}

import java.util.Arrays;

/// Given an integer array nums, find the contiguous subarray (containing at least one number)
//// which has the largest sum, and return its sum using Java 8.
////
//// Example 1:
//// Input: [-3, -4, 5, -1, 2, -4, 6, -1]
//// Output: 8 (Subarray: [5, -1, 2, -4, 6])
////
//// Example 2:
//// Input: nums = [-2, 1, -3, 4, -1, 2, 1, -5, 4]
//// Output: 6  // The subarray [4, -1, 2, 1] has the largest sum.

public class AltimetricL2 {

    public static void main(String[] args) {
        int[] input ={-3, -4, 5, -1, 2, -4, 6, -1};
        int max = 0;
        boolean ispositive = false;
        for(int i = 0; i < input.length; i++){
            if(input[i] > 0){
                ispositive = true;
            }
            while(ispositive){
                int sum = 0;
                for(int j = i; j < input.length;j++) {
                    sum += input[i];
                    System.out.println("sum --  " + sum);
                    System.out.println("input[i] --  " + input[i]);
                    max = Math.max(max, sum);
                    if (i < input.length) {
                        ispositive = false;
                        i++;
                    }

                }
            }

        }
        System.out.println(max);
    }
}

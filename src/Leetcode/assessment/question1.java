package Leetcode.assessment;
import java.util.Arrays;
//Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.
//
//We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.
//
//You must solve this problem without using the library's sort function.
//
//
//
//Example 1:
//
//Input: nums = [2,0,2,1,1,0]
//Output: [0,0,1,1,2,2]
//Example 2:
//
//Input: nums = [2,0,1]
//Output: [0,1,2]
public class question1 {
    public static void main(String[] args) {
        Solution s = new Solution();

        int[] nums = {2,0,2,1,1,0};
        int[] nums2 = {2,0,1};
        int[] sortedArray1=s.sortArr(nums);
        System.out.println("sortedArray1: "+Arrays.toString(sortedArray1));
        int[] sortedArray2=s.sortArr(nums2);
        System.out.println("sortedArray2: "+Arrays.toString(sortedArray2));
    }
}

class Solution {
    public int[] sortArr(int[] nums) {
        Arrays.sort(nums);
        return nums;

    }
}


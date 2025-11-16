package DSA;
// Online Java Compiler
// Use this editor to write, compile and run your Java code online
// Given an array arr[] of integers, the task is to find the Next Greater Element for each element of the array in order of their appearance in the array.
// Note: The Next Greater Element for an element x is the first greater element on the right side of x in the array. Elements for which no greater element exists, consider the next greater element as -1.

// Input: arr[] = [1, 3, 2, 4]
// Output: [3, 4, 4, -1]
// Explanation: The next larger element to 1 is 3, 3 is 4, 2 is 4 and for 4, since it doesn't exist, it is -1.
// Input: arr[] = [6, 8, 0, 1, 3]
// Output: [8, -1, 1, 3, -1]
// Explanation: The next larger element to 6 is 8, for 8 there is no larger elements hence it is -1, for 0 it is 1 , for 1 it is 3 and then for 3 there is no larger element on right and hence -1.
// Input: arr[] = [50, 40, 30, 10]
// Output: [-1, -1, -1, -1]
// Explanation: There is no greater element for any of the elements in the array, so all are -1.

import java.util.Arrays;
import java.util.Stack;

public class NextLargestElementArray {
    public static void rearrangeArraySolution1(int[] arr){
        int[] newArr = new int[arr.length];

        for(int i = 0; i < arr.length; i++){
            int currVal = arr[i];
            for(int j = i+1; j < arr.length; j++){
                if(currVal <= arr[j]){
                    newArr[i] =  arr[j];
                    break;
                }
                if(j == arr.length -1){
                    newArr[i] = -1;
                }
            }
            if(i == arr.length -1){
                newArr[i] = -1;
            }
        }
        Arrays.stream(newArr).forEach(e -> System.out.print(e+", "));
        System.out.println();
    }
    public static void rearrangeArraySolution2(int[] arr){
        int[] newArr = new int[arr.length];
        int j=0;
        for(int i = 1; i <= arr.length; i++){
            int currVal = arr[i-1];
            if(currVal <= arr[i]){
                newArr[i-1] =  arr[i];
            }
            if(i == arr.length -1){
                newArr[i] = -1;
                i=0;
                j++;
            }
            if( j == arr.length -1){
                break;
            }
        }
        Arrays.stream(newArr).forEach(e -> System.out.print(e+", "));
        System.out.println();
    }
//    public void rearrangeArraySolution3(int[] arr){
//        int[] result = new int[arr.length];
//        Stack<Integer> stack =  new Stack<>();
//        for(int i = 0 ; i<=arr.length; i++){
//            while(!stack.empty)
//        }
//    }
    public static void main(String args[]){
        int[] arr = {1, 3, 2, 4};
        int[] arr2 = {6, 8, 0, 1, 3};
        int[] arr3 = {50, 40, 30, 10};
        System.out.println("Trying with Solution 1");
        rearrangeArraySolution1(arr);
        rearrangeArraySolution1(arr2);
        rearrangeArraySolution1(arr3);

        rearrangeArraySolution2(arr);
        rearrangeArraySolution2(arr2);
        rearrangeArraySolution2(arr3);
    }
}

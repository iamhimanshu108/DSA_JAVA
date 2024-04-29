package arrays;

import java.util.Arrays;

public class CopyOfArray {
    public static void main(String[] args) {
        int[] arr = {30,10,40,23,89,34};

        for(int ele : arr){
            System.out.println(ele+ " ");
        }
        System.out.println();

//        int[] nums = arr;          // shallow copy
//        for(int ele : nums){
//            System.out.println(ele+ " ");
//        }

        int[] brr = Arrays.copyOf(arr, arr.length);

        for(int ele  : brr){
            System.out.println(ele+ " ");
        }
    }
}

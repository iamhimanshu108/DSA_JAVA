package arrays;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12};
        int n = arr.length;;

        for (int ele : arr){
            System.out.println(ele);
        }

        System.out.println();

        // reverse
        int i=0, j=n-1;
        while (i<=j){
                swap(arr,i,j);

//            int temp = arr[i];
//            arr[i] = arr[j];
//            arr[j] = temp;
            i++;
            j--;
        }
        for (int ele : arr){
            System.out.println(ele);
        }

    }
    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}

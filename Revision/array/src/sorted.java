//WAP to to check if an array is sorted in ascending order

import java.util.Arrays;

public class sorted {
    public static void main(String[] args) {
        int[] arr = {10,50,60,40,30,80,90,70};

        int n = arr.length;
        Arrays.sort(arr);

        for (int i = 0; i <=n; i++) {
        System.out.println(arr[i]);

        }

    }
}

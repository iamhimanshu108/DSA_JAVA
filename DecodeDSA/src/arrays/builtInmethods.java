package arrays;



import java.sql.SQLOutput;
import java.util.Arrays;

public class builtInmethods {
    public static void main(String[] args) {
        int[] arr = {30,10,40,23,89,34};
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]+ " ");
//
//        }

        // For Each

        for(int x : arr){
            System.out.println(x+ " ");
        }

        Arrays.sort(arr);
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]+ " ");

        }

    }
}

package arrays;

public class MaxInArray {
    public static void main(String[] args) {

        // Method-1
        int[] arr = {10,12,14,65,-5,87,-154,96,32,15,45,65,55};
        int n = arr.length;
//        int mx = arr[0];
//
//        for (int i = 0; i < n; i++) {
//            if(arr[i]>mx) mx = arr[i];
//
//
//        }
//        System.out.println(mx);

        // Method -2

//
        int mx = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
//            if(arr[i]>mx) mx = arr[i];

            mx = Math.max(mx, arr[i]);


        }
//        System.out.println(mx);

        // min value

//        int min = arr[0];
//
//        for (int i = 0; i < n; i++) {
//            if(arr[i]<min) min = arr[i];
//
//        }
//        System.out.println(min);



        // Second Largest


        int smx = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {

//            if(arr[i] != mx){
//                smx = Math.max(smx, arr[i]);
//            }

            if(arr[i]>smx && arr[i] !=mx ) smx= arr[i];

        }

        System.out.println(smx);

    }
}

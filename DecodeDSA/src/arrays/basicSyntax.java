package arrays;

import java.util.Scanner;

public class basicSyntax {
    public static void main(String[] args) {

//        int[] arr = new int[5];
//
//        // initilze
//
//        arr[0] = 10;
//        arr[1] = 20;
//        arr[2] = 30;
//        arr[3] = -40;
//        arr[4] = 50;
//
////        System.out.println(arr[2 ] + " ");
//
//        // update
////        arr[2] = 99;
////        System.out.println(arr[2]);
//
//        // output -loop
//
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }


        // input loop

        Scanner sc = new Scanner(System.in);

        int[] arr = new int[7];
        System.out.print("Enter the value = ");
        for (int i = 0; i < arr.length; i++) {

            arr[i] = sc.nextInt();
        }

        // output -loop

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }




    }
}

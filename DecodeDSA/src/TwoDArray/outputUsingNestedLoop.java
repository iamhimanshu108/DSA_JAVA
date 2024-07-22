package TwoDArray;

import java.util.Scanner;

public class outputUsingNestedLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][3];
//        arr[0][0] = 9;

        // Input
        for (int i = 0; i <3; i++) { // row
            for (int j = 0; j <3; j++) { //col
               arr[i][j] = sc.nextInt();
            }

        }


        // OUt PUT
//        for (int i = 0; i <3; i++) { // row
//            for (int j = 0; j <3; j++) { //col
//                System.out.print(arr[i][j]+ " ");
//            }
//            System.out.println();
//        }

        // out put using For EachLooP


    }
}

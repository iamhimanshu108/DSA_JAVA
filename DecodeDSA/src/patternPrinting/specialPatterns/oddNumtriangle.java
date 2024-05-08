package patternPrinting.specialPatterns;

import java.util.Scanner;

public class oddNumtriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the No Of n ");
        int n = sc.nextInt();
        // odd 2*j-1
        // for even 2*j
//        for (int i = 1; i <=n; i++) { // rows
//            for (int j = 1; j <=i; j++) { //cols
//                System.out.print(2*j-1 +" ");
//            }
//            System.out.println();
//
//        }

//        method  2

        for (int i = 0; i <=n; i++) { //rows
            int a =1;
            for (int j = 0; j <=i; j++) {
                System.out.print(a+ " ");
                a+=2;
            }
            System.out.println();
        }
    }
}

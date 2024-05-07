package loops;

import java.util.Scanner;

public class APGP {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);

        System.out.print("Enetr the : ");

        int n = sc.nextInt();
        // 4 7 10 13
//        for (int i = 4; i <=3*n+1; i+=3) {
//            System.out.println(i);
//
//        }
//

        // Method 2

//        int a = 4, d = 3;
//        for (int i =1; i <=n; i++) {
//            System.out.println(a);
//            a +=d;
//
//        }


//        GP
        // 1 2 4 8 ...
//        int a = 1;
//
//        for (int i = 1; i <=n; i++) {
//            System.out.println(a);
//            a *=2;
//        }
        // 3 12 48
        int a = 3;

        for (int i = 1; i <=n; i++) {
            System.out.println(a);
            a *=4;
        }
    }
}

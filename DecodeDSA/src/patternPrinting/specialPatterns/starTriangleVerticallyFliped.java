package patternPrinting.specialPatterns;

import java.util.Scanner;

public class starTriangleVerticallyFliped {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n odd :  ");
        int n = sc.nextInt();

        for (int i = 1; i <=n; i++) { // rows
            for (int j = 1; j <=n; j++) { //cols
                if(i+j >n) System.out.print("*" + " ");
                else System.out.print(" " + " ");

            }
            System.out.println();

        }
    }
}

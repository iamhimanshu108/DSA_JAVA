package patternPrinting.compositepatterns;

import java.util.Scanner;

public class starPyramidnstnsp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n odd :  ");
        int n = sc.nextInt();

        int nsp = n-1;
        int nst = 1;

        for (int i = 1; i <=n; i++) { // rows
            for (int j =1; j <=nsp; j++) { // spaces
                System.out.print(" " + " ");
            }
            for (int j =1; j <=nst; j++) { // rows
                System.out.print("*" + " ");
            }
            System.out.println();
            nsp--;
            nst +=2;

        }
    }
}

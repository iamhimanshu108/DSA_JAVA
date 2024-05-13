package patternPrinting.compositepatterns;

import java.util.Scanner;

public class starTraingleVerticallyFlippedComposite {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n odd :  ");
        int n = sc.nextInt();

        for (int i = 1; i <=n; i++) { // rows
            for (int j = 1; j <=n-i; j++) {
                System.out.print(" " + " ");

            }
            for (int j =1; j <=i; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();

        }
    }
}

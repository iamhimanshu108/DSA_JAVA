package patternPrinting.triangles;

import java.util.Scanner;

public class starTraingle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the No Of n ");
        int n = sc.nextInt();

        for (int i = 1; i <=n; i++) { // rows
            for (int j = 1; j <=i; j++) { //cols
                System.out.print("* ");
            }
            System.out.println();

        }

    }
}

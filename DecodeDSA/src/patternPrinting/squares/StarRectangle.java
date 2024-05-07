package patternPrinting.squares;

import java.util.Scanner;

public class StarRectangle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the No Of Rows and Colms ");
        int m = sc.nextInt();
        int n = sc.nextInt();

        for (int i = 1; i <=m; i++) { // rows
            for (int j = 1; j <=n; j++) { //cols
                System.out.print("* ");
            }
            System.out.println();

        }


    }

}

package patternPrinting.squares;

import java.util.Scanner;

public class numberSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the No Of n ");
        int n = sc.nextInt();

        for (int i = 1; i <=n; i++) { // rows
            for (int j = 1; j <=n; j++) { //cols
                System.out.print(j+ " ");
            }
            System.out.println();

        }

    }
}

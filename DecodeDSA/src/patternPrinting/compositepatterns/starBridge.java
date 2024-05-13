package patternPrinting.compositepatterns;

import java.util.Scanner;

public class starBridge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n odd :  ");
        int n = sc.nextInt();

        for(int i=1; i<=2*n-1; i++){
            System.out.print("*" + " ");
        }
        System.out.println();

        n--;

        for (int i = 1; i <=n; i++) { // rows
            for (int j =1; j <=n+1-i; j++) { // spaces
                System.out.print("*" + " ");
            }
            for (int j =1; j <=2*i-1; j++) { // rows
                System.out.print(" " + " ");
            }
            for (int j =1; j <=n+1-i; j++) { // spaces
                System.out.print("*" + " ");
            }
            System.out.println();


        }
    }
}

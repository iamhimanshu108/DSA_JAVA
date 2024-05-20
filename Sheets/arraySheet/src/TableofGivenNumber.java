//Create a program to generate the multiplication table of a given number.

import java.util.Scanner;

public class TableofGivenNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Num ");

        int Num = sc.nextInt();
        for (int i = 1; i <=10 ; i++) {
            System.out.println(Num*i);

        }
    }
}

//Develop a program to convert temperature from Celsius to Fahrenheit and vice versa.

import java.util.Scanner;

public class Celsius_Fahrenheit {
    public static void main(String[] args) {

        // Farh to Cel
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the temp in farh: ");
//
//        double farh, celsius;
//
//        farh = sc.nextDouble();
//
//        celsius = (farh -32 )*5/9;
//
//        System.out.println(farh + " F =" + celsius + " C");

  // Cel to farh
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the temp in cel: ");

        double farh, celsius;

        celsius = sc.nextDouble();

        farh = 32+ (celsius*9/5);

        System.out.println(celsius + " C =" + farh + " F");

    }
}

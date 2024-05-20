//Create a program to check if a number is prime or not.
import java.util.Scanner;

public class primeornot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");

        int n = sc.nextInt();

        if(n %2 ==0){
            System.out.println(" not primee");
        }else{
            System.out.println("prime");
        }

    }
}

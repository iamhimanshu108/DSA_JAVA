package String;

import java.util.Scanner;

public class Strings {
    public static void printLetters(String str) {
        for (int i=0; i<str.length(); i++){
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println();
    }


    public static void main(String[] args) {
//        char arr[] = {'a', 'b', 'c', 'd'};
//
//        String str = "abcd";
//        String str2 = new String("xyz");
//
//        // string is Immutable
//
//        Scanner sc = new Scanner(System.in);
//        String name;
//        name = sc.next();
//        System.out.println(name);

//        String fullName = "Tony Stark";
//        System.out.println(fullName.length());

        // concatenation
        String firstName = "Himanshu";
        String lastName = "Yadav";

        String fullName = firstName + " " + lastName;


        printLetters(fullName);
    }
}

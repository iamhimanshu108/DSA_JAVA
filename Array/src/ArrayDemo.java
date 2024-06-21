import java.util.Scanner;

public class ArrayDemo {
    public static void main(String[] args) {
        int arr[] = new int[5];
//        int []arr1 = new int[5];
//        int[] arr2 = new int[5];
//        int arr3[] = {1,2,3,4,5};

        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;

//        System.out.println(arr[0]);

        Scanner sc = new Scanner(System.in);
        System.out.println("******Storing******");
        System.out.println("******Storing******");

        for(int i=0; i<5; i++){
            System.out.println("Enter the value for index = " +i);
            arr[i] = sc.nextInt();

        }

        System.out.println("******Fetching******");

        for(int i=0; i<5; i++){
            System.out.println("value for index " +i+ " = " + arr[i]);

        }
    }
}

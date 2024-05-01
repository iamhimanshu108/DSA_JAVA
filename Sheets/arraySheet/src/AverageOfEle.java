// Wap to find the average of  all elements in an array
public class AverageOfEle {
    public static void main(String[] args) {
        int arr[] = {10,20,30,40,50,60,70,80,90,100};

        int sum = 0;

        for (int i = 0; i < 10 ; i++) {
            sum = sum+arr[i];
        }
        System.out.println(sum);

        int avg = 0;

        int avgs = arr.length;


        for (int i = 0; i < 10; i++) {
            avg = sum/arr.length;

        }
        System.out.println(avg);

    }
}

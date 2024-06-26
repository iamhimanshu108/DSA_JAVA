package Array;

public class average {
    public static void main(String[] args) {
        System.out.println("Avg");

        int arr[] = {1,2,3,4,5};
        int n = arr.length;
        int sum = 0;
        int avg = 0;
        for (int i = 0; i <n; i++) {
            sum+=arr[i];
        }
        avg = sum/n;

        System.out.println(avg);
    }
}

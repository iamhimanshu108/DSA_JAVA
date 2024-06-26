package Array;

public class sumofelement {
    public static void main(String[] args) {
        int arr[]= {10,2,030,40,50};

        int n = arr.length;
        int sum = 0;

        for (int i = 0; i <n; i++) {
            sum += arr[i];

        }
        System.out.println(sum);

    }
}
